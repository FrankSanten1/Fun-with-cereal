class Cereal {
    String name;
    String type;
    int calories;
    int protein;
    int fat; 
    int sodium;
    int fiber;
    int carbs;
    int sugar;
    int potassium;
    int vitamins;
    int shelf;
    double weight;
    double cups;
    double rating;

    public Cereal(String name, String type, int calories, int protein, int fat, int sodium, int fiber, int carbs, int sugar, int potassium, int vitamins, int shelf, double weight, double cups, double rating) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbs = carbs;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = cups;
        this.rating = rating;
    }

    public String getName() {return name;}
    public String getType() {return type;}
    public int getCalories() {return calories;}
    public int getProtein() {return protein;}
    public int getFat() {return fat;}
    public int getSodium() {return sodium;}
    public int getFiber() {return fiber;}
    public int getCarbs() {return carbs;}
    public int getSugar() {return sugar;}
    public int getPotassium() {return potassium;}
    public int getVitamins() {return vitamins;}
    public int getShelf() {return shelf;}
    public double getWeight() {return weight;}
    public double getCups() {return cups;}
    public double getRating() {return rating;}

    public String toString() {
        return name + ", " + type + ", " + calories + ", " + protein + ", " + fat + ", " + sodium + ", " + fiber + ", " + carbs + ", " + sugar + ", " + potassium + ", " + vitamins + ", " + shelf + ", " + weight + ", " + cups + ", " + rating;
    }
}