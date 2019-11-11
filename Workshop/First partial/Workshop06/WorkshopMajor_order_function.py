def elevate ():
    number_list = [1, 2, 3, 4, 5, 6, 8, 9]  
    result = list(map(lambda x: x**2, number_list ))
    print(result)
  
elevate()
