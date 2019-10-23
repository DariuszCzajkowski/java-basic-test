public int rollDice(int sides){
    double rollRandom = Math.random()* sides;
    
    
    rollRandom= rollRandom+1;
   
    return (int) rollRandom;

}
public void main(){
int roll1= rollDice();
int roll2= rollDice();
System.out.println(roll1 + " first roll");
System.out.println(roll2 + " Second roll);
}