//Question 16 | Amarjeet kumar singh | Roll no: 202002021073
public class Q16{
        String name;
        String address;
        char grade;
        int num;
        int room_charges;

        Q16(String name, String address, char grade, int num, int room_charges)
        {
            this.name= name;
            this.address= address;
            this.grade= grade;
            this.num= num;
            this.room_charges= room_charges;
        }

        void particular(Q16 p)
        {
            if(p.grade=='A'){
            System.out.println("Hotel of grade A: ");
            System.out.println(p.name);
            }
            else if(p.grade=='B'){
                System.out.println("Hotels of grade B: ");
                System.out.println(p.name);
            }
            else{
                System.out.println("Hotels of grade C: ");
                System.out.println(p.name);
            }
            
        }

        void charge_of_hotel(Q16 p)
        {
            int charge=800;
            if(p.room_charges<charge)
            System.out.println(p.name);
        }

    public static void main(String[] args){
        Q16 h1= new Q16("Hotel Gaurang Valley","kokrajhar",'A',100,500);
        Q16 h2= new Q16("Amarjeet palace","Darbhanga",'C',101,800);
        Q16 h3= new Q16("Jyotasna palace","Guwahati",'A',102,900);
        Q16 h4= new Q16("Simna International","Muzaffarpur",'A',103,990);
        Q16 h5= new Q16("Orange Fort","nagpur",'B',104,600);
        System.out.println("**************Hotels with particular grade*****************");
        h1.particular(h1);
        h2.particular(h2);
        h3.particular(h3);
        h4.particular(h4);
        h5.particular(h5);
        System.out.println("***************Hotels with charges less than 800rs***************");
        h1.charge_of_hotel(h1);
        h2.charge_of_hotel(h2);
        h3.charge_of_hotel(h3);
        h4.charge_of_hotel(h4);
        h5.charge_of_hotel(h5); 
    }
}