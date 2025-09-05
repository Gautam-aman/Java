import { useState } from 'react'





function App() {

  const [count , setcount] = useState(0);
  
  

  return (
    <div>
     <Custombutton count = {count} setcount = {setcount}/>
    </div>
  )
}

function Custombutton(props){
  
  function updatecout(){
    props.setcount(props.count+1);
  }
  
  return <button onClick ={updatecout}>
    Counter {props.count}
  </button>
}

export default App
