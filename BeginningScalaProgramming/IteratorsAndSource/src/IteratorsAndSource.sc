object IteratorsAndSource {

  val path = "/Users/igorsilva/Projects/ScalaTraining/BeginningScalaProgramming/" +
    "IteratorsAndSource/src/TX417945_1263.csv"

  val source = io.Source.fromFile(path)

  val lines = source.getLines()

  // Skip the two initial lines
  lines.next()
  lines.next()

  source.close()


}