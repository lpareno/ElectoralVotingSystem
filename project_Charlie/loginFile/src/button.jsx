import React from 'react';

function MyButton() {
  const handleClick = () => {
    alert('Button clicked!');
  };

  return (
    <button onClick={handleClick}>
      Login
    </button>
  );
}
export default MyButton;