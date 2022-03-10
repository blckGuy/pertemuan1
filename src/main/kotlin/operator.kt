//contoh penggunaan operator dalam kotlin
fun main() {
    var a = 1
    a+=5
    println(a)
    println(a++)
    println(a)

    a = 7
    a = a++ + --a
    println(a)

    var dynamicVar = 2
    println("Contoh dynamic variabel = $dynamicVar")
}