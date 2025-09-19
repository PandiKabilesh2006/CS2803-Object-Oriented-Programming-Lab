import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
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
        System.out.println("Element not found!!!");
        //Binary Search
        // int left=0;
        // int right=list.size()-1;
        // while(left<=right){
        //     int mid=(left+right)/2;
        //     if(list.get(mid).equals(str)){
        //         return mid;
        //     }
        //     else if(list.get(mid).compareTo(str)==-1){
        //         left=mid+1;
        //     }
        //     else{
        //         right=mid-1;
        //     }
        // }
        // return -1;

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

    public static ArrayList regexSearch(ArrayList<String>list,String regex){
        ArrayList<String> matches=new ArrayList<>();
        Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        for(String s:list){
            Matcher matcher=pattern.matcher(s);
            if(matcher.find()){
                matches.add(s);
            }
        }
        return matches;
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
        while(i<left.size()){
            list.set(k++,left.get(i++));
        }
        while(j<right.size()){
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
        while(i<left.size()){
            list.set(k++,left.get(i++));
        }
        while(j<right.size()){
            list.set(k++,right.get(j++));
        }
    }

    public static ArrayList stringsStartingLetter(ArrayList<String> list,char character){
        ArrayList<String> newList=new ArrayList<>();
        for(String s: list){
            if(s.toLowerCase().startsWith(String.valueOf(character).toLowerCase())){
                newList.add(s);
            }
        }
        return newList;


    }

    public static void removeDuplicates(ArrayList<String> list){
        LinkedHashSet<String> set=new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("List after removing the duplicates: "+list);
    }

    public static ArrayList partialMatchSearch(ArrayList<String> list,String substring){
        ArrayList<String>matches=new ArrayList<>();
        for(String s : list){
            if(s.toLowerCase().contains(substring.toLowerCase())){
                matches.add(s);
            }
        }
        return matches;

    }

    public static void main(String[] args){
    ArrayList<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Append a string");
        System.out.println("2. Insert a string at index");
        System.out.println("3. Search for a string");
        System.out.println("4. Sort list (ascending/descending)");
        System.out.println("5. List strings starting with a given letter");
        System.out.println("6. Regex search");
        System.out.println("7. Remove duplicates");
        System.out.println("8. Partial match search");
        System.out.println("9. Display current list");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter string to append: ");
                String str = sc.nextLine();
                append(list, str);
                break;

            case 2: 
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter string to insert: ");
                String strInsert = sc.nextLine();
                insert(list, index, strInsert);
                break;

            case 3:
                System.out.print("Enter string to search: ");
                String searchStr = sc.nextLine();
                search(list,searchStr);
                break;

            case 4:
                System.out.print("Enter order (ascending/descending): ");
                String order = sc.nextLine();
                mergeSort(list, order);
                System.out.println("List after sorting: " + list);
                break;

            case 5: 
                System.out.print("Enter starting letter: ");
                char ch = sc.nextLine().charAt(0);
                System.out.println("Strings starting with '" + ch + "': "
                        + stringsStartingLetter(list, ch));
                break;

            case 6: 
                System.out.print("Enter regex: ");
                String regex = sc.nextLine();
                System.out.println("Regex matches: " + regexSearch(list, regex));
                break;

            case 7: 
                removeDuplicates(list);
                break;

            case 8: 
                System.out.print("Enter substring: ");
                String sub = sc.nextLine();
                System.out.println("Partial matches: " + partialMatchSearch(list, sub));
                break;

            case 9: 
                System.out.println("Current list: " + list);
                break;

            case 0:
                exit = true;
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
    sc.close();
}

}

