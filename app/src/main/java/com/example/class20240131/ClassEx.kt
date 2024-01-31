package com.example.class20240131

class ClassEx(var name: String){
    // 생성자, 변수, 함수, 클래스
    // 변수
//    var name: String
//    var count: Int
    init{
        this.name = name
        println("주생성자 입니다.")

    }

    // constructor

    // 생성자
//    constructor(name: String){
//        this.name = name
//    }

    // 보조 생성자
    constructor(name: String, count: Int) :this(name){
        this.name = name
//        this.count
    }
    constructor(name: String, count: Int, addr: String) :this(name, count){
        this.name = name
    }

    // 함수
    fun show(){
        println("함수입니다.")
        println("name : ${name}")
    }

    // 클래스
    class otherClass{

    }
}

fun main(){
    val classEx = ClassEx("kim", 10)
//    classEx.name = "lee"
    classEx.show()

}