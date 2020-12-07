/*  Задание к лабораторной работе:
    - выполнить задание по варианту не используя хвостовую рекурсию;
    - выполнить задание по варианту используя хвостовую рекурсию.

    4 вариант
    Найти наибольший общий делитель
 */

import scala.io.StdIn._

object Main  {

  //не используя хвостовую рекурсию
  def NOD(a: Int, b: Int): Int = {
    var value = a;
    while(value > 1){
       if(a % value == 0 && b % value == 0)
         return value;
      value -= 1;
    }
    return 1;
  }

  //используя хвостовую рекурсию мы найдем НОД двух чисел намного быстрее
  def NOD_tailRecursion(a: Int, b: Int): Int = {
    return if (b == 0) a else NOD_tailRecursion(b, a % b);
  }

  def main(args: Array[String]){
    println("Input first num");
    val firstInteger = readInt();
    println("Input second num");
    val secondInteger = readInt();
    println("no tail recursion NOD ("+firstInteger+ ","+secondInteger +")= " + NOD(firstInteger,secondInteger));
    println("   tail recursion NOD ("+firstInteger+ ","+secondInteger +")= " + NOD_tailRecursion(firstInteger,secondInteger));
  }
}

