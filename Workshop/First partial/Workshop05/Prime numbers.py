def square_number(number):
    return number**2
def print_number_pairs():
    numbers = range(20)
    even = [square_number(number) for number in numbers if number % 2 == 0]
    old = [square_number(number) for number in numbers if number % 2 != 0]
    
    for even, old in zip(even,old):
        print ('{} -> {}'.format(even,old))
        
print (print_number_pairs())