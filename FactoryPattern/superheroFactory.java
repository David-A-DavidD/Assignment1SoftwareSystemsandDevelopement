public class superheroFactory {

    //use getShape method to get object of type shape
    public superhero superheroFactory(String superhero){
        if(superhero == null){
            return null;
        }
        if(superhero.equalsIgnoreCase("Thor")){
            return new Thor();

        } else if(superhero.equalsIgnoreCase("Batman")){
            return new Batman();

        } else if(superhero.equalsIgnoreCase("Aquaman")){
            return new Aquaman();

        } else if(superhero.equalsIgnoreCase("CaptainAmerica")){
            return new CaptainAmerica();
        }

        return null;
    }
}
