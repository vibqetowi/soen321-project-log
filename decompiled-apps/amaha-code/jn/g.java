package jn;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.j0;
import is.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import jn.a;
import kn.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import pl.w0;
import ss.l;
/* compiled from: ScreenLogListUnifiedFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljn/g;", "Lrr/b;", "Ljn/a$a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends rr.b implements a.InterfaceC0336a {
    public static final /* synthetic */ int F = 0;
    public final boolean B;
    public fm.a C;
    public List<FirestoreGoal> D;

    /* renamed from: w  reason: collision with root package name */
    public jn.a f22521w;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f22519u = LogHelper.INSTANCE.makeLogTag(g.class);

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<hs.f<String, String>> f22520v = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f22522x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f22523y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public a.EnumC0358a f22524z = a.EnumC0358a.MAIN_PLAN_LOGS;
    public String A = "";

    /* compiled from: ScreenLogListUnifiedFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<List<? extends FirestoreGoal>, hs.k> {
        public a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ss.l
        public final hs.k invoke(List<? extends FirestoreGoal> list) {
            List<? extends FirestoreGoal> it = list;
            i.f(it, "it");
            g gVar = g.this;
            gVar.getClass();
            gVar.D = it;
            gVar.K();
            gVar.O(false);
            return hs.k.f19476a;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return sp.b.g(Long.valueOf(MiniCourseUtilsKt.getLatestMcAttempt((String) t10)), Long.valueOf(MiniCourseUtilsKt.getLatestMcAttempt((String) t3)));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            Long valueOf = Long.valueOf(applicationPersistence.getLongValue(((String) t10) + "_mc_time"));
            ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
            return sp.b.g(valueOf, Long.valueOf(applicationPersistence2.getLongValue(((String) t3) + "_mc_time")));
        }
    }

    public g() {
        boolean z10;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && user.getAppConfig().containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT) && !i.b(user.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.B = z10;
    }

    public final void J(String str) {
        String courseDisplayName;
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.logListTitle);
        int ordinal = this.f22524z.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (!this.f22522x.isEmpty()) {
                    courseDisplayName = this.f22523y.get(this.f22522x.indexOf(str));
                } else {
                    courseDisplayName = "";
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            courseDisplayName = Constants.getCourseDisplayName(str);
        }
        robertoTextView.setText(courseDisplayName);
    }

    public final void K() {
        ArrayList<String> arrayList;
        ArrayList h10;
        HashMap<String, Course> hashMap;
        ArrayList<String> k10;
        Set<String> keySet;
        ArrayList<hs.f<String, String>> arrayList2 = this.f22520v;
        try {
            arrayList2.clear();
            a.EnumC0358a enumC0358a = this.f22524z;
            a.EnumC0358a enumC0358a2 = a.EnumC0358a.MAIN_PLAN_LOGS;
            a.EnumC0358a enumC0358a3 = a.EnumC0358a.ADDITIONAL_LOGS;
            String str = null;
            if (enumC0358a == enumC0358a2) {
                ArrayList arrayList3 = new ArrayList();
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    hashMap = user.getCourseMap();
                } else {
                    hashMap = null;
                }
                if (hashMap != null && (keySet = hashMap.keySet()) != null) {
                    for (String str2 : keySet) {
                        Course course = hashMap.get(str2);
                        if (course != null) {
                            arrayList3.add(course);
                        }
                    }
                }
                boolean K = sp.b.K();
                boolean z10 = this.B;
                if (K) {
                    ArrayList<LogModel> arrayList4 = kn.a.f23436a;
                    List<FirestoreGoal> list = this.D;
                    if (list != null) {
                        if (z10) {
                            str = "suggested_activity";
                        }
                        k10 = kn.a.m(str, arrayList3, list, true);
                    } else {
                        i.q("goals");
                        throw null;
                    }
                } else {
                    ArrayList<LogModel> arrayList5 = kn.a.f23436a;
                    List<Goal> userGoals = FirebasePersistence.getInstance().getUserGoals();
                    i.f(userGoals, "getInstance().userGoals");
                    if (z10) {
                        str = "suggested_activity";
                    }
                    k10 = kn.a.k(str, arrayList3, userGoals, true);
                }
                for (String str3 : k10) {
                    arrayList2.add(new hs.f<>(str3, Constants.getCourseDisplayName(str3)));
                }
                if (!k10.contains(FirebasePersistence.getInstance().getUser().getCurrentCourseName())) {
                    arrayList2.add(new hs.f<>(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.getCourseDisplayName(FirebasePersistence.getInstance().getUser().getCurrentCourseName())));
                }
                String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                i.f(currentCourseName, "getInstance().user.currentCourseName");
                this.A = currentCourseName;
            } else if (enumC0358a == enumC0358a3) {
                if (sp.b.K()) {
                    ArrayList<LogModel> arrayList6 = kn.a.f23436a;
                    ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
                    i.f(miniCourses, "getInstance().user.miniCourses");
                    List<FirestoreGoal> list2 = this.D;
                    if (list2 != null) {
                        h10 = kn.a.l(miniCourses, list2);
                    } else {
                        i.q("goals");
                        throw null;
                    }
                } else {
                    ArrayList<LogModel> arrayList7 = kn.a.f23436a;
                    ArrayList<MiniCourse> miniCourses2 = FirebasePersistence.getInstance().getUser().getMiniCourses();
                    i.f(miniCourses2, "getInstance().user.miniCourses");
                    List<Goal> userGoals2 = FirebasePersistence.getInstance().getUserGoals();
                    i.f(userGoals2, "getInstance().userGoals");
                    h10 = kn.a.h(miniCourses2, userGoals2);
                }
                this.f22522x = new ArrayList<>(h10);
                if (!arrayList.isEmpty()) {
                    ArrayList<String> arrayList8 = this.f22522x;
                    if (arrayList8.size() > 1) {
                        p.P1(arrayList8, new b());
                    }
                    ArrayList<String> arrayList9 = this.f22522x;
                    if (arrayList9.size() > 1) {
                        p.P1(arrayList9, new c());
                    }
                    this.f22523y = kn.a.g(this.f22522x);
                    Iterator<String> it = this.f22522x.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        String next = it.next();
                        int i10 = i6 + 1;
                        if (i6 >= 0) {
                            arrayList2.add(new hs.f<>(next, this.f22523y.get(i6)));
                            i6 = i10;
                        } else {
                            ca.a.t1();
                            throw null;
                        }
                    }
                    String str4 = this.f22522x.get(0);
                    i.f(str4, "activeAdditionalCourses[0]");
                    this.A = str4;
                }
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.btnBackLogList)).setOnClickListener(new View.OnClickListener(this) { // from class: jn.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f22518v;

                {
                    this.f22518v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = r2;
                    g this$0 = this.f22518v;
                    switch (i11) {
                        case 0:
                            int i12 = g.F;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity");
                            ((ScreenLogsActivity) activity).onBackPressed();
                            return;
                        default:
                            int i13 = g.F;
                            i.g(this$0, "this$0");
                            a aVar = this$0.f22521w;
                            if (aVar != null) {
                                y supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                a aVar2 = this$0.f22521w;
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
            J(this.A);
            M(this.A);
            a.EnumC0358a enumC0358a4 = this.f22524z;
            if ((enumC0358a4 == enumC0358a2 || (enumC0358a4 == enumC0358a3 && (!this.f22522x.isEmpty()))) && arrayList2.size() > 1) {
                ((RobertoTextView) _$_findCachedViewById(R.id.logListTitle)).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_drop_down, 0);
                jn.a aVar = new jn.a(arrayList2, this);
                Bundle bundle = new Bundle();
                bundle.putSerializable("logType", this.f22524z);
                aVar.setArguments(bundle);
                this.f22521w = aVar;
                ((RobertoTextView) _$_findCachedViewById(R.id.logListTitle)).setOnClickListener(new View.OnClickListener(this) { // from class: jn.f

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ g f22518v;

                    {
                        this.f22518v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i11 = r2;
                        g this$0 = this.f22518v;
                        switch (i11) {
                            case 0:
                                int i12 = g.F;
                                i.g(this$0, "this$0");
                                androidx.fragment.app.p activity = this$0.getActivity();
                                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity");
                                ((ScreenLogsActivity) activity).onBackPressed();
                                return;
                            default:
                                int i13 = g.F;
                                i.g(this$0, "this$0");
                                a aVar2 = this$0.f22521w;
                                if (aVar2 != null) {
                                    y supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                    a aVar22 = this$0.f22521w;
                                    if (aVar22 != null) {
                                        aVar2.show(supportFragmentManager, aVar22.getTag());
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
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f22519u, e10);
        }
    }

    public final void M(String str) {
        String str2;
        ArrayList<LogModel> d10;
        String str3;
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).removeAllViews();
            boolean K = sp.b.K();
            boolean z10 = this.B;
            if (K) {
                ArrayList<LogModel> arrayList = kn.a.f23436a;
                Context requireContext = requireContext();
                i.f(requireContext, "requireContext()");
                a.EnumC0358a enumC0358a = this.f22524z;
                List<FirestoreGoal> list = this.D;
                if (list != null) {
                    ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
                    i.f(miniCourses, "getInstance().user.miniCourses");
                    User user = FirebasePersistence.getInstance().getUser();
                    i.f(user, "getInstance().user");
                    if (z10) {
                        str3 = "suggested_activity";
                    } else {
                        str3 = null;
                    }
                    d10 = kn.a.c(str, requireContext, enumC0358a, list, miniCourses, user, str3);
                } else {
                    i.q("goals");
                    throw null;
                }
            } else {
                ArrayList<LogModel> arrayList2 = kn.a.f23436a;
                Context requireContext2 = requireContext();
                i.f(requireContext2, "requireContext()");
                a.EnumC0358a enumC0358a2 = this.f22524z;
                List<Goal> userGoals = FirebasePersistence.getInstance().getUserGoals();
                i.f(userGoals, "getInstance().userGoals");
                ArrayList<MiniCourse> miniCourses2 = FirebasePersistence.getInstance().getUser().getMiniCourses();
                i.f(miniCourses2, "getInstance().user.miniCourses");
                User user2 = FirebasePersistence.getInstance().getUser();
                i.f(user2, "getInstance().user");
                if (z10) {
                    str2 = "suggested_activity";
                } else {
                    str2 = null;
                }
                d10 = kn.a.d(str, requireContext2, enumC0358a2, userGoals, miniCourses2, user2, str2);
            }
            if (d10.isEmpty()) {
                ((ConstraintLayout) _$_findCachedViewById(R.id.logListNullState)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.logListSubTitle)).setVisibility(8);
                return;
            }
            ((ConstraintLayout) _$_findCachedViewById(R.id.logListNullState)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.logListSubTitle)).setVisibility(0);
            for (LogModel logModel : d10) {
                View inflate = getLayoutInflater().inflate(R.layout.row_log_list_item, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)), false);
                ((RobertoTextView) inflate.findViewById(R.id.logListRowTitle)).setText(logModel.getTitle());
                inflate.setOnClickListener(new w0(logModel, 25, this));
                ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).addView(inflate);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f22519u, e10);
        }
    }

    public final void O(boolean z10) {
        if (isAdded()) {
            if (z10) {
                ((ProgressBar) _$_findCachedViewById(R.id.logsProgressBar)).setVisibility(0);
                ((ScrollView) _$_findCachedViewById(R.id.goalsLogListParent)).setVisibility(8);
                return;
            }
            ((ProgressBar) _$_findCachedViewById(R.id.logsProgressBar)).setVisibility(8);
            ((ScrollView) _$_findCachedViewById(R.id.goalsLogListParent)).setVisibility(0);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.E;
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

    @Override // jn.a.InterfaceC0336a
    public final void d(String domainSlug) {
        i.g(domainSlug, "domainSlug");
        J(domainSlug);
        jn.a aVar = this.f22521w;
        if (aVar != null) {
            if (aVar != null) {
                aVar.dismiss();
            } else {
                i.q("domainBottomSheet");
                throw null;
            }
        }
        this.A = domainSlug;
        M(domainSlug);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (sp.b.K()) {
            androidx.fragment.app.p requireActivity = requireActivity();
            i.f(requireActivity, "requireActivity()");
            fm.a aVar = (fm.a) new o0(requireActivity, new kk.c(MyApplication.V.a(), new j0())).a(fm.a.class);
            i.g(aVar, "<set-?>");
            this.C = aVar;
            aVar.k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_log_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.E.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        a.EnumC0358a enumC0358a;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("logType");
            } else {
                serializable = null;
            }
            if (serializable instanceof a.EnumC0358a) {
                enumC0358a = (a.EnumC0358a) serializable;
            } else {
                enumC0358a = null;
            }
            if (enumC0358a == null) {
                enumC0358a = a.EnumC0358a.MAIN_PLAN_LOGS;
            }
            this.f22524z = enumC0358a;
            if (sp.b.K()) {
                O(true);
                fm.a aVar = this.C;
                if (aVar != null) {
                    aVar.R.e(getViewLifecycleOwner(), new gn.l(11, new a()));
                    return;
                } else {
                    i.q("fireStoreGoalsViewModel");
                    throw null;
                }
            }
            K();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f22519u, e10);
        }
    }
}
