fun main(){
//    print("Input a messagem:")
//    val message = readLine()
//
//    println(message?:"Greeting strange")

    println("Input a number")
    var input = readLine()
    var number = input?.toInt()
    println("$number multiplied by 5 is ${number?.times(5)}")
}