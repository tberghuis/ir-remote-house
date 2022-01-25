// var classNames = require('classnames');
import classNames from "classnames";

function Button({ className, label, pattern }) {
  // const childClassNames = classNames("child-class", className);

  function handleClick() {
    if (window.Android) {
      // window.Android.transmit(pattern);
      window.Android.transmitArray(pattern);
    }
    console.log("button click", pattern);
  }

  return (
    <button
      className="bg-black text-white font-bold py-1 px-2 rounded"
      onClick={handleClick}
    >
      {label}
    </button>
  );
}

export default Button;
