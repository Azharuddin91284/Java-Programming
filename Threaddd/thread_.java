// ulti thread help krtha hai ek sath 2 ya more than 2 work ek sath compute krne ke liye at a time but computer ek time me ek hi kaam kr skta hai but usko bta de ki kis time pe kya krna hai to multi task(illusion de skta hai) compute kra skte hai or time set krke computer ko ye bta skte hai ki kon sa line of code kb execute krna hai
package Threaddd;

public class thread_ {
    public static void main(String[] args) {
        Thread dd = new Thread();// thread creation 
        try{
            for(int i=0;i<10;i++){
                System.out.println(i);
                dd.sleep(1000);// uses thread so execution take 1s at one line execution that's it
            }      //yaha petiming use hua so 1s late execution using thred 
        }
        catch(InterruptedException e)
{
    System.out.println("My exception is : "+e);
}
    }
    
}
/*
 thread ek process ko kaam krne ka medium or rasta  deta hai (ex. video audio, file transfer, brossing etc ek time krwata hai computer se but computer or processor ek time me ek hi kaam kr skta hai so ye sb work ek sath thread proceess ko medium deta hai kaam krne ke liye) 

 multiple process ke ek sath kaam krne ko multithredding programming khte hai
 monitor thread ke flow ko control krta hai
 jo cpu ke samne khda rhta hai or decide krta hai ki kon sa thread kb execute hoga ye procee synchronisation khlata hai
 (monitor is like traffic pollice but cpu is like vehicles waiting for decidion of traffic police)
 */
