package Demo_Logger;

import javafx.scene.control.TextArea;

import java.io.IOException;
import java.io.OutputStream;

public class TextAreaOutputStream extends OutputStream {
	
	private TextArea textArea;
	
	public TextAreaOutputStream(TextArea textArea) {
		this.textArea = textArea;
		
		System.out.println("TextAreaOutputStream -> init"); //OK called
	}
	
	@Override
	public void write(int b) throws IOException {
		textArea.appendText(String.valueOf((char) b));
		
		System.out.println("TextAreaOutputStream -> write");
	}
}
