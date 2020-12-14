
/*  Задание к лабораторной работе №6
    - выполнить задание согласно выданному варианту.
    - при реализации использовать функции высших порядков.

    4 вариант
    Из двух коллекций сделать одну, в которой будут только уникальные элементы.
 */

object Main  {

  //объединяем 2 списка в 1
  def makeList(List1: List[Int], List2: List[Int]): List[Int] = {
    List1 ++ List2
  }

  //применяем функцию высшего порядка foldLeft к конечному списку и выводим список без повторов элементов, т.е список с уникальными элементами
  def makeListWithoutReplays(list: List[Int]): List[Int] = {
    list.foldLeft(Nil: List[Int]) {(acc, next) => if (acc contains next) acc else next :: acc }.reverse
  }
}

