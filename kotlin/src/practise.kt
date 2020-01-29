fun main(args : Array<String>){
    println("\n Your fortune is : ${getFortuneCookie()} " )

    var fortune : String

    for (i in 1..10){

        fortune = getFortuneCookie()

        println("\n Your fortune is : ${getFortuneCookie()} " )

        if(fortune.contentEquals("Take it easy")) break
    }


}

fun getFortuneCookie(): String {

    val fortunes = listOf("You will have a great day!","Things will go well for you today.",
        "Enjoy a wonderful day of success.","Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.","Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    print("\nEnter Your Birthday:")
3
    val birthDay = readLine()?.toIntOrNull() ?:1

    return fortunes[ birthDay.rem(fortunes.size)]
}

fun getBirthDay() : Int {
    print("Enter Your Birthday")
    return readLine()?.toInt() ?:1

}