package xyz.tberghuis.irblaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import dagger.hilt.android.AndroidEntryPoint
import xyz.tberghuis.irblaster.ui.WebviewDemo
import xyz.tberghuis.irblaster.ui.theme.IRBlasterTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      IRBlasterTheme {
        Surface(color = MaterialTheme.colors.background) {
          WebviewDemo()
        }
      }
    }
  }
}
