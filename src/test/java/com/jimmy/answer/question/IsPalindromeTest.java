package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeTest {

    private IsPalindrome isPalindrome = new IsPalindrome();


    @Test
    public void isPalindrome() {
        boolean palindrome = isPalindrome.isPalindrome(121);
        Assert.assertTrue(palindrome);
    }

    @Test
    public void givenIntWhenNegativeThenFalse() {
        boolean palindrome = isPalindrome.isPalindrome(-121);
        Assert.assertTrue(!palindrome);
    }

    @Test
    public void givenIntWhenNotPalindromeThenFalse() {
        boolean palindrome = isPalindrome.isPalindrome(10);
        Assert.assertTrue(!palindrome);
    }

}