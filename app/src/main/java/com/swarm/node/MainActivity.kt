package com.swarm.node

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Создаем WebView (мини-браузер внутри приложения)
        val webView = WebView(this).apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true // Разрешаем работу скриптов (для нашего таймлайна)
            settings.domStorageEnabled = true
            
            // Грузим наш локальный сервер. В будущем здесь будет IP другого узла Стаи!
            loadUrl("http://192.168.0.115:5001") 
        }
        
        setContentView(webView)
    }
}
