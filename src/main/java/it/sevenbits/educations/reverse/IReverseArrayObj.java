package it.sevenbits.educations.reverse;

/**
 * Interface for provide contract
 * Created by vpolozov on 03.04.16.
 */
interface IReverseArrayObj {
    /**
     * reverse T array algoritm
     */
    <T> T[] reversArrayObj(T[] inputArray);

    /**
     * reverse T array to String
     */
    <T> String toStrinArrayObj(T[] inputArray);
}