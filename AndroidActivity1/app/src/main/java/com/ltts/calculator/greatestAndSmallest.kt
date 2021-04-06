package com.ltts.calculator

val findgreatestandSmallest = fun(myarray: Array<Int>): Int {
    var minmum:Int=myarray[0];
    var largest:Int=myarray[0]
    for (i in myarray) {
        if (largest < i)
            largest = i
    }
    for (number in myarray) {
        if (minmum > number)
            minmum = number
    }
    println("smallest")
    println(minmum)
    println("largest")
    println(largest)
    return 1;

}
fun main(args:Array<String>){
    val a = arrayOf(1, 2, 3, 4, 5,2)

    findgreatestandSmallest(a)
}