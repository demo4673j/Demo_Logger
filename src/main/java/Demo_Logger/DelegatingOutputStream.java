package Demo_Logger;

import java.io.FilterOutputStream;
import java.io.OutputStream;

class DelegatingOutputStream extends FilterOutputStream {
	
	/**
	 * Creates a delegating outputstream with a NO-OP delegate
	 */
	DelegatingOutputStream() {
		super(new OutputStream() {
			@Override
			public void write(int b) {
			}
		});
		
		System.out.println("DelegatingOutputStream -> init"); //OK called
	}
	
	void setOutputStream(OutputStream outputStream) {
		this.out = outputStream;
		
		System.out.println("DelegatingOutputStream -> setOutputStream"); //OK called
	}
}