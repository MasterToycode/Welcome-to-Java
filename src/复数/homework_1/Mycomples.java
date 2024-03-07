package homework_1;

import java.math.BigDecimal;

public class Mycomples {
    private BigDecimal r; // 实部
    private BigDecimal i; // 虚部

    // 构造函数
    public Mycomples(double r, double i) {
        this.r = BigDecimal.valueOf(r);
        this.i = BigDecimal.valueOf(i);
    }

    public Mycomples() {
    }


    // 加法操作
    public Mycomples add(Mycomples o) {
        return new Mycomples(this.r.add(o.r).doubleValue(), this.i.add(o.i).doubleValue());
    }

    // 减法操作
    public Mycomples sub(Mycomples o) {
        return new Mycomples(this.r.subtract(o.r).doubleValue(), this.i.subtract(o.i).doubleValue());
    }

    // 乘法操作
    public Mycomples mul(Mycomples o) {
        BigDecimal realPart = this.r.multiply(o.r).subtract(this.i.multiply(o.i));
        BigDecimal imagPart = this.r.multiply(o.i).add(this.i.multiply(o.r));
        return new Mycomples(realPart.doubleValue(), imagPart.doubleValue());
    }

    // 除法操作
    public Mycomples div(Mycomples o) {
        BigDecimal denominator = o.r.multiply(o.r).add(o.i.multiply(o.i));
        if (denominator.compareTo(BigDecimal.ZERO) == 0) {
            // 处理除以零的情况，返回一个新的 Mycomples 对象表示未定义
            return new Mycomples(Double.NaN, Double.NaN);
        }



        BigDecimal realPart = (this.r.multiply(o.r).add(this.i.multiply(o.i))).divide(denominator, BigDecimal.ROUND_HALF_UP);
        BigDecimal imagPart = (this.i.multiply(o.r).subtract(this.r.multiply(o.i))).divide(denominator, BigDecimal.ROUND_HALF_UP);
        return new Mycomples(realPart.doubleValue(), imagPart.doubleValue());
    }

    public BigDecimal getR() {
        return r;
    }

    public void setR(BigDecimal r) {
        this.r = r;
    }

    public BigDecimal getI() {
        return i;
    }

    public void setI(BigDecimal i) {
        this.i = i;
    }

    public void OUT(){
        System.out.println(this.i.floatValue()>0?
                this.r+"+"+this.i+"i":
                this.r+"-"+this.i+"i");
    }


    public void Printing(boolean o) {
        if (o) {
            OUT();
        } else {
            System.out.println("(" + this.r + "," + this.i + ")");
        }
    }

}
