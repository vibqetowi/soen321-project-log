package tj;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import com.theinnerhour.b2b.R;
import java.util.List;
/* compiled from: CollapsedTemplateBuilder.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f33089a;

    /* renamed from: b  reason: collision with root package name */
    public final uj.o f33090b;

    /* renamed from: c  reason: collision with root package name */
    public final jj.b f33091c;

    /* renamed from: d  reason: collision with root package name */
    public final ih.p f33092d;

    /* renamed from: e  reason: collision with root package name */
    public final uj.k f33093e;
    public final String f;

    /* compiled from: CollapsedTemplateBuilder.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            i iVar = i.this;
            sb2.append(iVar.f);
            sb2.append(" build() : Given collapsed type not supported. Type: ");
            sb2.append(iVar.f33090b.f34215d.f34192a);
            return sb2.toString();
        }
    }

    public i(Context context, ih.p pVar, jj.b metaData, uj.k kVar, uj.o oVar) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        this.f33089a = context;
        this.f33090b = oVar;
        this.f33091c = metaData;
        this.f33092d = pVar;
        this.f33093e = kVar;
        this.f = "RichPush_4.3.2_CollapsedTemplateBuilder";
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e1 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z10;
        RemoteViews remoteViews;
        boolean z11;
        boolean z12;
        int i6;
        boolean z13;
        int i10;
        RemoteViews remoteViews2;
        boolean i11;
        uj.o oVar = this.f33090b;
        uj.f fVar = oVar.f34215d;
        if (fVar == null) {
            return false;
        }
        String str = fVar.f34192a;
        int hashCode = str.hashCode();
        jj.b bVar = this.f33091c;
        Context context = this.f33089a;
        ih.p pVar = this.f33092d;
        switch (hashCode) {
            case -283517494:
                if (str.equals("stylizedBasic")) {
                    c0 c0Var = new c0(context, oVar, bVar, pVar);
                    uj.o oVar2 = c0Var.f33070b;
                    ih.p pVar2 = c0Var.f33072d;
                    try {
                        hh.g gVar = pVar2.f20105d;
                        hh.g logger = pVar2.f20105d;
                        hh.g.b(gVar, 0, new v(c0Var), 3);
                        kotlin.jvm.internal.i.g(logger, "logger");
                        qh.a defaultText = oVar2.f34213b;
                        kotlin.jvm.internal.i.g(defaultText, "defaultText");
                        if ((!gv.n.B0(defaultText.f29590b)) && (!gv.n.B0(defaultText.f29591c))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            hh.g.b(logger, 1, new w(c0Var), 2);
                            return false;
                        }
                        uj.f fVar2 = oVar2.f34215d;
                        if (fVar2 == null) {
                            return false;
                        }
                        boolean a10 = sj.z.a();
                        Context context2 = c0Var.f33069a;
                        if (a10) {
                            remoteViews = new RemoteViews(context2.getPackageName(), (int) R.layout.moe_rich_push_stylized_basic_collapsed_layout_decorated_style);
                        } else if (Build.VERSION.SDK_INT >= 23) {
                            remoteViews = new RemoteViews(context2.getPackageName(), sj.z.c(R.layout.moe_rich_push_stylized_basic_collapsed, R.layout.moe_rich_push_stylized_basic_collapsed_layout_big, pVar2));
                        } else {
                            remoteViews = new RemoteViews(context2.getPackageName(), (int) R.layout.moe_rich_push_stylized_basic_collapsed_below_m);
                        }
                        l0 l0Var = new l0(pVar2);
                        l0.l(fVar2.f34193b, remoteViews, R.id.collapsedRootView);
                        l0.p(remoteViews, oVar2.f34213b, sj.z.b(context2), oVar2.f34218h);
                        boolean a11 = sj.z.a();
                        jj.b bVar2 = c0Var.f33071c;
                        if (a11) {
                            l0Var.f(remoteViews, R.id.collapsedRootView, oVar2, bVar2);
                        } else {
                            l0Var.r(context2, remoteViews, bVar2, oVar2);
                            if (bVar2.f22066a.f28532h.f28521e) {
                                l0.c(remoteViews, context2, bVar2);
                            }
                        }
                        l0Var.k(remoteViews, oVar2, bVar2.f22066a);
                        l0.g(context2, remoteViews, R.id.collapsedRootView, oVar2, bVar2);
                        bVar2.f22067b.f14678x = remoteViews;
                        return true;
                    } catch (Throwable th2) {
                        pVar2.f20105d.a(1, th2, new x(c0Var));
                        return false;
                    }
                }
                break;
            case 110364485:
                if (str.equals("timer")) {
                    if (!(oVar instanceof uj.q)) {
                        return false;
                    }
                    s0 s0Var = new s0(this.f33089a, (uj.q) oVar, this.f33091c, this.f33092d, this.f33093e);
                    uj.q qVar = s0Var.f33141b;
                    if (qVar.f34215d != null) {
                        ih.p pVar3 = s0Var.f33143d;
                        kotlin.jvm.internal.i.g(pVar3.f20105d, "logger");
                        qh.a defaultText2 = qVar.f34213b;
                        kotlin.jvm.internal.i.g(defaultText2, "defaultText");
                        if ((!gv.n.B0(defaultText2.f29590b)) && (!gv.n.B0(defaultText2.f29591c))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        hh.g gVar2 = pVar3.f20105d;
                        if (!z12) {
                            hh.g.b(gVar2, 2, new q0(s0Var), 2);
                        } else {
                            hh.g.b(gVar2, 0, new r0(s0Var), 3);
                            uj.f fVar3 = qVar.f34215d;
                            if (!fVar3.f34194c.isEmpty()) {
                                Context context3 = s0Var.f33140a;
                                String packageName = context3.getPackageName();
                                if (sj.z.a()) {
                                    i6 = R.layout.moe_rich_push_timer_collapsed_layout_decorated_style;
                                } else {
                                    i6 = R.layout.moe_rich_push_timer_collapsed_layout;
                                }
                                RemoteViews remoteViews3 = new RemoteViews(packageName, i6);
                                l0 l0Var2 = s0Var.f33145g;
                                l0Var2.getClass();
                                l0.o(remoteViews3, defaultText2);
                                List<uj.a> list = fVar3.f34194c;
                                if (!list.isEmpty()) {
                                    for (uj.r rVar : list.get(0).f34184b) {
                                        if (rVar.f34224b == 1 && (rVar instanceof uj.d)) {
                                            s0Var.c(remoteViews3, (uj.d) rVar);
                                        }
                                    }
                                }
                                l0Var2.getClass();
                                jj.b bVar3 = s0Var.f33142c;
                                l0.g(context3, remoteViews3, R.id.collapsedRootView, qVar, bVar3);
                                bVar3.f22067b.f14678x = remoteViews3;
                                z11 = true;
                                if (z11) {
                                    return false;
                                }
                                return true;
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                }
                break;
            case 1346137115:
                if (str.equals("timerWithProgressbar")) {
                    if (!(oVar instanceof uj.q)) {
                        return false;
                    }
                    s0 s0Var2 = new s0(this.f33089a, (uj.q) oVar, this.f33091c, this.f33092d, this.f33093e);
                    uj.q qVar2 = s0Var2.f33141b;
                    if (qVar2.f34215d != null) {
                        Context context4 = s0Var2.f33140a;
                        boolean b10 = sj.q.b(context4);
                        ih.p pVar4 = s0Var2.f33143d;
                        if (!b10) {
                            hh.g.b(pVar4.f20105d, 2, new n0(s0Var2), 2);
                        } else {
                            qh.a aVar = qVar2.f34213b;
                            if (gv.n.B0(aVar.f29590b)) {
                                hh.g.b(pVar4.f20105d, 2, new o0(s0Var2), 2);
                            } else {
                                hh.g.b(pVar4.f20105d, 0, new p0(s0Var2), 3);
                                uj.f fVar4 = qVar2.f34215d;
                                if (!fVar4.f34194c.isEmpty()) {
                                    String packageName2 = context4.getPackageName();
                                    if (sj.z.a()) {
                                        i10 = R.layout.moe_rich_push_progressbar_collapsed_layout_decroated_style;
                                    } else {
                                        i10 = R.layout.moe_rich_push_progressbar_collapsed_layout;
                                    }
                                    RemoteViews remoteViews4 = new RemoteViews(packageName2, i10);
                                    l0 l0Var3 = s0Var2.f33145g;
                                    l0Var3.getClass();
                                    l0.o(remoteViews4, aVar);
                                    List<uj.a> list2 = fVar4.f34194c;
                                    if (!list2.isEmpty()) {
                                        for (uj.r rVar2 : list2.get(0).f34184b) {
                                            int i12 = rVar2.f34224b;
                                            if (i12 == 1 && (rVar2 instanceof uj.d)) {
                                                s0Var2.c(remoteViews4, (uj.d) rVar2);
                                            } else if (i12 == 2 && (rVar2 instanceof uj.m)) {
                                                s0Var2.d(remoteViews4);
                                            }
                                        }
                                    }
                                    l0Var3.getClass();
                                    jj.b bVar4 = s0Var2.f33142c;
                                    l0.g(context4, remoteViews4, R.id.collapsedRootView, qVar2, bVar4);
                                    bVar4.f22067b.f14678x = remoteViews4;
                                    z13 = true;
                                    if (z13) {
                                        return false;
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                    z13 = false;
                    if (z13) {
                    }
                }
                break;
            case 1670997095:
                if (str.equals("imageBanner")) {
                    u uVar = new u(context, oVar, bVar, pVar);
                    uj.o oVar3 = uVar.f33156b;
                    ih.p pVar5 = uVar.f33158d;
                    try {
                        hh.g.b(pVar5.f20105d, 0, new k(uVar), 3);
                        uj.f fVar5 = oVar3.f34215d;
                        if (fVar5 != null && (fVar5 instanceof uj.e)) {
                            hh.g.b(pVar5.f20105d, 0, new l(uVar, fVar5), 3);
                            boolean a12 = sj.z.a();
                            Context context5 = uVar.f33155a;
                            if (a12) {
                                remoteViews2 = new RemoteViews(context5.getPackageName(), (int) R.layout.moe_rich_push_image_banner_collapsed_layout_decorated_style);
                            } else if (Build.VERSION.SDK_INT >= 23) {
                                remoteViews2 = new RemoteViews(context5.getPackageName(), sj.z.c(R.layout.moe_rich_push_image_banner_collapsed, R.layout.moe_rich_push_image_banner_collapsed_layout_big, pVar5));
                            } else {
                                remoteViews2 = new RemoteViews(context5.getPackageName(), (int) R.layout.moe_rich_push_image_banner_collapsed_below_m);
                            }
                            if (((uj.e) fVar5).f34194c.isEmpty()) {
                                return false;
                            }
                            l0 l0Var4 = new l0(pVar5);
                            l0.l(((uj.e) fVar5).f34193b, remoteViews2, R.id.collapsedRootView);
                            boolean a13 = sj.z.a();
                            jj.b bVar5 = uVar.f33157c;
                            if (a13) {
                                bVar5.f22067b.k("");
                            } else {
                                uVar.a(l0Var4, remoteViews2, ((uj.e) fVar5).f34191d);
                            }
                            uj.a aVar2 = ((uj.e) fVar5).f34194c.get(0);
                            if (aVar2.f34184b.isEmpty()) {
                                return false;
                            }
                            uj.r rVar3 = aVar2.f34184b.get(0);
                            if (!kotlin.jvm.internal.i.b("image", rVar3.f34223a)) {
                                return false;
                            }
                            i11 = l0Var4.i(uVar.f33155a, uVar.f33157c, uVar.f33156b, remoteViews2, (uj.i) rVar3, aVar2, null);
                            if (!i11) {
                                return false;
                            }
                            l0.g(context5, remoteViews2, R.id.collapsedRootView, oVar3, uVar.f33157c);
                            bVar5.f22067b.f14678x = remoteViews2;
                            return true;
                        }
                        return false;
                    } catch (Throwable th3) {
                        pVar5.f20105d.a(1, th3, new m(uVar));
                        return false;
                    }
                }
                break;
        }
        hh.g.b(pVar.f20105d, 0, new a(), 3);
        return false;
    }
}
