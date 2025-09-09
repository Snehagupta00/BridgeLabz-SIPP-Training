public class ValidateCreditCard {
    public static void main(String[] args) {
        String visaRegex = "^4[0-9]{15}$";
        String masterRegex = "^5[1-5][0-9]{14}$";

        String[] cards = {"4123456789012345", "5123456789012345", "6123456789012345"};

        for (String card : cards) {
            if (card.matches(visaRegex)) {
                System.out.println(card + " → Valid Visa");
            } else if (card.matches(masterRegex)) {
                System.out.println(card + " → Valid MasterCard");
            } else {
                System.out.println(card + " → Invalid");
            }
        }
    }
}
