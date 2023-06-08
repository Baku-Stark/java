package Copy_Objects;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    Car(Car x){
        // Gerar um novo constructor
        
        this.copy(x);
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car x){
        // Copy Objects
        //  Antigo endereço -> [Copy_Objects.Car@7a81197d]
        //  Novo endereço -> [Copy_Objects.Car@5ca881b5]

        this.setMake(x.make);
        this.setModel(x.model);
        this.setYear(x.year);
    }
}
