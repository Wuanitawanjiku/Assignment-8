fun main(){
    println(isEven(35))
    var product = Product("Cooking oil",450.2,900,"Groceries")
    product.goods()
    println(evenIndices("mango"))
    println(listArray(arrayOf("Wanja", "Wamboi", "Washu")))

}
//Create a function called isEven( ) that returns true when the number
//passed to it is even or returns false when the number passed to it is odd
fun isEven(x:Int):Boolean{
    if (x%2==0){
        return true
    }
    else{
        return false
    }
}

//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
data class Product(val name:String, val weight:Double, val price:Int, val category:String){
    fun goods(){
        when (category){
            "Hygiene"->(println(listOf(category)))
            "Groceries"->(println(listOf(name,category)))
            else -> println(listOf(category))
        }
    }
}

//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn”
 fun evenIndices(fruit:String):String{
     var fruitName = " "

    for (letter in fruit){
      if (fruit.indexOf(letter)%2==0){
          fruitName += letter
      }
    }
    return fruitName
 }

//Write a function that given an array of strings returns a list of strings
//whose lengths are even. For example given [“Mary”, “adama”, “apple”] it
//will return [“Mary”]
fun listArray(people:Array<String>):MutableList<String>{
    var listName = mutableListOf<String>()
     for (a in people){
         if(a.length%2==0){
             listName.add (a)
         }
     }
    return listName
}