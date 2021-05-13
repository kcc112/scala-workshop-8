package TypeAliases

class TypeAliasesExample1 {

  //let's assume we want to define a function to add two vectors
  def add2Vectors(v1: (Double, Double, Double), v2: (Double, Double, Double)): (Double, Double, Double) = {
    return (v1._1 + v2._1, v1._2 + v2._2, v1._3 + v2._3)
  }
  //such code takes a lot of space and is not easily readable

  //later, creating a vector handling library or even a class with multiple methods would result in constantly repeating code

  //thanks to type aliases one can give a shorter or more meaningful name to some type, such as
  type Vect3 = (Double, Double, Double)

  //the same function now would look like this
  def add2Vects(v1: Vect3, v2: Vect3): Vect3 = {
    return (v1._1 + v2._1, v1._2 + v2._2, v1._3 + v2._3)
  }
}
