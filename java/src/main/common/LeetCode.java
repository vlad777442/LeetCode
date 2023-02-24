package main.common;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface LeetCode {
    int id();

    String name() default "";

    String url() default "https://leetcode.com/problemset/all/";

    Difficulty difficulty() default Difficulty.UNDEFINED;

    boolean premium() default false;
}
