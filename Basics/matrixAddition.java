//1//  Even or old
//  package Basics;
// import java.util.Scanner;

// public class B1 {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     System.out.println(n%2==0 ? "Even" : "Odd");

// }

     //2  //check prime number
// public class B1 {
//      Scanner sc = new Scanner(System.in);
//   int n = sc.nextInt();
//  Boolean prime = true;
//  if(n <= 1) prime = false;
// for(int i = 2; i <= Math.sqrt(n); i++){
// if(n % i == 0){
// prime = false;
// break;
// }
// }
// System.out.println(prime ? "Prime" : "Not Prime");
// }



//3// factorial 


// import java.util.*;
// class Factorial{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int fact = 1;
// for(int i = 1; i<= n; i++){
//     fact*=i;
//     System.out.println(fact);

// }
// }

//4 //  fibonacci series 


// import java.util.*;
// class Fibbonacci {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int a = 0;
// int b = 1;
// for (int i =1 ;i<=n;i++){
    
//     System.out.println(a);
//     int c = a+b;
//     a=b;
//     b=c;
// }
// }

           //5 //Reverse a number 
// import java.util.*;
// class reversedNo{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int rev =0;
// while(n>0){
//     rev = rev*10 + n%10;
//     n/=10;

// }
//     System.out.println(rev);

// }



   //6// palindrome number
// import java.util.*;
// class palindrome {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int temp = n;
// int rev= 0;
// while(n!=0){
//     rev = rev*10 + n%10;
//     n/=10;
// }
// System.out.println(rev==temp ? "Palindrome" : "Not Palindrome");


// }



//7// Armstrong 

// import java.util.*;
// class Armstrong {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int temp = 0; 
// int sum = 0;

// while(n!= 0){
//     int digit = n%10;
//     sum += digit*digit*digit;
//     n/=10;

// }
// System.out.println(temp==sum ? "Armstrong " : "Not Armstrong");


// }



//8//  sum  of digits

// import java.util.*;
// class sumOfDigits { 
  
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sum = 0;
// while n!= 0){
//     int n - digit = n%10;
//     sum += digit;
//     n/=10;
// }
// System.out.println(sum);

// }   

//9//  Largest of 3 numbers

// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
// int max =  Math.max(a, Math.max(b,c) );

// System.out.println(max);
// }
// }




//10 //GCD
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt(), b = sc.nextInt();
// while(b != 0){
// int temp = b;
// b = a % b;
// a = temp;
// }
// System.out.println(a);
// }
// }


/// 11//lcm //
// package Basics;
// import java.util.*;
// class basic{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(), b= sc.nextInt();
//         int x = a, y = b;
//         while(b!= 0)
//         {
//             int temp = b;
//             b = a%b;
//             a = temp;

//         }
//         int gcd = a;
//         int lcm = (x*y)/gcd;
//         System.out.println(lcm);

//     }
// }

//12// Leap year 
// package Basics;
// import java.util.*;
// class Leapyear{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         if(year%4==0 && year%100!=0 || year%400==0){
//             System.out.println("Leap Year");
//         }
//         else{
//             System.out.println("Not Leap Year");
//         }
//     }
// }


// 13 // count vowels and constants
// package Basics;
// import java.util.*;
// class vowelss {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine().toLowerCase();
//         int vowels = 0, constants= 0;

//         for (char ch:str.toCharArray()){
//             if (Character.isLetter(ch)){
//                 if("aeiou".indexOf(ch) != -1)
//                     vowels++;
//             }else {
//                 constants++;
//             }

//         }
//         System.out.println("Vowels: " + vowels);
//         System.out.println("Consonants: " + constants);

//     }
// }


// 14//reverse string//

// package Basics;
// import java.util.*;
// class reversed {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String rev = "";
//         for(int i = str.length()- 1; i >= 0; i--)
//             rev+=str.charAt(i);
            
        
//         System.out.println(rev);
//     }
//     }

//15// check anagram//
// package Basics;
// import java.util.*;
// class reverse {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
   
//         String s1 = sc.nextLine();
// String s2 = sc.nextLine();
// char[] a = s1.toCharArray();
// char[] b = s2.toCharArray();
// Arrays.sort(a);
// Arrays.sort(b);
// System.out.println(Arrays.equals(a,b) ? "Anagram" : "Not Anagram");
//     }
// }


