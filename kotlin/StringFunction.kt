import java.util.*

fun main(){
    val myPet = "Harry"
    println(myPet.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
//    Capitalize deprecead

    val otherPet = "Giraffe"
    println(otherPet.decapitalize())

    var spaced = " Hello Wowl with some spaces in middle"
    println(spaced.trim())

    var positionName = "Thiago"
    println(positionName[2])

    println(positionName.substring(3, 4))

}