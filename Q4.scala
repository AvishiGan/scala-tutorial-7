object Q4 extends App {

    val account1= new Account("1A", 1, 100)
    val account2= new Account("2B", 2, 200)
    val account3= new Account("3C", 3, 300)
    val account4= new Account("4D", 4, 400)

    var bank: List[Account] = List(account1,account2,account3,account4)

    // //find a back account
    // //parameters -> (n-nic, list of accounts)
    // //filter method -> go through the list -> returns all accounts with nic n
    // val find = (n: String, b: List[Account]) => b.filter(a => a.nic.equals(n))

    //list of accounts with negative balances
    val overdraft = bank.filter(a=>a.balance<0)

    //total of all account balances
    val balance = bank.map((a)=>(a.balance)).reduce((a,b)=>(a+b))

    //if balance is positive deposit interest is .05
    //if balance is negative overdraft interest is .1
    val interest = (b:List[Account])=>b.map((a) => (a.nic,a.acnumber,if(a.balance>0)  (a.balance+(a.balance*0.5)) else (a.balance+(a.balance*0.1)) ))

    println("\n")
    print("Accounts with negative balance: \n")
    println(overdraft)
    println("\n")
    print("Sum of all account balances: \n")
    println(balance)
    println("\n")
    print("Final balances with interest: \n")
    println(interest(bank))
    println("\n")
}

//bank->var -> list of accounts
var bank: List[Account] = List()

//Account data structure
class Account(id: String, num: Int, b: Double){
    val nic: String = id
    val acnumber: Int = num
    val balance: Double = b

    override def toString = "[" + nic + " : " + acnumber + " : " + balance + "]"
}

