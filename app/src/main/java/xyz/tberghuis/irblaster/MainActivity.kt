package xyz.tberghuis.irblaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import xyz.tberghuis.irblaster.ui.IrDemo
import xyz.tberghuis.irblaster.ui.OpenFileDemo
import xyz.tberghuis.irblaster.ui.WebviewDemo
import xyz.tberghuis.irblaster.ui.theme.IRBlasterTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      IRBlasterTheme {
        Surface(color = MaterialTheme.colors.background) {
//          IrDemo()
//          WebviewDemo()
          OpenFileDemo()
        }
      }
    }
  }
}
