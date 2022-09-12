object Q1 extends App{
    val x = new Rational(1, 2)
    println(x.neg)
}

class Rational(x: Int, y: Int){
    def numer = x
    def denom = y

    def neg = new Rational(-this.numer, this.denom) //neg -> method
    override def toString = numer + "/" + denom
}