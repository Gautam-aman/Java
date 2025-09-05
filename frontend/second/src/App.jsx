import { useEffect, useState } from 'react'

import './App.css'
import axios from "axios";

function App() {
  const [count, setCount] = useState(0)

  useEffect(()=>{ 

    axios.get("https://www.random.org/integers/?num=1&min=1&max=100&col=1&base=10&format=plain&rnd=new")
    .then((response)=>{
      setCount(response.data);
    })

  } , [count]);

  return (
   <div>
    {count}
   </div>
  )
}

export default App
