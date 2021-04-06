package com.ltts.calculator

import java.util.*

fun calpercentage(Sub1:Double,Sub2:Double,Sub3:Double):Double{
    val Total:Double = Sub1+Sub2+Sub3
    println("Total marks of the student is $Total")
    val per:Double = Total/3
    return per%100
}


fun main(args:Array<String>){
println("Enter the Subjects marks obtained")
    val reader = Scanner(System.`in`)
    val sub1 = reader.nextDouble()
    val sub2 = reader.nextDouble()
    val sub3 = reader.nextDouble()

    val Percentage:Double = calpercentage(sub1,sub2,sub3)
    println("Percntage of the Student is $Percentage")
}