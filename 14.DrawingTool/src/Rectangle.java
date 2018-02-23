
public class Rectangle extends Square{

    private int secondSideSize;

    public Rectangle(int sideSize, int secondSideSize) {
        super(sideSize);
        this.setSecondSideSize(secondSideSize);
    }

    public int getSecondSideSize() {
        return secondSideSize;
    }

    private void setSecondSideSize(int secondSideSize) {
        this.secondSideSize = secondSideSize;
    }

    @Override
    public String draw() {
        StringBuilder output = new StringBuilder();
        output.append("|");
        for (int j = 0; j < super.getSideSize(); j++) {
            output.append("-");
        }

        output.append("|");
        output.append(System.lineSeparator());

        for (int i = 1; i < this.getSecondSideSize() - 1; i++) {
            output.append("|");
            for (int j = 0; j < super.getSideSize(); j++) {
                output.append(" ");
            }

            output.append("|");
            output.append(System.lineSeparator());
        }

        output.append("|");
        for (int j = 0; j < super.getSideSize(); j++) {
            output.append("-");
        }

        output.append("|");

        return output.toString();
    }
}
