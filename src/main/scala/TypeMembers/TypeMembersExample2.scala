package TypeMembers

//the following definition demonstrates generic approach
trait A1[T] {
  val element: T
}

//this one presents abstract type member approach
trait A2 {
  type T
  val element: T
}

//generics are typically used when one needs just type instantiation

// abstract type members are a better choice when you want to let people mix in definitions of those types via traits
// and also when you think the explicit mention of the type member name when it is being defined will help code readability


