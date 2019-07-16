package com.example.alcwithgooglechallenge

import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.example.alcwithgooglechallenge.databinding.ActivityAboutUsBinding

class AboutUs : AppCompatActivity() {

    lateinit var binding : ActivityAboutUsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about_us)
        binding.webview.getSettings().javaScriptEnabled = true
        binding.webview.webViewClient = object : WebViewClient() {
            override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {
                handler.proceed()
            }
        }

        binding.webview.loadUrl("https://andela.com/alc/")
    }
}
