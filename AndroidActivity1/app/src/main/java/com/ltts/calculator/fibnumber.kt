package com.ltts.calculator

import java.util.*

fun main()
{
    val sc= Scanner(System.`in`)
    var i=0
    var temp1=0
    var temp2=1
    var temp3=0
    println("Enter the number of terms")
    var n=sc.nextInt()
    println("Fibonacci Series of the following terms is: ")
    for(i in 1 .. n)
    {
        print(temp1)
        print("\t")
        temp3=temp1+temp2
        temp1=temp2
        temp2=temp3
    }

}