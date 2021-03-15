package reflect;

import java.lang.reflect.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class Homework1{

    /**
     * Prints the declared methods of java.lang.String sorted by name.
     */
    public void streamPipeline1() throws Exception {
        Arrays.stream(Class.forName("java.lang.String").getDeclaredMethods()).sorted(Comparator.comparing(Method::getName)).forEach(System.out::println);

    }

    /**
     *  Prints all distinct names of the declared methods of java.lang.String sorted alphabetically.
     */
    public void streamPipeline2() throws Exception {
        Arrays.stream(Class.forName("java.lang.String").getDeclaredMethods()).map(Method::getName).distinct().sorted().forEach(System.out::println);

    }

    /**
     * Prints the declared methods of java.lang.String with two or more parameters whose parameters are all of the same type, sorted by name.
     */
    public void streamPipeline3() throws Exception {
        Arrays.stream(Class.forName("java.lang.String").getDeclaredMethods()).filter(method -> method.getParameterCount() > 1 && Arrays.stream(method.getGenericParameterTypes()).distinct().count() < 2).sorted(Comparator.comparing(Method::getName)).forEach(System.out::println);


    }

    /**
     * Prints all distinct return types of the declared methods of java.lang.String sorted alphabetically.
     */
    public void streamPipeline4() throws Exception {
        Arrays.stream(Class.forName("java.lang.String").getDeclaredMethods()).flatMap(method -> Arrays.stream(method.getGenericParameterTypes())).distinct().sorted(Comparator.comparing(Type::getTypeName)).forEach(System.out::println);
    }

    /**
     * Prints the declared methods of java.lang.String with at least one boolean parameter, sorted by name.
     */
    public void streamPipeline5() throws Exception {
        Arrays.stream(Class.forName("java.lang.String").getDeclaredMethods()).filter(method -> Arrays.stream(method.getGenericParameterTypes()).anyMatch(type -> type.getTypeName() == "boolean")).sorted(Comparator.comparing(Method::getName)).forEach(System.out::println);
    }

    /**
     * Prints the declared methods of java.lang.String whose parameters are all of type int, sorted by name.
     */
    public void streamPipeline6() throws Exception {
        Arrays.stream(Class.forName("java.lang.String").getDeclaredMethods()).filter(method -> Arrays.stream(method.getGenericParameterTypes()).allMatch(type -> type.getTypeName() == "int") && Arrays.stream(method.getGenericParameterTypes()).distinct().count() > 0).sorted(Comparator.comparing(Method::getName)).forEach(System.out::println);
    }

    /**
     * Returns the longest name of the declared methods of java.lang.String.
     */
    public String streamPipeline7() throws Exception {
        // TODO
        return Arrays.stream(Class.forName("java.lang.String").getDeclaredMethods()).map(Method::getName).max(Comparator.comparing(name -> name.length())).map(Object::toString).orElse("");
    }

    /**
     *  Returns the longest one from the names of the public declared methods of java.lang.String.
     */
    public String streamPipeline8() {
        // TODO
        return null;
    }

    /**
     * Returns summary statistics about the number of parameters for the declared methods of java.lang.String.
     */
    public IntSummaryStatistics streamPipeline9() {
        // TODO
        return null;
    }

    /**
     * Returns the maximum number of parameters accepted by the declared methods of java.lang.String.
     */
    public int streamPipeline10() {
        // TODO
        return 0;
    }

    /**
     * Returns the declared method of java.lang.String with the most number of parameters.
     */
    public Method streamPipeline11() {
        // TODO
        return null;
    }

    /**
     * Prints all distinct parameter types of the declared methods of java.lang.String sorted alphabetically.
     */
    public void streamPipeline12() {
        // TODO
    }

}
