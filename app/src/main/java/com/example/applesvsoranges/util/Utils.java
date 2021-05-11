package com.example.applesvsoranges.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class Utils {

    private Utils(){}

    public static void hideKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);

        View currentFocusedView = activity.getCurrentFocus();

        if (currentFocusedView != null)
            inputMethodManager.hideSoftInputFromWindow(
                currentFocusedView.getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS
            );
    }

}
