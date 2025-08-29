import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.*;
class AdvancedArrayListOps{
    public static void append(ArrayList<String>list,String str){
        list.add(str);
        System.out.println("After appending : "+list);

    }
    public static void insert(ArrayList<String>list,int index,String str){
        if(index>=0 && index<=list.size()){
            list.add(index,str);
            System.out.println("After inserting the string "+str+" at the index "+index+" : "+list);
        }
        else{
            System.out.println("Invalid index entered");
        }

    }
    public static void search(ArrayList<String>list,String str){
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(str)){
                System.out.println("Element "+str+" found at the index "+i);
                return;
            }
            
        }
        System.out.println("Element "+str+" not found in the list");

    }

    public static void mergeSort(ArrayList<String>list,String choice){
        if(list.size()<2){
            return;
        }
        int mid=list.size()/2;
        ArrayList<String> left=new ArrayList<>(list.subList(0,mid));
        ArrayList<String> right=new ArrayList<>(list.subList(mid,list.size()));

        mergeSort(left,choice);
        mergeSort(right,choice);
        
        if(choice.equalsIgnoreCase("ascending")){
            mergeAscending(list, left, right);

        }
        else if(choice.equalsIgnoreCase("descending")){
            mergeDescending(list, left, right);
        }
        else{
            System.out.println("Invalid choice entered");
        }


    }

    public static void mergeAscending(ArrayList<String>list,ArrayList<String>left,ArrayList<String>right){
        int i=0;
        int j=0;
        int k=0;

        while(i<left.size() && j<right.size()){
            if(left.get(i).compareTo(right.get(j))<0){
                list.set(k++,left.get(i++));
            }
            else{
                list.set(k++,right.get(j++));
            }
        }
        if(i<left.size()){
            list.set(k++,left.get(i++));
        }
        if(j<right.size()){
            list.set(k++,right.get(j++));
        }
    }

    public static void mergeDescending(ArrayList<String>list,ArrayList<String>left,ArrayList<String>right){
        int i=0;
        int j=0;
        int k=0;

        while(i<left.size() && j<right.size()){
            if(left.get(i).compareTo(right.get(j))>0){
                list.set(k++,left.get(i++));
            }
            else{
                list.set(k++,right.get(j++));
            }
        }
        if(i<left.size()){
            list.set(k++,left.get(i++));
        }
        if(j<right.size()){
            list.set(k++,right.get(j++));
        }
    }

    public static void main(String[] args){
        AdvancedArrayListOps arrayList=new AdvancedArrayListOps();
        ArrayList<String>list=new ArrayList<>();
        AdvancedArrayListOps.append(list,"pandi");
        AdvancedArrayListOps.append(list,"kabilesh");
        AdvancedArrayListOps.append(list,"anandan");
        AdvancedArrayListOps.append(list,"harshini");
        AdvancedArrayListOps.append(list,"revathi");

        AdvancedArrayListOps.insert(list,4,"dharaneshwar");

        AdvancedArrayListOps.search(list,"anandan");

        String choice;
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter your choice (ascending or descending) order:");
        choice=Input.nextLine();
        AdvancedArrayListOps.mergeSort(list,choice);
        System.out.println("The list after sorting in "+choice+" order is "+list);
    }

}