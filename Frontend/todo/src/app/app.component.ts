import { Component } from "@angular/core";
import { RouterOutlet } from "@angular/router";
import { HeaderComponent } from "./components/header/header.component";
import { MatToolbarModule } from "@angular/material/toolbar";
import { FooterComponent } from "./components/footer/footer.component";

@Component({
  selector: "app-root",
  imports: [RouterOutlet, HeaderComponent, MatToolbarModule, FooterComponent],
  templateUrl: "app.component.html",
})
export class AppComponent {
  title = "todo";
}
