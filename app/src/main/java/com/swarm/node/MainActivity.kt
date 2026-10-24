package com.swarm.node

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Создаем простой текстовый интерфейс для первого запуска
        val textView = TextView(this).apply {
            text = "🧠 Узел Стаи запущен!\n\nЗдесь скоро появится наш Помогатор."
            textSize = 24f
            setPadding(50, 200, 50, 50)
        }
        
        setContentView(textView)
    }
}
