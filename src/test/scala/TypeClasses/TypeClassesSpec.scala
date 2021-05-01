package TypeClasses

import org.scalatest.FlatSpec

class ExistentialTypesSpec extends FlatSpec {

  it should "print student id" in {
    val studentId = TypeClassesExample.StudentId(25)
    assertResult(expected = "StudentId: 25")(actual = TypeClassesExample.show(studentId))
  }

   it should "print staff id" in {
    val staffId = TypeClassesExample.StaffId(12)
    assertResult(expected = "StaffId: 12")(actual = TypeClassesExample.show(staffId))
  }

   it should "print score" in {
    val score = TypeClassesExample.Score(94.2)
    assertResult(expected = "Score: 94.2%")(actual = TypeClassesExample.show(score))
  }
}