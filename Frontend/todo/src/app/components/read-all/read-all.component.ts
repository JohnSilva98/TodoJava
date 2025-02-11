import { Component } from "@angular/core";
import { MatCard, MatCardHeader, MatCardModule } from "@angular/material/card";
import { MatIcon } from "@angular/material/icon";
import { Todo } from "../../models/todo";
import { CommonModule } from "@angular/common";
import { TodoService } from "../../services/todo.service";

@Component({
  selector: "app-read-all",
  imports: [MatCard, MatCardHeader, MatCardModule, MatIcon, CommonModule],
  templateUrl: "./read-all.component.html",
  styleUrl: "./read-all.component.css",
})
export class ReadAllComponent {
  list: Todo[] = [];

  constructor(private service: TodoService) {}

  ngOnInit(): void {
    this.findAll();
  }
  findAll(): void {
    this.service.findAll().subscribe((resposta) => {
      this.list = resposta;
    });
  }
}
