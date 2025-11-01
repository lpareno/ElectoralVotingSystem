import { useState } from "react";

function MyTextInput2() {
  const [inputValue2, setInputValue2] = useState("");

  const handleChange2 = (event) => {
    setInputValue2(event.target.value);
  };

  return (
    <div>
      <input
        type="text"
        id="my-text-input"
        value={inputValue2}
        onChange={handleChange2}
        placeholder="Password..."
      />
    </div>
  );
}

export default MyTextInput2;