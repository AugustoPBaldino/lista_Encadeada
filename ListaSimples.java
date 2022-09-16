class ListaSimples {
    No inicio = null;
    No fim;
    int tamanho = 0;

    public void inserirInicio(String info){
        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public String retirarInicio() {
        if(inicio==null) {
            return null; 
        }
        String info = inicio.info;
        inicio = inicio.proximo;
        tamanho--;
        return info;
    }
    
    public void inserirFim(String info) {
        No no = new No();
        no.info = info;
        if(inicio == null) {
            no.proximo = null;
            inicio = no;
        } else {
             No local = inicio;
             while(local.proximo != null) {
                 local = local.proximo;
             }
             local.proximo = no;
             no.proximo = null;
        }
        tamanho++;
   }
    
   public String retirarFim() {
    if(inicio == null) {
        return null;
    }
    No local = inicio;
    while(local.proximo != null) {
        No aux = local;
        local = local.proximo;
        if(local.proximo == null) {
            aux.proximo = null;
            tamanho--;
            return local.info;
        }
    }
    inicio = null;
    tamanho--;
    return local.info;
    }
    
    public void inserirIndice(int indice, String info) {
        if(indice <=0 ) {
            inserirInicio(info);
        }else if (indice>=tamanho) {
            inserirFim(info);
        } else {
            No local = inicio;
            for(int i= 0; i <indice-1; i++) {
                local = local.proximo;
            }
            No no = new No();
            no.info = info;
            no.proximo = local.proximo;
            local.proximo = no;
            tamanho ++;
        }
    }

    public String retirarIndice(int indice) {
        if(indice <0 || indice >= tamanho || inicio == null) {
            return null;
        } else if( indice == 0) {
            return retirarInicio();
        } else if(indice == tamanho-1) {
            return retirarFim(); 
        }
        No local = inicio;
        for(int i = 0; i < indice-1; i++) {
            local = local.proximo;
        }
        String info = local.proximo.info;
        local.proximo = local.proximo.proximo;
        tamanho--;
        return info;
    }
    
    public String toString() {
        String str = "(" + tamanho + ") ";
        No local = inicio;
        while(local != null) {
            str += local.info + " ";
            local = local.proximo;
        }
        return str;
    } 

    public static void main(String args []) {
        ListaSimples l = new ListaSimples();
        System.out.println(l);
        l.inserirFim("a");
        System.out.println(l);
        l.inserirFim("b");
        System.out.println(l);
        l.inserirFim("c");
        System.out.println(l);
        System.out.println("retirar: " + l.retirarIndice(0));
        System.out.println(l);

        
        while(l.retirarFim() != null) {
            System.out.print(l);
        } 
    }
}




