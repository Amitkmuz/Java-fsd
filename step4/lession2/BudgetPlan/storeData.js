var empInfo;
function addData(){
    var cnameValue = document.getElementById("cname").value
    var pnameValue = document.getElementById("pname").value
    var budgetValule = document.getElementById("budget").value;
    var obj = sessionStorage.getItem("obj");
    let emp = {cname:cnameValue,pname:pnameValue,budget:budgetValule};
    if(obj==null){
        empInfo = new Array();
        empInfo.push(emp);
        sessionStorage.setItem("obj",JSON.stringify(empInfo));
    }else {
        obj = JSON.parse(obj);
        obj.push(emp);
        sessionStorage.setItem("obj",JSON.stringify(obj));
    }
    document.getElementById("cname").value=""
    document.getElementById("pname").value=""
    document.getElementById("budget").value=""
    document.getElementById("out").innerHTML="Data Added.."
}