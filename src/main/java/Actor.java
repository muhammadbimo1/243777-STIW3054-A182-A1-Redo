public class Actor implements Weights{
   private String name;
   private int complexity;
   int uaw;
   
   Actor(String name, int complexity){
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
   public void setComplexity(){
      this.complexity = complexity;
   }

    @Override
    public int calculate(int totalSimple, int totalAverage, int totalAdvanced) {
        uaw = (totalSimple * 1) + (totalAverage * 2) + (totalAdvanced * 3);
        return uaw;
    }
}
