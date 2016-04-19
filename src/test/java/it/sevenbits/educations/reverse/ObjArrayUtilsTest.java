package it.sevenbits.educations.reverse;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for class ObjArrayUtils
 * Created by iqtekpva on 19.04.16.
 */
public class ObjArrayUtilsTest {

    /**
     * reverse Obj ObjArrayUtils
     */
    private ObjArrayUtils objArrayUtils;

    /**
     * setUp
     * @throws Exception - Exception
     */
    @Before
    public void setUp() throws Exception {
        this.objArrayUtils = new ObjArrayUtils();
    }

    /**
     * test testToStringObjArray
     * @throws Exception - Exception
     */
    @Test
    public void testToStringObjArray() throws Exception {
        String[] original = {"1", "2", "3", "4", "5"};
        String finishStr = "1, 2, 3, 4, 5";

        ObjArray objOriginal = new ObjArray<String>(original);

        assertEquals("wrong result", finishStr, this.objArrayUtils.toStringObjArray(objOriginal));
    }

}