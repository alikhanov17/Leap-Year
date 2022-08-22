import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

class Contact:ContactInt {
    var scanner = Scanner(System.`in`)
    var list = HashSet<Contact>()
    var elected = HashSet<Contact>()
    var history = HashMap<Int,String>()
    data class Contact(var name:String, var number: Int){

    }
    override fun add() {
        print("Enter name: ")
        val name  = scanner.next()
        print("Enter number: ")
        val number = scanner.nextInt()
        list.add(Contact(name, number))
    println("success")
        println()
    }

    override fun remove() {
        print("Enter name to remove: ")
        val name  = scanner.next()
        list.removeIf { r->name.equals(r.name) }
    }

    override fun call() {
        print("Enter number: ")
        val number = scanner.nextInt()
        list.forEach { contact ->
            if (number==contact.number){
                history.put(number,contact.name)
                println("calling")
                println("1-> to break call")
                var a = scanner.nextInt()
                while (true){
                    if (a==1){
                        break
                    }
                }

            }
            else{
                history.put(number,"")
                println("calling")
                println("1-> to break call")
                   var a = scanner.nextInt()
                while (true){
                    if (a==1){
                        break
                    }
                }
            }

        }
        println()
    }

    override fun list() {
list.forEach { contact ->
    println("Name: ${contact.name}")
    println("Number: ${contact.number} ")
}
        println()
    }

    override fun search() {
        print("Enter name: ")
        val name = scanner.next()
        val book: Contact? = list.find { it.name ==name  }
        println(book)
        println()
    }

    override fun update() {
        print("Enter name: ")
        val name = scanner.next()
        list.forEach { contact ->
            if (name.equals(contact.name)){
                print("Enter new name: ")
                val newName = scanner.next()
                print("Enter new number: ")
                val number = scanner.nextInt()

list.add( Contact(newName,number))
                list.removeIf { r->name.equals(r.name) }
                println("success")
            }
        }
        println()


    }

    override fun history() {

        for ((key, value) in history) {
            if (value.equals("")){
                println("Nuber: $key")
            }
            else{
                println("Name: $value")
                println("Nuber: $key")

            }

        }
        println()
    }
    override fun elected() {
        list.forEach { contact ->
            println("Name: ${contact.name}")
            println("Number: ${contact.number} ")
        }
        println()
        print("choose name of contact to add favourite ")
        var name= scanner.next()
        list.forEach { contact ->
            if (name.equals(contact.name)){
                elected.add(Contact(name,contact.number))
            }
        }
        println()
    }

    override fun electedList() {
        elected.forEach { contact ->
            println("Name: ${contact.name}")
            println("Number: ${contact.number} ")
        }
        println()
    }
}