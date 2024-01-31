package com.example.class20240131

class visibilityEx {

}

// 접근제한자
// 클래스의 멤버를 외부에 허용하는 범위
// public, internal, protected, private

open class Super2{
    var publicData = 10
    protected var protectedData = 20
    private var privateData = 30
}
class Sub2: Super2() {
    fun subFun() {
        publicData++ // 성공
        protectedData++ // 성공
//        privateDate++ // 실패
    }
}
fun main(){
    val obj = Super2()
    obj.publicData++ // 성공
//    obj.protectedData++ // 실패
//    obj.privateDate++ // 실패
}