$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/abc/eclipse-workspace/Reports/src/test/java/features/google.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11617427000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I want to google website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "enter the search keyword",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.i_want_to_google_website()"
});
formatter.result({
  "duration": 5953262500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.enter_the_search_keyword()"
});
formatter.result({
  "duration": 180900,
  "status": "passed"
});
formatter.after({
  "duration": 73400,
  "status": "passed"
});
});