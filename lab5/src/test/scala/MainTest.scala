import org.scalatest.FunSuite

class MainTest extends FunSuite {

  test("Main.NOD") {
    assert(Main.NOD(100,50) === 50)
  }

  test("Main.NOD_tailRecursion") {
    assert(Main.NOD_tailRecursion(100,50) === 50)
  }

}