/** 
 * Copyright [2013] Antonio J. Iniesta
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * 
 * File created: 20/04/2013 at 17:13:34 by antonio
 */
package com.iniesta.tutofx.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author antonio
 * 
 */
public class LauncherInput extends Application {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/iniesta/tutofx/fxml/Input.fxml"));
		Parent parent = (Parent) loader.load();
		// Create the scene
		Scene scene = new Scene(parent, 300, 200);
		stage.setScene(scene);
		// Show the stage
		stage.show();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
