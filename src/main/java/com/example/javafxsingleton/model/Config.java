package com.example.javafxsingleton.model;

public class Config {
    private static final Config instance = new Config();
    private String formatRelatorios = "html";
    private String tipoGraficos = "pizza";

    private Config(){}

    public static Config getInstance(){
        return instance;
    }

    public String getFormatRelatorios() {
        return formatRelatorios;
    }

    public void setFormatRelatorios(String formatRelatorios) {
        this.formatRelatorios = formatRelatorios;
    }

    public String getTipoGraficos() {
        return tipoGraficos;
    }

    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }
}
