package Demo

object Main {

  def Apple_Founder(Apple_Sentence: String): String = {

    var Founded =  "Elma Bulunamadı"
    val Sentence = (Apple_Sentence.split(' '))
    val length = Founded.length
    val index : Int = 0

    for (c <- 0 to (Sentence.length - 1))
      if(Sentence(c) == "Elma"){
        Founded = "Elma Bulundu"
      }

    return Founded
  }
  def main(args: Array[String]): Unit = {

    println(Main.Apple_Founder("Bu ağaç bir Elma ağacı"))
    println(Main.Apple_Founder("Bu ağaç bir ElMa ağacı"))
    println(Main.Apple_Founder("Bu ağaç bir armut ağacı"))

  }

}
