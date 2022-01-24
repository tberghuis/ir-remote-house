package xyz.tberghuis.irblaster.ui

import android.content.Context
import android.hardware.ConsumerIrManager
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView


@Composable
fun WebviewDemo() {
  val context = LocalContext.current
  val url = remember { mutableStateOf("file:///android_asset/demo.html") }
  val launcher =
    rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) { result ->
      // TODO deal with null result
      url.value = result!!.toString()
    }


  Column {
    Button(onClick = {
      launcher.launch("text/html")
    }) {
      Text("pick html file")
    }

    AndroidView(factory = {
      WebView(context).apply {
        webViewClient = WebViewClient()
        settings.javaScriptEnabled = true
        addJavascriptInterface(WebAppInterface(context), "Android")
        //      loadUrl("file:///android_asset/demo.html")
        //loadData()
      }
    }, update = {
      it.loadUrl(url.value)
    })
  }
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

