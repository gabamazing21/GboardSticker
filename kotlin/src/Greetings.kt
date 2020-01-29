import java.util.*

fun main(args: Array<String>){

   val message = if(args[0].toInt() < 12) println("Good Morning, Kotlin") else println("Good night kotlin")
    println(message)

}