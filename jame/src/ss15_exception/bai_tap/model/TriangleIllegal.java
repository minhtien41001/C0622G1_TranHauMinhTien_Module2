package ss15_exception.bai_tap.model;

import ss15_exception.bai_tap.exception.TriangleIllegalException;

public class TriangleIllegal {
    private int firstEdge;
    private int secondEdge;
    private int thirdEdge;

    public TriangleIllegal(){
    }

    public TriangleIllegal(int firstEdge, int secondEdge, int thirdEdge){
        if(firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0){
            try {
                throw new TriangleIllegalException("Cạnh tam giác phải lớn hơn 0.");
            }
            catch (TriangleIllegalException e){
                e.printStackTrace();
                System.out.print(e.getMessage());
            }
        }
        else if(firstEdge + secondEdge <= thirdEdge || firstEdge + thirdEdge <= secondEdge || secondEdge + thirdEdge <= firstEdge){
            try {
                throw new TriangleIllegalException("Tổng của hai cạnh bất kỳ phải lớn hơn cạnh còn lại.");
            }
            catch (TriangleIllegalException e){
                e.printStackTrace();
                System.out.print(e.getMessage());
            }
        }
        else {
            this.firstEdge = firstEdge;
            this.secondEdge = secondEdge;
            this.thirdEdge = thirdEdge;
        }
    }

    public int getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(int firstEdge) {
        this.firstEdge = firstEdge;
    }

    public int getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(int secondEdge) {
        this.secondEdge = secondEdge;
    }

    public int getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(int thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    @Override
    public String toString() {
        return "Tam giác có 3 cạnh là: " + firstEdge + ", " + secondEdge + ", " + thirdEdge;
    }
}
