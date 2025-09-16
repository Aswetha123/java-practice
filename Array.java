class helloworld{
    public static void main(String args[]){
        int arr[][]={{1,2,3,11},{4,5,6,12},{6,7,8,13}};
        int r=arr.length;
        int c=arr[0].length;
        int i=0;
        int j=1;
        while(i<r && j<c){
            System.out.println(arr[i][j]);
            i++;
            j++;
        }
    }
}