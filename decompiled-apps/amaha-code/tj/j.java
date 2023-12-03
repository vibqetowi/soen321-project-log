package tj;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: ExpandedTemplateBuilder.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Context f33096a;

    /* renamed from: b  reason: collision with root package name */
    public final uj.o f33097b;

    /* renamed from: c  reason: collision with root package name */
    public final jj.b f33098c;

    /* renamed from: d  reason: collision with root package name */
    public final ih.p f33099d;

    /* renamed from: e  reason: collision with root package name */
    public final uj.k f33100e;
    public final String f;

    /* compiled from: ExpandedTemplateBuilder.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            j jVar = j.this;
            sb2.append(jVar.f);
            sb2.append(" build() : Given expanded state not supported. Mode: ");
            sb2.append(jVar.f33097b.f34216e.f34195a);
            return sb2.toString();
        }
    }

    public j(Context context, ih.p pVar, jj.b metaData, uj.k kVar, uj.o oVar) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        this.f33096a = context;
        this.f33097b = oVar;
        this.f33098c = metaData;
        this.f33099d = pVar;
        this.f33100e = kVar;
        this.f = "RichPush_4.3.2_ExpandedTemplateBuilder";
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i6;
        RemoteViews remoteViews;
        boolean i10;
        String str;
        boolean z14;
        RemoteViews remoteViews2;
        Iterator<uj.r> it;
        String str2;
        int i11;
        boolean z15;
        uj.o oVar = this.f33097b;
        uj.h hVar = oVar.f34216e;
        if (hVar == null) {
            return false;
        }
        String str3 = hVar.f34195a;
        int hashCode = str3.hashCode();
        jj.b bVar = this.f33098c;
        Context context = this.f33096a;
        ih.p pVar = this.f33099d;
        switch (hashCode) {
            case -283517494:
                if (str3.equals("stylizedBasic")) {
                    c0 c0Var = new c0(context, oVar, bVar, pVar);
                    Context context2 = c0Var.f33069a;
                    jj.b bVar2 = c0Var.f33071c;
                    uj.o oVar2 = c0Var.f33070b;
                    ih.p pVar2 = c0Var.f33072d;
                    try {
                        uj.h hVar2 = oVar2.f34216e;
                        qh.a defaultText = oVar2.f34213b;
                        if (hVar2 != null) {
                            hh.g logger = pVar2.f20105d;
                            kotlin.jvm.internal.i.g(logger, "logger");
                            kotlin.jvm.internal.i.g(defaultText, "defaultText");
                            if ((!gv.n.B0(defaultText.f29590b)) && (!gv.n.B0(defaultText.f29591c))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            hh.g gVar = pVar2.f20105d;
                            if (!z10) {
                                hh.g.b(gVar, 1, new y(c0Var), 2);
                            } else {
                                hh.g.b(gVar, 0, new z(c0Var), 3);
                                hh.g.b(gVar, 0, new a0(c0Var), 3);
                                if (!hVar2.f34197c.isEmpty()) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                RemoteViews b10 = c0Var.b(z11, bVar2.f22066a.f28532h.f28521e);
                                boolean isEmpty = hVar2.f34198d.isEmpty();
                                List<uj.r> list = hVar2.f34197c;
                                pj.b bVar3 = bVar2.f22066a;
                                if (!isEmpty || !list.isEmpty() || (sj.z.a() && bVar3.f28532h.f28521e)) {
                                    l0 l0Var = new l0(pVar2);
                                    l0.l(hVar2.f34196b, b10, R.id.expandedRootView);
                                    l0.p(b10, defaultText, sj.z.b(context2), oVar2.f34218h);
                                    if (!hVar2.f34198d.isEmpty()) {
                                        z12 = l0Var.h(context2, b10, bVar2, oVar2);
                                    } else {
                                        if (sj.z.a()) {
                                            b10.setViewVisibility(R.id.centerInsideImage, 8);
                                            b10.setViewVisibility(R.id.centerCropImage, 8);
                                        } else {
                                            b10.setViewVisibility(R.id.horizontalFitCenterImage, 8);
                                            b10.setViewVisibility(R.id.verticalImage, 8);
                                            b10.setViewVisibility(R.id.horizontalCenterCropImage, 8);
                                        }
                                        z12 = false;
                                    }
                                    if (sj.z.a()) {
                                        boolean z16 = bVar3.f28532h.f28521e;
                                        if ((!hVar2.f34198d.isEmpty()) && z12) {
                                            b10.setInt(R.id.message, "setMaxLines", 2);
                                        } else {
                                            if (!(!list.isEmpty()) && !z16) {
                                                b10.setInt(R.id.message, "setMaxLines", 11);
                                            }
                                            b10.setInt(R.id.message, "setMaxLines", 9);
                                        }
                                        l0Var.f(b10, R.id.expandedRootView, oVar2, bVar2);
                                    } else {
                                        c0Var.a(oVar2, b10, l0Var, z12);
                                    }
                                    l0Var.k(b10, oVar2, bVar3);
                                    if ((!list.isEmpty()) || bVar3.f28532h.f28521e) {
                                        l0Var.b(c0Var.f33069a, bVar2, oVar2, b10, oVar2.f34216e.f34197c, bVar2.f22066a.f28532h.f28521e);
                                    }
                                    l0.g(context2, b10, R.id.collapsedRootView, oVar2, bVar2);
                                    bVar2.f22067b.f14679y = b10;
                                    return true;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        pVar2.f20105d.a(1, th2, new b0(c0Var));
                    }
                    return false;
                }
                break;
            case 110364485:
                if (str3.equals("timer")) {
                    if ((oVar instanceof uj.q) && new s0(this.f33096a, (uj.q) oVar, this.f33098c, this.f33099d, this.f33100e).b()) {
                        return true;
                    }
                    return false;
                }
                break;
            case 1346137115:
                if (str3.equals("timerWithProgressbar")) {
                    if ((oVar instanceof uj.q) && new s0(this.f33096a, (uj.q) oVar, this.f33098c, this.f33099d, this.f33100e).a()) {
                        return true;
                    }
                    return false;
                }
                break;
            case 1369170907:
                if (str3.equals("imageCarousel")) {
                    tj.a aVar = new tj.a(context, oVar, bVar, pVar);
                    uj.o oVar3 = aVar.f33041b;
                    jj.b bVar4 = aVar.f33042c;
                    Context context3 = aVar.f33040a;
                    l0 l0Var2 = aVar.f;
                    ih.p pVar3 = aVar.f33043d;
                    try {
                        uj.h hVar3 = oVar3.f34216e;
                        qh.a defaultText2 = oVar3.f34213b;
                        if (hVar3 != null) {
                            hh.g logger2 = pVar3.f20105d;
                            kotlin.jvm.internal.i.g(logger2, "logger");
                            kotlin.jvm.internal.i.g(defaultText2, "defaultText");
                            if ((!gv.n.B0(defaultText2.f29590b)) && (!gv.n.B0(defaultText2.f29591c))) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            hh.g gVar2 = pVar3.f20105d;
                            if (!z13) {
                                hh.g.b(gVar2, 1, new b(aVar), 2);
                            } else {
                                hh.g.b(gVar2, 0, new c(aVar), 3);
                                hh.g.b(gVar2, 0, new d(aVar), 3);
                                RemoteViews e10 = aVar.e(hVar3.f34199e, bVar4.f22066a.f28532h.f28521e);
                                if (!hVar3.f34198d.isEmpty()) {
                                    uj.j jVar = hVar3.f34196b;
                                    l0Var2.getClass();
                                    l0.l(jVar, e10, R.id.expandedRootView);
                                    l0.p(e10, defaultText2, sj.z.b(context3), oVar3.f34218h);
                                    boolean a10 = sj.z.a();
                                    pj.b bVar5 = bVar4.f22066a;
                                    if (a10) {
                                        l0Var2.f(e10, R.id.expandedRootView, oVar3, bVar4);
                                        if (bVar5.f28532h.f28521e) {
                                            s5 s5Var = oVar3.f34219i;
                                            boolean a11 = sj.z.a();
                                            l0Var2.getClass();
                                            l0.q(e10, s5Var, a11);
                                        }
                                    } else {
                                        l0Var2.r(context3, e10, bVar4, oVar3);
                                    }
                                    l0Var2.k(e10, oVar3, bVar5);
                                    if (bVar5.f28532h.f28521e) {
                                        l0.c(e10, context3, bVar4);
                                    }
                                    List<String> d10 = aVar.d();
                                    if (!d10.isEmpty()) {
                                        Bundle extras = bVar5.f28533i;
                                        kotlin.jvm.internal.i.g(extras, "extras");
                                        if (!extras.getBoolean("moe_re_notify", false)) {
                                            i6 = aVar.c(d10);
                                            if (i6 != 0) {
                                                if (i6 != d10.size()) {
                                                    aVar.g();
                                                }
                                                bVar5.f28533i.putInt("image_count", i6);
                                            }
                                        } else {
                                            i6 = 0;
                                        }
                                        if (hVar3.f34199e) {
                                            aVar.a(e10, i6, hVar3.f34198d);
                                        } else {
                                            aVar.b(e10, hVar3.f34198d);
                                        }
                                        l0Var2.getClass();
                                        l0.g(context3, e10, R.id.collapsedRootView, oVar3, bVar4);
                                        bVar4.f22067b.f14679y = e10;
                                        return true;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        pVar3.f20105d.a(1, th3, new e(aVar));
                    }
                    return false;
                }
                break;
            case 1670997095:
                if (str3.equals("imageBanner")) {
                    u uVar = new u(context, oVar, bVar, pVar);
                    jj.b bVar6 = uVar.f33157c;
                    uj.o oVar4 = uVar.f33156b;
                    ih.p pVar4 = uVar.f33158d;
                    try {
                        hh.g.b(pVar4.f20105d, 0, new n(uVar), 3);
                        uj.h hVar4 = oVar4.f34216e;
                        if (hVar4 != null && (hVar4 instanceof uj.g)) {
                            hh.g.b(pVar4.f20105d, 0, new o(uVar, hVar4), 3);
                            if (!((uj.g) hVar4).f34198d.isEmpty()) {
                                boolean z17 = bVar6.f22066a.f28532h.f28521e;
                                boolean a12 = sj.z.a();
                                Context context4 = uVar.f33155a;
                                if (a12) {
                                    if (z17) {
                                        remoteViews = new RemoteViews(context4.getPackageName(), (int) R.layout.moe_rich_push_image_banner_expanded_layout_decorated_style_with_dismiss);
                                    } else {
                                        remoteViews = new RemoteViews(context4.getPackageName(), (int) R.layout.moe_rich_push_image_banner_expanded_layout_decorated_style);
                                    }
                                } else {
                                    remoteViews = new RemoteViews(context4.getPackageName(), sj.z.c(R.layout.moe_rich_push_image_banner_expanded, R.layout.moe_rich_push_image_banner_expanded_layout_big, pVar4));
                                }
                                l0 l0Var3 = new l0(pVar4);
                                l0.l(((uj.g) hVar4).f34196b, remoteViews, R.id.expandedRootView);
                                boolean a13 = sj.z.a();
                                f0.t tVar = bVar6.f22067b;
                                if (a13) {
                                    tVar.k("");
                                    if (bVar6.f22066a.f28532h.f28521e) {
                                        l0.q(remoteViews, oVar4.f34219i, sj.z.a());
                                        l0.c(remoteViews, context4, bVar6);
                                    }
                                } else {
                                    uVar.a(l0Var3, remoteViews, ((uj.g) hVar4).f);
                                }
                                uj.a aVar2 = ((uj.g) hVar4).f34198d.get(0);
                                if (!aVar2.f34184b.isEmpty()) {
                                    uj.r rVar = aVar2.f34184b.get(0);
                                    if (kotlin.jvm.internal.i.b("image", rVar.f34223a)) {
                                        i10 = l0Var3.i(uVar.f33155a, uVar.f33157c, uVar.f33156b, remoteViews, (uj.i) rVar, aVar2, null);
                                        if (i10) {
                                            l0.g(context4, remoteViews, R.id.expandedRootView, oVar4, bVar6);
                                            tVar.f14679y = remoteViews;
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        pVar4.f20105d.a(1, th4, new p(uVar));
                    }
                    return false;
                }
                break;
            case 1981452852:
                if (str3.equals("imageBannerText")) {
                    u uVar2 = new u(context, oVar, bVar, pVar);
                    jj.b bVar7 = uVar2.f33157c;
                    uj.o oVar5 = uVar2.f33156b;
                    ih.p pVar5 = uVar2.f33158d;
                    try {
                        hh.g gVar3 = pVar5.f20105d;
                        hh.g logger3 = pVar5.f20105d;
                        hh.g.b(gVar3, 0, new q(uVar2), 3);
                        uj.h hVar5 = oVar5.f34216e;
                        if (hVar5 != null && (hVar5 instanceof uj.g)) {
                            hh.g.b(logger3, 0, new r(uVar2, hVar5), 3);
                            if (((uj.g) hVar5).f34198d.isEmpty()) {
                                return false;
                            }
                            uj.a card = ((uj.g) hVar5).f34198d.get(0);
                            kotlin.jvm.internal.i.g(logger3, "logger");
                            kotlin.jvm.internal.i.g(card, "card");
                            Iterator<uj.r> it2 = card.f34184b.iterator();
                            while (true) {
                                str = "image";
                                if (it2.hasNext()) {
                                    uj.r next = it2.next();
                                    if (next.f34224b == 0 && kotlin.jvm.internal.i.b("image", next.f34223a)) {
                                        z14 = true;
                                    }
                                } else {
                                    z14 = false;
                                }
                            }
                            if (!z14) {
                                return false;
                            }
                            boolean z18 = bVar7.f22066a.f28532h.f28521e;
                            boolean a14 = sj.z.a();
                            Context context5 = uVar2.f33155a;
                            if (a14) {
                                if (z18) {
                                    remoteViews2 = new RemoteViews(context5.getPackageName(), (int) R.layout.moe_rich_push_image_banner_text_expanded_layout_decorated_style_with_dismiss);
                                } else {
                                    remoteViews2 = new RemoteViews(context5.getPackageName(), (int) R.layout.moe_rich_push_image_banner_text_expanded_layout_decorated_style);
                                }
                            } else {
                                remoteViews2 = new RemoteViews(context5.getPackageName(), sj.z.c(R.layout.moe_rich_push_image_banner_text_expanded, R.layout.moe_rich_push_image_banner_text_expanded_layout_big, pVar5));
                            }
                            l0 l0Var4 = new l0(pVar5);
                            l0.l(((uj.g) hVar5).f34196b, remoteViews2, R.id.expandedRootView);
                            if (sj.z.a()) {
                                bVar7.f22067b.k("");
                                if (bVar7.f22066a.f28532h.f28521e) {
                                    l0.q(remoteViews2, oVar5.f34219i, sj.z.a());
                                    l0.c(remoteViews2, context5, bVar7);
                                }
                            } else {
                                uVar2.a(l0Var4, remoteViews2, ((uj.g) hVar5).f);
                            }
                            Iterator<uj.r> it3 = card.f34184b.iterator();
                            while (it3.hasNext()) {
                                uj.r next2 = it3.next();
                                int i12 = next2.f34224b;
                                String str4 = next2.f34223a;
                                if (i12 == 0 && kotlin.jvm.internal.i.b(str, str4)) {
                                    Context context6 = uVar2.f33155a;
                                    jj.b bVar8 = uVar2.f33157c;
                                    uj.o oVar6 = uVar2.f33156b;
                                    uj.i iVar = (uj.i) next2;
                                    Bitmap e11 = di.b.e(iVar.f34225c);
                                    if (e11 == null) {
                                        it = it3;
                                        str2 = str;
                                        z15 = false;
                                    } else {
                                        if (sj.z.a()) {
                                            it = it3;
                                            str2 = str;
                                            if (iVar.f == ImageView.ScaleType.CENTER_CROP) {
                                                l0.u(l0Var4, remoteViews2, R.id.centerCropImage);
                                                i11 = R.id.centerCropImage;
                                            } else {
                                                i11 = R.id.centerInsideImage;
                                            }
                                        } else {
                                            it = it3;
                                            str2 = str;
                                            i11 = R.id.imageBanner;
                                        }
                                        remoteViews2.setImageViewBitmap(i11, e11);
                                        remoteViews2.setViewVisibility(i11, 0);
                                        l0Var4.d(context6, bVar8, oVar6, remoteViews2, iVar, card, i11, R.id.card);
                                        z15 = true;
                                    }
                                    if (!z15) {
                                    }
                                } else {
                                    it = it3;
                                    str2 = str;
                                    int i13 = next2.f34224b;
                                    String str5 = next2.f34225c;
                                    if (i13 == 1 && kotlin.jvm.internal.i.b("text", str4)) {
                                        if (!gv.n.B0(str5)) {
                                            Spanned a15 = r0.b.a(str5, 63);
                                            kotlin.jvm.internal.i.f(a15, "fromHtml(string, HtmlCom…t.FROM_HTML_MODE_COMPACT)");
                                            remoteViews2.setTextViewText(R.id.headerText, a15);
                                            remoteViews2.setViewVisibility(R.id.headerText, 0);
                                        }
                                    } else if (i13 == 2 && kotlin.jvm.internal.i.b("text", str4)) {
                                        if (!gv.n.B0(str5)) {
                                            Spanned a16 = r0.b.a(str5, 63);
                                            kotlin.jvm.internal.i.f(a16, "fromHtml(string, HtmlCom…t.FROM_HTML_MODE_COMPACT)");
                                            remoteViews2.setTextViewText(R.id.messageText, a16);
                                            remoteViews2.setViewVisibility(R.id.messageText, 0);
                                        }
                                    } else {
                                        hh.g.b(logger3, 2, new s(uVar2), 2);
                                    }
                                }
                                it3 = it;
                                str = str2;
                            }
                            l0.g(uVar2.f33155a, remoteViews2, R.id.expandedRootView, oVar5, bVar7);
                            bVar7.f22067b.f14679y = remoteViews2;
                            return true;
                        }
                    } catch (Throwable th5) {
                        pVar5.f20105d.a(1, th5, new t(uVar2));
                    }
                    return false;
                }
                break;
        }
        hh.g.b(pVar.f20105d, 0, new a(), 3);
        return false;
    }
}
