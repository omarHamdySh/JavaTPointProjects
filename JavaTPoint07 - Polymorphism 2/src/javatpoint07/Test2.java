package javatpoint07;

class Top2 {

    public void method(Exception o) {
        System.out.println("Top2.Method(Exception)");
    }
}

class Sub2 extends Top2 {

    //hence the IndexOutOfBoundsException is a subclass of RuntimeException
    public void method(IndexOutOfBoundsException s) {
        System.out.println("Sub2.Method(IndexOutOfBoundsException)");
    }

    //hence the RuntimeException is a subclass of Exception.
    public void method(RuntimeException o) {
        System.out.println("Sub2.Method(RuntimeException)");
    }
}
