package com.design.patterns.abstractFactory;

public class TestExample {
	
	public static void main(String[] args) {
		
		System.out.println("Action Movies are:");
		iMovieFactory movie1 = new ActionMovieFactory("Kranti");
		System.out.println(movie1.getTollywoodMovie().movieName());
		iMovieFactory movie2 = new ActionMovieFactory("Bang Bang");
		System.out.println(movie2.getBollywoodMovie().movieName());
		
		iMovieFactory movie3 = new ComedyMovieFactory("Bisam Bitap");
		System.out.println(movie3.getTollywoodMovie().movieName());
		iMovieFactory movie4 = new ComedyMovieFactory("Munna Bhai");
		System.out.println(movie4.getBollywoodMovie().movieName());
	}
}
interface iTollywood{
	String movieName();
}
interface IBollywood{
	String movieName();
}
class TollywoodActionMovie implements iTollywood{
	String name;
	TollywoodActionMovie(String name){
		this.name = name;
	}
	@Override
	public String movieName() {
		return name+" is a Tollywood action movie";
	}
}
class TollywoodComedyMovie  implements iTollywood{
	String name;
	TollywoodComedyMovie(String name){
		this.name = name;
	}
	@Override
	public String movieName() {
		return name+" is a tollywood comedy movie";
	}
}
class BollywoodActionMovie implements IBollywood{
	String name;
	
	BollywoodActionMovie(String name){
		this.name = name;
	}
	public String movieName() {
		return name+"is a Bollywood action movie";
	}
}
class BollywoodComedyMovie  implements IBollywood{
	String name;
	
	BollywoodComedyMovie(String name){
		this.name = name;
	}

	@Override
	public String movieName() {
		return name +" is a bollywood comedy movie";
	}
}
interface iMovieFactory{
	
	iTollywood getTollywoodMovie() ;
	IBollywood getBollywoodMovie();
}
class ActionMovieFactory implements iMovieFactory{
	String name;
	ActionMovieFactory(String name){
		this.name = name;
		
	}
	public iTollywood getTollywoodMovie() {
		return new TollywoodActionMovie(name);
	}
	public IBollywood getBollywoodMovie() {
		return  new BollywoodActionMovie(name);
	}
}
class ComedyMovieFactory implements iMovieFactory{
	String name;
	ComedyMovieFactory(String name){
		this.name = name;
	}
	public iTollywood getTollywoodMovie() {
		return new TollywoodComedyMovie(name);
	}
	public IBollywood getBollywoodMovie() {
		return  new BollywoodComedyMovie(name);
	}
}