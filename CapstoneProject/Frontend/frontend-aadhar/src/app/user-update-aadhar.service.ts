import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserUpdateAadhar } from './user-update-aadhar';

@Injectable({
  providedIn: 'root'
})
export class UserUpdateAadharService {
  baseUrl:string ="http://localhost:9090/userupdate"
  constructor(public http:HttpClient) { }

  storeUserupdate(userupdate:any):Observable<string> {
    return this.http.post(this.baseUrl+"/storeUserupdate",userupdate,{responseType:"text"});
  }

  findAllUserupdate():Observable<UserUpdateAadhar[]> {
    return this.http.get<UserUpdateAadhar[]>(this.baseUrl+"/findAllUserupdate");
  }
}
