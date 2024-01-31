package com.example.class20240131



open class Adder(var a:Int, var b:Int) {
    open fun calc() {
        println("$a + $b = ${a+b}")
    }
}

class Subtracter(a: Int, b: Int) : Adder(a, b) {
    override fun calc(){
        println("$a - $b = ${a-b}")
    }
}

open class Rect{
    open fun draw(){
        println("사각형")
    }
}

class Triangle : Rect() {
    override fun draw(){
        println("삼각형")
    }
}

class Circle : Rect(){
    override fun draw(){
        println("원")
    }
}



fun main() {
    // Adder 클래스를 작성하여
    // 두 수를 전달받아서 더한 값을 리턴해주는 calc() 메서드 작성
    // subtracter 클래스를 작성하여 Add 클래스를 상속받아
    // calc() 두 수를 뺀 값을 리턴해주는 메서드로 재정의하세요
    val add = Adder(20,30)
    add.calc()
    val sub = Subtracter(100,20)
    sub.calc()

    // 사각형을 그리는 Rect라는 클래스 선언
    // draw()라는 함수를 이용해 "사각형" 문자열을 출력
    // "삼각형"을 그리는 Triangle이라는 클래스 선언
    // Rect라는 클래스를 상속받아서 draw() 함수 재정의
    // "원"을 출력하는 Circle(Rect 상속)이라는 클래스 선언
    // 만들 클래스 Rect, Triangle, Circle
    // 만들 공통 함수 draw()

    val rect = Rect()
    rect.draw()
    val triangle = Triangle()
    triangle.draw()
    val circle = Circle()
    circle.draw()
}