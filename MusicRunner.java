class MusicRunner{
public static void main(String args[]){

MusicInstruments instru=MusicInstruments.GUITAR;
		
		String songname="Baarish";
		Music music=new Music(musname,instru);
		System.out.println(music.musname);
		System.out.println(music.songname);
		
		System.out.println(music.instance);
	
}
}