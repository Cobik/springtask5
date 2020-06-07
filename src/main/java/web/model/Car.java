package web.model;

public class Car {

    private String carName;

    private String carModel;

    private String carType;


    public Car(String carName, String carModel, String carType) {
        this.carName = carName;
        this.carModel = carModel;
        this.carType = carType;
    }


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}
