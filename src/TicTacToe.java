public class TicTacToe {
    String[][] field;
    String nowPlayer;
    boolean gameWasEnded = false;

    public TicTacToe() {//конструктор
        newGame();
    }

    void newGame()//Begin new game
    {
        field = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        nowPlayer = "X";
    }

    String[][] getField()// draw game table
    {
        return field;
    }

    String checkGame() {
        String result = "";
        boolean fullField = true;
        //проверка на наличие победителя
        for (int i = 0; i < 3; i++)//проверка по горизонталям и вертикалям
        {
            if (field[i][0].equals(nowPlayer) && field[i][1].equals(nowPlayer) && field[i][2].equals(nowPlayer))
                result = nowPlayer;
            if (field[0][i].equals(nowPlayer) && field[0][i].equals(nowPlayer) && field[0][i].equals(nowPlayer))
                result = nowPlayer;
        }
        //проверка по диагоналям
        if (field[0][0].equals(nowPlayer) && field[1][1].equals(nowPlayer) && field[2][2].equals(nowPlayer))
            result = nowPlayer;
        if (field[0][2].equals(nowPlayer) && field[1][1].equals(nowPlayer) && field[2][0].equals(nowPlayer))
            result = nowPlayer;
        if (result.equals(nowPlayer)) {
            gameWasEnded = true;
            return result;
        }
        //проверка на продолжение игры
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("-")) return null; //если есть незанятая клетка(клетки)
            }
        }
        return "D";//иначе все клетки заняты, зачит ничья
    }

    String makeMove(int x, int y) {
        String result = "";
        boolean fullField = true;
        if (gameWasEnded) {
            result = "Game was ended";
            return result;
        }
        x -= 1;
        y -= 1;
        if (field[x][y].equals("X") || field[x][y].equals("O")) {
            result = "Cell x, y is already occupied";
            return result;
        } else field[x][y] = nowPlayer;
        result = "Move completed";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("-")) fullField = false;
            }
        }
        if (fullField) {
            result = "Draw";
            gameWasEnded = true;
        }
        switch (nowPlayer)//замена текущего игрока
        {
            case "X":
                nowPlayer = "O";
                break;
            case "O":
                nowPlayer = "X";
                break;
        }
        return result;
    }
}
