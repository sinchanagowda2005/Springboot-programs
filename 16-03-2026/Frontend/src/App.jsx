import Hello from "./components/Hello";
 import Home from "./components/Home";
import Add from "./example/Add";
import Calculator from "./example/Calculator";
import NumberAdd from "./example/NumberAdd";

function App(){
  return(
    <div>
       <h1>Hello</h1>
        <Home/>
       <Add/>
       <Hello name={"sinchana"} age={20}/> 
       <NumberAdd/>
       <Calculator/>
    </div>
  )
}
export default App;