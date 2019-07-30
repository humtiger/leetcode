package com.jimmy.answer.question;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LongestPalindromeTest {

    private LongestPalindrome solution = new LongestPalindrome();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void longestPalindrome() {
        String babad = solution.longestPalindrome("babad");
        Assert.assertNotNull(babad);
        Assert.assertEquals("bab", babad);
    }

    @Test
    public void givenStringWhenEmptyThenEmpty() {
        String s = solution.longestPalindrome("");
        Assert.assertEquals("", s);
    }

    @Test
    public void givenStringWhenOneCharThenItself() {
        String babad = solution.longestPalindrome("a");
        Assert.assertNotNull(babad);
        Assert.assertEquals("a", babad);
    }

    @Test
    public void givenStringWhenTwoSameCharThenItself() {
        String babad = solution.longestPalindrome("aa");
        Assert.assertNotNull(babad);
        Assert.assertEquals("aa", babad);
    }

    @Test
    public void givenStringWhenTwoDifferentCharThenFirstOne() {
        String babad = solution.longestPalindrome("ab");
        Assert.assertNotNull(babad);
        Assert.assertEquals("a", babad);
    }

    @Test
    public void givenStringWhenThreeSameCharThenItself() {
        String babad = solution.longestPalindrome("aaa");
        Assert.assertNotNull(babad);
        Assert.assertEquals("aaa", babad);
    }

    @Test
    public void givenStringWhenTwoPalindromeThenItself() {
        String babad = solution.longestPalindrome("abcdcbca");
        Assert.assertNotNull(babad);
        Assert.assertEquals("bcdcb", babad);
    }

    @Test
    public void givenStringWhenLoneThenFast() {
        Long begin = System.currentTimeMillis();
        String babad = solution.longestPalindrome("ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy");
        Long end = System.currentTimeMillis();
        Assert.assertTrue(end - begin < 100);
        Assert.assertNotNull(babad);
        Assert.assertEquals("fklkf", babad);
    }
}