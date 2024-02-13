import React from "react"
import PropsFunComp from "./PropsFunComp";
class PropClsComp extends React.Component{
    render(){
        return (
            <div>
                <h1> Welcome {this.props.nm.toUpperCase()} </h1>
                <p> Age : {this.props.age > 18 ? "Valid":"Invalid"} </p> 
            </div>
        )
    }
}

PropClsComp.defaultProps = {
    nm:"guest",
    age:0
}

//validating rules
//prop-types library needs to be installed
//npm install --save prop-types
/*PropsFunComp.propTypes = {


}*/

export default PropClsComp;

