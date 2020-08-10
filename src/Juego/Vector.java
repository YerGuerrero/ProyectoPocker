package Juego;

public class Vector implements Comparable<Vector> {
    private int[] vector;

    public Vector(int tamaño) {
        this.vector = new int[tamaño];
    }

    @Override
    public int compareTo( Vector vec ) {
        for (int i=0;i< vector.length;i++){
            if (vector[i]!= vec.get(i)){
                return vector[i]-vec.get(i);
            }
        }
        return 0;
    }

    public void set(int index,int valor){
        this.vector[index]=valor;
    }
    public int get(int index){
        return this.vector[index];
    }
}
