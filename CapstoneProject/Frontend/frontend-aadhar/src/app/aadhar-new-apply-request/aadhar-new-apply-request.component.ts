import { Component, OnInit } from '@angular/core';
import { UserAadharApply } from '../user-aadhar-apply';
import { UserAadharApplyService } from '../user-aadhar-apply.service';

@Component({
  selector: 'app-aadhar-new-apply-request',
  templateUrl: './aadhar-new-apply-request.component.html',
  styleUrls: ['./aadhar-new-apply-request.component.css']
})
export class AadharNewApplyRequestComponent implements OnInit {

  users:Array<UserAadharApply>=[];
  constructor(public ps:UserAadharApplyService) { }

  ngOnInit(): void {
    this.findAllUser();
  }
  flag:boolean = false;
  email:string ="";
  status:string ="";
  uadhno:number =0;
  findAllUser() {
    this.ps.findAllUser().subscribe({
      next:(result:any)=>this.users=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }

  

  updateUser(user:any){
      this.flag= true;
      this.email=user.email;
      this.status=user.status;
      this.uadhno=user.uadhno;
  }

  updateDataFromDb(){
    let user = {email:this.email,status:this.status,uadhno:this.uadhno};
    this.ps.updateUser(user).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
          this.findAllUser();   
      }
    })
    this.flag=false;
  }

}
