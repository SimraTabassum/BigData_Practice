object Probelm21 {
 def main(args:Array[String]):Unit = {
   for(num<-10 to -5 by -1){
     print(s"$num@${num-1}")
     if(num > -5){
       print(", ")
     }
   }
 }
}
