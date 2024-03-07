package Fat;

public class Number {
    private int num;//
    private int den;//mother

    public Number(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Number() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public Number scrify(){
        int i = EuclideanGCD(this.num, this.den);
        this.den/=i;
        this.num/=i;
        return new  Number(this.num,this.den);
    }


    private int EuclideanGCD(int num1, int num2)
    {
        if (num1<num2)
        {
            int tep=num1;
            num1=num2;
            num2=tep;
        }

        while (num2 > 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    public boolean Com(Number o){
        return  (this.num*o.den>this.den*o.num);
    }


    private int Tongfen(int a,int b){
        return a*b;
    }



    public Number Add(Number o){
       return   new Number((this.num * o.den + this.den * o.num), Tongfen(this.den, o.den)).scrify();
    }

    public Number Sub(Number o){
        return   new Number((this.num * o.den - this.den * o.num), Tongfen(this.den, o.den)).scrify();
    }

    public Number Mul(Number o){
        return new Number(this.num*o.num,this.den*o.den).scrify();
    }

    public Number OPPMUL(Number o){
        return new Number(this.num*o.den,this.den*o.num).scrify();
    }

    @Override
    public String toString() {
        return (this.num+"/"+this.den);
    }
}
