package com.bsuir.voznyak;

public class ChildThread extends Thread {

    private int number1;
    private int number2;
    private MainThread mainThread;

    public ChildThread(MainThread mainThread) {
        this.mainThread = mainThread;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void run() {
        synchronized (this) {
            int composition = calculate(); //вычисляем
            System.out.println("Дочерний поток работает " + number1 + " " + number2 + " " + composition);
            mainThread.setThreadResult(composition); // сообщаем результат
            notify(); // выводим из wait главный поток
        }
    }

    public int calculate() {
        return number1 * number2;
    }
}
