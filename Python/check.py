def run():

    ask = input("sentence --> ")
    ask2 = input("word/ letter you want to check -- > ")

    
    x = ask.split()
    if len(x) == 1:
        x = ask

    count = 0

    for i in x:

        if ask2 in i:
            
            count +=1
    
    print(count)


    
run()




            

    
    