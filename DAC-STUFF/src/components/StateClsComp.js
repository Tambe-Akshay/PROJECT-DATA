import React from "react";

export default class StateClscomp extends React.Component {
    constructor(props){
        super(props)
        //initialize the state
        this.state = {
            name: "xxx"
        }
        this.changeNm = this.changeNm.bind(this);
    }

    //regular function
    changeNm() {
        //meaning of this is not identified
        //bound this(current component) with the function
        this.setState({ name: "Bakul"});
    }

    render(){
        //access the state
        return (
            <div>
                <h1> Welcome : {this.state.name} </h1>
                {/*<button onClick={this.changeNm} >
                 Change Name</button> */}
                {/* <button onClick={()=>{
                    this.setState({name: 'Bakul'})
                 }} > */}
                 <button onClick={function() { 
                    this.setState({name: 'Bakul'})
                  }} >
                 Change Name</button> 
            </div>
        )
    } 
}

