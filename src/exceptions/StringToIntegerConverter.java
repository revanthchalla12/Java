public class StringToIntegerConverter {
    public static int convertToInteger(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Failed to convert '" + str + "' to an integer.");
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int result = convertToInteger(input);
                System.out.println("Converted value: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
