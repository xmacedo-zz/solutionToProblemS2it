package br.com.xmacedo

object Solutions {
  def main(args: Array[String]) = {
    solveProblem1(args.toString)
  }

  def solveProblem1(text: String) : String = {
    text.distinct
  }
  def solveProblem2(digit: Int) : Int= {
    if(digit.toString.length>1)
      solveProblem2(digit.toString.toArray.map(_.asDigit).reduce(_+_))
    else
      digit
  }
}
