public class Hello {

    public static void main(String[] args) {
        
        String name;

        // Check if user passed argument
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        // Print greeting
        System.out.println("Hello " + name);
    }
}