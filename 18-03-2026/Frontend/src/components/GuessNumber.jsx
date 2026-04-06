import { useState } from "react";

function GuessNumber(){
    const num=10;
    const[guess,setGuess]=useState(0);
    const[res,setResult]=useState(0);

    const check=()=>{
        if(Number(guess)==num){
         setResult("Number matched");
        }else{
            setResult("Number not matched");
        }
        }

    
    return(
    <>
    <div>Guessing Number</div>
    <input type="number" 
    value={guess}
    onChange={(e)=>setGuess(e.target.value)}
    />
    <button onClick={check}>Check</button>
    <h2>{res}</h2>
    </>
    );
}
export default GuessNumber;