import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Test extends Application {
    @Override
	public void start(Stage arg0) throws Exception {
    	Pane pane = new Pane();
    	Image image = new Image("BGLAYERS_EXAMPLE.png");
    	ImageView iv = new ImageView(image);
    	pane.getChildren().add(iv);
    	
    	Image pipe = new Image("Pipe Vertical.jpeg");
    	ImageView pipeV = new ImageView(pipe);
    	pipeV.setFitHeight(120);
    	pipeV.setFitWidth(120);
    	pipeV.setLayoutX(460);
    	pipeV.setLayoutY(280);
    	pane.getChildren().add(pipeV);
    	
    	Image start = new Image("Starter Vertical.jpeg");
    	ImageView starterV = new ImageView(start);
    	starterV.setFitHeight(120);
    	starterV.setFitWidth(120);
    	starterV.setLayoutX(460);
    	starterV.setLayoutY(160);
    	pane.getChildren().add(starterV);
    	
    	Image empty = new Image("Empty None.jpeg");
    	ImageView emptyF = new ImageView(empty);
    	emptyF.setFitHeight(120);
    	emptyF.setFitWidth(120);
    	emptyF.setLayoutX(580);
    	emptyF.setLayoutY(160);
    	pane.getChildren().add(emptyF);
    	
    	Image empty1 = new Image("Empty None.jpeg");
    	ImageView emptyF1 = new ImageView(empty1);
    	emptyF1.setFitHeight(120);
    	emptyF1.setFitWidth(120);
    	emptyF1.setLayoutX(700);
    	emptyF1.setLayoutY(160);
    	pane.getChildren().add(emptyF1);
    	
    	Image empty2 = new Image("Empty None.jpeg");
    	ImageView emptyF2 = new ImageView(empty2);
    	emptyF2.setFitHeight(120);
    	emptyF2.setFitWidth(120);
    	emptyF2.setLayoutX(820);
    	emptyF2.setLayoutY(160);
    	pane.getChildren().add(emptyF2);
    	
    	Image empty3 = new Image("Empty None.jpeg");
    	ImageView emptyF3 = new ImageView(empty3);
    	emptyF3.setFitHeight(120);
    	emptyF3.setFitWidth(120);
    	emptyF3.setLayoutX(580);
    	emptyF3.setLayoutY(280);
    	pane.getChildren().add(emptyF3);
    	
    	Image empty4 = new Image("Empty None.jpeg");
    	ImageView emptyF4 = new ImageView(empty4);
    	emptyF4.setFitHeight(120);
    	emptyF4.setFitWidth(120);
    	emptyF4.setLayoutX(700);
    	emptyF4.setLayoutY(280);
    	pane.getChildren().add(emptyF4);
    	
    	Image empty5 = new Image("Empty None.jpeg");
    	ImageView emptyF5 = new ImageView(empty5);
    	emptyF5.setFitHeight(120);
    	emptyF5.setFitWidth(120);
    	emptyF5.setLayoutX(820);
    	emptyF5.setLayoutY(280);
    	pane.getChildren().add(emptyF5);
    	
    	Image pipe1 = new Image("Pipe Vertical.jpeg");
    	ImageView pipeV1 = new ImageView(pipe1);
    	pipeV1.setFitHeight(120);
    	pipeV1.setFitWidth(120);
    	pipeV1.setLayoutX(460);
    	pipeV1.setLayoutY(400);
    	pane.getChildren().add(pipeV1);
    	
    	Image pipe2 = new Image("Pipe Horizontal.jpeg");
    	/*ImageView pipeH = new ImageView(pipe2);
    	pipeH.setRotate(90);
    	pipeH.setFitHeight(120);
    	pipeH.setFitWidth(120);
    	pipeH.setLayoutX(580);
    	pipeH.setLayoutY(400);
    	pane.getChildren().add(pipeH);*/
    	
    	Image empty6 = new Image("Empty None.jpeg");
    	ImageView emptyF6 = new ImageView(empty6);
    	emptyF6.setFitHeight(120);
    	emptyF6.setFitWidth(120);
    	emptyF6.setLayoutX(700);
    	emptyF6.setLayoutY(400);
    	pane.getChildren().add(emptyF6);
    	
    	Image empty7 = new Image("Empty None.jpeg");
    	ImageView emptyF7 = new ImageView(empty7);
    	emptyF7.setFitHeight(120);
    	emptyF7.setFitWidth(120);
    	emptyF7.setLayoutX(820);
    	emptyF7.setLayoutY(400);
    	pane.getChildren().add(emptyF7);
    	
    	Image pipe3 = new Image("Curved Pipe 01.jpeg");
    	ImageView curved01 = new ImageView(pipe3);
    	curved01.setFitHeight(120);
    	curved01.setFitWidth(120);
    	curved01.setLayoutX(460);
    	curved01.setLayoutY(520);
    	pane.getChildren().add(curved01);
    	
    	/*Image empty8 = new Image("Empty Free.jpeg");
    	ImageView emptyN = new ImageView(empty8);
    	emptyN.setFitHeight(120);
    	emptyN.setFitWidth(120);
    	emptyN.setLayoutX(580);
    	emptyN.setLayoutY(520);
    	pane.getChildren().add(emptyN);*/
    	
    	Image pipeS = new Image("Pipe Static Horizontal.jpeg");
    	ImageView pipeSH = new ImageView(pipeS);
    	pipeSH.setFitHeight(120);
    	pipeSH.setFitWidth(120);
    	pipeSH.setLayoutX(700);
    	pipeSH.setLayoutY(520);
    	pane.getChildren().add(pipeSH);
    	
    	Image end = new Image("End Horizontal.jpeg");
    	ImageView endH = new ImageView(end);
    	endH.setFitHeight(120);
    	endH.setFitWidth(120);
    	endH.setLayoutX(820);
    	endH.setLayoutY(520);
    	pane.getChildren().add(endH);
    	
    	Circle circle = new Circle(520,220,10);
    	pane.getChildren().add(circle);
    	
    	DraggableImageView testImage = new DraggableImageView(pipe2);
    	testImage.setFitHeight(120);
    	testImage.setFitWidth(120);
    	testImage.setLayoutX(580);
    	testImage.setLayoutY(400);
    	pane.getChildren().add(testImage);
        
        Scene scene = new Scene(pane, 1400, 800);
        arg0.setTitle("RollTheBall"); // Set the stage title
        arg0.setResizable(false);
        arg0.setScene(scene); // Place the scene in the stage
        arg0.show(); // Display the stage

		
	}
	public static void main(String[] args) {
		launch(args);
	}
	public  class DraggableImageView extends ImageView {
        private double mouseX ;
        private double mouseY ;
        public DraggableImageView(Image image) {
            super(image);

            setOnMousePressed(event -> {
                mouseX = event.getSceneX() ;
                mouseY = event.getSceneY() ;
            });

            setOnMouseDragged(event -> {
               double deltaX = event.getSceneX() - mouseX ;
               double deltaY = event.getSceneY() - mouseY ;
               relocate(getLayoutX() + deltaX, getLayoutY() + deltaY);
               mouseX = event.getSceneX() ;
               mouseY = event.getSceneY() ;
            });
        }
    }

	
}
