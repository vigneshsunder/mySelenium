# Program to count the characters in a given string

def count_characters(input_string):
    return len(input_string)

# Example usage
if __name__ == "__main__":
    user_input = input("Enter a string: ")
    print(f"The number of characters in the string is: {count_characters(user_input)}")