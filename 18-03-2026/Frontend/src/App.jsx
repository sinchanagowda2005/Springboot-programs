import { useState } from "react";
import Switch from "./components/switch";
import GuessNumber from "./components/GuessNumber";
import GradingSystem from "./components/GradingSystem";
import ListDisplay from "./components/ListDisplay";
import PrimeNumber from "./components/PrimeNumber";
import PrimeList from "./components/PrimeList";
import PassFail from "./components/PassFail";

function App(){

  const[count,setCount]=useState(0);

  const incrementCounter=()=>{
    setCount(count+1);
  }
  const decrementCounter=()=>{
    setCount(count-1)
  }

  return(
    <>
    {/* <div>total count:{count}</div>
    <button onClick={incrementCounter}>Add+1</button>
    <button onClick={decrementCounter}>Add-1</button>
    <Switch/> */}
    {/* <GuessNumber /> */}
    {/* <GradingSystem/> */}
    {/* <ListDisplay/> */}
    {/* <PrimeNumber/> */}
    {/* <PrimeList/> */}
    <PassFail/>
    </>
  );
}
export default App;