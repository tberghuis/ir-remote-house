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
    <div className={classNames("my-button", className)}>
      <input type="button" value={label} onClick={handleClick} />
    </div>
  );
}

export default Button;
