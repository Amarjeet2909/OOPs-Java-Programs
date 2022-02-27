//Question 14 | Amarjeet kumar singh | Roll no: 202002021073
public class Q14 {
    
    String name;
    String dob;
    int s[] = new int[5];

     Q14(String name, String dob, int s[])
     {
        this.name= name;
        this.dob= dob;
        this.s[0]= s[0];
        this.s[1]= s[1];
        this.s[2]= s[2];
        this.s[3]= s[3];
        this.s[4]= s[4];
     }

     void display()
     {
        //suppose each paper is of 100 marks 
        int total= 500;
        float percentage;
        percentage = (((float)(s[0]+s[1]+s[2]+s[3]+s[4])/total)*100);
        if(percentage<40){
        System.out.println(name);
        }
     }
    public static void main(String args[]){
         int []A= {100,30,40,30,30};
         int []B= {40,30,50,70,80};
         int []C= {10,80,40,30,30};
         int []D= {80,30,45,30,30};
         int []E= {45,35,40,30,30};
         
         Q14 t1= new Q14("Amarjeet singh","2/1/2000",A);
         Q14 t2= new Q14("Devansu singh","13/3/2000",B);
         Q14 t3= new Q14("Aditya chaudhary","14/1/2000",C);
         Q14 t4= new Q14("Amrit tiwari","28/12/2001",D);
         Q14 t5= new Q14("S kumar","21/6/2000",E);
         System.out.println("Name of students with less than 40% marks:-");
         t1.display();
         t2.display();
         t3.display();
         t4.display();
         t5.display();
     }
}