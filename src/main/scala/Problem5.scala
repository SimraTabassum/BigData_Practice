object Problem5{
  def main(args: Array[String]) : Unit = {
    var num= 88
    if(num<=0 || num>=100){
      println("Invalid Number")
    }
    else{
      if(num>=90){
        println("Super Smart")
      }
      else{
        if(num>=80){
          println("Smart")
        }
        else{
          if(num>=70) {
            print("Smart Enough")
          }
          else{
            if(num>=60){
              println("smart")
            }
            else{
              if(num>=35){
                println("No Smart")
              }
              else{
                println("Dump")
              }
            }
          }
        }
      }
    }
  } }


