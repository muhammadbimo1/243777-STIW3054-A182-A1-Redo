public class UseCase implements Weights{
   private String name;
   private int complexity;
   int uucw = 0;
   
   UseCase(String name, int complexity){
      this.name = name;
      this.complexity = complexity;
   }
   public String getName(){
      return name;
   }
   public int getComplexity(){
      return complexity;
   }

   public void setName(){
      this.name = name;
   }
   public void setComplexity(int complexity){
      this.complexity = complexity;
   }
    @Override
    public int calculate(int totalSimple, int totalAverage, int totalAdvanced) {
            uucw = (totalSimple * 5) + (totalAverage * 10) + (totalAdvanced * 15);
            return uucw;
    }




  
}
