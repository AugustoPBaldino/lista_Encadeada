
import java.util.Scanner;

public class LTest {

  public static void main( String[] args ) {
    List L = new List();

    Scanner input = new Scanner( System.in );

    while ( true ) {

      System.out.println( "Forneça comando [quit, clear, get, <int>, <, >, getc ]" );

      String temp = input.next();

      if ( temp.equals( "quit" ) ) System.exit(0);
      if ( temp.equals( "get" ) ) System.out.println( L.get() );
      if ( temp.equals( "getc" ) ) System.out.println( L.getc() );
      if ( temp.equals( "<" ) ) L.antc();
      if ( temp.equals( ">" ) ) L.proxc();
      if ( temp.equals( "i<" ) ) L.putAntc( input.nextInt( ) );
      if ( temp.equals( "i>" ) ) L.putProxc( input.nextInt( ) );
      if ( temp.matches( "[0-9]+" ) ) L.put( Integer.parseInt( temp ) );
   
      L.print();
      System.out.println("\n");

    }
  }
}
