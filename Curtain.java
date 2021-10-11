class Curtain{
private String color="Green";
private boolean quality;
ClothType type;
private float price;
private String rating="4.5 Star";

String getColor(){
	return this.color;
}
void setQuality(boolean quality){
	this.quality=quality;
} 
boolean getQuality(){
	return this.quality;
}
void setType(ClothType type){
	this.type=type;
}
ClothType getType(){
	return this.type;
}
void setPrice(float price){
	this.price=price;
}
float getPrice(){
	return this.price;
}
String getRating(){
	return this.rating;
}

}