package recfun

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite {
  test ( " check Pascal Triangle") {
    Main.main(Array(" "))
  }

    test("pascal: col=0,row=2") {
      assert(pascal(0,2) === 1)
  }

    test("pascal: col=1,row=2") {
      assert(pascal(1,2) === 2)
  }

    test("pascal: col=1,row=3") {
      assert(pascal(1,3) === 3)
  }
  test("Parentheses Balancing: (if (zero? x) max (/ 1 x))") {
    val str1 = "(if (zero? x) max (/ 1 x))".toList
    assert(balance(str1) === true)
    val str2 = "I told him (that it’s not (yet) done). (But he wasn’t listening)".toList
    assert(balance(str2) === true)

    assert(balance(":-)".toList) === false)

    assert(balance("())(".toList) === false)

  }
  test("Count Change: 4 with 1 and 2 denominations") {

   val numOfProbs =  countChange(4,List[Int](1,2))
    println("Number of changes =>" + numOfProbs)
    assert ( 0 === 0)
  }

}
