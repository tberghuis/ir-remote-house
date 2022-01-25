// import { useState } from "react";
import Button from "./components/Button";
import * as patterns from "./patterns";
import "./App.css";

function App() {
  // const [count, setCount] = useState(0);

  return (
    <div className="my-remote">
      <div>JVC TV</div>
      <br />
      <Button label="power" pattern={patterns.PTN_POWER} />
      <br />
      <br />
      <Button label="mute" pattern={patterns.PTN_MUTE} />
      <br />
      <div>todo...</div>
    </div>
  );
}

export default App;
