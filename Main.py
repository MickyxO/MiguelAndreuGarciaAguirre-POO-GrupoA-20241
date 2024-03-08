from Employee import Employee
from Bank import Bank

bank= Bank()

print("BIENVENIDO AL SISTEMA BANCARIO")
while True:
    print("Que acción desea realizar?\n " +
          "1. Crear una cuenta empleado con cuenta bancaria. \n" +
          "2. Añadir una cuenta bancaria a un empleado. \n" +
          "3. Añadir fondos a una cuenta bancaria. \n" +
          "4. Retirar fondos de una cuenta bancaria. \n" +
          "5. Mostrar todos los empleados. \n" +
          "6. Mostrar todas mis cuentas bancarias. \n" +
          "E= EXIT \n")
    option= input("Que accion desea realizar: ")

    if option == '1':
        name= input("Ingresa el nombre del usuario: ")
        last_name= input("Ingresa el apellido: ")
        type= input("Ingresa el tipo de cuenta (A,B,C): ")
        Employee(name, last_name, type)
        print("CUENTA AGREGADA!")
    elif option == '2':
        name1= input("Ingresa el nombre del empleado al que quieres agregar cuentas: ")
        last_name1= input("Ingresa su apellido: ")
        band= bank.search_employee(name1,last_name1)
        if band:
            employee= bank.search_employe_name(name1,last_name1)
            type1= input("Ingresa el tipo de cuenta a crear: ")
            employee.addBankAcc(type1)
            print("CUENTA AGREGADA")
        else:
            print("EMPLEADO NO EXISTENTE")
    elif option == '3':
        name2= input("A que empleado deseas agregar fondos?, di su nombre. ")
        last_name2 = input("Di su apellido. ")
        band2 = bank.search_employee(name2, last_name2)
        if band2:
            employee= bank.search_employe_name(name2,last_name2)
            bank_acc= employee.get_acc_num(employee)
            print("La cantidad de cuentas es {}, empieza desde 0".format(bank_acc))
            index= int(input("A que cuenta deseas agregar?:  "))
            if index>= bank_acc:
                print("CUENTA NO VALIDA")
            else:
             money= float(input("Cuanto dinero quieres agregar: "))
             employee.get_account(index).setAmount(money)
             print("DEPOSITO REALIZADO")
        else:
            print("EMPLEADO NO EXISTENTE")
    elif option== '4':
        name3= input("A que empleado deseas retirar fondos? Di su nombre: ")
        last_name3 = input("Di su apellido: ")
        band3 = bank.search_employee(name3, last_name3)
        if band3:
            employee = bank.search_employe_name(name3, last_name3)
            ank_acc = employee.get_acc_num(employee)
            print("La cantidad de cuentas es {}, empieza desde 0".format(ank_acc))
            index = int(input("A que cuenta deseas retirar?:  "))
            if index >= ank_acc:
                print("CUENTA NO VALIDA")
            else:
             money= float(input("Cuanto deseas retirar?:  "))
             employee.get_account(index).extamount(money)
             print("OPERACION REALIZADA")
        else:
            print("EMPLEADO NO EXISTENTE")
    elif option== '5':
        bank.printAllEmploy()
    elif option=='6':
        name4= input("De que empleado deseas conocer las cuentas? Di su nombre: ")
        last_name4 = input("Di su apellido: ")
        band4 = bank.search_employee(name4, last_name4)
        if band4:
            employee = bank.search_employe_name(name4, last_name4)
            employee.printAccounts()
        else:
            print("NO EXISTE EL EMPLEADO")
    elif option=='E':
        break
    else:
        print("Opción no válida. Por favor, seleccione una opción válida.")



