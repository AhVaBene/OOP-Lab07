/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(Place.INDOOR, 5, "basket"),
	VOLLEY(Place.INDOOR, 6, "volley"), 
	TENNIS(Place.OUTDOOR, 1, "tennis"), 
	BIKE(Place.OUTDOOR, 1, "bike"), 
	F1(Place.OUTDOOR, 1, "f1"), 
	MOTOGP(Place.OUTDOOR, 2, "motogp"), 
	SOCCER(Place.OUTDOOR, 11, "soccer");
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	String name;
	int members;
	Place place;
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	Sport(final Place place, final int noTeamMembers, final String actualName){
		this.members = noTeamMembers;
		this.name = actualName;
		this.place = place;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     */
	public boolean isIndividualSport() {
		if(this.members == 1) {
			return true;
		}
		return false;
	}
     /* 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     */
	public boolean isIndoorSport() {
		if(this.place == Place.INDOOR) {
			return true;
		}
		return false;
	}
     /* 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     */
	public Place getPlace() {
		return this.place;
	}
     /* 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public String toString() {
		return this.name + "is played " +  this.place.toString() + "by " + this.members + "members";
	}
}
