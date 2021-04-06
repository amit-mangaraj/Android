package com.ltts.calculator
import java.util.*


fun main(args: Array<String>) {
    var number:Int;
    val reader = Scanner(System.`in`)
    println("Enter the number:")
    number = reader.nextInt()
    var i:Int;
    i=2;
    while(number>0){
        if(isPrime(i)) {
            println(i)
            number--;
            i++
        }
        else{
            i++
        }
    }
}

//funtion to find prime
fun isPrime(i:Int):Boolean{
    var count:Int;
    count=0;

    for(j in 1..i){
        if(i%j==0){
            count++
        }
    }
    if(count>2){
        return false
    }
    else{
        return true
    }
}