package dl;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.TypeOfPackageModel;
import com.theinnerhour.b2b.model.UpcomingSessionModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class p0 extends kotlin.jvm.internal.k implements ss.l<ArrayList<UpcomingSessionModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ml.p f13088u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13089v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(V3DashboardActivity v3DashboardActivity, ml.p pVar) {
        super(1);
        this.f13088u = pVar;
        this.f13089v = v3DashboardActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x022b A[EDGE_INSN: B:140:0x022b->B:112:0x022b ?: BREAK  , SYNTHETIC] */
    @Override // ss.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke(ArrayList<UpcomingSessionModel> arrayList) {
        Integer num;
        Integer num2;
        Integer num3;
        Object obj;
        hs.k kVar;
        RobertoTextView robertoTextView;
        boolean z10;
        boolean z11;
        String str;
        TherapistPackagesModel therapistPackagesModel;
        TherapistPackagesModel therapistPackagesModel2;
        Object obj2;
        hs.k kVar2;
        RobertoTextView robertoTextView2;
        boolean z12;
        boolean z13;
        TherapistPackagesModel therapistPackagesModel3;
        TherapistPackagesModel therapistPackagesModel4;
        Object obj3;
        hs.k kVar3;
        RobertoTextView robertoTextView3;
        boolean z14;
        ArrayList<UpcomingSessionModel> arrayList2 = arrayList;
        if (arrayList2 != null) {
            ml.p pVar = this.f13088u;
            TherapistPackagesModel d10 = pVar.B.d();
            if (d10 != null) {
                num = Integer.valueOf(d10.getId());
            } else {
                num = null;
            }
            V3DashboardActivity v3DashboardActivity = this.f13089v;
            if (num != null) {
                Iterator<T> it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        UpcomingSessionModel upcomingSessionModel = (UpcomingSessionModel) obj3;
                        TherapistPackagesModel d11 = pVar.B.d();
                        if (d11 != null && upcomingSessionModel.getPsychiatristId() == d11.getId()) {
                            z14 = true;
                            continue;
                        } else {
                            z14 = false;
                            continue;
                        }
                        if (z14) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                UpcomingSessionModel upcomingSessionModel2 = (UpcomingSessionModel) obj3;
                if (upcomingSessionModel2 != null) {
                    String date = upcomingSessionModel2.getDatetime_at_customer_timezone_model().getDate();
                    kotlin.jvm.internal.i.f(date, "session.datetime_at_customer_timezone_model.date");
                    String[] strArr = (String[]) gv.r.a1(date, new String[]{"-"}, 0, 6).toArray(new String[0]);
                    String substring = strArr[0].substring(2);
                    kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                    String str2 = strArr[1];
                    String str3 = strArr[2];
                    RobertoTextView robertoTextView4 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvDashboardProviderAssignedPsychiatristNextSession);
                    if (robertoTextView4 != null) {
                        robertoTextView4.setVisibility(0);
                    }
                    RobertoTextView robertoTextView5 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvDashboardProviderAssignedPsychiatristNextSession);
                    if (robertoTextView5 != null) {
                        robertoTextView5.setText(v3DashboardActivity.getString(R.string.telecommunicationsDbNextSession, str3 + '/' + str2 + '/' + substring));
                    }
                    kVar3 = hs.k.f19476a;
                } else {
                    kVar3 = null;
                }
                if (kVar3 == null && (robertoTextView3 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvDashboardProviderAssignedPsychiatristNextSession)) != null) {
                    robertoTextView3.setVisibility(8);
                }
            }
            androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar = pVar.A;
            hs.f<TherapistPackagesModel, TherapistPackagesModel> d12 = wVar.d();
            if (d12 != null && (therapistPackagesModel4 = d12.f19465v) != null) {
                num2 = Integer.valueOf(therapistPackagesModel4.getId());
            } else {
                num2 = null;
            }
            if (num2 != null) {
                Iterator<T> it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        UpcomingSessionModel upcomingSessionModel3 = (UpcomingSessionModel) obj2;
                        hs.f<TherapistPackagesModel, TherapistPackagesModel> d13 = wVar.d();
                        if (d13 != null && (therapistPackagesModel3 = d13.f19465v) != null && upcomingSessionModel3.getTherapistId() == therapistPackagesModel3.getId()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12 && kotlin.jvm.internal.i.b(upcomingSessionModel3.getSubscribedpackage().getPackagetype(), "couple-package")) {
                            z13 = true;
                            continue;
                        } else {
                            z13 = false;
                            continue;
                        }
                        if (z13) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                UpcomingSessionModel upcomingSessionModel4 = (UpcomingSessionModel) obj2;
                if (upcomingSessionModel4 != null) {
                    String date2 = upcomingSessionModel4.getDatetime_at_customer_timezone_model().getDate();
                    kotlin.jvm.internal.i.f(date2, "session.datetime_at_customer_timezone_model.date");
                    String[] strArr2 = (String[]) gv.r.a1(date2, new String[]{"-"}, 0, 6).toArray(new String[0]);
                    String substring2 = strArr2[0].substring(2);
                    kotlin.jvm.internal.i.f(substring2, "this as java.lang.String).substring(startIndex)");
                    String str4 = strArr2[1];
                    String str5 = strArr2[2];
                    RobertoTextView robertoTextView6 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvDashboardProviderAssignedCouplesTherapistNextSession);
                    if (robertoTextView6 != null) {
                        robertoTextView6.setVisibility(0);
                    }
                    RobertoTextView robertoTextView7 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvDashboardProviderAssignedCouplesTherapistNextSession);
                    if (robertoTextView7 != null) {
                        robertoTextView7.setText(v3DashboardActivity.getString(R.string.telecommunicationsDbNextSession, str5 + '/' + str4 + '/' + substring2));
                    }
                    kVar2 = hs.k.f19476a;
                } else {
                    kVar2 = null;
                }
                if (kVar2 == null && (robertoTextView2 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvDashboardProviderAssignedCouplesTherapistNextSession)) != null) {
                    robertoTextView2.setVisibility(8);
                }
            }
            hs.f<TherapistPackagesModel, TherapistPackagesModel> d14 = wVar.d();
            if (d14 != null && (therapistPackagesModel2 = d14.f19464u) != null) {
                num3 = Integer.valueOf(therapistPackagesModel2.getId());
            } else {
                num3 = null;
            }
            if (num3 != null) {
                Iterator<T> it3 = arrayList2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        UpcomingSessionModel upcomingSessionModel5 = (UpcomingSessionModel) obj;
                        hs.f<TherapistPackagesModel, TherapistPackagesModel> d15 = wVar.d();
                        if (d15 != null && (therapistPackagesModel = d15.f19464u) != null && upcomingSessionModel5.getTherapistId() == therapistPackagesModel.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            String[] strArr3 = {"open-package", "guide-package"};
                            TypeOfPackageModel subscribedpackage = upcomingSessionModel5.getSubscribedpackage();
                            if (subscribedpackage != null) {
                                str = subscribedpackage.getPackagetype();
                            } else {
                                str = null;
                            }
                            if (is.k.Q1(str, strArr3)) {
                                z11 = true;
                                continue;
                                if (z11) {
                                    break;
                                }
                            }
                        }
                        z11 = false;
                        continue;
                        if (z11) {
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                UpcomingSessionModel upcomingSessionModel6 = (UpcomingSessionModel) obj;
                if (upcomingSessionModel6 != null) {
                    String date3 = upcomingSessionModel6.getDatetime_at_customer_timezone_model().getDate();
                    kotlin.jvm.internal.i.f(date3, "session.datetime_at_customer_timezone_model.date");
                    String[] strArr4 = (String[]) gv.r.a1(date3, new String[]{"-"}, 0, 6).toArray(new String[0]);
                    String substring3 = strArr4[0].substring(2);
                    kotlin.jvm.internal.i.f(substring3, "this as java.lang.String).substring(startIndex)");
                    String str6 = strArr4[1];
                    String str7 = strArr4[2];
                    RobertoTextView robertoTextView8 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvDashboardProviderAssignedTherapistNextSession);
                    if (robertoTextView8 != null) {
                        robertoTextView8.setVisibility(0);
                    }
                    RobertoTextView robertoTextView9 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvDashboardProviderAssignedTherapistNextSession);
                    if (robertoTextView9 != null) {
                        robertoTextView9.setText(v3DashboardActivity.getString(R.string.telecommunicationsDbNextSession, str7 + '/' + str6 + '/' + substring3));
                    }
                    kVar = hs.k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null && (robertoTextView = (RobertoTextView) v3DashboardActivity.n0(R.id.tvDashboardProviderAssignedTherapistNextSession)) != null) {
                    robertoTextView.setVisibility(8);
                }
            }
        }
        return hs.k.f19476a;
    }
}
