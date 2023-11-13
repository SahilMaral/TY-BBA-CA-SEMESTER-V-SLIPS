def replace_key(dict1, key, keys, new_value):
    if key in dict1:
        dict1[keys] = new_value
        del dict1[key]

dict1 = {'abc': 1, 'pqr': 2, 'xyz': 3}
print(dict1)
replace_key(dict1, 'pqr', 'mnl', 4)
print(dict1)