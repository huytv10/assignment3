import java.util.Scanner;

public class Fraction {
    private int tuSo;
    private int mauSo;

    public Fraction() {
    }

    public Fraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap tu so: ");
        setTuSo(scanner.nextInt());

        System.out.print("nhap mau so: ");
        setMauSo(scanner.nextInt());
    }

    void inPhanSo() {
        System.out.println("phan so: " + getTuSo() + "/" + getMauSo());
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void rutGonPhanSo() {
        int i = timUSCLN(getTuSo(), getMauSo());
        setTuSo(getTuSo() / i);
        setMauSo(getMauSo() / i);
    }

    public void nghichDaoPhanSo() {
        int x = getTuSo();
        int y = getMauSo();

        setTuSo(y);
        setMauSo(x);
    }

    public void add(Fraction ps) {
        int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        Fraction phanSoTong = new Fraction(ts, ms);
        phanSoTong.rutGonPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
    }

    public void sub(Fraction ps) {
        int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        Fraction phanSoHieu = new Fraction(ts, ms);
        phanSoHieu.rutGonPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
    }

    public void mul(Fraction ps) {
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        Fraction phanSoTich = new Fraction(ts, ms);
        phanSoTich.rutGonPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tuSo + "/" + phanSoTich.mauSo);
    }

    public void div(Fraction ps) {
        int ts = this.getTuSo() * ps.getMauSo();
        int ms = this.getMauSo() * ps.getTuSo();
        Fraction phanSoThuong = new Fraction(ts, ms);
        phanSoThuong.rutGonPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tuSo + "/" + phanSoThuong.mauSo);
    }


}
