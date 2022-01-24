package xyz.tberghuis.irblaster.ui

import android.content.Context
import android.hardware.ConsumerIrManager
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView


@Composable
fun WebviewDemo() {

  val context = LocalContext.current

  AndroidView(factory = {
    WebView(context).apply {

      // do i need this
      webViewClient = WebViewClient()
//      webChromeClient
      settings.javaScriptEnabled = true

      addJavascriptInterface(WebAppInterface(context), "Android")
      loadUrl("file:///android_asset/demo.html")
    }
  })
}

class WebAppInterface(private val context: Context) {

  private val irMan = context.getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager


  /** Show a toast from the web page  */
  @JavascriptInterface
  fun showToast(toast: String) {
    Toast.makeText(context, toast, Toast.LENGTH_SHORT).show()
  }


  @JavascriptInterface
  fun transmit(sPattern: String) {
    val pattern = sPattern.split(",").map { it.toInt() }.toIntArray()
    irMan.transmit(38000, pattern)
  }

}
