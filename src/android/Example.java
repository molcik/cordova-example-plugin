package com.filipmolcik.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class Example extends CordovaPlugin  {

    @Override
    public boolean execute(String action, JSONArray args,
                           CallbackContext callbackContext) throws JSONException {

        if (action.equals("YOUR_ACTION_NAME_PARAMETER")) {

            // Your black magic comes here

            return true;
        }

        return false; // Returning false results in a "MethodNotFound" error.
    }
}