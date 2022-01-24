package xyz.tberghuis.irblaster.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import xyz.tberghuis.irblaster.ui.vm.RemoteViewModel

@Composable
fun OpenFileDemo() {


  val remoteViewModel = hiltViewModel<RemoteViewModel>()


  // ACTION_GET_CONTENT load string into room db

  Column {
    Text("open file demo")
    Text("open file demo ${remoteViewModel.helloRemoteViewModel}")
  }
}