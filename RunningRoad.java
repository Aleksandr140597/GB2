public class RunningRoad implements AbstractToDo {
    int length;

    public RunningRoad(int length) {
        this.length = length;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "long road is " + length + " m";
    }
}
