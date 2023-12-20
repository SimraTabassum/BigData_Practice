object SwitchCondition {
  def main(args:Array[String]): Unit={
    println("enter 1st number:")
    var num1 = readDouble()

    println("enter 2nd number:")
    var num2 = readDouble()

    println("Choose the operation (+, -, *, /)")
    val oper = readLine()

    val output = oper match{
      case "+" => num1+num2
      case "-" => num1-num2
      case "*" => num1*num2
      case "/" => num1/num2
    }

    println(output)
  }
}
