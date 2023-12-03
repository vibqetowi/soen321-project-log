package com.moengage.pushbase.internal;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.moengage.pushbase.push.PushMessageListener;
import com.theinnerhour.b2b.utils.SessionManager;
import fj.e;
import fj.t;
import fj.y;
import hh.g;
import ih.p;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import org.json.JSONArray;
import org.json.JSONObject;
import qg.g0;
import qg.w;
/* compiled from: MoEPushWorker.kt */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/moengage/pushbase/internal/MoEPushWorker;", "Landroid/app/IntentService;", "Landroid/os/Bundle;", "extras", "Lih/p;", "sdkInstance", "Lhs/k;", "dismissNotification", "handleNotificationCleared", "Landroid/content/Intent;", "intent", "onHandleIntent", "", "tag", "Ljava/lang/String;", "<init>", "()V", "pushbase_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MoEPushWorker extends IntentService {
    private final String tag;

    /* compiled from: MoEPushWorker.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" dismissNotification() : ", MoEPushWorker.this.tag);
        }
    }

    /* compiled from: MoEPushWorker.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" handleNotificationCleared() : ", MoEPushWorker.this.tag);
        }
    }

    /* compiled from: MoEPushWorker.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f10223v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f10223v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return MoEPushWorker.this.tag + " onHandleIntent() : Action: " + this.f10223v;
        }
    }

    /* compiled from: MoEPushWorker.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onHandleIntent() : ", MoEPushWorker.this.tag);
        }
    }

    public MoEPushWorker() {
        super("RegistrationIntentService");
        this.tag = "PushBase_6.6.0_MoEPushWorker";
    }

    private final void dismissNotification(Bundle bundle, p pVar) {
        g.b(pVar.f20105d, 0, new a(), 3);
        Context applicationContext = getApplicationContext();
        i.f(applicationContext, "applicationContext");
        y.d(applicationContext, bundle, pVar);
        JSONArray e10 = y.e(bundle);
        if (e10.length() == 0) {
            return;
        }
        JSONObject jSONObject = e10.getJSONObject(0);
        i.f(jSONObject, "actions.getJSONObject(0)");
        i.f(jSONObject.getString(SessionManager.KEY_NAME), "actionJson.getString(NAME)");
        int i6 = jSONObject.getInt("value");
        if (i6 == -1) {
            return;
        }
        Object systemService = getSystemService("notification");
        if (systemService != null) {
            ((NotificationManager) systemService).cancel(i6);
            Context applicationContext2 = getApplicationContext();
            i.f(applicationContext2, "applicationContext");
            try {
                ng.c cVar = new ng.c();
                cVar.a(bundle.getString("gcm_campaign_id"), "gcm_campaign_id");
                fj.p.a(bundle, cVar, pVar);
                String appId = (String) pVar.f20102a.f5133c;
                i.g(appId, "appId");
                p b10 = g0.b(appId);
                if (b10 != null) {
                    w.f29578a.getClass();
                    w.d(b10).c(applicationContext2, "MOE_NOTIFICATION_DISMISSED", cVar);
                }
            } catch (Throwable th2) {
                pVar.f20105d.a(1, th2, t.f15109u);
            }
            nj.a aVar = nj.c.f26377a;
            Context applicationContext3 = getApplicationContext();
            i.f(applicationContext3, "applicationContext");
            nj.c.a(applicationContext3, bundle, pVar);
            bundle.putString("action_type", "dismiss_button");
            if (ej.b.f14047b == null) {
                synchronized (ej.b.class) {
                    ej.b bVar = ej.b.f14047b;
                    if (bVar == null) {
                        bVar = new ej.b();
                    }
                    ej.b.f14047b = bVar;
                }
            }
            PushMessageListener a10 = ej.b.a(pVar);
            i.f(getApplicationContext(), "applicationContext");
            g.b(a10.f10242h.f20105d, 0, new rj.y(a10), 3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    private final void handleNotificationCleared(Bundle bundle, p pVar) {
        g.b(pVar.f20105d, 0, new b(), 3);
        Context applicationContext = getApplicationContext();
        i.f(applicationContext, "applicationContext");
        y.d(applicationContext, bundle, pVar);
        bundle.putString("action_type", "swipe");
        if (ej.b.f14047b == null) {
            synchronized (ej.b.class) {
                ej.b bVar = ej.b.f14047b;
                if (bVar == null) {
                    bVar = new ej.b();
                }
                ej.b.f14047b = bVar;
            }
        }
        PushMessageListener a10 = ej.b.a(pVar);
        i.f(getApplicationContext(), "applicationContext");
        g.b(a10.f10242h.f20105d, 0, new rj.y(a10), 3);
        nj.a aVar = nj.c.f26377a;
        Context applicationContext2 = getApplicationContext();
        i.f(applicationContext2, "applicationContext");
        nj.c.a(applicationContext2, bundle, pVar);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras == null || extras.isEmpty()) {
                return;
            }
            ca.a.Z0(extras);
            if (e.f15075b == null) {
                synchronized (e.class) {
                    e eVar = e.f15075b;
                    if (eVar == null) {
                        eVar = new e();
                    }
                    e.f15075b = eVar;
                }
            }
            p c10 = e.c(extras);
            if (c10 == null) {
                return;
            }
            di.b.w(c10.f20105d, this.tag, extras);
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            g.b(c10.f20105d, 0, new c(action), 3);
            if (i.b(action, "ACTION_NOTIFICATION_CLEARED")) {
                handleNotificationCleared(extras, c10);
            } else if (i.b(action, "ACTION_NOTIFICATION_CLOSE_CLICK")) {
                dismissNotification(extras, c10);
            }
        } catch (Exception e10) {
            hh.a aVar = g.f17610d;
            g.a.a(1, e10, new d());
        }
    }
}
