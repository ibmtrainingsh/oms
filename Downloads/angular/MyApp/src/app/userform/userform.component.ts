import { Component, OnInit } from '@angular/core';

import { User } from './User';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {
  title:string='Userform';
  user:User= new User();//model -stores from all data
  userArray:User[]=[];
  constructor() { }
  save(){
    this.userArray.push(Object.assign({},this.user));
    console.log('working...');
    console.log(this.user.firstname);
    //this.user.firstname='John';
    //this.user.age=12;
    //console.log(this.user.age);

  }
  ngOnInit(): void {
  }

}
