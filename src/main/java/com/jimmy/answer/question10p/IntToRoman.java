package com.jimmy.answer.question10p;

/**
 * <h3>workspace</h3>
 * <p></p>
 *
 * @author : fanjm
 * @date : 2019-08-30 11:39
 */
public class IntToRoman {
    public String intToRoman(int num) {
        if (num > 3999 || num <= 0) {
            throw new IllegalArgumentException();
        }
        System.out.println(num / 1000);
        System.out.println(num % 1000 / 100);
        System.out.println(num % 100 / 10);
        System.out.println(num % 10);

        return digitFour(num / 1000)
                .concat(digitThree(num % 1000 / 100))
                .concat(digitTwo(num % 100 / 10))
                .concat(digitOne(num % 10));

    }

    private String digitOne(int num) {
        switch (num) {
            case 1: {
                return "I";
            }
            case 2: {
                return "II";
            }
            case 3: {
                return "III";
            }
            case 4: {
                return "IV";
            }
            case 5: {
                return "V";
            }
            case 6: {
                return "VI";
            }
            case 7: {
                return "VII";
            }
            case 8: {
                return "VIII";
            }
            case 9: {
                return "IX";
            }
            default:
                return "";
        }
    }

    private String digitTwo(int num) {
        switch (num) {
            case 1: {
                return "X";
            }
            case 2: {
                return "XX";
            }
            case 3: {
                return "XXX";
            }
            case 4: {
                return "XL";
            }
            case 5: {
                return "L";
            }
            case 6: {
                return "LX";
            }
            case 7: {
                return "LXX";
            }
            case 8: {
                return "LXXX";
            }
            case 9: {
                return "XC";
            }
            default:
                return "";
        }
    }

    private String digitThree(int num) {
        switch (num) {
            case 1: {
                return "C";
            }
            case 2: {
                return "CC";
            }
            case 3: {
                return "CCC";
            }
            case 4: {
                return "CD";
            }
            case 5: {
                return "D";
            }
            case 6: {
                return "DC";
            }
            case 7: {
                return "DCC";
            }
            case 8: {
                return "DCCC";
            }
            case 9: {
                return "CM";
            }
            default:
                return "";
        }
    }

    private String digitFour(int num) {
        switch (num) {
            case 1: {
                return "M";
            }
            case 2: {
                return "MM";
            }
            case 3: {
                return "MMM";
            }
            default:
                return "";
        }
    }

}
