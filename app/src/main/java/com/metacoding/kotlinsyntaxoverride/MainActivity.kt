package com.metacoding.kotlinsyntaxoverride

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var child = Child()
        child.showMoney()
    }
}

//상속을 사용하는 이유
//1. 기존에 작성된 코드를 재활용하기 위해서
//2. 코드를 재활용할 때, 체계적인 구조로 사용하기 위해서
open class Parent{//상속이 가능하게 하려면 맨 앞에 open이라는 키워드를 붙여야 한다.
    var money = 500000000
    var house = "강남 200평 아파트"

}

class Child : Parent(){//상속받은 대상의 값을 사용하기 위해서는 초기화'()'를 해줘야 한다.

    //상속 받으면 아빠 클래스의 프로퍼티와 메서드를 내 것처럼 사용할 수 있다.
    fun showMoney(){
        Log.d("클래스","money = ${money}")
    }


}