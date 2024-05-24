package chapter1

data class Person(var name: String, val age: Int?= null)

fun main(args: Array<String>){
    var persons = listOf(Person("영희"), Person("철수", age = 20))
    var oldest = persons.maxBy{it.age ?: 0}
    println("나이가 가장 많은 사람: $oldest")
}