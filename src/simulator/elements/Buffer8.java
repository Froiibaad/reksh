package simulator.elements;

public class Buffer8 extends KombMreza {
    public Buffer8() {
        super(8, 8);
    }

    protected void calc() {
        for(int i=0; i<8; i++)
            outputs.get(i).set( inputs.get(i).getValue() );
    }
}
