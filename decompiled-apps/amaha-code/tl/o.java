package tl;

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import cm.c0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.TrackCustomGoalActivity;
import com.theinnerhour.b2b.components.resetprogram.activity.ResetProgrammeLoadingActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.a1;
import fq.q0;
import hr.i5;
import hr.l7;
import hr.p5;
import hr.s5;
import hr.s7;
import kotlin.jvm.internal.x;
import nn.b0;
import nn.c;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33257u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f33258v;

    public /* synthetic */ o(int i6, Object obj) {
        this.f33257u = i6;
        this.f33258v = obj;
    }

    /* JADX WARN: Type inference failed for: r2v35, types: [T, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // java.lang.Runnable
    public final void run() {
        String valueOf;
        String valueOf2;
        RecyclerView recyclerView;
        int i6 = this.f33257u;
        Object obj = this.f33258v;
        switch (i6) {
            case 0:
                q this$0 = (q) obj;
                int i10 = q.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvExpertCareInfoListingRecycler);
                if (recyclerView2 != null) {
                    recyclerView2.h(new v(this$0));
                    return;
                }
                return;
            case 1:
                TrackCustomGoalActivity this$02 = (TrackCustomGoalActivity) obj;
                int i11 = TrackCustomGoalActivity.c.f11170v;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                StringBuilder sb2 = new StringBuilder();
                long j10 = this$02.f11166z;
                if (j10 < 10) {
                    valueOf = "0" + this$02.f11166z;
                } else {
                    valueOf = String.valueOf(j10);
                }
                sb2.append(valueOf);
                sb2.append(':');
                long j11 = this$02.A;
                if (j11 < 10) {
                    valueOf2 = "0" + this$02.A;
                } else {
                    valueOf2 = String.valueOf(j11);
                }
                sb2.append(valueOf2);
                String sb3 = sb2.toString();
                RobertoTextView robertoTextView = (RobertoTextView) this$02.u0(R.id.timer);
                if (robertoTextView != null) {
                    robertoTextView.setText(sb3);
                }
                f0.t tVar = this$02.C;
                if (tVar != null) {
                    Object systemService = this$02.getSystemService("notification");
                    kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    tVar.d(sb3);
                    ((NotificationManager) systemService).notify(Constants.CUSTOM_TRACK_NOTIFICATION_ID, tVar.b());
                    return;
                }
                return;
            case 2:
                cm.g this$03 = (cm.g) obj;
                int i12 = cm.g.E;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                RobertoEditText robertoEditText = (RobertoEditText) this$03._$_findCachedViewById(R.id.editTextGoalName);
                if (robertoEditText != null) {
                    robertoEditText.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 0.0f, 0.0f, 0));
                }
                RobertoEditText robertoEditText2 = (RobertoEditText) this$03._$_findCachedViewById(R.id.editTextGoalName);
                if (robertoEditText2 != null) {
                    robertoEditText2.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0.0f, 0.0f, 0));
                    return;
                }
                return;
            case 3:
                cm.p this$04 = (cm.p) obj;
                int i13 = cm.p.G;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                try {
                    yp.k kVar = this$04.f5370v;
                    if (kVar != null && (recyclerView = kVar.f38845g) != null) {
                        recyclerView.k0(10, 0, false);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$04.f5369u, e10);
                    return;
                }
            case 4:
                c0 this$05 = (c0) obj;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                try {
                    RecyclerView recyclerView3 = (RecyclerView) this$05._$_findCachedViewById(R.id.rvRegularGoalRAExperiment);
                    if (recyclerView3 != null) {
                        recyclerView3.k0(10, 0, false);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$05.f5316u, e11);
                    return;
                }
            case 5:
                qm.j this$06 = (qm.j) obj;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                try {
                    ((ConstraintLayout) this$06._$_findCachedViewById(R.id.clJournalBasicFooterContainer)).setVisibility(0);
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$06.f29875v, e12);
                    return;
                }
            case 6:
                rm.h this$07 = (rm.h) obj;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                try {
                    ConstraintLayout constraintLayout = (ConstraintLayout) this$07._$_findCachedViewById(R.id.clJournalQuestionFooterNextCta);
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$07.f30800v, e13);
                    return;
                }
            case 7:
                sm.s this$08 = (sm.s) obj;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                try {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) this$08._$_findCachedViewById(R.id.clJournalThoughtDescriptionFooterNextCta);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    LogHelper.INSTANCE.e(this$08.f31735v, e14);
                    return;
                }
            case 8:
                nn.c this$09 = (nn.c) obj;
                int i14 = nn.c.C;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                try {
                    RecyclerView recyclerView4 = (RecyclerView) this$09._$_findCachedViewById(R.id.acb1Recycler);
                    if (recyclerView4 != null) {
                        RecyclerView.m layoutManager = recyclerView4.getLayoutManager();
                        kotlin.jvm.internal.i.e(layoutManager, "null cannot be cast to non-null type com.theinnerhour.b2b.utils.CenterZoomLayoutManager");
                        View childAt = ((CenterZoomLayoutManager) layoutManager).getChildAt(0);
                        if (childAt != null) {
                            recyclerView4.setPadding(childAt.getWidth(), 0, childAt.getWidth(), 0);
                        }
                        recyclerView4.i(new c.b(this$09));
                        recyclerView4.l0(0);
                        return;
                    }
                    return;
                } catch (Exception e15) {
                    LogHelper.INSTANCE.e(this$09.A, e15);
                    return;
                }
            case 9:
                b0 this$010 = (b0) obj;
                int i15 = b0.B;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                RecyclerView recyclerView5 = (RecyclerView) this$010._$_findCachedViewById(R.id.cb15Recycler);
                if (recyclerView5 != null) {
                    recyclerView5.l0(0);
                    return;
                }
                return;
            case 10:
                tn.b this$011 = (tn.b) obj;
                int i16 = tn.b.f33329z;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                if (!this$011.isDetached() && this$011.isAdded() && this$011.getView() != null) {
                    yn.a aVar = this$011.f33330u;
                    aVar.getClass();
                    if (!yn.a.b()) {
                        hs.f<Boolean, Boolean> a10 = aVar.a(false);
                        if (a10.f19464u.booleanValue() || a10.f19465v.booleanValue()) {
                            x xVar = new x();
                            xVar.f23469u = new NotificationPermissionBottomSheet("mood", a10, "mood_tracker", this$011.f33330u, new tn.c(xVar));
                            y childFragmentManager = this$011.getChildFragmentManager();
                            androidx.fragment.app.a l2 = defpackage.e.l(childFragmentManager, childFragmentManager);
                            l2.f2205p = true;
                            l2.e(0, (Fragment) xVar.f23469u, "permission", 1);
                            l2.k();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ho.c this$012 = (ho.c) obj;
                int i17 = ho.c.f17972y;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                ScrollView scrollView = (ScrollView) this$012._$_findCachedViewById(R.id.addressConcernsScrollView);
                if (scrollView != null) {
                    scrollView.fullScroll(130);
                    return;
                }
                return;
            case 12:
                ho.p this$013 = (ho.p) obj;
                int i18 = ho.p.f18036y;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                ScrollView scrollView2 = (ScrollView) this$013._$_findCachedViewById(R.id.proactiveScrollView);
                if (scrollView2 != null) {
                    scrollView2.fullScroll(130);
                    return;
                }
                return;
            case 13:
                ho.s this$014 = (ho.s) obj;
                int i19 = ho.s.f18048y;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                ScrollView scrollView3 = (ScrollView) this$014._$_findCachedViewById(R.id.supportKindScrollView);
                if (scrollView3 != null) {
                    scrollView3.fullScroll(130);
                    return;
                }
                return;
            case 14:
                zo.e this$015 = (zo.e) obj;
                int i20 = zo.e.e0;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                this$015.h0();
                return;
            case 15:
                ResetProgrammeLoadingActivity this$016 = (ResetProgrammeLoadingActivity) obj;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                Toast.makeText(this$016, "We have reset your data for these programmes.", 1).show();
                this$016.startActivity(tr.r.r(this$016).putExtra("reset_flag", true));
                this$016.finish();
                return;
            case 16:
                AllTopicalCoursesActivity this$017 = (AllTopicalCoursesActivity) obj;
                int i21 = AllTopicalCoursesActivity.E;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                ((NestedScrollView) this$017.u0(R.id.topicalCourseNestedScrollView)).smoothScrollTo(0, 0);
                return;
            case 17:
                fq.b0 this$018 = (fq.b0) obj;
                int i22 = fq.b0.f15662z;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                ((ScrollView) this$018._$_findCachedViewById(R.id.scrollview)).fullScroll(130);
                return;
            case 18:
                q0 this$019 = (q0) obj;
                int i23 = q0.K;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                ((ViewPager) this$019._$_findCachedViewById(R.id.stepsViewPager)).v(this$019.f15788z);
                return;
            case 19:
                a1 this$020 = (a1) obj;
                int i24 = a1.f15652z;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                ((ScrollView) this$020._$_findCachedViewById(R.id.scrollview)).fullScroll(130);
                return;
            case 20:
                hq.e this$021 = (hq.e) obj;
                int i25 = hq.e.Q;
                kotlin.jvm.internal.i.g(this$021, "this$0");
                this$021.a0();
                return;
            case 21:
                com.theinnerhour.b2b.fragment.coping.a this$022 = (com.theinnerhour.b2b.fragment.coping.a) obj;
                int i26 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                this$022.v0();
                return;
            case 22:
                oq.d this$023 = (oq.d) obj;
                int i27 = oq.d.A;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                if (this$023.isAdded()) {
                    ((ScrollView) this$023._$_findCachedViewById(R.id.a6ScrollView)).fullScroll(130);
                    Context context = this$023.getContext();
                    kotlin.jvm.internal.i.d(context);
                    Object systemService2 = context.getSystemService("input_method");
                    kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService2).showSoftInput((RobertoEditText) this$023._$_findCachedViewById(R.id.otherEdit), 1);
                    return;
                }
                return;
            case 23:
                yq.f this$024 = (yq.f) obj;
                int i28 = yq.f.R;
                kotlin.jvm.internal.i.g(this$024, "this$0");
                this$024.j0();
                return;
            case 24:
                fr.b this$025 = (fr.b) obj;
                int i29 = fr.b.f15843v;
                kotlin.jvm.internal.i.g(this$025, "this$0");
                ((ScrollView) this$025._$_findCachedViewById(R.id.parentScrollView)).fullScroll(130);
                return;
            case 25:
                i5 this$026 = (i5) obj;
                int i30 = i5.A;
                kotlin.jvm.internal.i.g(this$026, "this$0");
                ((ScrollView) this$026._$_findCachedViewById(R.id.scrollview)).fullScroll(130);
                return;
            case 26:
                p5 this$027 = (p5) obj;
                int i31 = p5.P;
                kotlin.jvm.internal.i.g(this$027, "this$0");
                this$027.g0();
                return;
            case 27:
                s5 this$028 = (s5) obj;
                int i32 = s5.f19149x;
                kotlin.jvm.internal.i.g(this$028, "this$0");
                this$028.I();
                ((ScrollView) this$028._$_findCachedViewById(R.id.scrollview)).fullScroll(130);
                return;
            case 28:
                l7 this$029 = (l7) obj;
                kotlin.jvm.internal.i.g(this$029, "this$0");
                this$029.f18756z = true;
                RobertoButton robertoButton = (RobertoButton) this$029._$_findCachedViewById(R.id.btnS33ButtonOne);
                if (robertoButton != null) {
                    robertoButton.setText(this$029.getString(R.string.next));
                    return;
                }
                return;
            default:
                s7 this$030 = (s7) obj;
                int i33 = s7.M;
                kotlin.jvm.internal.i.g(this$030, "this$0");
                ((ViewPager) this$030._$_findCachedViewById(R.id.stepsViewPager)).v(this$030.f19165z);
                return;
        }
    }
}
