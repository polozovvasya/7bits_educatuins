package it.sevenbits.educations.reverse;

import it.sevenbits.educations.reverse.ObjArray;
import it.sevenbits.educations.reverse.ObjArrayReverse;
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

    @org.junit.Before
    public void setUp() throws Exception {
        this.reverse = new ObjArrayReverse();
    }

    public void testReversObjArray() throws Exception {
        Integer[] original = {1, 2, 3, 4, 5};
        Integer[] finish = {5, 4, 3, 2, 1};

        ObjArray objOriginal = new ObjArray<Integer>(original);
        ObjArray objFinish = new ObjArray<Integer>(finish);

        this.reverse.reversObjArray(objOriginal);

        assertArrayEquals("wrond reverse", objFinish.getArrayObj(), objOriginal.getArrayObj());
    }

}