package com.example.class20240130

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

var data = 10

fun formatData(date:Date): String{
    val sdformat = SimpleDateFormat("yyyy-mm-dd")
    return sdformat.format(date)
}
val data4: Int by lazy {
    println("in lazy.......")
    10
}
class User {
    var name = "hello"
    var name2 : String = "data"

    fun sayHello(){
        println("name : $name")
    }
}

fun main(){
    println("Hello kotlin")
    val str = """
        안녕하세요?
        오늘 날씨는
        맑습니다.
    """
    println(str)
    val str2 = "문자열 템플릿"
    println("문자열 : $str2")

    fun some(data1: Int = 100, data2: Int): Int{
        return data1 + data2
    }
    println("기본값 결과 : " + some(data2=300)) // 100+300

    println("배열 결과 출력")
    val arr: Array<String> = Array(3, {""})
    arr[0] = "일"
    arr[1] = "이"
    arr.set(2, "삼")

    println(arr.get(0))
    println(arr[1])
    println(arr.get(2))

    var list = listOf<Int>(10, 20, 30)
    println(
        """
    list size : ${list.size}
    list data : ${list[0]}, ${list.get(1)}, ${list.get(2)}
        """
    )

    var mutableList = mutableListOf<Int>(10, 20, 30)
    mutableList.add(3, 40)
    mutableList.set(0, 50)
    println(
        """
    list size : ${mutableList.size}
    list data : ${mutableList[0]}, ${mutableList.get(1)}, ${mutableList.get(2)}, ${mutableList.get(3)}
        """
    )


}