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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import xyz.tberghuis.irblaster.IrCommand


@Composable
fun IrDemo() {

  val context = LocalContext.current

  val irMan = remember {
    context.getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager
  }






  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Button(onClick = {
      Log.d("xxx", "hello button")

      // do this in default context?

//      val irMan = context.getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager
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
    Text("some space")
    Mode2(irMan)
    Text("some space")
    EasyFanOn(irMan)
  }


}


@Composable
fun Mode2(irMan: ConsumerIrManager) {
  Button(onClick = {
    Log.d("xxx", "mode2 click")

    val pattern: IntArray = intArrayOf(
      8959, 4458,
      554,
      511,
      575,
      554,
      575,
      554,
      597,
      533,
      597,
      533,
      597,
      533,
      597,
      1642,
      575,
      554,
      597,
      1642,
      575,
      1663,
      597,
      1642,
      575,
      1663,
      597,
      1642,
      575,
      1663,
      575,
      554,
      597,
      1642,
      575,
      554,
      575,
      1663,
      597,
      533,
      575,
      554,
      597,
      1642,
      575,
      554,
      597,
      533,
      597,
      533,
      597,
      1642,
      575,
      554,
      575,
      1663,
      575,
      1663,
      575,
      533,
      575,
      1663,
      575,
      1663,
      575,
      1663,
      597,
      39637,
      8959,
      2197,
      554,
      96277,
      8959,
      2197,
      533
    )

    irMan.transmit(38000, pattern)


  }) {
    Text(text = "mode2")
  }
}


@Composable
fun EasyFanOn(irMan: ConsumerIrManager) {
  Button(onClick = {
    Log.d("xxx", "EasyFanOn click")
    val pattern: IntArray = intArrayOf(
      1258,
      383,
      1279,
      383,
      426,
      1215,
      1279,
      383,
      1279,
      383,
      426,
      1237,
      426,
      1237,
      426,
      1237,
      426,
      1237,
      426,
      1237,
      1279,
      383,
      405,
      7999,
      1279,
      383,
      1279,
      383,
      426,
      1237,
      1279,
      383,
      1258,
      383,
      405,
      1258,
      426,
      1237,
      405,
      1258,
      405,
      1258,
      405,
      1258,
      1258,
      405,
      405,
      8063,
      1301,
      362,
      1258,
      405,
      405,
      1258,
      1258,
      405,
      1258,
      405,
      405,
      1258,
      405,
      1258,
      405,
      1258,
      405,
      1258,
      405,
      1258,
      1258,
      405,
      405,
      7999,
      1258,
      405,
      1258,
      405,
      405,
      1258,
      1258,
      405,
      1258,
      405,
      405,
      1258,
      405,
      1258,
      405,
      1258,
      405,
      1258,
      405,
      1258,
      1258,
      405,
      405,
      8063,
      1258,
      405,
      1258,
      405,
      405,
      1258,
      1258,
      405,
      1258,
      405,
      405,
      1258,
      405,
      1258,
      405,
      1258,
      405,
      1258,
      405,
      1258,
      1258,
      405,
      405,
      7999,
      1258,
      405,
      1301,
      362,
      405,
      1258,
      1322,
      341,
      1258,
      405,
      426,
      1237,
      405,
      1258,
      405,
      1258,
      426,
      1237,
      405,
      1258,
      1258,
      405,
      405
    )
    irMan.transmit(38000, pattern)
  }) {
    Text(text = "EasyFanOn")
  }
}
