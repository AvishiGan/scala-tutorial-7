object Q3 extends App{
    val account1 = new Account("1A", 1, 250)
    val account2 = new Account("2B", 2, 100)

    account1.transfer(account2, 50)

    println("Balances after money transfer")
    println(account1)
    println(account2)
}

class Account(id: String, num: Int, b: Double){
    val nic: String = id
    val acnumber: Int = num
    var balance: Double = b

    def withdraw(n: Double)= this.balance=this.balance-n
    
    def deposit(n: Double)= this.balance=this.balance+n
    
    def transfer(acc: Account, n: Double)={
        this.withdraw(n)
        acc.deposit(n)
    }
    
    override def toString = "[" + nic + " : " + acnumber + " : " + balance + "]"
}