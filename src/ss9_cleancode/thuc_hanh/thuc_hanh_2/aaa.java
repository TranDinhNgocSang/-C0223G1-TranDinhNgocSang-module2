package ss9_cleancode.thuc_hanh.thuc_hanh_2;

public class aaa {
    public static void main(String[] args) {
        int []arr ={1,2,3,3};
        System.out.println(solution(arr));
    }
    public static boolean solution(int[] a) {
        int sum=0;
        int sum1=0;
        boolean flag = false;
        for (int p: a) {
            sum+=p;
        }
        for (int i =0; i<a.length;i++){
            sum += a[i];
        }
        for (int i =1; i<a.length;i++){
            sum1 += a[i-1];
            if((sum-(sum1+a[i]))==sum1){
                flag = true;
            }
        }
        return flag;
    }
}
