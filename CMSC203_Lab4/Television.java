/** 
*The purpose of this class is to model a television
* Ahmed H. Abdelmoneim 10/01/2020
*/

public class Television {
	@SuppressWarnings("unused")
 /** Declaring instance variables*/
private String MANUFACTURER;
@SuppressWarnings("unused")
private int SCREEN_SIZE ;
private boolean powerOn;

@SuppressWarnings("unused")
private int channel;
private int volume;
/**
 * Constructor.
 *
 * @param manufacturer , brand name of the Television
 * @param screenSize
 */
Television(String MANUFACTURER, int SCREEN_SIZE){
this.MANUFACTURER = MANUFACTURER;
this.SCREEN_SIZE = SCREEN_SIZE;
this.powerOn = false;
this.channel = 2;
this.volume = 20;
}
/** This method will return the volume of television*/
public int getVolume() {
	return volume;
}
/** Returns the channel number*/
public int getChannel() {
	return channel;
}
public String getManufacturer() {
	return MANUFACTURER;
}
/** Sets the manufacturer name*/
public String setManufacturer(String MANUFACTURER) {
	this.MANUFACTURER = MANUFACTURER;
	return MANUFACTURER;
}
/** This method will return the screen size*/
public int getScreenSize() {
	return SCREEN_SIZE;
}
/** Sets the channel number*/   
public int setChannel(int channel) {
	this.channel = channel;
	return channel;
}
/** This method will turn on or off the Television*/
public void power(){

this.powerOn = !this.powerOn;

}
/**This method will increase the volume by 1*/
public void increaseVolume()
{
    volume++;
}
/** This method will decrease the volume by 1*/
public void decreaseVolume()
{
    volume--;
}

}
