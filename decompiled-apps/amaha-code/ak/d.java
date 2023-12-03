package ak;

import ak.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bo.k;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AllMiniCoursesActivity;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4Activity;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalCourseActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import hr.s6;
import is.k;
import java.util.Calendar;
import java.util.HashSet;
import jl.q1;
import kotlin.jvm.internal.i;
import nn.u;
import rq.l;
import sl.g;
import sl.h;
import ta.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f605u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f606v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f607w;

    public /* synthetic */ d(int i6, int i10, Object obj) {
        this.f605u = i10;
        this.f607w = obj;
        this.f606v = i6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        yp.c cVar;
        RobertoEditText robertoEditText;
        yp.c cVar2;
        ConstraintLayout constraintLayout;
        yp.c cVar3;
        RobertoEditText robertoEditText2;
        Editable text;
        int i6 = this.f606v;
        int i10 = this.f605u;
        String str2 = null;
        r6 = null;
        r6 = null;
        IBinder iBinder = null;
        int i11 = 0;
        Object obj = this.f607w;
        switch (i10) {
            case 0:
                DotsIndicator this$0 = (DotsIndicator) obj;
                int i12 = DotsIndicator.H;
                i.g(this$0, "this$0");
                if (this$0.getDotsClickable()) {
                    b.a pager = this$0.getPager();
                    if (pager != null) {
                        i11 = pager.getCount();
                    }
                    if (i6 < i11) {
                        b.a pager2 = this$0.getPager();
                        i.d(pager2);
                        pager2.b(i6);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ek.f this$02 = (ek.f) obj;
                i.g(this$02, "this$0");
                Bundle bundle = new Bundle();
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                if (k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.21", "v2.2"})) {
                    ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                    String domain = this$02.f14123y.get(i6).getDomain();
                    i.d(domain);
                    applicationPersistence.setLongValue(domain.concat("_mc_time"), Calendar.getInstance().getTimeInMillis());
                }
                bundle.putString("miniCourse", this$02.f14123y.get(i6).getDomain());
                UtilsKt.fireAnalytics("all_mini_courses_card_click", bundle);
                Activity activity = this$02.f14122x;
                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.AllMiniCoursesActivity");
                AllMiniCoursesActivity allMiniCoursesActivity = (AllMiniCoursesActivity) activity;
                Intent intent = new Intent(activity, MiniCourseActivity.class);
                String domain2 = this$02.f14123y.get(i6).getDomain();
                i.d(domain2);
                allMiniCoursesActivity.startActivityForResult(intent.putExtra("mccourse", domain2).putExtra("source", "mc_listing_page").putExtra("status", "new"), allMiniCoursesActivity.f10306x);
                return;
            case 2:
                el.a this$03 = (el.a) obj;
                i.g(this$03, "this$0");
                vk.b bVar = this$03.f14368x.get(i6);
                i.f(bVar, "communityGroups[position]");
                this$03.f14369y.invoke(bVar, Integer.valueOf(i6));
                return;
            case 3:
                el.b this$04 = (el.b) obj;
                i.g(this$04, "this$0");
                String str3 = gk.a.f16573a;
                Bundle f = defpackage.e.f("variant", "variant_c", "experiment", "comm_acquisition");
                User f2 = defpackage.b.f(f, "platform", "android_app");
                if (f2 != null) {
                    str = f2.getCurrentCourseName();
                } else {
                    str = null;
                }
                User f10 = defpackage.b.f(f, "domain", str);
                if (f10 != null) {
                    str2 = f10.getCurrentCourseName();
                }
                f.putString("course", str2);
                f.putBoolean("group_joined", this$04.f14373z);
                f.putInt("carousel_view_card", i6 + 1);
                f.putBoolean("onboarding_completed", this$04.f14372y);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(f, "comm_db_carousel_post_click");
                return;
            case 4:
                NotV4Activity this$05 = (NotV4Activity) obj;
                int i13 = NotV4Activity.G;
                i.g(this$05, "this$0");
                v.c cVar4 = this$05.F;
                String str4 = (cVar4 == null || (cVar3 = (yp.c) cVar4.f34633x) == null || (robertoEditText2 = cVar3.f38737d) == null || (text = robertoEditText2.getText()) == null || (r0 = text.toString()) == null) ? "" : "";
                if (this$05.B != null) {
                    NotV4DashboardViewModel n02 = this$05.n0();
                    v.H(kc.f.H(n02), null, 0, new q1(n02, i6, 5, str4, null), 3);
                }
                v.c cVar5 = this$05.F;
                if (cVar5 != null && (cVar2 = (yp.c) cVar5.f34633x) != null && (constraintLayout = cVar2.f38734a) != null) {
                    BottomSheetBehavior.from(constraintLayout).setState(4);
                }
                Object systemService = this$05.getSystemService("input_method");
                i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                v.c cVar6 = this$05.F;
                if (cVar6 != null && (cVar = (yp.c) cVar6.f34633x) != null && (robertoEditText = cVar.f38737d) != null) {
                    iBinder = robertoEditText.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                String str5 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                defpackage.e.s(bundle2, "course", "type", "overall");
                bundle2.putInt("rating", i6);
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle2, "self_care_nps_feedback_submit");
                return;
            case 5:
                ol.d this$06 = (ol.d) obj;
                i.g(this$06, "this$0");
                this$06.f27620y.invoke(this$06.f27619x.get(i6));
                return;
            case 6:
                sl.e this$07 = (sl.e) obj;
                i.g(this$07, "this$0");
                vl.d dVar = this$07.f31662x.get(i6);
                i.f(dVar, "list[position]");
                this$07.f31663y.invoke(dVar, Integer.valueOf(i6));
                return;
            case 7:
                sl.f this$08 = (sl.f) obj;
                i.g(this$08, "this$0");
                vl.b bVar2 = this$08.f31665x.get(i6);
                i.f(bVar2, "resourceList[position]");
                this$08.f31666y.invoke(bVar2);
                return;
            case 8:
                g this$09 = (g) obj;
                i.g(this$09, "this$0");
                xl.a aVar = this$09.f31668x.get(i6);
                i.f(aVar, "testimonialList[position]");
                this$09.f31669y.invoke(aVar);
                return;
            case 9:
                h this$010 = (h) obj;
                i.g(this$010, "this$0");
                this$010.f31672y.invoke(this$010.D.get(i6));
                return;
            case 10:
                bm.i this$011 = (bm.i) obj;
                i.g(this$011, "this$0");
                Object obj2 = this$011.f4468z.get(i6);
                i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                this$011.A.u((Goal) obj2);
                return;
            case 11:
                mm.g this$012 = (mm.g) obj;
                i.g(this$012, "this$0");
                if (i6 != this$012.f25631y) {
                    this$012.f25632z.invoke(Integer.valueOf(i6));
                    return;
                }
                return;
            case 12:
                in.a this$013 = (in.a) obj;
                i.g(this$013, "this$0");
                this$013.C.invoke(this$013.f20408y.get(i6).f19464u);
                return;
            case 13:
                u.a this$014 = (u.a) obj;
                i.g(this$014, "this$0");
                this$014.f26614z.invoke(Integer.valueOf(i6));
                return;
            case 14:
                sn.a this$015 = (sn.a) obj;
                i.g(this$015, "this$0");
                String str6 = this$015.f31770x.get(i6);
                i.f(str6, "activityList[position]");
                this$015.A.invoke(str6);
                return;
            case 15:
                k.a this$016 = (k.a) obj;
                i.g(this$016, "this$0");
                Integer valueOf = Integer.valueOf(i6);
                HashSet<Integer> hashSet = this$016.f4604y;
                if (hashSet.contains(valueOf)) {
                    hashSet.remove(Integer.valueOf(i6));
                } else {
                    hashSet.add(Integer.valueOf(i6));
                }
                this$016.j(i6);
                return;
            case 16:
                k.b this$017 = (k.b) obj;
                i.g(this$017, "this$0");
                Integer num = this$017.f4607y;
                if (num != null && i6 == num.intValue()) {
                    this$017.f4607y = null;
                    this$017.j(i6);
                    return;
                }
                Integer num2 = this$017.f4607y;
                this$017.f4607y = Integer.valueOf(i6);
                this$017.j(i6);
                if (num2 != null) {
                    this$017.j(num2.intValue());
                    return;
                }
                return;
            case 17:
                k.c this$018 = (k.c) obj;
                i.g(this$018, "this$0");
                this$018.D.invoke(Integer.valueOf(i6));
                return;
            case 18:
                up.a this$019 = (up.a) obj;
                i.g(this$019, "this$0");
                this$019.f34435y.invoke(this$019.f34434x.get(i6).f19464u);
                return;
            case 19:
                up.b this$020 = (up.b) obj;
                i.g(this$020, "this$0");
                Bundle bundle3 = new Bundle();
                bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.21", "v2.2"})) {
                    ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                    String domain3 = this$020.f34439y.get(i6).getDomain();
                    i.d(domain3);
                    applicationPersistence2.setLongValue(domain3.concat("_mc_time"), Calendar.getInstance().getTimeInMillis());
                }
                bundle3.putString("topical_course", this$020.f34439y.get(i6).getDomain());
                UtilsKt.fireAnalytics("all_topical_courses_card_click", bundle3);
                Activity activity2 = this$020.f34438x;
                i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity");
                AllTopicalCoursesActivity allTopicalCoursesActivity = (AllTopicalCoursesActivity) activity2;
                Intent intent2 = new Intent(activity2, TopicalCourseActivity.class);
                String domain4 = this$020.f34439y.get(i6).getDomain();
                i.d(domain4);
                allTopicalCoursesActivity.startActivityForResult(intent2.putExtra("mccourse", domain4), allTopicalCoursesActivity.B);
                return;
            case 20:
                l this$021 = (l) obj;
                int i14 = l.A;
                i.g(this$021, "this$0");
                View view2 = this$021.f30959w;
                if (view2 != null) {
                    view2.setEnabled(true);
                }
                LinearLayout linearLayout = (LinearLayout) this$021._$_findCachedViewById(R.id.rowItemContainer);
                int size = this$021.f30960x.size();
                for (int i15 = 0; i15 < size; i15++) {
                    if (i15 == i6) {
                        i.d(linearLayout);
                        linearLayout.getChildAt(i15).setEnabled(false);
                        this$021.f30959w = linearLayout.getChildAt(i15);
                        View childAt = linearLayout.getChildAt(i6);
                        Context requireContext = this$021.requireContext();
                        Object obj3 = g0.a.f16164a;
                        childAt.setBackground(a.c.b(requireContext, R.drawable.grey_rounded_corners_blue_stroke));
                        this$021.f30958v = ((RobertoTextView) linearLayout.getChildAt(i6).findViewById(R.id.rowContent)).getText().toString();
                    } else {
                        i.d(linearLayout);
                        View childAt2 = linearLayout.getChildAt(i15);
                        Context requireContext2 = this$021.requireContext();
                        Object obj4 = g0.a.f16164a;
                        childAt2.setBackground(a.c.b(requireContext2, R.drawable.background_curved_grey_corner_5dp));
                    }
                }
                ((RobertoButton) this$021._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                return;
            default:
                s6 this$022 = (s6) obj;
                int i16 = s6.f19154z;
                i.g(this$022, "this$0");
                this$022.f19156v = i6;
                this$022.J();
                return;
        }
    }

    public /* synthetic */ d(int i6, RecyclerView.e eVar, int i10) {
        this.f605u = i10;
        this.f606v = i6;
        this.f607w = eVar;
    }
}
