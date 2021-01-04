package SimplePlugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MyPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        JSONArray jsonArray = args.getJSONArray(0);
        int a = jsonArray.getInt(0);
        int b = jsonArray.getInt(1);
        switch (action) {
            case "Plus":
                this.plus(a, b, callbackContext);
                return true;
            case "Minus":
                this.minus(a, b, callbackContext);
                return true;
            default:
                return false;
        }
    }

    private void plus(int a, int b, CallbackContext callbackContext) {
        int ret = a + b;
        if (ret < 100) {
            callbackContext.success(ret);
        } else {
            callbackContext.error("两数之和不能大于100");
        }
    }

    private void minus(int a, int b, CallbackContext callbackContext) {
        int ret = a - b;
        if (ret > 0) {
            callbackContext.success(ret);
        } else {
            callbackContext.error("减数不能小于被减数");
        }
    }
}
