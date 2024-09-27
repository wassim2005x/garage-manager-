public class garage {
    private car[] mycar;
    private motorcycle[] mymotorcycle;
    private truck[] mytruck;

    public int c = 0;
    public int m = 0;
    public int t = 0;

    public garage() {
        this.mycar = new car[100];
        this.mymotorcycle = new motorcycle[100];
        this.mytruck = new truck[100];
    }

    public void addCar(car mycar) {
        if (c < this.mycar.length) {
            this.mycar[c] = mycar;
            c++;
        } else {
            System.out.println("Cannot add more cars, garage is full!");
        }
    }

    public void addMotorcycle(motorcycle mymotorcycle) {
        if (m < this.mymotorcycle.length) {
            this.mymotorcycle[m] = mymotorcycle;
            m++;
        } else {
            System.out.println("Cannot add more motorcycles, garage is full!");
        }
    }

    public void addTruck(truck mytruck) {
        if (t < this.mytruck.length) {
            this.mytruck[t] = mytruck;
            t++;
        } else {
            System.out.println("Cannot add more trucks, garage is full!");
        }
    }

    public void showAllVehicles() {
        System.out.println("All Vehicles in the Garage:");

        for (int i = 0; i < c; i++) {
            mycar[i].display();
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            mymotorcycle[i].display();
            System.out.println();
        }

        for (int i = 0; i < t; i++) {
            mytruck[i].display();
            System.out.println();
        }
    }
}
