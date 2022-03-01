fun main(){
    var n = 0
    val ageArray = Array(5){0}
    val nameArray = Array<String?>(5){""}
    val surnameArray = Array<String?>(5){""}
    while(n < 2){
        println("Введите фамилию")
        val surname = readLine()
        println("Введите имя")
        val name = readLine()
        println("Введите возраст")
        val age : Int = readLine()?.toInt()!!
        if ((age > 14) && (age < 18)) println("$name $surname не пускать в торговый центр")
        if (age <= 14) println("$name $surname вызвать полицию")
        if (age >= 18){
            println("$name $surname пропустить")
            ageArray[n] = age
            nameArray[n] = name
            surnameArray[n] = surname
            n++
        }
    }
    println(output(ageArray, nameArray,surnameArray))
}
fun output(ageArray: Array<Int>, nameArray: Array<String?>, surnameArray: Array<String?>) {
    for ((i) in ageArray.withIndex()) {
        println("Возраст, Имя, Фамилия: ${ageArray[i]} ${nameArray[i]} ${surnameArray[i]}")
    }
}