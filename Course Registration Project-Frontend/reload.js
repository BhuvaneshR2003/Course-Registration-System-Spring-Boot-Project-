function showcourses(){
    fetch("http://localhost:8080/course")
    .then((Response) =>Response.json())
    .then((data) =>{
        const datatable = document.getElementById("coursetable")
        data.forEach(course => {
            var rows =`<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.trainer}</td>
            <td>${course.durationInWeek}</td>
            </tr>`
            datatable.innerHTML+=rows;
        });
    });
}
function showenrolledstudents(){
    fetch("http://localhost:8080/course/enrolled")
    .then((Response) =>Response.json())
    .then((student) =>{
        const datatable = document.getElementById("studenttable")
        student.forEach(course => {
            var rows =`<tr>
            <td>${course.name}</td>
            <td>${course.email}</td>
            <td>${course.courseName}</td>
            </tr>`
            datatable.innerHTML+=rows;
        });
    }); 
}