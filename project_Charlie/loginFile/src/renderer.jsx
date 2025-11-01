import { createRoot } from "react-dom/client";
import MyTextInput from "./textbox.jsx";
import MyTextInput2 from "./textbox2.jsx";
import MyButton from "./button.jsx";
const App = () => {
  return (
    <div
      style={{
        height: "100vh",
        display: "flex",
        flexDirection: "column",
        justifyContent: "center",
        alignItems: "center",
      }}
    >
      <h2>Enter Information</h2>
      <MyTextInput />
      <MyTextInput2 />
      <br />
      <MyButton />
    </div>
  );
};

const container = document.getElementById("root");
const root = createRoot(container);
root.render(<App />);
