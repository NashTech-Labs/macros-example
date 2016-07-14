package com.knoldus

import language.experimental.macros
import reflect.macros.blackbox.Context

object MacroDemo {

  /**Declares a macro definition 'add()'
    *
    * @param num1 first operand
    * @param num2 second operand
    * @return result of addition
    */
  def add[T](num1: Int, num2: Int): Int = macro add_impl

  /**Macro implimentation of 'add()' method
    *
    * @param c context
    * @param num1 AST of first operand
    * @param num2 AST of second operand
    * @return AST of the resultant of the addition
    */
  def add_impl(c: Context)(num1: c.Expr[Int], num2: c.Expr[Int]): c.Expr[Int] = {
    import c.universe.reify
    reify {
      num1.splice + num2.splice
    }
  }

}
