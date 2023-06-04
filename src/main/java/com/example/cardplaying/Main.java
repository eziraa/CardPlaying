package com.example.cardplaying;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.StringTokenizer;

import static com.example.cardplaying.Player1.isWon;
import static com.example.cardplaying.Player1.player1Cards;
import static com.example.cardplaying.Player2.isActive;
import static com.example.cardplaying.Player2.player2Cards;


public class Main extends Application {
    ArrayList<ImageView> playlist = new ArrayList<ImageView>();
    ArrayList<ImageView> extraList = new ArrayList<ImageView>();
    Scene scene = new Scene(new Pane(), 1400, 700);
    ArrayList<ImageView> allCards = new ArrayList<>();
    public static ImageView imageView;
    Stage stage = new Stage();
    static Text text  = new Text();
    static int min  = 0;;
    static int sec  = 0;
    public static boolean isActive1 = true;
    public static boolean isActive2 = false;
    public static boolean isBeginner2 = false;
    @Override
    public void start(Stage stage) throws IOException {


        this.stage =stage;
        CardImageView club2 =new CardImageView("c2.png");
        CardImageView club3 =new CardImageView("c3.png");
        CardImageView club4 =new CardImageView("c4.png");
        CardImageView club5 =new CardImageView("c5.png");
        CardImageView club6 =new CardImageView("c6.png");
        CardImageView club7 =new CardImageView("c7.png");
        CardImageView club8 =new CardImageView("c8.png");
        CardImageView club9 =new CardImageView("c9.png");
        CardImageView club10 =new CardImageView("c0.png");
        CardImageView clubJ =new CardImageView("cj.png");
        CardImageView clubK =new CardImageView("ck.png");
        CardImageView clubQ =new CardImageView("cq.png");
        CardImageView clubA=new CardImageView("ca.png");
        CardImageView heart2=new CardImageView("h2.png");
        CardImageView heart3=new CardImageView("h3.png");
        CardImageView heart4=new CardImageView("h4.png");
        CardImageView heart5=new CardImageView("h5.png");
        CardImageView heart6=new CardImageView("h6.png");
        CardImageView heart7=new CardImageView("h7.png");
        CardImageView heart8=new CardImageView("h8.png");
        CardImageView heart9=new CardImageView("h9.png");
        CardImageView heart10=new CardImageView("h0.png");
        CardImageView heartK=new CardImageView("hk.png");
        CardImageView heartJ=new CardImageView("hj.png");
        CardImageView heartQ=new CardImageView("hq.png");
        CardImageView heartA=new CardImageView("ha.png");
        CardImageView spades2=new CardImageView("s2.png");
        CardImageView spades3=new CardImageView("s3.png");
        CardImageView spades4=new CardImageView("s4.png");
        CardImageView spades5=new CardImageView("s5.png");
        CardImageView spades6=new CardImageView("s6.png");
        CardImageView spades7=new CardImageView("s7.png");
        CardImageView spades8=new CardImageView("s8.png");
        CardImageView spades9=new CardImageView("s9.png");
        CardImageView spades0=new CardImageView("s0.png");
        CardImageView spadesK=new CardImageView("sk.png");
        CardImageView spadesJ=new CardImageView("sj.png");
        CardImageView spadesA=new CardImageView("sa.png");
        CardImageView spadesQ=new CardImageView("sq.png");
        CardImageView deck0=new CardImageView("d0.png");
        CardImageView deck2=new CardImageView("d2.png");
        CardImageView deck3=new CardImageView("d3.png");
        CardImageView deck4=new CardImageView("d4.png");
        CardImageView deck5=new CardImageView("d5.png");
        CardImageView deck6=new CardImageView("d6.png");
        CardImageView deck7=new CardImageView("d7.png");
        CardImageView deck8=new CardImageView("d8.png");
        CardImageView deck9=new CardImageView("d9.png");
        CardImageView deckQ=new CardImageView("dq.png");
        CardImageView deckA=new CardImageView("da.png");
        CardImageView deckK=new CardImageView("dk.png");
        CardImageView deckJ=new CardImageView("dj.png");
        allCards.add(clubA.imageView);
        allCards.add(clubQ.imageView);
        allCards.add(clubK.imageView);
        allCards.add(heartQ.imageView);
        allCards.add(clubJ.imageView);
        allCards.add(club10.imageView);
        allCards.add(club2.imageView);
        allCards.add(heart2.imageView);
        allCards.add(heart3.imageView);
        allCards.add(club3.imageView);
        allCards.add(club4.imageView);
        allCards.add(club5.imageView);
        allCards.add(club6.imageView);
        allCards.add(club7.imageView);
        allCards.add(club8.imageView);
        allCards.add(club9.imageView);
        allCards.add(heart4.imageView);
        allCards.add(heart5.imageView);
        allCards.add(heart6.imageView);
        allCards.add(heart7.imageView);
        allCards.add(heart8.imageView);
        allCards.add(heart9.imageView);
        allCards.add(heart10.imageView);
        allCards.add(heartK.imageView);
        allCards.add(heartJ.imageView);
        allCards.add(heartA.imageView);
        allCards.add(spades2.imageView);
        allCards.add(spades3.imageView);
        allCards.add(spades4.imageView);
        allCards.add(spades5.imageView);
        allCards.add(spades6.imageView);
        allCards.add(spades7.imageView);
        allCards.add(spades8.imageView);
        allCards.add(spades9.imageView);
        allCards.add(spades0.imageView);
        allCards.add(spadesK.imageView);
        allCards.add(spadesJ.imageView);
        allCards.add(spadesA.imageView);
        allCards.add(spadesQ.imageView);
        allCards.add(deck0.imageView);
        allCards.add(deck2.imageView);
        allCards.add(deck3.imageView);
        allCards.add(deck4.imageView);
        allCards.add(deck5.imageView);
        allCards.add(deck6.imageView);
        allCards.add(deck7.imageView);
        allCards.add(deck8.imageView);
        allCards.add(deck9.imageView);
        allCards.add(deckQ.imageView);
        allCards.add(deckK.imageView);
        allCards.add(deckJ.imageView);
        allCards.add(deckA.imageView);
        ArrayList<ImageView> arr =mixing(allCards);
        player1Cards.clear();
        player2Cards.clear();
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Platform.runLater(() -> {

                    if (sec < 60)
                        sec++;
                    else {
                        min++;
                        sec = 0;
                    }
                    text.setText((min) + " : " +  (sec));
                });
            }
        }).start();
        System.out.println(allCards.size());
        for (int i =0; i < arr.size();i++){
            if (!isBeginner2) {
                if (i < 10)
                    player1Cards.add(arr.get(i));
                else if (i < 19)
                    player2Cards.add(arr.get(i));
                else
                    playlist.add(arr.get(i));
            }else{
                if (i < 9)
                    player1Cards.add(arr.get(i));
                else if (i < 19)
                    player2Cards.add(arr.get(i));
                else
                    playlist.add(arr.get(i));
            }
        }

        load(grouping(player1Cards),grouping(player2Cards),grouping(playlist),extraList,stage);
    }
    public void load(ArrayList<ImageView> player1Cards,ArrayList<ImageView> player2Cards,ArrayList<ImageView> playlist,ArrayList<ImageView> extraList,Stage stage) {
        StackPane player1 = new StackPane();
        StackPane player2 = new StackPane();
        StackPane extraBoard = new StackPane();
        StackPane playingBoard = new StackPane();
        player1.setMinWidth(300);
        player1.setMinHeight(200);
        extraBoard.setMinWidth(300);
        extraBoard.setMinHeight(200);
        playingBoard.setMinHeight(200);
        playingBoard.getChildren().addAll(playlist);
        VBox all = new VBox();
        player1.getChildren().addAll(player1Cards);
//        player2.getChildren().addAll(player2Cards);
        StackPane stackPane = new StackPane();
        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);
        text.setFont(Font.font("verdana", FontWeight.BOLD,24));
        stackPane.getChildren().addAll(circle,text);
        extraBoard.getChildren().add(stackPane);
        stackPane.setTranslateX(-400);
        extraBoard.getChildren().addAll(extraList);
        player2.setStyle("-fx-background-color:blue;-fx-padding:10; -fx-min-width:400");
        playingBoard.setStyle("-fx-background-color:limegreen;-fx-padding:10; -fx-min-width:400");
        player1.setStyle("-fx-background-color:blue;-fx-padding:10; -fx-min-width:400");
        extraBoard.setStyle("-fx-background-color:darkviolet; -fx-padding:10;");
        all.setSpacing(20);
        HBox playerPlace = new HBox();
        player1.minWidthProperty().bind(stage.widthProperty().divide(4).add(player1Cards.size() * 10));
        player2.minWidthProperty().bind(stage.widthProperty().divide(4).add(player2Cards.size() * 10));
        extraBoard.minWidthProperty().bind(stage.widthProperty().divide(4).add(extraList.size() * 10));
        playerPlace.setSpacing(100);
        playerPlace.setStyle("-fx-background-color:blue; -fx-padding:10;");
        imageView = new ImageView(new Image(Objects.requireNonNull(CardImageView.class.getResourceAsStream("cbb.png"))));
        playingBoard.getChildren().add(imageView);
        Button restart = new Button("Restart");
        restart.setFont(Font.font("verdana", FontWeight.BOLD,24));
        restart.setStyle("-fx-background-color:yellow");
        restart.setOnAction(e->{
            playlist.clear();
            extraList.clear();
            player1Cards.clear();
            player2Cards.clear();
            System.out.println(Player1.isWon);
            if (Player1.isWon){
                isActive1 = true;
                isActive2 = false;
            }
            else if (Player2.isWon){
                isActive1 = false;
                isActive2 = true;
                isBeginner2 = true;
            }

            Player1.isWon = false;
            Player2.isWon = false;
            ArrayList<ImageView> arr = mixing(allCards);
            ArrayList<ImageView> temp = new ArrayList<>();
            for (ImageView imgVw : allCards ) {
                temp.add(new CardImageView(imgVw.getStyleClass().get(2)).imageView);
            }
            arr = mixing(temp);
            for (int i =0; i < arr.size();i++){
                if (!isBeginner2) {
                    if (i < 10)
                        player1Cards.add(arr.get(i));
                    else if (i < 19)
                        player2Cards.add(arr.get(i));
                    else
                        playlist.add(arr.get(i));
                }else{
                    if (i < 9)
                        player1Cards.add(arr.get(i));
                    else if (i < 19)
                        player2Cards.add(arr.get(i));
                    else
                        playlist.add(arr.get(i));
                }
            }
            load(grouping(player1Cards),grouping(player2Cards),playlist,extraList,stage);
        });
        imageView.setFitWidth(110);
        imageView.setFitHeight(150);
        Text label1= new Text("🎉Won🎉");
        Text label2 = new Text("❌Loose❌");
        Text label3 = new Text("Anonymous");
        Text label4 = new Text("🧑‍💻");
        player2.getChildren().add(label4);
        label1.setFill(Color.GREEN);
        label4.setFill(Color.YELLOW);
        label2.setFill(Color.RED);
        label1.setFont(Font.font("verdana", FontWeight.BOLD,50));
        label4.setFont(Font.font("verdana", FontWeight.BOLD,80));
        label2.setFont(Font.font("verdana", FontWeight.BOLD,50));
        Text p1= new Text("Player 1");
