Open EJB wsdl access url.
http://localhost:4204/esp-ejb-1.0/CalculatorBean?wsdl




#=============== Generate EJB to WS for IBM WAS ==========================

D:\apps\IBM\WebSphere\AppServer\profiles\AppSrv01\bin\endptEnabler.bat -v -transport http -endpointType all D:\pers_proj\esp-ejb-bundle\esp-ejbEAR\target\esp-ejbEAR.ear

WSWS2004I: IBM WebSphere Application Server Version 8.0
WSWS2005I: Web services Enterprise Archive Endpoint Enabler.
WSWS2007I: (C) COPYRIGHT International Business Machines Corp. 1997, 2010.

WSWS2003I: Backing up the enterprise archive (EAR) file to: D:\pers_proj\esp-ejb-bundle\esp-ejbEAR\target\esp-ejbEAR-1.0.ear~

WSWS2012I: The endpoint enabler is using the following properties:
        defaultTransports: http
        verbose: true
        endpointType: all
WSWS2016I: Loading enterprise archive (EAR) file: D:\pers_proj\esp-ejb-bundle\esp-ejbEAR\target\esp-ejbEAR-1.0.ear
WSWS2017I: Found enterprise bean module: esp-ejb-1.0.jar
WSWS2019I: Enabling enterprise bean module esp-ejb-1.0.jar...
WSWS2024I: Adding http router for enterprise bean module esp-ejb-1.0.jar.
WSWS2025I: Router module name: esp-ejb-1.0_HTTPRouter.war
WSWS2026I: Context root: /esp-ejb-1.0
WSWS2047I: URL pattern for port HelloBeanPort: /HelloBeanService
WSWS2047I: URL pattern for port CalculatorServicePort: /CalculatorBeanService
WSWS2020I: Finished enabling enterprise bean module esp-ejb-1.0.jar...
WSWS2036I: Saving the enterprise archive (EAR) file D:\pers_proj\esp-ejb-bundle\esp-ejbEAR\target\esp-ejbEAR-1.0.ear...
WSWS2037I: Finished saving the enterprise archive (EAR) file.
WSWS2018I: Finished processing enterprise archive (EAR) file D:\pers_proj\esp-ejb-bundle\esp-ejbEAR\target\esp-ejbEAR-1.0.ear.


============== WAS install ejbws ========================
Installing...
If there are enterprise beans in the application, the EJB deployment process can take several minutes. Do not save the configuration until the process completes.

Check the SystemOut.log on the deployment manager or server where the application is deployed for specific information about the EJB deployment process as it occurs.

ADMA5016I: Installation of esp-ejbEAR started.

ADMA5067I: Resource validation for application esp-ejbEAR completed successfully.

ADMA5058I: Application and module versions are validated with versions of deployment targets.

WSWS0041I: Web services deploy task completed successfully.

ADMA5009I: Extracting application archive to D:\apps\IBM\WebSphere\AppServer\profiles\AppSrv01\wstemp\appmgmt\mbean\AppManagement_161901727e7_1\app_1619057d79a\ext.

ADMA5003I: The JavaServer Pages (JSP) files in the Web Archive (WAR) esp-ejb-1.0_HTTPRouter.war compiled successfully.

ADMA0215I: The JavaServer Pages (JSP) compile task completed.

ADMA5005I: The application esp-ejbEAR is configured in the WebSphere Application Server repository.

ADMA5005I: The application esp-ejbEAR is configured in the WebSphere Application Server repository.

ADMA5081I: The bootstrap address for client module is configured in the WebSphere Application Server repository.

ADMA5053I: The library references for the installed optional package are created.

ADMA5005I: The application esp-ejbEAR is configured in the WebSphere Application Server repository.

ADMA5001I: The application binaries are saved in D:\apps\IBM\WebSphere\AppServer\profiles\AppSrv01\wstemp\92668751\workspace\cells\L070492Node01Cell\applications\esp-ejbEAR.ear\esp-ejbEAR.ear

ADMA5005I: The application esp-ejbEAR is configured in the WebSphere Application Server repository.

SECJ0400I: Successfully updated the application esp-ejbEAR with the appContextIDForSecurity information.

ADMA5005I: The application esp-ejbEAR is configured in the WebSphere Application Server repository.

ADMA5005I: The application esp-ejbEAR is configured in the WebSphere Application Server repository.

ADMA5113I: Activation plan created successfully.

ADMA5011I: The cleanup of the temp directory for application esp-ejbEAR is complete.

ADMA5013I: Application esp-ejbEAR installed successfully.

Application esp-ejbEAR installed successfully.
To start the application, first save changes to the master configuration.

Changes have been made to your local configuration. You can: 
Save directly to the master configuration. 
Review changes before saving or discarding.
To work with installed applications, click the "Manage Applications" link.

Manage Applications
===================================== 
