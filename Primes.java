public class Primes {
    public static void main(String[] args) {
        
     int n = Integer.parseInt(args[0]);
     boolean [] a = new boolean [n + 1];
     int i = 2;
     int count = 0;
     while ( i <= n ) {
          a[i] = true;
            i++;
        }
     i = 2;
     while ( i * i <= n ) {
        if ( a[i]) {
            int j = i * i;
            while ( j <= n ) {
                a[j] = false;
                j += i;
            
            }
        }
          i++;
         
     }
       System.out.println( "Prime numbers up to " + n + ":");
       i = 2;
       while ( i <= n ) {
       if ( a[i]) {
       System.out.println( i + " ");
      count++; }
      i++;       
    } 
    System.out.println("There are " + count + " prime between 2 and " + n + " (" + (100 * count) / n + "%" +  " are primes)");
            }
         
        }
    
    

    
 

    
    
    
    
    