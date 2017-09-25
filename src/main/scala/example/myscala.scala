package myscala

object myscala {
  

  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)

  val oneTwoThreeFour = oneTwo ::: threeFour

  def main(args: Array[String]):Unit = {

    println(oneTwo)
    println(threeFour)
    println(oneTwoThreeFour)
  }

}
