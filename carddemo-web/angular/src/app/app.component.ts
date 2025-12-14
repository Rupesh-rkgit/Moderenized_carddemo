import { Component } from '@angular/core';
import { AppService } from './app.service';
import { Router } from '@angular/router';

@Component({
    moduleId: module.id,
    selector: 'carddemo-web',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
    /* CONSTRUCTORS ======================================================== */
    constructor(
        private appService: AppService, /* necessary for provide appService */
         public router: Router /* For creating links that bypass the transaction runner */
    ) {}
    
    callTransaction(transId: String, params: []) {
	    this.router.navigate(['/term', transId, '', JSON.stringify(params)], { skipLocationChange: true })
    }
}