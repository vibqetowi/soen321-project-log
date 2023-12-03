package i5;

import android.content.SharedPreferences;
import java.util.HashSet;
import u5.g;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19886u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f19887v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f19888w;

    public /* synthetic */ r(String str, String str2, int i6) {
        this.f19886u = i6;
        this.f19887v = str;
        this.f19888w = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f19886u;
        String buttonText = this.f19888w;
        String queriedEvent = this.f19887v;
        switch (i6) {
            case 0:
                if (!b6.a.b(s.class)) {
                    try {
                        kotlin.jvm.internal.i.g(queriedEvent, "$key");
                        kotlin.jvm.internal.i.g(buttonText, "$value");
                        if (!s.f19892d.get()) {
                            s.f19889a.b();
                        }
                        SharedPreferences sharedPreferences = s.f19891c;
                        if (sharedPreferences != null) {
                            sharedPreferences.edit().putString(queriedEvent, buttonText).apply();
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("sharedPreferences");
                            throw null;
                        }
                    } catch (Throwable th2) {
                        b6.a.a(s.class, th2);
                        return;
                    }
                }
                return;
            default:
                kotlin.jvm.internal.i.g(queriedEvent, "$queriedEvent");
                kotlin.jvm.internal.i.g(buttonText, "$buttonText");
                HashSet hashSet = u5.g.f33832y;
                g.a.c(queriedEvent, buttonText, new float[0]);
                return;
        }
    }
}
