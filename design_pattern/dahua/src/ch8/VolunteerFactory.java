package ch8;

public class VolunteerFactory implements IFactory{
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
