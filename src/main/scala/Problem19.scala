object Problem19 {
  def main(args:Array[String]):Unit={
    var num1 = 5
    var num2 = 102
    var result = 0
    for(num<- num1 to num2){
      result = result + (num * num)
    }
    println(result)
  }
}
