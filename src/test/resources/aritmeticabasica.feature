Feature: arithmetic operations

  Scenario: client wants to add two numbers
    When the client calls /aritmeticasimple/add with values 10 and 2
    Then the client receives answer as 12

  Scenario: client wants to subtract two numbers
    When the client calls /aritmeticasimple/subtract with values 5 and 3
    Then the client receives answer as 2

  Scenario: client wants to divide two numbers
    When the client calls /aritmeticasimple/div with values 6 and 2
    Then the client receives answer as 3


  Scenario Outline: client wants to multiply two numbers
    When the client calls /aritmeticasimple/mul with values <number1> and <number2>
    Then the client receives answer as <result>

    Examples:
      | number1 | number2 | result |
      | 2       | 3       | 6      |
      | 4       | 6       | 24     |
      | 7       | 8       | 52     |

