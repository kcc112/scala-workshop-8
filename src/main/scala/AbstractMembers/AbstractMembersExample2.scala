package AbstractMembers

// The following trait declares one of each kind of abstract member
// Type parameters
trait Abstract2[T] {
  def transform(x: T): T

  // An abstract val. It gives a name and type for a val, but not its value
  // This value has to be provided by a concrete val definition in a subclass
  val initial: T

  // If you declare an abstract
  // var named hour, for example, you implicitly declare an
  // abstract getter method and an abstract setter method
  var current: T
}

// A concrete implementation of Abstract2 needs
// to fill in definitions for each of its abstract members
class Concrete2 extends Abstract2[String] {
  def transform(x: String) = x + "2"
  val initial = "hi"
  var current = initial
}
