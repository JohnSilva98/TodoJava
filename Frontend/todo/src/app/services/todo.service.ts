import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Todo } from "../models/todo";
import { enviroment } from "../enviroments/enviroment";

@Injectable({
  providedIn: "root",
})
export class TodoService {
  baseUrl = enviroment.baseUrl;

  constructor(private http: HttpClient) {}

  findAll(): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.baseUrl);
  }
}
