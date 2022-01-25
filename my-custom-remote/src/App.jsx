// import { useState } from "react";
import Button from "./components/Button";
import * as patterns from "./patterns";
import "./App.css";

function App() {
  // const [count, setCount] = useState(0);

  return (
    <div className="App">
      <div>hello app</div>
      <Button pattern={patterns.PTN_JVC_POWER} />
      <Button pattern={patterns.PTN_X96_POWER} />
    </div>
  );
}

export default App;
