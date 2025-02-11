import { Component } from "@angular/core";
import { HttpClientModule } from "@angular/common/http";
// import { RouterOutlet } from "@angular/router";
import { HeaderComponent } from "./components/header/header.component";
import { MatToolbarModule } from "@angular/material/toolbar";
import { FooterComponent } from "./components/footer/footer.component";
import { ReadAllComponent } from "./components/read-all/read-all.component";

import { MatButtonModule } from "@angular/material/button";
import { MatIcon, MatIconModule } from "@angular/material/icon";

@Component({
  selector: "app-root",
  imports: [
    HeaderComponent,
    MatToolbarModule,
    FooterComponent,
    ReadAllComponent,
    MatButtonModule,
    MatIconModule,
    HttpClientModule,
  ],

  templateUrl: "app.component.html",
})
export class AppComponent {
  title = "todo";
}
