class Phone:
    def __init__(self, _brand, _model, _size, _age, _name):
        self.brand = _brand
        self.model = _model
        self.size = _size
        self.age = _age
        self.name = _name
    def __repr__(self):
            return 'Phone ({}, {}, {}, {}, {})'.format(self.brand, self.model, self.size, self.age, self.name)
    
    def say_name(self):
        print('The phone is  {}'.format(self.name))


phone = Phone('Samsung', 's9','5.8 inches', '2015','Samsung s9')
print(phone)