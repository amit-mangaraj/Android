package com.ltts.calculator

import java.util.*
import kotlin.math.PI

 val PI= 3.14


fun calarea(rad:Double):Double{
    return PI*rad*rad
}

fun calperimeter(rad:Double):Double{
    return 2*PI*rad
}

fun calsideofsquare(rad: Double):Double{
    val pericircle = calperimeter(rad)
    val side:Double =pericircle/4
    return side
}
fun main(args:Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter the radius")
    val radius = reader.nextDouble()
    println("1. Calculate area")
    println("2. Calculate perimeter")
    println("3. Calculate side of square")
    val value:Int = reader.nextInt()
    val arreaofcicle= calarea(radius)
    val perimeterofcircle = calperimeter(radius)
    val sideOfSquare = calsideofsquare(radius)
    when(value)
    {
        1 -> println("area of circle is $arreaofcicle")
        2-> println("perimeter of the circle is $perimeterofcircle ")
        3-> println("Side of the square is $sideOfSquare ")
        else->{
            println("No more operations")
        }
    }

}