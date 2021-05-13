package TypeAliases

class TypeAliasesExample3 {

  //there are some cases that we need to avoid when declaring a type alias

  //it’s illegal to create a type alias with a reference to itself:
  //type A = List[A]
  //<console>:11: error: illegal cyclic reference involving type A


  //we cannot create a type alias to a type that has required parameters without defining them:
  //type T = List
  //<console>:11: error: type List takes type parameters

  //we are unable to select a part of another type that has more than one element, like Tuple:
  //type Y = Tuple2[Int, String]
  //type Z = List[Y.key]
  //<console>:11: error: not found: value Y
}
