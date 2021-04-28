package com.zsj.eventdispatch

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {
  private val TAG = Static.TAG1

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }


  override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
    if (ev.action == MotionEvent.ACTION_DOWN) {
      //Log.i(TAG, Static.dispatchTouchEvent+"经理,我准备发展一下电商业务,下周之前做一个淘宝出来.");
      //Log.i(TAG, Static.dispatchTouchEvent+"把按钮做的好看一点,要有光泽,给人一种点击的欲望.");
      Log.i(TAG, Static.dispatchTouchEvent + "现在项目做到什么程度了?")
    }
    return super.dispatchTouchEvent(ev)
  }

  override fun onTouchEvent(event: MotionEvent): Boolean {
    if (event.action == MotionEvent.ACTION_DOWN) {
      //Log.i(TAG, Static.onTouchEvent+"这么简单都做不了,你们都是干啥的(愤怒).");
      Log.i(TAG, Static.onTouchEvent)
    }
    return super.onTouchEvent(event)
  }
}