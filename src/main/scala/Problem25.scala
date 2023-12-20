object Problem25 {
  def main(args:Array[String]):Unit={
    val num1=5
    for(num<- 4 to -12 by -1){
      print(s"$num1*$num, ")
    }
    println()
    for(num2<- 4 to -12 by -1){
      print(num1*num2+", ")
    }
  }
}
