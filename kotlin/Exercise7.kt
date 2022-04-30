fun main(){
    var productCost: Int = 29

    print("How many products you want to buy ? ")
    var input = readLine()
    var number = input?.toInt()?:3
    println("total products is ${productCost * number}")

}