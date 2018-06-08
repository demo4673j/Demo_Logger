package Demo_Logger;

import javafx.scene.control.TextArea;

import java.io.OutputStream;

public class TextAreaOutputStream extends OutputStream {
	
	private TextArea textArea;
	
	TextAreaOutputStream(TextArea textArea) {
		this.textArea = textArea;
		
		System.out.println("TextAreaOutputStream -> init"); //OK called
	}
	
	@Override
	public void write(int b) {
		textArea.appendText(String.valueOf((char) b));

//		System.out.println("TextAreaOutputStream -> write"); //OK CALLED
	}
}
