package dl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import hr.b4;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13074u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f13075v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f13076w;

    public /* synthetic */ m0(V3DashboardActivity v3DashboardActivity, boolean z10) {
        this.f13074u = 0;
        this.f13075v = z10;
        this.f13076w = v3DashboardActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0194, code lost:
        if (r3.equals("Se44ReTwDvoK5X0tDmWs") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019e, code lost:
        if (r3.equals("JaR3ditHyPz8IGYXlSVl") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a8, code lost:
        if (r3.equals("cne11nXtru0oPv0is7Yf") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b2, code lost:
        if (r3.equals("Xa20frT4BnvlDzUFMmorgwJFMcI") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01bc, code lost:
        if (r3.equals("Y1N_bj6iqytXg-CT22vkXx-kZro") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c6, code lost:
        if (r3.equals("ttm6UI4iuCiQgtJ3FbRU") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d0, code lost:
        if (r3.equals("J5vUmqNOqAreowqA0DU2") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01da, code lost:
        if (r3.equals("eYziRtpTFFvhGpqE8eu7TsA5vX4") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e4, code lost:
        if (r3.equals("RPxbvpUZhFbiDQmTyVrZ") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ee, code lost:
        if (r3.equals("olnpt1TJoTC5oz0JmKA1") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f7, code lost:
        if (r3.equals("o6xGWmIQPyhq5RrPO5DE") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0200, code lost:
        if (r3.equals("llE3WkkaVgDuLmZz4P25") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0243, code lost:
        if (r3.equals("1C38AqobWmbvKt4V0KuMMypGbqc") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0246, code lost:
        r11 = r11.getActivity();
        kotlin.jvm.internal.i.e(r11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((com.theinnerhour.b2b.activity.TemplateActivity) r11).onBackPressed();
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        String str;
        String str2;
        Object obj = this.f13076w;
        int i6 = this.f13074u;
        String str3 = "psychiatry";
        boolean z10 = this.f13075v;
        switch (i6) {
            case 0:
                V3DashboardActivity this$0 = (V3DashboardActivity) obj;
                int i10 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                if (!z10) {
                    str = "psychiatry";
                } else {
                    str = "therapy";
                }
                applicationPersistence.setBooleanValue("ia_idb_".concat(str), true);
                Intent intent = new Intent(this$0, TelecommunicationsPWAActivity.class);
                intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.INITIAL_ASSESSMENT);
                intent.putExtra("isTherapy", z10);
                this$0.startActivity(intent);
                String str4 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                if (z10) {
                    str3 = "therapy";
                }
                bundle.putString("flow", str3);
                bundle.putString("state", "pending");
                bundle.putString("source", "home_screen");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "initial_assessment_click");
                return;
            case 1:
                bo.i this$02 = (bo.i) obj;
                int i11 = bo.i.f4591x;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                String str5 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                if (!z10) {
                    str2 = "psychiatry";
                } else {
                    str2 = "therapy";
                }
                bundle2.putString("flow", str2);
                bundle2.putString("source", "app_onboarding_matching");
                bundle2.putString("screen", "welcome");
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle2, "setpref_flow_cta_start");
                Bundle bundle3 = new Bundle();
                if (z10) {
                    str3 = "therapy";
                }
                bundle3.putString("flow", str3);
                bundle3.putString("source", "app_onboarding_matching");
                bundle3.putString("screen", "welcome");
                gk.a.b(bundle3, "setpref_flow_start");
                eo.g gVar = this$02.f4593v;
                if (gVar != null) {
                    gVar.M();
                    return;
                }
                return;
            default:
                b4 this$03 = (b4) obj;
                int i12 = b4.f18187z;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                androidx.fragment.app.p activity = this$03.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity).I = false;
                androidx.fragment.app.p activity2 = this$03.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity2).R = true;
                androidx.fragment.app.p activity3 = this$03.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity3).F.put("fromEdit", Boolean.TRUE);
                androidx.fragment.app.p activity4 = this$03.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                String B0 = ((TemplateActivity) activity4).B0();
                if (kotlin.jvm.internal.i.b(B0, "s108")) {
                    androidx.fragment.app.p activity5 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity5).onBackPressed();
                    androidx.fragment.app.p activity6 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity6).onBackPressed();
                    return;
                }
                String str6 = null;
                if (kotlin.jvm.internal.i.b(B0, "s92-d")) {
                    androidx.fragment.app.p activity7 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity7).onBackPressed();
                    androidx.fragment.app.p activity8 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity8).onBackPressed();
                    androidx.fragment.app.p activity9 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity9).onBackPressed();
                    ArrayList k10 = ca.a.k("Hu1zjaK518AGX6p1uNyw", "TVjSoqFdOrM0CE0YU1ja", "pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4");
                    TemplateActivity templateActivity = this$03.f18189v;
                    if (templateActivity != null) {
                        TemplateModel templateModel = templateActivity.f10547y;
                        if (templateModel != null) {
                            str6 = templateModel.getLabel();
                        }
                        if (!is.u.Z1(k10, str6)) {
                            androidx.fragment.app.p activity10 = this$03.getActivity();
                            kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity10).J = false;
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                } else if (z10) {
                    androidx.fragment.app.p activity11 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateModel templateModel2 = ((TemplateActivity) activity11).f10547y;
                    if (templateModel2 != null) {
                        str6 = templateModel2.getLabel();
                    }
                    if (str6 != null) {
                        switch (str6.hashCode()) {
                            case -1509384593:
                                break;
                            case -1455286255:
                                if (str6.equals("trlaIGthnGTmcverPNnj")) {
                                    androidx.fragment.app.p activity12 = this$03.getActivity();
                                    kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity12).onBackPressed();
                                    androidx.fragment.app.p activity13 = this$03.getActivity();
                                    kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity13).onBackPressed();
                                    androidx.fragment.app.p activity14 = this$03.getActivity();
                                    kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity14).onBackPressed();
                                    androidx.fragment.app.p activity15 = this$03.getActivity();
                                    kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity15).onBackPressed();
                                    return;
                                }
                                break;
                            case -1448057414:
                                break;
                            case -781828056:
                                break;
                            case -725017092:
                                break;
                            case -590282395:
                                break;
                            case -361428328:
                                break;
                            case -285150597:
                                break;
                            case -214269283:
                                break;
                            case -109779523:
                                break;
                            case 834188168:
                                break;
                            case 857891394:
                                break;
                            case 1016875456:
                                break;
                            case 1333371330:
                                break;
                        }
                    }
                    androidx.fragment.app.p activity16 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity16).onBackPressed();
                    androidx.fragment.app.p activity17 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity17).onBackPressed();
                    return;
                } else {
                    androidx.fragment.app.p activity18 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity18).onBackPressed();
                    return;
                }
        }
    }

    public /* synthetic */ m0(rr.b bVar, boolean z10, int i6) {
        this.f13074u = i6;
        this.f13076w = bVar;
        this.f13075v = z10;
    }
}
