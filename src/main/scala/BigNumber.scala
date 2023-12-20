object BigNumber {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 30
    var c = 90

    if(a>b){
      if(a>c){
        println("a:" + a +" is the biggest number")
      }
      else{
        println("c:" + c +" is the biggest number")
      }
    }
    else{
      if(b>c){
        println("b:"+b+" is the biggest number")
      }
      else{
        println("c:"+c+" is the biggest number")
      }
    }
  }
}
