import { Component, OnInit } from '@angular/core';
import { UserApplyNewcard } from '../user-apply-newcard';
import { UserApplyNewcardService } from '../user-apply-newcard.service';

@Component({
  selector: 'app-admin-view-newcard-request',
  templateUrl: './admin-view-newcard-request.component.html',
  styleUrls: ['./admin-view-newcard-request.component.css']
})
export class AdminViewNewcardRequestComponent implements OnInit {

  newaadhars:Array<UserApplyNewcard>=[];
  constructor(public ps:UserApplyNewcardService) { }

  ngOnInit(): void {
    this.findAllNewaadhars();

  }
  findAllNewaadhars() {
    this.ps.findAllNewaadhar().subscribe({
      next:(result:any)=>this.newaadhars=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }

}
