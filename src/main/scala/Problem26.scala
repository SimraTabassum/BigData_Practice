object Problem26 {
  def main(args:Array[String]):Unit={
    for(num<- 1 to 36){
      if(num%2!=0){
        print(num+", ")
      }
      else{
        print("even, ")
      }
    }
  }
}
