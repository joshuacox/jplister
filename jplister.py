#!/usr/bin/env python
# Notice my useage of a tuple and not a list, which is already immutable in python
def main():
    listOne = ( 'a', 'b', 'c' )
    listTwo = ( 1, 2, 3 )
    print(listOne[0])
    print(listTwo[0])

if __name__ == "__main__":
    main()
