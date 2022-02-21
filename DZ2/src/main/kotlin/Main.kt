fun main(){
    val ageArray = arrayOf(18, 22, 19, 38, 26)
    val nameArray = arrayOf("Михаил", "Максим", "Николай", "Павел", "Светлана",)
    val surNameArray = arrayOf("Терентьев", "Максимов", "Петров", "Семёнов", "Лебедева")
    ageArray.sort()
    for ((i, ages) in ageArray.withIndex()) {
        println("Фамилия, Имя, Возраст: ${ageArray[i]} ${nameArray[i]} ${surNameArray[i]}")
    }
}