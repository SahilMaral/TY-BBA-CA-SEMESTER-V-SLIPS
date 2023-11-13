def encypt(txt):  
    result = ""  
    for i in range(len(txt)):  
        char = txt[i]
        if (char.isupper()):  
            result += chr((ord(char) + 2 - 64) % 26 + 65)
        else:  
            result += chr((ord(char) + 2 - 96) % 26 + 97)  
    return result  

txt = input('Enter a string : ')

print("Plain txt : " + txt)  
print("Cipher: " + encypt(txt))