package exercies;

 class Account {
        int RekeningNummer;
        String Naam;
        float Balance;
        
  public void Invullen(int r , String n, float d){
         Rekeningnummer = r;
         naam = n;
         Balace = d;

  }
  
   public void Deposite (float d){
          Balance =   d + Balance;
          sout(d + " AKKORD "); 
          
   }
        
   PUBLIC void withdraw(float d){
          if( Balance < d ) {
                 sout(" ONVOLDOENDE"" );
                      } else {
                             Balance = Balance - d;
                             sout(" whirhdraww " + d);
                      }
                      }
   public void checkBalance (){
       sout("balance is "  + d);     
   }
                      
    public void display()
                      {sout(RekeningNummer + " " + Naam + " "+ Balance);
       

}
