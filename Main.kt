import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val contact = Contact()
    while (true){
        println("1-> add")
        println("2-> remove")
        println("3-> call")
        println("4-> list")
        println("5-> history")
        println("6-> update")
        println("7-> search")
        println("8-> add to favourite")
        println("9-> look list of favourite")
        println()
    val n = scanner.nextInt()
    when(n){
        1->{
            contact.add()
        }
        2->{
            contact.remove()
        }
        3->{
            contact.call()
        }
        4->{
            contact.list()
        }
        5->{
            contact.history()
        }
        6->{
            contact.update()
        }
        7->{
             contact.search()
        }
        8->{
            contact.elected()
        }
        9->{
            contact.electedList()
        }

    }
}}