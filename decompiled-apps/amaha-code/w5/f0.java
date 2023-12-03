package w5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.List;
/* compiled from: Validate.kt */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f36461a;

    static {
        new f0();
        f36461a = f0.class.getName();
    }

    public static final boolean a(Context context, String redirectURI) {
        List<ResolveInfo> list;
        kotlin.jvm.internal.i.g(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z10 = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!kotlin.jvm.internal.i.b(activityInfo.name, "com.facebook.CustomTabActivity") || !kotlin.jvm.internal.i.b(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    public static final void b(String arg, String str) {
        boolean z10;
        kotlin.jvm.internal.i.g(arg, "arg");
        if (arg.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(defpackage.b.m("Argument '", str, "' cannot be empty").toString());
    }

    public static final void c(Collection container) {
        kotlin.jvm.internal.i.g(container, "container");
        for (Object obj : container) {
            if (obj == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (!container.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
    }

    public static final void d(String str, String str2) {
        boolean z10;
        boolean z11 = false;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException(defpackage.b.m("Argument '", str2, "' cannot be null or empty").toString());
    }

    public static final void e() {
        if (h5.p.h()) {
            return;
        }
        throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
    }
}