// //16//remove duplicates from string
// package Basics;
// import java.util.*;
// class reverse {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String result = "";
//         for(char ch : str.toCharArray()){
//             if(result.indexOf(ch) ==-1)
// result += ch;
// }
// System.out.println(result);
//     }
//         }

//17// find second largest number in an array
// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for(int i = 0; i < n; i++)
// arr[i] = sc.nextInt();
// int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
// for(int num : arr){
// if(num > first){
// second = first;
// first = num;
// } else if(num > second && num != first){
// second = num;
// }
// }
// System.out.println(second);
// }
// }
         

// //18// Linear search //
// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for(int i = 0; i < n; i++)
// arr[i] = sc.nextInt();
// int key = sc.nextInt();
// boolean found = false;
// for(int num : arr){
// if(num == key){
// found = true;
// break;
// }
// }
// System.out.println(found ? "Found" : "Not Found");
// }
// }

//19// Binary search //

// package Basics;  
// import java.util.*;
//  public class binarySearch  {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++)
//             arr[i] = sc.nextInt();
//         int key = sc.nextInt();
//         int left = 0, right = n - 1;


//         boolean found = false;
//         while (left <= right) {                 

            
//             int mid = left + (right - left) / 2;
//             if (arr[mid] == key) {
//                 found = true;
//                 break;
//             } else if (arr[mid] < key) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//     }
//  }



 //20//Bubble sort//

// package Basics;
// import java.util.*; 
// class bubblesort{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n =  sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++)
//             arr[i] = sc.nextInt();  
//         for(int i = 0; i < n-1; i++){
// for(int j = 0; j < n-i-1; j++){
//     if (arr[j]>arr[j+1]){
//         int temp = arr[j];
//         arr[j] = arr[j+1];
//     arr[j+1] = temp;
//     }
// }
//         }
//         for(int num : arr)
//             System.out.print(num + " ");

//     }
// }
 


//21//Selection Sort//
// package Basics;
// import java.util.*;
//     class selectionsort{
//        public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// for(int i=0;i<n;i++)
//      arr[i] = sc.nextInt();

// for(int i=0;i<n-1;i++){
// int minIndex=i;
// for(int j=i+1;j<n;j++){
// if(arr[j]<arr[minIndex])
// minIndex=j;
// }
// int temp=arr[i];
// arr[i]=arr[minIndex];
// arr[minIndex]=temp;
// }
// for(int num:arr)
// System.out.print(num+" ");
//     }

//     }   


    //22//Insertion sort//
// package Basics;
// import java.util.*;
// class insertionsort{
//     public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int[] arr=new int[n];
// for(int i=0;i<n;i++) arr[i]=sc.nextInt();

// for(int i=1;i<n;i++){
//     int key=arr[i];
//     int j=i-1;
//     while(j>=0 && arr[j]>key){
//         arr[j+1]=arr[j];
//         j--;
//     }
//     arr[j+1]=key;
// }

// for(int num:arr)
// System.out.print(num+" ");
// }
// }

//23//matrix addition//
// package Basics;
// import java.util.*;
// class matrixAddition {
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int r=sc.nextInt(), c=sc.nextInt();
// int[][] a=new int[r][c];
// int[][] b=new int[r][c];
// int[][] sum=new int[r][c];
// for(int i=0;i<r;i++)
// for(int j=0;j<c;j++)
// a[i][j]=sc.nextInt();
// for(int i=0;i<r;i++){
// for(int j=0;j<c;j++){
// b[i][j]=sc.nextInt();
// }
// }
// for(int i=0;i<r;i++){
// for(int j=0;j<c;j++){
// sum[i][j]=a[i][j]+b[i][j];
// System.out.print(sum[i][j]+" ");
// }
// }
// System.out.println();
// }
// }




//24//matrix multiplication//
// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int r=sc.nextInt(), c=sc.nextInt();
// int[][] a=new int[r][c];
// for(int i=0;i<r;i++)
// for(int j=0;j<c;j++)
// a[i][j]=sc.nextInt();
// for(int j=0;j<c;j++){
// for(int i=0;i<r;i++){
// System.out.print(a[i][j]+" ");
// }
// System.out.println();
// }
// }
// }


//25// count frequency of elements in an array//
// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter the size of the array:"); 
// int n=sc.nextInt();
// int[] arr=new int[n];
// System.out.println("Enter the elements of the array:");

