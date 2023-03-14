import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
        int[] num = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for(int i=0; i<num.length; i++) {
            //현재 정렬 대상 위치부터 그 앞의 숫자들까지 접근
            for(int j=i; j>0; j--) {
                //현재 정렬 대상 숫자가 앞의 위치의 숫자보다 작다면 교체
                if(num[j] < num[j-1]) {
                    int tmp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = tmp;
                }
            }
            //정렬 중인 배열의 현재 상태 출력
            System.out.println(Arrays.toString(num));
        }

    }
}
