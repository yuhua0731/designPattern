package builder;

class SortBuilder extends Builder {

    private Product product;

    public SortBuilder(String id) {
        this.product = new Product(id);
    }
    
    @Override
    void buildWheel() {
        // TODO Auto-generated method stub
        this.product.setWheel("Wheel of sort");
    }

    @Override
    void buildHomingSensor() {
        // TODO Auto-generated method stub
        this.product.setHomingSensor("Homing Sensor of sort");
    }

    @Override
    Product getResult() {
        // TODO Auto-generated method stub
        return this.product;
    }
}