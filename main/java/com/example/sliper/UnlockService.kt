package com.example.sliper
import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.GestureDescription
import android.graphics.Path
import android.view.accessibility.AccessibilityEvent

class UnlockService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // 无需处理事件
    }

    override fun onInterrupt() {
        // 无障碍服务被中断时的逻辑
    }

    fun simulateSwipe() {
        val path = Path().apply {
            moveTo(540f, 1800f) // 起点
            lineTo(540f, 1000f) // 终点
        }

        val gesture = GestureDescription.Builder()
            .addStroke(GestureDescription.StrokeDescription(path, 0, 500))
            .build()

        dispatchGesture(gesture, null, null)
    }
}

