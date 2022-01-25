function Button({ pattern }) {
  function handleClick() {
    console.log("button click", pattern);
  }

  return (
    <div className="my-button">
      <input type="button" value="jvc power" onClick={handleClick} />
    </div>
  );
}

export default Button;
