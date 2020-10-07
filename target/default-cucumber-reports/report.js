$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/koalapalace.feature");
formatter.feature({
  "name": "Koala Palace",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@koalapalace"
    }
  ]
});
formatter.background({
  "name": "Koala Palace Admin Sign In",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to koala palace admin page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_goes_to_koala_palace_admin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username and password",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sign in",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC09_user create hotel room",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@koalapalace"
    },
    {
      "name": "@hotelroomcreate"
    }
  ]
});
formatter.step({
  "name": "user go to \"http://www.kaolapalace-qa-environment2.com/admin/HotelroomAdmin/Create\" room create page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_go_to_room_create_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects IDHotel drop down \"Star\" room create",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_selects_IDHotel_drop_down_room_create(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter code \"1234\" room create",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_enter_code_room_create(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter name \"enes\" room create",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_enter_name_room_create(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter location \"Australia\" room create",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_enter_location_room_create(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter description \"room create\" room create",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_enter_description_room_create(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user drag price to price box",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_drag_price_to_price_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects room type drop down \"Triple\" room create",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_selects_room_type_drop_down_room_create(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter max adult count \"3\" room create",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_enter_max_adult_count_room_create(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter max children count \"2\" room create",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_enter_max_children_count_room_create(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks approve button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_clicks_approve_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button room create",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_clicks_save_button_room_create()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user assert saving transaction room create",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDef.user_assert_saving_transaction_room_create()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});