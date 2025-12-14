import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { APP_BASE_HREF } from '@angular/common';

import { TransactionRunnerComponent } from './transaction-runner.component';
import { TermComponent } from './term.component';
import { UserInfoComponent } from './user-info.component';

const routes: Routes = [
    { path: '', redirectTo: '/transaction-runner', pathMatch: 'full' },
    { path: 'transaction-runner', component: TransactionRunnerComponent },
    { path: 'user-info', component: UserInfoComponent },
    { path: 'term/:transid/:commarea', children:[
        { path: '', component: TermComponent  },
        { path: ':parameters', component: TermComponent}
    ]}
];

@NgModule({
    imports: [RouterModule.forRoot(routes, {useHash:true})],
    exports: [RouterModule]
})
export class AppRoutingModule { }
