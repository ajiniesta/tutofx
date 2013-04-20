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
 * File created: 20/04/2013 at 16:16:47 by antonio
 */
package com.iniesta.tutofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author antonio
 *
 */
public class Hello extends Application {

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage stage) throws Exception {
		//Create the container and all the controls inside of the stage
		VBox parent = new VBox(10);
		parent.setAlignment(Pos.CENTER);
		//Create the lable
		final Label label = new Label("Hello, World!");
		label.setVisible(false);
		//Create the button
		Button button = new Button("Click here!");
		button.setOnAction(new EventHandler<ActionEvent>() {			
			public void handle(ActionEvent event) {
				//Show the label again
				label.setVisible(!label.isVisible());
			}
		});
		//Add the controls in the container
		parent.getChildren().addAll(button, label);
		
		//Create the scene
		Scene scene = new Scene(parent, 300, 200);
		stage.setScene(scene);
		//Show the stage
		stage.show();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
