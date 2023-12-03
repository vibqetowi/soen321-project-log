package sj;

import android.net.Uri;
import android.os.Bundle;
/* compiled from: DefaultActionUpdater.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: DefaultActionUpdater.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f31601u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "RichPush_4.3.2_DefaultActionUpdater updateDefaultAction() : Not a valid default action.";
        }
    }

    public static final void a(uj.o oVar, jj.b metaData, ih.p pVar) {
        boolean z10;
        pj.b bVar;
        qj.a[] aVarArr;
        kotlin.jvm.internal.i.g(metaData, "metaData");
        qj.a[] aVarArr2 = oVar.f34214c;
        if (aVarArr2.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            pj.b bVar2 = metaData.f22066a;
            Bundle bundle = bVar2.f28533i;
            bundle.remove("gcm_notificationType");
            bundle.remove("gcm_activityName");
            bundle.remove("gcm_webUrl");
            bundle.remove("moe_webUrl");
            bundle.remove("gcm_show_dialog");
            bundle.remove("gcm_coupon_code");
            int length = aVarArr2.length;
            int i6 = 0;
            while (i6 < length) {
                qj.a aVar = aVarArr2[i6];
                i6++;
                String str = aVar.f29610a;
                boolean b10 = kotlin.jvm.internal.i.b(str, "navigate");
                hh.g gVar = pVar.f20105d;
                Bundle bundle2 = bVar2.f28533i;
                if (b10) {
                    if (!(aVar instanceof qj.g)) {
                        bVar = bVar2;
                        aVarArr = aVarArr2;
                    } else {
                        bVar = bVar2;
                        hh.g.b(gVar, 0, new c(aVar), 3);
                        qj.g gVar2 = (qj.g) aVar;
                        String str2 = gVar2.f29617d;
                        if (!gv.n.B0(str2)) {
                            String str3 = gVar2.f29616c;
                            int hashCode = str3.hashCode();
                            Bundle bundle3 = gVar2.f29618e;
                            aVarArr = aVarArr2;
                            if (hashCode != -417556201) {
                                if (hashCode != 628280070) {
                                    if (hashCode == 1778710939 && str3.equals("richLanding")) {
                                        bundle2.putString("gcm_notificationType", "normal notification");
                                        bundle2.putString("gcm_webUrl", str2);
                                        bundle2.putString("gcm_activityName", "com.moe.pushlibrary.activities.MoEActivity");
                                    }
                                } else if (str3.equals("deepLink")) {
                                    bundle2.putString("gcm_notificationType", "gcm_webNotification");
                                    Uri.Builder buildUpon = Uri.parse(di.b.h(str2)).buildUpon();
                                    if (bundle3 != null) {
                                        for (String str4 : bundle3.keySet()) {
                                            Object obj = bundle3.get(str4);
                                            if (obj != null) {
                                                buildUpon.appendQueryParameter(str4, obj.toString());
                                            }
                                        }
                                    }
                                    bundle2.putString("moe_webUrl", buildUpon.build().toString());
                                }
                            } else if (str3.equals("screenName")) {
                                bundle2.putString("gcm_notificationType", "normal notification");
                                bundle2.putString("gcm_activityName", str2);
                                if (bundle3 != null) {
                                    bundle2.putAll(bundle3);
                                }
                            }
                        } else {
                            throw new IllegalStateException("Navigation url cannot be null".toString());
                        }
                    }
                } else {
                    bVar = bVar2;
                    aVarArr = aVarArr2;
                    if (kotlin.jvm.internal.i.b(str, "coupon")) {
                        if (aVar instanceof qj.d) {
                            hh.g.b(gVar, 0, new sj.a(aVar), 3);
                            bundle2.putString("gcm_show_dialog", "true");
                            bundle2.putString("gcm_coupon_code", ((qj.d) aVar).f29614c);
                        }
                    } else {
                        hh.g.b(gVar, 0, a.f31601u, 3);
                    }
                    bVar2 = bVar;
                    aVarArr2 = aVarArr;
                }
                bVar2 = bVar;
                aVarArr2 = aVarArr;
            }
            return;
        }
        throw new IllegalStateException("Default action cannot be empty.".toString());
    }
}
