import { useState } from "react";

function Calculator(){
    const[num1,setNum1]=useState(0);
    const[num2,setNum2]=useState(0);
    const[result,setResult]=useState(0);
  
    const Add=()=>{
        setResult(Number(num1)+Number(num2));
    }
    const Substract=()=>{
        setResult(Number(num1)-Number(num2));
    }
    const Multiply=()=>{
        setResult(Number(num1)*Number(num2));
    }
    const Divide=()=>{
        setResult(Number(num1)/Number(num2));
    };
    return(
        <>
        <h2>Simple Calculator</h2>
        <input
         type="number"
         value={num1}
         onChange={(e)=>setNum1(e.target.value)}
         placeholder="Enter first Number"
        />

        <input
         type="number"
         value={num2}
         onChange={(e)=>setNum2(e.target.value)}
         placeholder="Enter second Number"
        />
        <br></br>

        <button onClick={Add}>+</button>
        <button onClick={Substract}>-</button>
        <button onClick={Multiply}>*</button>
        <button onClick={Divide}>/</button>

      <h1>Result:{result}</h1>

        </>
    );
        
    }
    export default Calculator;

