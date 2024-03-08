
class Account:
    account_number=0
    amount = 0
    account_type= ''
    ammount_max=0

    def __init__(self,accoun_num,type):
        if type!='A' and type!='B' and type!='C':
            print("TIPO NO VALIDO, CUENTA NO CREADA ")
        else:
            self.account_number=accoun_num
            self.account_type=type
            if type=='A':
                self.ammount_max = 50000
            elif type=='B':
                self.ammount_max = 100000


    def get_acc_number(self):
        return self.account_number

    def get_amount(self):
        return self.amount

    def get_acount_type(self):
        return self.account_type

    def setAmount (self,quantity):
        if self.account_type=='A' or self.account_type=='B':
            if self.amount<self.ammount_max and self.amount + quantity <self.ammount_max:
                self.amount += quantity
        elif self.account_type=='C':
                self.amount += quantity
        else:
                print("VALOR NO ADECUADO")


    def extamount(self, quant):
        if self.account_type=='A':
            if quant>=1000 and quant<self.ammount_max and quant<self.amount:
                self.amount-=quant
            else:
                print("CANTIDAD INADECUADA")
        elif self.account_type=='B':
            if quant >= 5000 and quant < self.ammount_max and quant < self.amount:
                self.amount -= quant
            else:
                print("CANTIDAD INADECUADA")
        elif self.account_type=='C':
            if quant >= 10000 and quant < self.amount:
                self.amount -= quant
            else:
                print("CANTIDAD INADECUADA")
