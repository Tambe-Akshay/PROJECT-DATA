function ComplexComp () {
    /*return (
        <h1>
            Welcome to JSX rules
        </h1>
    )
here you have to add tags*/

    /*return (
        <div>
            <h1> Welcome to React JS </h1>
            <h3> JSX rules </h3>
        </div>
    )*/
    let nm = "Bakul"; 
    var cdate = new Date(); 
    var arr = ["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"]  
    return (
        <div>
            <h1> Welcome {nm.toUpperCase()} </h1>
            <p> Current date : {cdate.getDate()+" "+arr[cdate.getMonth()]+" "+cdate.getFullYear()} </p>
        </div>
    )

}

export default ComplexComp;