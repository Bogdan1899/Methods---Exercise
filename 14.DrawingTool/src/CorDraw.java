public class CorDraw {

    private Square figure;

    public CorDraw(Square figure) {
        this.setFigure(figure);
    }

    public Square getFigure() {
        return figure;
    }

    private void setFigure(Square figure) {
        this.figure = figure;
    }

    public String getShape(){

        return this.getFigure().draw();
    }
}
