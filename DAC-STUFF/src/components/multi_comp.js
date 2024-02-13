//JS regular function 
import pic from '../Desert.jpeg'
function One() {
    let w = 200;
    let h = 200;
    return (
        <div>
            <h1> Welcome from regular function </h1>
            <img src={pic}  width={w} height={h}  /> 
        </div>
    )
}

//JS functional expression
let Two = function() {
    var names = ["Amit","Bakul","Milind","Prasad"];
    return (
        <div>
            <h1>Welcome from functional expression</h1> 
            <ul> 
                {
                    names.map((v)=>{
                        return <li key={v}> {v} </li>
                    })
                }        
            </ul>
        </div>
    )
}

//JS - arrow function
let Three = () => {
    return (
        <div>
            <h1> Welcome from arrow function</h1>
        </div>
    )
}

//export default - can export only one component at a time
export {One, Two, Three }



