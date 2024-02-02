package com.example.eventex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import com.example.eventex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // SAM(Single Abstract Method) 기법
        // - 자바 API를 코틀린에서 람다 표현식을 사용할 수 있게  해주는 기법

//        binding.btn1.setOnClickListener({
//            Log.d("test","버튼 1 클릭했습니다.")
//        })
        binding.btn1.setOnClickListener{
            Log.d("test", "클릭 이벤트")
        }

        binding.btn1.setOnLongClickListener{
            Log.d("test", "롱클릭 이벤트")
            true
        }
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_DOWN -> {
                Log.d("test", "Touch down event 발생")
                Log.d("test", "x:${event.x}, rawX:${event.rawX}")
            }
            MotionEvent.ACTION_UP -> {
                Log.d("test", "Touch up event 발생")
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("test", "onKeyDown 발생")
        when(keyCode){
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("test", "볼륨 업 버튼 누름")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("test", "볼륨 다운 버튼 누름")
            KeyEvent.KEYCODE_HOME -> Log.d("test", "홈 버튼 누름")
            KeyEvent.KEYCODE_POWER -> Log.d("test", "전원 버튼 누름")
            KeyEvent.KEYCODE_BACK -> Log.d("test", "뒤로 가기 버튼 누름")
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("test", "onKeyUp 발생")

        return super.onKeyUp(keyCode, event)
    }

    override fun onKeyLongPress(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("test", "onKeyLongPress 발생")
        return super.onKeyLongPress(keyCode, event)
    }
}