name = 'Diego'
age = 19
names = ["Stiven","Dennis","Jerico","Adrian","Steven"]
#names.append("Diego")
#names.extend["Adrian","Stalin"]
#names.insert(0,"Wladymir")
#return_name =names.pop()
names[0]= "El Steven"
ages = [18, 60, 23, 22, 26]
names_with_ages = zip (names,ages)
#for student in names_with_ages:
    #print(student)

list1 = [25, 5, 6, 8, 10]
list2 = [4, 18, 26, 54, 2]
list1_and_list2 = zip(list1, list2)


for lists in list1_and_list2:


    print(lists[0]*lists[1])