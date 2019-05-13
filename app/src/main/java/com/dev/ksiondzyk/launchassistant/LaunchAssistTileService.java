package com.dev.ksiondzyk.launchassistant;

import android.app.Activity;
import android.app.SearchManager;
import android.os.Bundle;
import android.service.quicksettings.TileService;

import java.lang.reflect.InvocationTargetException;

public class LaunchAssistTileService extends TileService {

    @Override
    public void onClick() {
        SearchManager searchManager = ((SearchManager) getBaseContext().getSystemService(Activity.SEARCH_SERVICE));
        try {
            SearchManager.class.getMethod("launchAssist", Bundle.class).invoke(searchManager, new  Bundle());
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
