package lesson_7.task_3;

import lesson_7.task_3.figure.*;
import lesson_7.task_3.chess.Player;
import lesson_7.task_3.chess.Position;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        List<ChessFigure> figures = new ArrayList<>();
        figures.add(new Bishop(Player.BLACK, "F1"));
        figures.add(new King(Player.WHITE, "D1"));

        for (ChessFigure figure : figures)
            printMoves(figure);

    }

    private static void printMoves(ChessFigure figure) {
        Set<Position> positions = figure.getAvailableMoves();
        StringBuilder sb = new StringBuilder(figure.getFigureType())
                .append(" (").append(figure.getPosition()).append("):");

        for (Position position : positions) {
            sb.append(", ").append(position.getPosition());
        }
        System.out.println(sb.toString().replaceFirst(",", ""));
    }
}