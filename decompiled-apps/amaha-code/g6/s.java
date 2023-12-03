package g6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: LoginLogger.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d  reason: collision with root package name */
    public static final ScheduledExecutorService f16328d;

    /* renamed from: a  reason: collision with root package name */
    public final String f16329a;

    /* renamed from: b  reason: collision with root package name */
    public final i5.o f16330b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16331c;

    /* compiled from: LoginLogger.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final Bundle a(String str) {
            ScheduledExecutorService scheduledExecutorService = s.f16328d;
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    static {
        new a();
        f16328d = Executors.newSingleThreadScheduledExecutor();
    }

    public s(Context context, String applicationId) {
        PackageInfo packageInfo;
        kotlin.jvm.internal.i.g(applicationId, "applicationId");
        this.f16329a = applicationId;
        this.f16330b = new i5.o(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f16331c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(String str, String str2) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            Bundle a10 = a.a("");
            a10.putString("2_result", "error");
            a10.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            a10.putString("3_method", str2);
            this.f16330b.a(a10, str);
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
