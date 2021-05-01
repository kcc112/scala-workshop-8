package ExistentialTypes

object ExistentialTypesExample3 {
  // The forSome keyword is used to define existential types in Scala.
  def getLength(x : Array[T] forSome { type T}): Int = x.length

  val stringArray = Array[String]("foo", "bar")

  getLength(stringArray)
}