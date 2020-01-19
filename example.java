class Box {
    private int length, breath, height;

    public void setdim(int l, int b, int h) {
        length = l;
        breath = b;
        height = h;

    }

    public void showdim() {
        System.out.println("l=" + length);
        System.out.println("b=" + breath);
        System.out.println("h=" + height);

    }

}

public class example {
    public static void main(String arga[]) {
        Box smallbox = new Box();
        smallbox.setdim(2, 3, 4);
        smallbox.showdim();

    }
}