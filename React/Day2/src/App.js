// import logo from './logo.svg';
import "./App.css";
// import About from "./components/About";
import Navbar from "./components/Navbar";
import Textforms from "./components/Textforms";
function App() {
  return (
    <>
      <Navbar title="TextUtils" aboutText="About TextUtils" />
      <div className="container my-3">
        <Textforms heading="Enter the text to analyze"/>
        {/* <About/> */}
      </div>
      {/* <Navbar/> */}
    </>
  );
}

export default App;
