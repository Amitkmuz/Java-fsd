import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AadharNewApplyRequestComponent } from './aadhar-new-apply-request/aadhar-new-apply-request.component';
import { AdminAadharRetrieveComponent } from './admin-aadhar-retrieve/admin-aadhar-retrieve.component';
import { AdminViewNewcardRequestComponent } from './admin-view-newcard-request/admin-view-newcard-request.component';
import { AdminViewUpdateRequestComponent } from './admin-view-update-request/admin-view-update-request.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { CreateaadharComponent } from './createaadhar/createaadhar.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { UserAadharApplyComponent } from './user-aadhar-apply/user-aadhar-apply.component';
import { UserApplyNewcardComponent } from './user-apply-newcard/user-apply-newcard.component';
import { UserStatusCheckComponent } from './user-status-check/user-status-check.component';
import { UserUpdateAadharComponent } from './user-update-aadhar/user-update-aadhar.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"adminHome",component:AdmindashboardComponent,children:[
    {path:"addAadhar",component:CreateaadharComponent},
    {path:"findAllAadhar",component:AdminAadharRetrieveComponent},
    {path:"viewAllAadharApply",component:AadharNewApplyRequestComponent},
    {path:"viewAllUpdateRequest",component:AdminViewUpdateRequestComponent},
    {path:"viewAllNewCardRequest",component:AdminViewNewcardRequestComponent}
  ]},
  {path:"userHome",component:UserdashboardComponent,children:[
  {path:"userAadharApply",component:UserAadharApplyComponent},
  {path:"userUpdateAadhar",component:UserUpdateAadharComponent},
  {path:"userApplyNew",component:UserApplyNewcardComponent},
  {path:"userApplyStatus",component:UserStatusCheckComponent}

]},

  {path:"signUp",component:SignupComponent},
  {path:"",redirectTo:"login",pathMatch:"full"}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
