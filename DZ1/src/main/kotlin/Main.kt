fun main(args: Array<String>) {
    println("Ведите имя: ")
    val name = readLine()
    println("Введите фамилию: ")
    val surname = readLine()
    println("Введите аозраст: ")
    val age :Int = readLine()!!.toInt()
    if (age < 14) println("$name $surname вызвать полицию")
    if (age >= 18) println("$name $surname впустить")
    if ((age >=14) && (age < 18))println("$name $surname не впускать")
}