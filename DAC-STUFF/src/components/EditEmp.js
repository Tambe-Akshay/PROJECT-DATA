import { useLocation } from "react-router-dom";

export default function EditEmp() {
    const location = useLocation();
    console.log(location)
    return (
        <div>
            <p> {JSON.stringify(location.state)}</p>
            <form>
                Empid :
                <input type="text" name="empid"
                value={location.state.empid} />
                <br/>
                Ename :
                <input type="text" name="empid"
                value={location.state.ename} />



            </form>
        </div>
    )
}