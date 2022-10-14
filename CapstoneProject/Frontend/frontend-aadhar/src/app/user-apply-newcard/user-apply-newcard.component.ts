import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms'
import { UserApplyNewcardService } from '../user-apply-newcard.service';

@Component({
  selector: 'app-user-apply-newcard',
  templateUrl: './user-apply-newcard.component.html',
  styleUrls: ['./user-apply-newcard.component.css']
})
export class UserApplyNewcardComponent implements OnInit {

  productRef = new FormGroup({
    aadharno:new FormControl(),
    reason:new FormControl()
    
  })
  storeMsg :string =""
  constructor(public ps:UserApplyNewcardService) { }

  ngOnInit(): void {
  }

  storeProduct() {
    let newapply = this.productRef.value;
    this.ps.storeNewaadhar(newapply).subscribe({
      next:(result:any)=>this.storeMsg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })

    this.productRef.reset();
  }

}
