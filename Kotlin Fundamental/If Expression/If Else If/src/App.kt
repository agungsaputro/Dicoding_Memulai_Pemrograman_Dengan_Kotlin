// main function
fun main() {
    val openHours = 8
    val now = 8
    val office: String

    office = if (now > openHours){
        "office is open"
    }else if (now == openHours){
        "await minutes"
    }else{
        "office is closed"
    }
    print(office)
}