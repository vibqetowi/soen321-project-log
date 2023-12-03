package com.moengage.pushbase.internal;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import gv.n;
import hh.g;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: MoEPushReceiver.kt */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/moengage/pushbase/internal/MoEPushReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extras", "Lhs/k;", "handleNotificationDismiss", "handleNotification", "Landroid/content/Intent;", "intent", "onReceive", "", "tag", "Ljava/lang/String;", "<init>", "()V", "pushbase_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MoEPushReceiver extends BroadcastReceiver {
    private final String tag = "PushBase_6.6.0_MoEPushReceiver";

    /* compiled from: MoEPushReceiver.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" handleNotification() : ", MoEPushReceiver.this.tag);
        }
    }

    /* compiled from: MoEPushReceiver.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" handleNotificationDismiss() : Will try to dismiss notification.", MoEPushReceiver.this.tag);
        }
    }

    /* compiled from: MoEPushReceiver.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onReceive() : ", MoEPushReceiver.this.tag);
        }
    }

    /* compiled from: MoEPushReceiver.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f10217v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f10217v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return MoEPushReceiver.this.tag + " onReceive() : Action: " + ((Object) this.f10217v);
        }
    }

    /* compiled from: MoEPushReceiver.kt */
    /* loaded from: classes.dex */
    public static final class e extends k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onReceive() : Not a valid action type.", MoEPushReceiver.this.tag);
        }
    }

    /* compiled from: MoEPushReceiver.kt */
    /* loaded from: classes.dex */
    public static final class f extends k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onReceive() : ", MoEPushReceiver.this.tag);
        }
    }

    private final void handleNotification(Context context, Bundle bundle) {
        fj.e eVar;
        hh.a aVar = g.f17610d;
        g.a.b(0, new a(), 3);
        fj.e eVar2 = fj.e.f15075b;
        if (eVar2 == null) {
            synchronized (fj.e.class) {
                eVar = fj.e.f15075b;
                if (eVar == null) {
                    eVar = new fj.e();
                }
                fj.e.f15075b = eVar;
            }
            eVar2 = eVar;
        }
        eVar2.d(context, bundle);
    }

    private final void handleNotificationDismiss(Context context, Bundle bundle) {
        hh.a aVar = g.f17610d;
        g.a.b(0, new b(), 3);
        int i6 = bundle.getInt("MOE_ACTION_NOTIFICATION_AUTO_DISMISS", -1);
        if (i6 > 0) {
            Object systemService = context.getSystemService("notification");
            if (systemService != null) {
                ((NotificationManager) systemService).cancel(i6);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x000b, B:6:0x001e, B:8:0x002c, B:15:0x0039, B:17:0x0046, B:18:0x004a, B:20:0x0052, B:21:0x0056), top: B:26:0x000b }] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        boolean z10;
        i.g(context, "context");
        i.g(intent, "intent");
        try {
            hh.a aVar = g.f17610d;
            g.a.b(0, new c(), 3);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            String action = intent.getAction();
            g.a.b(0, new d(action), 3);
            if (action != null && !n.B0(action)) {
                z10 = false;
                if (!z10) {
                    return;
                }
                di.b.v(extras, this.tag);
                if (i.b(action, "MOE_ACTION_NOTIFICATION_AUTO_DISMISS")) {
                    handleNotificationDismiss(context, extras);
                    return;
                } else if (i.b(action, "MOE_ACTION_SHOW_NOTIFICATION")) {
                    handleNotification(context, extras);
                    return;
                } else {
                    g.a.b(0, new e(), 3);
                    return;
                }
            }
            z10 = true;
            if (!z10) {
            }
        } catch (Exception e10) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, e10, new f());
        }
    }
}
