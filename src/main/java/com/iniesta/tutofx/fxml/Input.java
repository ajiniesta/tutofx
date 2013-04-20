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
 * File created: 20/04/2013 at 17:10:20 by antonio
 */
package com.iniesta.tutofx.fxml;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author antonio
 *
 */
public class Input implements Initializable {

	@FXML
	TextField textField;
	@FXML
	Label label;
	
	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	@FXML
	public void handleButtonAction(ActionEvent event){
		label.setText(textField.getText());
	}
}
