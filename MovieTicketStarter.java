class MovieTicketStarter{
public static void main(String args[]){

MovieTicket movieTicket=new MovieTicket();
System.out.println("Details of Movie Ticket");
System.out.println();
movieTicket.movieName="Kotigobba 3";
movieTicket.theatre="Apsara Talkies";
movieTicket.price=250.0f;
movieTicket.noofSeats=70;
movieTicket.type=Type1.GOLD;
movieTicket.displayDetails();



}


}