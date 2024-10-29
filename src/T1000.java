class T1000 extends Robot {
    public T1000(String model) {
        super(model);
    }

    @Override
    public void sayHello() {
        System.out.println("Привет, я модель " + getModel());
    }
}