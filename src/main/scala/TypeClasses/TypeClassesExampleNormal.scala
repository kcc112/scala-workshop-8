package TypeClasses

trait PrinterNormal[A] {
  def getString(a: A): String
}

object TypeClassesExampleNormal {
  case class StudentId(id: Int)
  case class StaffId(id: Int)
  case class Score(s: Double)


  def show[A](a: A)(printer: PrinterNormal[A]): String = printer.getString(a)
  
  val studentPrinter: PrinterNormal[StudentId] = new PrinterNormal[StudentId] {
    def getString(a: StudentId): String = s"StudentId: ${a.id}"
  }

  val staffPrinter: PrinterNormal[StaffId] = new PrinterNormal[StaffId] {
    def getString(a: StaffId): String = s"StaffId: ${a.id}"
  }

  val scorePrinter: PrinterNormal[Score] = new PrinterNormal[Score] {
    def getString(a: Score): String = s"Score: ${a.s}%"
  }
}