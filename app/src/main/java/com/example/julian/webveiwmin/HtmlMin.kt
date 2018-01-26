package com.example.julian.webveiwmin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebSettings



class HtmlMin : AppCompatActivity() {

    var html =
        """
        <html>
        <style>
        </style>
        <body>This is my <b>Html</b> öäü.

        <div lang="en"> Some japanese 泡浅い褐 lang="en"<div />
        <div lang="ja"> Some japanese 泡浅い褐 lang="ja"<div />
        <div lang="zh-Hans"> Some japanese 泡浅い褐 lang="zh-Hans"<div />

        </body>
        </html>
        """.trimIndent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        setContentView(webView)


        // This does not change anyting
        val settings = webView.getSettings()
        settings.setDefaultTextEncodingName("utf-8")

        // Read local string
        webView.loadData(html, "text/html; charset=utf-8", null)
//        webView.loadData(html, "text/html", "utf-8")


        // Read from website
//        webView.loadUrl("https://www.w3.org/People/D%C3%BCrst/SFC/2004/0418Hagino.html")
    }

}
