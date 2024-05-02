package Parcial1;

public interface Contract {
    double calculateIMC();
    boolean overWeight();

    double checkPulse(double time, double restingHeartRate, double amplitude, double variation);
}
