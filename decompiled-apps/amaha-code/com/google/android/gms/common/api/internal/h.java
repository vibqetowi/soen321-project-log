package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public interface h {
    void j(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback m(Class cls, String str);

    Activity n();

    void startActivityForResult(Intent intent, int i6);
}
