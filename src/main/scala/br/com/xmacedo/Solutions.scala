package br.com.xmacedo

import org.apache.commons.lang3.StringUtils

object Solutions {
  def main(args: Array[String]) = {
    try {
      if (args.length == 0 ||
        args.isEmpty ||
        !StringUtils.isNumeric(args(0)) ||
        (args(0) == 1 && StringUtils.isNumeric(args(1))) ||
        (args(0) == 2 && !StringUtils.isNumeric(args(1))))
        throw new IllegalArgumentException("Voce precisa passar dois parametros, (1) Qual solucao 1 ou 2, (2) Se 1 String, se 2 um numero inteiro!")

      if (args(0) == 1)
        solveProblem1(args(1))

      solveProblem2(args(1).toInt)

    } catch {
      case e: Throwable => {
        throw new Exception(s"Erro na resolucao do problema:  ${e.getMessage}")
      }
    }
  }

  def solveProblem1(text: String): String = {
    text.distinct
  }

  def solveProblem2(digit: Int): Int = {
    if (digit.toString.length > 1)
      solveProblem2(digit.toString.toArray.map(_.asDigit).reduce(_ + _))
    else
      digit
  }
}
