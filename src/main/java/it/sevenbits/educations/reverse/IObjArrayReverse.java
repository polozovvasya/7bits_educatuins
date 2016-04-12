package it.sevenbits.educations.reverse;

/**
 * Interface for provide contract
 * Created by vpolozov on 03.04.16.
 */
interface IObjArrayReverse {
    /**
     * reverse T array algoritm
     */
    <T> void reversObjArray(IObjArray<T> inputArray);
}