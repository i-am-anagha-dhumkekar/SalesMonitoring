import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { SalesVisit } from './sales-visit';
import {HttpClient} from '@angular/common/http';
import {environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SalesVisitService {

  formSalesData: SalesVisit=new SalesVisit(); //single employee
  //list of Employees
  employees:Employee[]; //all employees
  salesvisits:SalesVisit[];
  constructor(private httpClient : HttpClient) { }//contructor injection

  //get all employees
  getAllSalesVisit()
  {
    this.httpClient.get(environment.apiUrl+'/api/sales').toPromise()
    .then((response)=>{
      console.log(response);
      this.salesvisits=response as SalesVisit[];
    },(error)=>{
      console.log(error);
    });
  }

  //2 Observable TYpes
  getAllSalesVisitList():Observable<any>
  {
    return this.httpClient.get(environment.apiUrl+'/api/sales');
  }

  //3.iNSERT
  insertSalesVisit(sale:SalesVisit):Observable<any>
  {
    return this.httpClient.post(environment.apiUrl+'/api/sales',SalesVisit);
  }

  //Update
  updateSalesVisit(sale:SalesVisit):Observable<any>
  {
    return this.httpClient.put(environment.apiUrl+'/api/sales',sale);
  }

  //Get employee by id
  getSalesVisitById(id:number):Observable<any>
  {
    return this.httpClient.get(environment.apiUrl+'/api/sales');
  }

  //get all Departments
  getEmployees():void
  {
    this.httpClient.get(environment.apiUrl+'/api/employees').toPromise()
    .then((response)=>{
      console.log(response);
      this.employees=response as Employee[];
    },(error)=>{
      console.log(error);
    });
  }

}
