package View;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.List;
import java.util.Map;

public class Member {
    Scene memberScene, teamScene, HomeScene;

    public void setMemberScene(Scene memberScene) {
        this.memberScene = memberScene;
    }

    public void setHomeScene(Scene homeScene) {
        HomeScene = homeScene;
    }

    public void setTeamScene(Scene teamScene) {
        this.teamScene = teamScene;
    }

    Stage primaryStage;
    private String clubName;
    private List<Map<String, Object>> members;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setMembers(List<Map<String, Object>> members) {
        this.members = members;
    }

    public VBox creatememberScene(Runnable back) {
        Text headingText = new Text(clubName != null ? clubName : "Club Name");
        headingText.setFill(Color.WHITE);
        headingText.setFont(Font.font("Segoe UI Semibold", 22));
        HBox headingBox = new HBox(headingText);
        headingBox.setAlignment(Pos.CENTER);
        VBox.setMargin(headingBox, new Insets(15, 0, 20, 0));

        VBox memberBox = new VBox(18);
        memberBox.setAlignment(Pos.CENTER);

        if (members != null && !members.isEmpty()) {
            for (Map<String, Object> member : members) {
                String name = (String) member.get("name");
                Button memberBtn = createCardButton(name, Color.web("#667eea"), Color.web("#764ba2"));
                memberBtn.setMinSize(500, 100);
                memberBtn.setFont(Font.font("Segoe UI Semibold", 16));
                memberBox.getChildren().add(memberBtn);

                // Add hover animation
                addHoverAnimation(memberBtn);
            }
        } else {
            Text noMembers = new Text("No members found.");
            noMembers.setFill(Color.LIGHTGRAY);
            noMembers.setFont(Font.font("Segoe UI", 16));
            memberBox.getChildren().add(noMembers);
        }

        Button backBtn = createCardButton("Back", Color.web("#f1f3f6"), Color.web("#cfd8dc"));
        backBtn.setMinSize(100, 40);
        backBtn.setTextFill(Color.web("#2D2D44"));
        backBtn.setOnAction(e -> {
            System.out.println("Back button Pressed");
            back.run();
        });

        HBox navBox = new HBox(40, backBtn);
        navBox.setAlignment(Pos.CENTER);

        VBox root = new VBox(25, headingBox, memberBox, navBox);
        root.setPadding(new Insets(30));
        root.setAlignment(Pos.TOP_CENTER);
        root.setBackground(new Background(new BackgroundFill(
                new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
                                  new Stop(0, Color.web("#2D2D44")),
                                  new Stop(1, Color.web("#1a2638"))),
                CornerRadii.EMPTY, Insets.EMPTY)));

        root.setTranslateY(-400);
        TranslateTransition slide = new TranslateTransition(Duration.seconds(1.5), root);
        slide.setToY(0);
        slide.play();

        primaryStage.setResizable(false);
        return root;
    }

    private Button createCardButton(String text, Color startColor, Color endColor) {
        Button btn = new Button(text);
        btn.setFont(Font.font("Segoe UI Semibold", 15));
        btn.setTextFill(startColor.equals(Color.web("#f1f3f6")) ? Color.web("#2D2D44") : Color.WHITE);
        btn.setBackground(new Background(new BackgroundFill(
                new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,
                        new Stop(0, startColor), new Stop(1, endColor)),
                new CornerRadii(15), Insets.EMPTY)));
        btn.setEffect(new DropShadow(10, startColor.darker()));
        btn.setStyle("-fx-cursor: hand;");
        return btn;
    }

    private void addHoverAnimation(Button btn) {
        ScaleTransition scaleUp = new ScaleTransition(Duration.millis(150), btn);
        scaleUp.setToX(1.05);
        scaleUp.setToY(1.05);

        ScaleTransition scaleDown = new ScaleTransition(Duration.millis(150), btn);
        scaleDown.setToX(1.0);
        scaleDown.setToY(1.0);

        btn.setOnMouseEntered(e -> scaleUp.playFromStart());
        btn.setOnMouseExited(e -> scaleDown.playFromStart());
    }
}
