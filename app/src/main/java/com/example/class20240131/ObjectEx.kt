package com.example.class20240131

open class ObjectEx {
    open var data = 10
    open fun show(){
        println("super의 show() 함수 $data")
    }
}

// 오브젝트 클래스
val obj = object: ObjectEx() {
    override var data = 10
    override fun show(){
        println("data : $data")
    }
}

class MyClass{
    companion object{
        var data = 10
        fun some(){
            println(data)
        }
    }
}
fun main(){
    obj.data = 20
    obj.show()

    MyClass.data = 20
    MyClass.some()
}