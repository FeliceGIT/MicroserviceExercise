import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateQuestionComponent } from './components/create-question/create-question.component';
import { StatisticComponent } from './components/statistic/statistic.component';


const routes: Routes = [
  { path: 'create', component: CreateQuestionComponent },
  { path: 'statistic', component: StatisticComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
