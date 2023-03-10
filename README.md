# Assignment
Solutions for the following -

1.Combination Sort-

The program first converts the input array to a list, and then creates three lists: L1, L2, and a temporary list called group. It then iterates through all lowercase letters in the alphabet, and for each character, it finds all strings in the input list with that character as the first character. It adds those strings to the temporary group list, sorts group in ascending order, and adds it to L1. It also keeps track of all of the groups



2.Perfect Number -

Given an input integer n, the function first initializes a variable sum to 1. Then, it iterates from 2 to the square root of n and checks if i is a factor of n. If i is a factor of n, the function adds both i and n/i to sum. Finally, the function checks if sum is equal to n (excluding the number itself) and returns true if the input integer is a perfect number and false otherwise.


3.ShortestDistanceOfManhattanPath -

The program starts by reading in the start point coordinates and the string of directions from the user. It then iterates through the directions string, and updates the current position on the x and y axis accordingly.
After the loop ends, it calculates the shortest distance between the start point and end point, based on the final coordinates of the endpoint, using the Pythagorean formula. Finally, it prints out the result to the user.
Note: this solution assumes that the user will enter valid input, so you should add additional checks and error handling in case the user provides invalid input.



4.Employee Listings-

This program reads the input file employees.csv and searches for employees who meet the given conditions. For each matching employee, it writes the corresponding line to either managers.csv or single_name_employees.csv. The output files are created in the same directory as the input file.
Note that this assumes the input file is correctly formatted with each line containing a name, role, and division separated by commas, and that the input file is in the current working directory. If the input file is in a different directory, you will need to provide the full path to the file. Also, this solution doesn't handle errors such as malformed input lines, empty input file, etc. You may want to add additional input validation and error handling if needed.
