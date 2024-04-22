Intuition
My first thought was just to check every possible way of reaching past the end, and I spent some time getting that to work recursively but it was immensely inefficient. Eventually I realized that since a "2" meant you could go either one or two steps, we only needed to keep track of the most recent jump from the end.

Approach
I created a variable to keep track of how big of a number I needed at each spot, and then I went from the end of the list and stepped backwards until I reached a number that large, incrementing the variable each time. Once I hit something that worked I set the variable to 0 and kept going. Once I reached the end, if the variable was 0, it meant it could jump from thing to thing until it reached the end.

Complexity
Time complexity: O(n)
Space complexity: O(1)