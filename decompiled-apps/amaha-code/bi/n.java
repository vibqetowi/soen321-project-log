package bi;

import android.content.Context;
import android.content.SharedPreferences;
import s1.s;
/* compiled from: DatabaseUtilityHelper.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4315a;

    /* renamed from: b  reason: collision with root package name */
    public final ih.p f4316b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4317c;

    public n(Context context, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f4315a = context;
        this.f4316b = sdkInstance;
        this.f4317c = "Core_DatabaseUtilityHelper";
    }

    public final void a() {
        ai.g.f583a.getClass();
        s sVar = ai.g.a(this.f4315a, this.f4316b).f24373a;
        sVar.I(((SharedPreferences) sVar.f31226x).getLong("MOE_LAST_IN_APP_SHOWN_TIME", 0L) / 1000, "MOE_LAST_IN_APP_SHOWN_TIME");
    }
}
