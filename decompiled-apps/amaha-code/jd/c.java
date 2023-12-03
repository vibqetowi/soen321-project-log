package jd;

import android.os.Bundle;
import android.util.Log;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.Locale;
import wc.a;
/* compiled from: CrashlyticsAnalyticsListener.java */
/* loaded from: classes.dex */
public final class c implements a.InterfaceC0614a {

    /* renamed from: a  reason: collision with root package name */
    public ld.b f21786a;

    /* renamed from: b  reason: collision with root package name */
    public ld.b f21787b;

    public final void a(int i6, Bundle bundle) {
        ld.b bVar;
        String format = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i6), bundle);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", format, null);
        }
        String string = bundle.getString(SessionManager.KEY_NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = this.f21786a;
            } else {
                bVar = this.f21787b;
            }
            if (bVar != null) {
                bVar.A(bundle2, string);
            }
        }
    }
}
