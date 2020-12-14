/*  Задание к лабораторной работе №5:
    - выполнить задание по варианту не используя хвостовую рекурсию;
    - выполнить задание по варианту используя хвостовую рекурсию.
    4 вариант
    Найти наибольший общий делитель
 */

object Main {

  //не используя хвостовую рекурсию
  def NOD(a: Int, b: Int): Int = {

    var value = a
    while(value > 1){
      if(a % value == 0 && b % value == 0)
        return value
      value -= 1
    }
    return 1
  }

  //используя хвостовую рекурсию мы найдем НОД двух чисел намного быстрее
  def NOD_tailRecursion(a: Int, b: Int): Int =  b match {
      case 0          => a
      case x          => NOD_tailRecursion(x,a % x)
  }
}


