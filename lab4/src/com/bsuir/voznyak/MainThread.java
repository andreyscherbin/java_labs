package com.bsuir.voznyak;

public class MainThread extends Thread {

    private int sum; // алгебраическое произведение двух векторов
    private int[] array1;
    private int[] array2;

    public int getSum() {
        return sum;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public int[] getArray1() {
        return array1;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }

    public int[] getArray2() {
        return array2;
    }

    private int threadResult; // частичное произведение

    //следуем диаграмме последовательности
    public void run() {
        System.out.println("Главный поток начинает работу");
        System.out.println("Вычисляем произведение = " + this.computeResult());
        for (int i = 0; i < array1.length; i++) {
            ChildThread childThread = new ChildThread(this); // создаем поток
            synchronized (childThread) {
                childThread.start();
                reportNumbers(array1[i], array2[i], childThread); // сообщаем числа дочернему потоку
                try {
                    childThread.wait();  // ждем пока дочерний поток завершит вычисление
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sum += threadResult; // увеличиваем произведение
            }
        }
        System.out.println("Главный поток заканчивает работу, алгебраическое произведение двух векторов =  " + sum);
    }

    private boolean reportNumbers(int number1, int number2, ChildThread childThread) {
        childThread.setNumber1(number1);
        childThread.setNumber2(number2);
        return true;
    }

    private boolean increaseSum(int result) {
        sum += result;
        return true;
    }

    public int computeResult() {

        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i] * array2[i];
        }
        return sum;
    }

    public void setThreadResult(int threadResult) {
        this.threadResult = threadResult;
    }
}
