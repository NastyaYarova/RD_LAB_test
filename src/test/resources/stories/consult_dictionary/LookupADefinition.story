Lookup a definition
Narrative:
In order to talk better
As an English student
I want to look up word definitions


Scenario: Looking up the wrong mail ErrorMessage
Meta:
@skip
@ignored true
Given user is on the FscebookEnterPage
When user input '0980261901'
And user input wrong '12345678'
And user click on the button logIn
Then they should see the ErrorMessage 'The password you’ve entered is incorrect. '