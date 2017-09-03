$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13340699536,
  "status": "passed"
});
formatter.before({
  "duration": 8419728840,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there are the following valid users",
  "rows": [
    {
      "cells": [
        "user_name",
        "password"
      ],
      "line": 5
    },
    {
      "cells": [
        "mandy",
        "test"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.there_are_the_following_valid_users(DataTable)"
});
formatter.result({
  "duration": 75435633,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Login with valid user information",
  "description": "",
  "id": "login;login-with-valid-user-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I login with below user",
  "rows": [
    {
      "cells": [
        "user_name",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "mandy",
        "test"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should go to Hit Rate report",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_login_with_below_user(DataTable)"
});
formatter.result({
  "duration": 18526,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_go_to_Hit_Rate_report()"
});
formatter.result({
  "duration": 20912,
  "status": "passed"
});
formatter.after({
  "duration": 928280,
  "status": "passed"
});
formatter.after({
  "duration": 686941,
  "status": "passed"
});
formatter.before({
  "duration": 8303040942,
  "status": "passed"
});
formatter.before({
  "duration": 8234689510,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there are the following valid users",
  "rows": [
    {
      "cells": [
        "user_name",
        "password"
      ],
      "line": 5
    },
    {
      "cells": [
        "mandy",
        "test"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.there_are_the_following_valid_users(DataTable)"
});
formatter.result({
  "duration": 16549,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login with invalid user information",
  "description": "",
  "id": "login;login-with-invalid-user-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I login with below user",
  "rows": [
    {
      "cells": [
        "user_name",
        "password"
      ],
      "line": 16
    },
    {
      "cells": [
        "tom",
        "tom"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I cannot access Hit Rate report",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_login_with_below_user(DataTable)"
});
formatter.result({
  "duration": 12986,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_cannot_access_Hit_Rate_report()"
});
formatter.result({
  "duration": 9813,
  "status": "passed"
});
formatter.after({
  "duration": 455102,
  "status": "passed"
});
formatter.after({
  "duration": 372927,
  "status": "passed"
});
formatter.uri("searchHitrate.feature");
formatter.feature({
  "line": 1,
  "name": "Hitrate Report",
  "description": "",
  "id": "hitrate-report",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8532050270,
  "status": "passed"
});
formatter.before({
  "duration": 8275596798,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I have login as below user",
  "rows": [
    {
      "cells": [
        "user_name",
        "password"
      ],
      "line": 5
    },
    {
      "cells": [
        "mandy",
        "test"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I have the following hit rate data",
  "rows": [
    {
      "cells": [
        "visit_date",
        "website",
        "visits"
      ],
      "line": 8
    },
    {
      "cells": [
        "2016-01-06",
        "www.bing.com",
        "14065457"
      ],
      "line": 9
    },
    {
      "cells": [
        "2016-01-06",
        "www.ebay.com.au",
        "19831166"
      ],
      "line": 10
    },
    {
      "cells": [
        "2016-01-06",
        "www.facebook.com",
        "104346720"
      ],
      "line": 11
    },
    {
      "cells": [
        "2016-01-06",
        "mail.live.com",
        "21536612"
      ],
      "line": 12
    },
    {
      "cells": [
        "2016-01-06",
        "www.wikipedia.org",
        "13246531"
      ],
      "line": 13
    },
    {
      "cells": [
        "2016-01-06",
        "au.yahoo.com",
        "11492756"
      ],
      "line": 14
    },
    {
      "cells": [
        "2016-01-06",
        "www.google.com",
        "26165099"
      ],
      "line": 15
    },
    {
      "cells": [
        "2016-01-06",
        "ninemsn.com.au",
        "21734381"
      ],
      "line": 16
    },
    {
      "cells": [
        "2016-01-20",
        "mail.live.com",
        "24344783"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I have the following exclusion list",
  "rows": [
    {
      "cells": [
        "host",
        "excluded_since",
        "excluded_till"
      ],
      "line": 19
    },
    {
      "cells": [
        "facebook.com",
        "2016-12-01",
        ""
      ],
      "line": 20
    },
    {
      "cells": [
        "google.com",
        "2016-01-01",
        "2016-03-14"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SearchHitrateSteps.i_have_login_as_below_user(DataTable)"
});
formatter.result({
  "duration": 103844722,
  "status": "passed"
});
formatter.match({
  "location": "SearchHitrateSteps.i_have_the_following_hit_rate_data(DataTable)"
});
formatter.result({
  "duration": 19516539,
  "status": "passed"
});
formatter.match({
  "location": "SearchHitrateSteps.i_have_the_following_exclusion_list(DataTable)"
});
formatter.result({
  "duration": 21546,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Search top 5 hit rate websites",
  "description": "",
  "id": "hitrate-report;search-top-5-hit-rate-websites",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I search for hit rate on 2016-01-06",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I should see the following hit rates",
  "rows": [
    {
      "cells": [
        "visit_date",
        "website",
        "visits"
      ],
      "line": 26
    },
    {
      "cells": [
        "2016-01-06",
        "www.facebook.com",
        "104346720"
      ],
      "line": 27
    },
    {
      "cells": [
        "2016-01-06",
        "ninemsn.com.au",
        "21734381"
      ],
      "line": 28
    },
    {
      "cells": [
        "2016-01-06",
        "mail.live.com",
        "21536612"
      ],
      "line": 29
    },
    {
      "cells": [
        "2016-01-06",
        "www.ebay.com.au",
        "19831166"
      ],
      "line": 30
    },
    {
      "cells": [
        "2016-01-06",
        "www.bing.com",
        "14065457"
      ],
      "line": 31
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2016",
      "offset": 25
    },
    {
      "val": "01",
      "offset": 30
    },
    {
      "val": "06",
      "offset": 33
    }
  ],
  "location": "SearchHitrateSteps.i_search_for_hit_rate_on(int,int,int)"
});
formatter.result({
  "duration": 1617270,
  "status": "passed"
});
formatter.match({
  "location": "SearchHitrateSteps.i_should_see_the_following_hit_rates(DataTable)"
});
formatter.result({
  "duration": 17031,
  "status": "passed"
});
formatter.after({
  "duration": 300453,
  "status": "passed"
});
formatter.after({
  "duration": 444870,
  "status": "passed"
});
});