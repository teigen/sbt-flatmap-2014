package calc

import org.scalatest._

class CalculatorTest extends FunSuite {
  test("positive"){
    assert(Calculator.calculate(Seq("+", "1", "2")) === Right(3))
  }

  test("negative"){
    assert(Calculator.calculate(Seq("-", "1", "2")) === Left("Don't know how to calculate - 1 2"))
  }
}
