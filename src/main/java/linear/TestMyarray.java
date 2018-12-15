package linear;

public class TestMyarray {

    public static void main(String[] args) {
        Myarray myarray = new Myarray();
        myarray.add(100);
        myarray.add(101);
        myarray.add(102);
        myarray.add(103);
        System.out.println(myarray.size());
        myarray.show();

        myarray.del(1);
        System.out.println(myarray.size());
        myarray.show();

        myarray.insert(1,200);
        myarray.show();

        myarray.replace(1,202);
        myarray.show();
    }
}
