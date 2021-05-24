package BaiTapKeThua;

public class Teacher extends Persion{
    private String lvl;

    public Teacher(String lvl) {
        this.lvl = lvl;
    }

    public Teacher(String ten, String diachi, String sdt, String lvl) {
        super(ten, diachi, sdt);
        this.lvl = lvl;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }
}
