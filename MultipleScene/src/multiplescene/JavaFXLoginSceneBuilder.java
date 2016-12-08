/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplescene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class JavaFXLoginSceneBuilder extends Application {
    
    private Stage mainStage;
    
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        Parent root=loader.load();
        
        
        FXMLDocumentController controller=loader.getController();
        controller.setMain(this);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        mainStage=stage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
