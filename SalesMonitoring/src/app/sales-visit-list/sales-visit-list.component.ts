import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SalesVisit } from '../shared/sales-visit';
import { SalesVisitService } from '../shared/sales-visit.service';

@Component({
  selector: 'app-sales-visit-list',
  templateUrl: './sales-visit-list.component.html',
  styleUrls: ['./sales-visit-list.component.scss']
})
export class SalesVisitListComponent implements OnInit {

  term:string;
  p:number;
  searchdate:Date;
  constructor(public salesService: SalesVisitService ,private router:Router) { }

  ngOnInit(): void { //Life Cycle hook
    console.log("Hello");
    this.getAllSalesForComponent();
  }
  //1 Get method for all employees
  getAllSalesForComponent(){
    //call service here
    this.salesService.getAllSalesVisit();
    console.log("get All sales");
    this.salesService.getAllSalesVisitList().subscribe(
      (response)=>{
        console.log(response);
      },
      (error)=>{
        console.log(error);
      }
    );
  }

  // update Employee
  updateSale(visitid:number,sale:SalesVisit){
   console.log(visitid);
   //navigate to edit form with selected employee details
   this.router.navigate(["salesadd",visitid]);
   
    this.populateForm(sale);
  }

// populate Form When click on
populateForm(sale: SalesVisit){
  console.log(sale);
  this.salesService.formSalesData=Object.assign({},sale);
}

}
