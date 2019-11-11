import random
#primera forma
#(a,b,c,d)=(1,2,3,4)
#if (random.randint(0,100)>50)
#else (4,3,2,1)
#print (a,b,c,d)
#ternary expressions


(a,b,c,d) = (1,2,3,4) if (random.randint(0,100)>50) else (4,3,2,1)
print (a,b,c,d)