package TypeClasses

import org.scalatest.FlatSpec

class TypeClassesNormalSpec extends FlatSpec {

  it should "print student id" in {
    val studentId = TypeClassesExampleNormal.StudentId(27)
    assertResult(expected = "StudentId: 27")(actual = TypeClassesExampleNormal.show(studentId)(TypeClassesExampleNormal.studentPrinter))
  }
}