package class6;

public class E5SwitchStatement {
    public static void main(String[] args) {

        char gender='M';

        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case 'O':
                System.out.println("Others");
                break;
            default:
                System.out.println("Chat not supported");
        }
    }
}
