function Button({ label, pattern }) {
  function handleClick() {
    console.log("button click", pattern);
  }

  return (
    <div className="my-button">
      <input type="button" value={label} onClick={handleClick} />
    </div>
  );
}

export default Button;
