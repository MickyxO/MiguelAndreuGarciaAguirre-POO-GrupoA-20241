class Bank:

 __employees=[]

 def  addEmployee(self,  employe):
     self.__employees.append(employe)

 def printAllEmploy(self):
     for employ in self.__employees:
         print("\n Empleado {} {} ".format(employ.get_name(),employ.get_last_name()))
         employ.printAccounts()

 def search_employee(self,name,last_name):
     band= False
     for employee in self.__employees:
         if name.lower() == employee.get_name().lower() and last_name.lower() == employee.get_last_name().lower():
             band=True
             break
     return band

 def search_employe_name(self,name,last_name):
     employ_aux = None
     for employee in self.__employees:
         if name.lower() == employee.get_name().lower() and last_name.lower() == employee.get_last_name().lower():
             aux=employee
             break
     return aux










