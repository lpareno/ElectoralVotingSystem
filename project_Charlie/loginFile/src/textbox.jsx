import { useState } from "react";

function MyTextInput() {
  const [inputValue, setInputValue] = useState("");

  const handleChange = (event) => {
    setInputValue(event.target.value);
  };

  return (
    <div>
      <input
        type="text"
        id="my-text-input"
        value={inputValue}
        onChange={handleChange}
        placeholder="User ID..."
      />
    </div>
  );
}

export default MyTextInput;