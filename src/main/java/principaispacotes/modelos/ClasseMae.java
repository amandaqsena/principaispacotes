package principaispacotes.modelos;

import java.io.Serializable;

public class ClasseMae implements Serializable{
    private int atributo1;
    private String atributo2;
    private boolean atributo3;

    public ClasseMae(){

    }

    public ClasseMae(int atributo1, String atributo2, boolean atributo3){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public int getAtributo1() {
        return this.atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return this.atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    public boolean isAtributo3() {
        return this.atributo3;
    }

    public boolean getAtributo3() {
        return this.atributo3;
    }

    public void setAtributo3(boolean atributo3) {
        this.atributo3 = atributo3;
    }

    public boolean equals(Object ref){

        ClasseMae outra = (ClasseMae) ref;

        if (this.atributo1 != outra.atributo1){
            return false;
        } 
        
        if (this.atributo2 != outra.atributo2){
            return false;
        }
        if (this.atributo3 != outra.atributo3){
            return false;
        }

        return true;
    }

    public String toString(){
        return "{ Atributo1 = " + this.getAtributo1() 
            + "\n Atributo2 = " + this.getAtributo2()
            + "\n Atributo3 = " + this.getAtributo3() + " }";
    }
}
