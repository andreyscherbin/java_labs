package com.bsuir.voznyak;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
   Лабораторная работа №4 вариант 4
   Задание к лабораторной работе:
   - необходимо разработать графический интерфейс с использованием менеджера компоновки;
   - представление графического интерфейса разрабатывается с учётом предоставления всей функциональности предложенного варианта
   - объекты и их взаимотношения, имеющиеся в варианте задания, должны быть реализованы;
   - функциональная часть приложения, представленная диаграммой последовательности, должна быть реализована;
   - графический интерфейс должен быть создан посредством одной из следующих библиотек: Swing, SWT, JavaFX;
   - разбить функционал приложения на несколько пакетов придерживаясь логики;
   - согласно варианту задания выбрать любую сущность, вынести её в отдельный поток, синхронизировать взаимодействие с ней.

   Вычислить алгебраическое произведение двух векторов. Каждое частичное произведение вычислить в отдельном потоке.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Thread");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
