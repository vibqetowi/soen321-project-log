package di;

import android.content.Context;
import android.provider.Settings;
import hh.g;
/* compiled from: DeviceUtils.kt */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: DeviceUtils.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f12895u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_DeviceUtils getAndroidId()";
        }
    }

    public static final String a(Context context) {
        boolean z10;
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string != null && string.length() != 0) {
                z10 = false;
                if (z10 && !kotlin.jvm.internal.i.b("9774d56d682e549c", string) && !kotlin.jvm.internal.i.b("unknown", string)) {
                    if (!kotlin.jvm.internal.i.b("000000000000000", string)) {
                        return string;
                    }
                    return null;
                }
                return null;
            }
            z10 = true;
            return z10 ? null : null;
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, a.f12895u);
            return null;
        }
    }
}
