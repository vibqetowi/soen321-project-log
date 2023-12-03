package fj;

import android.content.Context;
import android.os.Bundle;
import org.json.JSONObject;
/* compiled from: PushProcessor.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f15088a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15089b = "PushBase_6.6.0_PushProcessor";

    /* compiled from: PushProcessor.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" logNotificationClicked() : SDK Disabled.", n.this.f15089b);
        }
    }

    /* compiled from: PushProcessor.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" logNotificationClicked() : ", n.this.f15089b);
        }
    }

    /* compiled from: PushProcessor.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" serverSyncIfRequired() : Sync APIs if required.", n.this.f15089b);
        }
    }

    /* compiled from: PushProcessor.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f15094v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f15094v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return n.this.f15089b + " serverSyncIfRequired() : Request type: " + ((Object) this.f15094v);
        }
    }

    /* compiled from: PushProcessor.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" serverSyncIfRequired() : ", n.this.f15089b);
        }
    }

    public n(ih.p pVar) {
        this.f15088a = pVar;
    }

    public final void a(Context context, pj.b bVar) {
        kotlin.jvm.internal.i.g(context, "context");
        boolean parseBoolean = Boolean.parseBoolean(bVar.f28533i.getString("moe_enable_logs", "false"));
        fj.d.f15071a.getClass();
        ih.p pVar = this.f15088a;
        fj.d.b(context, pVar).o(parseBoolean);
        if (parseBoolean) {
            pg.h hVar = new pg.h(5, true);
            dh.a aVar = pVar.f20103b;
            aVar.getClass();
            aVar.f12859e = hVar;
        }
    }

    public final void b(Context context, Bundle bundle) {
        ej.b bVar;
        try {
            fj.d dVar = fj.d.f15071a;
            ih.p pVar = this.f15088a;
            dVar.getClass();
            boolean d10 = fj.d.b(context, pVar).d();
            boolean z10 = false;
            if (!d10) {
                hh.g.b(this.f15088a.f20105d, 0, new a(), 3);
                return;
            }
            ej.b bVar2 = ej.b.f14047b;
            if (bVar2 == null) {
                synchronized (ej.b.class) {
                    bVar = ej.b.f14047b;
                    if (bVar == null) {
                        bVar = new ej.b();
                    }
                    ej.b.f14047b = bVar;
                }
                bVar2 = bVar;
            }
            if (!bVar2.b(bundle)) {
                return;
            }
            String string = bundle.getString("gcm_campaign_id", "");
            if ((string == null || gv.n.B0(string)) ? true : true) {
                return;
            }
            kc.f.R(context, this.f15088a, new o(bundle, this.f15088a).a());
            p.c(context, bundle, this.f15088a);
        } catch (Throwable th2) {
            this.f15088a.f20105d.a(1, th2, new b());
        }
    }

    public final void c(Context context, Bundle pushPayload) {
        String string;
        ih.p pVar = this.f15088a;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(pushPayload, "pushPayload");
        try {
            hh.g.b(pVar.f20105d, 0, new c(), 3);
            if (!pushPayload.containsKey("moe_sync") || (string = pushPayload.getString("moe_sync")) == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.length() != 0 && jSONObject.has("type")) {
                String string2 = jSONObject.getString("type");
                hh.g.b(pVar.f20105d, 0, new d(string2), 3);
                if (kotlin.jvm.internal.i.b(string2, "config")) {
                    qg.w.f29578a.getClass();
                    qg.g.b(qg.w.d(pVar), context);
                } else if (kotlin.jvm.internal.i.b(string2, "data")) {
                    yg.n.b(context, pVar);
                }
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new e());
        }
    }
}
