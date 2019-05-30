public class Example<T,G>{
    T variableT;
    G variableG;
    public Example(T variableT,G variableG){
        this.variableG=variableG;
        this.variableT=variableT;
    }
    public String toString(){
        return "First variable : "+variableT+" and Second : "+variableG;
    }
}