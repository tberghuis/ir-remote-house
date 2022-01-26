// import { useState } from "react";
import Button from "./components/Button";
import * as patterns from "./patterns";
import {
  FaPowerOff,
  FaArrowUp,
  FaArrowLeft,
  FaArrowRight,
  FaArrowDown,
  FaPlay,
  FaBackspace,
  FaStepBackward,
  FaPause,
  FaStepForward,
  FaCog,
  FaHome,
  FaBars,
} from "react-icons/fa";
import "./App.css";

function App() {
  return (
    <div className="flex flex-col items-center space-y-6 text-4xl my-8">
      <div className="">x96Air</div>

      <div className="space-x-6">
        <Button icon={<FaPowerOff />} pattern={patterns.PTN_POWER} />
      </div>
      <div className="space-x-6">
        <Button icon={<FaCog />} pattern={patterns.PTN_SETTINGS} />
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

      <div className="space-x-6">
        <Button icon={<FaHome />} pattern={patterns.PTN_HOME} />
        <Button icon={<FaBars />} pattern={patterns.PTN_MENU} />
      </div>

      <div className="flex space-x-6">
        <Button icon={<FaStepBackward />} pattern={patterns.PTN_SKIPPREV} />
        <Button
          className="flex"
          icon={
            <>
              <FaPlay />
              <FaPause />
            </>
          }
          pattern={patterns.PTN_PLAYPAUSE}
        />
        <Button icon={<FaStepForward />} pattern={patterns.PTN_SKIPNEXT} />
      </div>
    </div>
  );
}

export default App;
