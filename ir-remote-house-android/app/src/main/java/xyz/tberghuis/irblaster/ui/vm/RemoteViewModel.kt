package xyz.tberghuis.irblaster.ui.vm

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RemoteViewModel
@Inject constructor(
  // SavedStateHandle get navigation path on init i.e. /my-tv-remote
  savedStateHandle: SavedStateHandle
) : ViewModel() {
  val helloRemoteViewModel = "remote view model"
}