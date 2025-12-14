import { NgModule, APP_INITIALIZER} from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner'; 
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { CommonsModule } from './commons.module'
import { AppComponent } from './app.component';
import { TransactionRunnerComponent } from './transaction-runner.component';
import { TermComponent } from './term.component';

import { AppRoutingModule } from './app-routing.module';
import { AppService } from './app.service';
import { ConfigService } from './config-service';
import { LanguageService } from './language/language-service';
import { AppConfigurationMessage } from './configuration-message.module';

// Provided to dynamically loaded components
import { SharedModule } from './shared.module';
import { TermModule } from './term/term.module';
import { DynamicFieldModule } from './dynamic-field/dynamic-field.module';
import { TermModalModule } from './term-modal/term-modal.module';
import { TermService } from './term/term.service';
import { TestingService } from './term/testing.service';
import { TransactionService } from './term/transaction.service';
import { TableModule } from './table/table.module';
import { ModalModule, ModalComponent } from './modal.component';

import { UtilityComponents, UtilityModule } from './maps/utility';
import { UserInfoService } from './user-info/user-info.service';
import { UserInfoComponent } from './user-info.component';
import { FormsModule } from '@angular/forms';
import { HelpService } from './help.service';
import { FieldInitializationService } from './services/field-initialization.service';

/** Perform application configuration.
 * The application start will delay until the Promise is completed (avoid race conditions).
 * See https://github.com/angular/angular/issues/9047
  */
export function initializeApplication(http: HttpClient, 
    transactionService: TransactionService, userInfoService: UserInfoService, configService: ConfigService) {
    
    // Get backend URL
    return () => configService.configuration()
        .then((configuration: AppConfigurationMessage) => {
            transactionService.configure(configuration);
            userInfoService.configure(configuration);
            return true;
        });
}

@NgModule({
    imports: [
        CommonsModule,
        BrowserModule,
        BrowserAnimationsModule,
        HttpClientModule,
        AppRoutingModule,
        MatProgressSpinnerModule,
        SharedModule,
        DynamicFieldModule,
        TableModule,
        TermModule,
        TermModalModule,
        ModalModule,
        UtilityModule
    ],
    declarations: [
        AppComponent,
        TermComponent,
        TransactionRunnerComponent,
        UserInfoComponent,
    ],
    bootstrap: [
        AppComponent,
    ],
    providers: [
        AppService,
        TermService,
        TransactionService,
        UserInfoService,
        ConfigService,
        FieldInitializationService,
        LanguageService,
        HelpService,
		TestingService,
        {
            'provide': APP_INITIALIZER,
            'useFactory': initializeApplication,
            'deps': [HttpClient, TransactionService, UserInfoService, ConfigService, LanguageService],
            'multi': true,
        }
    ]
})
export class AppModule { }
