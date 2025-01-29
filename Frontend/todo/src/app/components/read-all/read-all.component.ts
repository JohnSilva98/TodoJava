import { Component } from "@angular/core";
import { MatCard, MatCardHeader, MatCardModule } from "@angular/material/card";
import { MatIcon } from "@angular/material/icon";
import { Todo } from "../../models/todo";
import { CommonModule } from "@angular/common";

@Component({
  selector: "app-read-all",
  imports: [MatCard, MatCardHeader, MatCardModule, MatIcon, CommonModule],
  templateUrl: "./read-all.component.html",
  styleUrl: "./read-all.component.css",
})
export class ReadAllComponent {
  list: Todo[] = [
    {
      title: "test",
      description: "test",
      deadline: new Date(),
      isFinished: false,
    },
    {
      title: "test2",
      description: "test2",
      deadline: new Date(),
      isFinished: true,
    },
  ];
}
