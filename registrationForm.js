import React, { useEffect, useState } from 'react';
import './style.css'
import '../App.css'
function RegistrationForm() {
    const[name,setName]=useState('')
    const[dateOfBirth,setDateOfBirth]=useState('')
    const [standard, setStandard] = useState('')
    const [divison, setDivison] = useState('')
    const [gender, setGender] = useState('')
    const[students,setStudents]=useState([])

  
    const handleClick=(e)=>{
        e.preventDefault()
        const student={name,dateOfBirth,standard,divison,gender}
        console.log(student)
        fetch("http://localhost:8080/student/add",{
          method:"POST",
          headers:{"Content-Type":"application/json"},
          body:JSON.stringify(student)
    
      }).then(()=>{
        console.log("New Student added")
      })
    }

    useEffect(()=>{
        fetch("http://localhost:8080/student/getAll")
        .then(res=>res.json())
        .then((result)=>{
          setStudents(result);
        }
      )
      },[])
  
    return(
      <div className="form">
          <div className="form-body">
              <div className="form-group">
                  <label className="form-label" htmlFor="name">Name : </label>
                  <input className="form-control" name="name" type="text" id="name" value={name} onChange={(e) => setName(e.target.value)} placeholder="Pls Enter Name"/>
              </div>
              <div className="form-group">
              <label className="form-label" htmlFor="dateOfBirth">Date of Birth : </label>
                  <input className="form-control" name="dateOfBirth" type="date" id="dateOfBirth" value={dateOfBirth} onChange={(e) => setDateOfBirth(e.target.value)} placeholder="Enter DOB"/>
              </div>
              <div className="form-group">  
                <label className="form-label" htmlFor="standard">Standard : </label>
                <select className="form-select" name="standard" value={standard} onChange={(e) => setStandard(e.target.value)}>
                    <option value="1">I</option>
                    <option value="2">II</option>
                    <option value="3">III</option>
                    <option value="4">IV</option>
                    <option value="5">V</option>
                    <option value="6">V1</option>
                    <option value="6">V11</option>
                    <option value="6">V111</option>
                    <option value="6">1X</option>
                    <option value="6">X</option>
                    <option value="6">X11</option>
                    <option value="6">X12</option>
                </select>
                </div>
                <div className="form-group">  
                <label htmlFor="divison" className="form-label" >Division : </label>
                <select className="form-select" name="divison" value={divison} onChange={(e) => setDivison(e.target.value)}>
                    <option value="A">A</option>
                    <option value="B">B</option>
                    <option value="C">C</option>
                </select>
                </div>
              <div className="form-group">  
                    <label htmlFor="gender" className="form-label" >Gender : </label>
                    <div>
                        <input type="radio" name="gender" value="Male" onChange={(e) => setGender(e.target.value)}/>
                        <label htmlFor="male" >Male</label>
                    </div>
                   <div>
                        <input type="radio" name="gender" value="Female" onChange={(e) => setGender(e.target.value)}/>
                        <label htmlFor="female" >Female</label>
                   </div>
                </div>  
          </div>
          <div class="footer">
              <button type="submit" class="btn" onClick={handleClick}>Submit</button>
          </div>
        <h1>Students</h1>
        {students.map(student=>(
        
        <table>
        <tr>
          <th>Id</th>
          <th>Name</th>
          <th>DOB</th>
          <th>Standard</th>
          <th>Division</th>
          <th>Gender</th>
        </tr>
        <tr>
          <td>{student.id}</td>
          <td>{student.name}</td>
          <td>{student.dateOfBirth}</td>
          <td>{student.standard}</td>
          <td>{student.divison}</td>
          <td>{student.gender}</td>
        </tr>
      </table>
        
      ))
}
      </div>  
     
    )       
}

export default RegistrationForm;