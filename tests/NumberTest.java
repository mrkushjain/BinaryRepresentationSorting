import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 02/08/13
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class NumberTest {
    @Test
    public void testOneHasOnlyOneOnes(){
        assertEquals(1,new Number(1).getNumberOfOnes());
    }

    @Test
    public void testTwoHasOnlyOneOnes(){
        assertEquals(1,new Number(2).getNumberOfOnes());
        @Test
        public void testThreeHasTwoOnes(){
            assertEquals(2,new Number(3).getNumberOfOnes());
        }

        @Test
        public void testSortingOfOneGivesOne(){
            assertArrayEquals(new int [] {1}, new Number().sort(new int[] {1}));
        }

        @Test
        public void testSortingOfOneTwoGivesOneTwo(){
            assertArrayEquals(new int [] {1,2}, new Number().sort(new int[] {1,2}));
        }


        @Test
        public void testSortingOfTwoOneThreeGivesOneTwoThree(){
            assertArrayEquals(new int [] {1,2,3}, new Number().sort(new int[] {2,1,3}));
        }
    }


    @Test
    public void testSortingOfThreeFourGivesFourThree(){
        assertArrayEquals(new int [] {4,3}, new Number().sort(new int[] {3,4}));
    }

}
