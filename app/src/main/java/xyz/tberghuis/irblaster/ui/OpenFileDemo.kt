package xyz.tberghuis.irblaster.ui

import android.content.Intent
import android.net.Uri
import android.provider.DocumentsContract
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.hilt.navigation.compose.hiltViewModel
import xyz.tberghuis.irblaster.ui.vm.RemoteViewModel

//@Composable
//fun OpenFileDemo() {
//  val remoteViewModel = hiltViewModel<RemoteViewModel>()
//  // ACTION_GET_CONTENT load string into room db
//  Column {
//    Text("open file demo")
//    Text("open file demo ${remoteViewModel.helloRemoteViewModel}")
//  }
//}


//const val PICK_HTML_FILE = 2
//
//fun openFile() {
//  val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
//    addCategory(Intent.CATEGORY_OPENABLE)
//    type = "application/pdf"
//  }
//
//  startActivityForResult(intent, PICK_HTML_FILE)
//}


@Composable
fun OpenFileDemo() {
  val context = LocalContext.current

  val launcher =
    rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) { result ->
      // TODO deal with null result
      val item = context.contentResolver.openInputStream(result!!)
      val bytes = item?.readBytes()

//      val htmlString =

      println(bytes)
      item?.close()
    }

  return Column {
    Button(onClick = {
      launcher.launch("text/html")
    }) {
      Text("Open file")
    }
  }
}
