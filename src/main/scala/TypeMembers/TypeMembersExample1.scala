package TypeMembers

//the following trait declares one of each kind of abstract type members
  // an abstract type (T)
  // method (transform)
  // val (initial)
  // var (current)
trait Abstract {
  type T
  def transform(x: T): T
  val initial: T
  var current: T
}
//abstract type members in Scala must be declared to be a member of a class or trait, without specifying its definition

//a concrete (non-abstract) implementation of Abstract needs to fill in definitions for each of its abstract members
class Concrete extends Abstract {
  type T = String
  def transform(x: T): T = x + x
  val initial: T = "hello"
  var current: T = initial
}
//the implementation gives a concrete meaning to the type name T by defining it as an alias of type String


// An abstract type member in Scala is always a member of some class or trait, such as type T in trait Abstract.


// you can think of a non-abstract (or, "concrete") type member, such as type T in class Concrete,
// as a way to define a new name/alias for a type within the scope of the class/trait

// in class Concrete, for example, the type String is given the alias T
// as a result, anywhere T appears in the definition of class Concrete it means String


// one reason to use a type member is to define a short, descriptive alias for a type
// whose real name less obvious in meaning, than the alias

// the other main use of type members is to declare abstract types that must be defined in subclasses


//type memebers are a concrete (defined) versions of abstract type members

