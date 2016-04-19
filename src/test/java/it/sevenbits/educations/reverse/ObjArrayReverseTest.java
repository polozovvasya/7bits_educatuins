package it.sevenbits.educations.reverse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test Class ObjArrayReverse
 * Created by iqtekpva on 13.04.16.
 */
public class ObjArrayReverseTest {

    /**
     * reverse Obj ObjArrayReverse
     */
    private ObjArrayReverse reverse;

    /**
     * setUp
     * @throws Exception - Exception
     */
    @Before
    public void setUp() throws Exception {
        this.reverse = new ObjArrayReverse();
    }

    /**
     * test testReversObjArrayInteger
     * @throws Exception - Exception
     */
    @Test
    public void testReversObjArrayInteger() throws Exception {
        final Integer[] original = {1, 2, 3, 4, 5};
        final Integer[] finish = {5, 4, 3, 2, 1};

        ObjArray objOriginal = new ObjArray<Integer>(original);
        ObjArray objFinish = new ObjArray<Integer>(finish);

        this.reverse.reversObjArray(objOriginal);

        assertArrayEquals("wrond reverse", objFinish.getArrayObj(), objOriginal.getArrayObj());
    }

    /**
     * test testReversObjArrayString
     * @throws Exception - Exception
     */
    @Test
    public void testReversObjArrayString() throws Exception {
        final String[] original = {"1", "2", "3", "4", "5"};
        final String[] finish = {"5", "4", "3", "2", "1"};

        ObjArray objOriginal = new ObjArray<String>(original);
        ObjArray objFinish = new ObjArray<String>(finish);

        this.reverse.reversObjArray(objOriginal);

        assertArrayEquals("wrond reverse", objFinish.getArrayObj(), objOriginal.getArrayObj());
    }
}