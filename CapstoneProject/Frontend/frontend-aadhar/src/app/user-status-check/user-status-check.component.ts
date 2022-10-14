import { Component, OnInit } from '@angular/core';
import { UserAadharApply } from '../user-aadhar-apply';
import { UserAadharApplyService } from '../user-aadhar-apply.service';

@Component({
  selector: 'app-user-status-check',
  templateUrl: './user-status-check.component.html',
  styleUrls: ['./user-status-check.component.css']
})
export class UserStatusCheckComponent implements OnInit {

  users:Array<UserAadharApply>=[];
  constructor(public ps:UserAadharApplyService) { }

  ngOnInit(): void {
    this.findAllUser();
  }

  findAllUser() {
    this.ps.findAllUser().subscribe({
      next:(result:any)=>this.users=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }

}
