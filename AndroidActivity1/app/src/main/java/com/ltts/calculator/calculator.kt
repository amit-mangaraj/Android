package com.ltts.calculator
import java.util.*

fun main(args:Array<String>){
println("Enter the number")
    val reader = Scanner(System.`in`)
    val num1 = reader.nextDouble()
    val num2 = reader.nextDouble()

    println("Enter the operation +,-,/,*")

    val operand = reader.next()[0]
    val result: Double
    when(operand){
        '+'->result=num1+num2
        '-'->result=num1-num2
        '*'->result =num1*num2
        '/'->result= num1/num2

     else->{
         println("error! Operator not present")
         return
     }
    }
    println("$num1 $operand $num2"+"="+result)

}