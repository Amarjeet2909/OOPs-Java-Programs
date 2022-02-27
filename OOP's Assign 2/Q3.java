//Question 3 | Amarjeet kumar singh | Roll no: 202002021073
public class Q3 {
    static class Delivery {
        int year;
        int deliveryNum;
        int areaCode;
        int weight;
        float fee;
        String deliveryCode;

        Delivery(int year, int deliveryNum, int areaCode, int weight) {
            this.year = year;
            this.deliveryNum = deliveryNum;
            this.areaCode = areaCode;
            this.weight = weight;
            deliveryCode = year + "00" + deliveryNum;

            if (areaCode == 1 && weight < 5) fee = 12f;
            else if (areaCode == 1 && weight > 5 && weight < 20) fee = 16.50f;
            else if (areaCode == 1 && weight > 20) fee = 22f;
            else if (areaCode == 2 && weight < 5) fee = 35f;
            else if (areaCode == 2 && weight > 5) fee = 47.95f;

            System.out.println("Delivery Fee: $" + fee);
        }

         void getInfo() {
            System.out.println("Year: "+year);
            System.out.println("Area code: "+areaCode);
            System.out.println("Weight: "+weight);
            System.out.println("Delivery Code: "+deliveryCode);
        }
    }

    public static void main(String[] args) {
        Delivery a = new Delivery(2021, 69, 1, 25);
        a.getInfo();
    }
}