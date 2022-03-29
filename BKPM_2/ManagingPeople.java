public class managingpeople {
    class person {
    String name;
    int ages;
    
    //Using Set and Get Method
    public void set(String name, int ages) {
        this.name = name;
        this.ages = ages;
    }
    
    public String getname() {
        return this.name;
        
    }
    
   public int getages() {
       return this.ages;
   }
}

//Main Method//
    class managingpeople {
        
    }
        public static void main(String[] args) {
            
        }
    //Objects from Class//
            person p1 = new person();
            person p2 = new person();
            p1.set ("Arial", 37);
            p2.set("Josph", 15);
                    {
    //Show the Program //
            if(p1.getages() == p2.getages()) {
                System.out.println(p1.getname()+ "Is the same age as " + p2.getname());
            }else 
            {
                System.out.println(p1.getname()+"Is NOT the same age as "+p2.getname());     
        }
