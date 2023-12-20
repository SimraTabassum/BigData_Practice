object Problem16 {
  def main(args:Array[String]):Unit={
    var num1=382
    var num2 = 582
    var result = 0
    for(num<- num1 to num2){
      if(num%2==0){
        result = result+num
      }
    }
    println(result)
  }
}
