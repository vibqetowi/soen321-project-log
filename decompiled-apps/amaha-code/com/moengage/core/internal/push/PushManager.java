package com.moengage.core.internal.push;

import android.os.Build;
import com.moengage.core.internal.push.base.PushBaseHandler;
import com.moengage.core.internal.push.fcm.FcmHandler;
import com.moengage.core.internal.push.mipush.MiPushHandler;
import com.moengage.core.internal.push.pushkit.PushKitHandler;
import com.moengage.firebase.internal.FcmHandlerImpl;
import com.moengage.pushbase.internal.PushBaseHandlerImpl;
import di.n;
import hh.a;
import hh.g;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import rh.b;
import rh.c;
import rh.d;
/* compiled from: PushManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/moengage/core/internal/push/PushManager;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PushManager {

    /* renamed from: a  reason: collision with root package name */
    public static final PushManager f10185a = new PushManager();

    /* renamed from: b  reason: collision with root package name */
    public static PushBaseHandler f10186b;

    /* renamed from: c  reason: collision with root package name */
    public static FcmHandler f10187c;

    /* renamed from: d  reason: collision with root package name */
    public static MiPushHandler f10188d;

    /* renamed from: e  reason: collision with root package name */
    public static PushKitHandler f10189e;

    static {
        Object newInstance;
        Object newInstance2;
        try {
            newInstance2 = PushBaseHandlerImpl.class.newInstance();
        } catch (Exception unused) {
            a aVar = g.f17610d;
            g.a.b(3, rh.a.f30717u, 2);
        }
        if (newInstance2 != null) {
            f10186b = (PushBaseHandler) newInstance2;
            try {
                newInstance = FcmHandlerImpl.class.newInstance();
            } catch (Exception unused2) {
                a aVar2 = g.f17610d;
                g.a.b(3, b.f30718u, 2);
            }
            if (newInstance != null) {
                f10187c = (FcmHandler) newInstance;
                char[] cArr = n.f12900a;
                if (i.b("Xiaomi", Build.MANUFACTURER)) {
                    try {
                        Object newInstance3 = Class.forName("com.moengage.mi.internal.MiPushHandlerImpl").newInstance();
                        if (newInstance3 != null) {
                            f10188d = (MiPushHandler) newInstance3;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.push.mipush.MiPushHandler");
                        }
                    } catch (Exception unused3) {
                        a aVar3 = g.f17610d;
                        g.a.b(3, c.f30719u, 2);
                    }
                }
                if (i.b("HUAWEI", Build.MANUFACTURER)) {
                    try {
                        Object newInstance4 = Class.forName("com.moengage.hms.pushkit.internal.PushKitHandlerImpl").newInstance();
                        if (newInstance4 != null) {
                            f10189e = (PushKitHandler) newInstance4;
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.push.pushkit.PushKitHandler");
                    } catch (Exception unused4) {
                        a aVar4 = g.f17610d;
                        g.a.b(3, d.f30720u, 2);
                        return;
                    }
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.push.fcm.FcmHandler");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.push.base.PushBaseHandler");
    }

    private PushManager() {
    }
}
