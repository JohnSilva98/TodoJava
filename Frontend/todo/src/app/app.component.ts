import { Component } from "@angular/core";
import { RouterOutlet } from "@angular/router";
import { HeaderComponent } from "./components/header/header.component";
import { MatToolbarModule } from "@angular/material/toolbar";

@Component({
  selector: "app-root",
  imports: [RouterOutlet, HeaderComponent, MatToolbarModule],
  templateUrl: "app.component.html",
})
export class AppComponent {
  title = "todo";
}
