def fibnocci():
    num = []
    ask = int(input('Please enter the range till where you want the fibnocci series --> '))
    for i in range(0,ask-1):
        if i <=1:
            num.append(i)
        if i >=1:
            sm = num[i-1]+num[i]
            num.append(sm)
    
    print(num)

fibnocci()