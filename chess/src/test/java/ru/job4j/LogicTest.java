package ru.job4j;
import org.junit.Assert;
import  org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class LogicTest {
    @Test
    public void LogicTest1() {
        Logic l1=new Logic();
        BishopBlack b1=new BishopBlack(Cell.C1);
        l1.add(b1);
        boolean n1=l1.move(Cell.C1,Cell.A3);
        assertThat(true, is(n1));
    }
    @Test
    public void LogicTest2() {
        Logic l2=new Logic();
        BishopBlack b1=new BishopBlack(Cell.C1);
        PawnBlack p2=new PawnBlack(Cell.A3);
        l2.add(b1);
        l2.add(p2);
        boolean n2=l2.move(Cell.C1,Cell.A3);
        assertThat(false, is(n2));
    }
    @Test
    public void LogicTest3() {
        Logic l2=new Logic();
        BishopBlack b1=new BishopBlack(Cell.C1);
        PawnBlack p2=new PawnBlack(Cell.A3);
        l2.add(b1);
        l2.add(p2);
        boolean n2=l2.move(Cell.C4,Cell.A3);
        assertThat(false, is(n2));
    }
}
