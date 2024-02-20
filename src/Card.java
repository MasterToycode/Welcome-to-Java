public class Card {
    private String numbers;
    private String color;
    private int size;

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Card(String numbers, String color, int size) {
        this.numbers = numbers;
        this.color = color;
        this.size = size;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return  numbers+"->"+color+" ";
    }
}
