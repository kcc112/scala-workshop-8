package TypeAliases

//there are some cases that we need to avoid when declaring a type alias

//aliases cannot be declared outside of the scope of a class/object or package object
//type A = List[String]
//<console>: error: expected class or object definition: type A = List[String]

class TypeAliasesExample3 {

  //it’s illegal to create a type alias with a reference to itself:
  //type B = List[B]
  //<console>: error: illegal cyclic reference involving type B


  //we cannot create a type alias to a type that has required parameters without defining them:
  //type T = List
  //<console>: error: type List takes type parameters

  //we are unable to select a part of another type that has more than one element, like Tuple:
  //type Y = Tuple2[Int, String]
  //type Z = List[Y.key]
  //<console>: error: not found: value Y
}
