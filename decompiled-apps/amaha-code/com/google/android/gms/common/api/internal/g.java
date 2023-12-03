package com.google.android.gms.common.api.internal;

import android.app.Activity;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f7378a;

    public g(Activity activity) {
        if (activity != null) {
            this.f7378a = activity;
            return;
        }
        throw new NullPointerException("Activity must not be null");
    }
}
