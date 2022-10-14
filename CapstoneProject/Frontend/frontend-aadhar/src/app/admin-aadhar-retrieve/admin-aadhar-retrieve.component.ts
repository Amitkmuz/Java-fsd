import { Component, OnInit } from '@angular/core';
import { Aadhar } from '../aadhar';
import { AadharService } from '../aadhar.service';

@Component({
  selector: 'app-admin-aadhar-retrieve',
  templateUrl: './admin-aadhar-retrieve.component.html',
  styleUrls: ['./admin-aadhar-retrieve.component.css']
})
export class AdminAadharRetrieveComponent implements OnInit {

  aadhars:Array<Aadhar>=[];
  constructor(public ps:AadharService) { }

  ngOnInit(): void {
    this.findAllAadhar();
  }
  flag:boolean = false;
  aadharno:number =0;
  mobileno:number =0;
  address:string="";
  dob:string="";
 
  findAllAadhar() {
    this.ps.findAllAadhar().subscribe({
      next:(result:any)=>this.aadhars=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }

  deleteAadhar(aadharno:number){
    //console.log(aadharno)
    this.ps.deleteAadharById(aadharno).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
          this.findAllAadhar();   
      }
    })
  }

  updateAadhar(aadhar:any){
      this.flag= true;
      this.aadharno=aadhar.aadharno;
      this.mobileno=aadhar.mobileno;
      this.address=aadhar.address;
      this.dob=aadhar.dob;
  }

  updateDataFromDb(){
    let aadhar = {aadharno:this.aadharno,mobileno:this.mobileno,address:this.address,dob:this.dob};
    this.ps.updateAadhar(aadhar).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
          this.findAllAadhar();   
      }
    })
    this.flag=false;
  }

}
