package ru.gb.practicum.num1;

public class Train {
    private String typeOfTrain;
    private String destination;
    private int numberOfTrain;
    private String timeOfDeparture;
    private String timeOfArrival;
    public void Train(String typeOfTrain, String destination, int numberOfTrain, String timeOfDeparture, String timeOfArrival){
        this.typeOfTrain = typeOfTrain;
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
    }

}
