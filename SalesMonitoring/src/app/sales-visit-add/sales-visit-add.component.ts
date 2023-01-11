import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import {SalesVisitService} from '../shared/sales-visit.service';
@Component({
  selector: 'app-sales-visit-add',
  templateUrl: './sales-visit-add.component.html',
  styleUrls: ['./sales-visit-add.component.scss']
})
export class SalesVisitAddComponent implements OnInit {
  visitid:number;
  constructor(public salesVisitService :SalesVisitService,private router:Router,
    private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.salesVisitService.getEmployees();
    //getting data from url
    this.visitid=this.route.snapshot.params['visitid'];
  }
  onSubmit(form: NgForm)
  {
    console.log(form.value);
    let addvisitid=this.salesVisitService.formSalesData.visitid;
    //check condition here
    if(addvisitid==0 || addvisitid==null)
    {
      this.addEmployee(form);
      //window.location.reload();
      this.redirect();
    }
    else{
      this.editEmployee(form);
      //window.location.reload();
      this.redirect();
    }
    
  }
  //INSERT
  addEmployee(form?:NgForm)
  {
    console.log("Inserting....");
    this.salesVisitService.insertSalesVisit(form.value).subscribe(
      (result)=>{ console.log(result);
      },
      (error)=>{
        console.log(error);
      }
    );
  }

  editEmployee(form?:NgForm)
  {
    console.log("Inserting....");
    this.salesVisitService.updateSalesVisit(form.value).subscribe(
      (result)=>{ 
        console.log(result);
      },
      (error)=>{
        console.log(error);
      }
    );
  }

  redirect(){

    this.router.navigate(['saleslist']);

  }
}
