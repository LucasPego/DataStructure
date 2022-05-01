public class Maze {
    class Move {

        int i, j;

        public Move(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int i() {
            return i;
        }

        public int j() {
            return j;
        }

        public Move up() {
            return new Move(i - 1, j);
        }

        public Move down() {
            return new Move(i + 1, j);
        }

        public Move right() {
            return new Move(i, j + 1);
        }

        public Move left() {
            return new Move(i, j - 1);
        }


    }
    static String[][] maze = {
            {"#","#","#","#","#","#","#","#","#","#","#","#"},
            {"#","E","#"," "," ","#"," "," "," "," ","#","#"},
            {"#"," "," "," ","#","#","#"," ","#","#","#","#"},
            {"#"," ","#"," ","#","#","#"," ","#","#","#","#"},
            {"#"," ","#","#","#","#","#"," ","#","#","#","#"},
            {"#"," ","#"," ","#"," ","#"," ","#","#","#","#"},
            {"#"," "," "," ","#"," "," "," ","S","#","#","#"},
            {"#"," ","#","#","#"," ","#"," ","#","#","#","#"},
            {"#"," ","#","#","#"," ","#"," ","#","#","#","#"},
            {"#"," ","#","#","#","#","#"," ","#","#","#","#"},
            {"#"," "," "," "," "," "," "," ","#","#","#","#"},
            {"#","#","#","#","#","#","#","#","#","#","#","#"}
    };


    public static void printMaze (){
        for (int x = 0; x < maze.length; x++){
            for (int y = 0; y < maze.length; y++){
                System.out.print(maze[x][y] + " ");
            }
            System.out.println();
        }
    }

    public void walkThrough(){
        Move initialPosition = new Move(1,1);

    }







}