object Problem12 {
  def main(args:Array[String]):Unit = {
    var count = 0
    println("Enter the number to start the range:")
    var num1 = readInt()

    println("Enter the number upto range: ")
    var num2= readInt()

    for(num<- num1 to num2){
      if(num%2==0){
        count = count+1
      }
    }
    println(count)
  }
}
