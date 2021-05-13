package TypeAliases

class TypeAliasesExample1 {

  //let's assume we want to define a function to add two vectors
  def add2Vectors(v1: (Double, Double, Double), v2: (Double, Double, Double)): (Double, Double, Double) = {
    return (v1._1 + v2._1, v1._2 + v2._2, v1._3 + v2._3)
  }
  //such code takes a lot of space and is not easily readable

  //later, creating a vector handling class or a library would result in constantly repeating code

  //thanks to type aliases one can give a shorter or more meaningful name to some type, such as
  type Vect3 = (Double, Double, Double)

  //the same function now would look like this
  def add2Vects(v1: Vect3, v2: Vect3): Vect3 = {
    return (v1._1 + v2._1, v1._2 + v2._2, v1._3 + v2._3)
  }
}

//Prezka
//Type alieses
//Ich głównym celem jest sprawienie, że kod jest krótszy, czytelniejszy i bardziej przejrzysty
//stworzenie type aliasu odbywa się za pomocą słowa kluczowego `type`, następnie nazwy aliasy i przyrównania go do typu danych których ma być aliasem
  //np: type Nums = List[BigDecimal]

//Wtedy słowo 'Nums' będzie przez kompilator traktowane dokładnie tak jak List[BigDecimal] (zostanie dosłownie zastąpione w trakcie kompilacji kodu)

//Należy pamiętać, że:
  // aliasy muszą być deklarowane wewnątrz class, object, or package object.
  // aliasy nei mogą mieć referencji do samych siebie
  // nie możemy stworzyć aliasu do typu wymagającego parametru bez podawania go
  // nie możemy użyć części aliasu mającego więcej niż jeden element