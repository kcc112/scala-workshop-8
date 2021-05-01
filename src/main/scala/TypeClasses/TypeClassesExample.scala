package TypeClasses

trait Printer[A] {
  def getString(a: A): String
}

object TypeClassesExample {
  case class StudentId(id: Int)
  case class StaffId(id: Int)
  case class Score(s: Double)

  // A method can have an implicit parameter list,
  // marked by the implicit keyword at the start of the parameter list.
  // If the parameters in that parameter list are not passed as usual, Scala
  // will look if it can get an implicit
  // value of the correct type, and if it can, pass it automatically.

  // Implicit here means we only have to provide the a parameter
  // when we call the method if Scala can find an implicit
  def show[A](a: A)(implicit printer: Printer[A]): String = printer.getString(a)

  // Scala will first look for implicit definitions and implicit
  // parameters that can be accessed directly (without a prefix)
  // at the point the method with the implicit parameter block is called.

  // Then it looks for members marked implicit
  // in all the companion objects associated with the implicit candidate type.

  // The implicit keyword indicates that the corresponding object can be used implicitly.
  
    implicit val studentPrinter: Printer[StudentId] = new Printer[StudentId] {
      def getString(a: StudentId): String = s"StudentId: ${a.id}"
    }

    implicit val staffPrinter: Printer[StaffId] = new Printer[StaffId] {
      def getString(a: StaffId): String = s"StaffId: ${a.id}"
    }

    implicit val scorePrinter: Printer[Score] = new Printer[Score] {
      def getString(a: Score): String = s"Score: ${a.s}%"
    }
}