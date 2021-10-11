class Contractor{
private String name="Akshata";
private boolean working;
private String plant;
private String site;
private Type2 type;

String getName(){
return this.name;
}
void setWorking(boolean working){
this.working=working;
}
boolean getWorking(){
return this.working;
}
void setPlant(String plant){
this.plant=plant;
}
String getPlant(){
return this.plant;
}
void setSite(String site){
	this.site=site;
}
String getSite(){
		return this.site;
		
}
void setType(Type2 type){
	this.type=type;
	}
	Type2 getType(){
		return this.type;
	}
}