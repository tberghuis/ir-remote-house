import { useState } from "react";
import logo from "./logo.svg";

import Button from "./components/Button";

import "./App.css";

function App() {
  const [count, setCount] = useState(0);

  return (
    <div className="App">
      <div>hello app</div>
      <Button />
    </div>
  );
}

export default App;
