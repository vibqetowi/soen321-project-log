package dl;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.utils.V3DashboardUtils;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class e2 extends kotlin.jvm.internal.k implements ss.l<ArrayList<TherapistPackagesModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13011u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13011u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(ArrayList<TherapistPackagesModel> arrayList) {
        boolean z10;
        ArrayList<TherapistPackagesModel> arrayList2;
        Object obj;
        RecyclerView.e eVar;
        qp.b bVar;
        View childAt;
        final RecyclerView recyclerView;
        View childAt2;
        RecyclerView recyclerView2;
        View childAt3;
        RecyclerView recyclerView3;
        View childAt4;
        RecyclerView recyclerView4;
        RecyclerView.e eVar2;
        qp.d dVar;
        View childAt5;
        final RecyclerView recyclerView5;
        View childAt6;
        RecyclerView recyclerView6;
        View childAt7;
        RecyclerView recyclerView7;
        View childAt8;
        RecyclerView recyclerView8;
        boolean z11;
        HashMap<String, Object> appConfig;
        ArrayList<TherapistPackagesModel> arrayList3 = arrayList;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (arrayList3.size() > 5) {
                arrayList2 = new ArrayList<>(arrayList3.subList(0, 5));
            } else {
                arrayList2 = arrayList3;
            }
            int i6 = V3DashboardActivity.f10714r1;
            final V3DashboardActivity v3DashboardActivity = this.f13011u;
            v3DashboardActivity.getClass();
            try {
                ((LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment)).setVisibility(0);
                v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperimentFooter).setVisibility(0);
                User user = FirebasePersistence.getInstance().getUser();
                String str = null;
                if (user != null && (appConfig = user.getAppConfig()) != null) {
                    obj = appConfig.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                } else {
                    obj = null;
                }
                if (kotlin.jvm.internal.i.b(obj, "e")) {
                    int i10 = 0;
                    for (Object obj2 : arrayList2) {
                        int i11 = i10 + 1;
                        if (i10 >= 0) {
                            TherapistPackagesModel therapistPackagesModel = (TherapistPackagesModel) obj2;
                            if (i10 == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            therapistPackagesModel.setIs_recommended(z11);
                            i10 = i11;
                        } else {
                            ca.a.t1();
                            throw null;
                        }
                    }
                    LinearLayout linearLayout = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                    if (linearLayout != null && (childAt8 = linearLayout.getChildAt(0)) != null && (recyclerView8 = (RecyclerView) childAt8.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                        eVar2 = recyclerView8.getAdapter();
                    } else {
                        eVar2 = null;
                    }
                    if (eVar2 instanceof qp.d) {
                        dVar = (qp.d) eVar2;
                    } else {
                        dVar = null;
                    }
                    V3DashboardUtils v3DashboardUtils = v3DashboardActivity.B;
                    if (dVar != null) {
                        Timer timer = v3DashboardActivity.N0;
                        if (timer != null) {
                            timer.cancel();
                        }
                        v3DashboardActivity.N0 = null;
                        dVar.f29998x = arrayList2;
                        dVar.i();
                        RobertoTextView robertoTextView = (RobertoTextView) v3DashboardActivity.n0(R.id.tvProviderEntryVar2CardTitle);
                        Object[] objArr = new Object[1];
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null) {
                            str = user2.getCurrentCourseName();
                        }
                        v3DashboardUtils.getClass();
                        objArr[0] = V3DashboardUtils.g(str);
                        robertoTextView.setText(v3DashboardActivity.getString(R.string.teleEntryCardVarEHeader, objArr));
                        LinearLayout linearLayout2 = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                        if (linearLayout2 != null && (childAt7 = linearLayout2.getChildAt(0)) != null && (recyclerView7 = (RecyclerView) childAt7.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                            recyclerView7.h0(5000);
                        }
                        LinearLayout linearLayout3 = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                        if (linearLayout3 != null && (childAt6 = linearLayout3.getChildAt(0)) != null && (recyclerView6 = (RecyclerView) childAt6.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                            recyclerView6.k0(10, 0, false);
                        }
                        Timer timer2 = new Timer();
                        v3DashboardActivity.N0 = timer2;
                        timer2.scheduleAtFixedRate(new h1(v3DashboardActivity), 8000L, 5000L);
                    } else {
                        LinearLayout linearLayout4 = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                        if (linearLayout4 != null && (childAt5 = linearLayout4.getChildAt(0)) != null && (recyclerView5 = (RecyclerView) childAt5.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                            recyclerView5.setAdapter(new qp.d(v3DashboardActivity, arrayList2, new i1(v3DashboardActivity, v3DashboardActivity), new j1(v3DashboardActivity, v3DashboardActivity), new k1(v3DashboardActivity, v3DashboardActivity)));
                            recyclerView5.post(new Runnable() { // from class: dl.y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = r4;
                                    V3DashboardActivity this$0 = v3DashboardActivity;
                                    V3DashboardActivity this_run = v3DashboardActivity;
                                    RecyclerView this_apply = recyclerView5;
                                    switch (i12) {
                                        case 0:
                                            int i13 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            try {
                                                this_apply.h0(5000);
                                                this_apply.k0(10, 0, false);
                                                Timer timer3 = new Timer();
                                                this_run.N0 = timer3;
                                                timer3.scheduleAtFixedRate(new l1(this$0, this_run), 8000L, 5000L);
                                                this_apply.h(new m1(this_run));
                                                return;
                                            } catch (Exception e10) {
                                                LogHelper.INSTANCE.e(this_run.f10748v, e10);
                                                return;
                                            }
                                        default:
                                            int i14 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            try {
                                                this_apply.h0(5000);
                                                this_apply.k0(10, 0, false);
                                                Timer timer4 = new Timer();
                                                this_run.N0 = timer4;
                                                timer4.scheduleAtFixedRate(new p1(this$0, this_run), 8000L, 5000L);
                                                this_apply.h(new q1(this_run));
                                                return;
                                            } catch (Exception e11) {
                                                LogHelper.INSTANCE.e(this_run.f10748v, e11);
                                                return;
                                            }
                                    }
                                }
                            });
                        }
                        ((RobertoButton) v3DashboardActivity.n0(R.id.tvProviderEntryVar2CardCTA)).setText(v3DashboardActivity.getString(R.string.teleEntryCardVarECTA));
                        ((RobertoButton) v3DashboardActivity.n0(R.id.tvProviderEntryVar2CardCTA)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(v3DashboardActivity, R.color.campaignLightBlue)));
                        ((RobertoTextView) v3DashboardActivity.n0(R.id.tvProviderEntryVar2CardCtaDescription)).setVisibility(0);
                        RobertoTextView robertoTextView2 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvProviderEntryVar2CardTitle);
                        Object[] objArr2 = new Object[1];
                        User user3 = FirebasePersistence.getInstance().getUser();
                        if (user3 != null) {
                            str = user3.getCurrentCourseName();
                        }
                        v3DashboardUtils.getClass();
                        objArr2[0] = V3DashboardUtils.g(str);
                        robertoTextView2.setText(v3DashboardActivity.getString(R.string.teleEntryCardVarEHeader, objArr2));
                    }
                } else {
                    LinearLayout linearLayout5 = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                    if (linearLayout5 != null && (childAt4 = linearLayout5.getChildAt(0)) != null && (recyclerView4 = (RecyclerView) childAt4.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                        eVar = recyclerView4.getAdapter();
                    } else {
                        eVar = null;
                    }
                    if (eVar instanceof qp.b) {
                        bVar = (qp.b) eVar;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        Timer timer3 = v3DashboardActivity.N0;
                        if (timer3 != null) {
                            timer3.cancel();
                        }
                        v3DashboardActivity.N0 = null;
                        bVar.f29985x = arrayList2;
                        bVar.i();
                        LinearLayout linearLayout6 = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                        if (linearLayout6 != null && (childAt3 = linearLayout6.getChildAt(0)) != null && (recyclerView3 = (RecyclerView) childAt3.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                            recyclerView3.h0(5000);
                        }
                        LinearLayout linearLayout7 = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                        if (linearLayout7 != null && (childAt2 = linearLayout7.getChildAt(0)) != null && (recyclerView2 = (RecyclerView) childAt2.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                            recyclerView2.k0(10, 0, false);
                        }
                        Timer timer4 = new Timer();
                        v3DashboardActivity.N0 = timer4;
                        timer4.scheduleAtFixedRate(new n1(v3DashboardActivity), 8000L, 5000L);
                    } else {
                        LinearLayout linearLayout8 = (LinearLayout) v3DashboardActivity.n0(R.id.llDashboardProviderEntryPointExperiment);
                        if (linearLayout8 != null && (childAt = linearLayout8.getChildAt(0)) != null && (recyclerView = (RecyclerView) childAt.findViewById(R.id.tvProviderEntryVar2CardRecycler)) != null) {
                            recyclerView.setAdapter(new qp.b(arrayList2, false, true, new o1(v3DashboardActivity, v3DashboardActivity)));
                            recyclerView.post(new Runnable() { // from class: dl.y
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = r4;
                                    V3DashboardActivity this$0 = v3DashboardActivity;
                                    V3DashboardActivity this_run = v3DashboardActivity;
                                    RecyclerView this_apply = recyclerView;
                                    switch (i12) {
                                        case 0:
                                            int i13 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            try {
                                                this_apply.h0(5000);
                                                this_apply.k0(10, 0, false);
                                                Timer timer32 = new Timer();
                                                this_run.N0 = timer32;
                                                timer32.scheduleAtFixedRate(new l1(this$0, this_run), 8000L, 5000L);
                                                this_apply.h(new m1(this_run));
                                                return;
                                            } catch (Exception e10) {
                                                LogHelper.INSTANCE.e(this_run.f10748v, e10);
                                                return;
                                            }
                                        default:
                                            int i14 = V3DashboardActivity.f10714r1;
                                            kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                                            kotlin.jvm.internal.i.g(this_run, "$this_run");
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            try {
                                                this_apply.h0(5000);
                                                this_apply.k0(10, 0, false);
                                                Timer timer42 = new Timer();
                                                this_run.N0 = timer42;
                                                timer42.scheduleAtFixedRate(new p1(this$0, this_run), 8000L, 5000L);
                                                this_apply.h(new q1(this_run));
                                                return;
                                            } catch (Exception e11) {
                                                LogHelper.INSTANCE.e(this_run.f10748v, e11);
                                                return;
                                            }
                                    }
                                }
                            });
                        }
                    }
                }
                v3DashboardActivity.s1();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
