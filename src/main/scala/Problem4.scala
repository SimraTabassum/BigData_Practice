object Problem4 {
 def main(args: Array[String]) : Unit = {
   var num = 107
   if(num<=100||num>=1000){
     println("Wrong Number")
   }
   else{
     if(num%2==0){
       println(num%3)
     }
     else{
       println(num%2)
     }
   }
 }
}
