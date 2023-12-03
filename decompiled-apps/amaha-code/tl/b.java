package tl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33229u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f33230v;

    public /* synthetic */ b(d dVar, int i6) {
        this.f33229u = i6;
        this.f33230v = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        boolean z10;
        Integer num2;
        boolean z11;
        Integer num3;
        boolean z12;
        w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
        TherapistPackagesModel therapistPackagesModel;
        w<SingleUseEvent<TherapistPackagesModel>> wVar2;
        SingleUseEvent<TherapistPackagesModel> d11;
        TherapistPackagesModel peekContent2;
        w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar3;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d12;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent3;
        TherapistPackagesModel therapistPackagesModel2;
        int i6 = this.f33229u;
        d this$0 = this.f33230v;
        switch (i6) {
            case 0:
                int i10 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                int ordinal = this$0.F.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                try {
                                    if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                                        zl.o oVar = this$0.f33235v;
                                        if (oVar != null && (wVar3 = oVar.f39567z) != null && (d12 = wVar3.d()) != null && (peekContent3 = d12.peekContent()) != null && (therapistPackagesModel2 = peekContent3.f19464u) != null) {
                                            num = Integer.valueOf(therapistPackagesModel2.getId());
                                        } else {
                                            num = null;
                                        }
                                        if (num != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        zl.o oVar2 = this$0.f33235v;
                                        if (oVar2 != null && (wVar2 = oVar2.A) != null && (d11 = wVar2.d()) != null && (peekContent2 = d11.peekContent()) != null) {
                                            num2 = Integer.valueOf(peekContent2.getId());
                                        } else {
                                            num2 = null;
                                        }
                                        if (num2 != null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        zl.o oVar3 = this$0.f33235v;
                                        if (oVar3 != null && (wVar = oVar3.f39567z) != null && (d10 = wVar.d()) != null && (peekContent = d10.peekContent()) != null && (therapistPackagesModel = peekContent.f19465v) != null) {
                                            num3 = Integer.valueOf(therapistPackagesModel.getId());
                                        } else {
                                            num3 = null;
                                        }
                                        if (num3 != null) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z10 && !z11 && !z12) {
                                            this$0.h0();
                                        } else if (!z10 && z11 && !z12) {
                                            this$0.c0();
                                        } else if (!z10 && !z11 && z12) {
                                            this$0.a0();
                                        } else {
                                            this$0.M.a(new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class).putExtra("override_source_value", this$0.U()));
                                        }
                                    }
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.L, e10);
                                }
                            }
                        } else {
                            this$0.a0();
                        }
                    } else {
                        this$0.c0();
                    }
                } else {
                    this$0.h0();
                }
                String str = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("source", this$0.U());
                hs.f Y = d.Y(this$0, null, this$0.F, 1);
                hs.f fVar = (hs.f) Y.f19464u;
                boolean z13 = !gv.n.B0((CharSequence) fVar.f19464u);
                B b10 = Y.f19465v;
                if (z13 || (true ^ gv.n.B0((CharSequence) ((hs.f) b10).f19464u))) {
                    bundle.putString((String) fVar.f19464u, (String) fVar.f19465v);
                    hs.f fVar2 = (hs.f) b10;
                    bundle.putString((String) fVar2.f19464u, (String) fVar2.f19465v);
                }
                bundle.putString("flow", d.X(this$0, null, this$0.F, 1));
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "therapy_psychiatry_view_all_sessions");
                return;
            case 1:
                int i11 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.g0();
                String str2 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", this$0.U());
                bundle2.putBoolean("assigned", false);
                bundle2.putString("flow", "therapy");
                bundle2.putBoolean("cpp_given", false);
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle2, "therapy_psychiatry_flow_select");
                return;
            case 2:
                int i12 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.b0();
                String str3 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                bundle3.putString("source", this$0.U());
                bundle3.putBoolean("assigned", false);
                bundle3.putString("flow", "psychiatry");
                bundle3.putBoolean("cpp_given", false);
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(bundle3, "therapy_psychiatry_flow_select");
                return;
            case 3:
                int i13 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                        this$0.M.a(new Intent(this$0.getContext(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.COUPLES_LISTING).putExtra("override_source_value", this$0.U()));
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.L, e11);
                }
                String str4 = gk.a.f16573a;
                Bundle bundle4 = new Bundle();
                bundle4.putString("source", this$0.U());
                bundle4.putBoolean("assigned", false);
                bundle4.putString("flow", "couples");
                bundle4.putBoolean("cpp_given", false);
                hs.k kVar4 = hs.k.f19476a;
                gk.a.b(bundle4, "therapy_psychiatry_flow_select");
                return;
            case 4:
                int i14 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().deleteKey("db_integrated_cross_therapy");
                String str5 = gk.a.f16573a;
                Bundle bundle5 = new Bundle();
                bundle5.putString("source", this$0.U());
                bundle5.putBoolean("assigned", true);
                bundle5.putString("flow", "therapy");
                bundle5.putBoolean("cpp_given", false);
                hs.k kVar5 = hs.k.f19476a;
                gk.a.b(bundle5, "therapy_psychiatry_flow_select");
                this$0.h0();
                return;
            case 5:
                int i15 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().deleteKey("db_integrated_cross_psychiatry");
                String str6 = gk.a.f16573a;
                Bundle bundle6 = new Bundle();
                bundle6.putString("source", this$0.U());
                bundle6.putBoolean("assigned", true);
                bundle6.putString("flow", "psychiatry");
                bundle6.putBoolean("cpp_given", false);
                hs.k kVar6 = hs.k.f19476a;
                gk.a.b(bundle6, "therapy_psychiatry_flow_select");
                this$0.c0();
                return;
            case 6:
                int i16 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str7 = gk.a.f16573a;
                Bundle bundle7 = new Bundle();
                bundle7.putString("source", this$0.U());
                bundle7.putBoolean("assigned", true);
                bundle7.putString("flow", "couples");
                bundle7.putBoolean("cpp_given", false);
                hs.k kVar7 = hs.k.f19476a;
                gk.a.b(bundle7, "therapy_psychiatry_flow_select");
                this$0.a0();
                return;
            case 7:
                int i17 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.M.a(new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_MATCHING_FLOW).putExtra("override_source_value", "app_homescreen"));
                String str8 = gk.a.f16573a;
                Bundle f = defpackage.e.f("source", "app_homescreen", "flow", "therapy");
                hs.k kVar8 = hs.k.f19476a;
                gk.a.b(f, "setpref_flow_cta_click");
                return;
            case 8:
                int i18 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Iterator<T> it = this$0.K.iterator();
                while (it.hasNext()) {
                    hs.f fVar3 = (hs.f) it.next();
                    if (((Boolean) fVar3.f19464u).booleanValue()) {
                        this$0.n0((String) fVar3.f19465v);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 9:
                int i19 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Iterator<T> it2 = this$0.K.iterator();
                while (it2.hasNext()) {
                    hs.f fVar4 = (hs.f) it2.next();
                    if (!((Boolean) fVar4.f19464u).booleanValue()) {
                        this$0.n0((String) fVar4.f19465v);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 10:
                int i20 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().setStringValue("db_integrated_cross_psychiatry", this$0.f33238y);
                this$0.b0();
                String str9 = gk.a.f16573a;
                Bundle bundle8 = new Bundle();
                bundle8.putString("source", this$0.U());
                bundle8.putString("flow", "therapy");
                hs.k kVar9 = hs.k.f19476a;
                gk.a.b(bundle8, "cross_referral_prompt_click");
                Bundle bundle9 = new Bundle();
                bundle9.putString("source", this$0.U());
                bundle9.putBoolean("assigned", false);
                bundle9.putString("flow", "psychiatry");
                bundle9.putBoolean("cpp_given", true);
                gk.a.b(bundle9, "therapy_psychiatry_flow_select");
                return;
            default:
                int i21 = d.R;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().setStringValue("db_integrated_cross_therapy", this$0.f33239z);
                this$0.g0();
                String str10 = gk.a.f16573a;
                Bundle bundle10 = new Bundle();
                bundle10.putString("source", this$0.U());
                bundle10.putString("flow", "psychiatry");
                hs.k kVar10 = hs.k.f19476a;
                gk.a.b(bundle10, "cross_referral_prompt_click");
                Bundle bundle11 = new Bundle();
                bundle11.putString("source", this$0.U());
                bundle11.putBoolean("assigned", false);
                bundle11.putString("flow", "therapy");
                bundle11.putBoolean("cpp_given", true);
                gk.a.b(bundle11, "therapy_psychiatry_flow_select");
                return;
        }
    }
}
