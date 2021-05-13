package TypeAliases

import org.scalatest.FlatSpec

class TypeAliasesSpec extends FlatSpec{

  "TypeAliasesExample1" should "add vectors correctly" in {
    val vectorHandler = new TypeAliasesExample1()
    val newVector = vectorHandler.add2Vectors((1, 2, 3), (3, 2, 1))
    val newVect = vectorHandler.add2Vects((1, 2, 3), (3, 2, 1))
    assert(newVector == newVect)
  }

  "TypeAliasesExample2" should "add numbers correctly" in {
    val numbersHandler = new TypeAliasesExample2()
    val result = numbersHandler.addVolume(1, 2)
    assert(result == 3)
  }

}
