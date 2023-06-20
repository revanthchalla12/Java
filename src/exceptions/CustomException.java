class CustomConversionException extends RuntimeException {
    public CustomConversionException(String message) {
        super(message);
    }
}

public class CustomException {
        public static int convertToInteger(String str) throws CustomConversionException {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                throw new CustomConversionException("Failed to convert '" + str + "' to an integer.");
            }
        }

        public static void main(String[] args) {
            String[] inputs = {"23", "45.67", "test", "123f"};

            for (String input : inputs) {
                try {
                    int result = convertToInteger(input);
                    System.out.println("Converted value: " + result);
                } catch (CustomConversionException e) {
                    System.out.println("CustomConversionException: " + e.getMessage());
                }
            }
        }
    }


