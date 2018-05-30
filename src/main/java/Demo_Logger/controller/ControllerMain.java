package Demo_Logger.controller;

import Demo_Logger.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControllerMain {
	
	public static ControllerMain CONTROLLER_MAIN;
	
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	@FXML
	public TextArea textArea;
	
	@FXML
	public Button btnLogInfo, btnLogError;
	
	
	public ControllerMain() {
		CONTROLLER_MAIN = this;
	}
	
	@FXML
	public void btnLogInfo() {
		logger.info("Button info click");
	}
	
	@FXML
	public void btnLogError() {
		logger.error("Button error click");
	}
}
