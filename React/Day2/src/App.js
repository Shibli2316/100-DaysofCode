import { useState } from "react";
import "./App.css";
import Navbar from "./components/Navbar";
import Textforms from "./components/Textforms";
import About from "./components/About";
import Alert from "./components/Alert";
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";


function App() {
  const [mode, setMode] = useState('light'); //Weather dark mode is enabeled or not
  const [alert, setAlert] = useState(null);

  const showAlert = (message, type) => {
    setAlert({
      msg: message,
      type: type
    })
    setTimeout(() => {
      setAlert(null);
    }, 1500);
  }

  const toggleMode = () => {
    if (mode === 'light') {
      setMode('dark');
      document.body.style.backgroundColor = '#042743';
      showAlert('Dark-mode has been enabled', 'success');
    }
    else {
      setMode('light');
      document.body.style.backgroundColor = 'white';
      showAlert('Light-mode has been enabled', 'success');
    }
  }

  return (
    <>
      <Router>
        <Navbar title="TextUtils" aboutText="About" mode={mode} toggleMode={toggleMode} />
        <Alert alert={alert} />
        <div className="container my-3">
          <Switch>
            <Route path="/about">
              <About />
            </Route>
            <Route path="/">
              <Textforms heading="Enter the text to analyze" mode={mode} showAlert={showAlert} />
            </Route>
          </Switch>
        </div>
      </Router>

      {/* <About/> */}
    </>
  );
}

export default App;
