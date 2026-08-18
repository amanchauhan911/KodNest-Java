class Freq{
    int count = 0;
    void count(int arr[],int key){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==key){
                count++;
            }
        }
        System.out.println(key+" "+count);
    }
}