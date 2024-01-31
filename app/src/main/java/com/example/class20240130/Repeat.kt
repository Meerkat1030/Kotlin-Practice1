package com.example.class20240130

import java.util.Scanner


class Repeat {



}
fun main(){
    var data = 10

    if(data > 10){
        println("data > 10")
    } else if(data > 0 && data <= 10){
        println("data > 0 && data <= 10")
    } else {
        println("data <= 0")
    }

    // 표현식을 사용할 때는 else문을 생략할 수 없음
    // if-else 형태나 if-else if-else 형태가 되어야함
    val result = if(data > 0){
        println("data > 0")
        true
    }else{
        println("data <= 0")
        false
    }
    println(result)

    when(data){
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> {
            println("data is not valid data")
        }
    }

    var select: Any = 5
    when(select){
        is String -> println("문자열 타입입니다.")
        20,30 -> println("data is 20 or 30")
        in 1..10 -> println("data is 1..10") // select의 값이 1~10 사이라면
        else -> println("data is not valid")
    }

    var select2 = 3
    when{
        select2 > 10 -> println("10보다 큰 수 입니다.")
        select2 <= 10 -> println("10보다 같거나 작은수 입니다.")
    }

    var result2 = when{
        select2 <= 10 -> println("10보다 작거나 같은 수 입니다.222")
        select2 > 10 -> println("10보다 큰 수 입니다.")
        else -> println("그 외에 수입니다.")
    }
    println(result2)

    // 배열 인덱스만큼 반복
    var arr = arrayOf<Int>(10,20,30)
    for(i in arr.indices){
        print(arr[i])
        if(i!==arr.size -1) print(",")
    }
    println()

    // 인덱스와 데이터를 함께 가져옴
    for((index, value) in arr.withIndex()){
        print(value)
        if(index !== arr.size - 1) print("/")
    }
    println()

    var x = 1
    while (x <= 5){
        println(x++)
    }

    // 1. 1부터 100까지 3의 배수의 합
    var sum = 0
    for(i in 1..100){
        if(i % 3 == 0){
            sum = sum + i
        }
    }
    println(sum)

    // 2. 구구단 출력
    for(i in 1..9){
        for(j in 2..9){
            print("$j X $i = ${i*j}\t")
        }
        println()
    }

    var score = 78
    when{
        score >= 90 -> println("A")
        score >= 80 -> println("B")
        score >= 70 -> println("C")
        score >= 60 -> println("D")
        else -> println("F")
    }
    /*
    * ("love", "rabbit", "orange")값을 가지는 배열 engArr
    * ("사랑", "토끼", "오렌지")의 값을 가지는 배열 korArr
    * 영어 단어를 입력 받아서 한글로 출력하는 프로그램을 작성하세요.
    * ex) 영단어 입력 >> love
    *     사랑
    *     영단어 입력 >> exit
    *     종료합니다..
    * */
//    val engArr: Array<String> = arrayOf("love", "rabbit", "orange")
//    val korArr: Array<String> = arrayOf("사랑", "토끼", "오렌지")
//    var sc: Scanner = Scanner(System.`in`)
//    while (true){
//        print("영어단어 입력 >> ")
//        var userInput = sc.next()
//        val voca = when(userInput){
//            engArr[0] -> korArr[0]
//            engArr[1] -> korArr[1]
//            engArr[2] -> korArr[2]
//            "exit" -> {
//                println("종료합니다.")
//                break
//            }
//            else -> "그런 단어 없음"
//        }
//        println(voca)
//    }
//    val engArr = arrayOf("love", "rabbit", "orange")
//    val korArr = arrayOf("사랑", "토끼", "오렌지")
//    val sc = Scanner(System.`in`)
//
//    while (true) {
//        print("영단어 입력 >> ")
//        val input = sc.nextLine()
//
//        if (input == "exit") {
//            println("종료합니다.")
//            break
//        }
//
//        val index = engArr.indexOf(input)
//        if (index != -1) {
//            val koreanWord = korArr[index]
//            println(koreanWord)
//        } else {
//            println("해당하는 단어를 찾을 수 없습니다.")
//        }
//    }
//
//    // Scanner 닫기 (필수는 아니지만 권장됨)
//    sc.close()

    val engArr: Array<String> = arrayOf("love", "rabbit", "orange")
    val korArr: Array<String> = arrayOf("사랑", "토끼", "오렌지")
    var sc: Scanner = Scanner(System.`in`)

    while (true){
        print("영단어 입력>>")
        var input = sc.next()
        if(input.equals("exit")){
            println("종료합니다")
            break
        }
        var index = 0
        for(i in engArr.indices){
            index = i;
            if(input.equals(engArr.get(i))){
                println(korArr.get(i))
                break;
            }
        }
        if(index == engArr.size - 1){
            println("그런 영어단어는 없습니다.")
        }
    }
    sc.close()
}