// for(int i=0;i<n;i++) arr[i]=sc.nextInt();
// System.out.println("Enter the element to count:");  
// int key=sc.nextInt();
// int count=0;
// for(int num:arr){
// if(num==key) count++;
// }
// System.out.println(count);
// }
// }

// 26//array sorted or not//
// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int[] arr=new int[n];
// for(int i=0;i<n;i++) arr[i]=sc.nextInt();
// boolean sorted=true;
// for(int i=0;i<n-1;i++){
// if(arr[i]>arr[i+1]){
// sorted=false;
// break;
// }
// }
// System.out.println(sorted ? "Sorted" : "Not Sorted");
// }
// }


//27//Merge two sorted arrays//
// package Basics;     
// import java.util.*;

// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int n1=sc.nextInt();
// int[] a=new int[n1];
// for(int i=0;i<n1;i++) a[i]=sc.nextInt();
// int n2=sc.nextInt();
// int[] b=new int[n2];
// for(int i=0;i<n2;i++) b[i]=sc.nextInt();
// int[] merged=new int[n1+n2];
// for(int i=0;i<n1;i++)
// merged[i]=a[i];
// for(int i=0;i<n2;i++)
// merged[n1+i]=b[i];
// for(int num:merged)
// System.out.print(num+" ");
// }
// }


//28//missing number in an array//

// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int[] arr=new int[n-1];
// for(int i=0;i<n-1;i++) arr[i]=sc.nextInt();
// int total=n*(n+1)/2;
// int sum=0;
// for(int num:arr) sum+=num;
// System.out.println(total-sum);
// }
// }

// //29//count words in a string//

// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// String str=sc.nextLine().trim();
// if(str.isEmpty()){
// System.out.println(0);
// } else {
// String[] words=str.split("\\s+");
// System.out.println(words.length);
// }
// }
// }

//30//remove spaces from a string//
// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// String str=sc.nextLine();
// str=str.replaceAll(" ","");
// System.out.println(str);
// }
// }


//31// remove duplicates
// package Basics;
// import java.util.*;
// class duplicatess{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr =new int [n];
//         for (int i = 0; i < n; i++) 
//             arr [i]= sc.nextInt();
        
//         for (int i = 0;i<n;i++){
//             for(int j = i +1;j<n;j++){
//                 if (arr[i]==arr[j]){
//                     System.out.println(arr[i]);
//                     break;
//                 }
//             }
//         }
//     }
// }


//32// Move all zeros to end //

// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int[] arr=new int[n];
// for(int i=0;i<n;i++) arr[i]=sc.nextInt();
// int index=0;
// for(int i=0;i<n;i++){
// if(arr[i]!=0){
// arr[index++]=arr[i];
// }
// }
// while(index<n){
// arr[index++]=0;
// }
// for(int num:arr)
// System.out.print(num+" ");
// }
// }


//33// rotate array by 1 position
// package Basics;
// import java.util.*;
// class rotation{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr=new int[n];
// for(int i=0;i<n;i++) arr[i]=sc.nextInt();

// int last = arr[n-1];
// for(int i = n-1; i>=0; i-- ){
//     arr[i]= arr[i-1];

// }
// arr[0]= last;
// for(int num : arr)
//     System.out.print(num+" ");
//     }
// }

//34//check palindrome string//
// package Basics;
// import java.util.*;
// class palindrome{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// String str=sc.nextLine();
// String rev = "";
// for( int i= str.length()-1;i>=0; i--)
//     rev+=str.charAt(i);

// System.out.println(str.equals(rev)? "palindrome" :"not palindrome");
// }
// }

//35//Count no. of digits//
// package Basics;
// import java.util.*;
// class digits{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();

// int count = 0;
// while(n!= 0){
//     n/=10;
//     count++;

// }
// System.out.println(count);
// }
// }


//36//Sum of elements in array
// package Basics;
// import java.util.*;
// class digits{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int [] arr = new int[n];
// int sum = 0;
// for(int i=0;i<n;i++){
// arr[i]=sc.nextInt();
// sum+=arr[i];
// }
// System.out.println(sum);
// }
// }

//37//find minimum element in array//

//     package Basics;
//     import java.util.*;
//     class Main{
//     public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
// int[] arr=new int[n];
// for(int i=0;i<n;i++) arr[i]=sc.nextInt();
// int min=arr[0];
// for(int i=1;i<n;i++){
// if(arr[i]<min)
// min=arr[i];
// }
// System.out.println(min);
// }
// }

