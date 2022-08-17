def run():

    nm = input("Please typ in your name --> ")

    a = []

    for i in range(1,6):
        sub = int(input("Please typ in your marks in subject {} --> ".format(i)))
        a.append(sub)
    
    sm = sum(a)
    ttl = 500
    per =  (sm/ttl) * 100
    print("You bagged a percentage of {} in your exams !".format(per))

run()