public class List {

  private Node primeiro;
  private Node cursor;
  private int anterior, prox; 


  private static class Node {
    int valor;
    Node prox, ant;

    Node( int newData ) {
      prox = ant = null;
      valor = newData;
    }
  }

  public List() {
    primeiro = cursor = null;
  }

  public int get() {
    
    if(primeiro == null){
      return -1;
    } else {
      anterior = primeiro.valor;
      return primeiro.valor;
    } 
    
  }

  public int getc( ) {
    if(cursor == null){
      return -1;
    }
    else return cursor.valor;
  }

  public void antc( ) {
    // ???????????
  }

  public void proxc( ) {
    // ???????????
  }

  public void putAntc( int val ) {
    // ???????????
  }

  public void putProxc( int val ) {
    // ???????????
  }

  private Node put( int valor, Node node ) {
    if ( node == null )
      return new Node( valor );
    node.prox = put( valor, node.prox );
    if ( node.prox != null ) node.prox.ant = node;
    return node;
  }

  public void put( int valor ) {
    primeiro = put( valor, primeiro );
  }

  public void print( )  {
    Node p = primeiro;
    System.out.print( "[ " );
    while ( p != null ) {
      String s1 = "(";
      String s2 = ")";
      if ( p == cursor ) {
        s1 = "<";
        s2 = ">";
      }

      System.out.print( s1 );
      if ( p.ant != null )
        System.out.print( p.ant.valor );
      System.out.print( "," + p.valor + "," );
      if ( p.prox != null )
        System.out.print( p.prox.valor );
      System.out.print( s2 + " " );
      p = p.prox;
    }
    System.out.print( "]" );
  }

}
