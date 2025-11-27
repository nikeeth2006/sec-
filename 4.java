public class LineCodingDemo {

    public static void main(String[] args) {
        String data = "101010";
        
        // Show the results for different line coding techniques
        System.out.println("Original Data: " + data);
        
        // Unipolar Encoding
        System.out.println("Unipolar Encoding: " + unipolarEncoding(data));
        
        // Polar Encoding (NRZ-L)
        System.out.println("Polar Encoding (NRZ-L): " + polarEncoding(data));
        
        // Manchester Encoding
        System.out.println("Manchester Encoding: " + manchesterEncoding(data));
        
        // Non-Return to Zero (NRZ)
        System.out.println("Non-Return to Zero (NRZ): " + nrzEncoding(data));
    }
    
    // Unipolar Encoding (1 = +V, 0 = 0)
    public static String unipolarEncoding(String data) {
        StringBuilder encoded = new StringBuilder();
        for (char bit : data.toCharArray()) {
            if (bit == '1') {
                encoded.append("+V ");
            } else {
                encoded.append("0 ");
            }
        }
        return encoded.toString().trim();
    }
    
    // Polar Encoding (NRZ-L) (1 = +V, 0 = -V)
    public static String polarEncoding(String data) {
        StringBuilder encoded = new StringBuilder();
        for (char bit : data.toCharArray()) {
            if (bit == '1') {
                encoded.append("+V ");
            } else {
                encoded.append("-V ");
            }
        }
        return encoded.toString().trim();
    }
    
    // Manchester Encoding (1 = High to Low, 0 = Low to High)
    public static String manchesterEncoding(String data) {
        StringBuilder encoded = new StringBuilder();
        for (char bit : data.toCharArray()) {
            if (bit == '1') {
                encoded.append("High -> Low ");
            } else {
                encoded.append("Low -> High ");
            }
        }
        return encoded.toString
