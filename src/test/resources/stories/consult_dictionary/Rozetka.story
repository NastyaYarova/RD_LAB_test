Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Looking up the List of the goods specified price
Given the user is on the rozetkaMain page
When the user input the goods 'плойка для волос'
When the user click on button search
When the user input minPrice '550'
When the user input maxPrice '600'
When the user click on priceButton
Then they should see the goods in the range '550' to '600'