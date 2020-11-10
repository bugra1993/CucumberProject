$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/dbreader.feature");
formatter.feature({
  "name": "Data Reading",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dbreader"
    }
  ]
});
formatter.scenario({
  "name": "Kullanici hotel tablosundaki verileri okur",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbreader"
    }
  ]
});
formatter.step({
  "name": "kullanici veri tabanina baglanir",
  "keyword": "Given "
});
formatter.match({
  "location": "database_stepdefinitions.DbReaderStepDef.kullanici_veri_tabanina_baglanir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"tHOTEL\" tablosundaki \"Email\" verileri alir",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinitions.DbReaderStepDef.kullanici_tablosundaki_verileri_alir(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici  \"Email\" verilerini okur",
  "keyword": "And "
});
formatter.match({
  "location": "database_stepdefinitions.DbReaderStepDef.kullanici_verilerini_okur(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});