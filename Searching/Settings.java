package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Settings {
     Scene LoginScene, DashScene,adminScene,HomeScene,ProfileScene,NotifyScene,SettingScene,AboutScene,adminLoginScene,UserScene;
     Stage primaryStage;

        public void setAboutScene(Scene aboutScene) {
        AboutScene = aboutScene;
    }
        public void setLoginScene(Scene loginScene) {
        LoginScene = loginScene;
    }
     public void setDashScene(Scene dashScene) {
         DashScene = dashScene;
     }
     public void setHomeScene(Scene homeScene) {
         HomeScene = homeScene;
     }
     public void setProfileScene(Scene profileScene) {
         ProfileScene = profileScene;
     }
     public void setNotifyScene(Scene notifyScene) {
         NotifyScene = notifyScene;
     }
     public void setSettingScene(Scene settingScene) {
         SettingScene = settingScene;
     }
     public void setPrimaryStage(Stage primaryStage) {
         this.primaryStage = primaryStage;
     }
        
public VBox createSettingScene() {
    Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();

    ImageView image1 = new ImageView(new Image("Assest\\Image\\WhatsApp Image 2025-07-23 at 14.08.38_029c24b8.jpg"));
    image1.setFitWidth(150);
    image1.setFitHeight(150);

    ImageView image2 = new ImageView(new Image("Assest\\Image\\WhatsApp Image 2025-07-23 at 14.08.38_2f5619ff.jpg"));
    image2.setFitWidth(150);
    image2.setFitHeight(150);

    HBox imageBox = new HBox(20, image1, image2);
    imageBox.setAlignment(Pos.CENTER);

    Text title = new Text("About Us");
    title.setFont(Font.font("Arial", 50));
    title.setStyle("-fx-fill: White;");
    title.setEffect(new DropShadow(5, Color.WHITESMOKE));

    Text description1 = new Text(
           "This website is the result of the skills and knowledge we've gained at Core@2Web, a training institute that helped us transform our passion for technology into real-world applications.\n" +
            "\n" +
            "We’re incredibly grateful for the guidance and support provided by the amazing faculty at Core@2Web. A special mention goes to Shashi Sir, whose teaching style, deep technical knowledge, and constant encouragement have truly inspired us.\n" +
            "\n" +
            "As part of our project journey, we were also assigned a dedicated mentor – Atharva Dada – whose feedback and support helped shape our ideas and execution. Core@2Web isn't just a class – it’s a community of learners and mentors who empower you to achieve your goals in the tech world.\n"
    );
    description1.setFont(Font.font("Arial", 15));
    description1.setFill(Color.WHITE);
    description1.setWrappingWidth(screenBounds.getWidth() * 0.6);

    StackPane rectangle1 = new StackPane(description1);
    rectangle1.setStyle("-fx-background-color: #3E3E5A; -fx-background-radius: 15;");
    rectangle1.setPadding(new Insets(20));

    Text description2 = new Text(
            "ClubZone is nothing but a STUDENT COMPANION which helps students to connect to various types of clubs in the College.  \n" +
            "\n" +
            "Our passionate team behind ClubZone includes:\n" +
            "Team Leader: Pruthviraj Kale\n" +
            "Team Members: Siddhesh Kalekar");
    description2.setFont(Font.font("Arial", 15));
    description2.setFill(Color.WHITE);
    description2.setWrappingWidth(screenBounds.getWidth() * 0.6);

    StackPane rectangle2 = new StackPane(description2);
    rectangle2.setStyle("-fx-background-color: #3E3E5A; -fx-background-radius: 15;");
    rectangle2.setPadding(new Insets(20));

    Button logoutBtn = new Button("LogOut");
    logoutBtn.setStyle(
            "-fx-background-color: #f1f3f6;" +
            "-fx-text-fill: Black ;" +
            "-fx-background-radius: 15;" +
            "-fx-border-radius: 15;" +
            "-fx-padding: 6 18;" +
            "-fx-cursor: hand;" +
            "-fx-effect: dropshadow(gaussian, CadetBlue, 8, 0, 0, 2);"
    );
    logoutBtn.setOnAction(e -> {
        initializeUserType();
    });

    VBox content = new VBox(30, imageBox, title, rectangle1, rectangle2, logoutBtn);
    content.setAlignment(Pos.CENTER);
    content.setPadding(new Insets(50));
    content.setMaxWidth(screenBounds.getWidth() * 0.7);

    VBox mainPane = new VBox(content);
    mainPane.setAlignment(Pos.CENTER);
    mainPane.setStyle("-fx-background-color:  #2D2D44; -fx-background-radius: 20;");

    return mainPane;
}
private void initializeUserType() {
        UserType user=new UserType();    
        user.setPrimaryStage(primaryStage);
        UserScene = new Scene(user.createUserScene(this::handleBackButton), 1200, 780);
        primaryStage.setScene(UserScene);
}

     private void handleBackButton() {
        System.out.println("Logout");
    }

    

}
 