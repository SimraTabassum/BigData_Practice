object Probelm18 {
  def main(args:Array[String]):Unit={
    var num1=24
    var num2=100
    var result = 0
    var count = 0
    for(num<- num1 to num2){
      if(num%2==0){
      result = result + num
      count +=1
    }}
    print(result/count)
  }

}
