// import { useState } from "react";
import Button from "./components/Button";
import * as patterns from "./patterns";
import "./App.css";

function App() {
  return (
    <div className="my-remote">
      <div>JVC TV upload</div>
      <br />
      <Button label="power" pattern={patterns.PTN_POWER} />
      <Button label="mute" pattern={patterns.PTN_MUTE} />

      <Button label="back" pattern={patterns.PTN_BACK} />

      <Button label="up" pattern={patterns.PTN_UP} />
      <div className="row">
        <Button label="left" pattern={patterns.PTN_LEFT} />
        <Button label="ok" pattern={patterns.PTN_OK} />
        <Button label="right" pattern={patterns.PTN_RIGHT} />
      </div>
      <Button label="down" pattern={patterns.PTN_DOWN} />

      <Button label="vol+" pattern={patterns.PTN_VOLUP} />
      <Button label="vol-" pattern={patterns.PTN_VOLDOWN} />

      <Button label="source" pattern={patterns.PTN_SOURCE} />

      <Button label="netflix" pattern={patterns.PTN_NETFLIX} />

      <Button label="play" pattern={patterns.PTN_PLAY} />
      <Button label="pause" pattern={patterns.PTN_PAUSE} />

      <Button label="<<" pattern={patterns.PTN_REWIND} />
      <Button label="|<<" pattern={patterns.PTN_SKIPPREV} />
      <Button label=">>|" pattern={patterns.PTN_SKIPNEXT} />
      <Button label=">>" pattern={patterns.PTN_FFWD} />
    </div>
  );
}

export default App;
