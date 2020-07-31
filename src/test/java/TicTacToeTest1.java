import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


public class TicTacToeTest1 {

    private TicTacToe1 t1;
    @Before
    public void before(){
        t1 = new TicTacToe1();
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
//    1 检查X轴是否放在超出位置,情况1
    public void whenXOutsideBoardRunexception(){
        exception.expect(RuntimeException.class);
        t1.play(5,1);
    }
    @Test
    public void whenXOutsideBoardRunexception2(){
        exception.expect(RuntimeException.class);
        t1.play(0,1);
    }

    @Test
    //  2  检查Y轴是否放在超出位置
    public void whenYOutSideBoardRunException(){
        exception.expect(RuntimeException.class);
        t1.play(1,6);
    }

    @Test
    // 3 检查当前位置是否有棋子
    public  void whenOccupiedRunException(){
        t1.play(1,1);
        exception.expect(RuntimeException.class);
        t1.play(1,1);
    }
//    需求2，判断哪个玩家落子
//玩家 X 先下；
//    如果上一次是 X 下的，接下来将轮到 O 下。
//    如果上一次是 O 下的，接下来将轮到 X 下。

//    @Test
//    public void givenFirstTurnWhenNextPlayX(){
//        assertEquals("X",t1.nextPlayer());
//    }

    @Test
    public void givenLastTurnWasXWhenNextPlayerThenO(){
        t1.play(1,1);
        assertEquals('O', t1.nextPlayer());
    }

    @Test
    public void givenLastTurnWasOWhenNextPlayerThenX(){
        t1.play(1,1);
        t1.play(1,2);
        assertEquals('X',t1.nextPlayer());
    }

}
