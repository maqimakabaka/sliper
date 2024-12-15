package com.example.sliper

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ScreenOnReceiver(private val service: UnlockService) : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_SCREEN_ON) {
            repeat(3) {
                service.simulateSwipe() // 模拟滑动
                Thread.sleep(1000) // 间隔1秒
            }
        }
    }
}
