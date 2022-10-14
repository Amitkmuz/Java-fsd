import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms'
import { AadharService } from '../aadhar.service';

@Component({
  selector: 'app-createaadhar',
  templateUrl: './createaadhar.component.html',
  styleUrls: ['./createaadhar.component.css']
})
export class CreateaadharComponent implements OnInit {

  aadharRef = new FormGroup({
    aadharno:new FormControl(),
    name:new FormControl(),
    fathersname:new FormControl(),
    mobileno:new FormControl(),
    address:new FormControl(),
    dob:new FormControl(),
    url:new FormControl()
  })
  storeMsg :string =""
  constructor(public ps:AadharService) { }

  ngOnInit(): void {
  }

  createAadhar() {
    let aadhar = this.aadharRef.value;
    this.ps.createAadhar(aadhar).subscribe({
      next:(result:any)=>this.storeMsg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })

    this.aadharRef.reset();
  }

}
