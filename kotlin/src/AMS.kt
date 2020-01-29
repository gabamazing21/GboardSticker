import java.util.*

fun main(args : Array<String>){
    println("Hello World, ${args [0]}")

    val isUnit = println("This an expression ")
    println(isUnit)

    val temperature = 10
    val isHot = if( temperature > 50 ) true else false ;
    println(isHot)

    val message = "You are ${if (temperature > 50 ) "fried" else "safe"}  fish "

    println(message)

    dayOfWeek()
    feedTheFish()

    swim (50, speed = "Too slow")




}

fun dayOfWeek(){
    println("What day is today ?")

    val daysOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)


    println(when(daysOfWeek){

        1 ->"Sunday"
        2 ->"Monday"
        3 ->"Tuesday"
        4 ->"Wednesday"
        5 ->"Thursday"
        6 ->"Friday"
        7 ->"Saturday"
        else->"Time has stopped"
    })
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println(" Today is ${day} and the fish eat ${food} ")
}

fun fishFood(day : String): String {
    shouldChangeWater(day,20,50)
    shouldChangeWater(day, dirty =30)


    return when(day){
        "Monday" ->"Flakes"
        "Tuesday" -> "Redworms"
        "Wednessday" -> "Granules"
        "Thursday" -> "Mosquitoes"
        "Friday" -> "Plankton"
        else -> "Fasting"
    }

}

fun randomDay(): String {
    val weeks = listOf("Monday","Tuesday","Wednessday","Thursday","Friday","Saturday","Sunday")
    return weeks[Random().nextInt(7)]
}

fun swim (time : Int, speed : String ="fast"){
    println("Swimming ${speed} at rate of ${time}")
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty : Int = 20) : Boolean{
    return when {

        temperature > 30 -> true
        dirty > 45 -> true
        else -> false
    }

}