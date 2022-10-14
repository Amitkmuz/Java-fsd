import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms'
import { UserUpdateAadharService } from '../user-update-aadhar.service';

@Component({
  selector: 'app-user-update-aadhar',
  templateUrl: './user-update-aadhar.component.html',
  styleUrls: ['./user-update-aadhar.component.css']
})
export class UserUpdateAadharComponent implements OnInit {

  
  
  productRef = new FormGroup({
    aadharno:new FormControl(),
    address:new FormControl(),
    phone:new FormControl(),
    dob:new FormControl()
  })
  storeMsg :string =""
  constructor(public ps:UserUpdateAadharService) { }

  ngOnInit(): void {
  }

  storeProduct() {
    let userupdate = this.productRef.value;
    this.ps.storeUserupdate(userupdate).subscribe({
      next:(result:any)=>this.storeMsg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })

    this.productRef.reset();
  }

}
