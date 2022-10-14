import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms'
import { UserAadharApplyService } from '../user-aadhar-apply.service';

@Component({
  selector: 'app-user-aadhar-apply',
  templateUrl: './user-aadhar-apply.component.html',
  styleUrls: ['./user-aadhar-apply.component.css']
})
export class UserAadharApplyComponent implements OnInit {

  userRef = new FormGroup({
    email:new FormControl(),
    uname:new FormControl(),
    fname:new FormControl(),
    address:new FormControl(),
    phone:new FormControl(),
    dob:new FormControl()
  })
  storeMsg :string =""
  constructor(public ps:UserAadharApplyService) { }

  ngOnInit(): void {
  }

  storeUser() {
    let user = this.userRef.value;
    this.ps.applyAadhar(user).subscribe({
      next:(result:any)=>this.storeMsg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })

    this.userRef.reset();
  }

}
