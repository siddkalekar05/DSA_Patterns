package View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RecentActivity {
    Scene recentactivityScene,adminScene;
    Stage primaryStage;
    public void setRecentactivityScene(Scene recentactivityScene) {
        this.recentactivityScene = recentactivityScene;
    }

    public void setPrimStage(Stage primStage) {
        this.primStage = primaryStage;
    }

    Stage primStage;
    
    public VBox createScene(Runnable back) {
        Text recentActivityText = new Text("");
        HBox recentBox = new HBox(50,recentActivityText);
        recentBox.setAlignment(Pos.CENTER);
        Button backButton = new Button("Back");
        backButton.setAlignment(Pos.CENTER);

        backButton.setMaxSize(100, 400);
        backButton.setMinSize(100, 40);
        backButton.setStyle("-fx-font-size: 14;");
        backButton.setStyle("-fx-background-color :#f1f3f6;-fx-background-radius: 10;");
        

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                back.run();
            }
        
        }); 
        VBox backVBox = new VBox(10,backButton);
        backVBox.setAlignment(Pos.TOP_CENTER);

        VBox recentVBox2 = new VBox(10,recentActivityText,backVBox);
        recentVBox2.setStyle("-fx-background-color:#2D2D44");
        
        return recentVBox2;
        
    }
}

