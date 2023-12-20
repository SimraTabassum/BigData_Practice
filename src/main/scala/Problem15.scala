object Problem15 {
  def main(args: Array[String]): Unit = {
    var i = 2
    var j = 3
    var a = 2
    var b = 3
    while (i <= 16 && j <= 17) {
      print(i + "*" + j + ",")
      i = i + 1
      j = j + 1
    }
    println()
    while (a <= 16 && b <= 17) {

      print(a * b + ",")
      a = a + 1
      b = b + 1
    }
  }
}

