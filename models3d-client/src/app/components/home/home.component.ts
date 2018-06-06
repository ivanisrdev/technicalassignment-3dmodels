import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {Models3dServiceService} from '../../service/models3d-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  _service: Models3dServiceService;

  constructor() {}

  ngOnInit() {
  }

  readFile(event): void {
    const formData = new FormData();
    if (event.target.files && event.target.files.length > 0) {
      const file = event.target.files[0];

    }
  }
}
