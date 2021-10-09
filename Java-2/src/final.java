package fin;

import priv.*;
import priv.Priv_App;
import prot.*;
import prot.Prot_App;


class Call extends Prot_App{

    public static void main(String args[]){
        Call c = new Call();
        Priv_App p = new Priv_App();
        c.obj1();

    }
}