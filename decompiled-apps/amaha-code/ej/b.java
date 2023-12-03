package ej;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.moengage.pushbase.push.PushMessageListener;
import fj.e;
import hh.g;
import ih.p;
import kj.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: MoEPushHelper.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static b f14047b;

    /* renamed from: a  reason: collision with root package name */
    public final String f14048a = "PushBase_6.6.0_MoEPushHelper";

    /* compiled from: MoEPushHelper.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" isFromMoEngagePlatform() : ", b.this.f14048a);
        }
    }

    public static PushMessageListener a(p sdkInstance) {
        PushMessageListener pushMessageListener;
        i.g(sdkInstance, "sdkInstance");
        fj.d.f15071a.getClass();
        PushMessageListener pushMessageListener2 = fj.d.a(sdkInstance).f24392a;
        if (pushMessageListener2 == null) {
            synchronized (b.class) {
                pushMessageListener = fj.d.a(sdkInstance).f24392a;
                if (pushMessageListener == null) {
                    pushMessageListener = new PushMessageListener((String) sdkInstance.f20102a.f5133c);
                }
                fj.d.a(sdkInstance).f24392a = pushMessageListener;
            }
            return pushMessageListener;
        }
        return pushMessageListener2;
    }

    public static void d(Context context) {
        e eVar;
        i.g(context, "context");
        e eVar2 = e.f15075b;
        if (eVar2 == null) {
            synchronized (e.class) {
                eVar = e.f15075b;
                if (eVar == null) {
                    eVar = new e();
                }
                e.f15075b = eVar;
            }
            eVar2 = eVar;
        }
        eVar2.b(context);
    }

    public final boolean b(Bundle pushPayload) {
        i.g(pushPayload, "pushPayload");
        try {
            if (!pushPayload.containsKey("push_from")) {
                return false;
            }
            if (!i.b("moengage", pushPayload.getString("push_from"))) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            hh.a aVar = g.f17610d;
            g.a.a(1, e10, new a());
            return false;
        }
    }

    public final void c(boolean z10, Context context) {
        i.g(context, "context");
        try {
            if (Build.VERSION.SDK_INT < 33) {
                hh.a aVar = g.f17610d;
                g.a.b(0, new c(this), 3);
            } else if (z10) {
                hh.a aVar2 = g.f17610d;
                g.a.b(0, kj.g.f23372u, 3);
                Bundle bundle = new Bundle();
                bundle.putString("flow", "self");
                f.b(context, bundle);
            } else {
                hh.a aVar3 = g.f17610d;
                g.a.b(0, kj.d.f23366u, 3);
                Bundle bundle2 = new Bundle();
                bundle2.putString("flow", "self");
                f.a(context, bundle2);
            }
        } catch (Throwable th2) {
            hh.a aVar4 = g.f17610d;
            g.a.a(1, th2, new d(this));
        }
    }
}
