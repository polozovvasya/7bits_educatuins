package it.sevenbits.educations.reverse.interfaces;

/**
 * Interface for ObjArray Utils method
 * Created by iqtekpva on 12.04.16.
 */
public interface IObjArrayUtils {

    /**
     * reverse T array to String
     */
    <T> String toStringObjArray(IObjArray<T> inputArray);
}
