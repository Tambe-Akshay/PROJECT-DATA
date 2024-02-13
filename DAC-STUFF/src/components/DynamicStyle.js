import { useState } from "react"

export default function DynamicStyle () {
    const [cl, setCl] = useState("black")
    return (
        <div>
            <p style={{color: cl}}> 
                Dynamically colored 
            </p>
            <input type="color" name="cl" value={cl}
            onChange={ (e)=>{setCl(e.target.value)}}  />
        </div>
    )
}