package javatpoint07;

class Top {

    public void method(Object o) {
        System.out.println("Top.Method(Object)");
    }
}

class Sub extends Top {
    
    public void method(String s) {
        System.out.println("Sub.Method(String)");
    }

    @Override
    public void method(Object o) {
        System.out.println("Sub.Method(Object)");
    }
}
