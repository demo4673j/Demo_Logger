package Demo_Logger;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.OutputStream;

import static Demo_Logger.controller.ControllerMain.CONTROLLER_MAIN;

public class Main extends Application {
	
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		
		primaryStage.setTitle("Demo logger");
		primaryStage.setWidth(400);
		primaryStage.setHeight(400);
		primaryStage.setScene(new Scene(parent));
		primaryStage.show();
		
		Platform.runLater(this::setTextArea);
		
		Platform.runLater(this::logToTexArea);
		
		System.out.println("Main -> init"); //OK called
	}
	
	private void setTextArea() {
		OutputStream outputStream = new TextAreaOutputStream(CONTROLLER_MAIN.textArea);
		
		MyStaticOutputStreamAppender.setStaticOutputStream(outputStream);
	}
	
	private void logToTexArea() {
		logger.debug("Debug example");
		logger.error("Error example");
		
		CONTROLLER_MAIN.textArea.setText("ADD LOGGER OUTPUT HERE");
	}
}
