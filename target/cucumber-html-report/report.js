$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/user.feature");
formatter.feature({
  "id": "login/landing",
  "description": "",
  "name": "Login/Landing",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "login/landing;get-user-by-email",
  "description": "",
  "name": "Get User By Email",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "Application Users",
  "keyword": "Given ",
  "line": 4,
  "rows": [
    {
      "cells": [
        "email",
        "name"
      ],
      "line": 5
    },
    {
      "cells": [
        "mike@tas.com",
        "Mike"
      ],
      "line": 6
    }
  ]
});
formatter.match({
  "location": "UsersStepDefs.Application_Users(UsersStepDefs$ApplicationUser\u003e)"
});
formatter.result({
  "duration": 116709000,
  "status": "passed"
});
formatter.step({
  "name": "user request for user by email \"mike@tas.com\"",
  "keyword": "When ",
  "line": 7
});
formatter.match({
  "arguments": [
    {
      "val": "mike@tas.com",
      "offset": 32
    }
  ],
  "location": "UsersStepDefs.user_request_for_user_by_email(String)"
});
formatter.result({
  "duration": 755000,
  "status": "passed"
});
formatter.step({
  "name": "The user details should return",
  "keyword": "Then ",
  "line": 8,
  "rows": [
    {
      "cells": [
        "email",
        "name"
      ],
      "line": 9
    },
    {
      "cells": [
        "mike@tas.com",
        "Mike"
      ],
      "line": 10
    }
  ]
});
formatter.match({
  "location": "UsersStepDefs.The_user_details_should_return(UsersStepDefs$ApplicationUser\u003e)"
});
formatter.result({
  "duration": 347000,
  "status": "passed"
});
});