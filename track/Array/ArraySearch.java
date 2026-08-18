class ArraySearch {
    void search(int ref[] , int key){
     boolean found = false;
     for (int i=0;i<=ref.length-1;i++){
        if(ref[i]==key){
            System.out.println("found the key at index" + " " +i);
            found = true;
            break;
        }
        if(found=false){
            System.out.println("Did not found the element....");
        }
     }
    }
        
    
}