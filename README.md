# junit5-test-template-jupiter-extension
JUnit5 + Selenium Jupiter Test Template example for automation

1. Run docker-compose to start selenium grid in docker
2. Run **mvn verify -DMultiBrowserDemoTest -Dsel.jup.selenium.server.url=http://localhost:4444/wd/hub -Dprop.browsers.list=chrome,firefox**

