package com.moengage.firebase.internal;

import android.content.Context;
import androidx.annotation.Keep;
import com.moengage.core.internal.push.fcm.FcmHandler;
import eh.o;
import hh.g;
import ji.h;
import ji.j;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: FcmHandlerImpl.kt */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/moengage/firebase/internal/FcmHandlerImpl;", "Lcom/moengage/core/internal/push/fcm/FcmHandler;", "Landroid/content/Context;", "context", "Lhs/k;", "registerForPushToken", "initialiseModule", "", "tag", "Ljava/lang/String;", "<init>", "()V", "moe-push-firebase_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class FcmHandlerImpl implements FcmHandler {
    private final String tag = "FCM_6.2.0_FcmHandlerImpl";

    /* compiled from: FcmHandlerImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" initialiseModule() : ", FcmHandlerImpl.this.tag);
        }
    }

    /* compiled from: FcmHandlerImpl.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" registerForPushToken() : ", FcmHandlerImpl.this.tag);
        }
    }

    @Override // com.moengage.core.internal.push.fcm.FcmHandler
    public void initialiseModule(Context context) {
        i.g(context, "context");
        try {
            synchronized (j.f22052a) {
                hh.a aVar = g.f17610d;
                g.a.b(0, h.f22050u, 3);
                o.f14029a.add(new ji.g(0));
                hs.k kVar = hs.k.f19476a;
            }
        } catch (Throwable th2) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, th2, new a());
        }
    }

    @Override // com.moengage.core.internal.push.fcm.FcmHandler
    public void registerForPushToken(Context context) {
        i.g(context, "context");
        try {
            ji.o.b(context);
        } catch (Throwable th2) {
            hh.a aVar = g.f17610d;
            g.a.a(1, th2, new b());
        }
    }
}
