Open EJB wsdl access url.
http://localhost:4204/esp-ejb-1.0/CalculatorBean?wsdl




#=============== Generate EJB to WS for IBM WAS ==========================

D:\apps\IBM\WebSphere\AppServer\profiles\AppSrv01\bin\endptEnabler.bat -v -transport http -endpointType all D:\pers_proj\esp-ejb-bundle\esp-ejbEAR\target\esp-ejbEAR-1.0.ear

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