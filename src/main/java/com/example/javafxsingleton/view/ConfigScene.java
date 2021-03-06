package com.example.javafxsingleton.view;

import com.example.javafxsingleton.App;
import com.example.javafxsingleton.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ConfigScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public ConfigScene(App app) {
        super(app);
        var label1 = new Label("Formato de Relatórios");
        var fieldFormatoRelatorios = new TextField(config.getFormatRelatorios());
        var label2 = new Label("Tipo de Gráficos");
        var fieldTipoGraficos = new TextField(config.getTipoGraficos());
        var btnOk = new Button("Ok");
        VBox vBox = new VBox(label1, fieldFormatoRelatorios, label2, fieldTipoGraficos, btnOk);
        vBox.setStyle("-fx-font-family: 'serif'");

        setRoot(vBox);
        btnOk.setOnAction(event -> {
            config.setFormatRelatorios(fieldFormatoRelatorios.getText());
            config.setTipoGraficos(fieldTipoGraficos.getText());
            app.setScene(new MainScene(app));
        });
    }
}
