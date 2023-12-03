package tj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.moengage.pushbase.internal.MoEPushWorker;
import com.theinnerhour.b2b.R;
import org.json.JSONObject;
/* compiled from: TemplateBuilder.kt */
/* loaded from: classes.dex */
public final class d0 {

    /* compiled from: TemplateBuilder.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ uj.o f33076v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uj.o oVar) {
            super(0);
            this.f33076v = oVar;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("RichPush_4.3.2_TemplateBuilder buildBigTextStyleNotification() : Building big text notification. ");
            d0.this.getClass();
            sb2.append(this.f33076v);
            return sb2.toString();
        }
    }

    /* compiled from: TemplateBuilder.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            d0.this.getClass();
            return kotlin.jvm.internal.i.n(" buildBigTextStyleNotification() :", "RichPush_4.3.2_TemplateBuilder");
        }
    }

    public static void c(Context context, jj.b metaData, uj.o oVar) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        Intent intent = new Intent(context, MoEPushWorker.class);
        intent.putExtras(metaData.f22066a.f28533i);
        String templateName = oVar.f34212a;
        kotlin.jvm.internal.i.g(templateName, "templateName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateName", templateName);
        jSONObject.put("cardId", -1);
        jSONObject.put("widgetId", -1);
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "templateTrackingMetaToJson(meta).toString()");
        intent.putExtra("moe_template_meta", jSONObject2);
        int i6 = metaData.f22068c;
        intent.putExtra("MOE_NOTIFICATION_ID", i6);
        intent.setAction("ACTION_NOTIFICATION_CLEARED");
        metaData.f22067b.D.deleteIntent = di.b.l(context, i6 | 501, intent);
    }

    public final boolean a(Context context, uj.o oVar, jj.b bVar, ih.p pVar) {
        RemoteViews remoteViews;
        uj.j jVar;
        int i6;
        hh.g gVar = pVar.f20105d;
        try {
            hh.g.b(gVar, 0, new a(oVar), 3);
            if (sj.z.a()) {
                remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.moe_rich_push_stylized_basic_big_text_decorated_style);
            } else {
                remoteViews = new RemoteViews(context.getPackageName(), sj.z.c(R.layout.moe_rich_push_stylized_basic_big_text, R.layout.moe_rich_push_stylized_basic_big_text_big_layout, pVar));
            }
            l0 l0Var = new l0(pVar);
            uj.f fVar = oVar.f34215d;
            if (fVar == null) {
                jVar = null;
            } else {
                jVar = fVar.f34193b;
            }
            l0.l(jVar, remoteViews, R.id.expandedRootView);
            boolean a10 = sj.z.a();
            boolean z10 = bVar.f22066a.f28532h.f28521e;
            if (!a10) {
                i6 = 13;
            } else if (!z10) {
                i6 = 11;
            } else {
                i6 = 9;
            }
            remoteViews.setInt(R.id.message, "setMaxLines", i6);
            boolean a11 = sj.z.a();
            pj.b bVar2 = bVar.f22066a;
            if (a11) {
                l0Var.f(remoteViews, R.id.expandedRootView, oVar, bVar);
                if (bVar2.f28532h.f28521e) {
                    l0.q(remoteViews, oVar.f34219i, sj.z.a());
                }
            } else {
                l0Var.r(context, remoteViews, bVar, oVar);
            }
            l0.p(remoteViews, oVar.f34213b, sj.z.b(context), oVar.f34218h);
            l0Var.k(remoteViews, oVar, bVar2);
            if (bVar2.f28532h.f28521e) {
                l0.c(remoteViews, context, bVar);
            }
            l0.g(context, remoteViews, R.id.expandedRootView, oVar, bVar);
            bVar.f22067b.f14679y = remoteViews;
            return true;
        } catch (Throwable th2) {
            gVar.a(1, th2, new b());
            return false;
        }
    }

    public final void b(boolean z10, uj.o oVar, jj.b metaData, ih.p pVar, uj.k kVar) {
        int o10;
        String str;
        String str2;
        boolean z11;
        int i6;
        int i10;
        int o11;
        if (z10) {
            kotlin.jvm.internal.i.g(metaData, "metaData");
            pj.b bVar = metaData.f22066a;
            if (bVar.f28533i.getBoolean("moe_re_notify")) {
                o10 = bVar.f28533i.getInt("timerAlarmId");
            } else {
                o10 = di.b.o();
            }
            kVar.f34207h = o10;
            uj.f fVar = oVar.f34215d;
            String str3 = null;
            if (fVar == null) {
                str = null;
            } else {
                str = fVar.f34192a;
            }
            boolean b10 = kotlin.jvm.internal.i.b(str, "timerWithProgressbar");
            hh.g logger = pVar.f20105d;
            if (b10) {
                if (bVar.f28533i.getBoolean("moe_re_notify")) {
                    o11 = bVar.f28533i.getInt("progressAlarmId");
                } else {
                    o11 = di.b.o();
                }
                kVar.f34208i = o11;
                hh.g.b(logger, 0, new j0(this, kVar), 3);
            }
            bVar.f28533i.putInt("timerAlarmId", kVar.f34207h);
            int i11 = kVar.f34208i;
            Bundle bundle = bVar.f28533i;
            bundle.putInt("progressAlarmId", i11);
            if (oVar instanceof uj.q) {
                kotlin.jvm.internal.i.g(logger, "logger");
                if (fVar == null) {
                    str2 = null;
                } else {
                    str2 = fVar.f34192a;
                }
                uj.h hVar = oVar.f34216e;
                if (hVar != null) {
                    str3 = hVar.f34195a;
                }
                if (str2 != null && str3 != null && (kotlin.jvm.internal.i.b(str2, "timerWithProgressbar") || kotlin.jvm.internal.i.b(str3, "timerWithProgressbar"))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    long j10 = kVar.f34201a;
                    if (j10 > -1) {
                        if (bundle.getBoolean("moe_re_notify") && !bundle.getString("moe_n_r_s", "").equals("moe_source_r_l_s")) {
                            long j11 = bundle.getInt("progress_update_interval");
                            int i12 = bundle.getInt("progress_increment_value");
                            int i13 = bundle.getInt("current_progress_value");
                            int i14 = bundle.getInt("max_progress_updates_count");
                            int i15 = bundle.getInt("current_progress_updates_count");
                            kVar.f34203c = j11;
                            kVar.f34204d = i12;
                            kVar.f34205e = i13;
                            kVar.f = i14;
                            kVar.f34206g = i15;
                            return;
                        }
                        long j12 = kVar.f34202b.f34220a;
                        long j13 = 1000;
                        long j14 = j12 - (j10 / j13);
                        if (j12 >= 900 && j12 <= 1800) {
                            i6 = 10;
                            i10 = 10;
                        } else if (j12 > 1800 && j12 <= 43200) {
                            i6 = 25;
                            i10 = 4;
                        } else {
                            hh.g.b(logger, 0, sj.t.f31632u, 3);
                            i6 = -1;
                            i10 = -1;
                        }
                        if (i6 != -1 && i10 != -1) {
                            long j15 = j12 / i6;
                            int i16 = (int) ((j14 / j15) * i10);
                            kVar.f34203c = j13 * j15;
                            kVar.f34204d = i10;
                            kVar.f34205e = i16;
                            kVar.f = i6;
                            kVar.f34206g = i16 / i6;
                        }
                        hh.g.b(logger, 0, new sj.u(kVar), 3);
                        bundle.remove("moe_n_r_s");
                    }
                }
            }
        }
    }
}
