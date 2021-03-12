import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mock1-component',
  templateUrl: './mock1-component.component.html',
  styleUrls: ['./mock1-component.component.css']
})
export class Mock1ComponentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  funtionEjeMock(A:number, callback:any){
    if (A == 1){
      callback(1);
    } else if (A == 2){
      callback(1);
      callback(2);
    } else {
      return;
    }
  }
}
