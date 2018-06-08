package Demo_Logger;

import ch.qos.logback.core.OutputStreamAppender;

import java.io.OutputStream;

public class MyStaticOutputStreamAppender<E> extends OutputStreamAppender<E> {
	
	private static DelegatingOutputStream DELEGATING_OUTPUT_STREAM = new DelegatingOutputStream();
	
	@Override
	public void start() {
		setOutputStream(DELEGATING_OUTPUT_STREAM);
		System.out.println("MyStaticOutputStreamAppender -> start");
		
		super.start();
	}
	
	static void setStaticOutputStream(OutputStream outputStream) {
		DELEGATING_OUTPUT_STREAM.setOutputStream(outputStream);
		
		System.out.println("MyStaticOutputStreamAppender -> setStaticOutputStream"); //OK called
	}
}
