package cm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.q1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: V3GoalsCustomFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcm/z;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z extends rr.b {
    public static final /* synthetic */ int D = 0;

    /* renamed from: v  reason: collision with root package name */
    public q1 f5391v;

    /* renamed from: w  reason: collision with root package name */
    public V3GoalsActivity f5392w;

    /* renamed from: x  reason: collision with root package name */
    public bm.m f5393x;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f5390u = LogHelper.INSTANCE.makeLogTag(z.class);

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<hs.f<?, ?>> f5394y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public int f5395z = -1;
    public int A = -1;
    public int B = -1;

    /* compiled from: V3GoalsCustomFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            z zVar = z.this;
            q1 q1Var = zVar.f5391v;
            if (q1Var != null) {
                V3GoalsActivity v3GoalsActivity = zVar.f5392w;
                if (v3GoalsActivity != null) {
                    q1Var.e(v3GoalsActivity.s0(), SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                    ((RecyclerView) zVar._$_findCachedViewById(R.id.goalRecyclerView)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                throw null;
            }
            kotlin.jvm.internal.i.q("goalViewModel");
            throw null;
        }
    }

    public final void J() {
        boolean z10;
        try {
            if (this.f5392w != null) {
                boolean z11 = true;
                String str = "Edit Goals";
                int i6 = 8;
                if (this.f5394y.isEmpty()) {
                    V3GoalsActivity v3GoalsActivity = this.f5392w;
                    if (v3GoalsActivity != null) {
                        if (v3GoalsActivity.F == 1) {
                            v3GoalsActivity.w0(false);
                        }
                        V3GoalsActivity v3GoalsActivity2 = this.f5392w;
                        if (v3GoalsActivity2 != null) {
                            v3GoalsActivity2.v0("Edit Goals");
                            V3GoalsActivity v3GoalsActivity3 = this.f5392w;
                            if (v3GoalsActivity3 != null) {
                                CardView cardView = (CardView) v3GoalsActivity3.n0(R.id.goalFeedbackLayout);
                                if (cardView != null && cardView.getVisibility() == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivEmptyState);
                                    if (appCompatImageView != null) {
                                        appCompatImageView.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyState);
                                    if (robertoTextView != null) {
                                        robertoTextView.setVisibility(0);
                                    }
                                    RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyStateTitle);
                                    if (robertoTextView2 != null) {
                                        robertoTextView2.setVisibility(0);
                                    }
                                }
                                ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setVisibility(8);
                                RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.addGoalsButtonMain);
                                V3GoalsActivity v3GoalsActivity4 = this.f5392w;
                                if (v3GoalsActivity4 != null) {
                                    if (kotlin.jvm.internal.i.b(v3GoalsActivity4.s0(), Utils.INSTANCE.getTodayCalendar().getTime())) {
                                        i6 = 0;
                                    }
                                    robertoButton.setVisibility(i6);
                                    bm.m mVar = this.f5393x;
                                    if (mVar == null || !mVar.G) {
                                        z11 = false;
                                    }
                                    if (z11 && mVar != null) {
                                        mVar.v(false);
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                        throw null;
                    }
                } else {
                    V3GoalsActivity v3GoalsActivity5 = this.f5392w;
                    if (v3GoalsActivity5 != null) {
                        if (v3GoalsActivity5.F == 1) {
                            v3GoalsActivity5.w0(true);
                        }
                        ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setVisibility(0);
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivEmptyState);
                        if (appCompatImageView2 != null) {
                            appCompatImageView2.setVisibility(8);
                        }
                        RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyState);
                        if (robertoTextView3 != null) {
                            robertoTextView3.setVisibility(8);
                        }
                        RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyStateTitle);
                        if (robertoTextView4 != null) {
                            robertoTextView4.setVisibility(8);
                        }
                        ((RobertoButton) _$_findCachedViewById(R.id.addGoalsButtonMain)).setVisibility(8);
                    } else {
                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                        throw null;
                    }
                }
                V3GoalsActivity v3GoalsActivity6 = this.f5392w;
                if (v3GoalsActivity6 != null) {
                    if (v3GoalsActivity6.f11191z.before(Utils.INSTANCE.getTodayCalendar().getTime())) {
                        RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyState);
                        if (robertoTextView5 != null) {
                            robertoTextView5.setText("You didn't have any goals added for this day.");
                        }
                        RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyState);
                        if (robertoTextView6 != null) {
                            robertoTextView6.setGravity(17);
                        }
                    } else {
                        RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyState);
                        if (robertoTextView7 != null) {
                            robertoTextView7.setText(getString(R.string.customGoalNullText1));
                        }
                        RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyState);
                        if (robertoTextView8 != null) {
                            robertoTextView8.setGravity(8388611);
                        }
                    }
                    bm.m mVar2 = this.f5393x;
                    if (mVar2 != null) {
                        V3GoalsActivity v3GoalsActivity7 = this.f5392w;
                        if (v3GoalsActivity7 != null) {
                            if (mVar2.G) {
                                str = "Done";
                            }
                            v3GoalsActivity7.v0(str);
                            return;
                        }
                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                        throw null;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                throw null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5390u, e10);
        }
    }

    public final void K() {
        try {
            V3GoalsActivity v3GoalsActivity = this.f5392w;
            if (v3GoalsActivity != null) {
                Date s02 = v3GoalsActivity.s0();
                V3GoalsActivity v3GoalsActivity2 = this.f5392w;
                if (v3GoalsActivity2 != null) {
                    this.f5393x = new bm.m(v3GoalsActivity, s02, v3GoalsActivity2, this.f5394y);
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setHasFixedSize(false);
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setItemAnimator(new androidx.recyclerview.widget.c());
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setAdapter(this.f5393x);
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).getViewTreeObserver().addOnGlobalLayoutListener(new a());
                    return;
                }
                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                throw null;
            }
            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5390u, e10);
        }
    }

    public final void M(Date date) {
        try {
            bm.m mVar = this.f5393x;
            if (mVar != null) {
                mVar.B = date;
                Calendar calendar = mVar.f4491z.getWeekOf(date.getTime()).get(0);
                kotlin.jvm.internal.i.f(calendar, "goalHelper.getWeekOf(this.date.time)[0]");
                mVar.A = calendar;
                q1 q1Var = this.f5391v;
                if (q1Var != null) {
                    q1Var.e(date, SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                } else {
                    kotlin.jvm.internal.i.q("goalViewModel");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5390u, e10);
        }
    }

    public final void O(Date date) {
        try {
            if (this.f5393x != null) {
                q1 q1Var = this.f5391v;
                if (q1Var != null) {
                    q1Var.e(date, SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                } else {
                    kotlin.jvm.internal.i.q("goalViewModel");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5390u, e10);
        }
    }

    public final void P() {
        try {
            q1 q1Var = this.f5391v;
            if (q1Var != null) {
                V3GoalsActivity v3GoalsActivity = this.f5392w;
                if (v3GoalsActivity != null) {
                    q1Var.e(v3GoalsActivity.s0(), SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                    K();
                    q1 q1Var2 = this.f5391v;
                    if (q1Var2 != null) {
                        q1Var2.f15518z.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.y

                            /* renamed from: b  reason: collision with root package name */
                            public final /* synthetic */ z f5389b;

                            {
                                this.f5389b = this;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
                            @Override // androidx.lifecycle.x
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void a(Object obj) {
                                Object obj2;
                                boolean z10;
                                boolean z11;
                                int i6 = r2;
                                z this$0 = this.f5389b;
                                switch (i6) {
                                    case 0:
                                        ArrayList arrayList = (ArrayList) obj;
                                        int i10 = z.D;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5394y;
                                        arrayList2.clear();
                                        arrayList2.addAll(arrayList);
                                        hs.f fVar = (hs.f) is.u.i2(arrayList2);
                                        if (fVar != null) {
                                            obj2 = fVar.f19464u;
                                        } else {
                                            obj2 = null;
                                        }
                                        if (kotlin.jvm.internal.i.b(obj2, "C")) {
                                            bm.m mVar = this$0.f5393x;
                                            if (mVar != null) {
                                                if (mVar.G && mVar.Q != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    z10 = true;
                                                    if (z10) {
                                                        arrayList2.remove(0);
                                                    }
                                                }
                                            }
                                            z10 = false;
                                            if (z10) {
                                            }
                                        }
                                        this$0.J();
                                        bm.m mVar2 = this$0.f5393x;
                                        if (mVar2 != null) {
                                            mVar2.C = arrayList2;
                                            mVar2.i();
                                        }
                                        if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                            V3GoalsActivity v3GoalsActivity2 = this$0.f5392w;
                                            if (v3GoalsActivity2 != null) {
                                                v3GoalsActivity2.y0(true);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                throw null;
                                            }
                                        }
                                        V3GoalsActivity v3GoalsActivity3 = this$0.f5392w;
                                        if (v3GoalsActivity3 != null) {
                                            v3GoalsActivity3.y0(false);
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                            throw null;
                                        }
                                    case 1:
                                        Integer it = (Integer) obj;
                                        int i11 = z.D;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.m mVar3 = this$0.f5393x;
                                        if (mVar3 != null) {
                                            kotlin.jvm.internal.i.f(it, "it");
                                            mVar3.x(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        Integer it2 = (Integer) obj;
                                        int i12 = z.D;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.m mVar4 = this$0.f5393x;
                                        if (mVar4 != null) {
                                            kotlin.jvm.internal.i.f(it2, "it");
                                            mVar4.x(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        Integer it3 = (Integer) obj;
                                        int i13 = z.D;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.m mVar5 = this$0.f5393x;
                                        if (mVar5 != null) {
                                            kotlin.jvm.internal.i.f(it3, "it");
                                            mVar5.x(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        Integer it4 = (Integer) obj;
                                        int i14 = z.D;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.m mVar6 = this$0.f5393x;
                                        if (mVar6 != null) {
                                            kotlin.jvm.internal.i.f(it4, "it");
                                            mVar6.y(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        Integer it5 = (Integer) obj;
                                        int i15 = z.D;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.m mVar7 = this$0.f5393x;
                                        if (mVar7 != null) {
                                            kotlin.jvm.internal.i.f(it5, "it");
                                            mVar7.y(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        Integer it6 = (Integer) obj;
                                        int i16 = z.D;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.m mVar8 = this$0.f5393x;
                                        if (mVar8 != null) {
                                            kotlin.jvm.internal.i.f(it6, "it");
                                            mVar8.y(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                            return;
                                        }
                                        return;
                                    case 7:
                                        Integer it7 = (Integer) obj;
                                        int i17 = z.D;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (it7 == null || it7.intValue() != -1) {
                                            int i18 = this$0.f5395z;
                                            if (it7 == null || it7.intValue() != i18) {
                                                kotlin.jvm.internal.i.f(it7, "it");
                                                this$0.f5395z = it7.intValue();
                                                bm.m mVar9 = this$0.f5393x;
                                                if (mVar9 != null) {
                                                    mVar9.z(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 8:
                                        Integer it8 = (Integer) obj;
                                        int i19 = z.D;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (it8 == null || it8.intValue() != -1) {
                                            int i20 = this$0.A;
                                            if (it8 == null || it8.intValue() != i20) {
                                                kotlin.jvm.internal.i.f(it8, "it");
                                                this$0.A = it8.intValue();
                                                bm.m mVar10 = this$0.f5393x;
                                                if (mVar10 != null) {
                                                    mVar10.z(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        Integer it9 = (Integer) obj;
                                        int i21 = z.D;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (it9 == null || it9.intValue() != -1) {
                                            int i22 = this$0.B;
                                            if (it9 == null || i22 != it9.intValue()) {
                                                kotlin.jvm.internal.i.f(it9, "it");
                                                this$0.B = it9.intValue();
                                                bm.m mVar11 = this$0.f5393x;
                                                if (mVar11 != null) {
                                                    mVar11.z(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
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
                        q1 q1Var3 = this.f5391v;
                        if (q1Var3 != null) {
                            q1Var3.D.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.y

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ z f5389b;

                                {
                                    this.f5389b = this;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
                                @Override // androidx.lifecycle.x
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void a(Object obj) {
                                    Object obj2;
                                    boolean z10;
                                    boolean z11;
                                    int i6 = r2;
                                    z this$0 = this.f5389b;
                                    switch (i6) {
                                        case 0:
                                            ArrayList arrayList = (ArrayList) obj;
                                            int i10 = z.D;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5394y;
                                            arrayList2.clear();
                                            arrayList2.addAll(arrayList);
                                            hs.f fVar = (hs.f) is.u.i2(arrayList2);
                                            if (fVar != null) {
                                                obj2 = fVar.f19464u;
                                            } else {
                                                obj2 = null;
                                            }
                                            if (kotlin.jvm.internal.i.b(obj2, "C")) {
                                                bm.m mVar = this$0.f5393x;
                                                if (mVar != null) {
                                                    if (mVar.G && mVar.Q != null) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        z10 = true;
                                                        if (z10) {
                                                            arrayList2.remove(0);
                                                        }
                                                    }
                                                }
                                                z10 = false;
                                                if (z10) {
                                                }
                                            }
                                            this$0.J();
                                            bm.m mVar2 = this$0.f5393x;
                                            if (mVar2 != null) {
                                                mVar2.C = arrayList2;
                                                mVar2.i();
                                            }
                                            if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                V3GoalsActivity v3GoalsActivity2 = this$0.f5392w;
                                                if (v3GoalsActivity2 != null) {
                                                    v3GoalsActivity2.y0(true);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                    throw null;
                                                }
                                            }
                                            V3GoalsActivity v3GoalsActivity3 = this$0.f5392w;
                                            if (v3GoalsActivity3 != null) {
                                                v3GoalsActivity3.y0(false);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                throw null;
                                            }
                                        case 1:
                                            Integer it = (Integer) obj;
                                            int i11 = z.D;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.m mVar3 = this$0.f5393x;
                                            if (mVar3 != null) {
                                                kotlin.jvm.internal.i.f(it, "it");
                                                mVar3.x(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            Integer it2 = (Integer) obj;
                                            int i12 = z.D;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.m mVar4 = this$0.f5393x;
                                            if (mVar4 != null) {
                                                kotlin.jvm.internal.i.f(it2, "it");
                                                mVar4.x(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            Integer it3 = (Integer) obj;
                                            int i13 = z.D;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.m mVar5 = this$0.f5393x;
                                            if (mVar5 != null) {
                                                kotlin.jvm.internal.i.f(it3, "it");
                                                mVar5.x(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                return;
                                            }
                                            return;
                                        case 4:
                                            Integer it4 = (Integer) obj;
                                            int i14 = z.D;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.m mVar6 = this$0.f5393x;
                                            if (mVar6 != null) {
                                                kotlin.jvm.internal.i.f(it4, "it");
                                                mVar6.y(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            Integer it5 = (Integer) obj;
                                            int i15 = z.D;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.m mVar7 = this$0.f5393x;
                                            if (mVar7 != null) {
                                                kotlin.jvm.internal.i.f(it5, "it");
                                                mVar7.y(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            Integer it6 = (Integer) obj;
                                            int i16 = z.D;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.m mVar8 = this$0.f5393x;
                                            if (mVar8 != null) {
                                                kotlin.jvm.internal.i.f(it6, "it");
                                                mVar8.y(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            Integer it7 = (Integer) obj;
                                            int i17 = z.D;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (it7 == null || it7.intValue() != -1) {
                                                int i18 = this$0.f5395z;
                                                if (it7 == null || it7.intValue() != i18) {
                                                    kotlin.jvm.internal.i.f(it7, "it");
                                                    this$0.f5395z = it7.intValue();
                                                    bm.m mVar9 = this$0.f5393x;
                                                    if (mVar9 != null) {
                                                        mVar9.z(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        case 8:
                                            Integer it8 = (Integer) obj;
                                            int i19 = z.D;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (it8 == null || it8.intValue() != -1) {
                                                int i20 = this$0.A;
                                                if (it8 == null || it8.intValue() != i20) {
                                                    kotlin.jvm.internal.i.f(it8, "it");
                                                    this$0.A = it8.intValue();
                                                    bm.m mVar10 = this$0.f5393x;
                                                    if (mVar10 != null) {
                                                        mVar10.z(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            Integer it9 = (Integer) obj;
                                            int i21 = z.D;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (it9 == null || it9.intValue() != -1) {
                                                int i22 = this$0.B;
                                                if (it9 == null || i22 != it9.intValue()) {
                                                    kotlin.jvm.internal.i.f(it9, "it");
                                                    this$0.B = it9.intValue();
                                                    bm.m mVar11 = this$0.f5393x;
                                                    if (mVar11 != null) {
                                                        mVar11.z(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
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
                            q1 q1Var4 = this.f5391v;
                            if (q1Var4 != null) {
                                q1Var4.E.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.y

                                    /* renamed from: b  reason: collision with root package name */
                                    public final /* synthetic */ z f5389b;

                                    {
                                        this.f5389b = this;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
                                    @Override // androidx.lifecycle.x
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void a(Object obj) {
                                        Object obj2;
                                        boolean z10;
                                        boolean z11;
                                        int i6 = r2;
                                        z this$0 = this.f5389b;
                                        switch (i6) {
                                            case 0:
                                                ArrayList arrayList = (ArrayList) obj;
                                                int i10 = z.D;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5394y;
                                                arrayList2.clear();
                                                arrayList2.addAll(arrayList);
                                                hs.f fVar = (hs.f) is.u.i2(arrayList2);
                                                if (fVar != null) {
                                                    obj2 = fVar.f19464u;
                                                } else {
                                                    obj2 = null;
                                                }
                                                if (kotlin.jvm.internal.i.b(obj2, "C")) {
                                                    bm.m mVar = this$0.f5393x;
                                                    if (mVar != null) {
                                                        if (mVar.G && mVar.Q != null) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (z11) {
                                                            z10 = true;
                                                            if (z10) {
                                                                arrayList2.remove(0);
                                                            }
                                                        }
                                                    }
                                                    z10 = false;
                                                    if (z10) {
                                                    }
                                                }
                                                this$0.J();
                                                bm.m mVar2 = this$0.f5393x;
                                                if (mVar2 != null) {
                                                    mVar2.C = arrayList2;
                                                    mVar2.i();
                                                }
                                                if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                    V3GoalsActivity v3GoalsActivity2 = this$0.f5392w;
                                                    if (v3GoalsActivity2 != null) {
                                                        v3GoalsActivity2.y0(true);
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                        throw null;
                                                    }
                                                }
                                                V3GoalsActivity v3GoalsActivity3 = this$0.f5392w;
                                                if (v3GoalsActivity3 != null) {
                                                    v3GoalsActivity3.y0(false);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                    throw null;
                                                }
                                            case 1:
                                                Integer it = (Integer) obj;
                                                int i11 = z.D;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.m mVar3 = this$0.f5393x;
                                                if (mVar3 != null) {
                                                    kotlin.jvm.internal.i.f(it, "it");
                                                    mVar3.x(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                    return;
                                                }
                                                return;
                                            case 2:
                                                Integer it2 = (Integer) obj;
                                                int i12 = z.D;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.m mVar4 = this$0.f5393x;
                                                if (mVar4 != null) {
                                                    kotlin.jvm.internal.i.f(it2, "it");
                                                    mVar4.x(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                    return;
                                                }
                                                return;
                                            case 3:
                                                Integer it3 = (Integer) obj;
                                                int i13 = z.D;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.m mVar5 = this$0.f5393x;
                                                if (mVar5 != null) {
                                                    kotlin.jvm.internal.i.f(it3, "it");
                                                    mVar5.x(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                    return;
                                                }
                                                return;
                                            case 4:
                                                Integer it4 = (Integer) obj;
                                                int i14 = z.D;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.m mVar6 = this$0.f5393x;
                                                if (mVar6 != null) {
                                                    kotlin.jvm.internal.i.f(it4, "it");
                                                    mVar6.y(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                    return;
                                                }
                                                return;
                                            case 5:
                                                Integer it5 = (Integer) obj;
                                                int i15 = z.D;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.m mVar7 = this$0.f5393x;
                                                if (mVar7 != null) {
                                                    kotlin.jvm.internal.i.f(it5, "it");
                                                    mVar7.y(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                    return;
                                                }
                                                return;
                                            case 6:
                                                Integer it6 = (Integer) obj;
                                                int i16 = z.D;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.m mVar8 = this$0.f5393x;
                                                if (mVar8 != null) {
                                                    kotlin.jvm.internal.i.f(it6, "it");
                                                    mVar8.y(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                    return;
                                                }
                                                return;
                                            case 7:
                                                Integer it7 = (Integer) obj;
                                                int i17 = z.D;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (it7 == null || it7.intValue() != -1) {
                                                    int i18 = this$0.f5395z;
                                                    if (it7 == null || it7.intValue() != i18) {
                                                        kotlin.jvm.internal.i.f(it7, "it");
                                                        this$0.f5395z = it7.intValue();
                                                        bm.m mVar9 = this$0.f5393x;
                                                        if (mVar9 != null) {
                                                            mVar9.z(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            case 8:
                                                Integer it8 = (Integer) obj;
                                                int i19 = z.D;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (it8 == null || it8.intValue() != -1) {
                                                    int i20 = this$0.A;
                                                    if (it8 == null || it8.intValue() != i20) {
                                                        kotlin.jvm.internal.i.f(it8, "it");
                                                        this$0.A = it8.intValue();
                                                        bm.m mVar10 = this$0.f5393x;
                                                        if (mVar10 != null) {
                                                            mVar10.z(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                Integer it9 = (Integer) obj;
                                                int i21 = z.D;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (it9 == null || it9.intValue() != -1) {
                                                    int i22 = this$0.B;
                                                    if (it9 == null || i22 != it9.intValue()) {
                                                        kotlin.jvm.internal.i.f(it9, "it");
                                                        this$0.B = it9.intValue();
                                                        bm.m mVar11 = this$0.f5393x;
                                                        if (mVar11 != null) {
                                                            mVar11.z(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
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
                                q1 q1Var5 = this.f5391v;
                                if (q1Var5 != null) {
                                    q1Var5.F.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.y

                                        /* renamed from: b  reason: collision with root package name */
                                        public final /* synthetic */ z f5389b;

                                        {
                                            this.f5389b = this;
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
                                        @Override // androidx.lifecycle.x
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final void a(Object obj) {
                                            Object obj2;
                                            boolean z10;
                                            boolean z11;
                                            int i6 = r2;
                                            z this$0 = this.f5389b;
                                            switch (i6) {
                                                case 0:
                                                    ArrayList arrayList = (ArrayList) obj;
                                                    int i10 = z.D;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5394y;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(arrayList);
                                                    hs.f fVar = (hs.f) is.u.i2(arrayList2);
                                                    if (fVar != null) {
                                                        obj2 = fVar.f19464u;
                                                    } else {
                                                        obj2 = null;
                                                    }
                                                    if (kotlin.jvm.internal.i.b(obj2, "C")) {
                                                        bm.m mVar = this$0.f5393x;
                                                        if (mVar != null) {
                                                            if (mVar.G && mVar.Q != null) {
                                                                z11 = true;
                                                            } else {
                                                                z11 = false;
                                                            }
                                                            if (z11) {
                                                                z10 = true;
                                                                if (z10) {
                                                                    arrayList2.remove(0);
                                                                }
                                                            }
                                                        }
                                                        z10 = false;
                                                        if (z10) {
                                                        }
                                                    }
                                                    this$0.J();
                                                    bm.m mVar2 = this$0.f5393x;
                                                    if (mVar2 != null) {
                                                        mVar2.C = arrayList2;
                                                        mVar2.i();
                                                    }
                                                    if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                        V3GoalsActivity v3GoalsActivity2 = this$0.f5392w;
                                                        if (v3GoalsActivity2 != null) {
                                                            v3GoalsActivity2.y0(true);
                                                            return;
                                                        } else {
                                                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                            throw null;
                                                        }
                                                    }
                                                    V3GoalsActivity v3GoalsActivity3 = this$0.f5392w;
                                                    if (v3GoalsActivity3 != null) {
                                                        v3GoalsActivity3.y0(false);
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                        throw null;
                                                    }
                                                case 1:
                                                    Integer it = (Integer) obj;
                                                    int i11 = z.D;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.m mVar3 = this$0.f5393x;
                                                    if (mVar3 != null) {
                                                        kotlin.jvm.internal.i.f(it, "it");
                                                        mVar3.x(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                        return;
                                                    }
                                                    return;
                                                case 2:
                                                    Integer it2 = (Integer) obj;
                                                    int i12 = z.D;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.m mVar4 = this$0.f5393x;
                                                    if (mVar4 != null) {
                                                        kotlin.jvm.internal.i.f(it2, "it");
                                                        mVar4.x(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                        return;
                                                    }
                                                    return;
                                                case 3:
                                                    Integer it3 = (Integer) obj;
                                                    int i13 = z.D;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.m mVar5 = this$0.f5393x;
                                                    if (mVar5 != null) {
                                                        kotlin.jvm.internal.i.f(it3, "it");
                                                        mVar5.x(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                        return;
                                                    }
                                                    return;
                                                case 4:
                                                    Integer it4 = (Integer) obj;
                                                    int i14 = z.D;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.m mVar6 = this$0.f5393x;
                                                    if (mVar6 != null) {
                                                        kotlin.jvm.internal.i.f(it4, "it");
                                                        mVar6.y(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                        return;
                                                    }
                                                    return;
                                                case 5:
                                                    Integer it5 = (Integer) obj;
                                                    int i15 = z.D;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.m mVar7 = this$0.f5393x;
                                                    if (mVar7 != null) {
                                                        kotlin.jvm.internal.i.f(it5, "it");
                                                        mVar7.y(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                        return;
                                                    }
                                                    return;
                                                case 6:
                                                    Integer it6 = (Integer) obj;
                                                    int i16 = z.D;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.m mVar8 = this$0.f5393x;
                                                    if (mVar8 != null) {
                                                        kotlin.jvm.internal.i.f(it6, "it");
                                                        mVar8.y(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                        return;
                                                    }
                                                    return;
                                                case 7:
                                                    Integer it7 = (Integer) obj;
                                                    int i17 = z.D;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    if (it7 == null || it7.intValue() != -1) {
                                                        int i18 = this$0.f5395z;
                                                        if (it7 == null || it7.intValue() != i18) {
                                                            kotlin.jvm.internal.i.f(it7, "it");
                                                            this$0.f5395z = it7.intValue();
                                                            bm.m mVar9 = this$0.f5393x;
                                                            if (mVar9 != null) {
                                                                mVar9.z(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                case 8:
                                                    Integer it8 = (Integer) obj;
                                                    int i19 = z.D;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    if (it8 == null || it8.intValue() != -1) {
                                                        int i20 = this$0.A;
                                                        if (it8 == null || it8.intValue() != i20) {
                                                            kotlin.jvm.internal.i.f(it8, "it");
                                                            this$0.A = it8.intValue();
                                                            bm.m mVar10 = this$0.f5393x;
                                                            if (mVar10 != null) {
                                                                mVar10.z(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    Integer it9 = (Integer) obj;
                                                    int i21 = z.D;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    if (it9 == null || it9.intValue() != -1) {
                                                        int i22 = this$0.B;
                                                        if (it9 == null || i22 != it9.intValue()) {
                                                            kotlin.jvm.internal.i.f(it9, "it");
                                                            this$0.B = it9.intValue();
                                                            bm.m mVar11 = this$0.f5393x;
                                                            if (mVar11 != null) {
                                                                mVar11.z(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
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
                                    q1 q1Var6 = this.f5391v;
                                    if (q1Var6 != null) {
                                        q1Var6.G.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.y

                                            /* renamed from: b  reason: collision with root package name */
                                            public final /* synthetic */ z f5389b;

                                            {
                                                this.f5389b = this;
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
                                            @Override // androidx.lifecycle.x
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void a(Object obj) {
                                                Object obj2;
                                                boolean z10;
                                                boolean z11;
                                                int i6 = r2;
                                                z this$0 = this.f5389b;
                                                switch (i6) {
                                                    case 0:
                                                        ArrayList arrayList = (ArrayList) obj;
                                                        int i10 = z.D;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5394y;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(arrayList);
                                                        hs.f fVar = (hs.f) is.u.i2(arrayList2);
                                                        if (fVar != null) {
                                                            obj2 = fVar.f19464u;
                                                        } else {
                                                            obj2 = null;
                                                        }
                                                        if (kotlin.jvm.internal.i.b(obj2, "C")) {
                                                            bm.m mVar = this$0.f5393x;
                                                            if (mVar != null) {
                                                                if (mVar.G && mVar.Q != null) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                                if (z11) {
                                                                    z10 = true;
                                                                    if (z10) {
                                                                        arrayList2.remove(0);
                                                                    }
                                                                }
                                                            }
                                                            z10 = false;
                                                            if (z10) {
                                                            }
                                                        }
                                                        this$0.J();
                                                        bm.m mVar2 = this$0.f5393x;
                                                        if (mVar2 != null) {
                                                            mVar2.C = arrayList2;
                                                            mVar2.i();
                                                        }
                                                        if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                            V3GoalsActivity v3GoalsActivity2 = this$0.f5392w;
                                                            if (v3GoalsActivity2 != null) {
                                                                v3GoalsActivity2.y0(true);
                                                                return;
                                                            } else {
                                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                throw null;
                                                            }
                                                        }
                                                        V3GoalsActivity v3GoalsActivity3 = this$0.f5392w;
                                                        if (v3GoalsActivity3 != null) {
                                                            v3GoalsActivity3.y0(false);
                                                            return;
                                                        } else {
                                                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                            throw null;
                                                        }
                                                    case 1:
                                                        Integer it = (Integer) obj;
                                                        int i11 = z.D;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.m mVar3 = this$0.f5393x;
                                                        if (mVar3 != null) {
                                                            kotlin.jvm.internal.i.f(it, "it");
                                                            mVar3.x(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                            return;
                                                        }
                                                        return;
                                                    case 2:
                                                        Integer it2 = (Integer) obj;
                                                        int i12 = z.D;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.m mVar4 = this$0.f5393x;
                                                        if (mVar4 != null) {
                                                            kotlin.jvm.internal.i.f(it2, "it");
                                                            mVar4.x(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                            return;
                                                        }
                                                        return;
                                                    case 3:
                                                        Integer it3 = (Integer) obj;
                                                        int i13 = z.D;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.m mVar5 = this$0.f5393x;
                                                        if (mVar5 != null) {
                                                            kotlin.jvm.internal.i.f(it3, "it");
                                                            mVar5.x(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                            return;
                                                        }
                                                        return;
                                                    case 4:
                                                        Integer it4 = (Integer) obj;
                                                        int i14 = z.D;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.m mVar6 = this$0.f5393x;
                                                        if (mVar6 != null) {
                                                            kotlin.jvm.internal.i.f(it4, "it");
                                                            mVar6.y(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                            return;
                                                        }
                                                        return;
                                                    case 5:
                                                        Integer it5 = (Integer) obj;
                                                        int i15 = z.D;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.m mVar7 = this$0.f5393x;
                                                        if (mVar7 != null) {
                                                            kotlin.jvm.internal.i.f(it5, "it");
                                                            mVar7.y(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                            return;
                                                        }
                                                        return;
                                                    case 6:
                                                        Integer it6 = (Integer) obj;
                                                        int i16 = z.D;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.m mVar8 = this$0.f5393x;
                                                        if (mVar8 != null) {
                                                            kotlin.jvm.internal.i.f(it6, "it");
                                                            mVar8.y(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                            return;
                                                        }
                                                        return;
                                                    case 7:
                                                        Integer it7 = (Integer) obj;
                                                        int i17 = z.D;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (it7 == null || it7.intValue() != -1) {
                                                            int i18 = this$0.f5395z;
                                                            if (it7 == null || it7.intValue() != i18) {
                                                                kotlin.jvm.internal.i.f(it7, "it");
                                                                this$0.f5395z = it7.intValue();
                                                                bm.m mVar9 = this$0.f5393x;
                                                                if (mVar9 != null) {
                                                                    mVar9.z(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    case 8:
                                                        Integer it8 = (Integer) obj;
                                                        int i19 = z.D;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (it8 == null || it8.intValue() != -1) {
                                                            int i20 = this$0.A;
                                                            if (it8 == null || it8.intValue() != i20) {
                                                                kotlin.jvm.internal.i.f(it8, "it");
                                                                this$0.A = it8.intValue();
                                                                bm.m mVar10 = this$0.f5393x;
                                                                if (mVar10 != null) {
                                                                    mVar10.z(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        Integer it9 = (Integer) obj;
                                                        int i21 = z.D;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (it9 == null || it9.intValue() != -1) {
                                                            int i22 = this$0.B;
                                                            if (it9 == null || i22 != it9.intValue()) {
                                                                kotlin.jvm.internal.i.f(it9, "it");
                                                                this$0.B = it9.intValue();
                                                                bm.m mVar11 = this$0.f5393x;
                                                                if (mVar11 != null) {
                                                                    mVar11.z(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
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
                                        q1 q1Var7 = this.f5391v;
                                        if (q1Var7 != null) {
                                            q1Var7.H.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.y

                                                /* renamed from: b  reason: collision with root package name */
                                                public final /* synthetic */ z f5389b;

                                                {
                                                    this.f5389b = this;
                                                }

                                                /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
                                                @Override // androidx.lifecycle.x
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final void a(Object obj) {
                                                    Object obj2;
                                                    boolean z10;
                                                    boolean z11;
                                                    int i6 = r2;
                                                    z this$0 = this.f5389b;
                                                    switch (i6) {
                                                        case 0:
                                                            ArrayList arrayList = (ArrayList) obj;
                                                            int i10 = z.D;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5394y;
                                                            arrayList2.clear();
                                                            arrayList2.addAll(arrayList);
                                                            hs.f fVar = (hs.f) is.u.i2(arrayList2);
                                                            if (fVar != null) {
                                                                obj2 = fVar.f19464u;
                                                            } else {
                                                                obj2 = null;
                                                            }
                                                            if (kotlin.jvm.internal.i.b(obj2, "C")) {
                                                                bm.m mVar = this$0.f5393x;
                                                                if (mVar != null) {
                                                                    if (mVar.G && mVar.Q != null) {
                                                                        z11 = true;
                                                                    } else {
                                                                        z11 = false;
                                                                    }
                                                                    if (z11) {
                                                                        z10 = true;
                                                                        if (z10) {
                                                                            arrayList2.remove(0);
                                                                        }
                                                                    }
                                                                }
                                                                z10 = false;
                                                                if (z10) {
                                                                }
                                                            }
                                                            this$0.J();
                                                            bm.m mVar2 = this$0.f5393x;
                                                            if (mVar2 != null) {
                                                                mVar2.C = arrayList2;
                                                                mVar2.i();
                                                            }
                                                            if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                                V3GoalsActivity v3GoalsActivity2 = this$0.f5392w;
                                                                if (v3GoalsActivity2 != null) {
                                                                    v3GoalsActivity2.y0(true);
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                    throw null;
                                                                }
                                                            }
                                                            V3GoalsActivity v3GoalsActivity3 = this$0.f5392w;
                                                            if (v3GoalsActivity3 != null) {
                                                                v3GoalsActivity3.y0(false);
                                                                return;
                                                            } else {
                                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                throw null;
                                                            }
                                                        case 1:
                                                            Integer it = (Integer) obj;
                                                            int i11 = z.D;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.m mVar3 = this$0.f5393x;
                                                            if (mVar3 != null) {
                                                                kotlin.jvm.internal.i.f(it, "it");
                                                                mVar3.x(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                return;
                                                            }
                                                            return;
                                                        case 2:
                                                            Integer it2 = (Integer) obj;
                                                            int i12 = z.D;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.m mVar4 = this$0.f5393x;
                                                            if (mVar4 != null) {
                                                                kotlin.jvm.internal.i.f(it2, "it");
                                                                mVar4.x(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                return;
                                                            }
                                                            return;
                                                        case 3:
                                                            Integer it3 = (Integer) obj;
                                                            int i13 = z.D;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.m mVar5 = this$0.f5393x;
                                                            if (mVar5 != null) {
                                                                kotlin.jvm.internal.i.f(it3, "it");
                                                                mVar5.x(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                return;
                                                            }
                                                            return;
                                                        case 4:
                                                            Integer it4 = (Integer) obj;
                                                            int i14 = z.D;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.m mVar6 = this$0.f5393x;
                                                            if (mVar6 != null) {
                                                                kotlin.jvm.internal.i.f(it4, "it");
                                                                mVar6.y(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                return;
                                                            }
                                                            return;
                                                        case 5:
                                                            Integer it5 = (Integer) obj;
                                                            int i15 = z.D;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.m mVar7 = this$0.f5393x;
                                                            if (mVar7 != null) {
                                                                kotlin.jvm.internal.i.f(it5, "it");
                                                                mVar7.y(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                return;
                                                            }
                                                            return;
                                                        case 6:
                                                            Integer it6 = (Integer) obj;
                                                            int i16 = z.D;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.m mVar8 = this$0.f5393x;
                                                            if (mVar8 != null) {
                                                                kotlin.jvm.internal.i.f(it6, "it");
                                                                mVar8.y(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                return;
                                                            }
                                                            return;
                                                        case 7:
                                                            Integer it7 = (Integer) obj;
                                                            int i17 = z.D;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            if (it7 == null || it7.intValue() != -1) {
                                                                int i18 = this$0.f5395z;
                                                                if (it7 == null || it7.intValue() != i18) {
                                                                    kotlin.jvm.internal.i.f(it7, "it");
                                                                    this$0.f5395z = it7.intValue();
                                                                    bm.m mVar9 = this$0.f5393x;
                                                                    if (mVar9 != null) {
                                                                        mVar9.z(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        case 8:
                                                            Integer it8 = (Integer) obj;
                                                            int i19 = z.D;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            if (it8 == null || it8.intValue() != -1) {
                                                                int i20 = this$0.A;
                                                                if (it8 == null || it8.intValue() != i20) {
                                                                    kotlin.jvm.internal.i.f(it8, "it");
                                                                    this$0.A = it8.intValue();
                                                                    bm.m mVar10 = this$0.f5393x;
                                                                    if (mVar10 != null) {
                                                                        mVar10.z(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            Integer it9 = (Integer) obj;
                                                            int i21 = z.D;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            if (it9 == null || it9.intValue() != -1) {
                                                                int i22 = this$0.B;
                                                                if (it9 == null || i22 != it9.intValue()) {
                                                                    kotlin.jvm.internal.i.f(it9, "it");
                                                                    this$0.B = it9.intValue();
                                                                    bm.m mVar11 = this$0.f5393x;
                                                                    if (mVar11 != null) {
                                                                        mVar11.z(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
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
                                            q1 q1Var8 = this.f5391v;
                                            if (q1Var8 != null) {
                                                q1Var8.I.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.y

                                                    /* renamed from: b  reason: collision with root package name */
                                                    public final /* synthetic */ z f5389b;

                                                    {
                                                        this.f5389b = this;
                                                    }

                                                    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
                                                    @Override // androidx.lifecycle.x
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final void a(Object obj) {
                                                        Object obj2;
                                                        boolean z10;
                                                        boolean z11;
                                                        int i6 = r2;
                                                        z this$0 = this.f5389b;
                                                        switch (i6) {
                                                            case 0:
                                                                ArrayList arrayList = (ArrayList) obj;
                                                                int i10 = z.D;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5394y;
                                                                arrayList2.clear();
                                                                arrayList2.addAll(arrayList);
                                                                hs.f fVar = (hs.f) is.u.i2(arrayList2);
                                                                if (fVar != null) {
                                                                    obj2 = fVar.f19464u;
                                                                } else {
                                                                    obj2 = null;
                                                                }
                                                                if (kotlin.jvm.internal.i.b(obj2, "C")) {
                                                                    bm.m mVar = this$0.f5393x;
                                                                    if (mVar != null) {
                                                                        if (mVar.G && mVar.Q != null) {
                                                                            z11 = true;
                                                                        } else {
                                                                            z11 = false;
                                                                        }
                                                                        if (z11) {
                                                                            z10 = true;
                                                                            if (z10) {
                                                                                arrayList2.remove(0);
                                                                            }
                                                                        }
                                                                    }
                                                                    z10 = false;
                                                                    if (z10) {
                                                                    }
                                                                }
                                                                this$0.J();
                                                                bm.m mVar2 = this$0.f5393x;
                                                                if (mVar2 != null) {
                                                                    mVar2.C = arrayList2;
                                                                    mVar2.i();
                                                                }
                                                                if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                                    V3GoalsActivity v3GoalsActivity2 = this$0.f5392w;
                                                                    if (v3GoalsActivity2 != null) {
                                                                        v3GoalsActivity2.y0(true);
                                                                        return;
                                                                    } else {
                                                                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                        throw null;
                                                                    }
                                                                }
                                                                V3GoalsActivity v3GoalsActivity3 = this$0.f5392w;
                                                                if (v3GoalsActivity3 != null) {
                                                                    v3GoalsActivity3.y0(false);
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                    throw null;
                                                                }
                                                            case 1:
                                                                Integer it = (Integer) obj;
                                                                int i11 = z.D;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.m mVar3 = this$0.f5393x;
                                                                if (mVar3 != null) {
                                                                    kotlin.jvm.internal.i.f(it, "it");
                                                                    mVar3.x(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2:
                                                                Integer it2 = (Integer) obj;
                                                                int i12 = z.D;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.m mVar4 = this$0.f5393x;
                                                                if (mVar4 != null) {
                                                                    kotlin.jvm.internal.i.f(it2, "it");
                                                                    mVar4.x(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                    return;
                                                                }
                                                                return;
                                                            case 3:
                                                                Integer it3 = (Integer) obj;
                                                                int i13 = z.D;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.m mVar5 = this$0.f5393x;
                                                                if (mVar5 != null) {
                                                                    kotlin.jvm.internal.i.f(it3, "it");
                                                                    mVar5.x(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                    return;
                                                                }
                                                                return;
                                                            case 4:
                                                                Integer it4 = (Integer) obj;
                                                                int i14 = z.D;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.m mVar6 = this$0.f5393x;
                                                                if (mVar6 != null) {
                                                                    kotlin.jvm.internal.i.f(it4, "it");
                                                                    mVar6.y(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                    return;
                                                                }
                                                                return;
                                                            case 5:
                                                                Integer it5 = (Integer) obj;
                                                                int i15 = z.D;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.m mVar7 = this$0.f5393x;
                                                                if (mVar7 != null) {
                                                                    kotlin.jvm.internal.i.f(it5, "it");
                                                                    mVar7.y(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                    return;
                                                                }
                                                                return;
                                                            case 6:
                                                                Integer it6 = (Integer) obj;
                                                                int i16 = z.D;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.m mVar8 = this$0.f5393x;
                                                                if (mVar8 != null) {
                                                                    kotlin.jvm.internal.i.f(it6, "it");
                                                                    mVar8.y(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                    return;
                                                                }
                                                                return;
                                                            case 7:
                                                                Integer it7 = (Integer) obj;
                                                                int i17 = z.D;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                if (it7 == null || it7.intValue() != -1) {
                                                                    int i18 = this$0.f5395z;
                                                                    if (it7 == null || it7.intValue() != i18) {
                                                                        kotlin.jvm.internal.i.f(it7, "it");
                                                                        this$0.f5395z = it7.intValue();
                                                                        bm.m mVar9 = this$0.f5393x;
                                                                        if (mVar9 != null) {
                                                                            mVar9.z(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            case 8:
                                                                Integer it8 = (Integer) obj;
                                                                int i19 = z.D;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                if (it8 == null || it8.intValue() != -1) {
                                                                    int i20 = this$0.A;
                                                                    if (it8 == null || it8.intValue() != i20) {
                                                                        kotlin.jvm.internal.i.f(it8, "it");
                                                                        this$0.A = it8.intValue();
                                                                        bm.m mVar10 = this$0.f5393x;
                                                                        if (mVar10 != null) {
                                                                            mVar10.z(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                Integer it9 = (Integer) obj;
                                                                int i21 = z.D;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                if (it9 == null || it9.intValue() != -1) {
                                                                    int i22 = this$0.B;
                                                                    if (it9 == null || i22 != it9.intValue()) {
                                                                        kotlin.jvm.internal.i.f(it9, "it");
                                                                        this$0.B = it9.intValue();
                                                                        bm.m mVar11 = this$0.f5393x;
                                                                        if (mVar11 != null) {
                                                                            mVar11.z(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
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
                                                q1 q1Var9 = this.f5391v;
                                                if (q1Var9 != null) {
                                                    q1Var9.A.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.y

                                                        /* renamed from: b  reason: collision with root package name */
                                                        public final /* synthetic */ z f5389b;

                                                        {
                                                            this.f5389b = this;
                                                        }

                                                        /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
                                                        @Override // androidx.lifecycle.x
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                        */
                                                        public final void a(Object obj) {
                                                            Object obj2;
                                                            boolean z10;
                                                            boolean z11;
                                                            int i6 = r2;
                                                            z this$0 = this.f5389b;
                                                            switch (i6) {
                                                                case 0:
                                                                    ArrayList arrayList = (ArrayList) obj;
                                                                    int i10 = z.D;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5394y;
                                                                    arrayList2.clear();
                                                                    arrayList2.addAll(arrayList);
                                                                    hs.f fVar = (hs.f) is.u.i2(arrayList2);
                                                                    if (fVar != null) {
                                                                        obj2 = fVar.f19464u;
                                                                    } else {
                                                                        obj2 = null;
                                                                    }
                                                                    if (kotlin.jvm.internal.i.b(obj2, "C")) {
                                                                        bm.m mVar = this$0.f5393x;
                                                                        if (mVar != null) {
                                                                            if (mVar.G && mVar.Q != null) {
                                                                                z11 = true;
                                                                            } else {
                                                                                z11 = false;
                                                                            }
                                                                            if (z11) {
                                                                                z10 = true;
                                                                                if (z10) {
                                                                                    arrayList2.remove(0);
                                                                                }
                                                                            }
                                                                        }
                                                                        z10 = false;
                                                                        if (z10) {
                                                                        }
                                                                    }
                                                                    this$0.J();
                                                                    bm.m mVar2 = this$0.f5393x;
                                                                    if (mVar2 != null) {
                                                                        mVar2.C = arrayList2;
                                                                        mVar2.i();
                                                                    }
                                                                    if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                                        V3GoalsActivity v3GoalsActivity2 = this$0.f5392w;
                                                                        if (v3GoalsActivity2 != null) {
                                                                            v3GoalsActivity2.y0(true);
                                                                            return;
                                                                        } else {
                                                                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    V3GoalsActivity v3GoalsActivity3 = this$0.f5392w;
                                                                    if (v3GoalsActivity3 != null) {
                                                                        v3GoalsActivity3.y0(false);
                                                                        return;
                                                                    } else {
                                                                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                        throw null;
                                                                    }
                                                                case 1:
                                                                    Integer it = (Integer) obj;
                                                                    int i11 = z.D;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.m mVar3 = this$0.f5393x;
                                                                    if (mVar3 != null) {
                                                                        kotlin.jvm.internal.i.f(it, "it");
                                                                        mVar3.x(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 2:
                                                                    Integer it2 = (Integer) obj;
                                                                    int i12 = z.D;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.m mVar4 = this$0.f5393x;
                                                                    if (mVar4 != null) {
                                                                        kotlin.jvm.internal.i.f(it2, "it");
                                                                        mVar4.x(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 3:
                                                                    Integer it3 = (Integer) obj;
                                                                    int i13 = z.D;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.m mVar5 = this$0.f5393x;
                                                                    if (mVar5 != null) {
                                                                        kotlin.jvm.internal.i.f(it3, "it");
                                                                        mVar5.x(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 4:
                                                                    Integer it4 = (Integer) obj;
                                                                    int i14 = z.D;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.m mVar6 = this$0.f5393x;
                                                                    if (mVar6 != null) {
                                                                        kotlin.jvm.internal.i.f(it4, "it");
                                                                        mVar6.y(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 5:
                                                                    Integer it5 = (Integer) obj;
                                                                    int i15 = z.D;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.m mVar7 = this$0.f5393x;
                                                                    if (mVar7 != null) {
                                                                        kotlin.jvm.internal.i.f(it5, "it");
                                                                        mVar7.y(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 6:
                                                                    Integer it6 = (Integer) obj;
                                                                    int i16 = z.D;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.m mVar8 = this$0.f5393x;
                                                                    if (mVar8 != null) {
                                                                        kotlin.jvm.internal.i.f(it6, "it");
                                                                        mVar8.y(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 7:
                                                                    Integer it7 = (Integer) obj;
                                                                    int i17 = z.D;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    if (it7 == null || it7.intValue() != -1) {
                                                                        int i18 = this$0.f5395z;
                                                                        if (it7 == null || it7.intValue() != i18) {
                                                                            kotlin.jvm.internal.i.f(it7, "it");
                                                                            this$0.f5395z = it7.intValue();
                                                                            bm.m mVar9 = this$0.f5393x;
                                                                            if (mVar9 != null) {
                                                                                mVar9.z(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 8:
                                                                    Integer it8 = (Integer) obj;
                                                                    int i19 = z.D;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    if (it8 == null || it8.intValue() != -1) {
                                                                        int i20 = this$0.A;
                                                                        if (it8 == null || it8.intValue() != i20) {
                                                                            kotlin.jvm.internal.i.f(it8, "it");
                                                                            this$0.A = it8.intValue();
                                                                            bm.m mVar10 = this$0.f5393x;
                                                                            if (mVar10 != null) {
                                                                                mVar10.z(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                default:
                                                                    Integer it9 = (Integer) obj;
                                                                    int i21 = z.D;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    if (it9 == null || it9.intValue() != -1) {
                                                                        int i22 = this$0.B;
                                                                        if (it9 == null || i22 != it9.intValue()) {
                                                                            kotlin.jvm.internal.i.f(it9, "it");
                                                                            this$0.B = it9.intValue();
                                                                            bm.m mVar11 = this$0.f5393x;
                                                                            if (mVar11 != null) {
                                                                                mVar11.z(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
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
                                                    q1 q1Var10 = this.f5391v;
                                                    if (q1Var10 != null) {
                                                        q1Var10.B.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.y

                                                            /* renamed from: b  reason: collision with root package name */
                                                            public final /* synthetic */ z f5389b;

                                                            {
                                                                this.f5389b = this;
                                                            }

                                                            /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
                                                            @Override // androidx.lifecycle.x
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void a(Object obj) {
                                                                Object obj2;
                                                                boolean z10;
                                                                boolean z11;
                                                                int i6 = r2;
                                                                z this$0 = this.f5389b;
                                                                switch (i6) {
                                                                    case 0:
                                                                        ArrayList arrayList = (ArrayList) obj;
                                                                        int i10 = z.D;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5394y;
                                                                        arrayList2.clear();
                                                                        arrayList2.addAll(arrayList);
                                                                        hs.f fVar = (hs.f) is.u.i2(arrayList2);
                                                                        if (fVar != null) {
                                                                            obj2 = fVar.f19464u;
                                                                        } else {
                                                                            obj2 = null;
                                                                        }
                                                                        if (kotlin.jvm.internal.i.b(obj2, "C")) {
                                                                            bm.m mVar = this$0.f5393x;
                                                                            if (mVar != null) {
                                                                                if (mVar.G && mVar.Q != null) {
                                                                                    z11 = true;
                                                                                } else {
                                                                                    z11 = false;
                                                                                }
                                                                                if (z11) {
                                                                                    z10 = true;
                                                                                    if (z10) {
                                                                                        arrayList2.remove(0);
                                                                                    }
                                                                                }
                                                                            }
                                                                            z10 = false;
                                                                            if (z10) {
                                                                            }
                                                                        }
                                                                        this$0.J();
                                                                        bm.m mVar2 = this$0.f5393x;
                                                                        if (mVar2 != null) {
                                                                            mVar2.C = arrayList2;
                                                                            mVar2.i();
                                                                        }
                                                                        if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                                            V3GoalsActivity v3GoalsActivity2 = this$0.f5392w;
                                                                            if (v3GoalsActivity2 != null) {
                                                                                v3GoalsActivity2.y0(true);
                                                                                return;
                                                                            } else {
                                                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        V3GoalsActivity v3GoalsActivity3 = this$0.f5392w;
                                                                        if (v3GoalsActivity3 != null) {
                                                                            v3GoalsActivity3.y0(false);
                                                                            return;
                                                                        } else {
                                                                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                            throw null;
                                                                        }
                                                                    case 1:
                                                                        Integer it = (Integer) obj;
                                                                        int i11 = z.D;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.m mVar3 = this$0.f5393x;
                                                                        if (mVar3 != null) {
                                                                            kotlin.jvm.internal.i.f(it, "it");
                                                                            mVar3.x(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2:
                                                                        Integer it2 = (Integer) obj;
                                                                        int i12 = z.D;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.m mVar4 = this$0.f5393x;
                                                                        if (mVar4 != null) {
                                                                            kotlin.jvm.internal.i.f(it2, "it");
                                                                            mVar4.x(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 3:
                                                                        Integer it3 = (Integer) obj;
                                                                        int i13 = z.D;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.m mVar5 = this$0.f5393x;
                                                                        if (mVar5 != null) {
                                                                            kotlin.jvm.internal.i.f(it3, "it");
                                                                            mVar5.x(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 4:
                                                                        Integer it4 = (Integer) obj;
                                                                        int i14 = z.D;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.m mVar6 = this$0.f5393x;
                                                                        if (mVar6 != null) {
                                                                            kotlin.jvm.internal.i.f(it4, "it");
                                                                            mVar6.y(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 5:
                                                                        Integer it5 = (Integer) obj;
                                                                        int i15 = z.D;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.m mVar7 = this$0.f5393x;
                                                                        if (mVar7 != null) {
                                                                            kotlin.jvm.internal.i.f(it5, "it");
                                                                            mVar7.y(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 6:
                                                                        Integer it6 = (Integer) obj;
                                                                        int i16 = z.D;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.m mVar8 = this$0.f5393x;
                                                                        if (mVar8 != null) {
                                                                            kotlin.jvm.internal.i.f(it6, "it");
                                                                            mVar8.y(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 7:
                                                                        Integer it7 = (Integer) obj;
                                                                        int i17 = z.D;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        if (it7 == null || it7.intValue() != -1) {
                                                                            int i18 = this$0.f5395z;
                                                                            if (it7 == null || it7.intValue() != i18) {
                                                                                kotlin.jvm.internal.i.f(it7, "it");
                                                                                this$0.f5395z = it7.intValue();
                                                                                bm.m mVar9 = this$0.f5393x;
                                                                                if (mVar9 != null) {
                                                                                    mVar9.z(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 8:
                                                                        Integer it8 = (Integer) obj;
                                                                        int i19 = z.D;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        if (it8 == null || it8.intValue() != -1) {
                                                                            int i20 = this$0.A;
                                                                            if (it8 == null || it8.intValue() != i20) {
                                                                                kotlin.jvm.internal.i.f(it8, "it");
                                                                                this$0.A = it8.intValue();
                                                                                bm.m mVar10 = this$0.f5393x;
                                                                                if (mVar10 != null) {
                                                                                    mVar10.z(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    default:
                                                                        Integer it9 = (Integer) obj;
                                                                        int i21 = z.D;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        if (it9 == null || it9.intValue() != -1) {
                                                                            int i22 = this$0.B;
                                                                            if (it9 == null || i22 != it9.intValue()) {
                                                                                kotlin.jvm.internal.i.f(it9, "it");
                                                                                this$0.B = it9.intValue();
                                                                                bm.m mVar11 = this$0.f5393x;
                                                                                if (mVar11 != null) {
                                                                                    mVar11.z(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
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
                                                        q1 q1Var11 = this.f5391v;
                                                        if (q1Var11 != null) {
                                                            q1Var11.C.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.y

                                                                /* renamed from: b  reason: collision with root package name */
                                                                public final /* synthetic */ z f5389b;

                                                                {
                                                                    this.f5389b = this;
                                                                }

                                                                /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
                                                                @Override // androidx.lifecycle.x
                                                                /*
                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                */
                                                                public final void a(Object obj) {
                                                                    Object obj2;
                                                                    boolean z10;
                                                                    boolean z11;
                                                                    int i6 = r2;
                                                                    z this$0 = this.f5389b;
                                                                    switch (i6) {
                                                                        case 0:
                                                                            ArrayList arrayList = (ArrayList) obj;
                                                                            int i10 = z.D;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5394y;
                                                                            arrayList2.clear();
                                                                            arrayList2.addAll(arrayList);
                                                                            hs.f fVar = (hs.f) is.u.i2(arrayList2);
                                                                            if (fVar != null) {
                                                                                obj2 = fVar.f19464u;
                                                                            } else {
                                                                                obj2 = null;
                                                                            }
                                                                            if (kotlin.jvm.internal.i.b(obj2, "C")) {
                                                                                bm.m mVar = this$0.f5393x;
                                                                                if (mVar != null) {
                                                                                    if (mVar.G && mVar.Q != null) {
                                                                                        z11 = true;
                                                                                    } else {
                                                                                        z11 = false;
                                                                                    }
                                                                                    if (z11) {
                                                                                        z10 = true;
                                                                                        if (z10) {
                                                                                            arrayList2.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                z10 = false;
                                                                                if (z10) {
                                                                                }
                                                                            }
                                                                            this$0.J();
                                                                            bm.m mVar2 = this$0.f5393x;
                                                                            if (mVar2 != null) {
                                                                                mVar2.C = arrayList2;
                                                                                mVar2.i();
                                                                            }
                                                                            if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                                                V3GoalsActivity v3GoalsActivity2 = this$0.f5392w;
                                                                                if (v3GoalsActivity2 != null) {
                                                                                    v3GoalsActivity2.y0(true);
                                                                                    return;
                                                                                } else {
                                                                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            V3GoalsActivity v3GoalsActivity3 = this$0.f5392w;
                                                                            if (v3GoalsActivity3 != null) {
                                                                                v3GoalsActivity3.y0(false);
                                                                                return;
                                                                            } else {
                                                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                                throw null;
                                                                            }
                                                                        case 1:
                                                                            Integer it = (Integer) obj;
                                                                            int i11 = z.D;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.m mVar3 = this$0.f5393x;
                                                                            if (mVar3 != null) {
                                                                                kotlin.jvm.internal.i.f(it, "it");
                                                                                mVar3.x(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 2:
                                                                            Integer it2 = (Integer) obj;
                                                                            int i12 = z.D;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.m mVar4 = this$0.f5393x;
                                                                            if (mVar4 != null) {
                                                                                kotlin.jvm.internal.i.f(it2, "it");
                                                                                mVar4.x(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 3:
                                                                            Integer it3 = (Integer) obj;
                                                                            int i13 = z.D;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.m mVar5 = this$0.f5393x;
                                                                            if (mVar5 != null) {
                                                                                kotlin.jvm.internal.i.f(it3, "it");
                                                                                mVar5.x(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 4:
                                                                            Integer it4 = (Integer) obj;
                                                                            int i14 = z.D;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.m mVar6 = this$0.f5393x;
                                                                            if (mVar6 != null) {
                                                                                kotlin.jvm.internal.i.f(it4, "it");
                                                                                mVar6.y(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 5:
                                                                            Integer it5 = (Integer) obj;
                                                                            int i15 = z.D;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.m mVar7 = this$0.f5393x;
                                                                            if (mVar7 != null) {
                                                                                kotlin.jvm.internal.i.f(it5, "it");
                                                                                mVar7.y(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 6:
                                                                            Integer it6 = (Integer) obj;
                                                                            int i16 = z.D;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.m mVar8 = this$0.f5393x;
                                                                            if (mVar8 != null) {
                                                                                kotlin.jvm.internal.i.f(it6, "it");
                                                                                mVar8.y(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 7:
                                                                            Integer it7 = (Integer) obj;
                                                                            int i17 = z.D;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            if (it7 == null || it7.intValue() != -1) {
                                                                                int i18 = this$0.f5395z;
                                                                                if (it7 == null || it7.intValue() != i18) {
                                                                                    kotlin.jvm.internal.i.f(it7, "it");
                                                                                    this$0.f5395z = it7.intValue();
                                                                                    bm.m mVar9 = this$0.f5393x;
                                                                                    if (mVar9 != null) {
                                                                                        mVar9.z(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 8:
                                                                            Integer it8 = (Integer) obj;
                                                                            int i19 = z.D;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            if (it8 == null || it8.intValue() != -1) {
                                                                                int i20 = this$0.A;
                                                                                if (it8 == null || it8.intValue() != i20) {
                                                                                    kotlin.jvm.internal.i.f(it8, "it");
                                                                                    this$0.A = it8.intValue();
                                                                                    bm.m mVar10 = this$0.f5393x;
                                                                                    if (mVar10 != null) {
                                                                                        mVar10.z(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        default:
                                                                            Integer it9 = (Integer) obj;
                                                                            int i21 = z.D;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            if (it9 == null || it9.intValue() != -1) {
                                                                                int i22 = this$0.B;
                                                                                if (it9 == null || i22 != it9.intValue()) {
                                                                                    kotlin.jvm.internal.i.f(it9, "it");
                                                                                    this$0.B = it9.intValue();
                                                                                    bm.m mVar11 = this$0.f5393x;
                                                                                    if (mVar11 != null) {
                                                                                        mVar11.z(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
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
                                                            return;
                                                        } else {
                                                            kotlin.jvm.internal.i.q("goalViewModel");
                                                            throw null;
                                                        }
                                                    }
                                                    kotlin.jvm.internal.i.q("goalViewModel");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.i.q("goalViewModel");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.i.q("goalViewModel");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.i.q("goalViewModel");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("goalViewModel");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("goalViewModel");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("goalViewModel");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("goalViewModel");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("goalViewModel");
                    throw null;
                }
                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                throw null;
            }
            kotlin.jvm.internal.i.q("goalViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5390u, e10);
        }
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

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_v3_goals_custom, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        try {
            q1 q1Var = this.f5391v;
            if (q1Var != null) {
                q1Var.f15518z.k(this);
                q1 q1Var2 = this.f5391v;
                if (q1Var2 != null) {
                    q1Var2.D.k(this);
                    q1 q1Var3 = this.f5391v;
                    if (q1Var3 != null) {
                        q1Var3.E.k(this);
                        q1 q1Var4 = this.f5391v;
                        if (q1Var4 != null) {
                            q1Var4.F.k(this);
                            q1 q1Var5 = this.f5391v;
                            if (q1Var5 != null) {
                                q1Var5.A.k(this);
                                q1 q1Var6 = this.f5391v;
                                if (q1Var6 != null) {
                                    q1Var6.B.k(this);
                                    q1 q1Var7 = this.f5391v;
                                    if (q1Var7 != null) {
                                        q1Var7.C.k(this);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("goalViewModel");
                                        throw null;
                                    }
                                }
                                kotlin.jvm.internal.i.q("goalViewModel");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("goalViewModel");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("goalViewModel");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("goalViewModel");
                    throw null;
                }
                kotlin.jvm.internal.i.q("goalViewModel");
                throw null;
            }
            kotlin.jvm.internal.i.q("goalViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5390u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.C.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: Exception -> 0x0075, TryCatch #0 {Exception -> 0x0075, blocks: (B:3:0x000b, B:5:0x0041, B:11:0x004d, B:12:0x0051, B:15:0x0063, B:18:0x0069, B:19:0x006d, B:20:0x0070, B:21:0x0071, B:22:0x0074), top: B:27:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[Catch: Exception -> 0x0075, TRY_LEAVE, TryCatch #0 {Exception -> 0x0075, blocks: (B:3:0x000b, B:5:0x0041, B:11:0x004d, B:12:0x0051, B:15:0x0063, B:18:0x0069, B:19:0x006d, B:20:0x0070, B:21:0x0071, B:22:0x0074), top: B:27:0x000b }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String currentCourse;
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            this.f5391v = (q1) new o0(this, new ok.c(new dm.e())).a(q1.class);
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity");
            this.f5392w = (V3GoalsActivity) requireActivity;
            currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5390u, e10);
        }
        if (currentCourse != null && currentCourse.length() != 0) {
            z10 = false;
            if (z10) {
                P();
            } else {
                ((RobertoButton) _$_findCachedViewById(R.id.addGoalsButtonMain)).setVisibility(8);
                V3GoalsActivity v3GoalsActivity = this.f5392w;
                if (v3GoalsActivity != null) {
                    if (v3GoalsActivity.F == 1) {
                        if (v3GoalsActivity != null) {
                            v3GoalsActivity.w0(false);
                        } else {
                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                            throw null;
                        }
                    }
                } else {
                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                    throw null;
                }
            }
            ((RobertoButton) _$_findCachedViewById(R.id.addGoalsButtonMain)).setOnClickListener(new ol.k(15, this));
        }
        z10 = true;
        if (z10) {
        }
        ((RobertoButton) _$_findCachedViewById(R.id.addGoalsButtonMain)).setOnClickListener(new ol.k(15, this));
    }
}
