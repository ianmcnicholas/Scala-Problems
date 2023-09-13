import org.scalatest.funsuite.AnyFunSuite

object ScalaTestingStyles

//first test
class CalculatorSuite extends AnyFunSuite {
  val calculator = new Calculator

  test("multiplication by 0 should always be 0"){
    assert(calculator.multiply(4312, 0) == 0)
    assert(calculator.multiply(-4312, 0) == 0)
    assert(calculator.multiply(0, 0) == 0)
    assert(calculator.multiply(0, 1) == 0)
    assert(calculator.multiply(0, -1) == 0)
  }

  test("dividing by 0 should throw an error"){
    assertThrows[ArithmeticException](calculator.divide(5, 0))

  }

}

class Calculator {
  def add(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = a - b

  def multiply(a: Int, b: Int): Int = a * b

  def divide(a: Int, b: Int): Int = a / b
}
