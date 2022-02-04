package ua.ithillel.task1;

public class MtTestMethod {
    public static <N extends Number>  int calcNum( N []ar,N value  ){

int j=value.intValue();
int k=0;
for (int i=0;i<ar.length;i++){
    int val=ar[i].intValue();
    if(val>j){
        k++;
    }
}
        return k;

    }
    public static <N extends Number>  int calcSum( N []ar,N value  ){

        int j=value.intValue();
        int k=0;
        for (int i=0;i<ar.length;i++){
            int val=ar[i].intValue();
            if(val>j){
                k=k+val;
            }
        }

        return k;

    }
}
