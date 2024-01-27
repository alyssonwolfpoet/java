public class Matriz {
    public static void main(String[] args) {
        /*
        * 0 -> 0, 1 , 2 , 3
        * 1 -> 0, 1 , 2 , 3
        * 2 -> 0, 1 , 2 , 3
        * 3 -> 0, 1 , 2 , 3
        * */
        int[][] matriz = new int[4][4];
        for (int i=0;i< matriz.length;i++){
            for (int j = 0;j<matriz[i].length;j++){
                matriz[i][j]=i+j;
            }
        }
        for (int i=0;i< matriz.length;i++){
            for (int j = 0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("__________________________");
        int [][] nt = new int[4][];
        nt[0] = new int[5];
        nt[1] = new int[3];
        nt[2] = new int[8];
        nt[3] = new int[9];
        for (int i=0;i< nt.length;i++){
            for (int j = 0;j<nt[i].length;j++){
                nt[i][j]=i+j;
            }
        }
        for (int i=0;i< nt.length;i++){
            for (int j = 0;j<nt[i].length;j++){
                System.out.print(nt[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int m[][] = {{1},{2}};
        for (int i=0;i< m.length;i++){
            for (int j = 0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }

    }
}
