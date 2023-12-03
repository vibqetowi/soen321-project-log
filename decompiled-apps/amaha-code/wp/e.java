package wp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalLogsActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.f;
import is.p;
import is.u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tr.r;
import wp.a;
/* compiled from: TopicalLogsListFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwp/e;", "Lrr/b;", "Lwp/a$a;", "Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends rr.b implements a.InterfaceC0620a, SubscriptionPersistence.SubscriptionInitialiseListener {
    public static final /* synthetic */ int D = 0;

    /* renamed from: w  reason: collision with root package name */
    public wp.a f37040w;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f37038u = LogHelper.INSTANCE.makeLogTag(e.class);

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<f<String, String>> f37039v = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f37041x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f37042y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public String f37043z = "";
    public final ArrayList<String> A = ca.a.k("result_4", "result_6", "result_9", "result_11", "result_30");
    public final int B = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            e eVar = e.this;
            return sp.b.g(Long.valueOf(e.J(eVar, (String) t10)), Long.valueOf(e.J(eVar, (String) t3)));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            Long valueOf = Long.valueOf(applicationPersistence.getLongValue(((String) t10) + "_access_time"));
            ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
            return sp.b.g(valueOf, Long.valueOf(applicationPersistence2.getLongValue(((String) t3) + "_access_time")));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return sp.b.g(Long.valueOf(((Goal) t10).getLastAdded().getTime()), Long.valueOf(((Goal) t3).getLastAdded().getTime()));
        }
    }

    public static final long J(e eVar, String str) {
        ArrayList<CourseDayModelV1> plan;
        Object obj;
        eVar.getClass();
        ArrayList<MiniCourse> topicalCourseList = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
        i.f(topicalCourseList, "getInstance().user.topicalCourseList");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : topicalCourseList) {
            if (i.b(((MiniCourse) obj2).getDomain(), str)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        MiniCourse miniCourse = (MiniCourse) arrayList.get(0);
        if (miniCourse != null && (plan = miniCourse.getPlan()) != null) {
            Iterator<T> it = plan.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                Object next = it.next();
                if (!it.hasNext()) {
                    obj = next;
                } else {
                    long start_date = ((CourseDayModelV1) next).getStart_date();
                    do {
                        Object next2 = it.next();
                        long start_date2 = ((CourseDayModelV1) next2).getStart_date();
                        if (start_date < start_date2) {
                            next = next2;
                            start_date = start_date2;
                        }
                    } while (it.hasNext());
                    obj = next;
                }
            }
            CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) obj;
            if (courseDayModelV1 != null) {
                return courseDayModelV1.getStart_date();
            }
        }
        return 0L;
    }

    public final ArrayList<String> K(ArrayList<MiniCourse> arrayList, List<Goal> list) {
        boolean z10;
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<MiniCourse> it = arrayList.iterator();
        while (it.hasNext()) {
            MiniCourse next = it.next();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (i.b(((Goal) obj).getSource(), next.getDomain())) {
                    arrayList3.add(obj);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Set<String> keySet = ((Goal) it2.next()).getData().keySet();
                i.f(keySet, "it.data.keys");
                if (!keySet.isEmpty()) {
                    for (String str : keySet) {
                        if (this.A.contains(str)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    String domain = next.getDomain();
                    i.d(domain);
                    if (!arrayList2.contains(domain)) {
                        String domain2 = next.getDomain();
                        i.d(domain2);
                        arrayList2.add(domain2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList<String> M(ArrayList<String> arrayList) {
        String str;
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (String str2 : arrayList) {
            switch (str2.hashCode()) {
                case -1552422584:
                    if (str2.equals(Constants.TOPICAL_2022_TIME_MANAGEMENT)) {
                        str = getString(R.string.topical2022TimeManagementTitle);
                        continue;
                        arrayList2.add(str);
                    }
                    break;
                case -1190562844:
                    if (str2.equals(Constants.TOPICAL_2022_HEALTH_ANXIETY)) {
                        str = getString(R.string.topicalHealthAnxietyTitle);
                        continue;
                        arrayList2.add(str);
                    }
                    break;
                case 58855846:
                    if (str2.equals(Constants.TOPICAL_2022_COVID)) {
                        str = getString(R.string.topical2022CovidTitle);
                        continue;
                        arrayList2.add(str);
                    }
                    break;
                case 378061269:
                    if (str2.equals(Constants.TOPICAL_2022_MOTIVATION)) {
                        str = getString(R.string.topical2022MotivationTitle);
                        continue;
                        arrayList2.add(str);
                    }
                    break;
                case 416780353:
                    if (str2.equals(Constants.TOPICAL_2022_NURTURING_RELATIONSHIP)) {
                        str = getString(R.string.topical2022NurturingRelationshipsTitle);
                        continue;
                        arrayList2.add(str);
                    }
                    break;
                case 1196421508:
                    if (str2.equals(Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY)) {
                        str = getString(R.string.topical2022ConflictEmpathyTitle);
                        continue;
                        arrayList2.add(str);
                    }
                    break;
            }
            str = "";
            arrayList2.add(str);
        }
        return arrayList2;
    }

    public final void O(String str) {
        String string;
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.logListTitle);
        if (!this.f37042y.isEmpty()) {
            string = this.f37042y.get(this.f37041x.indexOf(str));
        } else {
            string = getString(R.string.topicalLogTitleNull);
        }
        robertoTextView.setText(string);
    }

    public final void P(String str) {
        ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).removeAllViews();
        ArrayList<Goal> arrayList = new ArrayList();
        List<Goal> topicalGoals = FirebasePersistence.getInstance().getTopicalGoals();
        i.f(topicalGoals, "getInstance().topicalGoals");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : topicalGoals) {
            if (i.b(((Goal) obj).getSource(), str)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        if (arrayList.size() > 1) {
            p.P1(arrayList, new c());
        }
        for (Goal goal : arrayList) {
            Set<String> keySet = goal.getData().keySet();
            i.f(keySet, "goal.data.keys");
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : keySet) {
                if (this.A.contains((String) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            List I2 = u.I2(arrayList3);
            int size = I2.size();
            for (int i6 = 0; i6 < size; i6++) {
                ArrayList<MiniCourse> topicalCourseList = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
                i.f(topicalCourseList, "getInstance().user.topicalCourseList");
                for (MiniCourse miniCourse : topicalCourseList) {
                    for (CourseDayModelV1 courseDayModelV1 : miniCourse.getPlan()) {
                        if (i.b(courseDayModelV1.getContent_id(), goal.getGoalId())) {
                            View inflate = getLayoutInflater().inflate(R.layout.row_log_list_item, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)), false);
                            ((RobertoTextView) inflate.findViewById(R.id.logListRowTitle)).setText(courseDayModelV1.getContent_label());
                            inflate.setOnClickListener(new am.c(I2, i6, goal, this));
                            ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).addView(inflate);
                        }
                    }
                }
            }
        }
        if (((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).getChildCount() > 0) {
            ((ConstraintLayout) _$_findCachedViewById(R.id.logListNullState)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.logListSubTitle)).setVisibility(0);
            return;
        }
        ((ConstraintLayout) _$_findCachedViewById(R.id.logListNullState)).setVisibility(0);
        ((RobertoTextView) _$_findCachedViewById(R.id.logListSubTitle)).setVisibility(8);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.C;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // wp.a.InterfaceC0620a
    public final void d(String domainSlug) {
        i.g(domainSlug, "domainSlug");
        O(domainSlug);
        wp.a aVar = this.f37040w;
        if (aVar != null) {
            aVar.dismiss();
            this.f37043z = domainSlug;
            P(domainSlug);
            return;
        }
        i.q("domainBottomSheet");
        throw null;
    }

    @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
    public final void initialiseComplete(boolean z10) {
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            if (this.f37041x.isEmpty()) {
                ((ConstraintLayout) _$_findCachedViewById(R.id.subscriptionLayout)).setVisibility(0);
                return;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.logSubscriptionText)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.logSubscriptionButton)).setVisibility(0);
            return;
        }
        ((ConstraintLayout) _$_findCachedViewById(R.id.subscriptionLayout)).setVisibility(8);
        ((RobertoTextView) _$_findCachedViewById(R.id.logSubscriptionText)).setVisibility(8);
        ((RobertoButton) _$_findCachedViewById(R.id.logSubscriptionButton)).setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i6, int i10, Intent intent) {
        if (i6 == this.B && (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() || (i10 == -1 && intent != null && intent.getBooleanExtra("purchase_successful", false)))) {
            ((ConstraintLayout) _$_findCachedViewById(R.id.subscriptionLayout)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.logSubscriptionText)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.logSubscriptionButton)).setVisibility(8);
        }
        super.onActivityResult(i6, i10, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            ArrayList<MiniCourse> arrayList = new ArrayList<>();
            arrayList.addAll(FirebasePersistence.getInstance().getUser().getTopicalCourseList());
            List<Goal> topicalGoals = FirebasePersistence.getInstance().getTopicalGoals();
            i.f(topicalGoals, "getInstance().topicalGoals");
            ArrayList<String> K = K(arrayList, topicalGoals);
            this.f37041x = K;
            if (!K.isEmpty()) {
                ArrayList<String> arrayList2 = this.f37041x;
                if (arrayList2.size() > 1) {
                    p.P1(arrayList2, new a());
                }
                ArrayList<String> arrayList3 = this.f37041x;
                if (arrayList3.size() > 1) {
                    p.P1(arrayList3, new b());
                }
                this.f37042y = M(this.f37041x);
                int i6 = 0;
                for (Object obj : this.f37041x) {
                    int i10 = i6 + 1;
                    if (i6 >= 0) {
                        this.f37039v.add(new f<>((String) obj, this.f37042y.get(i6)));
                        i6 = i10;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
                String str = this.f37041x.get(0);
                i.f(str, "activeTopicalCourses[0]");
                this.f37043z = str;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f37038u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_log_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(this);
        super.onDestroyView();
        this.C.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        ((AppCompatImageView) _$_findCachedViewById(R.id.btnBackLogList)).setOnClickListener(new View.OnClickListener(this) { // from class: wp.d

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ e f37037v;

            {
                this.f37037v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                e this$0 = this.f37037v;
                switch (i6) {
                    case 0:
                        int i10 = e.D;
                        i.g(this$0, "this$0");
                        androidx.fragment.app.p activity = this$0.getActivity();
                        i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.topicalcourses.activity.TopicalLogsActivity");
                        ((TopicalLogsActivity) activity).onBackPressed();
                        return;
                    case 1:
                        int i11 = e.D;
                        i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                        i.f(requireActivity, "requireActivity()");
                        this$0.startActivityForResult(r.s(requireActivity, false).putExtra("source", "topical_logs"), this$0.B);
                        return;
                    case 2:
                        int i12 = e.D;
                        i.g(this$0, "this$0");
                        androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                        i.f(requireActivity2, "requireActivity()");
                        this$0.startActivityForResult(r.s(requireActivity2, false).putExtra("source", "topical_logs"), this$0.B);
                        return;
                    default:
                        int i13 = e.D;
                        i.g(this$0, "this$0");
                        a aVar = this$0.f37040w;
                        if (aVar != null) {
                            y supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                            a aVar2 = this$0.f37040w;
                            if (aVar2 != null) {
                                aVar.show(supportFragmentManager, aVar2.getTag());
                                return;
                            } else {
                                i.q("domainBottomSheet");
                                throw null;
                            }
                        }
                        i.q("domainBottomSheet");
                        throw null;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.logListEmptyText)).setText(getString(R.string.topicalLogSubtitleNull));
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            if (this.f37041x.isEmpty()) {
                ((ConstraintLayout) _$_findCachedViewById(R.id.subscriptionLayout)).setVisibility(0);
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.logSubscriptionText)).setVisibility(0);
                ((RobertoButton) _$_findCachedViewById(R.id.logSubscriptionButton)).setVisibility(0);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.logSubscriptionButton)).setOnClickListener(new View.OnClickListener(this) { // from class: wp.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f37037v;

                {
                    this.f37037v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    e this$0 = this.f37037v;
                    switch (i6) {
                        case 0:
                            int i10 = e.D;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.topicalcourses.activity.TopicalLogsActivity");
                            ((TopicalLogsActivity) activity).onBackPressed();
                            return;
                        case 1:
                            int i11 = e.D;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            i.f(requireActivity, "requireActivity()");
                            this$0.startActivityForResult(r.s(requireActivity, false).putExtra("source", "topical_logs"), this$0.B);
                            return;
                        case 2:
                            int i12 = e.D;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            i.f(requireActivity2, "requireActivity()");
                            this$0.startActivityForResult(r.s(requireActivity2, false).putExtra("source", "topical_logs"), this$0.B);
                            return;
                        default:
                            int i13 = e.D;
                            i.g(this$0, "this$0");
                            a aVar = this$0.f37040w;
                            if (aVar != null) {
                                y supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                a aVar2 = this$0.f37040w;
                                if (aVar2 != null) {
                                    aVar.show(supportFragmentManager, aVar2.getTag());
                                    return;
                                } else {
                                    i.q("domainBottomSheet");
                                    throw null;
                                }
                            }
                            i.q("domainBottomSheet");
                            throw null;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.logSubscriptionButtonNullState)).setOnClickListener(new View.OnClickListener(this) { // from class: wp.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f37037v;

                {
                    this.f37037v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    e this$0 = this.f37037v;
                    switch (i6) {
                        case 0:
                            int i10 = e.D;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.topicalcourses.activity.TopicalLogsActivity");
                            ((TopicalLogsActivity) activity).onBackPressed();
                            return;
                        case 1:
                            int i11 = e.D;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            i.f(requireActivity, "requireActivity()");
                            this$0.startActivityForResult(r.s(requireActivity, false).putExtra("source", "topical_logs"), this$0.B);
                            return;
                        case 2:
                            int i12 = e.D;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            i.f(requireActivity2, "requireActivity()");
                            this$0.startActivityForResult(r.s(requireActivity2, false).putExtra("source", "topical_logs"), this$0.B);
                            return;
                        default:
                            int i13 = e.D;
                            i.g(this$0, "this$0");
                            a aVar = this$0.f37040w;
                            if (aVar != null) {
                                y supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                a aVar2 = this$0.f37040w;
                                if (aVar2 != null) {
                                    aVar.show(supportFragmentManager, aVar2.getTag());
                                    return;
                                } else {
                                    i.q("domainBottomSheet");
                                    throw null;
                                }
                            }
                            i.q("domainBottomSheet");
                            throw null;
                    }
                }
            });
        } else {
            ((ConstraintLayout) _$_findCachedViewById(R.id.subscriptionLayout)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.logSubscriptionText)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.logSubscriptionButton)).setVisibility(8);
        }
        O(this.f37043z);
        P(this.f37043z);
        ArrayList<f<String, String>> arrayList = this.f37039v;
        if (arrayList.size() > 1) {
            ((RobertoTextView) _$_findCachedViewById(R.id.logListTitle)).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_drop_down, 0);
            this.f37040w = new wp.a(arrayList, this);
            ((RobertoTextView) _$_findCachedViewById(R.id.logListTitle)).setOnClickListener(new View.OnClickListener(this) { // from class: wp.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f37037v;

                {
                    this.f37037v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    e this$0 = this.f37037v;
                    switch (i6) {
                        case 0:
                            int i10 = e.D;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.topicalcourses.activity.TopicalLogsActivity");
                            ((TopicalLogsActivity) activity).onBackPressed();
                            return;
                        case 1:
                            int i11 = e.D;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            i.f(requireActivity, "requireActivity()");
                            this$0.startActivityForResult(r.s(requireActivity, false).putExtra("source", "topical_logs"), this$0.B);
                            return;
                        case 2:
                            int i12 = e.D;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            i.f(requireActivity2, "requireActivity()");
                            this$0.startActivityForResult(r.s(requireActivity2, false).putExtra("source", "topical_logs"), this$0.B);
                            return;
                        default:
                            int i13 = e.D;
                            i.g(this$0, "this$0");
                            a aVar = this$0.f37040w;
                            if (aVar != null) {
                                y supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                a aVar2 = this$0.f37040w;
                                if (aVar2 != null) {
                                    aVar.show(supportFragmentManager, aVar2.getTag());
                                    return;
                                } else {
                                    i.q("domainBottomSheet");
                                    throw null;
                                }
                            }
                            i.q("domainBottomSheet");
                            throw null;
                    }
                }
            });
        }
    }
}
