class NailCutterRunner{

public static void main(String[] args){

NailCutter nail=new NailCutter();
nail.name="Rhombus";
nail.Sharpness=true;
nail.Material="Steel";
nail.Rate=35.0f;
nail.Size=NailCutterSize.LARGE;

NailCutter nail1=new NailCutter();
nail1.name="Rhombus";
nail1.Sharpness=false;
nail1.Material="Steel";
nail1.Rate=40.0f;
nail1.Size=NailCutterSize.SMALL;

NailCutter nail2=new NailCutter();
nail2.name="Rhombus";
nail2.Sharpness=true;
nail2.Material="Copper";
nail2.Rate=45.0f;
nail2.Size=NailCutterSize.SMALL;

nail.Cut();
nail1.Shape();
nail2.Cut();
nail2.Shape();
}
}