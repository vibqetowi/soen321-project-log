package dl;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class t0 extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends String, ? extends String>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13110u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13110u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(hs.f<? extends String, ? extends String> fVar) {
        String str;
        final String str2;
        int i6;
        LinearLayout linearLayout;
        hs.f<? extends String, ? extends String> fVar2 = fVar;
        String str3 = null;
        if (fVar2 != null) {
            str = (String) fVar2.f19464u;
        } else {
            str = null;
        }
        if (fVar2 != null) {
            str2 = (String) fVar2.f19465v;
        } else {
            str2 = null;
        }
        int i10 = V3DashboardActivity.f10714r1;
        final V3DashboardActivity v3DashboardActivity = this.f13110u;
        v3DashboardActivity.getClass();
        try {
            if (kotlin.jvm.internal.i.b(str, "pending")) {
                final Dialog a10 = v3DashboardActivity.S0().a();
                View findViewById = a10.findViewById(R.id.tvInAppPromptDialogYes);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: dl.b0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str4 = null;
                            int i11 = r4;
                            String str5 = str2;
                            Dialog this_apply = a10;
                            V3DashboardActivity this$0 = v3DashboardActivity;
                            switch (i11) {
                                case 0:
                                    int i12 = V3DashboardActivity.f10714r1;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    this$0.startActivity(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_MATCHING_FLOW));
                                    km.d dVar = this$0.Y0;
                                    if (dVar != null) {
                                        dVar.H = true;
                                    }
                                    this$0.f10738n1 = null;
                                    this_apply.dismiss();
                                    String str6 = gk.a.f16573a;
                                    Bundle bundle = new Bundle();
                                    User user = FirebasePersistence.getInstance().getUser();
                                    if (user != null) {
                                        str4 = user.getCurrentCourseName();
                                    }
                                    bundle.putString("domain", str4);
                                    bundle.putString("variant_reason", str5);
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(bundle, "in_app_matching_dialog_start_cta");
                                    return;
                                default:
                                    int i13 = V3DashboardActivity.f10714r1;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    this$0.f10738n1 = Boolean.TRUE;
                                    this_apply.dismiss();
                                    km.d dVar2 = this$0.Y0;
                                    if (dVar2 != null) {
                                        ta.v.H(kc.f.H(dVar2), null, 0, new km.h(dVar2, "active", str5, null), 3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
                View findViewById2 = a10.findViewById(R.id.tvInAppPromptDialogCancel);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new View.OnClickListener() { // from class: dl.b0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str4 = null;
                            int i11 = r4;
                            String str5 = str2;
                            Dialog this_apply = a10;
                            V3DashboardActivity this$0 = v3DashboardActivity;
                            switch (i11) {
                                case 0:
                                    int i12 = V3DashboardActivity.f10714r1;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    this$0.startActivity(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_MATCHING_FLOW));
                                    km.d dVar = this$0.Y0;
                                    if (dVar != null) {
                                        dVar.H = true;
                                    }
                                    this$0.f10738n1 = null;
                                    this_apply.dismiss();
                                    String str6 = gk.a.f16573a;
                                    Bundle bundle = new Bundle();
                                    User user = FirebasePersistence.getInstance().getUser();
                                    if (user != null) {
                                        str4 = user.getCurrentCourseName();
                                    }
                                    bundle.putString("domain", str4);
                                    bundle.putString("variant_reason", str5);
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(bundle, "in_app_matching_dialog_start_cta");
                                    return;
                                default:
                                    int i13 = V3DashboardActivity.f10714r1;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                    this$0.f10738n1 = Boolean.TRUE;
                                    this_apply.dismiss();
                                    km.d dVar2 = this$0.Y0;
                                    if (dVar2 != null) {
                                        ta.v.H(kc.f.H(dVar2), null, 0, new km.h(dVar2, "active", str5, null), 3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
                a10.show();
                a10.setOnDismissListener(new tk.a(v3DashboardActivity, 2, str2));
                String str4 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str3 = user.getCurrentCourseName();
                }
                bundle.putString("domain", str3);
                bundle.putString("variant_reason", str2);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "in_app_matching_dialog_shown");
            } else if (kotlin.jvm.internal.i.b(str, "active")) {
                jm.c S0 = v3DashboardActivity.S0();
                LinearLayout llDashboardProviderEntryPointExperiment = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                kotlin.jvm.internal.i.f(llDashboardProviderEntryPointExperiment, "llDashboardProviderEntryPointExperiment");
                S0.getClass();
                View inflate = LayoutInflater.from(S0.f22470a).inflate(R.layout.banner_inapp_matching_drop_off, (ViewGroup) llDashboardProviderEntryPointExperiment, false);
                kotlin.jvm.internal.i.f(inflate, "from(context).inflate(R.…p_off, parentView, false)");
                ((LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment)).setVisibility(0);
                ((LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment)).addView(inflate);
                v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperimentFooter).setVisibility(0);
                inflate.setOnClickListener(new ik.j1(v3DashboardActivity, 11, str2));
            } else {
                LinearLayout linearLayout2 = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                if (linearLayout2 != null) {
                    i6 = linearLayout2.getChildCount();
                } else {
                    i6 = -1;
                }
                if (i6 > 1 && (linearLayout = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment)) != null) {
                    linearLayout.removeViewAt(1);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
        }
        return hs.k.f19476a;
    }
}
