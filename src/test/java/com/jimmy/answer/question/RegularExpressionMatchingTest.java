package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchingTest {

    private RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();

    @Test
    public void givenStringWhenBiggerThenLowerZ() {
        boolean match = regularExpressionMatching.isMatch("A", "A");
        Assert.assertTrue(!match);
    }

    @Test
    public void givenStringWhenSmallThenLowerAThenZ() {
        boolean match = regularExpressionMatching.isMatch("9", "9");
        Assert.assertTrue(!match);
    }

    @Test
    public void isMatch() {
        boolean match = regularExpressionMatching.isMatch("aa", "a");
        Assert.assertTrue(!match);
    }

    @Test
    public void givenTwoStringWhenStarMatchThenTrue() {
        boolean match = regularExpressionMatching.isMatch("aa", "a*");
        Assert.assertTrue(!match);
    }

    @Test
    public void givenTwoStringWhenPointAndStarMatchThenTrue() {
        boolean match = regularExpressionMatching.isMatch("ab", ".*");
        Assert.assertTrue(!match);
    }

    @Test
    public void givenTwoStringWhenFirstCharNotMatchButSubStringMatchThenTrue() {
        boolean match = regularExpressionMatching.isMatch("aab", "c*a*b");
        Assert.assertTrue(!match);
    }

    @Test
    public void givenTwoStringWhenStarCoverTwoCharThenFalse() {
        boolean match = regularExpressionMatching.isMatch("mississippi", "mis*is*p*.");
        Assert.assertTrue(!match);
    }
}