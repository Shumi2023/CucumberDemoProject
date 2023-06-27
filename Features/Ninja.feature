Feature: Validating Register Function

  Scenario Outline: Validating Register Function
    Given user navigates to Register Account page
    When user enters "<First_Name>" in the first name field and "<Last_Name>" in the last name field
    When user enters "<emailTxt>" in the email field and "<PhoneTxt>" in the telephone field
    When user enters  "<Pass>" in the password field and "<Confirm>" password confirmation field
    When user selects Privacy Policy Field
    When user Click on Continue button
    Then user Account should get successfully created

    Examples: 
      | First_Name | Last_Name | emailTxt                | PhoneTxt | Pass   | Confirm |
      | Tom        | Stewart   | stewarttom188@gmail.com | 94563284 | tom123 | tom123  |
