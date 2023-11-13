from collections import Counter

def count_repeated_chars(string):
    char_count = Counter(string)
    repeated_chars = {char: count for char, count in char_count.items() if count > 1}
    return repeated_chars

string = 'thequickbrownfoxjumpsoverthelazydog'
repeated_chars = count_repeated_chars(string)

for char, count in repeated_chars.items():
    print(char,"-",count,",",end=" ")
