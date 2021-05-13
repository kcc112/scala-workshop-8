package TypeAliases

class TypeAliasesExample2 {

  //the same type can be assigned to many different aliases
  type l = Double
  type dm3 = Double

  //and because of the fact that alias simply replaces custom name with a declared type
  def addVolume(v1: l, v2: dm3): Double = {
    return v1 + v2
  }
  //operations can be successfully done on variables with 2 different aliases
}
