import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt,m: BigInt): BigInt = {
    if (i <= 1) 
      m
    else
      factorial(i - 1,i * m)
  }
  println(factorial(1000,1))
}
