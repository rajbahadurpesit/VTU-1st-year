package simple.raj.com.vtuqpaper;

import android.app.Application;


public class MyApplication extends Application {


    private int someVariable;

    public int getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(int someVariable) {
        this.someVariable = someVariable;
    }
}
