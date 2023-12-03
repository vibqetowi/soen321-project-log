package kd;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import nd.f;
/* compiled from: DevelopmentPlatformProvider.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23253a;

    /* renamed from: b  reason: collision with root package name */
    public a f23254b = null;

    /* compiled from: DevelopmentPlatformProvider.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f23255a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23256b;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(c cVar) {
            boolean z10;
            int f = f.f(cVar.f23253a, "com.google.firebase.crashlytics.unity_version", "string");
            Context context = cVar.f23253a;
            if (f != 0) {
                this.f23255a = "Unity";
                String string = context.getResources().getString(f);
                this.f23256b = string;
                String r = defpackage.c.r("Unity Editor version is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", r, null);
                    return;
                }
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (open != null) {
                        open.close();
                    }
                    z10 = true;
                } catch (IOException unused) {
                    z10 = false;
                }
                if (!z10) {
                    this.f23255a = "Flutter";
                    this.f23256b = null;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                        return;
                    }
                    return;
                }
                this.f23255a = null;
                this.f23256b = null;
                return;
            }
            z10 = false;
            if (!z10) {
            }
        }
    }

    public c(Context context) {
        this.f23253a = context;
    }
}
