
public class Square implements Drawable{

    private int sideSize;

    public Square(int sideSize) {
        this.setSideSize(sideSize);
    }

    public int getSideSize() {
        return sideSize;
    }

    private void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public String draw() {
        StringBuilder output = new StringBuilder();
        output.append("|");
        for (int j = 0; j < this.getSideSize(); j++) {
            output.append("-");
        }

        output.append("|");
        output.append(System.lineSeparator());

        for (int i = 1; i < this.getSideSize() - 1; i++) {
            output.append("|");
            for (int j = 0; j < this.getSideSize(); j++) {
                output.append(" ");
            }

            output.append("|");
            output.append(System.lineSeparator());
        }

        output.append("|");
        for (int j = 0; j < this.getSideSize(); j++) {
            output.append("-");
        }
        output.append("|");

        return output.toString();
    }
}
