// import { useState } from "react";
import Button from "./components/Button";
import * as patterns from "./patterns";
import {
  FaPowerOff,
  FaVolumeMute,
  FaArrowUp,
  FaArrowLeft,
  FaArrowRight,
  FaArrowDown,
  FaPlay,
  FaBackspace,
  FaBackward,
  FaPause,
  FaForward,
  FaFastBackward,
  FaFastForward,
} from "react-icons/fa";
import "./App.css";

function App() {
  return (
    <div className="flex flex-col items-center space-y-6 text-4xl my-8">
      <div className="">JVC TV</div>

      <div className="space-x-6">
        <Button icon={<FaPowerOff />} pattern={patterns.PTN_POWER} />
        <Button icon={<FaVolumeMute />} pattern={patterns.PTN_MUTE} />
      </div>
      <div>
        <Button icon={<FaBackspace />} pattern={patterns.PTN_BACK} />
      </div>
      <div>
        <Button icon={<FaArrowUp />} pattern={patterns.PTN_UP} />
      </div>
      <div className="space-x-6">
        <Button icon={<FaArrowLeft />} pattern={patterns.PTN_LEFT} />
        <Button label="ok" pattern={patterns.PTN_OK} />
        <Button icon={<FaArrowRight />} pattern={patterns.PTN_RIGHT} />
      </div>
      <div>
        <Button icon={<FaArrowDown />} pattern={patterns.PTN_DOWN} />
      </div>

      <div>
        <Button label="vol +" pattern={patterns.PTN_VOLUP} />
      </div>
      <div>
        <Button label="vol -" pattern={patterns.PTN_VOLDOWN} />
      </div>

      <div className="space-x-6">
        <Button label="source" pattern={patterns.PTN_SOURCE} />
        <Button label="netflix" pattern={patterns.PTN_NETFLIX} />
      </div>

      <div className="space-x-6">
        <Button icon={<FaPlay />} pattern={patterns.PTN_PLAY} />
        <Button icon={<FaPause />} pattern={patterns.PTN_PAUSE} />
      </div>

      <div className="space-x-6">
        <Button icon={<FaBackward />} pattern={patterns.PTN_REWIND} />
        <Button icon={<FaFastBackward />} pattern={patterns.PTN_SKIPPREV} />
        <Button icon={<FaFastForward />} pattern={patterns.PTN_SKIPNEXT} />
        <Button icon={<FaForward />} pattern={patterns.PTN_FFWD} />
      </div>
    </div>
  );
}

export default App;
