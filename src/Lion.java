
public class Lion {
    private boolean smile;



    public Lion(boolean smile) {
        this.smile = smile;
    }

    public boolean getSmile(){
        return smile;
    }

    public boolean  weAreInDanger(Lion lionA, Lion lionB){

        if ( (lionA.getSmile())  &&  (lionB.getSmile()) ) {
            return  true;
        }
    return false;
    }



}
