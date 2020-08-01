import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatToolbarModule, MatIconModule, MatSidenavModule, MatListModule, MatButtonModule,
  MatInputModule, MatFormFieldModule, MatExpansionModule, MatButtonToggleModule, MatCardModule,
  MatRadioModule, MatDialogModule, MatCheckboxModule} from  '@angular/material';


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MatToolbarModule,
    MatIconModule,
    MatSidenavModule,
    MatListModule,
    MatButtonModule,
    MatInputModule,
    MatFormFieldModule,
    MatExpansionModule,
    MatButtonToggleModule,
    MatCardModule,
    MatRadioModule,
    MatDialogModule,
    MatCheckboxModule,
  ],
  exports: [
    CommonModule,
    MatToolbarModule,
    MatIconModule,
    MatSidenavModule,
    MatListModule,
    MatButtonModule,
    MatInputModule,
    MatFormFieldModule,
    MatExpansionModule,
    MatButtonToggleModule,
    MatCardModule,
    MatRadioModule,
    MatDialogModule,
    MatCheckboxModule,
  ]
})
export class AppMaterialModule { }
