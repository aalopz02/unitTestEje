import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-asserts-component',
  templateUrl: './asserts-component.component.html',
  styleUrls: ['./asserts-component.component.css']
})
export class AssertsComponentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  sumaTest(a : number, b : number){
    return a+b;
  }

  sumaTestMal(a : number, b : number){
    return "";
  }

}
