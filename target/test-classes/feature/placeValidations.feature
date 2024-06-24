Feature: Validating Place API's

@AddPlace @Regression
Scenario Outline: Verify if Place is being Successfully added using AddPlaceAPI
			Given Add Place Payload with "<name>" "<language>" "<addess>"
			When user calls "addPlaceAPI" with "POST" http request
			Then the API call got success with status code 200
			And "status" in reponse body is "OK"
			And "scope" in reponse body is "APP"
			And verify place Id created maps to "<name>" using "getplaceAPI"
			
			
Examples: 
			|name     | language    |addess |
			|Yashwant | Halbi       | CG		|
#			|Pradeep  | Gondi 			| CG 		|   

@DeletePlace @Regression
Scenario: Verify if Delete Place functionality is working 

			Given DeletePlace Payload
			When user calls "deletePlaceAPI" with "POST" http request 
			Then the API call got success with status code 200
			And "status" in reponse body is "OK"
			