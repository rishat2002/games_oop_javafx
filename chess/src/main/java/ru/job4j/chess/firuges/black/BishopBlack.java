package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {

      if (!isDiagonal(source, dest)) {
           throw new IllegalStateException(
                   String.format("Could not way by diagonal from %s to %s", source, dest)
           );
        }
       int size = Math.abs(source.x-dest.x);
       Cell[] steps = new Cell[size];
       int deltaX = (source.x-dest.x)/(Math.abs(source.x-dest.x));
       int deltaY =(source.y-dest.y)/(Math.abs(source.y-dest.y));
       int x=source.x;
       int y=source.y;
       for (int index = 0; index < size; index++) {
         steps[index] =Cell(x+deltaX,y+deltaY);
       }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        boolean diagonal=false;
        if (Math.abs(source.x-dest.x)==Math.abs(source.y-dest.y)) {
            diagonal=true;
        }
        return  diagonal;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }

}
