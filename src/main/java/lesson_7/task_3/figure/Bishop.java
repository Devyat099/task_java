package lesson_7.task_3.figure;


import lesson_7.task_3.chess.Chess;
import lesson_7.task_3.chess.Player;
import lesson_7.task_3.chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bishop extends ChessFigure {

    public Bishop(Player player, String position) {
        super(player, position);
        figureType = "Слон";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        for (Position figure : Chess.allField()) {
            int dx = Math.abs(figure.getHorizontal() - position.getHorizontal());
            int dy = Math.abs(figure.getVertical() - position.getVertical());
            if (dx == 0 && dy == 0)
                continue;
            if (dx == dy)
                availableMoves.add(figure);
        }
        return availableMoves;
    }
}