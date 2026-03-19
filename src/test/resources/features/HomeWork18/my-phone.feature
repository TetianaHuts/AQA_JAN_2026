   Feature: Test with Allo + DB + Selenium
    Scenario: Search for iPhone, find 3 phone prices and sync with DB
        # WEB
        Given I open "/?srsltid=AfmBOoqQyPWz2MW4_4scuYaqhFus3liz7uppFJVo37Hx-WlnhBKklQSI"
        Given I search for "Iphone"
        When I save model and prices for the first 3 phones

        # DB
        Then I synchronize the received data into the DB
       | if model exists     | assert price is same |
       | if model not exists | write model and price to DB |

             # TODO: on allo.ua:
#TODO: search for iphone
#TODO: find 3 first phone prices
#TODO: check if this model is in DB if yes - assert price is same
#TODO: if not in DB -> write to DB phone model and its price
