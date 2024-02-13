import './external_style.css'

export default function CompStyle() {
    const mystyle = {
        textAlign: "center",
        fontSize: "24px",
        textDecoration: "underline"
    }
    return (
        <div>
            <p style={{color:"blue",backgroundColor:"yellow"}}> 
                Styled with inline styling
            </p>

            <br/>
            <p style={mystyle}>
                Styled with style object
            </p>
            <br/>
            <p className="content">
                Styled with external style css file
            </p>

            <p className="text-primary bg-dark">
                Styled with bootstrap styling
            </p>


        </div>
    )


}