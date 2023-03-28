public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City c = new City();
        c.setName("Nazrin ");
        c.setCountry("Azerbaycan ");
        c.setArea("Asiya ");
        c.setPopulation(100000);
        c.setSeaside(true );
        System.out.println("Name: "  +  c.getName()  +  "Country: " +  c.getCountry()+
                "Area: "  +c.getArea()  + "Population: "  +  c.getPopulation()  + "Seaside:"  +  c.getSeaside());
    
       City c1 = new City("Naile",50000,"Turkiye","Asiya",true); 
       c1.info();
       City c2 = new City("Aise",70000,"Columbia","Amerika",false); 
       c2.info();
    }
    
