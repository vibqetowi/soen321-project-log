package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
/* loaded from: classes.dex */
public final class AFb1lSDK {
    public static Uri AFInAppEventType(Activity activity) {
        Uri referrer;
        if (Build.VERSION.SDK_INT >= 22) {
            referrer = activity.getReferrer();
            return referrer;
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }
}
