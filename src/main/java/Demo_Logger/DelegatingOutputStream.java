package Demo_Logger;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DelegatingOutputStream extends FilterOutputStream {
	
	/**
	 * Creates a delegating outputstream with a NO-OP delegate
	 */
	public DelegatingOutputStream(OutputStream out) {
		super(new OutputStream() {
			@Override
			public void write(int b) throws IOException {
			}
		});
		
		System.out.println("DelegatingOutputStream -> init"); //OK called
	}
	
	void setOutputStream(OutputStream outputStream) {
		this.out = outputStream;
		
		System.out.println("DelegatingOutputStream -> setOutputStream"); //OK called
	}
}