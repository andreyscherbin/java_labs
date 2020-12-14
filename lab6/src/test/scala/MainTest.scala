import org.scalatest.FunSuite

class MainTest extends FunSuite {
  test("Main.makeList") {
    assert(Main.makeList(List(1,2,3),List(3,4,5)) === List(1,2,3,3,4,5))
  }
  test("Main.makeListWithoutReplays") {
    assert(Main.makeListWithoutReplays(List(1,1,2,2,3,3)) === List(1,2,3))
  }
}