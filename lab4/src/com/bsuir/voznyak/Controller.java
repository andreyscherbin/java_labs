package com.bsuir.voznyak;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    private MainThread mainThread = new MainThread();

    @FXML
    private Label array10;
    @FXML
    private Label array11;
    @FXML
    private Label array12;
    @FXML
    private Label array13;
    @FXML
    private Label array14;
    @FXML
    private Label array20;
    @FXML
    private Label array21;
    @FXML
    private Label array22;
    @FXML
    private Label array23;
    @FXML
    private Label array24;
    @FXML
    private Label resultLabel;
    @FXML
    private Label resultThreadLabel;

    public void computeResult() {
        resultLabel.setText(String.valueOf(mainThread.computeResult()));
    }

    @FXML
    public void initialize() {
        mainThread.setArray1(new int[]{1, 2, 3, 4, 5,});
        mainThread.setArray2(new int[]{9, 10, 11, 12, 99,});
        int[] array = mainThread.getArray1();
        array10.setText(String.valueOf(array[0]));
        array11.setText(String.valueOf(array[1]));
        array12.setText(String.valueOf(array[2]));
        array13.setText(String.valueOf(array[3]));
        array14.setText(String.valueOf(array[4]));
        array = mainThread.getArray2();
        array20.setText(String.valueOf(array[0]));
        array21.setText(String.valueOf(array[1]));
        array22.setText(String.valueOf(array[2]));
        array23.setText(String.valueOf(array[3]));
        array24.setText(String.valueOf(array[4]));
    }

    public void startThread() throws InterruptedException {
        mainThread = new MainThread();
        mainThread.setArray1(new int[]{1, 2, 3, 4, 5,});
        mainThread.setArray2(new int[]{9, 10, 11, 12, 99,});
        mainThread.start();
        Thread.sleep(1000);
        resultThreadLabel.setText(String.valueOf(mainThread.getSum()));
    }
}
