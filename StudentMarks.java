class StudentMarks {
    static void enterMarks(int marks) 
    {
        if(marks < 0 || marks > 100) {
            throw new ArithmeticException("Marks must be between 0 and 100");
        }
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            enterMarks(105);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception:"+ e.getMessage());
        }
        finally{
            System.out.println("Thankyou for using the system");
        }
    }
}