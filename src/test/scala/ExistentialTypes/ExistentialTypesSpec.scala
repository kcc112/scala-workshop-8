package ExistentialTypes

import org.scalatest.FlatSpec

class ExistentialTypesSpec extends FlatSpec {

  "ExistentialTypesExample2" should "get array length" in {
    val stringArray = ExistentialTypesExample2.stringArray
    val length = ExistentialTypesExample2.getLength(stringArray)

    assert(length === 3)
  }

  "ExistentialTypesExample3" should "get array length" in {
    val stringArray = ExistentialTypesExample3.stringArray
    val length = ExistentialTypesExample3.getLength(stringArray)

    assert(length === 2)
  }

  "ExistentialTypesExample4" should "add 1 to first value in array" in {
    val intArray = ExistentialTypesExample4.intArray
    val result = ExistentialTypesExample4.addToFirst(intArray)

    assert(result === 2)
  }
}
