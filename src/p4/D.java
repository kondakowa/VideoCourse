package p4;

import static p1.A.*;   
import p1.p2.B;         
import p1.p2.p3.C;      
import p4.p5.E;         

public class D {
    public static void main(String[] args) {

        B b = new B();
        C c = new C();
        E e = new E();

        int sumA = g + h + j + k;
        int sumB = b.a + b.s + b.d + b.f;
        int sumC = c.t + c.y + c.u + c.i;
        int sumE = e.q + e.w + e.e + e.r;
        
        int total1 = sumA + sumB + sumC + sumE;
        
        
        System.out.println("     СЛОЖЕНИЕ ПЕРЕМЕННЫХ");
        System.out.println("Сумма переменных из класса A = " + sumA);
        System.out.println("Сумма переменных из класса B = " + sumB);
        System.out.println("Сумма переменных из класса C = " + sumC);
        System.out.println("Сумма переменных из класса E = " + sumE);
        System.out.println("------------------------------------------");
        System.out.println("Общая сумма всех переменных = " + total1);
        System.out.println("------------------------------------------");
        
        int multiplicationA = g * h * j * k;
        int multiplicationB = b.a * b.s * b.d * b.f;
        int multiplicationC = c.t * c.y * c.u * c.i;
        int multiplicationE = e.q * e.w * e.e * e.r;
        
        int total2 = multiplicationA + multiplicationB + multiplicationC + multiplicationE;
        
        System.out.println("     ПРОИЗВЕДЕНИЕ ПЕРЕМЕННЫХ");
        System.out.println("Произведение переменных из класса A = " + multiplicationA);
        System.out.println("Произведение переменных из класса B = " + multiplicationB);
        System.out.println("Произведение переменных из класса C = " + multiplicationC);
        System.out.println("Произведение переменных из класса E = " + multiplicationE);
        System.out.println("------------------------------------------");
        System.out.println("Произведение всех переменных = " + total2);
        System.out.println("------------------------------------------");
        
        
        
    }
}

