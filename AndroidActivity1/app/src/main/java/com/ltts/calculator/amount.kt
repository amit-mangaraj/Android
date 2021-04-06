package com.ltts.calculator

import java.util.*


fun main(args : Array<String>) {
    val reader = Scanner(System.`in`)
    println("Enter the quantity:")
    val quantity = reader.nextInt()
    println("Enter the unit  price of the sold item")
    val unitprice = reader.nextInt()
    val billAmount =  quantity * unitprice
    println("the calculated bill amount is $billAmount ")
    val discountedbill = (billAmount * 15)/100
    val TotalAmount = billAmount-discountedbill

    val FinalValue ="""
        the bill you got 
        1. quantity= $quantity
        2. unit price of the sold item is = $unitprice
        3. calculated bill without discount = $billAmount
        4. calculated bill with 15% discount = $discountedbill
        5.total money you have to pay $TotalAmount
        
    """
    println(FinalValue)
}