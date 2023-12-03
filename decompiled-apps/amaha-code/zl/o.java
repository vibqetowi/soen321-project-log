package zl;

import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.CrossProviderRecommendationNotificationModel;
import com.theinnerhour.b2b.network.model.SuggestedBooking;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.o0;
import org.json.JSONObject;
import r1.b0;
/* compiled from: ExpertCareDashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class o extends l0 {
    public final w<SingleUseEvent<TherapistPackagesModel>> A;
    public final w<SingleUseEvent<ArrayList<vl.f>>> B;
    public CrossProviderRecommendationNotificationModel C;
    public CrossProviderRecommendationNotificationModel D;
    public ArrayList<SuggestedBooking> E;
    public List<UpcomingBooking> F;
    public UpcomingBooking G;
    public UpcomingBooking H;
    public UpcomingBooking I;
    public final w<SingleUseEvent<List<hs.f<b, Object>>>> J;
    public List<UpcomingBooking> K;
    public final ArrayList<UpcomingBooking> L;
    public final ArrayList<UpcomingBooking> M;
    public final ArrayList<UpcomingBooking> N;
    public final ArrayList<UpcomingBooking> O;
    public final w<SingleUseEvent<Integer>> P;
    public final w<SingleUseEvent<ArrayList<hs.f<Boolean, String>>>> Q;

    /* renamed from: x  reason: collision with root package name */
    public final rp.a f39565x;

    /* renamed from: y  reason: collision with root package name */
    public final String f39566y;

    /* renamed from: z  reason: collision with root package name */
    public final w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> f39567z;

    public o(rp.a providerAssignedRepository) {
        kotlin.jvm.internal.i.g(providerAssignedRepository, "providerAssignedRepository");
        this.f39565x = providerAssignedRepository;
        this.f39566y = LogHelper.INSTANCE.makeLogTag("ExpertCareDashboardViewModel");
        this.f39567z = new w<>();
        this.A = new w<>();
        this.B = new w<>();
        this.E = new ArrayList<>();
        this.J = new w<>();
        new w();
        new w();
        this.L = new ArrayList<>();
        this.M = new ArrayList<>();
        this.N = new ArrayList<>();
        this.O = new ArrayList<>();
        this.P = new w<>();
        this.Q = new w<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(o oVar) {
        w<SingleUseEvent<TherapistPackagesModel>> wVar;
        w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar2;
        String str;
        boolean z10;
        String str2;
        w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar3;
        CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel;
        String str3;
        String str4;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
        TherapistPackagesModel therapistPackagesModel;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent2;
        TherapistPackagesModel therapistPackagesModel2;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent3;
        TherapistPackagesModel therapistPackagesModel3;
        String str5;
        String str6;
        String str7;
        TherapistPackagesModel peekContent4;
        TherapistPackagesModel peekContent5;
        TherapistPackagesModel peekContent6;
        String str8;
        Iterator it;
        boolean z11;
        boolean z12;
        SingleUseEvent<TherapistPackagesModel> d10;
        boolean z13;
        String str9;
        String str10;
        TherapistPackagesModel peekContent7;
        TherapistPackagesModel peekContent8;
        TherapistPackagesModel peekContent9;
        TherapistPackagesModel peekContent10;
        String str11;
        String str12;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent11;
        TherapistPackagesModel therapistPackagesModel4;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent12;
        TherapistPackagesModel therapistPackagesModel5;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent13;
        TherapistPackagesModel therapistPackagesModel6;
        TherapistPackagesModel therapistPackagesModel7;
        String str13 = "suggested_therapy_event";
        Set<String> stringSetValue = ApplicationPersistence.getInstance().getStringSetValue("suggested_therapy_event");
        String str14 = "suggested_psychiatry_event";
        Set<String> stringSetValue2 = ApplicationPersistence.getInstance().getStringSetValue("suggested_psychiatry_event");
        Iterator it2 = oVar.E.iterator();
        boolean z14 = false;
        boolean z15 = false;
        while (true) {
            boolean hasNext = it2.hasNext();
            wVar = oVar.A;
            wVar2 = oVar.f39567z;
            str = str14;
            z10 = z14;
            str2 = null;
            if (!hasNext) {
                break;
            }
            SuggestedBooking suggestedBooking = (SuggestedBooking) it2.next();
            SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d11 = wVar2.d();
            if (d11 != null) {
                it = it2;
                hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent14 = d11.peekContent();
                if (peekContent14 != null && (therapistPackagesModel7 = peekContent14.f19464u) != null) {
                    str8 = str13;
                    if (suggestedBooking.getProviderId() == therapistPackagesModel7.getId()) {
                        z11 = true;
                        z12 = z15;
                        if (!z11 && !stringSetValue2.contains(suggestedBooking.getSessionDateTime())) {
                            String str15 = gk.a.f16573a;
                            Bundle a10 = b0.a("flow", "therapy");
                            StringBuilder sb2 = new StringBuilder();
                            SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d12 = wVar2.d();
                            if (d12 != null && (peekContent13 = d12.peekContent()) != null && (therapistPackagesModel6 = peekContent13.f19464u) != null) {
                                str11 = therapistPackagesModel6.getFirstname();
                            } else {
                                str11 = null;
                            }
                            sb2.append(str11);
                            sb2.append(' ');
                            SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d13 = wVar2.d();
                            if (d13 != null && (peekContent12 = d13.peekContent()) != null && (therapistPackagesModel5 = peekContent12.f19464u) != null) {
                                str12 = therapistPackagesModel5.getLastname();
                            } else {
                                str12 = null;
                            }
                            sb2.append(str12);
                            a10.putString("provider_name", sb2.toString());
                            SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d14 = wVar2.d();
                            if (d14 != null && (peekContent11 = d14.peekContent()) != null && (therapistPackagesModel4 = peekContent11.f19464u) != null) {
                                str2 = therapistPackagesModel4.getUuid();
                            }
                            a10.putString("provider_uuid", str2);
                            a10.putString("suggested_date_local", oVar.n(suggestedBooking.getSessionDateTime()).f19465v);
                            a10.putString("suggested_slot_local", suggestedBooking.getSlot());
                            a10.putString("suggested_mode", suggestedBooking.getMode());
                            a10.putString("client_id", String.valueOf(SessionManager.getInstance().getLongValue(SessionManager.KEY_USERID)));
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(a10, "next_session_prompt_received");
                            stringSetValue.add(suggestedBooking.getSessionDateTime());
                            z14 = z10;
                            z15 = true;
                        } else {
                            d10 = wVar.d();
                            if (d10 == null && (peekContent10 = d10.peekContent()) != null && suggestedBooking.getProviderId() == peekContent10.getId()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13 && !stringSetValue.contains(suggestedBooking.getSessionDateTime())) {
                                String str16 = gk.a.f16573a;
                                Bundle a11 = b0.a("flow", "psychiatry");
                                StringBuilder sb3 = new StringBuilder();
                                SingleUseEvent<TherapistPackagesModel> d15 = wVar.d();
                                if (d15 != null && (peekContent9 = d15.peekContent()) != null) {
                                    str9 = peekContent9.getFirstname();
                                } else {
                                    str9 = null;
                                }
                                sb3.append(str9);
                                sb3.append(' ');
                                SingleUseEvent<TherapistPackagesModel> d16 = wVar.d();
                                if (d16 != null && (peekContent8 = d16.peekContent()) != null) {
                                    str10 = peekContent8.getLastname();
                                } else {
                                    str10 = null;
                                }
                                sb3.append(str10);
                                a11.putString("provider_name", sb3.toString());
                                SingleUseEvent<TherapistPackagesModel> d17 = wVar.d();
                                if (d17 != null && (peekContent7 = d17.peekContent()) != null) {
                                    str2 = peekContent7.getUuid();
                                }
                                a11.putString("provider_uuid", str2);
                                a11.putString("suggested_date_local", oVar.n(suggestedBooking.getSessionDateTime()).f19465v);
                                a11.putString("suggested_slot_local", suggestedBooking.getSlot());
                                a11.putString("suggested_mode", suggestedBooking.getMode());
                                a11.putString("client_id", String.valueOf(SessionManager.getInstance().getLongValue(SessionManager.KEY_USERID)));
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(a11, "next_session_prompt_received");
                                stringSetValue2.add(suggestedBooking.getSessionDateTime());
                                z15 = z12;
                                z14 = true;
                            } else {
                                z14 = z10;
                                z15 = z12;
                            }
                        }
                        str14 = str;
                        str13 = str8;
                        it2 = it;
                    }
                } else {
                    str8 = str13;
                }
            } else {
                str8 = str13;
                it = it2;
            }
            z11 = false;
            z12 = z15;
            if (!z11) {
            }
            d10 = wVar.d();
            if (d10 == null) {
            }
            z13 = false;
            if (!z13) {
            }
            z14 = z10;
            z15 = z12;
            str14 = str;
            str13 = str8;
            it2 = it;
        }
        String str17 = str13;
        if (z15) {
            ApplicationPersistence.getInstance().setStringSetValue(str17, stringSetValue);
        }
        if (z10) {
            ApplicationPersistence.getInstance().setStringSetValue(str, stringSetValue2);
        }
        String stringValue = ApplicationPersistence.getInstance().getStringValue("cross_therapy_event");
        String stringValue2 = ApplicationPersistence.getInstance().getStringValue("cross_psychiatry_event");
        CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel2 = oVar.C;
        if (crossProviderRecommendationNotificationModel2 != null) {
            if (kotlin.jvm.internal.i.b(crossProviderRecommendationNotificationModel2.getId(), stringValue)) {
                crossProviderRecommendationNotificationModel2 = null;
            }
            if (crossProviderRecommendationNotificationModel2 != null) {
                String str18 = gk.a.f16573a;
                Bundle f = defpackage.e.f("flow", "therapy", "prompt_type", "psychiatry");
                StringBuilder sb4 = new StringBuilder();
                SingleUseEvent<TherapistPackagesModel> d18 = wVar.d();
                if (d18 != null && (peekContent6 = d18.peekContent()) != null) {
                    String firstname = peekContent6.getFirstname();
                    wVar3 = wVar2;
                    str5 = firstname;
                } else {
                    wVar3 = wVar2;
                    str5 = null;
                }
                sb4.append(str5);
                sb4.append(' ');
                SingleUseEvent<TherapistPackagesModel> d19 = wVar.d();
                if (d19 != null && (peekContent5 = d19.peekContent()) != null) {
                    str6 = peekContent5.getLastname();
                } else {
                    str6 = null;
                }
                sb4.append(str6);
                f.putString("provider_name", sb4.toString());
                SingleUseEvent<TherapistPackagesModel> d20 = wVar.d();
                if (d20 != null && (peekContent4 = d20.peekContent()) != null) {
                    str7 = peekContent4.getUuid();
                } else {
                    str7 = null;
                }
                f.putString("provider_uuid", str7);
                f.putString("client_id", String.valueOf(SessionManager.getInstance().getLongValue(SessionManager.KEY_USERID)));
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(f, "cross_referral_prompt_received");
                ApplicationPersistence.getInstance().setStringValue("cross_therapy_event", crossProviderRecommendationNotificationModel2.getId());
                crossProviderRecommendationNotificationModel = oVar.D;
                if (crossProviderRecommendationNotificationModel == null) {
                    if (kotlin.jvm.internal.i.b(crossProviderRecommendationNotificationModel.getId(), stringValue2)) {
                        crossProviderRecommendationNotificationModel = null;
                    }
                    if (crossProviderRecommendationNotificationModel != null) {
                        String str19 = gk.a.f16573a;
                        Bundle f2 = defpackage.e.f("flow", "psychiatry", "prompt_type", "therapy");
                        StringBuilder sb5 = new StringBuilder();
                        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d21 = wVar3.d();
                        if (d21 != null && (peekContent3 = d21.peekContent()) != null && (therapistPackagesModel3 = peekContent3.f19464u) != null) {
                            str3 = therapistPackagesModel3.getFirstname();
                        } else {
                            str3 = null;
                        }
                        sb5.append(str3);
                        sb5.append(' ');
                        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d22 = wVar3.d();
                        if (d22 != null && (peekContent2 = d22.peekContent()) != null && (therapistPackagesModel2 = peekContent2.f19464u) != null) {
                            str4 = therapistPackagesModel2.getLastname();
                        } else {
                            str4 = null;
                        }
                        sb5.append(str4);
                        f2.putString("provider_name", sb5.toString());
                        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d23 = wVar3.d();
                        if (d23 != null && (peekContent = d23.peekContent()) != null && (therapistPackagesModel = peekContent.f19464u) != null) {
                            str2 = therapistPackagesModel.getUuid();
                        }
                        f2.putString("provider_uuid", str2);
                        f2.putString("client_id", String.valueOf(SessionManager.getInstance().getLongValue(SessionManager.KEY_USERID)));
                        hs.k kVar4 = hs.k.f19476a;
                        gk.a.b(f2, "cross_referral_prompt_received");
                        ApplicationPersistence.getInstance().setStringValue("cross_psychiatry_event", crossProviderRecommendationNotificationModel.getId());
                        return;
                    }
                    return;
                }
                return;
            }
        }
        wVar3 = wVar2;
        crossProviderRecommendationNotificationModel = oVar.D;
        if (crossProviderRecommendationNotificationModel == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r1 != null) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(o oVar) {
        boolean z10;
        TherapistPackagesModel peekContent;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent2;
        TherapistPackagesModel therapistPackagesModel;
        Integer num;
        Integer num2;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent3;
        TherapistPackagesModel therapistPackagesModel2;
        Integer num3;
        TherapistPackagesModel peekContent4;
        Integer num4;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent5;
        TherapistPackagesModel therapistPackagesModel3;
        Integer num5;
        Integer num6;
        oVar.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            UpcomingBooking upcomingBooking = oVar.G;
            if (upcomingBooking != null) {
                arrayList.add(new hs.f(b.UPCOMING_IMMEDIATE_THERAPY, upcomingBooking));
            }
            UpcomingBooking upcomingBooking2 = oVar.I;
            if (upcomingBooking2 != null) {
                arrayList.add(new hs.f(b.UPCOMING_IMMEDIATE_PSYCHIATRY, upcomingBooking2));
            }
            UpcomingBooking upcomingBooking3 = oVar.H;
            if (upcomingBooking3 != null) {
                arrayList.add(new hs.f(b.UPCOMING_IMMEDIATE_COUPLES, upcomingBooking3));
            }
            List<UpcomingBooking> list = oVar.F;
            w<SingleUseEvent<TherapistPackagesModel>> wVar = oVar.A;
            w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar2 = oVar.f39567z;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                UpcomingBooking upcomingBooking4 = oVar.G;
                if (upcomingBooking4 != null) {
                    num = Integer.valueOf(upcomingBooking4.getId());
                } else {
                    num = null;
                }
                if (num == null) {
                    UpcomingBooking upcomingBooking5 = oVar.I;
                    if (upcomingBooking5 != null) {
                        num5 = Integer.valueOf(upcomingBooking5.getId());
                    } else {
                        num5 = null;
                    }
                    if (num5 == null) {
                        UpcomingBooking upcomingBooking6 = oVar.H;
                        if (upcomingBooking6 != null) {
                            num6 = Integer.valueOf(upcomingBooking6.getId());
                        } else {
                            num6 = null;
                        }
                    }
                }
                is.q.U1(arrayList2, new d(oVar));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    UpcomingBooking upcomingBooking7 = (UpcomingBooking) it.next();
                    if (upcomingBooking7.getTherapistId() != null && kotlin.jvm.internal.i.b(upcomingBooking7.getBookingtype(), "single")) {
                        Integer therapistId = upcomingBooking7.getTherapistId();
                        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10 = wVar2.d();
                        if (d10 != null && (peekContent5 = d10.peekContent()) != null && (therapistPackagesModel3 = peekContent5.f19464u) != null) {
                            num4 = Integer.valueOf(therapistPackagesModel3.getId());
                        } else {
                            num4 = null;
                        }
                        if (kotlin.jvm.internal.i.b(therapistId, num4)) {
                            arrayList.add(new hs.f(b.UPCOMING_THERAPY, upcomingBooking7));
                        }
                    }
                    if (upcomingBooking7.getPsychiatristId() != null) {
                        Integer psychiatristId = upcomingBooking7.getPsychiatristId();
                        SingleUseEvent<TherapistPackagesModel> d11 = wVar.d();
                        if (d11 != null && (peekContent4 = d11.peekContent()) != null) {
                            num3 = Integer.valueOf(peekContent4.getId());
                        } else {
                            num3 = null;
                        }
                        if (kotlin.jvm.internal.i.b(psychiatristId, num3)) {
                            arrayList.add(new hs.f(b.UPCOMING_PSYCHIATRY, upcomingBooking7));
                        }
                    }
                    if (upcomingBooking7.getTherapistId() != null && kotlin.jvm.internal.i.b(upcomingBooking7.getBookingtype(), "couple")) {
                        Integer therapistId2 = upcomingBooking7.getTherapistId();
                        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d12 = wVar2.d();
                        if (d12 != null && (peekContent3 = d12.peekContent()) != null && (therapistPackagesModel2 = peekContent3.f19465v) != null) {
                            num2 = Integer.valueOf(therapistPackagesModel2.getId());
                        } else {
                            num2 = null;
                        }
                        if (kotlin.jvm.internal.i.b(therapistId2, num2)) {
                            arrayList.add(new hs.f(b.UPCOMING_COUPLES, upcomingBooking7));
                        }
                    }
                }
            }
            for (SuggestedBooking suggestedBooking : oVar.E) {
                SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d13 = wVar2.d();
                boolean z11 = true;
                if (d13 != null && (peekContent2 = d13.peekContent()) != null && (therapistPackagesModel = peekContent2.f19464u) != null && therapistPackagesModel.getId() == suggestedBooking.getProviderId()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(new hs.f(b.SUGGESTED_THERAPY, suggestedBooking));
                }
                SingleUseEvent<TherapistPackagesModel> d14 = wVar.d();
                if (d14 == null || (peekContent = d14.peekContent()) == null || peekContent.getId() != suggestedBooking.getProviderId()) {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(new hs.f(b.SUGGESTED_PSYCHIATRY, suggestedBooking));
                }
            }
            oVar.J.i(new SingleUseEvent<>(is.u.D2(arrayList, new c(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withLocale(Locale.ENGLISH), LocalDateTime.now()))));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(oVar.f39566y, e10);
        }
    }

    public static final Object g(o oVar, boolean z10, ls.d dVar) {
        oVar.getClass();
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            ta.v.H(kc.f.H(oVar), null, 0, new g(oVar, z10, hVar, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(oVar.f39566y, e10);
            hVar.resumeWith(Boolean.FALSE);
        }
        return hVar.b();
    }

    public static final Object h(o oVar, boolean z10, ls.d dVar) {
        oVar.getClass();
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        ta.v.H(kc.f.H(oVar), null, 0, new j(oVar, null, kVar, z10), 3);
        return kVar.s();
    }

    public static final Object i(o oVar, boolean z10, ls.d dVar) {
        oVar.getClass();
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        ta.v.H(kc.f.H(oVar), null, 0, new k(oVar, null, kVar, z10), 3);
        return kVar.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r2 != null) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0.resumeWith(java.lang.Boolean.FALSE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(o oVar, boolean z10, ls.d dVar) {
        Integer num;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
        TherapistPackagesModel therapistPackagesModel;
        Integer num2;
        TherapistPackagesModel peekContent2;
        oVar.getClass();
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        if (z10) {
            try {
                SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10 = oVar.f39567z.d();
                if (d10 != null && (peekContent = d10.peekContent()) != null && (therapistPackagesModel = peekContent.f19464u) != null) {
                    num = new Integer(therapistPackagesModel.getId());
                } else {
                    num = null;
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(oVar.f39566y, e10);
            }
        }
        if (!z10) {
            SingleUseEvent<TherapistPackagesModel> d11 = oVar.A.d();
            if (d11 != null && (peekContent2 = d11.peekContent()) != null) {
                num2 = new Integer(peekContent2.getId());
            } else {
                num2 = null;
            }
        }
        ta.v.H(kc.f.H(oVar), o0.f23642c, 0, new l(oVar, z10, hVar, null), 2);
        return hVar.b();
    }

    public static final void k(o oVar, JSONObject jSONObject) {
        boolean z10;
        w<SingleUseEvent<TherapistPackagesModel>> wVar = oVar.A;
        try {
            if (jSONObject != null) {
                TherapistPackagesModel therapistPackagesModel = new TherapistPackagesModel();
                if (jSONObject.has("psychiatrist")) {
                    String optString = jSONObject.optString("psychiatrist", "");
                    if (optString != null && !gv.n.B0(optString)) {
                        z10 = false;
                        if (!z10 && !kotlin.jvm.internal.i.b(jSONObject.getString("psychiatrist"), "null")) {
                            Utils utils = Utils.INSTANCE;
                            JSONObject jSONObject2 = jSONObject.getJSONObject("psychiatrist");
                            kotlin.jvm.internal.i.f(jSONObject2, "obj.getJSONObject(\"psychiatrist\")");
                            utils.parseTherapistObject(therapistPackagesModel, jSONObject2);
                            wVar.i(new SingleUseEvent<>(therapistPackagesModel));
                            return;
                        }
                    }
                    z10 = true;
                    if (!z10) {
                        Utils utils2 = Utils.INSTANCE;
                        JSONObject jSONObject22 = jSONObject.getJSONObject("psychiatrist");
                        kotlin.jvm.internal.i.f(jSONObject22, "obj.getJSONObject(\"psychiatrist\")");
                        utils2.parseTherapistObject(therapistPackagesModel, jSONObject22);
                        wVar.i(new SingleUseEvent<>(therapistPackagesModel));
                        return;
                    }
                }
                wVar.i(null);
                return;
            }
            wVar.i(null);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(oVar.f39566y, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: Exception -> 0x0096, TryCatch #0 {Exception -> 0x0096, blocks: (B:4:0x0009, B:7:0x001f, B:9:0x0025, B:15:0x0031, B:17:0x003b, B:19:0x004c, B:21:0x0052, B:23:0x0058, B:29:0x0064, B:31:0x006e, B:32:0x007d, B:38:0x0088, B:39:0x0092), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(o oVar, JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        boolean z12;
        w<SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>>> wVar = oVar.f39567z;
        TherapistPackagesModel therapistPackagesModel = null;
        try {
            if (jSONObject != null) {
                TherapistPackagesModel therapistPackagesModel2 = new TherapistPackagesModel();
                TherapistPackagesModel therapistPackagesModel3 = new TherapistPackagesModel();
                boolean z13 = false;
                if (jSONObject.has("therapist")) {
                    String optString = jSONObject.optString("therapist", "");
                    if (optString != null && !gv.n.B0(optString)) {
                        z12 = false;
                        if (!z12 && !kotlin.jvm.internal.i.b(jSONObject.optString("therapist", ""), "null")) {
                            Utils utils = Utils.INSTANCE;
                            JSONObject jSONObject2 = jSONObject.getJSONObject("therapist");
                            kotlin.jvm.internal.i.f(jSONObject2, "obj.getJSONObject(\"therapist\")");
                            utils.parseTherapistObject(therapistPackagesModel2, jSONObject2);
                            z10 = true;
                            if (jSONObject.has("couplestherapist")) {
                                String optString2 = jSONObject.optString("couplestherapist", "");
                                if (optString2 != null && !gv.n.B0(optString2)) {
                                    z11 = false;
                                    if (!z11 && !kotlin.jvm.internal.i.b(jSONObject.optString("couplestherapist", ""), "null")) {
                                        Utils utils2 = Utils.INSTANCE;
                                        JSONObject jSONObject3 = jSONObject.getJSONObject("couplestherapist");
                                        kotlin.jvm.internal.i.f(jSONObject3, "obj.getJSONObject(\"couplestherapist\")");
                                        utils2.parseTherapistObject(therapistPackagesModel3, jSONObject3);
                                        z13 = true;
                                    }
                                }
                                z11 = true;
                                if (!z11) {
                                    Utils utils22 = Utils.INSTANCE;
                                    JSONObject jSONObject32 = jSONObject.getJSONObject("couplestherapist");
                                    kotlin.jvm.internal.i.f(jSONObject32, "obj.getJSONObject(\"couplestherapist\")");
                                    utils22.parseTherapistObject(therapistPackagesModel3, jSONObject32);
                                    z13 = true;
                                }
                            }
                            if (!z10) {
                                therapistPackagesModel2 = null;
                            }
                            if (z13) {
                                therapistPackagesModel = therapistPackagesModel3;
                            }
                            wVar.i(new SingleUseEvent<>(new hs.f(therapistPackagesModel2, therapistPackagesModel)));
                            return;
                        }
                    }
                    z12 = true;
                    if (!z12) {
                        Utils utils3 = Utils.INSTANCE;
                        JSONObject jSONObject22 = jSONObject.getJSONObject("therapist");
                        kotlin.jvm.internal.i.f(jSONObject22, "obj.getJSONObject(\"therapist\")");
                        utils3.parseTherapistObject(therapistPackagesModel2, jSONObject22);
                        z10 = true;
                        if (jSONObject.has("couplestherapist")) {
                        }
                        if (!z10) {
                        }
                        if (z13) {
                        }
                        wVar.i(new SingleUseEvent<>(new hs.f(therapistPackagesModel2, therapistPackagesModel)));
                        return;
                    }
                }
                z10 = false;
                if (jSONObject.has("couplestherapist")) {
                }
                if (!z10) {
                }
                if (z13) {
                }
                wVar.i(new SingleUseEvent<>(new hs.f(therapistPackagesModel2, therapistPackagesModel)));
                return;
            }
            wVar.i(null);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(oVar.f39566y, e10);
        }
    }

    public static final ArrayList m(o oVar) {
        boolean z10;
        boolean z11;
        List<hs.f<b, Object>> peekContent;
        ArrayList arrayList = new ArrayList();
        try {
            SingleUseEvent<List<hs.f<b, Object>>> d10 = oVar.J.d();
            if (d10 != null && (peekContent = d10.peekContent()) != null) {
                Iterator<T> it = peekContent.iterator();
                z10 = false;
                z11 = false;
                while (it.hasNext()) {
                    hs.f fVar = (hs.f) it.next();
                    if (is.k.Q1(fVar.f19464u, new b[]{b.UPCOMING_THERAPY, b.UPCOMING_IMMEDIATE_THERAPY})) {
                        z10 = true;
                    }
                    if (is.k.Q1(fVar.f19464u, new b[]{b.UPCOMING_PSYCHIATRY, b.UPCOMING_IMMEDIATE_PSYCHIATRY})) {
                        z11 = true;
                    }
                }
            } else {
                z10 = false;
                z11 = false;
            }
            if (z10 || z11) {
                if (oVar.L.isEmpty() && ((!oVar.N.isEmpty()) || z10)) {
                    boolean booleanValue = ApplicationPersistence.getInstance().getBooleanValue("expert_bse_tip_therapy", false);
                    boolean booleanValue2 = ApplicationPersistence.getInstance().getBooleanValue("expert_bse_prep_therapy", false);
                    if (!booleanValue) {
                        arrayList.add(new vl.f(2, true, null, 4));
                    }
                    if (!booleanValue2) {
                        arrayList.add(new vl.f(3, true, null, 4));
                    }
                }
                if (oVar.M.isEmpty() && ((!oVar.O.isEmpty()) || z11)) {
                    boolean booleanValue3 = ApplicationPersistence.getInstance().getBooleanValue("expert_bse_tip_psychiatry", false);
                    boolean booleanValue4 = ApplicationPersistence.getInstance().getBooleanValue("expert_bse_prep_psychiatry", false);
                    if (!booleanValue3) {
                        arrayList.add(new vl.f(4, false, null, 6));
                    }
                    if (!booleanValue4) {
                        arrayList.add(new vl.f(5, false, null, 6));
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(oVar.f39566y, e10);
        }
        return arrayList;
    }

    public final hs.f<String, String> n(String str) {
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Locale locale = Locale.ENGLISH;
        DateTimeFormatter withLocale = ofPattern.withLocale(locale);
        DateTimeFormatter withLocale2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS+05:30").withLocale(locale);
        LocalDateTime parse = LocalDateTime.parse(str, withLocale);
        kotlin.jvm.internal.i.f(parse, "parse(dateTimeString, dateFormat)");
        String format = parse.format(withLocale2);
        kotlin.jvm.internal.i.f(format, "bookingDate.format(requiredFormat)");
        String format2 = parse.D(ZoneId.systemDefault()).v(ZoneOffset.UTC).s().format(withLocale2);
        kotlin.jvm.internal.i.f(format2, "bookingDate.atZone(ZoneI…().format(requiredFormat)");
        return new hs.f<>(format2, format);
    }
}
