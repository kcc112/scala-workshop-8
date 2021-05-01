package AbstractMembers

// The following trait declares one of each kind of abstract member
trait Abstract1 {
  // Abstract type
  type T
  
  def transform(x: T): T

  // An abstract val. It gives a name and type for a val, but not its value
  // This value has to be provided by a concrete val definition in a subclass
  val initial: T
  
  // If you declare an abstract
  // var named hour, for example, you implicitly declare an
  // abstract getter method and an abstract setter method
  var current: T
}

// A concrete implementation of Abstract1 needs
// to fill in definitions for each of its abstract members
class Concrete1 extends Abstract1 {
  type T = String
  def transform(x: String) = x + x
  val initial = "hi"
  var current = initial
}