package com.example.class20240131

class NullEx {
}

fun main(){
    var data: String? =null
    println("data length : ${data?.length ?: 0}")

    // 널 허용 - ? 연산자
    var data1: String = "kim"
    var data2: String? = "kim"

//    data1 = null // data1은 null 허용이 아니라 오류
    data2 = null

    // 널 안정성 호출 - ?. 연산자
    var test: String? = "kim"
//    var length = test.length // 오류 발생
    var length2 = test?.length // test값이 null일 경우 null 리턴 / test 값이 null이 아닐경우 test.length 리턴

    // 엘비스 - ?: 연산자
    test = null
    println("test data = $test : ${test?.length?:-1}")

    // 예외 발생 - !! 연산자
    // 널일 때 예외(exception)를 일으키는 연산자
    fun nullFun(data: String?) :Int{
        return data!!.length
    }

//    println(nullFun(null))
}