import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserAadharApply } from './user-aadhar-apply';

@Injectable({
  providedIn: 'root'
})
export class UserAadharApplyService {
  baseUrl:string ="http://localhost:9090/user"

  constructor(public http:HttpClient) { }

  findAllUserById(email:string):Observable<string> {
    return this.http.get(this.baseUrl+"/findUserById/"+email,{responseType:"text"});
  }
  applyAadhar(user:any):Observable<string> {
    return this.http.post(this.baseUrl+"/applyAadhar",user,{responseType:"text"});
  }
  findAllUser():Observable<UserAadharApply[]> {
    return this.http.get<UserAadharApply[]>(this.baseUrl+"/findAllUser");
  }
  updateUser(user:any):Observable<string> {
    return this.http.patch(this.baseUrl+"/updateUser",user,{responseType:"text"});
  }
}
