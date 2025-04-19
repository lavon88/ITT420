package com.example.departmentitapp

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SocialMediaActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_media)

        webView = findViewById(R.id.webViewSocial)
        setupWebView()

        val btnFacebook: Button = findViewById(R.id.btnFacebook)
        val btnInstagram: Button = findViewById(R.id.btnInstagram)
		val btnTwitter: Button = findViewById(R.id.btnTwitter)


		btnTwitter.setOnClickListener {
			webView.loadUrl("https://twitter.com/uccjamaica")
		}

        btnFacebook.setOnClickListener {
             webView.loadUrl("https://m.facebook.com/uccjamaica/")
        }

        btnInstagram.setOnClickListener {
            webView.loadUrl("https://www.instagram.com/uccjamaica/?hl=en")
        }
    }

    private fun setupWebView() {
    webView.webViewClient = object : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            url?.let { view?.loadUrl(it) }
            return true
        }
    }

    webView.settings.apply {
        javaScriptEnabled = true
        domStorageEnabled = true
        cacheMode = WebSettings.LOAD_NO_CACHE  // Avoid cached issues
        loadsImagesAutomatically = true
        useWideViewPort = true
        loadWithOverviewMode = true
    }

    webView.clearCache(true)
    webView.clearHistory()
}
}