//38// pattern printing (Right Traingle)


//     package Basics;
    
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// for(int i=1;i<=n;i++){
// for(int j=1;j<=i;j++){
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

//40// Decimal to binary conversion
// package Basics;
// import java.util.*;
// class Main{
//     public static void main(String[] args){ 
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String binary = "";
//         while (n>0){
//             binary = n%2 + binary;
//             n/=2;

//         }
//         System.out.println(binary);
//         }
//     }

//41// Binary to decimal conversion
// package Basics;
// import java.util.*;
//     class Main{
//         public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         String binary = sc.nextLine();
//         int decimal = 0;    
//         int power = 0;
//             for(int i = binary.length() - 1; i >= 0; i--) {

//             if(binary.charAt(i) == '1') {

//                 decimal += Math.pow(2, power);

//             }

//             power++;

//         }

//         System.out.println(decimal);

//     }

// }   

//42// check perfect number
// package Basics;
// import java.util.*;
//     class Main{
//         public static void main(String[] args){
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int sum = 0;
//             for(int i = 1; i < n; i++){
//                 if(n % i == 0){
//                     sum += i;
//                 }
//             }
//             System.out.println(sum == n ? "Perfect Number" : "Not Perfect Number");
//         }
//     }

//43// check strong number
// package Basics;
// import java.util.*;
// class Main{ 
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n;
//         int sum = 0;
//         while(n != 0){
//             int digit = n % 10;
//             int fact = 1;
//             for(int i = 1; i <= digit; i++){
//                 fact *= i;
//             }
//             sum += fact;
//             n /= 10;
//         }
//         System.out.println(sum == temp ? "Strong Number" : "Not Strong Number");
//     }
// }


//44 // count even and odd numbers in an array
// package Basics;
// import java.util.*; 
//     class Main{
//         public static void main(String[] args){
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int[] arr = new int[n];
//             for(int i = 0; i < n; i++){
//                 arr[i] = sc.nextInt();
//             }
//             int even = 0;
//             int odd = 0 ;
//             for(int i = 0; i < n; i++){
//                 if (arr[i]%2==0){
//                     even ++;
//                 }else{
//                     odd++;
//                 }
//             }
//             System.out.println("Even numbers: " + even);
//             System.out.println("Odd numbers: " + odd);
//         }
//     }


// 45//find intersection of two arrays
// package Basics;
// import java.util.*;
// class Main{
//     public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int n1=sc.nextInt();
// int[] a=new int[n1];
// for(int i=0;i<n1;i++) a[i]=sc.nextInt();

// int n2 = sc.nextInt();
// int[] b=new int[n2];
// for(int i=0;i<n2;i++) b[i]=sc.nextInt();

// for(int i = 0; i < n1; i++){
//     for(int j = 0; j<n2; j++){
//         if(a[i]==b[j]){
//             System .out.println(a[i]);
//             break;
//         }
//     }
// }
//     }
// }


//46//check substring
// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// String str=sc.nextLine();
// String sub=sc.nextLine();
// if(str.contains(sub))
// System.out.println("Substring Present");
// else
// System.out.println("Substring Not Present");
// }
// }


//46//Remove Specific Character from String
// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// String str=sc.nextLine();
// char ch=sc.next().charAt(0);
// str=str.replace(Character.toString(ch),"");
// System.out.println(str);
// }
// }


//48// sum of prime numbers in an array
// package Basics;
// import java.util.*;
// class Main{
//     public  static boolean isprime(int n){
//         if(n<=1) return false;
//         for(int i =2; i<=Math.sqrt(n); i++){
//             if(n%i==0) return false;
        
//         }
//         return true;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++)
//             arr[i] = sc.nextInt();
//         int sum = 0;
//         for(int num : arr){
//             if(isprime(num)){
//                 sum += num;
//             }
//         }
//         System.out.println(sum);
//     }
// }


//49// reverse words in Sentence //
// package Basics;
// import java.util.*;
// class Main{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// String str=sc.nextLine();
// String[] words=str.split(" ");
// for(int i=words.length-1;i>=0;i--){
// System.out.print(words[i]+" ");
// }
// }
// }


//50//Two sum problem // 

package Basics;
import java.util.*;
    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    if(arr[i] + arr[j] == target){
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    } 