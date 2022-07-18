import React, { useState } from 'react'

export default function Textforms(props) {
    const handleUpClick = () => {
        let newText = text.toUpperCase();
        setText(newText);
    }

    const handlelowClick = () => {
        let newText = text.toLowerCase();
        setText(newText);
    }
   
    const handleExtraSpace = () => {
        let newText = text.split(/[ ]+/);
        setText(newText.join[" "]);
    }

    const handleCopy = () => {
        var text = document.getElementById('myBox');
        text.select();
        navigator.clipboard.writeText(text.value);
    }
    
    const handleClear = () => {
        let newText ='';
        setText(newText);
    }

    const handleOnChange = (event) => {
        setText(event.target.value);
    }
    const [text, setText] = useState('');
    // It is a wrong way to change the state is by directly accessing the text it should be done through setText
    // text = "New Text";

    // The correct way to do so is as follows:
    // setText("New Text"); 

    return (
        <>
            <div className='container'>
                <h1>{props.heading}</h1>
                <div className="mb-3">
                    <textarea className="form-control" value={text} onChange={handleOnChange} id="myBox" rows="8"></textarea>
                </div>
                <button className="btn btn-primary mx-2" onClick={handleUpClick}>Convert to uppercase</button>
                <button className="btn btn-primary mx-2" onClick={handlelowClick}>Convert to lowercase</button>
                <button className="btn btn-primary mx-2" onClick={handleCopy}>Copy Text</button>
                <button className="btn btn-primary mx-2" onClick={handleClear}>Clear Text</button>
                <button className="btn btn-primary mx-2" onClick={handleExtraSpace}>Remove Extra Space</button>
            </div>
            <div className="container my-3">
                <h2>Your text summary</h2>
                <p>{text.split(" ").length} words and {text.length} charachter.</p>
                <p>{0.008 * text.split(" ").length} Minutes read</p>
                <h3>Preview</h3>
                <p>{text}</p>
            </div>
        </>
    )
}
