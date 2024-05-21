public class Range {

    private Integer leftBorder;
    private Integer rightBorder;


    public Range(){}
    public Integer getLeftBorder() {
        return leftBorder;
    }

    public void setLeftBorder(Integer leftBorder) {
        this.leftBorder = leftBorder;
    }

    public Integer getRightBorder() {
        return rightBorder;
    }

    public void setRightBorder(Integer rightBorder) {
        this.rightBorder = rightBorder;
    }

    public Range(Integer leftBorder, Integer rightBorder) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
    }

    @Override
    public String toString() {
        return "{" + leftBorder +
                " " + rightBorder +
                '}';
    }
}
