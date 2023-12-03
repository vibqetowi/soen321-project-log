package nd;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final sc.e f26040a;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26043d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f26044e;

    /* renamed from: b  reason: collision with root package name */
    public final Object f26041b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ya.i<Void> f26042c = new ya.i<>();
    public final ya.i<Void> f = new ya.i<>();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d0(sc.e eVar) {
        Boolean bool;
        Boolean bool2;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f26043d = false;
        eVar.b();
        Context context = eVar.f31432a;
        this.f26040a = eVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f26043d = false;
            bool = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        if (bool == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e10);
            }
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                bool2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
                if (bool2 != null) {
                    this.f26043d = false;
                    bool = null;
                } else {
                    this.f26043d = true;
                    bool = Boolean.valueOf(Boolean.TRUE.equals(bool2));
                }
            }
            bool2 = null;
            if (bool2 != null) {
            }
        }
        this.f26044e = bool;
        synchronized (this.f26041b) {
            if (a()) {
                this.f26042c.d(null);
            }
        }
    }

    public final synchronized boolean a() {
        boolean k10;
        Boolean bool = this.f26044e;
        if (bool != null) {
            k10 = bool.booleanValue();
        } else {
            k10 = this.f26040a.k();
        }
        b(k10);
        return k10;
    }

    public final void b(boolean z10) {
        String str;
        String str2;
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f26044e == null) {
            str2 = "global Firebase setting";
        } else if (this.f26043d) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        boolean z11 = false;
        String format = String.format("Crashlytics automatic data collection %s by %s.", str, str2);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            z11 = true;
        }
        if (z11) {
            Log.d("FirebaseCrashlytics", format, null);
        }
    }
}
