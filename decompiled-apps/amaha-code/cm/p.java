package cm;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.NestedScrollableHost;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: FirestoreGoalsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcm/p;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p extends Fragment {
    public static final /* synthetic */ int G = 0;
    public bm.s A;
    public FirestoreGoal B;
    public final androidx.activity.result.c<Intent> C;
    public final androidx.activity.result.c<Intent> D;
    public final androidx.activity.result.c<Intent> E;

    /* renamed from: v  reason: collision with root package name */
    public yp.k f5370v;

    /* renamed from: x  reason: collision with root package name */
    public bm.d f5372x;

    /* renamed from: y  reason: collision with root package name */
    public fm.a f5373y;
    public final LinkedHashMap F = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f5369u = LogHelper.INSTANCE.makeLogTag("FirestoreGoalsFragment");

    /* renamed from: w  reason: collision with root package name */
    public final hs.i f5371w = sp.b.O(a.f5375u);

    /* renamed from: z  reason: collision with root package name */
    public final hs.i f5374z = sp.b.O(b.f5376u);

    /* compiled from: FirestoreGoalsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<yn.a> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f5375u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final yn.a invoke() {
            return new yn.a();
        }
    }

    /* compiled from: FirestoreGoalsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<androidx.recyclerview.widget.r> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f5376u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final androidx.recyclerview.widget.r invoke() {
            return new androidx.recyclerview.widget.r();
        }
    }

    public p() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: cm.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f5362v;

            {
                this.f5362v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                boolean z11;
                boolean z12;
                int i6 = r2;
                p this$0 = this.f5362v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = p.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                            }
                            FirestoreGoal firestoreGoal = this$0.B;
                            if (firestoreGoal != null) {
                                Intent intent = aVar.f977v;
                                if (intent != null && intent.getBooleanExtra("isCompleted", false)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    fm.a aVar2 = this$0.f5373y;
                                    if (aVar2 != null) {
                                        aVar2.y(false);
                                    }
                                    fm.a aVar3 = this$0.f5373y;
                                    if (aVar3 != null) {
                                        aVar3.B(firestoreGoal, true, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f5369u, e10);
                            return;
                        }
                    case 1:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i11 = p.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                            }
                            FirestoreGoal firestoreGoal2 = this$0.B;
                            if (firestoreGoal2 != null && aVar4.f976u == -1) {
                                fm.a aVar5 = this$0.f5373y;
                                if (aVar5 != null) {
                                    aVar5.y(false);
                                }
                                fm.a aVar6 = this$0.f5373y;
                                if (aVar6 != null) {
                                    aVar6.B(firestoreGoal2, true, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f5369u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar7 = (androidx.activity.result.a) obj;
                        int i12 = p.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                            ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                        }
                        FirestoreGoal firestoreGoal3 = this$0.B;
                        if (firestoreGoal3 != null) {
                            if (aVar7 != null && aVar7.f976u == -1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                Intent intent2 = aVar7.f977v;
                                if (intent2 != null && intent2.getBooleanExtra("markGoalComplete", false)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    fm.a aVar8 = this$0.f5373y;
                                    if (aVar8 != null) {
                                        aVar8.y(false);
                                    }
                                    fm.a aVar9 = this$0.f5373y;
                                    if (aVar9 != null) {
                                        aVar9.B(firestoreGoal3, true, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.C = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: cm.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f5362v;

            {
                this.f5362v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                boolean z11;
                boolean z12;
                int i6 = r2;
                p this$0 = this.f5362v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = p.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                            }
                            FirestoreGoal firestoreGoal = this$0.B;
                            if (firestoreGoal != null) {
                                Intent intent = aVar.f977v;
                                if (intent != null && intent.getBooleanExtra("isCompleted", false)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    fm.a aVar2 = this$0.f5373y;
                                    if (aVar2 != null) {
                                        aVar2.y(false);
                                    }
                                    fm.a aVar3 = this$0.f5373y;
                                    if (aVar3 != null) {
                                        aVar3.B(firestoreGoal, true, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f5369u, e10);
                            return;
                        }
                    case 1:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i11 = p.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                            }
                            FirestoreGoal firestoreGoal2 = this$0.B;
                            if (firestoreGoal2 != null && aVar4.f976u == -1) {
                                fm.a aVar5 = this$0.f5373y;
                                if (aVar5 != null) {
                                    aVar5.y(false);
                                }
                                fm.a aVar6 = this$0.f5373y;
                                if (aVar6 != null) {
                                    aVar6.B(firestoreGoal2, true, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f5369u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar7 = (androidx.activity.result.a) obj;
                        int i12 = p.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                            ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                        }
                        FirestoreGoal firestoreGoal3 = this$0.B;
                        if (firestoreGoal3 != null) {
                            if (aVar7 != null && aVar7.f976u == -1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                Intent intent2 = aVar7.f977v;
                                if (intent2 != null && intent2.getBooleanExtra("markGoalComplete", false)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    fm.a aVar8 = this$0.f5373y;
                                    if (aVar8 != null) {
                                        aVar8.y(false);
                                    }
                                    fm.a aVar9 = this$0.f5373y;
                                    if (aVar9 != null) {
                                        aVar9.B(firestoreGoal3, true, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…e(TAG, e)\n        }\n    }");
        this.D = registerForActivityResult2;
        androidx.activity.result.c<Intent> registerForActivityResult3 = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: cm.m

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f5362v;

            {
                this.f5362v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj) {
                boolean z10;
                boolean z11;
                boolean z12;
                int i6 = r2;
                p this$0 = this.f5362v;
                switch (i6) {
                    case 0:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        int i10 = p.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                            }
                            FirestoreGoal firestoreGoal = this$0.B;
                            if (firestoreGoal != null) {
                                Intent intent = aVar.f977v;
                                if (intent != null && intent.getBooleanExtra("isCompleted", false)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    fm.a aVar2 = this$0.f5373y;
                                    if (aVar2 != null) {
                                        aVar2.y(false);
                                    }
                                    fm.a aVar3 = this$0.f5373y;
                                    if (aVar3 != null) {
                                        aVar3.B(firestoreGoal, true, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f5369u, e10);
                            return;
                        }
                    case 1:
                        androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                        int i11 = p.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                            }
                            FirestoreGoal firestoreGoal2 = this$0.B;
                            if (firestoreGoal2 != null && aVar4.f976u == -1) {
                                fm.a aVar5 = this$0.f5373y;
                                if (aVar5 != null) {
                                    aVar5.y(false);
                                }
                                fm.a aVar6 = this$0.f5373y;
                                if (aVar6 != null) {
                                    aVar6.B(firestoreGoal2, true, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f5369u, e11);
                            return;
                        }
                    default:
                        androidx.activity.result.a aVar7 = (androidx.activity.result.a) obj;
                        int i12 = p.G;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                            ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                        }
                        FirestoreGoal firestoreGoal3 = this$0.B;
                        if (firestoreGoal3 != null) {
                            if (aVar7 != null && aVar7.f976u == -1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                Intent intent2 = aVar7.f977v;
                                if (intent2 != null && intent2.getBooleanExtra("markGoalComplete", false)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    fm.a aVar8 = this$0.f5373y;
                                    if (aVar8 != null) {
                                        aVar8.y(false);
                                    }
                                    fm.a aVar9 = this$0.f5373y;
                                    if (aVar9 != null) {
                                        aVar9.B(firestoreGoal3, true, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult3, "registerForActivityResul…        }\n        }\n    }");
        this.E = registerForActivityResult3;
    }

    public final void F(FirestoreGoal firestoreGoal) {
        try {
            if (firestoreGoal.getScheduledDate().getTime() == 0) {
                firestoreGoal.getScheduledDate().setTime(Calendar.getInstance().getTimeInMillis());
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 9);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
            TimePickerDialog timePickerDialog = new TimePickerDialog(requireContext(), R.style.myTimePickerTheme, new o(calendar, firestoreGoal, this, 0), calendar.get(11), calendar.get(12), false);
            View inflate = getLayoutInflater().inflate(R.layout.row_text_view_new, (ViewGroup) null, false);
            RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.textViewMain, inflate);
            if (robertoTextView != null) {
                robertoTextView.setText(getString(R.string.goalTimePickerHeader));
                timePickerDialog.setCustomTitle((ConstraintLayout) inflate);
                CharSequence string = getString(R.string.goalTimePickerCTA);
                kotlin.jvm.internal.i.f(string, "getString(R.string.goalTimePickerCTA)");
                timePickerDialog.setButton(-1, string, timePickerDialog);
                timePickerDialog.show();
                return;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.textViewMain)));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5369u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.fragment_v3_goals_regular, (ViewGroup) null, false);
        int i6 = R.id.addGoalsButtonMain;
        RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.addGoalsButtonMain, inflate);
        if (robertoButton != null) {
            i6 = R.id.addRAExperimentGoalsButton;
            RobertoButton robertoButton2 = (RobertoButton) hc.d.w(R.id.addRAExperimentGoalsButton, inflate);
            if (robertoButton2 != null) {
                i6 = R.id.clGoalsRegularLoadingLayout;
                if (((ConstraintLayout) hc.d.w(R.id.clGoalsRegularLoadingLayout, inflate)) != null) {
                    i6 = R.id.clNullState;
                    if (((ConstraintLayout) hc.d.w(R.id.clNullState, inflate)) != null) {
                        i6 = R.id.clRegularGoalRAExperiment;
                        ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.clRegularGoalRAExperiment, inflate);
                        if (constraintLayout != null) {
                            i6 = R.id.goalDetailsRAExperiment;
                            if (((ConstraintLayout) hc.d.w(R.id.goalDetailsRAExperiment, inflate)) != null) {
                                i6 = R.id.goalRecyclerView;
                                RecyclerView recyclerView = (RecyclerView) hc.d.w(R.id.goalRecyclerView, inflate);
                                if (recyclerView != null) {
                                    i6 = R.id.ivEmptyState;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivEmptyState, inflate);
                                    if (appCompatImageView != null) {
                                        i6 = R.id.pbGoalsRAExperiment;
                                        ProgressBar progressBar = (ProgressBar) hc.d.w(R.id.pbGoalsRAExperiment, inflate);
                                        if (progressBar != null) {
                                            i6 = R.id.rvRegularGoalRAExperiment;
                                            RecyclerView recyclerView2 = (RecyclerView) hc.d.w(R.id.rvRegularGoalRAExperiment, inflate);
                                            if (recyclerView2 != null) {
                                                i6 = R.id.rvRegularGoalRAExperimentContainer;
                                                if (((NestedScrollableHost) hc.d.w(R.id.rvRegularGoalRAExperimentContainer, inflate)) != null) {
                                                    i6 = R.id.tvActivityType;
                                                    if (((RobertoTextView) hc.d.w(R.id.tvActivityType, inflate)) != null) {
                                                        i6 = R.id.tvEmptyState;
                                                        RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.tvEmptyState, inflate);
                                                        if (robertoTextView != null) {
                                                            i6 = R.id.tvTitleCard;
                                                            if (((RobertoTextView) hc.d.w(R.id.tvTitleCard, inflate)) != null) {
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                                                this.f5370v = new yp.k(constraintLayout2, robertoButton, robertoButton2, constraintLayout, recyclerView, appCompatImageView, progressBar, recyclerView2, robertoTextView);
                                                                return constraintLayout2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.F.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z10;
        super.onResume();
        bm.d dVar = this.f5372x;
        if (dVar != null) {
            fm.a aVar = this.f5373y;
            if (aVar != null) {
                if (dVar.f() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.t(Boolean.valueOf(z10), null, null);
            }
            fm.a aVar2 = this.f5373y;
            if (aVar2 != null) {
                aVar2.A(dVar.C);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ProgressBar progressBar;
        RobertoButton robertoButton;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        fm.a aVar = (fm.a) new o0(requireActivity).a(fm.a.class);
        aVar.p();
        aVar.F.e(getViewLifecycleOwner(), new tl.m(18, new u(this)));
        aVar.X.e(requireActivity(), new tl.m(19, new v(this)));
        ((androidx.lifecycle.w) aVar.O.getValue()).e(getViewLifecycleOwner(), new tl.m(20, new w(this, aVar)));
        aVar.Y.e(getViewLifecycleOwner(), new tl.m(21, new x(this)));
        this.f5373y = aVar;
        yp.k kVar = this.f5370v;
        if (kVar != null && (robertoButton = kVar.f38840a) != null) {
            robertoButton.setOnClickListener(new n(this, 0));
        }
        yp.k kVar2 = this.f5370v;
        if (kVar2 != null && (progressBar = kVar2.f) != null) {
            Extensions.INSTANCE.visible(progressBar);
        }
    }
}
