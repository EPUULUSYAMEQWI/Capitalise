fun main() {
    cities()

}

fun cities(){
    var city=arrayOf("kenya","dodoma","ghana","rwanda")
    city.forEach { capital->
        println(capital.capitalize())

    }
}
