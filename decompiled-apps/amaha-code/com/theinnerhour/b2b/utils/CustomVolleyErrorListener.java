package com.theinnerhour.b2b.utils;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.MyApplication;
import e4.l;
/* loaded from: classes2.dex */
public class CustomVolleyErrorListener implements l.a {
    @Override // e4.l.a
    public void onErrorResponse(VolleyError volleyError) {
        Utils.INSTANCE.checkError(volleyError, MyApplication.V.a());
    }
}