//        Text p2 = new Text("Player 2");
        StackPane playerOne = new StackPane();
        StackPane playerTwo = new StackPane();
        playerOne.getChildren().add(p1);
        playerTwo.getChildren().add(label3);
        p1.setFill(Color.YELLOW);
        label3.setFill(Color.YELLOW);
        p1.setTranslateX(70);
        label3.setTranslateX(-70);
        if(Player2.isWon || isWon) {
//            player2.getChildren().clear();
            player2.getChildren().addAll(player2Cards);
            label4.setTranslateX(180);
        }
        p1.setFont(Font.font("verdana", FontWeight.BOLD,30));
        label3.setFont(Font.font("verdana", FontWeight.BOLD,30));
        all.getChildren().addAll(playerPlace, extraBoard, playingBoard);
        playerPlace.getChildren().addAll(playerOne,player1, player2,playerTwo);
        int j = 0;
        for (int i = 0; i < player1Cards.size(); i++) {
            if (i < player1Cards.size() / 2)
                player1Cards.get(i).setTranslateX((player1Cards.size() / 2 - i) * -15);
            else {
                player1Cards.get(i).setTranslateX(j * 15);
                j++;
            }
            player1Cards.get(i).setFitWidth(110);
            player1Cards.get(i).setFitHeight(150);
            player1Cards.get(i).setStyle("-fx-background-color:blue;-fx-border-width:10;-fx-border-color:red");

        }
        j = 0;
        for (int i = 0; i < extraList.size(); i++) {
            if (i < extraList.size() / 2)
                extraList.get(i).setTranslateX((extraList.size() / 2 - i) * -20);
            else {
                extraList.get(i).setTranslateX(j * 20);
                j++;
            }
            extraList.get(i).setFitWidth(110);
            extraList.get(i).setFitHeight(150);
            extraList.get(i).setStyle("-fx-background-color:blue;-fx-border-width:10;-fx-border-color:red");
        }
        j = 0;


        for (int i = 0; i < player2Cards.size(); i++) {
            if (i < player2Cards.size() / 2)
                player2Cards.get(i).setTranslateX((player2Cards.size() / 2 - i) * -20);
            else {
                player2Cards.get(i).setTranslateX(j * 20);
                j++;
            }
            player2Cards.get(i).setFitWidth(110);
            player2Cards.get(i).setFitHeight(150);
            player2Cards.get(i).setStyle("-fx-border-color:red;-fx-border-width:15;");
        }
        for (int i = 0; i < playlist.size(); i++) {
            playlist.get(i).setFitWidth(110);
            playlist.get(i).setFitHeight(150);
        }
        onePlayer(stage);
        scene = new Scene(all, scene.getWidth(), scene.getHeight());
        scene.setFill(Color.VIOLET);
        stage.setTitle("Card Playing!");
        stage.setScene(scene);
        stage.show();
        if (extraList.size()>0)
             extraList.get(extraList.size()-1).setFitHeight(160);
        if (isActive1) {
            player1.setStyle("-fx-background-color:green");
            player2.setStyle("-fx-background-color:red");

        } else {
            player1.setStyle("-fx-background-color:red");
            player2.setStyle("-fx-background-color:green");
        }
        if (Player1.isWon){
            player1.getChildren().add(label1);
            player2.getChildren().add(label2);
            isActive1 = false;
            isActive2 = false;
            extraBoard.getChildren().clear();
            extraBoard.getChildren().add(restart);
        }
        else if (Player2.isWon){
            player2.getChildren().add(label1);
            player1.getChildren().add(label2);
            isActive1 = false;
            isActive2 = false;
            extraBoard.getChildren().clear();
            extraBoard.getChildren().add(restart);
        }
        System.out.println(isActive1+"====");
    }

    public static void main(String[] args) {
        launch();
    }

    public ArrayList<ImageView> mixing(ArrayList<ImageView> list){
        ArrayList<ImageView> arrayList = new ArrayList<>();
        ArrayList<Long> arrayLis1 = new ArrayList<>();
        System.out.println(list.size()+ "  00");
        while (arrayList.size()<52){
            int x = (int) Math.round(Math.random()*51);
            if (!arrayList.contains(list.get(x))){
                arrayList.add(list.get(x));
            }
            else
                continue;

        }
        System.out.println(list.size());
        return arrayList;
    }

    public ArrayList<ImageView> grouping(ArrayList<ImageView> list2) {
        ArrayList<ArrayList<ImageView>> groupedLists = new ArrayList<>();
        ArrayList<ImageView> list = new ArrayList<>(list2);
        ArrayList<ImageView> list1 = new ArrayList<>();

        while (!list.isEmpty()) {
            ArrayList<ImageView> group = new ArrayList<>();
            ImageView firstImageView = list.get(0);
            group.add(firstImageView);
            String firstStyleClass = firstImageView.getStyleClass().get(1).trim();

            for (int i = 1; i < list.size(); i++) {
                ImageView imageView = list.get(i);
                String styleClass = imageView.getStyleClass().get(1).trim();

                if (firstStyleClass.equalsIgnoreCase(styleClass)) {
                    group.add(imageView);
                }
            }

            groupedLists.add(group);
            list.removeAll(group);
        }
        for (ArrayList<ImageView> imageView : groupedLists ) {
            list1.addAll(imageView);
        }

        return list1;
    }

    public ImageView selectCard(ArrayList<ImageView> imageViews, ImageView imgIn){
        ImageView imageView2 = new ImageView();
        ImageView imageView3 = new ImageView();
        ImageView imageView4 = new ImageView();
        ImageView imageView5 = new ImageView();
        for (ImageView imageView1 : imageViews ) {
            int i = 0;
            for (ImageView img: imageViews ) {
                if (imageView1.getStyleClass().get(1).equalsIgnoreCase(img.getStyleClass().get(1)))
                    i++;
            }
            if (i==1 &&( CardImageView.checkOne(player1Cards,imageView1) == 0 || CardImageView.checkOne(player1Cards,imageView1) > 2)) {
                return imageView1;
            }
            else if (i==1)
                imageView2 = imageView1;
            else if (i==2)
                imageView3 = imageView1;
            else if (i==3)
                imageView4 = imageView1;
            else if (i==4&&imageView1.getStyleClass().get(2).equalsIgnoreCase(imgIn.getStyleClass().get(2)))
               return imageView1;

        }if (imageView2.getStyleClass().size()>1)
            return imageView2;
        else if (imageView3.getStyleClass().size()>1)
            return imageView3;
        else if (imageView4.getStyleClass().size()>1) {
            return imageView4;
        }else
            ;
        return imageView5;
    }
    public void makeResponsibe(Stage stage){
        for (int i = 0; i < player1Cards.size(); i++) {
            final int m = i;
            player1Cards.get(i).setOnMouseClicked(e -> {
                if (isActive1) {
                    if (player1Cards.get(m).getStyleClass().get(2).equalsIgnoreCase("ht.gif")) {
                        player1Cards.remove(m);
                        if (player1Cards.size() == 0) {
                            CardImageView ad = new CardImageView("ht.gif");
                            player1Cards.add(ad.imageView);
                        }
                    } else {
                        CardImageView add = new CardImageView(player1Cards.get(m).getStyleClass().get(2).trim());
                        extraList.add(add.imageView);
                        System.out.println("----------size------");
                        System.out.println(player1Cards.size());
                        player1Cards.remove(m);
                        if (player1Cards.size() == 0) {
                            CardImageView ad = new CardImageView("ht.gif");
                            player1Cards.add(ad.imageView);
                        }
                    }
                    if (extraList.size() > 1 && extraList.get(0).getStyleClass().get(2).equalsIgnoreCase("ht.gif"))
                        extraList.remove(0);
                    if (player1Cards.size()==9) {
                        isActive1 = false;
                        isActive2 = true;
                    }
                    load(grouping(player1Cards), grouping(player2Cards), grouping(playlist), extraList, stage);

                }
            });
        }
        for (int i = 0; i < player2Cards.size(); i++) {
            final int m = i;
            player2Cards.get(i).setOnMouseClicked(e -> {
                if (isActive2) {
                    if (player2Cards.get(m).getStyleClass().get(2).equalsIgnoreCase("ht.gif")) {
                        player2Cards.remove(m);
                        if (player2Cards.size() == 0) {
                            CardImageView ad = new CardImageView("ht.gif");
                            player2Cards.add(ad.imageView);
                        }
                    } else {
                        CardImageView add = new CardImageView(player2Cards.get(m).getStyleClass().get(2).trim());
                        extraList.add(add.imageView);
                        player2Cards.remove(m);
                        if (player2Cards.size() == 0) {
                            CardImageView ad = new CardImageView("ht.gif");
                            player2Cards.add(ad.imageView);
                        }
                    }
                    if (extraList.size() > 1 && extraList.get(0).getStyleClass().get(2).equalsIgnoreCase("ht.gif"))
                        extraList.remove(0);
                    if (player1Cards.size()==9) {
                        isActive1 = true;
                        isActive2 = false;
                    }
                    load(grouping(player1Cards), grouping(player2Cards), (playlist), extraList, stage);

                }
            });

        }
        int k = playlist.size() -1;
        imageView.setOnMouseClicked(e->{
            CardImageView add = new CardImageView("ht.gif");
            if (k > -1)
                if (playlist.get(k).getStyleClass().get(2).equalsIgnoreCase("ht.gif"))
                {
                    playlist.remove(k);
                    if (playlist.size() == 0) {
                        CardImageView ad = new CardImageView("ht.gif");
                        playlist.add(ad.imageView);
                    }
                }
                else {
                     add = new CardImageView(playlist.get(k).getStyleClass().get(2).trim());
                    if (isActive1) {
                        boolean got = false;
                        for (int i =0; i< player1Cards.size(); i++) {
                            if (add.imageView.getStyleClass().get(1).equalsIgnoreCase(player1Cards.get(i).getStyleClass().get(1))) {
                                player1Cards.add(i+1, add.imageView);
                                got = true;
                                break;
                            }

                        }
                        if (!got)
                            player1Cards.add(add.imageView);
                        Player1.isWon = whoWon(player1Cards);
                    }
                    else {
                        boolean got = false;
                        for (int i =0; i< player2Cards.size(); i++) {
                            if (add.imageView.getStyleClass().get(1).equalsIgnoreCase(player2Cards.get(i).getStyleClass().get(1))) {
                                player2Cards.add(i+1, add.imageView);
                                got = true;
                                break;
                            }

                        }
                        if (!got)
                            player2Cards.add(add.imageView);
                        Player2.isWon = whoWon(player2Cards);
                    }
                    playlist.remove(k);
                    if (playlist.size() == 0) {
                        CardImageView ad = new CardImageView("ht.gif");
                        playlist.add(ad.imageView);
                    }
                }
            if (player1Cards.size() > 1&&player1Cards.get(0).getStyleClass().get(2).equalsIgnoreCase("ht.gif"))
                player1Cards.remove(0);
            load(grouping(player1Cards), grouping(player2Cards), playlist,extraList, stage);
            add.imageView.setFitHeight(160);
        });
//        int  m = extraList.size()-1;
        for (int j = 0; j < extraList.size(); j++) {
          final int top = extraList.size()-1;
                extraList.get(j).setOnMouseClicked(e -> {
                    CardImageView add = new CardImageView("ht.gif");
                    if (extraList.get(top).getStyleClass().get(2).equalsIgnoreCase("ht.gif")) {
                        extraList.remove(top);
                        if (extraList.size() == 0) {
                            CardImageView ad = new CardImageView("ht.gif");
                            extraList.add(ad.imageView);
                        }
                    } else {
                        add = new CardImageView(extraList.get(top).getStyleClass().get(2).trim());
                        if (isActive2) {
                            boolean got = false;
                            for (int i = 0; i < player2Cards.size(); i++) {
                                if (add.imageView.getStyleClass().get(1).equalsIgnoreCase(player2Cards.get(i).getStyleClass().get(1))) {
                                    player2Cards.add(i+1, add.imageView);
                                    got = true;
                                    break;
                                }

                            }
                            if (!got)
                                player2Cards.add(add.imageView);
                            Player2.isWon = whoWon(player2Cards);
                        } else {
                            boolean got = false;
                            for (int i = 0; i < player1Cards.size(); i++) {
                                if (add.imageView.getStyleClass().get(1).equalsIgnoreCase(player1Cards.get(i).getStyleClass().get(1))) {
                                    player1Cards.add(i+1, add.imageView);
                                    got = true;
                                    break;
                                }

                            }
                            if (!got)
                                player1Cards.add(add.imageView);
                            Player1.isWon = whoWon(player1Cards);
                        }
                        extraList.remove(top);
                        if (extraList.size() == 0) {
                            CardImageView ad = new CardImageView("ht.gif");
                            extraList.add(ad.imageView);
                        }
                    }
                    if (player2Cards.size() > 1 && player2Cards.get(0).getStyleClass().get(2).equalsIgnoreCase("ht.gif"))
                        player2Cards.remove(0);
                    load(grouping(player1Cards), grouping(player2Cards), (playlist), extraList, stage);
                    add.imageView.setFitHeight(160);
                });
        }
    }
    public boolean whoWon(ArrayList<ImageView> list){
        list = grouping(list);
        ArrayList<ImageView> list1 = new ArrayList<>();
        int count =0;
        int countOfThree = 0;
        int countOfOne = 0;
        boolean got = false;
        for (int i = 0; i < list.size(); i++) {
            count= 0;
            for (int j = 0  ; j <list.size(); j++)
            {
                if (list.get(i).getStyleClass().get(1).equalsIgnoreCase(list.get(j).getStyleClass().get(1)))
                    count ++;
            }
            if (count==3)
                countOfThree++;
            if (count==1)
                countOfOne++;
        }
        if (countOfThree == 9 && countOfOne ==1) {
            System.out.println("\n\n\n\n 👋👋👋👋👋 won \n\n\n");

            return true;
        }
        return false;
    }
    public void onePlayer(Stage stage){
        System.out.println(player1Cards.size()+" "+isActive1);
        for (int i = 0; i < player1Cards.size(); i++) {
            final int m = i;
            System.out.println(player1Cards.size()+" "+isActive1);
            player1Cards.get(i).setOnMouseClicked(e -> {
                if (isActive1 && player1Cards.size()==10) {
                        CardImageView add = new CardImageView(player1Cards.get(m).getStyleClass().get(2).trim());
                        extraList.add(add.imageView);
                        player1Cards.remove(m);
                    if (extraList.size() > 1 && extraList.get(0).getStyleClass().get(2).equalsIgnoreCase("ht.gif"))
                        extraList.remove(0);

                    isActive1 = false;
                    isActive2 = true;
                    load(grouping(player1Cards), (player2Cards), (playlist), extraList, stage);
                    ImageView imgRemoved = new ImageView();
                    new Thread(() -> {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }
                        Platform.runLater(() -> {
                            boolean got = false;
                            int k = 0;
                            ImageView addTo = extraList.get(extraList.size() - 1);
                            for (ImageView img : player2Cards) {
                                if (addTo.getStyleClass().get(1).equalsIgnoreCase(img.getStyleClass().get(1))) {
                                    k++;
                                }
                            }
                            if (k>0 && k < 3) {
                                player2Cards.add(new CardImageView(addTo.getStyleClass().get(2)).imageView);
                                extraList.remove(addTo);
                            }
                            else if(playlist.size() > 0) {
                               player2Cards.add( new CardImageView(playlist.get(playlist.size() - 1).getStyleClass().get(2)).imageView);
                               playlist.remove(playlist.size() - 1);
                            }

                            Player2.isWon = whoWon(player2Cards);
                            load((player1Cards), (player2Cards), (playlist), extraList, stage);
                        });
                    }).start();
                    if (!Player2.isWon)
                        new Thread(() -> {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }
                        Platform.runLater(() -> {
                            ImageView img = selectCard(player2Cards,player2Cards.get(player2Cards.size()-1));
                            CardImageView addToE = new CardImageView(img.getStyleClass().get(2));
                                   extraList.add(addToE.imageView);
                                    player2Cards.remove(img);
                            isActive1 = true;
                            isActive2 = false;
                                    load(grouping(player1Cards), grouping(player2Cards), (playlist), extraList, stage);

                        });
                    }).start();
                }
            });
        }
        if (isBeginner2)
            new Thread(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                Platform.runLater(() -> {
                    ImageView img = selectCard(player2Cards,player2Cards.get(player2Cards.size()-1));
                    CardImageView addToE = new CardImageView(img.getStyleClass().get(2));
                    extraList.add(addToE.imageView);
                    player2Cards.remove(img);
                    isActive1 = true;
                    isActive2 = false;
                    load(grouping(player1Cards), grouping(player2Cards), (playlist), extraList, stage);
                });
                isBeginner2 = false;
            }).start();
        int k = playlist.size() -1;
            imageView.setOnMouseClicked(e -> {
                CardImageView add = new CardImageView("ht.gif");
                if (player1Cards.size() == 9) {
                    if (k > -1) {

                        add = new CardImageView(playlist.get(k).getStyleClass().get(2).trim());
                        boolean got = false;
                        for (int i = 0; i < player1Cards.size(); i++) {
                            if (add.imageView.getStyleClass().get(1).equalsIgnoreCase(player1Cards.get(i).getStyleClass().get(1))) {
                                player1Cards.add(i + 1, add.imageView);
                                got = true;
                                break;
                            }
                        }
                        if (!got)
                            player1Cards.add(add.imageView);
                        Player1.isWon = whoWon(player1Cards);
                        playlist.remove(k);
                    } else {
                        for (ImageView img : extraList) {
                            playlist.add(new CardImageView(img.getStyleClass().get(2)));
                        }
                        extraList.clear();
                    }
                    if (player1Cards.size() > 1 && player1Cards.get(0).getStyleClass().get(2).equalsIgnoreCase("ht.gif"))
                        player1Cards.remove(0);
                    load(grouping(player1Cards), (player2Cards), playlist, extraList, stage);
                    add.imageView.setFitHeight(160);
                }
            });

            for (int j = 0; j < extraList.size(); j++) {
                final int top = extraList.size()-1;
                    extraList.get(j).setOnMouseClicked(e -> {
                    CardImageView add = new CardImageView("ht.gif");
                        if (player1Cards.size() == 9) {
                            if (extraList.get(top).getStyleClass().get(2).equalsIgnoreCase("ht.gif")) {
                                extraList.remove(top);
                                if (extraList.size() == 0) {
                                    CardImageView ad = new CardImageView("ht.gif");
                                    extraList.add(ad.imageView);
                                }
                            } else {
                                add = new CardImageView(extraList.get(top).getStyleClass().get(2).trim());
                                if (isActive1) {
                                    boolean got = false;
                                    for (int i = 0; i < player1Cards.size(); i++) {
                                        if (add.imageView.getStyleClass().get(1).equalsIgnoreCase(player1Cards.get(i).getStyleClass().get(1))) {
                                            player1Cards.add(i + 1, add.imageView);
                                            got = true;
                                            break;
                                        }

                                    }
                                    if (!got)
                                        player1Cards.add(add.imageView);
                                    Player1.isWon = whoWon(player1Cards);
                                }

                                extraList.remove(top);
                                if (extraList.size() == 0) {
                                    CardImageView ad = new CardImageView("ht.gif");
                                    extraList.add(ad.imageView);
                                }
                            }
                            if (player2Cards.size() > 1 && player2Cards.get(0).getStyleClass().get(2).equalsIgnoreCase("ht.gif"))
                                player2Cards.remove(0);
                            load(grouping(player1Cards), grouping(player2Cards), (playlist), extraList, stage);
                            add.imageView.setFitHeight(160);
                        }
                        else {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Information");
                            alert.setHeaderText("Alert mistake");
                            alert.setContentText("Please drop first");
                            // Display the alert
                            alert.showAndWait();
                        }
                });
            }
    }
}
class CardImageView extends  ImageView{
    public  String name;
    public   ImageView imageView;
    public CardImageView (String path){
        this.name =new StringTokenizer(path,".").nextToken();
        this.imageView = new ImageView(new Image(Objects.requireNonNull(CardImageView.class.getResourceAsStream(path))));
        String[] name = this.name.split("");
        this.imageView.getStyleClass().add(name[name.length-1]);
        this.imageView.getStyleClass().add(path.trim());
//        System.out.println(this.imageView.getStyleClass().get(0));
//        System.out.println(this.imageView.getStyleClass().get(1));
//        System.out.println(this.imageView.getStyleClass().get(2));
    }
    public static boolean check( ArrayList<ImageView> list1,ImageView imageView) {
        for (int j = 0; j < list1.size(); j++) {
            if ((imageView.getStyleClass().get(2).equalsIgnoreCase(list1.get(j).getStyleClass().get(2)))) {
                return false;
            }
        }
        return true;
    }
    public static int checkOne( ArrayList<ImageView> list1,ImageView imageView) {
        int k = 0;
        for (int j = 0; j < list1.size(); j++) {
            if ((imageView.getStyleClass().get(1).equalsIgnoreCase(list1.get(j).getStyleClass().get(1)))) {
                k++;
            }
        }
        return k;
    }


}