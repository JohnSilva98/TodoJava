import { Component } from "@angular/core";
import { MatCard, MatCardHeader, MatCardModule } from "@angular/material/card";
import { MatIcon } from "@angular/material/icon";

@Component({
  selector: "app-read-all",
  imports: [MatCard, MatCardHeader, MatCardModule, MatIcon],
  templateUrl: "./read-all.component.html",
  styleUrl: "./read-all.component.css",
})
export class ReadAllComponent {}
