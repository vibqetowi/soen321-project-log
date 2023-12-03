package tj;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.widget.RemoteViews;
import com.theinnerhour.b2b.R;
/* compiled from: TimerTemplateBuilder.kt */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f33140a;

    /* renamed from: b  reason: collision with root package name */
    public final uj.q f33141b;

    /* renamed from: c  reason: collision with root package name */
    public final jj.b f33142c;

    /* renamed from: d  reason: collision with root package name */
    public final ih.p f33143d;

    /* renamed from: e  reason: collision with root package name */
    public final uj.k f33144e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final l0 f33145g;

    /* compiled from: TimerTemplateBuilder.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" buildExpandedProgressTemplate() : Does not have permission to schedule exact alarm.", s0.this.f);
        }
    }

    /* compiled from: TimerTemplateBuilder.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" buildExpandedProgressTemplate() : Does not have minimum text.", s0.this.f);
        }
    }

    /* compiled from: TimerTemplateBuilder.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            s0 s0Var = s0.this;
            sb2.append(s0Var.f);
            sb2.append(" buildExpandedProgressTemplate() : Template: ");
            sb2.append(s0Var.f33141b.f34216e);
            return sb2.toString();
        }
    }

    /* compiled from: TimerTemplateBuilder.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" buildExpandedTimerTemplate() : Does not have minimum text.", s0.this.f);
        }
    }

    /* compiled from: TimerTemplateBuilder.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            s0 s0Var = s0.this;
            sb2.append(s0Var.f);
            sb2.append(" buildExpandedTimerTemplate() : Template: ");
            sb2.append(s0Var.f33141b.f34216e);
            return sb2.toString();
        }
    }

    /* compiled from: TimerTemplateBuilder.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f33152v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f33152v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return s0.this.f + " checkAndAddChronometer(): format: " + this.f33152v;
        }
    }

    public s0(Context context, uj.q template, jj.b metaData, ih.p sdkInstance, uj.k progressProperties) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(template, "template");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        kotlin.jvm.internal.i.g(progressProperties, "progressProperties");
        this.f33140a = context;
        this.f33141b = template;
        this.f33142c = metaData;
        this.f33143d = sdkInstance;
        this.f33144e = progressProperties;
        this.f = "RichPush_4.3.2_TimerTemplateBuilder";
        this.f33145g = new l0(sdkInstance);
    }

    public static void e(RemoteViews remoteViews, boolean z10, boolean z11) {
        int i6;
        int i10;
        if (sj.z.a()) {
            if (z11) {
                i10 = 2;
            } else if (z10) {
                i10 = 9;
            } else {
                i10 = 11;
            }
            remoteViews.setInt(R.id.message, "setMaxLines", i10);
        } else if (z11) {
            remoteViews.setBoolean(R.id.message, "setSingleLine", true);
            remoteViews.setInt(R.id.message, "setMaxLines", 1);
        } else {
            remoteViews.setBoolean(R.id.message, "setSingleLine", false);
            if (z10) {
                i6 = 10;
            } else {
                i6 = 12;
            }
            remoteViews.setInt(R.id.message, "setMaxLines", i6);
        }
    }

    public final boolean a() {
        boolean z10;
        int i6;
        l0 l0Var;
        RemoteViews remoteViews;
        RemoteViews remoteViews2;
        uj.q qVar = this.f33141b;
        boolean z11 = false;
        if (qVar.f34216e == null) {
            return false;
        }
        Context context = this.f33140a;
        boolean b10 = sj.q.b(context);
        ih.p pVar = this.f33143d;
        if (!b10) {
            hh.g.b(pVar.f20105d, 2, new a(), 2);
            return false;
        }
        qh.a aVar = qVar.f34213b;
        if (gv.n.B0(aVar.f29590b)) {
            hh.g.b(pVar.f20105d, 2, new b(), 2);
            return false;
        }
        hh.g.b(pVar.f20105d, 0, new c(), 3);
        uj.h hVar = qVar.f34216e;
        if (hVar.f34198d.isEmpty()) {
            return false;
        }
        boolean z12 = !hVar.f34197c.isEmpty();
        jj.b bVar = this.f33142c;
        if (!z12 && !bVar.f22066a.f28532h.f28521e) {
            z10 = false;
        } else {
            z10 = true;
        }
        String packageName = context.getPackageName();
        if (sj.z.a()) {
            if (z10) {
                i6 = R.layout.moe_rich_push_progressbar_expanded_with_action_buttons_decorated_style;
            } else {
                i6 = R.layout.moe_rich_push_progressbar_expanded_without_action_buttons_decorated_style;
            }
        } else if (z10) {
            i6 = R.layout.moe_rich_push_progressbar_expanded_with_action_buttons;
        } else {
            i6 = R.layout.moe_rich_push_progressbar_expanded_without_action_buttons;
        }
        RemoteViews remoteViews3 = new RemoteViews(packageName, i6);
        if (hVar.f34198d.isEmpty() && hVar.f34197c.isEmpty()) {
            return false;
        }
        l0 l0Var2 = this.f33145g;
        l0Var2.getClass();
        l0.o(remoteViews3, aVar);
        if (z10) {
            l0Var = l0Var2;
            remoteViews = remoteViews3;
            this.f33145g.b(this.f33140a, bVar, qVar, remoteViews3, qVar.f34216e.f34197c, bVar.f22066a.f28532h.f28521e);
        } else {
            l0Var = l0Var2;
            remoteViews = remoteViews3;
        }
        if (!hVar.f34198d.isEmpty()) {
            uj.a aVar2 = hVar.f34198d.get(0);
            for (uj.r rVar : aVar2.f34184b) {
                if (rVar.f34224b == 0 && kotlin.jvm.internal.i.b(rVar.f34223a, "image")) {
                    z11 = this.f33145g.i(this.f33140a, this.f33142c, this.f33141b, remoteViews, (uj.i) rVar, aVar2, null);
                } else {
                    int i10 = rVar.f34224b;
                    if (i10 == 1 && (rVar instanceof uj.d)) {
                        remoteViews2 = remoteViews;
                        c(remoteViews2, (uj.d) rVar);
                    } else {
                        remoteViews2 = remoteViews;
                        if (i10 == 2 && (rVar instanceof uj.m)) {
                            d(remoteViews2);
                        }
                    }
                    remoteViews = remoteViews2;
                }
            }
        }
        RemoteViews remoteViews4 = remoteViews;
        e(remoteViews4, z10, z11);
        l0Var.getClass();
        l0.g(context, remoteViews4, R.id.expandedRootView, qVar, bVar);
        bVar.f22067b.f14679y = remoteViews4;
        return true;
    }

    public final boolean b() {
        boolean z10;
        boolean z11;
        int i6;
        l0 l0Var;
        Context context;
        RemoteViews remoteViews;
        uj.q qVar = this.f33141b;
        boolean z12 = false;
        if (qVar.f34216e == null) {
            return false;
        }
        ih.p pVar = this.f33143d;
        hh.g logger = pVar.f20105d;
        kotlin.jvm.internal.i.g(logger, "logger");
        qh.a defaultText = qVar.f34213b;
        kotlin.jvm.internal.i.g(defaultText, "defaultText");
        if ((!gv.n.B0(defaultText.f29590b)) && (!gv.n.B0(defaultText.f29591c))) {
            z10 = true;
        } else {
            z10 = false;
        }
        hh.g gVar = pVar.f20105d;
        if (!z10) {
            hh.g.b(gVar, 2, new d(), 2);
            return false;
        }
        hh.g.b(gVar, 0, new e(), 3);
        uj.h hVar = qVar.f34216e;
        if (hVar.f34198d.isEmpty()) {
            return false;
        }
        boolean z13 = !hVar.f34197c.isEmpty();
        jj.b bVar = this.f33142c;
        if (!z13 && !bVar.f22066a.f28532h.f28521e) {
            z11 = false;
        } else {
            z11 = true;
        }
        Context context2 = this.f33140a;
        String packageName = context2.getPackageName();
        if (sj.z.a()) {
            if (z11) {
                i6 = R.layout.moe_rich_push_timer_expanded_decorated_style_with_action_buttons;
            } else {
                i6 = R.layout.moe_rich_push_timer_expanded_decorated_style_without_action_buttons;
            }
        } else if (z11) {
            i6 = R.layout.moe_rich_push_timer_expanded_with_action_buttons;
        } else {
            i6 = R.layout.moe_rich_push_timer_expanded_without_action_buttons;
        }
        RemoteViews remoteViews2 = new RemoteViews(packageName, i6);
        if (hVar.f34198d.isEmpty() && hVar.f34197c.isEmpty()) {
            return false;
        }
        l0 l0Var2 = this.f33145g;
        l0Var2.getClass();
        l0.o(remoteViews2, defaultText);
        if (z11) {
            l0Var = l0Var2;
            this.f33145g.b(this.f33140a, bVar, qVar, remoteViews2, qVar.f34216e.f34197c, bVar.f22066a.f28532h.f28521e);
        } else {
            l0Var = l0Var2;
        }
        if (!hVar.f34198d.isEmpty()) {
            uj.a aVar = hVar.f34198d.get(0);
            for (uj.r rVar : aVar.f34184b) {
                if (rVar.f34224b == 0 && kotlin.jvm.internal.i.b(rVar.f34223a, "image")) {
                    context = context2;
                    remoteViews = remoteViews2;
                    z12 = this.f33145g.i(this.f33140a, this.f33142c, this.f33141b, remoteViews, (uj.i) rVar, aVar, null);
                } else {
                    context = context2;
                    remoteViews = remoteViews2;
                    if (rVar.f34224b == 1 && (rVar instanceof uj.d)) {
                        c(remoteViews, (uj.d) rVar);
                    }
                }
                remoteViews2 = remoteViews;
                context2 = context;
            }
        }
        RemoteViews remoteViews3 = remoteViews2;
        e(remoteViews3, z11, z12);
        l0Var.getClass();
        l0.g(context2, remoteViews3, R.id.expandedRootView, qVar, bVar);
        bVar.f22067b.f14679y = remoteViews3;
        return true;
    }

    public final void c(RemoteViews remoteViews, uj.d dVar) {
        uj.c cVar;
        boolean z10;
        remoteViews.setChronometerCountDown(R.id.moEChronometer, true);
        this.f33145g.getClass();
        uj.n nVar = dVar.f34226d;
        if (!(nVar instanceof uj.c)) {
            cVar = null;
        } else {
            cVar = (uj.c) nVar;
        }
        if (cVar != null) {
            String str = cVar.f34190b;
            if (str != null && !gv.n.B0(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                remoteViews.setTextColor(R.id.moEChronometer, Color.parseColor(str));
            }
        }
        String str2 = t0.f33154a.get(dVar.f.f34189e);
        if (str2 != null) {
            hh.g.b(this.f33143d.f20105d, 0, new f(str2), 3);
            long elapsedRealtime = this.f33144e.f34201a + SystemClock.elapsedRealtime();
            if (elapsedRealtime != -1) {
                remoteViews.setChronometer(R.id.moEChronometer, elapsedRealtime, str2, true);
                remoteViews.setViewVisibility(R.id.chronometerLayout, 0);
                remoteViews.setViewVisibility(R.id.moEChronometer, 0);
            }
        }
    }

    public final void d(RemoteViews remoteViews) {
        uj.k kVar = this.f33144e;
        if (kVar.f34205e <= -1) {
            remoteViews.setViewVisibility(R.id.moEProgressbar, 8);
            return;
        }
        remoteViews.setViewVisibility(R.id.chronometerLayout, 0);
        remoteViews.setViewVisibility(R.id.moEProgressbar, 0);
        remoteViews.setProgressBar(R.id.moEProgressbar, 100, kVar.f34205e, false);
    }
}
