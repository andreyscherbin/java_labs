package com.bsuir.voznyak.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/* Задание к лабораторной работе № 3 вариант 4:
  - Необходимо разработать графический интерфейс с использованием менеджера компоновки;
  - Представление графического интерфейса разрабатывается с учётом предоставления всей функциональности предложенного варианта;
  - объекты и их взаимотношения, имеющиеся в варианте задания, должны быть реализованы;
  - функциональная часть приложения, представленная диаграммой последовательности, должна быть реализована;
  - графический интерфейс должен быть создан посредством одной из следующих библиотек: Swing, SWT, JavaFX;
  - разбить функционал приложения на несколько пакетов придерживаясь логики.
*/


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Human");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
