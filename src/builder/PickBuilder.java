package builder;

class PickBuilder extends Builder {

    private Product product;

    public PickBuilder(String id) {
        this.product = new Product(id);
    }

    @Override
    void buildWheel() {
        // TODO Auto-generated method stub
        this.product.setWheel("Wheel of pick");
    }

    @Override
    void buildHomingSensor() {
        // TODO Auto-generated method stub
        this.product.setHomingSensor("Homing Sensor of pick");
    }

    @Override
    Product getResult() {
        // TODO Auto-generated method stub
        return this.product;
    }
}