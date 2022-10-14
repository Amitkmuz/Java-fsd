import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { HttpClientModule } from '@angular/common/http';
import { CreateaadharComponent } from './createaadhar/createaadhar.component';
import { AdminAadharRetrieveComponent } from './admin-aadhar-retrieve/admin-aadhar-retrieve.component';
import { UserAadharApplyComponent } from './user-aadhar-apply/user-aadhar-apply.component';
import { UserUpdateAadharComponent } from './user-update-aadhar/user-update-aadhar.component';
import { UserApplyNewcardComponent } from './user-apply-newcard/user-apply-newcard.component';
import { AdminViewUpdateRequestComponent } from './admin-view-update-request/admin-view-update-request.component';
import { AdminViewNewcardRequestComponent } from './admin-view-newcard-request/admin-view-newcard-request.component';
import { AadharNewApplyRequestComponent } from './aadhar-new-apply-request/aadhar-new-apply-request.component';
import { UserStatusCheckComponent } from './user-status-check/user-status-check.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    UserdashboardComponent,
    AdmindashboardComponent,
    CreateaadharComponent,
    AdminAadharRetrieveComponent,
    UserAadharApplyComponent,
    UserUpdateAadharComponent,
    UserApplyNewcardComponent,
    AdminViewUpdateRequestComponent,
    AdminViewNewcardRequestComponent,
    AadharNewApplyRequestComponent,
    UserStatusCheckComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,HttpClientModule,FormsModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
