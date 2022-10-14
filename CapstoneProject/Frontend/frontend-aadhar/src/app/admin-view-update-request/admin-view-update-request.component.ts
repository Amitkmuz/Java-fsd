import { Component, OnInit } from '@angular/core';
import { UserUpdateAadhar } from '../user-update-aadhar';
import { UserUpdateAadharService } from '../user-update-aadhar.service';

@Component({
  selector: 'app-admin-view-update-request',
  templateUrl: './admin-view-update-request.component.html',
  styleUrls: ['./admin-view-update-request.component.css']
})
export class AdminViewUpdateRequestComponent implements OnInit {

  userupdates:Array<UserUpdateAadhar>=[];
  constructor(public ps:UserUpdateAadharService) { }

  ngOnInit(): void {
    this.findAll();
  }
  
  findAll() {
    this.ps.findAllUserupdate().subscribe({
      next:(result:any)=>this.userupdates=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }

}
