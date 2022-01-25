// import { useState } from "react";
import Button from "./components/Button";
import * as patterns from "./patterns";
import { FaBeer } from "react-icons/fa";
import "./App.css";

function App() {
  return (
    <div className="my-remote-container">
      <div className="">JVC TV</div>
      <br />
      <Button icon={<FaBeer />} label="power" pattern={patterns.PTN_POWER} />
      <Button label="mute" pattern={patterns.PTN_MUTE} />

      <Button className="" label="back" pattern={patterns.PTN_BACK} />

      <Button label="up" pattern={patterns.PTN_UP} />
      <div className="space-x-3">
        <Button label="<-" pattern={patterns.PTN_LEFT} />
        <Button label="ok" pattern={patterns.PTN_OK} />
        <Button label="->" pattern={patterns.PTN_RIGHT} />
      </div>
      <Button label="down" pattern={patterns.PTN_DOWN} />

      <Button label="vol+" pattern={patterns.PTN_VOLUP} />
      <Button label="vol-" pattern={patterns.PTN_VOLDOWN} />

      <div className="space-x-3">
        <Button label="source" pattern={patterns.PTN_SOURCE} />
        <Button label="netflix" pattern={patterns.PTN_NETFLIX} />
      </div>

      <div className="space-x-3">
        <Button label="play" pattern={patterns.PTN_PLAY} />
        <Button label="pause" pattern={patterns.PTN_PAUSE} />
      </div>

      <div className="space-x-3">
        <Button label="<<" pattern={patterns.PTN_REWIND} />
        <Button label="|<<" pattern={patterns.PTN_SKIPPREV} />
        <Button label=">>|" pattern={patterns.PTN_SKIPNEXT} />
        <Button label=">>" pattern={patterns.PTN_FFWD} />
      </div>
    </div>
  );
}

export default App;
