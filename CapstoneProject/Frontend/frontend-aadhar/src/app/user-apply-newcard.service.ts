import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserApplyNewcard } from './user-apply-newcard';

@Injectable({
  providedIn: 'root'
})
export class UserApplyNewcardService {
  
  baseUrl:string ="http://localhost:9090/newaadhar"
  constructor(public http:HttpClient) { }

  storeNewaadhar(newaadhar:any):Observable<string> {
    return this.http.post(this.baseUrl+"/storeNewaadhar",newaadhar,{responseType:"text"});
  }

  findAllNewaadhar():Observable<UserApplyNewcard[]> {
    return this.http.get<UserApplyNewcard[]>(this.baseUrl+"/findAllNewaadhar");
  }
}
