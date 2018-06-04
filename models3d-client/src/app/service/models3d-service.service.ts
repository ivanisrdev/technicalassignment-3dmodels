import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Models3d} from "../model/models3d";
import {environment} from '../../environments/environment';
import 'rxjs/add/operator/map';
import {Observable} from "rxjs/internal/Observable";


@Injectable()
export class Models3dServiceService {

  constructor(private http: HttpClient) { }

  getAllModels3d(): Observable<Models3d[]> {
    const servicePath = '/listModels';
    const url = environment.pathServerBackend + environment.pathApiModels3d + servicePath;
    console.log('Execute service models3d getAllModels3d(): ' + url);

    return this.http.get(url).map(response => <Models3d[]> response);
  }

  getByIdModels3d(id: number): Observable<Models3d>{
    const servicePath = '/listModels?id=';
    const url = environment.pathServerBackend + environment.pathApiModels3d + servicePath;
    console.log('Execute service models3d getByIdModels3d(): ' + url);

    return this.http.get(url).map(response => <Models3d> response);
  }


  saveModel3d(model: Models3d){
    const servicePath = '/saveModels';

  }

  updateModel3dById(model: Models3d, id: number){
    const servicePath = '/saveModels?id=';

  }

  deleteModel3dById(id: number){
    const servicePath = '/id=';

  }
}
