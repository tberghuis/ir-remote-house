package xyz.tberghuis.irblaster.ui

import android.content.Context
import android.hardware.ConsumerIrManager
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import xyz.tberghuis.irblaster.IrCommand


@Composable
fun IrDemo() {

  val context = LocalContext.current


  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Button(onClick = {
      Log.d("xxx", "hello button")

      // do this in default context?

      val irMan = context.getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager
      val pattern: IntArray = intArrayOf(
        340,
        170,
        22,
        21,
        22,
        21,
        22,
        21,
        22,
        21,
        22,
        21,
        22,
        21,
        22,
        63,
        22,
        21,
        22,
        63,
        22,
        63,
        22,
        63,
        22,
        63,
        22,
        63,
        22,
        63,
        22,
        21,
        22,
        63,
        22,
        21,
        22,
        63,
        22,
        21,
        22,
        21,
        22,
        63,
        22,
        21,
        22,
        21,
        22,
        21,
        22,
        63,
        22,
        21,
        22,
        63,
        22,
        63,
        22,
        21,
        22,
        63,
        22,
        63,
        22,
        63,
        21,
        1
      )

      val p2 = pattern.map { it * 1000000 / 38000 }.toIntArray()

      irMan.transmit(38000, p2)

//      val cmd =
//        "38000,340,170,22,21,22,21,22,21,22,21,22,21,22,21,22,63,22,21,22,63,22,63,22,63,22,63,22,63,22,63,22,21,22,63,22,21,22,63,22,21,22,21,22,63,22,21,22,21,22,21,22,63,22,21,22,63,22,63,22,21,22,63,22,63,22,63,21,1"
//      IrCommand.irCommand(context, cmd)


    }) {
      Text(text = "Hello demo!")
    }
  }


}
