import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.must.Matchers

object ScalaTestingStyles

class testWithWordAndMatchers extends AnyWordSpec with Matchers {

  val calculator = new Calculator

  "A calculator" should {
    "give back 0 when multiplying by 0" in {
      assert(calculator.multiply(4312, 0) == 0)
      assert(calculator.multiply(-4312, 0) == 0)
      assert(calculator.multiply(0, 0) == 0)
      assert(calculator.multiply(0, 1) == 0)
      assert(calculator.multiply(0, -1) == 0)
    }
  }
}

class Calculator {
  def add(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = a - b

  def multiply(a: Int, b: Int): Int = a * b

  def divide(a: Int, b: Int): Int = a / b
}
