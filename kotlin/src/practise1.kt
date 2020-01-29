fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getBirthday(): Int {
    print("\nEnter Your Birthday:")
    3
    val birthDay = readLine()?.toIntOrNull() ?:1

    return birthDay

}

fun getFortune(birthday: Int): String {
    val fortunes = listOf("You will have a great day!","Things will go well for you today.",
        "Enjoy a wonderful day of success.","Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.","Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")


    val fortune = when (birthday){

        in 1..7 -> 2
        31, 20 -> 9

        else -> birthday.rem(fortunes.size)
    }



    return fortunes[fortune]

}
