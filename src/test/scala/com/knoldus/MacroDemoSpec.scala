package com.knoldus

import org.scalatest.{FlatSpec,Matchers }

class MacroDemoSpec extends FlatSpec with Matchers {

  /**
    * The test case checks weather the result returned by the macro implimentation is correct or not
    */
  "MacroDemo" should "have tests" in {
    val expectedResult = MacroDemo.add(1,2)
    val actualResult = 3
    expectedResult should === (actualResult)
  }
}
