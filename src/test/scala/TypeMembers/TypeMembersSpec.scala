package TypeMembers

import org.scalatest.FlatSpec

class TypeMembersSpec extends FlatSpec {

  "TypeMembersExample1" should "store proper string values in B1" in {
    object B1 extends A1[String] {
      override val element: String = "test1"
    }
    assert(B1.element == "test1")
  }

  "TypeMembersExample1" should "store proper string values in B2" in {
    object B2 extends A2 {
      override type T = String
      override val element: String = "test2"
    }
    assert(B2.element == "test2")
  }

  "TypeMembersExample2" should "store proper values" in {
    val concrete = new Concrete()
    val transformed =  concrete.transform("test3")
    assert(transformed === "test3test3")
  }
}