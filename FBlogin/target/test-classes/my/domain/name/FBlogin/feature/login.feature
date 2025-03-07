Feature: Test Facebook Login 
  Scenario Outline: Test Facebook login 
    Given I open Chrome browser 
    And I go to Facebook page 
    When I enter valid "<username>" and "<password>" combination     
    Then I should be able to login successfully 
 
    Examples:  
	  | username 	| password    | 
    | validusername@domain.com | Secret! | 
    | firsttimeuser@ domain.com | ValidPass! | 
