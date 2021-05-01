package ExistentialTypes

object ExistentialTypesExample4 {
  def addToFirst(x : Array[T] forSome {type T <: Integer}) = x(0) + 1

  val stringArray = Array[String]("foo", "bar", "baz")

  val intArray = Array[Integer](1, 2, 3)

  // addToFirst(stringArray) // ERROR: type mismatch
}