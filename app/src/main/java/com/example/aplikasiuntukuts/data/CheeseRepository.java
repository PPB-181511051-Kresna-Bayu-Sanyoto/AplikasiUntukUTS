package com.example.aplikasiuntukuts.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class CheeseRepository {
    private CheeseDao mCheeseDao;
    private LiveData<List<Cheese>> mAllCheese;


    CheeseRepository(Application application){
        SampleDatabase db = SampleDatabase.getInstance(application);
        mCheeseDao = db.cheese();
        mAllCheese = mCheeseDao.selectAllCheese();
    }

    LiveData<List<Cheese>> getmAllCheese() { return mAllCheese; }
}
