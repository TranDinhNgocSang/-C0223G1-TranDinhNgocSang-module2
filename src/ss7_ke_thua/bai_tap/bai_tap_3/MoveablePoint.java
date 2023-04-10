package ss7_ke_thua.bai_tap.bai_tap_3;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed , this.ySpeed};
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")"+",speed=("+this.xSpeed+","+this.ySpeed+")";
    }
    public MoveablePoint move(){
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }
}
