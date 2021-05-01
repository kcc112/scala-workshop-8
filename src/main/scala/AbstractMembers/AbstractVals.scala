package AbstractMembers

// Scala class needs to be abstract if:
// You want to create a base class that requires constructor arguments
// Your Scala code will be called from Java code

abstract class Fruit {
  val v: String
  def m: String
}

abstract class Apple extends Fruit {
  val v: String
  val m: String // OK to override a `def' with a `val'
}
  
abstract class BadApple extends Fruit {
  // def v: String // ERROR: cannot override a `val' with a `def'
  def m: String
}