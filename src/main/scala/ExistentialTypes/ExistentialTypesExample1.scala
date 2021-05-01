package ExistentialTypes

object ExistentialTypesExample1 {
  def getLength(x : Array[Any]): Int = x.length

  val stringArray = Array[String]("foo", "bar", "baz")

  // getLength(stringArray) // ERROR: type mismatch
}