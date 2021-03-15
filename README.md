Start Application in CalculatorApplication.java  
Application runs at: http://localhost:8080  
Swagger UI is accessible: http://localhost:8080/swagger-ui/index.html   

Team number: 3                                           
                                                          
Team name: jamu                                          
                                                          
Team members:                                            
                                                          
    1. Üprus Jan Markus || 201754IVSB (juprus)           
    2. D'Angelo Mariano || 201752IVSB (madang)           
    3. Tomingas Andre || 192908IVSB (antomi)                                           


To use our API go to the searchbar and type in /calculator1 to see the first calculator's results, type /calculator2 to see the second calculator's results.

The first calculator contains the following services:
    - MaxOdd - finds the maximum odd value in a given array
    - Sum - finds the sum of numbers in a given array
    - Negatives - filters out positive values and returns negative ones in a given array

The second calculator contains the following services: 
    - SignReversed - reverses every value's sign in a given array
    - MaxOdd - finds the maximum odd value in a given array (this service is reused from the first calculator)
    - AverageOfEven - first filters out odd values and creates an array consisting of even ones, then calculates the average of the newly created array

To give input to the API type in the searchbar:
    - /calculator1?input?=1,-2,3,-4,5,6,-7,8 
    - /calculator2?input?=1,-2,3,-4,5,6,-7,8 

N.B the values used in the two calculators can be replaced with any other. If the input is left blank such as input?= the result will be null for every service.


