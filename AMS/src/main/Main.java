package main;


import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;

import java.util.List;

import database.dataAccessObject.*;
import entities.*;

// Mon utilisation de javafx est issue de tutoriels présents sur internet

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Application AMS");
        primaryStage.setOnCloseRequest(e -> Platform.exit());

        // Barre de menu
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("Application de l'entreprise de détail");
        MenuItem menuItemExit = new MenuItem("Quitter");
        menuItemExit.setOnAction(e -> Platform.exit());
        menuFile.getItems().add(menuItemExit);
        menuBar.getMenus().add(menuFile);

     // Création des onglets
        TabPane tabPane = new TabPane();
        
        Tab tab1 = new Tab("Résultats", createTab1Content());
        Tab tab2 = new Tab("Commandes", createTab2Content());
        Tab tab3 = new Tab("Lots à échéance", createTab3Content());
        Tab tab4 = new Tab("Produits", createTab4Content());

        tabPane.getTabs().addAll(tab1, tab2, tab3, tab4);

        // Mise en page
        VBox vbox = new VBox(menuBar, tabPane);
        Scene scene = new Scene(vbox, 1280, 720);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Méthode pour créer le contenu de l'onglet 1
    private Node createTab1Content() {
        VBox vbox = new VBox(10);
        Label label = new Label("Bienvenue dans l'onglet 3");
        ListView<String> listView = new ListView<>();
        
        VenteDAO Vente = new VenteDAO();
        List<Vente> listVentes = Vente.listAll();
        listVentes.forEach(vente -> listView.getItems().add(vente.toString()));
        
        //listView.getItems().addAll("Élément 1", "Élément 2", "Élément 3");

        vbox.getChildren().addAll(label, listView);
        return vbox;
    }

    private Node createTab2Content() {
        VBox vbox = new VBox(10);
        Label label = new Label("Bienvenue dans l'onglet 2");
        TextField textField = new TextField();
        Button button = new Button("Envoyer");

        button.setOnAction(e -> {
            System.out.println("Texte saisi : " + textField.getText());
        });

        vbox.getChildren().addAll(label, textField, button);
        return vbox;
    }

    private Node createTab3Content() {
    	VBox vbox = new VBox(10);
        Label label = new Label("Bienvenue dans l'onglet 1");
        Button button = new Button("Cliquez ici");
        
        button.setOnAction(e -> {
            // Action à exécuter lorsque le bouton est cliqué
            System.out.println("Bouton de l'onglet 1 cliqué !");
        });

        vbox.getChildren().addAll(label, button);
        return vbox;
    }
    
    private Node createTab4Content() {
    	VBox vbox = new VBox(10);
        Label label = new Label("Bienvenue dans l'onglet 3");
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Élément 1", "Élément 2", "Élément 3");

        vbox.getChildren().addAll(label, listView);
        return vbox;
    }
}