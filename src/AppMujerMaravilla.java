import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class AppMujerMaravilla extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root= new Pane();
        root.getChildren().add(this.mujermaravilla2D());
        Scene escena= new Scene (root,330,639);
        primaryStage.setTitle("Mujer Maravilla");
        primaryStage.setScene(escena);
        primaryStage.show();     
    }

    public Group mujermaravilla2D(){


        Group  grupo_maravilla= new Group();


        //Mujer Maravilla

        //ESCUDO

        QuadCurve escudo_1=new QuadCurve();
        escudo_1.setStartX(0);
        escudo_1.setStartY(27.3);
        escudo_1.setControlX(6.5);
        escudo_1.setControlY(19.4);
        escudo_1.setEndX(18.8);
        escudo_1.setEndY(13.6);
        escudo_1.setStroke(Color.rgb(92,112,124));
        escudo_1.setStrokeWidth(0.5);
        escudo_1.setFill(Color.rgb(149, 161, 170));
        escudo_1.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos

        QuadCurve escudo_2=new QuadCurve();
        escudo_2.setStartX(18.9);
        escudo_2.setStartY(13.6);
        escudo_2.setControlX(19.6);
        escudo_2.setControlY(13.3);
        escudo_2.setEndX(20.2);
        escudo_2.setEndY(14.7);
        escudo_2.setStroke(Color.rgb(92,112,124));
        escudo_2.setStrokeWidth(0.5);
        escudo_2.setFill(Color.rgb(149, 161, 170));
        escudo_2.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos

        QuadCurve escudo_3=new QuadCurve();
        escudo_3.setStartX(19.5);
        escudo_3.setStartY(14.16);
        escudo_3.setControlX(20);
        escudo_3.setControlY(34.5);
        escudo_3.setEndX(0);
        escudo_3.setEndY(59);
        escudo_3.setFill(null);
        escudo_3.setStroke(Color.rgb(92,112,124,0.09));
        escudo_3.setStrokeWidth(1.2);
        escudo_3.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos

        QuadCurve escudo_4=new QuadCurve();
        escudo_4.setStartX(20.1);
        escudo_4.setStartY(14.7);
        escudo_4.setControlX(21);
        escudo_4.setControlY(35);
        escudo_4.setEndX(0);
        escudo_4.setEndY(60);
        escudo_4.setFill(null);
        escudo_4.setStroke(Color.rgb(92,112,124));
        escudo_4.setStrokeWidth(0.7);
        escudo_4.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos

        QuadCurve escudo_5=new QuadCurve();
        escudo_5.setStartX(18.7);
        escudo_5.setStartY(13.6);
        escudo_5.setControlX(20);
        escudo_5.setControlY(34);
        escudo_5.setEndX(0);
        escudo_5.setEndY(58);
        escudo_5.setStroke(Color.rgb(92,112,124));
        escudo_5.setStrokeWidth(0.3);
        escudo_5.setFill(Color.rgb(149, 161, 170));
        escudo_5.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos

        Polygon escudo_6 =new Polygon(12.1,17.6,11.4,19.1,12.3,24.4,18.3,18.4,18.3,14.3);
        escudo_6.setStrokeWidth(0.45);
        escudo_6.setStroke(Color.rgb(248,241,243));
        escudo_6.setFill(Color.rgb(248,241,243));

        QuadCurve escudo_7=new QuadCurve();
        escudo_7.setStartX(0);
        escudo_7.setStartY(27.3);
        escudo_7.setControlX(8);
        escudo_7.setControlY(18.2);
        escudo_7.setEndX(12.3);
        escudo_7.setEndY(19.2);
        escudo_7.setStroke(Color.rgb(122,21,1));
        escudo_7.setStrokeWidth(0.5);
        escudo_7.setFill(null);
        escudo_7.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve escudo_8=new QuadCurve();
        escudo_8.setStartX(12.3);
        escudo_8.setStartY(19.2);
        escudo_8.setControlX(13.9);
        escudo_8.setControlY(22.1);
        escudo_8.setEndX(9.5);
        escudo_8.setEndY(33.4);
        escudo_8.setStroke(Color.rgb(122,21,1));
        escudo_8.setStrokeWidth(0.5);
        escudo_8.setFill(null);
        escudo_8.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve escudo_9=new QuadCurve();
        escudo_9.setStartX(9.5);
        escudo_9.setStartY(33.4);
        escudo_9.setControlX(5.9);
        escudo_9.setControlY(41.3);
        escudo_9.setEndX(0);
        escudo_9.setEndY(49.1);
        escudo_9.setStroke(Color.rgb(122,21,1));
        escudo_9.setStrokeWidth(0.5);
        escudo_9.setFill(null);
        escudo_9.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon colorescudo_1=new Polygon(0,38,0,35.6,10.5,20.3,11.9,24.7,3.2,36.2);
        colorescudo_1.setStroke(Color.rgb(243, 118, 111));
        colorescudo_1.setFill(Color.rgb(243, 118, 111));

        QuadCurve colorescudo_2=new QuadCurve();
        colorescudo_2.setStartX(10.5);
        colorescudo_2.setStartY(19.3);
        colorescudo_2.setControlX(14);
        colorescudo_2.setControlY(19.2);
        colorescudo_2.setEndX(11.9);
        colorescudo_2.setEndY(24.7);
        colorescudo_2.setStroke(Color.rgb(243, 118, 111));
        colorescudo_2.setFill(Color.rgb(243, 118, 111));
        colorescudo_2.setStrokeWidth(0.5);
        colorescudo_2.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve colorescudo_3=new QuadCurve();
        colorescudo_3.setStartX(0);
        colorescudo_3.setStartY(38.5);
        colorescudo_3.setControlX(3.9);
        colorescudo_3.setControlY(35.8);
        colorescudo_3.setEndX(9.2);
        colorescudo_3.setEndY(33.5);
        colorescudo_3.setStroke(Color.rgb(140, 49,25));
        colorescudo_3.setFill(Color.rgb(211, 157, 97));
        colorescudo_3.setStrokeWidth(0.2);
        colorescudo_3.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon fig1_escudo =new Polygon(0,32.1,0.4,38.4,9.6,32.6,5.9,40,0,42.4);
        fig1_escudo.setStroke(Color.rgb(140, 49,25));
        fig1_escudo.setFill(Color.rgb(211, 157, 97));
        fig1_escudo.setStrokeWidth(0.2);

        Polygon fig2_escudo =new Polygon(0,43,5.3,40.7,0.8,48,0,48);
        fig2_escudo.setStroke(Color.rgb(140, 49,25));
        fig2_escudo.setFill(Color.rgb(211, 157, 97));
        fig2_escudo.setStrokeWidth(0.2);

        Polygon fondo1_escudo =new Polygon(0,27.7,11.5,18.1,17.8,19.8,1.6,55.6,0,57.3);
        fondo1_escudo.setStroke(Color.rgb(149, 161, 170));
        fondo1_escudo.setFill(Color.rgb(149, 161, 170));

        Polygon fondo2_escudo =new Polygon(0,48.3, 0,27.5,11,19.3);
        fondo2_escudo.setStroke(Color.rgb(181, 18, 27));
        fondo2_escudo.setFill(Color.rgb(181, 18, 27));

        Polygon fondo3_escudo =new Polygon(0,48.3, 0,27.5, 11.3,25.7, 9.4,32.7, 5,41.5);
        fondo3_escudo.setStroke(Color.rgb(181, 18, 27));
        fondo3_escudo.setFill(Color.rgb(181, 18, 27));

        QuadCurve fondo4_escudo=new QuadCurve();
        fondo4_escudo.setStartX(0);
        fondo4_escudo.setStartY(27.5);
        fondo4_escudo.setControlX(4.1);
        fondo4_escudo.setControlY(21);
        fondo4_escudo.setEndX(12);
        fondo4_escudo.setEndY(19.1);
        fondo4_escudo.setStroke(Color.rgb(181, 18, 27));
        fondo4_escudo.setFill(Color.rgb(181, 18, 27));
        fondo4_escudo.setStrokeWidth(0.2);
        fondo4_escudo.setStrokeLineCap(StrokeLineCap.ROUND);
        
        //CABELLO
        QuadCurve cabello_1=new QuadCurve();
        cabello_1.setStartX(41.9);
        cabello_1.setStartY(39.3);
        cabello_1.setControlX(46.8);
        cabello_1.setControlY(33.2);
        cabello_1.setEndX(46.6);
        cabello_1.setEndY(29.4);
        cabello_1.setStroke(Color.rgb(38, 35, 36));
        cabello_1.setFill(Color.rgb(52, 50, 51));
        cabello_1.setStrokeWidth(0.3);
        cabello_1.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_2=new QuadCurve();
        cabello_2.setStartX(46.6);
        cabello_2.setStartY(29.4);
        cabello_2.setControlX(45.8);
        cabello_2.setControlY(27.4);
        cabello_2.setEndX(44.1);
        cabello_2.setEndY(26.7);
        cabello_2.setStroke(Color.rgb(38, 35, 36));
        cabello_2.setFill(Color.rgb(52, 50, 51));
        cabello_2.setStrokeWidth(0.3);
        cabello_2.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_3=new QuadCurve();
        cabello_3.setStartX(44.1);
        cabello_3.setStartY(26.7);
        cabello_3.setControlX(45.6);
        cabello_3.setControlY(25.5);
        cabello_3.setEndX(44.1);
        cabello_3.setEndY(24.3);
        cabello_3.setStroke(Color.rgb(38, 35, 36));
        cabello_3.setFill(Color.rgb(52, 50, 51));
        cabello_3.setStrokeWidth(0.3);
        cabello_3.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_4=new QuadCurve();
        cabello_4.setStartX(44.1);
        cabello_4.setStartY(24.3);
        cabello_4.setControlX(37.4);
        cabello_4.setControlY(16.7);
        cabello_4.setEndX(22.2);
        cabello_4.setEndY(18.4);
        cabello_4.setStroke(Color.rgb(38, 35, 36));
        cabello_4.setFill(Color.rgb(52, 50, 51));
        cabello_4.setStrokeWidth(0.3);
        cabello_4.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_5=new QuadCurve();
        cabello_5.setStartX(22.2);
        cabello_5.setStartY(18.4);
        cabello_5.setControlX(26);
        cabello_5.setControlY(18.8);
        cabello_5.setEndX(27.2);
        cabello_5.setEndY(19.8);
        cabello_5.setStroke(Color.rgb(38, 35, 36));
        cabello_5.setFill(Color.WHITE);
        cabello_5.setStrokeWidth(0.3);
        cabello_5.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_6=new QuadCurve();
        cabello_6.setStartX(27.2);
        cabello_6.setStartY(19.8);
        cabello_6.setControlX(22);
        cabello_6.setControlY(20);
        cabello_6.setEndX(20);
        cabello_6.setEndY(22);
        cabello_6.setStroke(Color.rgb(38, 35, 36));
        cabello_6.setFill(Color.rgb(52, 50, 51));
        cabello_6.setStrokeWidth(0.3);
        cabello_6.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_7=new QuadCurve();
        cabello_7.setStartX(19.8);
        cabello_7.setStartY(23.3);
        cabello_7.setControlX(20.4);
        cabello_7.setControlY(22.7);
        cabello_7.setEndX(22.7);
        cabello_7.setEndY(23.2);
        cabello_7.setStroke(Color.rgb(38, 35, 36));
        cabello_7.setFill(Color.rgb(52, 50, 51));
        cabello_7.setStrokeWidth(0.3);
        cabello_7.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_8=new QuadCurve();
        cabello_8.setStartX(22.7);
        cabello_8.setStartY(23.2);
        cabello_8.setControlX(20.2);
        cabello_8.setControlY(24.1);
        cabello_8.setEndX(19.3);
        cabello_8.setEndY(25.7);
        cabello_8.setStroke(Color.rgb(38, 35, 36));
        cabello_8.setFill(Color.rgb(52, 50, 51));
        cabello_8.setStrokeWidth(0.3);
        cabello_8.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_9=new QuadCurve();
        cabello_9.setStartX(18.4);
        cabello_9.setStartY(29);
        cabello_9.setControlX(27.5);
        cabello_9.setControlY(22.3);
        cabello_9.setEndX(38);
        cabello_9.setEndY(23.1);
        cabello_9.setStroke(Color.rgb(38, 35, 36));
        cabello_9.setFill(Color.rgb(52, 50, 51));
        cabello_9.setStrokeWidth(0.3);
        cabello_9.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_10=new QuadCurve();
        cabello_10.setStartX(17.7);
        cabello_10.setStartY(31.2);
        cabello_10.setControlX(25.2);
        cabello_10.setControlY(26.2);
        cabello_10.setEndX(33.9);
        cabello_10.setEndY(27.4);
        cabello_10.setStroke(Color.rgb(38, 35, 36));
        cabello_10.setFill(null);
        cabello_10.setStrokeWidth(0.3);
        cabello_10.setStrokeLineCap(StrokeLineCap.ROUND);


        QuadCurve cabello_11=new QuadCurve();
        cabello_11.setStartX(44.5);
        cabello_11.setStartY(35.6);
        cabello_11.setControlX(44.2);
        cabello_11.setControlY(32.9);
        cabello_11.setEndX(42.2);
        cabello_11.setEndY(32.5);
        cabello_11.setStroke(Color.rgb(38, 35, 36));
        cabello_11.setFill(Color.rgb(52, 50, 51));
        cabello_11.setStrokeWidth(0.3);
        cabello_11.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_12=new QuadCurve();
        cabello_12.setStartX(45.5);
        cabello_12.setStartY(33.3);
        cabello_12.setControlX(45.2);
        cabello_12.setControlY(30.8);
        cabello_12.setEndX(42.9);
        cabello_12.setEndY(31.2);
        cabello_12.setStroke(Color.rgb(38, 35, 36));
        cabello_12.setFill(Color.rgb(52, 50, 51));
        cabello_12.setStrokeWidth(0.3);
        cabello_12.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_13=new QuadCurve();
        cabello_13.setStartX(41.7);
        cabello_13.setStartY(30.2);
        cabello_13.setControlX(43.3);
        cabello_13.setControlY(28.2);
        cabello_13.setEndX(44.2);
        cabello_13.setEndY(26.8);
        cabello_13.setStroke(Color.rgb(38, 35, 36));
        cabello_13.setFill(Color.rgb(52, 50, 51));
        cabello_13.setStrokeWidth(0.3);
        cabello_13.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_14=new QuadCurve();
        cabello_14.setStartX(37.6);
        cabello_14.setStartY(29.6);
        cabello_14.setControlX(45.7);
        cabello_14.setControlY(25);
        cabello_14.setEndX(40);
        cabello_14.setEndY(20.9);
        cabello_14.setStroke(Color.rgb(38, 35, 36));
        cabello_14.setFill(Color.rgb(52, 50, 51));
        cabello_14.setStrokeWidth(0.3);
        cabello_14.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_15=new QuadCurve();
        cabello_15.setStartX(36.2);
        cabello_15.setStartY(29.3);
        cabello_15.setControlX(39.3);
        cabello_15.setControlY(25.1);
        cabello_15.setEndX(38);
        cabello_15.setEndY(23.1);
        cabello_15.setStroke(Color.rgb(38, 35, 36));
        cabello_15.setFill(null);
        cabello_15.setStrokeWidth(0.3);
        cabello_15.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_16=new QuadCurve();
        cabello_16.setStartX(16.5);
        cabello_16.setStartY(36.7);
        cabello_16.setControlX(17.1);
        cabello_16.setControlY(32.4);
        cabello_16.setEndX(20.6);
        cabello_16.setEndY(29.9);
        cabello_16.setStroke(Color.rgb(38, 35, 36));
        cabello_16.setFill(Color.rgb(52, 50, 51));
        cabello_16.setStrokeWidth(0.3);
        cabello_16.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_17=new QuadCurve();
        cabello_17.setStartX(16.5);
        cabello_17.setStartY(36.7);
        cabello_17.setControlX(17.7);
        cabello_17.setControlY(34.1);
        cabello_17.setEndX(20.8);
        cabello_17.setEndY(33.5);
        cabello_17.setStroke(Color.rgb(38, 35, 36));
        cabello_17.setFill(null);
        cabello_17.setStrokeWidth(0.3);
        cabello_17.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_18=new QuadCurve();
        cabello_18.setStartX(15.9);
        cabello_18.setStartY(51.5);
        cabello_18.setControlX(12.7);
        cabello_18.setControlY(38.9);
        cabello_18.setEndX(20.8);
        cabello_18.setEndY(33.5);
        cabello_18.setStroke(Color.rgb(38, 35, 36));
        cabello_18.setFill(Color.rgb(52, 50, 51));
        cabello_18.setStrokeWidth(0.3);
        cabello_18.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_19=new QuadCurve();
        cabello_19.setStartX(15.9);
        cabello_19.setStartY(51.5);
        cabello_19.setControlX(15.8);
        cabello_19.setControlY(48.9);
        cabello_19.setEndX(17.2);
        cabello_19.setEndY(47.1);
        cabello_19.setStroke(Color.rgb(38, 35, 36));
        cabello_19.setFill(Color.WHITE);
        cabello_19.setStrokeWidth(0.3);
        cabello_19.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cabello_20=new QuadCurve();
        cabello_20.setStartX(20.1);
        cabello_20.setStartY(57);
        cabello_20.setControlX(16.6);
        cabello_20.setControlY(53.1);
        cabello_20.setEndX(17.2);
        cabello_20.setEndY(47.1);
        cabello_20.setStroke(Color.rgb(38, 35, 36));
        cabello_20.setFill(Color.rgb(52, 50, 51));
        cabello_20.setStrokeWidth(0.3);
        cabello_20.setStrokeLineCap(StrokeLineCap.ROUND);

        
        Polygon color_cabello1 =new Polygon(20.1,57,41.9,39.3,46.6,29.4,44.1,26.7,44.4,25.1,37.2,19.6,28.1,19.4,19.9,22,19.7,23.4,22.8,23.1,19.3,25.5,17.9,30.7,22,29.1,19.5,34.6,17,47.6,17.3,48.0);
        color_cabello1.setStroke(Color.rgb(52, 50, 51));
        color_cabello1.setFill(Color.rgb(52, 50, 51));
        color_cabello1.setStrokeWidth(0.45);

        Polygon color_cabello2 =new Polygon(17.2,35,20.1,33.7,22,29,21,29);
        color_cabello2.setStroke(Color.rgb(52, 50, 51));
        color_cabello2.setFill(Color.rgb(52, 50, 51));
        color_cabello2.setStrokeWidth(0.45);
        Circle punto_control=new Circle(42.6,25.3,2);
        punto_control.setFill(Color.rgb(52, 50, 51));

        Polygon pelo_azul1= new Polygon(36.4,29.5, 39.6,23.4, 33.9,23.5, 31.4,25.7, 36.4,25.3);
        pelo_azul1.setStroke(Color.rgb(27,65,100));
        pelo_azul1.setFill(Color.rgb(27,65,100));
        pelo_azul1.setStrokeWidth(0.45);

        QuadCurve pelo_azul2=new QuadCurve();
        pelo_azul2.setStartX(28);
        pelo_azul2.setStartY(24.7);
        pelo_azul2.setControlX(29.6);
        pelo_azul2.setControlY(25.5);
        pelo_azul2.setEndX(34.4);
        pelo_azul2.setEndY(24.5);
        pelo_azul2.setStroke(Color.rgb(27,65,100));
        pelo_azul2.setFill(null);
        pelo_azul2.setStrokeWidth(0.7);
        pelo_azul2.setStrokeLineCap(StrokeLineCap.BUTT);

        QuadCurve pelo_azul3=new QuadCurve();
        pelo_azul3.setStartX(28);
        pelo_azul3.setStartY(25.5);
        pelo_azul3.setControlX(30.3);
        pelo_azul3.setControlY(25.5);
        pelo_azul3.setEndX(33.3);
        pelo_azul3.setEndY(25.6);
        pelo_azul3.setStroke(Color.rgb(27,65,100));
        pelo_azul3.setFill(Color.rgb(27,65,100));
        pelo_azul3.setStrokeWidth(0.7);
        pelo_azul3.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve pelo_azul4=new QuadCurve();
        pelo_azul4.setStartX(20);
        pelo_azul4.setStartY(29);
        pelo_azul4.setControlX(22.5);
        pelo_azul4.setControlY(25.8);
        pelo_azul4.setEndX(25.5);
        pelo_azul4.setEndY(27);
        pelo_azul4.setStroke(null);
        pelo_azul4.setFill(Color.rgb(27,65,100));
        pelo_azul4.setStrokeWidth(0.7);
        pelo_azul4.setStrokeLineCap(StrokeLineCap.ROUND);

        Line pelo_azul5 = new Line(23.6,27.2, 28,25.3);
        pelo_azul5.setStroke(Color.rgb(27,65,100));
        pelo_azul5.setStrokeWidth(1);
        pelo_azul5.setStrokeLineCap(StrokeLineCap.ROUND);

        // LA CARA

        Line cara_1 = new Line(27.4,39.1, 27.6,30.1);
        cara_1.setStroke(Color.rgb(115,42,27));
        cara_1.setStrokeWidth(0.4);
        cara_1.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cara_2=new QuadCurve();
        cara_2.setStartX(27.6);
        cara_2.setStartY(30.1);
        cara_2.setControlX(34.6);
        cara_2.setControlY(27.7);
        cara_2.setEndX(41.6);
        cara_2.setEndY(30.2);
        cara_2.setStroke(Color.rgb(115,42,27));
        cara_2.setFill(Color.rgb(211, 157, 97));
        cara_2.setStrokeWidth(0.4);
        cara_2.setStrokeLineCap(StrokeLineCap.ROUND);

        Line cara_3 = new Line(41.6,30.2, 41.8,39);
        cara_3.setStroke(Color.rgb(115,42,27));
        cara_3.setStrokeWidth(0.4);
        cara_3.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon cara_4= new Polygon(27.6,31.7, 27.8,30.1, 41.4,30.2, 41.6,31.6);
        cara_4.setStroke(Color.rgb(211, 157, 97));
        cara_4.setFill(Color.rgb(211, 157, 97));
        cara_4.setStrokeWidth(0.4);

        QuadCurve cara_6=new QuadCurve();
        cara_6.setStartX(27.7);
        cara_6.setStartY(31.8);
        cara_6.setControlX(33.2);
        cara_6.setControlY(31.8);
        cara_6.setEndX(34.9);
        cara_6.setEndY(34.1);
        cara_6.setStroke(Color.rgb(122,21,1));
        cara_6.setFill(Color.rgb(249, 181, 166));
        cara_6.setStrokeWidth(0.4);
        cara_6.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cara_7=new QuadCurve();
        cara_7.setStartX(34.9);
        cara_7.setStartY(34.1);
        cara_7.setControlX(36.3);
        cara_7.setControlY(32.3);
        cara_7.setEndX(41.5);
        cara_7.setEndY(31.7);
        cara_7.setStroke(Color.rgb(122,21,1));
        cara_7.setFill(Color.rgb(249, 181, 166));
        cara_7.setStrokeWidth(0.4);
        cara_7.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon cara_8= new Polygon(30.1,31.7, 39.3,31.7, 34.9,33.9);
        cara_8.setStroke(Color.rgb(211, 157, 97));
        cara_8.setFill(Color.rgb(211, 157, 97));
        cara_8.setStrokeWidth(0.4);

        Polygon cara_9= new Polygon(34.1,32.7, 34.8,32, 35.6,32.7, 35.5,31.6, 36.5,31.2, 35.3,30.9, 34.8,29.8, 34.4,31, 33,31.2, 34.1,31.7);
        cara_9.setStroke(Color.rgb(150,20,13));
        cara_9.setFill(Color.rgb(181,18,27));
        cara_9.setStrokeWidth(0.2);

        Polygon cara_10= new Polygon(27.5,41.7, 27.5,31.9, 34.9,32.7, 41.6,31.5, 41.4,41.5);
        cara_10.setStroke(Color.rgb(249,181,166));
        cara_10.setFill(Color.rgb(249,181,166));
        cara_10.setStrokeWidth(0.2);

        Polygon cara_11= new Polygon(25.9,42.5, 26.1,40.3, 25.1,39.6, 26.4,39.3, 26.9, 36.1, 27.3,39.2, 28.6,39.6, 27.8,40.2, 27.8,42.6, 26.9,41);
        cara_11.setStroke(Color.rgb(135,34,17));
        cara_11.setFill(Color.rgb(181,18,27));
        cara_11.setStrokeWidth(0.2);

        Polygon cara_12= new Polygon(41.1,43, 41.9,41.5, 42.7,42.9, 42.6,40.7, 43.5,40.2, 42.4,39.7, 42.1,37.5, 41.5,39.7, 40.6,40, 41.2, 40.9);
        cara_12.setStroke(Color.rgb(135,34,17));
        cara_12.setFill(Color.rgb(181,18,27));
        cara_12.setStrokeWidth(0.2);

        Polygon sombra_1= new Polygon(32.3,45.7, 28.8,41, 28.8,34.8, 29.6,33.9, 29.1,31.7, 27.6,31.7, 27.6,41.8);
        sombra_1.setStroke(Color.rgb(212,148,138));
        sombra_1.setFill(Color.rgb(212,148,138));
        sombra_1.setStrokeWidth(0.2);

        QuadCurve cara_13=new QuadCurve();
        cara_13.setStartX(27.7);
        cara_13.setStartY(41.6);
        cara_13.setControlX(29.9);
        cara_13.setControlY(44.9);
        cara_13.setEndX(34.5);
        cara_13.setEndY(46.8);
        cara_13.setStroke(Color.rgb(115,42,27));
        cara_13.setFill(null);
        cara_13.setStrokeWidth(0.4);
        cara_13.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve cara_14=new QuadCurve();
        cara_14.setStartX(34.5);
        cara_14.setStartY(46.8);
        cara_14.setControlX(39.3);
        cara_14.setControlY(44.4);
        cara_14.setEndX(41.3);
        cara_14.setEndY(41.5);
        cara_14.setStroke(Color.rgb(115,42,27));
        cara_14.setFill(Color.rgb(249, 181, 166));
        cara_14.setStrokeWidth(0.4);
        cara_14.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon sombra_2= new Polygon(27.6,41.5, 41.9,41.4, 34.5,46.7);
        sombra_2.setStroke(Color.rgb(249,181,166));
        sombra_2.setFill(Color.rgb(249,181,166));
        sombra_2.setStrokeWidth(0.2);

        QuadCurve cara_15=new QuadCurve();
        cara_15.setStartX(30.2);
        cara_15.setStartY(43.4);
        cara_15.setControlX(34.1);
        cara_15.setControlY(47.7);
        cara_15.setEndX(34.1);
        cara_15.setEndY(45);
        cara_15.setStroke(Color.rgb(249, 181, 166));
        cara_15.setFill(Color.rgb(249, 181, 166));
        cara_15.setStrokeWidth(0.4);
        cara_15.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve boca_1=new QuadCurve();
        boca_1.setStartX(30.9);
        boca_1.setStartY(41.6);
        boca_1.setControlX(34.5);
        boca_1.setControlY(47.6);
        boca_1.setEndX(38.4);
        boca_1.setEndY(41.4);
        boca_1.setStroke(null);
        boca_1.setFill(Color.rgb(181,18,27));
        boca_1.setStrokeWidth(0.4);
        boca_1.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve boca_2=new QuadCurve();
        boca_2.setStartX(31.1);
        boca_2.setStartY(41.5);
        boca_2.setControlX(32.5);
        boca_2.setControlY(42.25);
        boca_2.setEndX(35);
        boca_2.setEndY(41.3);
        boca_2.setStroke(null);
        boca_2.setFill(Color.rgb(249,181,166));
        boca_2.setStrokeWidth(0.4);
        boca_2.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve boca_4=new QuadCurve();
        boca_4.setStartX(34.5);
        boca_4.setStartY(41.3);
        boca_4.setControlX(36.6);
        boca_4.setControlY(42.25);
        boca_4.setEndX(38.2);
        boca_4.setEndY(41.4);
        boca_4.setStroke(null);
        boca_4.setFill(Color.rgb(249,181,166));
        boca_4.setStrokeWidth(0.4);
        boca_4.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve boca_3=new QuadCurve();
        boca_3.setStartX(32);
        boca_3.setStartY(42.2);
        boca_3.setControlX(34.5);
        boca_3.setControlY(45.5);
        boca_3.setEndX(37);
        boca_3.setEndY(42.3);
        boca_3.setStroke(null);
        boca_3.setFill(Color.rgb(255,255,255));
        boca_3.setStrokeWidth(0.4);
        boca_3.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve nariz_1=new QuadCurve();
        nariz_1.setStartX(35);
        nariz_1.setStartY(38.9);
        nariz_1.setControlX(35);
        nariz_1.setControlY(39.7);
        nariz_1.setEndX(35.6);
        nariz_1.setEndY(39.8);
        nariz_1.setStroke(Color.rgb(122,21,1));
        nariz_1.setFill(null);
        nariz_1.setStrokeWidth(0.2);
        nariz_1.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve nariz_2=new QuadCurve();
        nariz_2.setStartX(35.1);
        nariz_2.setStartY(40.6);
        nariz_2.setControlX(35.6);
        nariz_2.setControlY(40.4);
        nariz_2.setEndX(35.6);
        nariz_2.setEndY(39.9);
        nariz_2.setStroke(Color.rgb(122,21,1));
        nariz_2.setFill(null);
        nariz_2.setStrokeWidth(0.2);
        nariz_2.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve ceja1_1=new QuadCurve();
        ceja1_1.setStartX(36.3);
        ceja1_1.setStartY(35.1);
        ceja1_1.setControlX(37.6);
        ceja1_1.setControlY(33.3);
        ceja1_1.setEndX(40.7);
        ceja1_1.setEndY(32.7);
        ceja1_1.setStroke(null);
        ceja1_1.setFill(Color.rgb(38,35,36));
        ceja1_1.setStrokeWidth(0.2);
        ceja1_1.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon ceja1_2= new Polygon(36.3,35, 40.5,32.7, 41.9,34.2, 40.9,33.8, 37.8,35.2);
        ceja1_2.setStroke(null);
        ceja1_2.setFill(Color.rgb(38,35,36));
        ceja1_2.setStrokeWidth(0.1);

        QuadCurve ceja2_1=new QuadCurve();
        ceja2_1.setStartX(33.3);
        ceja2_1.setStartY(35.1);
        ceja2_1.setControlX(31.6);
        ceja2_1.setControlY(33.3);
        ceja2_1.setEndX(28.8);
        ceja2_1.setEndY(32.7);
        ceja2_1.setStroke(null);
        ceja2_1.setFill(Color.rgb(38,35,36));
        ceja2_1.setStrokeWidth(0.2);
        ceja2_1.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon ceja2_2= new Polygon(33.5,35, 28.8,32.7, 27.6,34.2, 28.4,33.8, 31.9,35.2);
        ceja2_2.setStroke(null);
        ceja2_2.setFill(Color.rgb(38,35,36));
        ceja2_2.setStrokeWidth(0.1);

        Polygon ojo1_1=new Polygon(32.8,38, 29.1,37.7, 26.6,34.6, 32.3,36.3);
        ojo1_1.setStroke(null);
        ojo1_1.setFill(Color.rgb(38,35,36));

        QuadCurve ojo1_2=new QuadCurve();
        ojo1_2.setStartX(26.6);
        ojo1_2.setStartY(34.7);
        ojo1_2.setControlX(30);
        ojo1_2.setControlY(34.6);
        ojo1_2.setEndX(32.3);
        ojo1_2.setEndY(36.35);
        ojo1_2.setStroke(null);
        ojo1_2.setFill(Color.rgb(38,35,36));
        ojo1_2.setStrokeWidth(0.2);
        ojo1_2.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon ojo1_3=new Polygon(32.8,37.9, 32,36.3, 27.9,35.3, 29.1,37.3);
        ojo1_3.setStroke(null);
        ojo1_3.setFill(Color.rgb(255,255,255));

        QuadCurve ojo1_4=new QuadCurve();
        ojo1_4.setStartX(27.9);
        ojo1_4.setStartY(35.4);
        ojo1_4.setControlX(30.4);
        ojo1_4.setControlY(35.1);
        ojo1_4.setEndX(32.1);
        ojo1_4.setEndY(36.45);
        ojo1_4.setStroke(null);
        ojo1_4.setFill(Color.rgb(255,255,255));
        ojo1_4.setStrokeWidth(0.2);
        ojo1_4.setStrokeLineCap(StrokeLineCap.ROUND);

        Arc ojo1_5=new Arc(30.5,35.96,0.75,1.5,157,208);
        ojo1_5.setFill(Color.rgb(27, 65, 100));
        ojo1_5.setStroke(Color.rgb(50, 48, 49));
        ojo1_5.setStrokeWidth(0.1);

        Polygon ojo2_1=new Polygon(36.7,38, 40.1,37.7, 42.2,34.6, 37.1,36.3);
        ojo2_1.setStroke(null);
        ojo2_1.setFill(Color.rgb(38,35,36));

        QuadCurve ojo2_2=new QuadCurve();
        ojo2_2.setStartX(37.0);
        ojo2_2.setStartY(36.5);
        ojo2_2.setControlX(39);
        ojo2_2.setControlY(34.6);
        ojo2_2.setEndX(42.3);
        ojo2_2.setEndY(34.8);
        ojo2_2.setStroke(null);
        ojo2_2.setFill(Color.rgb(38,35,36));
        ojo2_2.setStrokeWidth(0.2);
        ojo2_2.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon ojo2_3=new Polygon(36.8,37.9, 37.4,36.3, 41.2,35.3, 39.9,37.3);
        ojo2_3.setStroke(null);
        ojo2_3.setFill(Color.rgb(255,255,255));

        QuadCurve ojo2_4=new QuadCurve();
        ojo2_4.setStartX(41.2);
        ojo2_4.setStartY(35.4);
        ojo2_4.setControlX(39.1);
        ojo2_4.setControlY(35.1);
        ojo2_4.setEndX(37.4);
        ojo2_4.setEndY(36.45);
        ojo2_4.setStroke(null);
        ojo2_4.setFill(Color.rgb(255,255,255));
        ojo2_4.setStrokeWidth(0.2);
        ojo2_4.setStrokeLineCap(StrokeLineCap.ROUND);

        Arc ojo2_5=new Arc(38.7,35.98,0.75,1.5,180,204);
        ojo2_5.setFill(Color.rgb(27, 65, 100));
        ojo2_5.setStroke(Color.rgb(50, 48, 49));
        ojo2_5.setStrokeWidth(0.1);

        QuadCurve oreja1_1=new QuadCurve();
        oreja1_1.setStartX(27.3);
        oreja1_1.setStartY(36.3);
        oreja1_1.setControlX(26.8);
        oreja1_1.setControlY(34.5);
        oreja1_1.setEndX(25.8);
        oreja1_1.setEndY(34.8);
        oreja1_1.setStroke(Color.rgb(122, 21, 1));
        oreja1_1.setFill(Color.rgb(212,148,138));
        oreja1_1.setStrokeWidth(0.2);
        oreja1_1.setStrokeLineCap(StrokeLineCap.ROUND);


        QuadCurve oreja1_2=new QuadCurve();
        oreja1_2.setStartX(25.8);
        oreja1_2.setStartY(34.8);
        oreja1_2.setControlX(24.6);
        oreja1_2.setControlY(35.2);
        oreja1_2.setEndX(25.3);
        oreja1_2.setEndY(37.3);
        oreja1_2.setStroke(Color.rgb(122, 21, 1));
        oreja1_2.setFill(Color.rgb(212,148,138));
        oreja1_2.setStrokeWidth(0.2);
        oreja1_2.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve oreja1_3=new QuadCurve();
        oreja1_3.setStartX(25.3);
        oreja1_3.setStartY(37.3);
        oreja1_3.setControlX(25.6);
        oreja1_3.setControlY(38.6);
        oreja1_3.setEndX(26.9);
        oreja1_3.setEndY(38.7);
        oreja1_3.setStroke(Color.rgb(122, 21, 1));
        oreja1_3.setFill(Color.rgb(212,148,138));
        oreja1_3.setStrokeWidth(0.2);
        oreja1_3.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve oreja1_4=new QuadCurve();
        oreja1_4.setStartX(26.6);
        oreja1_4.setStartY(37.1);
        oreja1_4.setControlX(26.5);
        oreja1_4.setControlY(35.9);
        oreja1_4.setEndX(25.8);
        oreja1_4.setEndY(35.9);
        oreja1_4.setStroke(Color.rgb(129,31,12));
        oreja1_4.setFill(null);
        oreja1_4.setStrokeWidth(0.15);
        oreja1_4.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve oreja1_5=new QuadCurve();
        oreja1_5.setStartX(26.4);
        oreja1_5.setStartY(37.5);
        oreja1_5.setControlX(25.6);
        oreja1_5.setControlY(36.5);
        oreja1_5.setEndX(26.4);
        oreja1_5.setEndY(36.7);
        oreja1_5.setStroke(Color.rgb(129,31,12));
        oreja1_5.setFill(null);
        oreja1_5.setStrokeWidth(0.15);
        oreja1_5.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon relleno_oreja=new Polygon(27.4,38.5, 27.3,36.1, 25.84, 34.9, 25.3,36.4, 25.3, 37.3, 26.8,39.2);
        relleno_oreja.setStroke(Color.rgb(212,148,138));
        relleno_oreja.setStrokeWidth(0.2);
        relleno_oreja.setFill(Color.rgb(212,148,138));


        QuadCurve oreja2_1=new QuadCurve();
        oreja2_1.setStartX(41.9);
        oreja2_1.setStartY(36.3);
        oreja2_1.setControlX(43);
        oreja2_1.setControlY(34);
        oreja2_1.setEndX(43.7);
        oreja2_1.setEndY(35.4);
        oreja2_1.setStroke(Color.rgb(122, 21, 1));
        oreja2_1.setFill(Color.rgb(249,181,166));
        oreja2_1.setStrokeWidth(0.2);
        oreja2_1.setStrokeLineCap(StrokeLineCap.ROUND);


        QuadCurve oreja2_2=new QuadCurve();
        oreja2_2.setStartX(43.7);
        oreja2_2.setStartY(35.4);
        oreja2_2.setControlX(43.9);
        oreja2_2.setControlY(35.5);
        oreja2_2.setEndX(43.8);
        oreja2_2.setEndY(36.6);
        oreja2_2.setStroke(Color.rgb(122, 21, 1));
        oreja2_2.setFill(Color.rgb(249,181,166));
        oreja2_2.setStrokeWidth(0.2);
        oreja2_2.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve oreja2_3=new QuadCurve();
        oreja2_3.setStartX(43.8);
        oreja2_3.setStartY(36.6);
        oreja2_3.setControlX(43.6);
        oreja2_3.setControlY(38.3);
        oreja2_3.setEndX(42.1);
        oreja2_3.setEndY(39.2);
        oreja2_3.setStroke(Color.rgb(122, 21, 1));
        oreja2_3.setFill(Color.rgb(249,181,166));
        oreja2_3.setStrokeWidth(0.2);
        oreja2_3.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve oreja2_4=new QuadCurve();
        oreja2_4.setStartX(42.4);
        oreja2_4.setStartY(37.5);
        oreja2_4.setControlX(42.3);
        oreja2_4.setControlY(36.8);
        oreja2_4.setEndX(43);
        oreja2_4.setEndY(36.3);
        oreja2_4.setStroke(Color.rgb(129,31,12));
        oreja2_4.setFill(null);
        oreja2_4.setStrokeWidth(0.15);
        oreja2_4.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve oreja2_5=new QuadCurve();
        oreja2_5.setStartX(42.6);
        oreja2_5.setStartY(37);
        oreja2_5.setControlX(43.1);
        oreja2_5.setControlY(36.9);
        oreja2_5.setEndX(42.4);
        oreja2_5.setEndY(38.3);
        oreja2_5.setStroke(Color.rgb(129,31,12));
        oreja2_5.setFill(null);
        oreja2_5.setStrokeWidth(0.15);
        oreja2_5.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon relleno_oreja2=new Polygon(42,39.6, 43,38.5, 43.6,37.3, 43.75,36.3, 43.6,35.3, 41.8,36.5);
        relleno_oreja2.setStroke(Color.rgb(249,181,166));
        relleno_oreja2.setStrokeWidth(0.2);
        relleno_oreja2.setFill(Color.rgb(249,181,166));


        Circle punto_referencia2=new Circle(26.2,38.9, 0.25);
        punto_referencia2.setFill(Color.RED);
        punto_referencia2.setStroke(null);
       
       //CUERPO SUPERIOR

       QuadCurve hombro1_1=new QuadCurve();
       hombro1_1.setStartX(17);
       hombro1_1.setStartY(38.8);
       hombro1_1.setControlX(18.5);
       hombro1_1.setControlY(37.7);
       hombro1_1.setEndX(21.4);
       hombro1_1.setEndY(37.8);
       hombro1_1.setStroke(Color.rgb(122,21,1));
       hombro1_1.setFill(Color.rgb(249,181,166));
       hombro1_1.setStrokeWidth(0.4);
       hombro1_1.setStrokeLineCap(StrokeLineCap.ROUND);

       QuadCurve hombro1_2=new QuadCurve();
       hombro1_2.setStartX(21.4);
       hombro1_2.setStartY(37.8);
       hombro1_2.setControlX(24.2);
       hombro1_2.setControlY(37.8);
       hombro1_2.setEndX(27.8);
       hombro1_2.setEndY(40.4);
       hombro1_2.setStroke(Color.rgb(122,21,1));
       hombro1_2.setFill(Color.rgb(249,181,166));
       hombro1_2.setStrokeWidth(0.4);
       hombro1_2.setStrokeLineCap(StrokeLineCap.ROUND);

       QuadCurve hombro1_3=new QuadCurve();
       hombro1_3.setStartX(13.85);
       hombro1_3.setStartY(46.1);
       hombro1_3.setControlX(17.2);
       hombro1_3.setControlY(46.1);
       hombro1_3.setEndX(20.6);
       hombro1_3.setEndY(47.3);
       hombro1_3.setStroke(Color.rgb(122,21,1));
       hombro1_3.setFill(null);
       hombro1_3.setStrokeWidth(0.4);
       hombro1_3.setStrokeLineCap(StrokeLineCap.ROUND);

       QuadCurve hombro1_4=new QuadCurve();
       hombro1_4.setStartX(20.1);
       hombro1_4.setStartY(46.3);
       hombro1_4.setControlX(21.4);
       hombro1_4.setControlY(47.9);
       hombro1_4.setEndX(21.8);
       hombro1_4.setEndY(50.2);
       hombro1_4.setStroke(Color.rgb(122,21,1));
       hombro1_4.setFill(null);
       hombro1_4.setStrokeWidth(0.2);
       hombro1_4.setStrokeLineCap(StrokeLineCap.ROUND);

       Line cuello_1 =new Line(29.6,46.2, 29,42.9);
       cuello_1.setStroke(Color.rgb(122,21,1));
       cuello_1.setStrokeWidth(0.2);

       Line cuello_2 =new Line(34.4,48.6, 37.2,44.3);
       cuello_2.setStroke(Color.rgb(122,21,1));
       cuello_2.setStrokeWidth(0.2);

       QuadCurve cuerpo_1=new QuadCurve();
       cuerpo_1.setStartX(18.6);
       cuerpo_1.setStartY(46.9);
       cuerpo_1.setControlX(20.4);
       cuerpo_1.setControlY(54.1);
       cuerpo_1.setEndX(20.1);
       cuerpo_1.setEndY(60.1);
       cuerpo_1.setStroke(Color.rgb(122,21,1));
       cuerpo_1.setFill(null);
       cuerpo_1.setStrokeWidth(0.4);
       cuerpo_1.setStrokeLineCap(StrokeLineCap.ROUND);

       //puño
       QuadCurve puño1_1=new QuadCurve();
       puño1_1.setStartX(14.5);
       puño1_1.setStartY(38.6);
       puño1_1.setControlX(18.5);
       puño1_1.setControlY(39.1);
       puño1_1.setEndX(18.7);
       puño1_1.setEndY(39.8);
       puño1_1.setStroke(Color.rgb(122,21,1));
       puño1_1.setFill(null);
       puño1_1.setStrokeWidth(0.4);
       puño1_1.setStrokeLineCap(StrokeLineCap.ROUND);

       QuadCurve puño1_2=new QuadCurve();
       puño1_2.setStartX(18.7);
       puño1_2.setStartY(39.8);
       puño1_2.setControlX(18.9);
       puño1_2.setControlY(40.4);
       puño1_2.setEndX(17.6);
       puño1_2.setEndY(45.2);
       puño1_2.setStroke(Color.rgb(122,21,1));
       puño1_2.setFill(null);
       puño1_2.setStrokeWidth(0.4);
       puño1_2.setStrokeLineCap(StrokeLineCap.ROUND);

       QuadCurve puño1_3=new QuadCurve();
       puño1_3.setStartX(17.6);
       puño1_3.setStartY(45.2);
       puño1_3.setControlX(16.5);
       puño1_3.setControlY(44.2);
       puño1_3.setEndX(16.6);
       puño1_3.setEndY(42.8);
       puño1_3.setStroke(Color.rgb(122,21,1));
       puño1_3.setFill(null);
       puño1_3.setStrokeWidth(0.4);
       puño1_3.setStrokeLineCap(StrokeLineCap.ROUND);

       QuadCurve puño1_4=new QuadCurve();
       puño1_4.setStartX(14.6);
       puño1_4.setStartY(38.6);
       puño1_4.setControlX(17.8);
       puño1_4.setControlY(40.9);
       puño1_4.setEndX(17.4);
       puño1_4.setEndY(41.4);
       puño1_4.setStroke(Color.rgb(122,21,1));
       puño1_4.setFill(null);
       puño1_4.setStrokeWidth(0.4);
       puño1_4.setStrokeLineCap(StrokeLineCap.ROUND);

       Line puño1_5 =new Line(17.4,41.4, 12.6,47.7);
       puño1_5.setStroke(Color.rgb(122,21,1));
       puño1_5.setStrokeWidth(0.4);

       Line puño1_6 =new Line(12.6,47.7, 9.9,47.5);
       puño1_6.setStroke(Color.rgb(122,21,1));
       puño1_6.setStrokeWidth(0.4);

       Line puño1_7 =new Line(13.4,46.7, 10.9,45.6);
       puño1_7.setStroke(Color.rgb(122,21,1));
       puño1_7.setStrokeWidth(0.3);

       Line puño1_8 =new Line(14.6,45, 12.2,43.6);
       puño1_8.setStroke(Color.rgb(122,21,1));
       puño1_8.setStrokeWidth(0.3);

       QuadCurve puño1_9=new QuadCurve();
       puño1_9.setStartX(13.3);
       puño1_9.setStartY(40.9);
       puño1_9.setControlX(15.8);
       puño1_9.setControlY(42.);
       puño1_9.setEndX(16.1);
       puño1_9.setEndY(43.3);
       puño1_9.setStroke(Color.rgb(122,21,1));
       puño1_9.setFill(null);
       puño1_9.setStrokeWidth(0.4);
       puño1_9.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon fondo_cuerpo=new Polygon(9.5,47.3, 14.6,38.6, 17.1,39, 21.6,37.9, 25.1,38.9, 28,42.4, 38.1,45.5, 43.5,50, 43.4,64, 45.3,66.6, 41.5,71.3, 38.7,56.4, 20.1,54.3, 18.8,46.5, 13.6,45.9, 12.7,47.6);
        fondo_cuerpo.setStroke(Color.rgb(249,181,166));
        fondo_cuerpo.setFill(Color.rgb(249,181,166));
        fondo_cuerpo.setStrokeWidth(0.45);
        fondo_cuerpo.setStrokeLineCap(StrokeLineCap.ROUND);

        Polygon fondo_cuerpo2=new Polygon(10,47.5, 14.2,39.2, 17.4,41.5, 16.1,39.4, 18.6,40.3, 18.2,43.1, 20.1,43.9, 20,43, 24,48.9, 38.5,56.2, 39.3,53.8, 41.4,63, 43.8,67.7, 41.2,71.2, 38.6,57.9, 19.9,52.1, 18.8,46.8, 13.9,46, 12.4,47.8);
        fondo_cuerpo2.setStroke(null);
        fondo_cuerpo2.setFill(Color.rgb(212,148,138));
        fondo_cuerpo2.setStrokeWidth(0.45);
        fondo_cuerpo2.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve hombro2_1=new QuadCurve();
        hombro2_1.setStartX(37.4);
        hombro2_1.setStartY(44.9);
        hombro2_1.setControlX(40.6);
        hombro2_1.setControlY(46.9);
        hombro2_1.setEndX(42.5);
        hombro2_1.setEndY(48.8);
        hombro2_1.setStroke(Color.rgb(133,40,22));
        hombro2_1.setFill(Color.rgb(249,181,166));
        hombro2_1.setStrokeWidth(0.4);
        hombro2_1.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve hombro2_2=new QuadCurve();
        hombro2_2.setStartX(42.5);
        hombro2_2.setStartY(48.8);
        hombro2_2.setControlX(44.5);
        hombro2_2.setControlY(50.4);
        hombro2_2.setEndX(43.8);
        hombro2_2.setEndY(53.3);
        hombro2_2.setStroke(Color.rgb(133,40,22));
        hombro2_2.setFill(Color.rgb(249,181,166));
        hombro2_2.setStrokeWidth(0.4);
        hombro2_2.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve hombro2_3=new QuadCurve();
        hombro2_3.setStartX(43.8);
        hombro2_3.setStartY(53.3);
        hombro2_3.setControlX(44.2);
        hombro2_3.setControlY(58.5);
        hombro2_3.setEndX(43.5);
        hombro2_3.setEndY(64);
        hombro2_3.setStroke(Color.rgb(133,40,22));
        hombro2_3.setFill(Color.rgb(249,181,166));
        hombro2_3.setStrokeWidth(0.4);
        hombro2_3.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve hombro2_4=new QuadCurve();
        hombro2_4.setStartX(43.5);
        hombro2_4.setStartY(64);
        hombro2_4.setControlX(44.5);
        hombro2_4.setControlY(65.2);
        hombro2_4.setEndX(45.3);
        hombro2_4.setEndY(66.6);
        hombro2_4.setStroke(Color.rgb(133,40,22));
        hombro2_4.setFill(Color.rgb(249,181,166));
        hombro2_4.setStrokeWidth(0.4);
        hombro2_4.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve hombro2_5=new QuadCurve();
        hombro2_5.setStartX(40);
        hombro2_5.setStartY(53.3);
        hombro2_5.setControlX(38.7);
        hombro2_5.setControlY(53.9);
        hombro2_5.setEndX(38.1);
        hombro2_5.setEndY(55.7);
        hombro2_5.setStroke(null);
        hombro2_5.setFill(Color.rgb(142,49,32));
        hombro2_5.setStrokeWidth(0.4);
        hombro2_5.setStrokeLineCap(StrokeLineCap.ROUND);

        Line hombro2_6=new Line(38.7,58.2, 41.3,71.2);
        hombro2_6.setStroke(Color.rgb(122, 21, 1));
        hombro2_6.setFill(Color.rgb(142,49,32));
        hombro2_6.setStrokeWidth(0.4);
        hombro2_6.setStrokeLineCap(StrokeLineCap.ROUND);

        //cuerpo
        QuadCurve ceno2_1=new QuadCurve();
        ceno2_1.setStartX(37.6);
        ceno2_1.setStartY(52.5);
        ceno2_1.setControlX(40.1);
        ceno2_1.setControlY(56.7);
        ceno2_1.setEndX(38.7);
        ceno2_1.setEndY(58);
        ceno2_1.setStroke(Color.rgb(133,40,22));
        ceno2_1.setFill(null);
        ceno2_1.setStrokeWidth(0.4);
        ceno2_1.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve ceno2_2=new QuadCurve();
        ceno2_2.setStartX(38.7);
        ceno2_2.setStartY(58);
        ceno2_2.setControlX(37.1);
        ceno2_2.setControlY(59.6);
        ceno2_2.setEndX(34.9);
        ceno2_2.setEndY(59.6);
        ceno2_2.setStroke(Color.rgb(133,40,22));
        ceno2_2.setFill(Color.rgb(243,118,111));
        ceno2_2.setStrokeWidth(0.4);
        ceno2_2.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve ceno2_3=new QuadCurve();
        ceno2_3.setStartX(35.7);
        ceno2_3.setStartY(59.5);
        ceno2_3.setControlX(34.3);
        ceno2_3.setControlY(60.3);
        ceno2_3.setEndX(32.4);
        ceno2_3.setEndY(58.8);
        ceno2_3.setStroke(null);
        ceno2_3.setFill(Color.rgb(133,40,22));
        ceno2_3.setStrokeWidth(0.4);

        QuadCurve vestido1=new QuadCurve();
        vestido1.setStartX(19.8);
        vestido1.setStartY(52.4);
        vestido1.setControlX(22.6);
        vestido1.setControlY(48.2);
        vestido1.setEndX(26.4);
        vestido1.setEndY(48.2);
        vestido1.setStroke(Color.rgb(122,21,1));
        vestido1.setFill(Color.rgb(211,157,97));
        vestido1.setStrokeWidth(0.4);

        QuadCurve vestido2=new QuadCurve();
        vestido2.setStartX(26.4);
        vestido2.setStartY(48.2);
        vestido2.setControlX(27.1);
        vestido2.setControlY(50.8);
        vestido2.setEndX(29.6);
        vestido2.setEndY(52);
        vestido2.setStroke(Color.rgb(122,21,1));
        vestido2.setFill(null);
        vestido2.setStrokeWidth(0.4);

        QuadCurve vestido3=new QuadCurve();
        vestido3.setStartX(29.6);
        vestido3.setStartY(52);
        vestido3.setControlX(31.1);
        vestido3.setControlY(52.2);
        vestido3.setEndX(31.3);
        vestido3.setEndY(51.1);
        vestido3.setStroke(Color.rgb(122,21,1));
        vestido3.setFill(null);
        vestido3.setStrokeWidth(0.4);

        QuadCurve vestido4=new QuadCurve();
        vestido4.setStartX(31.3);
        vestido4.setStartY(51.1);
        vestido4.setControlX(31);
        vestido4.setControlY(50.5);
        vestido4.setEndX(29.9);
        vestido4.setEndY(50.8);
        vestido4.setStroke(Color.rgb(122,21,1));
        vestido4.setFill(null);
        vestido4.setStrokeWidth(0.4);

        QuadCurve vestido5=new QuadCurve();
        vestido5.setStartX(29.9);
        vestido5.setStartY(50.8);
        vestido5.setControlX(30.6);
        vestido5.setControlY(49.6);
        vestido5.setEndX(33.4);
        vestido5.setEndY(50.6);
        vestido5.setStroke(Color.rgb(122,21,1));
        vestido5.setFill(Color.rgb(211,157,97));
        vestido5.setStrokeWidth(0.4);

        QuadCurve vestido6=new QuadCurve();
        vestido6.setStartX(33.4);
        vestido6.setStartY(50.6);
        vestido6.setControlX(33.3);
        vestido6.setControlY(53.6);
        vestido6.setEndX(36.1);
        vestido6.setEndY(53.4);
        vestido6.setStroke(Color.rgb(122,21,1));
        vestido6.setFill(null);
        vestido6.setStrokeWidth(0.4);

        QuadCurve vestido7=new QuadCurve();
        vestido7.setStartX(36.1);
        vestido7.setStartY(53.4);
        vestido7.setControlX(37);
        vestido7.setControlY(53.3);
        vestido7.setEndX(37.4);
        vestido7.setEndY(52.6);
        vestido7.setStroke(Color.rgb(122,21,1));
        vestido7.setFill(null);
        vestido7.setStrokeWidth(0.4);

        QuadCurve vestido8=new QuadCurve();
        vestido8.setStartX(19.8);
        vestido8.setStartY(52.4);
        vestido8.setControlX(22.5);
        vestido8.setControlY(50.4);
        vestido8.setEndX(25);
        vestido8.setEndY(51);
        vestido8.setStroke(Color.rgb(122,21,1));
        vestido8.setFill(null);
        vestido8.setStrokeWidth(0.3);

        QuadCurve vestido9=new QuadCurve();
        vestido9.setStartX(25);
        vestido9.setStartY(51);
        vestido9.setControlX(26.9);
        vestido9.setControlY(51.9);
        vestido9.setEndX(27.5);
        vestido9.setEndY(54);
        vestido9.setStroke(Color.rgb(122,21,1));
        vestido9.setFill(null);
        vestido9.setStrokeWidth(0.3);

        QuadCurve vestido10=new QuadCurve();
        vestido10.setStartX(27.5);
        vestido10.setStartY(54);
        vestido10.setControlX(29.1);
        vestido10.setControlY(53.2);
        vestido10.setEndX(31.6);
        vestido10.setEndY(53.2);
        vestido10.setStroke(Color.rgb(122,21,1));
        vestido10.setFill(Color.rgb(211,157,97));
        vestido10.setStrokeWidth(0.3);

        QuadCurve vestido11=new QuadCurve();
        vestido11.setStartX(31.6);
        vestido11.setStartY(53.2);
        vestido11.setControlX(33);
        vestido11.setControlY(54.5);
        vestido11.setEndX(33.6);
        vestido11.setEndY(56.2);
        vestido11.setStroke(Color.rgb(122,21,1));
        vestido11.setFill(Color.rgb(211,157,97));
        vestido11.setStrokeWidth(0.3);

        QuadCurve vestido12=new QuadCurve();
        vestido12.setStartX(33.6);
        vestido12.setStartY(56.2);
        vestido12.setControlX(36.7);
        vestido12.setControlY(54.3);
        vestido12.setEndX(39);
        vestido12.setEndY(56.9);
        vestido12.setStroke(Color.rgb(122,21,1));
        vestido12.setFill(null);
        vestido12.setStrokeWidth(0.3);

        QuadCurve ceno1_1=new QuadCurve();
        ceno1_1.setStartX(21.3);
        ceno1_1.setStartY(51.4);
        ceno1_1.setControlX(21.3);
        ceno1_1.setControlY(57.5);
        ceno1_1.setEndX(27.6);
        ceno1_1.setEndY(56.8);
        ceno1_1.setStroke(Color.rgb(122,21,1));
        ceno1_1.setFill(null);
        ceno1_1.setStrokeWidth(0.3);

        Line linea1_1=new Line(22.9,51, 26.8,55.5);
        linea1_1.setStroke(Color.rgb(122,21,1));
        linea1_1.setStrokeWidth(0.3);

        Line linea1_2=new Line(26.8,55.5, 31,54.5);
        linea1_2.setStroke(Color.rgb(122,21,1));
        linea1_2.setStrokeWidth(0.3);

        Line linea1_3=new Line(31,54.5, 33.2,57.8);
        linea1_3.setStroke(Color.rgb(122,21,1));
        linea1_3.setStrokeWidth(0.3);

        Line linea1_4=new Line(33.2,57.8,38,56);
        linea1_4.setStroke(Color.rgb(122,21,1));
        linea1_4.setStrokeWidth(0.3);

        Polygon fondo_ttas1_1=new Polygon(20.3,51.6, 22.7,49.4, 26.1,48.3, 27.9,50.8, 29.6,51.9, 30.8,51.8, 31.3,50.9, 30.3,50.6, 30.9,50.1, 33.3,50.5, 33.3,51.6, 34.4,53.1, 36,53.5, 37.5,52.4, 38.7,54.9, 39.1,56.8, 33.5,58, 20.5,54.2);
        fondo_ttas1_1.setStroke(null);
        fondo_ttas1_1.setFill(Color.rgb(211,157,97));

        Polygon fondo_ttas1_2=new Polygon(23.4,51.3, 26.4,48.6, 27.9,50.7, 26.1,54.8);
        fondo_ttas1_2.setStroke(null);
        fondo_ttas1_2.setFill(Color.rgb(246,211,157));

        Polygon fondo_ttas1_3=new Polygon(37.3,56.3, 37.6,52.7, 38.7,54.8, 39.1,57);
        fondo_ttas1_3.setStroke(null);
        fondo_ttas1_3.setFill(Color.rgb(246,211,157));

        QuadCurve cuerpo1_1=new QuadCurve();
        cuerpo1_1.setStartX(34.4);
        cuerpo1_1.setStartY(59.5);
        cuerpo1_1.setControlX(33.7);
        cuerpo1_1.setControlY(60.6);
        cuerpo1_1.setEndX(29.1);
        cuerpo1_1.setEndY(63.2);
        cuerpo1_1.setStroke(Color.rgb(122,21,1));
        cuerpo1_1.setFill(Color.rgb(243,118,111));
        cuerpo1_1.setStrokeWidth(0.4);

        Polygon fondo_cuerpo1_1=new Polygon(19,60.8, 20.2,60.1, 19.9,52.5, 21.2,51.4, 22.9,50.8, 26.7,55.6, 31.3,54.6, 33.4,57.8, 38.2,55.9, 35.9,58.4,27.9,63.8, 27.9,66.4, 25.7,66.9);
        fondo_cuerpo1_1.setStroke(null);
        fondo_cuerpo1_1.setFill(Color.rgb(181,18,27));

        Polygon fondo_cuerpo1_2=new Polygon(19.6,61.3, 21.3,60.2, 21.6,59.4, 21.4,51.3, 22.9,50.8, 22.9,53.2, 23.3,54.6, 24.6,56.2, 27.6,56.8, 25.5,57, 23.3,56.4, 24,59.9, 21.7,63);
        fondo_cuerpo1_2.setStroke(null);
        fondo_cuerpo1_2.setFill(Color.rgb(243,118,111));

        Polygon fondo_cuerpo1_3=new Polygon(27.9,65.6, 27.8,62.8, 28.3,61.9, 32.1,60.1, 33.4,59.3, 32.4,58.7, 34.6,58.7, 35.5,58.4, 36.4,57.8, 36.8,57, 37,56.3, 38.1,55.8, 39,57, 38.3,58.3, 36,59.4, 34.3,59.5, 32,61.3, 29,63.1, 30,65.2);
        fondo_cuerpo1_3.setStroke(null);
        fondo_cuerpo1_3.setFill(Color.rgb(243,118,111));

        QuadCurve contorno1_1=new QuadCurve();
        contorno1_1.setStartX(20.6);
        contorno1_1.setStartY(61.8);
        contorno1_1.setControlX(23.4);
        contorno1_1.setControlY(59.6);
        contorno1_1.setEndX(23.1);
        contorno1_1.setEndY(59.3);
        contorno1_1.setStroke(Color.rgb(122,21,1));
        contorno1_1.setFill(null);
        contorno1_1.setStrokeWidth(0.3);

        QuadCurve contorno1_2=new QuadCurve();
        contorno1_2.setStartX(22.1);
        contorno1_2.setStartY(55.3);
        contorno1_2.setControlX(22.1);
        contorno1_2.setControlY(56.5);
        contorno1_2.setEndX(23.1);
        contorno1_2.setEndY(59.3);
        contorno1_2.setStroke(Color.rgb(122,21,1));
        contorno1_2.setFill(null);
        contorno1_2.setStrokeWidth(0.3);

        QuadCurve contorno2_1=new QuadCurve();
        contorno2_1.setStartX(28);
        contorno2_1.setStartY(65.5);
        contorno2_1.setControlX(27.6);
        contorno2_1.setControlY(61.9);
        contorno2_1.setEndX(28.6);
        contorno2_1.setEndY(61.8);
        contorno2_1.setStroke(Color.rgb(122,21,1));
        contorno2_1.setFill(null);
        contorno2_1.setStrokeWidth(0.3);

        QuadCurve contorno2_2=new QuadCurve();
        contorno2_2.setStartX(28.6);
        contorno2_2.setStartY(61.8);
        contorno2_2.setControlX(32.6);
        contorno2_2.setControlY(60.2);
        contorno2_2.setEndX(33.4);
        contorno2_2.setEndY(59.4);
        contorno2_2.setStroke(Color.rgb(122,21,1));
        contorno2_2.setFill(null);
        contorno2_2.setStrokeWidth(0.3);

        QuadCurve contorno2_3=new QuadCurve();
        contorno2_3.setStartX(29.3);
        contorno2_3.setStartY(63.3);
        contorno2_3.setControlX(30.3);
        contorno2_3.setControlY(64.7);
        contorno2_3.setEndX(30.6);
        contorno2_3.setEndY(66.8);
        contorno2_3.setStroke(Color.rgb(122,21,1));
        contorno2_3.setFill(null);
        contorno2_3.setStrokeWidth(0.5);

        QuadCurve contorno2_4=new QuadCurve();
        contorno2_4.setStartX(20);
        contorno2_4.setStartY(60.4);
        contorno2_4.setControlX(19.5);
        contorno2_4.setControlY(60.5);
        contorno2_4.setEndX(19.1);
        contorno2_4.setEndY(60.7);
        contorno2_4.setStroke(Color.rgb(122,21,1));
        contorno2_4.setFill(null);
        contorno2_4.setStrokeWidth(0.4);

        //cuerpo bajo

        Line cinturon_1=new Line(22.4,64.8, 25,63.8);
        cinturon_1.setStroke(Color.rgb(122,21,1));
        cinturon_1.setStrokeWidth(0.3);

        Line cinturon_2=new Line(25,63.8, 26.1,66.5);
        cinturon_2.setStroke(Color.rgb(122,21,1));
        cinturon_2.setStrokeWidth(0.3);

        Line cinturon_3=new Line(26.1,66.5,27,65.5);
        cinturon_3.setStroke(Color.rgb(122,21,1));
        cinturon_3.setStrokeWidth(0.3);

        QuadCurve cinturon_4=new QuadCurve();
        cinturon_4.setStartX(27);
        cinturon_4.setStartY(65.5);
        cinturon_4.setControlX(28.8);
        cinturon_4.setControlY(65.8);
        cinturon_4.setEndX(29.8);
        cinturon_4.setEndY(65.1);
        cinturon_4.setStroke(Color.rgb(122,21,1));
        cinturon_4.setFill(null);
        cinturon_4.setStrokeWidth(0.3);

        Line cinturon_5=new Line(26,68.5,27.5,67.1);
        cinturon_5.setStroke(Color.rgb(122,21,1));
        cinturon_5.setStrokeWidth(0.3);

        QuadCurve cinturon_6=new QuadCurve();
        cinturon_6.setStartX(27.5);
        cinturon_6.setStartY(67.1);
        cinturon_6.setControlX(29);
        cinturon_6.setControlY(67.4);
        cinturon_6.setEndX(30.4);
        cinturon_6.setEndY(66.8);
        cinturon_6.setStroke(Color.rgb(122,21,1));
        cinturon_6.setFill(null);
        cinturon_6.setStrokeWidth(0.3);

        Polygon fondo_cinturon1=new Polygon(23.3,64.7, 25,63.8, 26.1,66.4, 27.2,65.5, 28.5,65.5, 30,65.2, 30.5,66.7, 27.6,67.3, 25.9,68.4);
        fondo_cinturon1.setStroke(null);
        fondo_cinturon1.setFill(Color.rgb(211,157,97));

        //falda
        QuadCurve falda_1=new QuadCurve();
        falda_1.setStartX(30.6);
        falda_1.setStartY(66.8);
        falda_1.setControlX(31.6);
        falda_1.setControlY(69.3);
        falda_1.setEndX(30.9);
        falda_1.setEndY(72.1);
        falda_1.setStroke(Color.rgb(38,35,36));
        falda_1.setFill(Color.rgb(27,65,100));
        falda_1.setStrokeWidth(0.5);

        Line falda_2=new Line(26,68.5,27.5,67.1);
        falda_2.setStroke(Color.rgb(122,21,1));
        falda_2.setStrokeWidth(0.3);

        Polygon fondo_falda=new Polygon(29.4,67, 29.7,71.5, 25.2,76.3, 23.1,74.1, 22.2,76.8, 16.3,77.9, 14.5,72.5, 16.2,70.5, 13.5,70.5, 14.1,67.5, 12.8,67.2,13.2,65.3, 14,64.9, 13.6,63.6, 23.7,67.4);
        fondo_falda.setStroke(Color.rgb(38,35,36));
        fondo_falda.setFill(Color.rgb(27,65,100));
        fondo_falda.setStrokeWidth(0.4);

        Polygon fondo_falda1=new Polygon(30.19,66.9, 30.5,71.7, 28.6,71.1, 28.3,67);
        fondo_falda1.setStroke(Color.rgb(27,65,100));
        fondo_falda1.setFill(Color.rgb(27,65,100));

        Polygon fondo_falda2=new Polygon(13.2,67, 14.1,67.3, 17.2,65.2, 16.7,64.7);
        fondo_falda2.setStroke(null);
        fondo_falda2.setFill(Color.rgb(0,35,93));

        Polygon fondo_falda3=new Polygon(14.5,70.3, 16.1,70.4, 19,67.2, 18.6,66.4);
        fondo_falda3.setStroke(null);
        fondo_falda3.setFill(Color.rgb(0,35,93));

        Polygon fondo_falda4=new Polygon(23.3,74.1, 24,71.3, 24.5,71.7, 23.7,74.5);
        fondo_falda4.setStroke(null);
        fondo_falda4.setFill(Color.rgb(0,35,93));

        Polygon fondo_falda5=new Polygon(27.9,67.2, 28.4,67.1, 28.6,70, 27.9,69.6);
        fondo_falda5.setStroke(null);
        fondo_falda5.setFill(Color.rgb(0,35,93));




        Line falda_3=new Line(27.8, 67.1, 27.8,69.7);
        falda_3.setStroke(Color.rgb(38,35,36));
        falda_3.setStrokeWidth(0.3);

        Line falda_4=new Line(24.5,70.3, 23.1,74.1);
        falda_4.setStroke(Color.rgb(38,35,36));
        falda_4.setStrokeWidth(0.3);

        Line falda_5=new Line(19.7,66.8, 16.1,70.6);
        falda_5.setStroke(Color.rgb(38,35,36));
        falda_5.setStrokeWidth(0.3);

        Line falda_6=new Line(17.8,64.8, 14.1,67.4);
        falda_6.setStroke(Color.rgb(38,35,36));
        falda_6.setStrokeWidth(0.3);

        Line falda_7=new Line(14.1,64.8, 15.4,64);
        falda_7.setStroke(Color.rgb(38,35,36));
        falda_7.setStrokeWidth(0.3);


        //mano2

        QuadCurve mano2_1=new QuadCurve();
        mano2_1.setStartX(41.5);
        mano2_1.setStartY(81.5);
        mano2_1.setControlX(42.2);
        mano2_1.setControlY(75.6);
        mano2_1.setEndX(41.2);
        mano2_1.setEndY(71.1);
        mano2_1.setStroke(Color.rgb(92,112,124));
        mano2_1.setFill(null);
        mano2_1.setStrokeWidth(0.3);

        QuadCurve mano2_2=new QuadCurve();
        mano2_2.setStartX(41.2);
        mano2_2.setStartY(71.1);
        mano2_2.setControlX(43.3);
        mano2_2.setControlY(66.7);
        mano2_2.setEndX(48.1);
        mano2_2.setEndY(64.5);
        mano2_2.setStroke(Color.rgb(92,112,124));
        mano2_2.setFill(null);
        mano2_2.setStrokeWidth(0.4);

        QuadCurve mano2_3=new QuadCurve();
        mano2_3.setStartX(48.1);
        mano2_3.setStartY(64.5);
        mano2_3.setControlX(48.1);
        mano2_3.setControlY(70.1);
        mano2_3.setEndX(44.7);
        mano2_3.setEndY(77.6);
        mano2_3.setStroke(Color.rgb(92,112,124));
        mano2_3.setFill(Color.rgb(174,185,191));
        mano2_3.setStrokeWidth(0.3);

        QuadCurve mano2_4=new QuadCurve();
        mano2_4.setStartX(44.7);
        mano2_4.setStartY(77.6);
        mano2_4.setControlX(43.7);
        mano2_4.setControlY(79.8);
        mano2_4.setEndX(43.4);
        mano2_4.setEndY(82.3);
        mano2_4.setStroke(Color.rgb(92,112,124));
        mano2_4.setFill(null);
        mano2_4.setStrokeWidth(0.3);

        QuadCurve mano2_5=new QuadCurve();
        mano2_5.setStartX(43.4);
        mano2_5.setStartY(82.3);
        mano2_5.setControlX(42.7);
        mano2_5.setControlY(81.4);
        mano2_5.setEndX(41.5);
        mano2_5.setEndY(81.5);
        mano2_5.setStroke(Color.rgb(92,112,124));
        mano2_5.setFill(Color.rgb(249,181,166));
        mano2_5.setStrokeWidth(0.3);

        QuadCurve mano2_6=new QuadCurve();
        mano2_6.setStartX(41.7);
        mano2_6.setStartY(77.3);
        mano2_6.setControlX(43.5);
        mano2_6.setControlY(76.8);
        mano2_6.setEndX(44.4);
        mano2_6.setEndY(77.9);
        mano2_6.setStroke(Color.rgb(92,112,124));
        mano2_6.setFill(null);
        mano2_6.setStrokeWidth(0.2);

        QuadCurve mano2_7=new QuadCurve();
        mano2_7.setStartX(41.6);
        mano2_7.setStartY(73.4);
        mano2_7.setControlX(44);
        mano2_7.setControlY(71.6);
        mano2_7.setEndX(46.2);
        mano2_7.setEndY(73.4);
        mano2_7.setStroke(Color.rgb(92,112,124));
        mano2_7.setFill(null);
        mano2_7.setStrokeWidth(0.2);

        Polygon fondo_mano2_1=new Polygon(41.7,81.4, 41.2,71.2, 43.8,67.5, 46.3,65.5, 48,64.5, 47.8,66.7, 46.9,71.3, 44.4,78.2, 43.3,82.2, 42.7,81.5);
        fondo_mano2_1.setStroke(null);
        fondo_mano2_1.setFill(Color.rgb(174,185,191));

        Polygon fondo_mano2_2=new Polygon(41.9,81.4, 42.3,80, 42.4,73.6, 42,70.2, 43.5,68.1, 46.1,65.7, 43,81.8);
        fondo_mano2_2.setStroke(null);
        fondo_mano2_2.setFill(Color.rgb(238,241,243));


        QuadCurve puño2_1=new QuadCurve();
        puño2_1.setStartX(40.4);
        puño2_1.setStartY(82.2);
        puño2_1.setControlX(40.5);
        puño2_1.setControlY(81.5);
        puño2_1.setEndX(41.7);
        puño2_1.setEndY(81.5);
        puño2_1.setStroke(Color.rgb(112,21,1));
        puño2_1.setFill(Color.rgb(249, 181, 166));
        puño2_1.setStrokeWidth(0.4);

        Line puño2_2=new Line(43.2,82.1, 42.9,87.1);
        puño2_2.setStroke(Color.rgb(112,21,1));
        puño2_2.setStrokeWidth(0.4);
        puño2_2.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve puño2_3=new QuadCurve();
        puño2_3.setStartX(42.9);
        puño2_3.setStartY(87.1);
        puño2_3.setControlX(41.5);
        puño2_3.setControlY(88.2);
        puño2_3.setEndX(40.6);
        puño2_3.setEndY(88.1);
        puño2_3.setStroke(Color.rgb(112,21,1));
        puño2_3.setFill(Color.rgb(249, 181, 166));
        puño2_3.setStrokeWidth(0.4);

        Line puño2_4=new Line(40.4,88.1, 38.8,86.6);
        puño2_4.setStroke(Color.rgb(112,21,1));
        puño2_4.setStrokeWidth(0.4);
        puño2_4.setStrokeLineCap(StrokeLineCap.ROUND);

        QuadCurve puño2_5=new QuadCurve();
        puño2_5.setStartX(42.9);
        puño2_5.setStartY(86.6);
        puño2_5.setControlX(40.5);
        puño2_5.setControlY(85.2);
        puño2_5.setEndX(40.7);
        puño2_5.setEndY(84.5);
        puño2_5.setStroke(Color.rgb(112,21,1));
        puño2_5.setFill(Color.rgb(249, 181, 166));
        puño2_5.setStrokeWidth(0.3);
        puño2_5.setStrokeLineCap(StrokeLineCap.ROUND);

        Line puño2_6=new Line(40.7,84.5,40.4,82.2);
        puño2_6.setStroke(Color.rgb(112,21,1));
        puño2_6.setStrokeWidth(0.3);
        puño2_6.setStrokeLineCap(StrokeLineCap.ROUND);

        Line puño2_7=new Line(39.1,86.5, 40.7,85.8);
        puño2_7.setStroke(Color.rgb(112,21,1));
        puño2_7.setStrokeWidth(0.3);

        Line puño2_8=new Line(39.5,87.3, 41.3,86.5);
        puño2_8.setStroke(Color.rgb(112,21,1));
        puño2_8.setStrokeWidth(0.3);

        Line puño2_9=new Line(40.0,87.8, 41.9,86.9);
        puño2_9.setStroke(Color.rgb(112,21,1));
        puño2_9.setStrokeWidth(0.3);

        Polygon fondo_mano2_3=new Polygon(38.6,86.4, 40.3,82, 41.9,81.3, 43.4,82, 42.9,87.2, 42.2,87.6, 40.2,88.1);
        fondo_mano2_3.setStroke(null);
        fondo_mano2_3.setFill(Color.rgb(249,181,166));


        Ellipse empuñadura1=new Ellipse();
        empuñadura1.setCenterX(44.9);
        empuñadura1.setCenterY(88.4);
        empuñadura1.setRadiusX(0.6);
        empuñadura1.setRadiusY(0.9);
        empuñadura1.setStroke(Color.rgb(90,42,4));
        empuñadura1.setStrokeWidth(0.3);
        empuñadura1.setFill(Color.rgb(181,18,27));

        Ellipse empuñadura2=new Ellipse();
        empuñadura2.setCenterX(44.8);
        empuñadura2.setCenterY(88.3);
        empuñadura2.setRadiusX(1.3);
        empuñadura2.setRadiusY(1.8);
        empuñadura2.setStroke(Color.rgb(90,42,4));
        empuñadura2.setStrokeWidth(0.5);
        empuñadura2.setFill(Color.rgb(249,181,161));

        QuadCurve empuñadura3=new QuadCurve();
        empuñadura3.setStartX(42.8);
        empuñadura3.setStartY(85.8);
        empuñadura3.setControlX(44.5);
        empuñadura3.setControlY(87);
        empuñadura3.setEndX(45.0);
        empuñadura3.setEndY(86.5);
        empuñadura3.setStroke(Color.rgb(90,42,4));
        empuñadura3.setFill(null);
        empuñadura3.setStrokeWidth(0.5);

        QuadCurve empuñadura4=new QuadCurve();
        empuñadura4.setStartX(42.6);
        empuñadura4.setStartY(87.1);
        empuñadura4.setControlX(43.7);
        empuñadura4.setControlY(88.1);
        empuñadura4.setEndX(43.6);
        empuñadura4.setEndY(89);
        empuñadura4.setStroke(Color.rgb(90,42,4));
        empuñadura4.setFill(null);
        empuñadura4.setStrokeWidth(0.5);

        Polygon fondo_empuñadura=new Polygon(42.7,87.2, 43.4,88.1, 44.1,86.8, 43.2,86.1);
        fondo_empuñadura.setStroke(null);
        fondo_empuñadura.setFill(Color.rgb(17,24,31));

        Polygon union1=new Polygon(35.6,88.6, 38.8,88, 41.4,78.9, 39.7,76.1, 39,76, 38.6,77, 39.2,79.5, 37.1,86.1, 35.3,87.1);
        union1.setStroke(Color.rgb(103,59,25));
        union1.setFill(Color.rgb(183,119,94));
        union1.setStrokeWidth(0.5);

        Line union2=new Line(35.6,88.5, 35.9,87.6);
        union2.setStroke(Color.rgb(103,59,25));
        union2.setStrokeWidth(0.3);

        Line union3=new Line(35.9,87.6, 35.4,87);
        union3.setStroke(Color.rgb(103,59,25));
        union3.setStrokeWidth(0.3);

        Line union4=new Line(35.9,87.6, 38.3,86.9);
        union4.setStroke(Color.rgb(103,59,25));
        union4.setStrokeWidth(0.3);

        Line union5=new Line(38.3,86.9, 37.2,86.2);
        union5.setStroke(Color.rgb(103,59,25));
        union5.setStrokeWidth(0.3);

        Line union6=new Line(38.3,86.9, 40.4,79.6);
        union6.setStroke(Color.rgb(103,59,25));
        union6.setStrokeWidth(0.3);

        Line union7=new Line(40.4,79.6, 39.1,79.4);
        union7.setStroke(Color.rgb(103,59,25));
        union7.setStrokeWidth(0.3);

        Line union8=new Line(40.4,79.6, 39.4,77);
        union8.setStroke(Color.rgb(103,59,25));
        union8.setStrokeWidth(0.3);

        Line union9=new Line(39.4,77, 38.6,77 );
        union9.setStroke(Color.rgb(103,59,25));
        union9.setStrokeWidth(0.3);

        Line union10=new Line(39.4,77, 39.7,76.2);
        union10.setStroke(Color.rgb(103,59,25));
        union10.setStrokeWidth(0.3);

        QuadCurve espada1=new QuadCurve();
        espada1.setStartX(4.2);
        espada1.setStartY(48.8);
        espada1.setControlX(17.2);
        espada1.setControlY(52.1);
        espada1.setEndX(18.7);
        espada1.setEndY(59.2);
        espada1.setStroke(Color.rgb(114,120,128));
        espada1.setFill(Color.rgb(149, 161, 170));
        espada1.setStrokeWidth(0.5);

        QuadCurve espada2=new QuadCurve();
        espada2.setStartX(18.7);
        espada2.setStartY(59.2);
        espada2.setControlX(19.5);
        espada2.setControlY(61.6);
        espada2.setEndX(24.2);
        espada2.setEndY(63.2);
        espada2.setStroke(Color.rgb(114,120,128));
        espada2.setFill(null);
        espada2.setStrokeWidth(0.5);

        QuadCurve espada3=new QuadCurve();
        espada3.setStartX(24.2);
        espada3.setStartY(63.2);
        espada3.setControlX(27.2);
        espada3.setControlY(70.4);
        espada3.setEndX(33.5);
        espada3.setEndY(73);
        espada3.setStroke(Color.rgb(114,120,128));
        espada3.setFill(null);
        espada3.setStrokeWidth(0.5);

        QuadCurve espada4=new QuadCurve();
        espada4.setStartX(33.5);
        espada4.setStartY(73);
        espada4.setControlX(36);
        espada4.setControlY(78.5);
        espada4.setEndX(39.6);
        espada4.setEndY(80.1);
        espada4.setStroke(Color.rgb(114,120,128));
        espada4.setFill(null);
        espada4.setStrokeWidth(0.5);

        Line espada5=new Line(39.6,80.1, 37.8,85.8);
        espada5.setStroke(Color.rgb(114,120,128));
        espada5.setStrokeWidth(0.4);

        Line espada6=new Line(4.4,49.2, 35.9,79.7);
        espada6.setStroke(Color.rgb(200,201,203));
        espada6.setStrokeWidth(0.3);

        QuadCurve espada7=new QuadCurve();
        espada7.setStartX(4.2);
        espada7.setStartY(48.8);
        espada7.setControlX(7.3);
        espada7.setControlY(61);
        espada7.setEndX(16.9);
        espada7.setEndY(65.4);
        espada7.setStroke(Color.rgb(92,112,124));
        espada7.setFill(Color.rgb(92,112,124));
        espada7.setStrokeWidth(0.5);

        QuadCurve espada8=new QuadCurve();
        espada8.setStartX(16.9);
        espada8.setStartY(65.4);
        espada8.setControlX(19.5);
        espada8.setControlY(66.9);
        espada8.setEndX(20.3);
        espada8.setEndY(70.8);
        espada8.setStroke(Color.rgb(92,112,124));
        espada8.setFill(null);
        espada8.setStrokeWidth(0.5);

        QuadCurve espada9=new QuadCurve();
        espada9.setStartX(20.3);
        espada9.setStartY(70.8);
        espada9.setControlX(28.1);
        espada9.setControlY(73);
        espada9.setEndX(30.4);
        espada9.setEndY(80.5);
        espada9.setStroke(Color.rgb(92,112,124));
        espada9.setFill(null);
        espada9.setStrokeWidth(0.6);

        QuadCurve espada10=new QuadCurve();
        espada10.setStartX(30.4);
        espada10.setStartY(80.5);
        espada10.setControlX(35.5);
        espada10.setControlY(81.4);
        espada10.setEndX(37.8);
        espada10.setEndY(85.8);
        espada10.setStroke(Color.rgb(92,112,124));
        espada10.setFill(Color.rgb(255,255,255));
        espada10.setStrokeWidth(0.6);

        Polygon fondo_espada=new Polygon(4.2,48.9, 38.7,83.7, 39.8,80.4, 38.6,79.8, 36.9,78.4, 34.9,75.8, 33.5,73, 30.5,71.6, 28.1,69.7, 25.5,66.4, 24.1,63.2, 22.7,62.8, 19.9,61.1, 14.8,53.4);
        fondo_espada.setStroke(null);
        fondo_espada.setFill(Color.rgb(149,161,170));

        Polygon fondo_espada2=new Polygon(4.2,48.9, 38.7,82.7, 37.6,85.7, 35.1,81.9, 30.4,80.4, 28.7,76, 25.2,72.6, 21.8,70.9, 20.4,70.7, 19.1,67.5, 17.5,65.6, 10.8,61.1);
        fondo_espada2.setStroke(Color.rgb(92,112,124));
        fondo_espada2.setFill(Color.rgb(92,112,124));
        fondo_espada2.setStrokeWidth(0.32);

        Line espada11=new Line(35.9,79.7, 39,80.1);
        espada11.setStroke(Color.rgb(200,201,203));
        espada11.setStrokeWidth(0.3);

        Line espada12=new Line(35.9,79.7,37.5,84.4);
        espada12.setStroke(Color.rgb(200,201,203));
        espada12.setStrokeWidth(0.3);

        Polygon fondo_espada3=new Polygon(10.8,51.4, 13.6,52.8, 15.3,59.6, 11.8,56.2);
        fondo_espada3.setStroke(null);
        fondo_espada3.setFill(Color.rgb(238,241,243));
        fondo_espada3.setStrokeWidth(0.32);

        Polygon fondo_espada4=new Polygon(18.4,59.1, 20.2,61.5, 20.7,64.9, 19.1,63.4);
        fondo_espada4.setStroke(null);
        fondo_espada4.setFill(Color.rgb(238,241,243));
        fondo_espada4.setStrokeWidth(0.32);

        //Piernas
        QuadCurve pierna1_1=new QuadCurve();
        pierna1_1.setStartX(14.2);
        pierna1_1.setStartY(63.5);
        pierna1_1.setControlX(9.9);
        pierna1_1.setControlY(66.9);
        pierna1_1.setEndX(8.8);
        pierna1_1.setEndY(74.9);
        pierna1_1.setStroke(Color.rgb(122,21,1));
        pierna1_1.setFill(Color.rgb(212,148,138));
        pierna1_1.setStrokeWidth(0.4);

        QuadCurve pierna1_2=new QuadCurve();
        pierna1_2.setStartX(8.8);
        pierna1_2.setStartY(74.9);
        pierna1_2.setControlX(8.1);
        pierna1_2.setControlY(78.8);
        pierna1_2.setEndX(9.1);
        pierna1_2.setEndY(82.6);
        pierna1_2.setStroke(Color.rgb(122,21,1));
        pierna1_2.setFill(Color.rgb(181,18,27));
        pierna1_2.setStrokeWidth(0.4);

        QuadCurve pierna1_3=new QuadCurve();
        pierna1_3.setStartX(9.1);
        pierna1_3.setStartY(82.6);
        pierna1_3.setControlX(10.2);
        pierna1_3.setControlY(83.8);
        pierna1_3.setEndX(11.6);
        pierna1_3.setEndY(83.1);
        pierna1_3.setStroke(Color.rgb(122,21,1));
        pierna1_3.setFill(null);
        pierna1_3.setStrokeWidth(0.4);

        QuadCurve pierna1_4=new QuadCurve();
        pierna1_4.setStartX(11.6);
        pierna1_4.setStartY(83.1);
        pierna1_4.setControlX(14.6);
        pierna1_4.setControlY(79.1);
        pierna1_4.setEndX(16);
        pierna1_4.setEndY(75.9);
        pierna1_4.setStroke(Color.rgb(122,21,1));
        pierna1_4.setFill(null);
        pierna1_4.setStrokeWidth(0.4);

        Polygon bota1_1=new Polygon(8.6,77.2, 8.7,74.9, 12.1,71.7, 14.5,78.6, 13.7,79.8, 11.3,74.6);
        bota1_1.setStroke(Color.rgb(106,116,124));
        bota1_1.setFill(Color.rgb(174,185,191));
        bota1_1.setStrokeWidth(0.3);

        Line bota1_2=new Line(8.5,77.2, 8.9,74.9);
        bota1_2.setStroke(Color.rgb(106,116,124));
        bota1_2.setStrokeWidth(0.43);

        Line bota1_3=new Line(14.5,78.8, 13.9,79.6);
        bota1_3.setStroke(Color.rgb(106,116,124));
        bota1_3.setStrokeWidth(0.43);

        Polygon fondo_bota1=new Polygon(8.6,77.2, 11.3,74.6, 13.7,79.8, 11.6,83.2, 10.5,83.3, 9,82.5, 8.7,80.3);
        fondo_bota1.setStroke(Color.rgb(181,18,27));
        fondo_bota1.setFill(Color.rgb(181,18,27));
        fondo_bota1.setStrokeWidth(0.3);

        Polygon fondo_pierna1=new Polygon(8.7,74.9, 12.1,71.7, 14.5,78.6, 18.9,71.2, 13.8,63.6, 10.1,69.5);
        fondo_pierna1.setStroke(Color.rgb(249,181,166));
        fondo_pierna1.setFill(Color.rgb(249,181,166));
        fondo_pierna1.setStrokeWidth(0.3);

        Polygon fondo_bota2=new Polygon(9.9,75.2, 11.4,74.3, 11,83.3, 9.8,83.1);
        fondo_bota2.setStroke(Color.rgb(243,118,111));
        fondo_bota2.setFill(Color.rgb(243,118,111));
        fondo_bota2.setStrokeWidth(0.3);

        Polygon fondo_bota3=new Polygon(9.9,73.9, 11.5,72.4, 11.3,74.4, 9.9, 75.5);
        fondo_bota3.setStroke(null);
        fondo_bota3.setFill(Color.rgb(238,241,243));
        fondo_bota3.setStrokeWidth(0.3);

        Polygon fondo_pierna2=new Polygon(14.6,63.6, 9.8,75.7, 8.8,74.4, 10.3,68.8, 14,63.3);
        fondo_pierna2.setStroke(Color.rgb(212,148,138));
        fondo_pierna2.setFill(Color.rgb(212,148,138));
        fondo_pierna2.setStrokeWidth(0.3);

        QuadCurve fondo_pierna3=new QuadCurve();
        fondo_pierna3.setStartX(14.1);
        fondo_pierna3.setStartY(66.3);
        fondo_pierna3.setControlX(11.8);
        fondo_pierna3.setControlY(69);
        fondo_pierna3.setEndX(10.9);
        fondo_pierna3.setEndY(73);
        fondo_pierna3.setStroke(null);
        fondo_pierna3.setFill(Color.rgb(249,181,166));
        fondo_pierna3.setStrokeWidth(0.4);

        //pierna2

        QuadCurve pierna2_1=new QuadCurve();
        pierna2_1.setStartX(18.6);
        pierna2_1.setStartY(77.4);
        pierna2_1.setControlX(14.1);
        pierna2_1.setControlY(86.6);
        pierna2_1.setEndX(10.5);
        pierna2_1.setEndY(89.4);
        pierna2_1.setStroke(Color.rgb(122,21,1));
        pierna2_1.setFill(null);
        pierna2_1.setStrokeWidth(0.4);

        QuadCurve pierna2_2=new QuadCurve();
        pierna2_2.setStartX(10.5);
        pierna2_2.setStartY(89.4);
        pierna2_2.setControlX(7.7);
        pierna2_2.setControlY(91.1);
        pierna2_2.setEndX(7);
        pierna2_2.setEndY(94.1);
        pierna2_2.setStroke(Color.rgb(122,21,1));
        pierna2_2.setFill(Color.rgb(181,18,27));
        pierna2_2.setStrokeWidth(0.4);

        QuadCurve pierna2_3=new QuadCurve();
        pierna2_3.setStartX(7);
        pierna2_3.setStartY(94.1);
        pierna2_3.setControlX(2.7);
        pierna2_3.setControlY(102.9);
        pierna2_3.setEndX(0.2);
        pierna2_3.setEndY(106.6);
        pierna2_3.setStroke(Color.rgb(122,21,1));
        pierna2_3.setFill(null);
        pierna2_3.setStrokeWidth(0.4);

        QuadCurve pierna2_4=new QuadCurve();
        pierna2_4.setStartX(29.5);
        pierna2_4.setStartY(76.7);
        pierna2_4.setControlX(24.6);
        pierna2_4.setControlY(83.9);
        pierna2_4.setEndX(16.5);
        pierna2_4.setEndY(89.8);
        pierna2_4.setStroke(Color.rgb(122,21,1));
        pierna2_4.setFill(null);
        pierna2_4.setStrokeWidth(0.4);

        QuadCurve pierna2_5=new QuadCurve();
        pierna2_5.setStartX(16.5);
        pierna2_5.setStartY(89.8);
        pierna2_5.setControlX(16.1);
        pierna2_5.setControlY(94.5);
        pierna2_5.setEndX(3.2);
        pierna2_5.setEndY(106.5);
        pierna2_5.setStroke(Color.rgb(122,21,1));
        pierna2_5.setFill(null);
        pierna2_5.setStrokeWidth(0.4);

        Polygon fondo_pierna2_1=new Polygon(15.9,82.4, 16.8,80.7, 22.9,79, 22,85.2, 20.2,86.8, 20.7,81.6);
        fondo_pierna2_1.setStroke(Color.rgb(107,116,124));
        fondo_pierna2_1.setFill(Color.rgb(174,185,191));
        fondo_pierna2_1.setStrokeWidth(0.2);

        Line bota2_1=new Line(15.9,82.4, 16.8,80.7);
        bota2_1.setStroke(Color.rgb(106,116,124));
        bota2_1.setStrokeWidth(0.3);

        Line bota2_2=new Line(22,85.2, 20.3,86.8);
        bota2_2.setStroke(Color.rgb(106,116,124));
        bota2_2.setStrokeWidth(0.3);

        Polygon fondo_pierna2_2=new Polygon(16.8,80.7, 22.9,79, 22,85.2, 27.8,79.2, 31.4,72.6, 21.8,71.1);
        fondo_pierna2_2.setStroke(Color.rgb(249,181,166));
        fondo_pierna2_2.setFill(Color.rgb(249,181,166));
        fondo_pierna2_2.setStrokeWidth(0.2);

        Polygon fondo_pierna2_3=new Polygon(16.8,80.7, 21.8,71, 29.7,73.5, 20.6,78.2, 20.2,79.9);
        fondo_pierna2_3.setStroke(null);
        fondo_pierna2_3.setFill(Color.rgb(212,148,138));

        Polygon fondo_pierna2_4=new Polygon(16.1,82.3, 20.7,81.6, 20.2,86.9, 16.5,89.8, 14.9,94.1, 13.2,96.5, 3.2,106.6, 0.2,106.5, 2.2,103.5, 5.5,97, 8.3,91.6, 12.1,87.9, 13.8,85.6);
        fondo_pierna2_4.setStroke(null);
        fondo_pierna2_4.setFill(Color.rgb(181,18,27));

        Polygon fondo_pierna2_5=new Polygon(1.6,106.6, 12.3,95.2, 13.3,91.7, 12.5,92, 13.4,89.5, 21,82.9, 20.6,85.9, 15.2,90.4, 13.5,95.2, 2.4,106.5);
        fondo_pierna2_5.setStroke(null);
        fondo_pierna2_5.setFill(Color.rgb(243,118,111));

        QuadCurve pierna2_6=new QuadCurve();
        pierna2_6.setStartX(13.2);
        pierna2_6.setStartY(88.7);
        pierna2_6.setControlX(12.2);
        pierna2_6.setControlY(89.9);
        pierna2_6.setEndX(12.4);
        pierna2_6.setEndY(92);
        pierna2_6.setStroke(Color.rgb(122,21,1));
        pierna2_6.setFill(null);
        pierna2_6.setStrokeWidth(0.2);

        QuadCurve pierna2_7=new QuadCurve();
        pierna2_7.setStartX(15.2);
        pierna2_7.setStartY(90.3);
        pierna2_7.setControlX(14.3);
        pierna2_7.setControlY(91.4);
        pierna2_7.setEndX(12.4);
        pierna2_7.setEndY(92);
        pierna2_7.setStroke(Color.rgb(122,21,1));
        pierna2_7.setFill(null);
        pierna2_7.setStrokeWidth(0.2);

        Polygon fondo_pierna2_6=new Polygon(20.8,83, 22.45,81.6, 22,84.5, 20.6,85.8);
        fondo_pierna2_6.setStroke(null);
        fondo_pierna2_6.setFill(Color.rgb(238,241,243));

        //soga

        QuadCurve soga1=new QuadCurve();
        soga1.setStartX(11.2);
        soga1.setStartY(61.2);
        soga1.setControlX(5.8);
        soga1.setControlY(64);
        soga1.setEndX(3.5);
        soga1.setEndY(66.7);
        soga1.setStroke(Color.rgb(122,21,1));
        soga1.setFill(Color.rgb(246,211,157));
        soga1.setStrokeWidth(0.4);

        QuadCurve soga2=new QuadCurve();
        soga2.setStartX(0.5);
        soga2.setStartY(72.8);
        soga2.setControlX(0.7);
        soga2.setControlY(69.7);
        soga2.setEndX(3.5);
        soga2.setEndY(66.7);
        soga2.setStroke(Color.rgb(122,21,1));
        soga2.setFill(null);
        soga2.setStrokeWidth(0.4);

        QuadCurve soga3=new QuadCurve();
        soga3.setStartX(0.5);
        soga3.setStartY(72.8);
        soga3.setControlX(4.2);
        soga3.setControlY(72.8);
        soga3.setEndX(9.8);
        soga3.setEndY(69.8);
        soga3.setStroke(Color.rgb(122,21,1));
        soga3.setFill(null);
        soga3.setStrokeWidth(0.4);

        QuadCurve soga4=new QuadCurve();
        soga4.setStartX(2.9);
        soga4.setStartY(71.3);
        soga4.setControlX(5);
        soga4.setControlY(71.9);
        soga4.setEndX(6.8);
        soga4.setEndY(71.2);
        soga4.setStroke(Color.rgb(122,21,1));
        soga4.setFill(null);
        soga4.setStrokeWidth(0.4);

        QuadCurve soga5=new QuadCurve();
        soga5.setStartX(2.9);
        soga5.setStartY(71.3);
        soga5.setControlX(4);
        soga5.setControlY(68);
        soga5.setEndX(11.8);
        soga5.setEndY(62.6);
        soga5.setStroke(Color.rgb(122,21,1));
        soga5.setFill(null);
        soga5.setStrokeWidth(0.4);

        QuadCurve soga6=new QuadCurve();
        soga6.setStartX(5.5);
        soga6.setStartY(70.2);
        soga6.setControlX(8.1);
        soga6.setControlY(69.9);
        soga6.setEndX(10.5);
        soga6.setEndY(68.5);
        soga6.setStroke(Color.rgb(122,21,1));
        soga6.setFill(null);
        soga6.setStrokeWidth(0.3);

        QuadCurve soga7=new QuadCurve();
        soga7.setStartX(5.5);
        soga7.setStartY(70.2);
        soga7.setControlX(7.2);
        soga7.setControlY(66.5);
        soga7.setEndX(13.8);
        soga7.setEndY(63.6);
        soga7.setStroke(Color.rgb(122,21,1));
        soga7.setFill(null);
        soga7.setStrokeWidth(0.3);

        QuadCurve soga8=new QuadCurve();
        soga8.setStartX(6.4);
        soga8.setStartY(69);
        soga8.setControlX(8.6);
        soga8.setControlY(68.8);
        soga8.setEndX(10.9);
        soga8.setEndY(67.4);
        soga8.setStroke(Color.rgb(122,21,1));
        soga8.setFill(null);
        soga8.setStrokeWidth(0.4);

        QuadCurve soga9=new QuadCurve();
        soga9.setStartX(6.4);
        soga9.setStartY(69);
        soga9.setControlX(7.9);
        soga9.setControlY(67);
        soga9.setEndX(12.2);
        soga9.setEndY(65.3);
        soga9.setStroke(Color.rgb(122,21,1));
        soga9.setFill(null);
        soga9.setStrokeWidth(0.4);

        Polygon fondo_soga1=new Polygon(12.1,60.3, 15.2,63.4, 7.8,67.5, 6.3,69, 7.8,68.7, 11.1,67.5, 9.5,70.1, 3.9,72.5, 0.5,72.8, 0.9,70.5, 3.6,66.5, 6.8,63.7);
        fondo_soga1.setStroke(null);
        fondo_soga1.setFill(Color.rgb(211,157,97));

        QuadCurve lsoga1=new QuadCurve(8.4,62.7, 7.9,64.2, 8.6,64.8);
        lsoga1.setStroke(Color.rgb(122,21,1));
        lsoga1.setFill(null);
        lsoga1.setStrokeWidth(0.3);

        QuadCurve lsoga2=new QuadCurve(5.9,64.5, 5.5,66.5, 6.3,66.8);
        lsoga2.setStroke(Color.rgb(122,21,1));
        lsoga2.setFill(null);
        lsoga2.setStrokeWidth(0.3);

        QuadCurve lsoga3=new QuadCurve(3.5,66.8, 3.4,68.7, 4.2,69);
        lsoga3.setStroke(Color.rgb(122,21,1));
        lsoga3.setFill(null);
        lsoga3.setStrokeWidth(0.3);

        QuadCurve lsoga4=new QuadCurve(1.4,69.9, 1.7,71.3, 2.6,71.6);
        lsoga4.setStroke(Color.rgb(122,21,1));
        lsoga4.setFill(null);
        lsoga4.setStrokeWidth(0.3);

        QuadCurve lsoga5=new QuadCurve(0.5,72, 1.5,72.4,2.5,72.2);
        lsoga5.setStroke(Color.rgb(122,21,1));
        lsoga5.setFill(null);
        lsoga5.setStrokeWidth(0.2);

        QuadCurve lsoga6=new QuadCurve(3.8,71.5, 4.1,72, 3.7,72.5);
        lsoga6.setStroke(Color.rgb(122,21,1));
        lsoga6.setFill(null);
        lsoga6.setStrokeWidth(0.2);

        QuadCurve lsoga7=new QuadCurve(5.1,68, 5.2,69.2, 5.9,69.5);
        lsoga7.setStroke(Color.rgb(122,21,1));
        lsoga7.setFill(null);
        lsoga7.setStrokeWidth(0.3);

        QuadCurve lsoga8=new QuadCurve(7.1,66, 6.9,67.3, 7.5,67.5);
        lsoga8.setStroke(Color.rgb(122,21,1));
        lsoga8.setFill(null);
        lsoga8.setStrokeWidth(0.3);

        QuadCurve lsoga9=new QuadCurve(9.5,64.3, 9.1,65.3, 9.7,65.8);
        lsoga9.setStroke(Color.rgb(122,21,1));
        lsoga9.setFill(null);
        lsoga9.setStrokeWidth(0.3);

        QuadCurve lsoga10=new QuadCurve(12.2,62.5, 11.7,63.5, 12.1,64.4);
        lsoga10.setStroke(Color.rgb(122,21,1));
        lsoga10.setFill(null);
        lsoga10.setStrokeWidth(0.3);

        QuadCurve lsoga11=new QuadCurve(6.9,69, 7.5,69.2, 7.4,69.8);
        lsoga11.setStroke(Color.rgb(122,21,1));
        lsoga11.setFill(null);
        lsoga11.setStrokeWidth(0.25);

        QuadCurve lsoga12=new QuadCurve(8.5,68.5, 9,68.7, 8.9,69.2);
        lsoga12.setStroke(Color.rgb(122,21,1));
        lsoga12.setFill(null);
        lsoga12.setStrokeWidth(0.2);

        QuadCurve lsoga13=new QuadCurve(9.7,68.1, 10.1,68.2, 10.1,68.6);
        lsoga13.setStroke(Color.rgb(122,21,1));
        lsoga13.setFill(null);
        lsoga13.setStrokeWidth(0.2);

        QuadCurve lsoga14=new QuadCurve(6.6,70, 7.4,70.4, 7,71.3);
        lsoga14.setStroke(Color.rgb(122,21,1));
        lsoga14.setFill(null);
        lsoga14.setStrokeWidth(0.25);

        QuadCurve lsoga15=new QuadCurve(8.3,69.5, 8.9,69.8, 8.7,70.5);
        lsoga15.setStroke(Color.rgb(122,21,1));
        lsoga15.setFill(null);
        lsoga15.setStrokeWidth(0.2);

        QuadCurve lsoga16=new QuadCurve(9.6,68.9, 9.9,69.1, 10.1,69.5);
        lsoga16.setStroke(Color.rgb(122,21,1));
        lsoga16.setFill(null);
        lsoga16.setStrokeWidth(0.2);

        Polygon fsoga=new Polygon(2.5,67.6, 3.1,69, 11.8,62.4, 10.4,61.5, 5.8,64.4);
        fsoga.setStroke(null);
        fsoga.setFill(Color.rgb(246,211,157));

        Text titulo= new Text(24.5,99,"Mujer Maravilla DC\nBy : Segundo Paladines");

        titulo.setFont(Font.loadFont(this.getClass().getResourceAsStream("/fonts/zen_Dots/The Rickon.ttf"),4.4));
        titulo.setFill(Color.rgb(127,127,127));
        titulo.setStroke(Color.rgb(104,4,19));
        titulo.setStrokeWidth(0.2);

        //anadir soga
        grupo_maravilla.getChildren().addAll(fondo_soga1,fsoga,soga1,soga2,soga3,soga4,soga5,soga6,soga7,soga8,soga9,lsoga1,lsoga2,lsoga3,lsoga4,lsoga5,lsoga6,lsoga7,lsoga8,lsoga9,lsoga10,lsoga11,lsoga12,lsoga13,lsoga14,lsoga15,lsoga16);
        //añadir cabello
        grupo_maravilla.getChildren().addAll(punto_control,color_cabello1,color_cabello2,cabello_1,cabello_2,cabello_3,cabello_4,cabello_5,cabello_6,cabello_7,cabello_8,cabello_9,cabello_10,cabello_11,cabello_12,cabello_13,cabello_14,pelo_azul1,cabello_15,cabello_16,cabello_17,cabello_18,cabello_19,cabello_20,pelo_azul2,pelo_azul3,pelo_azul4,pelo_azul5);
        //añadir cuerpo superior
        grupo_maravilla.getChildren().addAll(fondo_cuerpo,fondo_cuerpo2,hombro1_1,hombro1_2,hombro1_3,hombro1_4,cuello_1,cuello_2,hombro2_1,hombro2_2,hombro2_3,hombro2_4,hombro2_5,hombro2_6);
        //añadir cuerpo 
        grupo_maravilla.getChildren().addAll(fondo_ttas1_1,fondo_ttas1_2,fondo_ttas1_3,fondo_cuerpo1_1,fondo_cuerpo1_2,fondo_cuerpo1_3,contorno1_1,contorno1_2,contorno2_1,contorno2_2,cuerpo_1,cuerpo1_1,ceno1_1,ceno2_1,ceno2_2,ceno2_3,vestido1,vestido2,vestido3,vestido4,vestido5,vestido6,vestido7,vestido8,vestido9,vestido10,vestido11,vestido12,linea1_1,linea1_2,linea1_3,linea1_4,contorno2_3,contorno2_4);
        //añadir puño
        grupo_maravilla.getChildren().addAll(puño1_1,puño1_2,puño1_3,puño1_4,puño1_5,puño1_6,puño1_7,puño1_8,puño1_9);
       //añadir los objetos escudo
       grupo_maravilla.getChildren().addAll(fondo1_escudo,fondo2_escudo,fondo3_escudo,escudo_1,escudo_3,escudo_2,escudo_4,escudo_5,escudo_6,fondo4_escudo,colorescudo_1,colorescudo_2,escudo_7,escudo_8,escudo_9,colorescudo_3,fig1_escudo,fig2_escudo);
        //añadir cara
       grupo_maravilla.getChildren().addAll(relleno_oreja,relleno_oreja2,oreja1_1,oreja1_2,oreja1_3,oreja1_4,oreja1_5,oreja2_1,oreja2_2,oreja2_3,oreja2_4,oreja2_5,cara_10,cara_15,cara_4,sombra_2,cara_2,cara_8,cara_3,cara_14,sombra_1,cara_13,cara_1,cara_6,cara_7,cara_9,cara_11,cara_12,boca_1,boca_2,boca_4,boca_3,nariz_1,nariz_2,ceja1_1,ceja1_2,ceja2_1,ceja2_2,ojo1_1,ojo1_2,ojo1_3,ojo1_4,ojo2_1,ojo2_2,ojo2_3,ojo2_4,ojo1_5,ojo2_5);
       //Añadir pierna1
       grupo_maravilla.getChildren().addAll(fondo_pierna1,fondo_pierna2,fondo_pierna3,fondo_bota1,fondo_bota2,pierna1_1,pierna1_2,pierna1_3,pierna1_4,bota1_1,bota1_2,bota1_3,fondo_bota3);
       //Añadir pierna2
       grupo_maravilla.getChildren().addAll(fondo_pierna2_4,fondo_pierna2_2,fondo_pierna2_3,fondo_pierna2_5,pierna2_1,pierna2_2,pierna2_3,pierna2_4,pierna2_5,fondo_pierna2_1,bota2_1,bota2_2,pierna2_6,pierna2_7,fondo_pierna2_6);
       //añadir falda
       grupo_maravilla.getChildren().addAll(fondo_falda1,fondo_falda,fondo_falda2,fondo_falda3,fondo_falda4,fondo_falda5,falda_1,falda_3,falda_4,falda_5,falda_6,falda_7);
       //añdir cuerpo bajo
        grupo_maravilla.getChildren().addAll(fondo_cinturon1,cinturon_1,cinturon_2,cinturon_3,cinturon_4,cinturon_5,cinturon_6);
       //Añadir empuñadura
        grupo_maravilla.getChildren().addAll(fondo_empuñadura,empuñadura3,empuñadura4,empuñadura2,empuñadura1);
        //Añadir puño2
        grupo_maravilla.getChildren().addAll(fondo_mano2_3,puño2_1,puño2_2,puño2_3,puño2_4,puño2_5,puño2_6,puño2_7,puño2_8,puño2_9);
        //añadir mano 2
        grupo_maravilla.getChildren().addAll(fondo_mano2_1,fondo_mano2_2,mano2_1,mano2_2,mano2_3,mano2_4,mano2_5,mano2_6,mano2_7);
        //Espada
        grupo_maravilla.getChildren().addAll(union1, union2,union3,union4,union5,union6,union7,union8,union9,union10);
        grupo_maravilla.getChildren().addAll(fondo_espada,fondo_espada2,fondo_espada4,espada1,espada2,espada3,espada4,espada5,espada7,espada8,espada9,espada10,fondo_espada3,espada6,espada11,espada12);
        
        //Añadir texto

        grupo_maravilla.getChildren().addAll(titulo);
        //Cambiar el tamaño del grupo marvilla
        grupo_maravilla.getTransforms().add(new Scale(6,6,0,0));

        return  grupo_maravilla;
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}