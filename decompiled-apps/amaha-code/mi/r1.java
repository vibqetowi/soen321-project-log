package mi;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: PushToInAppHandler.kt */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f25262a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25263b;

    /* compiled from: PushToInAppHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" shownInApp() : ", r1.this.f25263b);
        }
    }

    public r1(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f25262a = sdkInstance;
        this.f25263b = "InApp_6.5.0_PushToInAppHandler";
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r1 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j10, Context context, String str) {
        boolean z10;
        i1.f25206a.getClass();
        h1 b10 = i1.b(this.f25262a);
        ScheduledExecutorService scheduledExecutorService = b10.f;
        if (scheduledExecutorService != null) {
            if (scheduledExecutorService.isShutdown()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        b10.f = Executors.newScheduledThreadPool(1);
        ScheduledExecutorService scheduledExecutorService2 = b10.f;
        if (scheduledExecutorService2 != null) {
            scheduledExecutorService2.schedule(new androidx.emoji2.text.g(29, context, this, str), j10, TimeUnit.SECONDS);
        }
    }

    public final void b(Context context, Bundle bundle) {
        String string;
        JSONObject jSONObject;
        String string2;
        hh.g.b(this.f25262a.f20105d, 0, new a(), 3);
        if (bundle.containsKey("moe_inapp_cid")) {
            String string3 = bundle.getString("moe_inapp_cid");
            if (string3 == null) {
                return;
            }
            a(5L, context, string3);
        } else if (!bundle.containsKey("moe_inapp") || (string = bundle.getString("moe_inapp")) == null || (string2 = (jSONObject = new JSONObject(string)).getString("cid")) == null) {
        } else {
            long optLong = jSONObject.optLong("timeDelay", 5L);
            if (jSONObject.optBoolean("isTest", false)) {
                a(optLong, context, string2);
            }
        }
    }
}
