package ru.job4j;
import  org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {
  @Test
 public void positionTest() {
        BishopBlack b1=new BishopBlack(Cell.A2);
        assertThat(b1.position(),is(Cell.A2));
    }
    @Test
    public void copyTest() {
        BishopBlack b1=new BishopBlack(Cell.A2);
        assertThat(b1.copy(Cell.B6).position(),is(Cell.B6));
    }
    @Test
    public void wayTest1() {
        BishopBlack b1=new BishopBlack(Cell.C1);
       Cell[]way1=new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(way1,is(b1.way(b1.position(),Cell.G5)));
   }
    @Test
    public void wayTest2() {
        BishopBlack b1=new BishopBlack(Cell.C3);
        Cell[]way1=new Cell[]{Cell.B4,Cell.A5};
        assertThat(way1,is(b1.way(b1.position(),Cell.A5)));
    }
  @Test
  public void isDiagonalTest() {
      BishopBlack b1=new BishopBlack(Cell.D4);
      boolean n=b1.isDiagonal(Cell.D4,Cell.B2);
      assertThat(true,is(n));
      BishopBlack b2=new BishopBlack(Cell.D4);
      boolean n1=b1.isDiagonal(Cell.D4,Cell.F2);
      assertThat(true,is(n));
  }
    @Test
    public void moveTest() {
        Logic log1=new Logic();
        boolean n1= log1.move(Cell.D4,Cell.A3);
        assertThat(false,is(n1));
    }
}
