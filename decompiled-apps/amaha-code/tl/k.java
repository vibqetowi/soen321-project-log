package tl;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.SuggestedBooking;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: ExpertCareDashboardFragment.kt */
/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends zl.b, ? extends Object>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f33251u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar) {
        super(1);
        this.f33251u = dVar;
    }

    @Override // ss.l
    public final hs.k invoke(hs.f<? extends zl.b, ? extends Object> fVar) {
        SuggestedBooking suggestedBooking;
        String str;
        w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar;
        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
        TherapistPackagesModel therapistPackagesModel;
        SuggestedBooking suggestedBooking2;
        String str2;
        w<SingleUseEvent<TherapistPackagesModel>> wVar2;
        SingleUseEvent<TherapistPackagesModel> d11;
        TherapistPackagesModel peekContent2;
        UpcomingBooking upcomingBooking;
        String str3;
        UpcomingBooking upcomingBooking2;
        UpcomingBooking upcomingBooking3;
        String str4;
        UpcomingBooking upcomingBooking4;
        UpcomingBooking upcomingBooking5;
        String str5;
        UpcomingBooking upcomingBooking6;
        UpcomingBooking upcomingBooking7;
        boolean z10;
        hs.f<? extends zl.b, ? extends Object> sessionPair = fVar;
        kotlin.jvm.internal.i.g(sessionPair, "sessionPair");
        A a10 = sessionPair.f19464u;
        int i6 = d.R;
        d dVar = this.f33251u;
        dVar.getClass();
        try {
            int ordinal = ((zl.b) a10).ordinal();
            pp.c cVar = pp.c.NEXT_SESSION;
            androidx.activity.result.c<Intent> cVar2 = dVar.M;
            B b10 = sessionPair.f19465v;
            switch (ordinal) {
                case 0:
                    if (b10 instanceof SuggestedBooking) {
                        suggestedBooking = (SuggestedBooking) b10;
                    } else {
                        suggestedBooking = null;
                    }
                    if (suggestedBooking != null) {
                        Intent intent = new Intent(dVar.requireActivity(), TelecommunicationsPWAActivity.class);
                        intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
                        intent.putExtra("isTherapy", true);
                        intent.putExtra("providerType", "therapist");
                        zl.o oVar = dVar.f33235v;
                        if (oVar != null && (wVar = oVar.f39567z) != null && (d10 = wVar.d()) != null && (peekContent = d10.peekContent()) != null && (therapistPackagesModel = peekContent.f19464u) != null) {
                            str = therapistPackagesModel.getUuid();
                        } else {
                            str = null;
                        }
                        intent.putExtra("providerUUID", str);
                        intent.putExtra("suggestedBooking", suggestedBooking.getSuggestedPackage().getId());
                        intent.putExtra("override_source_value", dVar.U());
                        cVar2.a(intent);
                        String str6 = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        bundle.putString("source", dVar.U());
                        bundle.putString("flow", "therapy");
                        bundle.putString("mode", suggestedBooking.getMode());
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "next_session_prompt_click");
                        break;
                    }
                    break;
                case 1:
                    if (b10 instanceof SuggestedBooking) {
                        suggestedBooking2 = (SuggestedBooking) b10;
                    } else {
                        suggestedBooking2 = null;
                    }
                    if (suggestedBooking2 != null) {
                        Intent intent2 = new Intent(dVar.requireActivity(), TelecommunicationsPWAActivity.class);
                        intent2.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
                        intent2.putExtra("isTherapy", false);
                        intent2.putExtra("providerType", "psychiatrist");
                        zl.o oVar2 = dVar.f33235v;
                        if (oVar2 != null && (wVar2 = oVar2.A) != null && (d11 = wVar2.d()) != null && (peekContent2 = d11.peekContent()) != null) {
                            str2 = peekContent2.getUuid();
                        } else {
                            str2 = null;
                        }
                        intent2.putExtra("providerUUID", str2);
                        intent2.putExtra("suggestedBooking", suggestedBooking2.getSuggestedPackage().getId());
                        intent2.putExtra("override_source_value", dVar.U());
                        cVar2.a(intent2);
                        String str7 = gk.a.f16573a;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", dVar.U());
                        bundle2.putString("flow", "psychiatry");
                        bundle2.putString("mode", suggestedBooking2.getMode());
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(bundle2, "next_session_prompt_click");
                        break;
                    }
                    break;
                case 2:
                    if (b10 instanceof UpcomingBooking) {
                        upcomingBooking = (UpcomingBooking) b10;
                    } else {
                        upcomingBooking = null;
                    }
                    if (upcomingBooking != null) {
                        str3 = upcomingBooking.getTypeofsession();
                    } else {
                        str3 = null;
                    }
                    if (kotlin.jvm.internal.i.b(str3, "offline")) {
                        if (b10 instanceof UpcomingBooking) {
                            upcomingBooking2 = (UpcomingBooking) b10;
                        } else {
                            upcomingBooking2 = null;
                        }
                        dVar.o0(upcomingBooking2, (zl.b) a10);
                        String str8 = gk.a.f16573a;
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("source", dVar.U());
                        hs.f Y = d.Y(dVar, (zl.b) a10, null, 2);
                        A a11 = Y.f19464u;
                        bundle3.putString((String) ((hs.f) a11).f19464u, (String) ((hs.f) a11).f19465v);
                        B b11 = Y.f19465v;
                        bundle3.putString((String) ((hs.f) b11).f19464u, (String) ((hs.f) b11).f19465v);
                        bundle3.putString("flow", d.X(dVar, (zl.b) a10, null, 2));
                        hs.k kVar3 = hs.k.f19476a;
                        gk.a.b(bundle3, "therapy_psychiatry_locate_icon_click");
                        break;
                    } else {
                        dVar.h0();
                        break;
                    }
                case 3:
                    if (b10 instanceof UpcomingBooking) {
                        upcomingBooking3 = (UpcomingBooking) b10;
                    } else {
                        upcomingBooking3 = null;
                    }
                    if (upcomingBooking3 != null) {
                        str4 = upcomingBooking3.getTypeofsession();
                    } else {
                        str4 = null;
                    }
                    if (kotlin.jvm.internal.i.b(str4, "offline")) {
                        if (b10 instanceof UpcomingBooking) {
                            upcomingBooking4 = (UpcomingBooking) b10;
                        } else {
                            upcomingBooking4 = null;
                        }
                        dVar.o0(upcomingBooking4, (zl.b) a10);
                        String str9 = gk.a.f16573a;
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("source", dVar.U());
                        hs.f Y2 = d.Y(dVar, (zl.b) a10, null, 2);
                        A a12 = Y2.f19464u;
                        bundle4.putString((String) ((hs.f) a12).f19464u, (String) ((hs.f) a12).f19465v);
                        B b12 = Y2.f19465v;
                        bundle4.putString((String) ((hs.f) b12).f19464u, (String) ((hs.f) b12).f19465v);
                        bundle4.putString("flow", d.X(dVar, (zl.b) a10, null, 2));
                        hs.k kVar4 = hs.k.f19476a;
                        gk.a.b(bundle4, "therapy_psychiatry_locate_icon_click");
                        break;
                    } else {
                        dVar.c0();
                        break;
                    }
                case 4:
                    if (b10 instanceof UpcomingBooking) {
                        upcomingBooking5 = (UpcomingBooking) b10;
                    } else {
                        upcomingBooking5 = null;
                    }
                    if (upcomingBooking5 != null) {
                        str5 = upcomingBooking5.getTypeofsession();
                    } else {
                        str5 = null;
                    }
                    if (kotlin.jvm.internal.i.b(str5, "offline")) {
                        if (b10 instanceof UpcomingBooking) {
                            upcomingBooking6 = (UpcomingBooking) b10;
                        } else {
                            upcomingBooking6 = null;
                        }
                        dVar.o0(upcomingBooking6, (zl.b) a10);
                        String str10 = gk.a.f16573a;
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("source", dVar.U());
                        hs.f Y3 = d.Y(dVar, (zl.b) a10, null, 2);
                        A a13 = Y3.f19464u;
                        bundle5.putString((String) ((hs.f) a13).f19464u, (String) ((hs.f) a13).f19465v);
                        B b13 = Y3.f19465v;
                        bundle5.putString((String) ((hs.f) b13).f19464u, (String) ((hs.f) b13).f19465v);
                        bundle5.putString("flow", d.X(dVar, (zl.b) a10, null, 2));
                        hs.k kVar5 = hs.k.f19476a;
                        gk.a.b(bundle5, "therapy_psychiatry_locate_icon_click");
                        break;
                    } else {
                        dVar.a0();
                        break;
                    }
                case 5:
                case 6:
                case 7:
                    if (b10 instanceof UpcomingBooking) {
                        upcomingBooking7 = (UpcomingBooking) b10;
                    } else {
                        upcomingBooking7 = null;
                    }
                    if (upcomingBooking7 != null) {
                        Intent intent3 = new Intent(dVar.requireActivity(), TelecommunicationsPWAActivity.class);
                        intent3.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.JOIN_SESSION);
                        intent3.putExtra("sessionId", upcomingBooking7.getId());
                        if (a10 != zl.b.UPCOMING_IMMEDIATE_PSYCHIATRY) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        intent3.putExtra("isTherapy", z10);
                        intent3.putExtra("override_source_value", dVar.U());
                        cVar2.a(intent3);
                    }
                    String str11 = gk.a.f16573a;
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("source", dVar.U());
                    hs.f Y4 = d.Y(dVar, (zl.b) a10, null, 2);
                    A a14 = Y4.f19464u;
                    bundle6.putString((String) ((hs.f) a14).f19464u, (String) ((hs.f) a14).f19465v);
                    B b14 = Y4.f19465v;
                    bundle6.putString((String) ((hs.f) b14).f19464u, (String) ((hs.f) b14).f19465v);
                    bundle6.putString("flow", d.X(dVar, (zl.b) a10, null, 2));
                    hs.k kVar6 = hs.k.f19476a;
                    gk.a.b(bundle6, "therapy_psychiatry_join_session");
                    break;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(dVar.L, e10);
        }
        return hs.k.f19476a;
    }
}
