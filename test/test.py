a= "STUDENT"
z = 1
g= []
for i in range(len(a)):
    if z%2 ==0:
        z = z+1
    txt= a[i]*z
    g.append(txt)
    z=z+1

k = 0

spc = len(g[-1])//2
for i in range(spc,-1,-1):
    print((" "*i),g[k])
    k = k+1