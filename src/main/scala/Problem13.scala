object Problem13 {
  def main(args:Array[String]):Unit = {
    var a=1
    for(num<- 20 to 140){
      if(num%2==0){
        if(a%2!=0){
          println(num)
        }
        a=a+1
      }
    }
  }
}
