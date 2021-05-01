package AbstractMembers

import org.scalatest.FlatSpec

class AbstractMembersSpec extends FlatSpec {

  "Concrete1" should "transform Test value to TestTest" in {
    val concrete1 = new Concrete1()
    val transformed =  concrete1.transform("Test")
    assert(transformed === "TestTest")
  }

  "Concrete2" should "transform Test value to Test2" in {
    val concrete2 = new Concrete2()
    val transformed =  concrete2.transform("Test")
    assert(transformed === "Test2")
  }
}
