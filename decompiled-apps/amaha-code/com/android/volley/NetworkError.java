package com.android.volley;

import java.io.IOException;
/* loaded from: classes.dex */
public class NetworkError extends VolleyError {
    public NetworkError() {
    }

    public NetworkError(IOException iOException) {
        super(iOException);
    }
}
