package ru.petsinbloom.demofx.Models;

import ru.petsinbloom.demofx.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private Model(){
        viewFactory = new ViewFactory();
    }
    public static synchronized Model getInstance(){
        if(model == null){
            model = new Model();
        }
        return model;
    }
    public ViewFactory getViewFactory(){
        return viewFactory;
    }
}
