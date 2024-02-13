function PropsFunComp(ps) {
    return (
        <div>
            <h1> Welcome { ps.nm}</h1>
            <p>Age:{ps.age}</p>
        </div>
    )
}
PropsFunComp.defaultProps = {
    nm: "XXX",
    age: 100
}



export default PropsFunComp;