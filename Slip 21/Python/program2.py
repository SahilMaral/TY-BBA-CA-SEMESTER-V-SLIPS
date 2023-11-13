tup1 = (('333', '33'), ('1416', '55'))
tup = tuple(
            tuple(
                int(x) for x in subtuple
                ) 
                for subtuple in tup1
            )
print(tup)
