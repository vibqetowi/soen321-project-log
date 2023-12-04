package com.ifriend.infrastructure;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u0005¢\u0006\u0002\u0010\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\b¨\u0006\t"}, d2 = {"restartApp", "", "context", "Landroid/content/Context;", "unexpectedNull", ExifInterface.GPS_DIRECTION_TRUE, "()Ljava/lang/Object;", "goToRegistration", "Landroid/app/Activity;", "infrastructure_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UtilsKt {
    public static final <T> T unexpectedNull() {
        return null;
    }

    public static final void restartApp(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName());
        Intrinsics.checkNotNull(launchIntentForPackage);
        context.startActivity(Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
        Runtime.getRuntime().exit(0);
    }

    public static final void goToRegistration(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intent intent = new Intent();
        intent.addFlags(335544320);
        intent.setComponent(new ComponentName(activity, "com.ifriend.registration.presentation.ui.RegistrationActivity"));
        activity.finish();
        activity.startActivity(intent);
    }
}
