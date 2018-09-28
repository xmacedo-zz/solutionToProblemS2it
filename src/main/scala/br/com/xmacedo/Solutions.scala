package br.com.xmacedo
import org.apache.commons.lang3.StringUtils

object Solutions {
  def main(args: Array[String]) = {


      if(args(0)==1)
        solveProblem1(args(1))

      solveProblem2(args(1).toInt)


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
