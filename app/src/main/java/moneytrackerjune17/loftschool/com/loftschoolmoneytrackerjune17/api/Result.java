package moneytrackerjune17.loftschool.com.loftschoolmoneytrackerjune17.api;

import android.text.TextUtils;

/**
 * Copyright (c) 2017.
 * All Rights Reserved.
 * <p>
 * Author: Dmitry Gordeev <netimen@gmail.com>
 * Date:   20.04.17
 */

public class Result {
    String status;

    public boolean isSuccess() {
        return TextUtils.equals(status, "success");
    }
}
