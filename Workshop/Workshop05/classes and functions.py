#Clases y funciones
#classes = []
#for i in range(10):
#    class Dummy:
#        def init(self, _name):
#            self._name = 'Dummy {}'.format(i)
#            
#    classes.append(Dummy)
    
#for item in classes:
#    dummy = item()
#    print(dummy.name)
    

#print("Hello World")

class Student:
    
    university = 'Espe'
    class Meta:
        name = 'MetaClass'
    
    def __init__(self, _id, _name, _age, _carrer, _cell_number):
        self.id = _id
        self.name = _name
        self.age = _age
        self.carrer = _carrer
        
        class Phone:
            def __init__(self, _number):
                self.number = _number
            
            def __repr__(self):
                return 'Phone({})'.format(self.number)
        
        self.phone = Phone(_cell_number)
        
    def __repr__(self):
        return 'Student ({}, {}, {}, {}, {})'.format(self.id, self.name, self.age, self.carrer, self.phone)
    
    def say_name(self):
        print('My name is {}'.format(self.name))


student = Student(1, 'Diego', 18, 'Ing Software','0994651465')
student1 = Student(2, 'Edison', 19, 'Ing Software','0990316348')
student.say_name()
student1.say_name()

print(student)
print(student1)

print(Student.Meta.name)