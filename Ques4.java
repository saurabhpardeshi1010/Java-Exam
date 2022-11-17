class Grandparents{
    String grandFatherName;
    String grandMotherName;

    Grandparents(String x, String y) {
        grandFatherName = x;
        grandMotherName = y;
        System.out.println("Grandfathers Name : "+grandFatherName);
        System.out.println("Grandmothers name : "+grandMotherName);
    }
}
class Parents extends Grandparents{
    String FatherName;
    String MotherName;


    Parents(String x, String y, String s, String r) {
        super(x, y);
        FatherName = x;
        MotherName = y;
        System.out.println("Fathers Name : "+FatherName);
        System.out.println("Mothers Name : "+MotherName);
    }
}
class Child extends Parents{

    Child(String x, String y, String s, String r) {
        super(x, y, s, r);
    }

    public static void main(String[] args) {
        Child C = new Child("GrandFather","GrandMother","Father","Mother" );
    }
}

