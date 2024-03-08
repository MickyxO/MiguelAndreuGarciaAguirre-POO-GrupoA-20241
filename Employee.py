import random
from Account import Account
from Bank import Bank

class Employee:
    __name=""
    __last_name=""

    def __init__(self,name,last_name,type):
        if type=='A' or type=='B' or type=='C':
            self.__name= name
            self.__last_name= last_name
            self.__bank_accounts = []  # Cada instancia tendrá su propia lista de cuentas
            self.bank = Bank()
            self.__bank_acc = Account(self.generate_num(),type)
            self.__bank_accounts.append(self.__bank_acc)
            self.bank.addEmployee(self)
        else:
            print("TIPO NO VALIDO, CUENTA NO CREADA. ")



    def generate_num(self):
        while True:
            band= True
            x = random.randint(1000,5000)
            for cuentas in self.__bank_accounts:
                if Account.get_acc_number(cuentas) == x: #le das de parametro una cuenta
                    band=False
                    break
            if band:
                return x

    def addBankAcc(self,type):
        if type == 'A' or type == 'B' or type == 'C':
            self.__bank_acc = Account(self.generate_num(), type)
            self.__bank_accounts.append(self.__bank_acc)
        else:
            print("TIPO INVALIDO, NO CREAR CUENTA. ")

    def get_name(self):
        return self.__name

    def get_last_name(self):
        return self.__last_name

    def get_account(self,index):
        return self.__bank_accounts.__getitem__(index)

    def get_acc_num(self,emp):
        return len(self.__bank_accounts)

    def printAccounts(self):
        for account in self.__bank_accounts:
            print("Número de cuenta: {},saldo: {}, tipo de cuenta: {} \n"
                  .format(account.get_acc_number(),account.get_amount(),account.get_acount_type()))


    def printAaccount(self,index):
        employ= self.__bank_accounts.__getitem__(index)
        print("Número de cuenta: %d, saldo: %.2f, tipo de cuenta: '%c'\n",
                    employ.getAccount_number(), employ.getAmount(), employ.getAccount_type())





