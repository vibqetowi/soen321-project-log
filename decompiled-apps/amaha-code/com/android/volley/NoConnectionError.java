package com.android.volley;

import java.io.IOException;
/* loaded from: classes.dex */
public class NoConnectionError extends NetworkError {
    public NoConnectionError() {
    }

    public NoConnectionError(IOException iOException) {
        super(iOException);
    }
}
