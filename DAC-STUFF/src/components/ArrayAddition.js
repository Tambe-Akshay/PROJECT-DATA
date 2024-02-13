import { useState } from "react";

export default function ArrayAddition () {

    let arr = ["amit","xxx","ttt"];
    const[ele,setEle] = useState("");
    const[names,setNames] = useState(arr);
    return (
        <div>
            <ul>
                {
                    names.map((v)=> {
                        return <li key={v}>{v}</li>
                    })
                }
            </ul>
            <input type="text" name="ele" value={ele}
            onChange={(e)=>{setEle(e.target.value)}}  />
            <br/>
            <button onClick={()=>{
                setNames(names.concat([ele]))
            }}> Add Element </button>
        </div>
    ) 

}