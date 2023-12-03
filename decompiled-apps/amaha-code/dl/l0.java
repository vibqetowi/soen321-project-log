package dl;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.components.journal.model.JournalThoughtThinkingItemListModel;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.ProsAndConsModel;
import com.theinnerhour.b2b.network.model.CrossProviderRecommendationNotificationModel;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import hr.j8;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13064u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f13065v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f13066w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f13067x;

    public /* synthetic */ l0(int i6, V3DashboardActivity v3DashboardActivity, Object obj, boolean z10) {
        this.f13064u = i6;
        this.f13065v = v3DashboardActivity;
        this.f13066w = z10;
        this.f13067x = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        String str;
        androidx.lifecycle.w<TherapistPackagesModel> wVar;
        TherapistPackagesModel d10;
        androidx.lifecycle.w<TherapistPackagesModel> wVar2;
        TherapistPackagesModel d11;
        androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar3;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d12;
        TherapistPackagesModel therapistPackagesModel;
        androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar4;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d13;
        TherapistPackagesModel therapistPackagesModel2;
        int i6 = this.f13064u;
        String str2 = "therapist";
        String str3 = "psychiatry";
        boolean z11 = this.f13066w;
        Object obj = this.f13067x;
        Object obj2 = this.f13065v;
        switch (i6) {
            case 0:
                V3DashboardActivity this$0 = (V3DashboardActivity) obj2;
                CrossProviderRecommendationNotificationModel it = (CrossProviderRecommendationNotificationModel) obj;
                int i10 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(it, "$it");
                Intent intent = new Intent(this$0, TelecommunicationsPWAActivity.class);
                intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.CROSS_PROVIDER);
                intent.putExtra("isTherapy", z11);
                if (z11) {
                    str2 = "psychiatrist";
                }
                intent.putExtra("providerType", str2);
                intent.putExtra("isAlert", true);
                this$0.startActivity(intent);
                ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                if (!z11) {
                    str = "psychiatry";
                } else {
                    str = "therapy";
                }
                applicationPersistence.setStringValue("db_integrated_cross_".concat(str), it.getId());
                String str4 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                if (z11) {
                    str3 = "therapy";
                }
                bundle.putString("flow", str3);
                bundle.putString("source", "home_screen");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "cross_referral_prompt_click");
                return;
            case 1:
                String str5 = null;
                V3DashboardActivity this$02 = (V3DashboardActivity) obj2;
                UpcomingBooking booking = (UpcomingBooking) obj;
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(booking, "$booking");
                String str6 = gk.a.f16573a;
                Bundle a10 = r1.b0.a("source", "home_screen");
                String str7 = "";
                if (z11) {
                    a10.putString("flow", "therapy");
                    ml.p pVar = this$02.f10739o0;
                    if (pVar != null && (wVar4 = pVar.A) != null && (d13 = wVar4.d()) != null && (therapistPackagesModel2 = d13.f19464u) != null) {
                        str5 = therapistPackagesModel2.getUuid();
                    }
                    a10.putString("therapist_uuid", str5);
                    ml.p pVar2 = this$02.f10739o0;
                    if (pVar2 != null && (wVar3 = pVar2.A) != null && (d12 = wVar3.d()) != null && (therapistPackagesModel = d12.f19464u) != null) {
                        StringBuilder sb2 = new StringBuilder("");
                        String firstname = therapistPackagesModel.getFirstname();
                        if (firstname == null) {
                            firstname = "";
                        }
                        sb2.append(firstname);
                        sb2.append(' ');
                        String lastname = therapistPackagesModel.getLastname();
                        if (lastname != null) {
                            str7 = lastname;
                        }
                        sb2.append(str7);
                        a10.putString("therapist_name", sb2.toString());
                    }
                } else {
                    a10.putString("flow", "psychiatry");
                    ml.p pVar3 = this$02.f10739o0;
                    if (pVar3 != null && (wVar2 = pVar3.B) != null && (d11 = wVar2.d()) != null) {
                        str5 = d11.getUuid();
                    }
                    a10.putString("psychiatrist_uuid", str5);
                    ml.p pVar4 = this$02.f10739o0;
                    if (pVar4 != null && (wVar = pVar4.B) != null && (d10 = wVar.d()) != null) {
                        StringBuilder sb3 = new StringBuilder("");
                        String firstname2 = d10.getFirstname();
                        if (firstname2 == null) {
                            firstname2 = "";
                        }
                        sb3.append(firstname2);
                        sb3.append(' ');
                        String lastname2 = d10.getLastname();
                        if (lastname2 != null) {
                            str7 = lastname2;
                        }
                        sb3.append(str7);
                        a10.putString("psychiatrist_name", sb3.toString());
                    }
                }
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(a10, "therapy_psychiatry_join_session");
                Intent intent2 = new Intent(this$02, TelecommunicationsPWAActivity.class);
                intent2.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.JOIN_SESSION);
                intent2.putExtra("sessionId", booking.getId());
                intent2.putExtra("isTherapy", z11);
                this$02.startActivity(intent2);
                return;
            case 2:
                V3DashboardActivity this$03 = (V3DashboardActivity) obj2;
                String notificationType = (String) obj;
                int i12 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(notificationType, "$notificationType");
                if (Utils.INSTANCE.checkConnectivity(this$03)) {
                    if (kotlin.jvm.internal.i.b(notificationType, "bse_tips")) {
                        ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                        if (z11) {
                            str3 = "therapy";
                        }
                        applicationPersistence2.setBooleanValue(Constants.TC_NOTIFICATION_SESSION_TIPS.concat(str3), true);
                        Intent intent3 = new Intent(this$03, TelecommunicationsPWAActivity.class);
                        intent3.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.BSE_TIPS);
                        intent3.putExtra("isTherapy", z11);
                        if (!z11) {
                            str2 = "psychiatrist";
                        }
                        intent3.putExtra("providerType", str2);
                        this$03.startActivity(intent3);
                        return;
                    }
                    ApplicationPersistence applicationPersistence3 = ApplicationPersistence.getInstance();
                    if (z11) {
                        str3 = "therapy";
                    }
                    applicationPersistence3.setBooleanValue(Constants.TC_NOTIFICATION_PREPARATION_THINGS.concat(str3), true);
                    Intent intent4 = new Intent(this$03, TelecommunicationsPWAActivity.class);
                    intent4.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.BSE_PREP);
                    intent4.putExtra("isTherapy", z11);
                    this$03.startActivity(intent4);
                    return;
                }
                return;
            case 3:
                N12AItemListModel n12AItemListModel = (N12AItemListModel) obj2;
                ol.p this$04 = (ol.p) obj;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                if (n12AItemListModel != null) {
                    this$04.A.invoke(n12AItemListModel, Boolean.valueOf(z11));
                    return;
                }
                return;
            case 4:
                JournalThoughtThinkingItemListModel journalThoughtThinkingItemListModel = (JournalThoughtThinkingItemListModel) obj2;
                mm.i this$05 = (mm.i) obj;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                if (journalThoughtThinkingItemListModel != null) {
                    this$05.A.invoke(journalThoughtThinkingItemListModel, Boolean.valueOf(z11));
                    return;
                }
                return;
            case 5:
                hr.r1 this$06 = (hr.r1) obj2;
                String goalId = (String) obj;
                int i13 = hr.r1.F;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(goalId, "$goalId");
                try {
                    if (z11) {
                        TemplateActivity templateActivity = this$06.C;
                        if (templateActivity != null) {
                            templateActivity.K0(true);
                            TemplateActivity templateActivity2 = this$06.C;
                            if (templateActivity2 != null) {
                                boolean z12 = templateActivity2.K;
                                androidx.lifecycle.m0 m0Var = this$06.B;
                                if (z12) {
                                    fm.a aVar = (fm.a) m0Var.getValue();
                                    aVar.f15174h0.e(this$06.getViewLifecycleOwner(), new hr.m0(24, new hr.s1(this$06)));
                                    aVar.j(this$06.f19068v, goalId);
                                    return;
                                }
                                templateActivity2.K = true;
                                fm.a aVar2 = (fm.a) m0Var.getValue();
                                aVar2.f15177k0.e(this$06.getViewLifecycleOwner(), new hr.m0(25, new hr.t1(this$06)));
                                aVar2.h(this$06.f19068v, goalId);
                                return;
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    androidx.fragment.app.p activity = this$06.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ((rr.a) activity).t0();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$06.f19067u, "exception in on click listener", e10);
                    return;
                }
            default:
                j8 this$07 = (j8) obj2;
                Dialog dialog = (Dialog) obj;
                int i14 = j8.A;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                androidx.fragment.app.p activity2 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                TemplateActivity templateActivity3 = (TemplateActivity) activity2;
                Editable text = ((RobertoEditText) dialog.findViewById(R.id.etAddNew)).getText();
                if (text != null && text.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    Utils utils = Utils.INSTANCE;
                    Object obj3 = this$07.f18635x.get("s61_error");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                    utils.showCustomToast(templateActivity3, (String) obj3);
                    return;
                }
                this$07.J(z11, new ProsAndConsModel(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.etAddNew)).getText()), ((AppCompatSeekBar) dialog.findViewById(R.id.S61Seekbar)).getProgress() + 1));
                dialog.dismiss();
                return;
        }
    }

    public /* synthetic */ l0(int i6, Object obj, Object obj2, boolean z10) {
        this.f13064u = i6;
        this.f13065v = obj;
        this.f13067x = obj2;
        this.f13066w = z10;
    }

    public /* synthetic */ l0(hr.r1 r1Var, String str, boolean z10) {
        this.f13064u = 5;
        this.f13066w = z10;
        this.f13065v = r1Var;
        this.f13067x = str;
    }
}
