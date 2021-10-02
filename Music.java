class Music{
static int Instance=0;
String musname;
MusicInstruments instru;
String songname="Hindustani";


Music(String musname,MusicInstruments instru){
Instance++;
this.musname=musname;
this.instru=instru;
}
}