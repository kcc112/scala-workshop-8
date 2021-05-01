package ExistentialTypes

object ExistentialTypesExample2 {
  // Superfluous type parameter
  // This verbosity of providing a type parameter is a hassle sometimes
  def getLength[T](x: Array[T]): Int = x.length

  val stringArray = Array[String]("foo", "bar", "baz")

  getLength(stringArray)
}