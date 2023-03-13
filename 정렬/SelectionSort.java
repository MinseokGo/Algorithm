class SelectionSort {
    public static void main(String[] args) {
        int[] num = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for(int i=0; i<num.length; i++) {
            //현재 맨앞의 수
            int minIndex = i;
            //가장 작은 수가 담긴 인덱스 검색
            for(int j=i+1; j<num.length; j++) {
                if(num[minIndex] > num[j]) {
                    minIndex = j;
                }
            }
            //가장 작은 수와 맨앞의 수 자리 교체
            int tmp = num[i];
            num[i] = num[minIndex];
            num[minIndex] = tmp;
            System.out.print(num[i] + " ");
        }
    }
}
