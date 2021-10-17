public class Main {
    public static void main(String[] args) {
        String[][] field = new String[3][3];
        String message1 = "";

        TicTacToe name1 = new TicTacToe();
        name1.newGame();

        drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(3,3);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(3,3);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(1,2);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(1,3);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(1,1);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(2,1);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(2,2);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(2,3);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(3,1);
        System.out.println(message1);//получение,  вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(3,2);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(3,2);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        message1=name1.makeMove(3,2);
        System.out.println(message1);//получение, вывод сообщения с результатом проверки
        if(!message1.equals("Cell x, y is already occupied")&&!message1.equals("Game was ended"))
            drawField(name1.getField());//получение, вывод игрового поля

        /*field = name1.getField();
        drawField(field);
        message1=name1.makeMove(1,1);
        System.out.println(message1);
        field = name1.getField();
        drawField(field);*/

    }
    static void drawField(String[][] field)
    {
        String stringMy="";
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                stringMy+="'"+field[i][j]+"'";
                if(j<2)stringMy+=", ";
            }
            System.out.println(stringMy);
            stringMy="";
        }
    }
}
