class T800 extends Robot {
public T800(String model) {
    super(model);
}

@Override
public void sayHello() {
    System.out.println("Привет, я модель " + getModel());
}
}

