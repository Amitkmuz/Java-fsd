function retrieveData(){
    var obj = sessionStorage.getItem("obj");
    if(obj==null){
        document.getElementById("out").innerHTML="Record not present"
    }else {
        let empData = JSON.parse(obj);
        for(let i =0;i<empData.length;i++){
            let pTag = document.createElement("p");
            let ptTagValue = document.createTextNode(""+empData[i].cname+"------- "+empData[i].pname+"-------"+empData[i].budget);
            pTag.appendChild(ptTagValue);
            document.getElementById("result").appendChild(pTag);
        }

        }

    

    
    
}