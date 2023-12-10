package animal;

public class Human extends Animal implements Thinkable {
    private String hobby; // 趣味

    public Human() {
    }

    public Human(String name, int age, String hobby) {
        // スーパークラスのコンストラクタを呼び出す
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + this.getHobby() + "について考えています。");
    }
}
