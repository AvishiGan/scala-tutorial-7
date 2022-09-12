object Q2 extends App{
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val A = x-y-z
    println(A)
}

class Rational(x: Int, y:Int){
    def numer = x
    def denom = y

    //methods
    def +(r: Rational) = new Rational(this.numer*r.denom + r.numer*this.denom, denom*r.denom)
    def neg = new Rational(-this.numer, this.denom)
    def -(r: Rational) = this+r.neg
    override def toString = numer + "/" + denom
}