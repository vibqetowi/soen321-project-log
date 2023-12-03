package com.theinnerhour.b2b.components.pro.goal.activity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.goal.activity.ProGoalsActivity;
import com.theinnerhour.b2b.components.pro.goal.model.SimpleGoalModel;
import com.theinnerhour.b2b.libPackage.circularProgressBar.ArcProgressBar;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.s;
import is.u;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import po.a;
import ss.l;
import ss.p;
/* compiled from: ProGoalsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/goal/activity/ProGoalsActivity;", "Lrr/a;", "Lpo/a$d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProGoalsActivity extends rr.a implements a.d {
    public static final /* synthetic */ int F = 0;
    public hs.f<Integer, Integer> B;
    public long C;

    /* renamed from: w  reason: collision with root package name */
    public po.b f11543w;

    /* renamed from: y  reason: collision with root package name */
    public qo.b f11545y;

    /* renamed from: z  reason: collision with root package name */
    public po.a f11546z;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: x  reason: collision with root package name */
    public Date f11544x = Utils.INSTANCE.getTodayCalendar().getTime();
    public ArrayList<SimpleGoalModel> A = new ArrayList<>();
    public final a D = new a();

    /* compiled from: ProGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            RecyclerView.m mVar;
            i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                ProGoalsActivity proGoalsActivity = ProGoalsActivity.this;
                if (proGoalsActivity.f11543w != null) {
                    RecyclerView recyclerView2 = (RecyclerView) proGoalsActivity.u0(R.id.rvGoalsListCalendar);
                    if (recyclerView2 != null) {
                        mVar = recyclerView2.getLayoutManager();
                    } else {
                        mVar = null;
                    }
                    i.e(mVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int findFirstVisibleItemPosition = ((LinearLayoutManager) mVar).findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition != -1) {
                        po.b bVar = proGoalsActivity.f11543w;
                        if (bVar != null) {
                            if (findFirstVisibleItemPosition == bVar.F - 1) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(bVar.C.getTimeInMillis());
                                calendar.set(11, 0);
                                calendar.set(12, 0);
                                calendar.set(13, 0);
                                calendar.set(14, 0);
                                calendar.add(5, findFirstVisibleItemPosition * 7);
                                Iterator<Calendar> it = bVar.B.getWeekOf(calendar.getTimeInMillis()).iterator();
                                int i10 = -1;
                                while (it.hasNext()) {
                                    if (bVar.D.compareTo(it.next()) > 0) {
                                        i10++;
                                    }
                                }
                                if (i10 != -1) {
                                    bVar.E = i10;
                                }
                                int i11 = bVar.F;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    bVar.j(i12);
                                }
                            }
                            bVar.v(findFirstVisibleItemPosition, null);
                            return;
                        }
                        i.q("goalsCalendarAdapter");
                        throw null;
                    }
                }
            }
        }
    }

    /* compiled from: ProGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements p<Date, Integer, hs.k> {
        public b() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Date date, Integer num) {
            ColorStateList valueOf;
            ColorStateList valueOf2;
            qo.b bVar;
            Date date2 = date;
            num.intValue();
            i.g(date2, "date");
            int i6 = ProGoalsActivity.F;
            ProGoalsActivity proGoalsActivity = ProGoalsActivity.this;
            proGoalsActivity.getClass();
            try {
                proGoalsActivity.f11544x = date2;
                if ((!proGoalsActivity.A.isEmpty()) && (bVar = proGoalsActivity.f11545y) != null) {
                    ArrayList<SimpleGoalModel> arrayList = proGoalsActivity.A;
                    Date displayDate = proGoalsActivity.f11544x;
                    i.f(displayDate, "displayDate");
                    bVar.f(arrayList, displayDate);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) proGoalsActivity.u0(R.id.nextDateCta);
                if (appCompatImageView != null) {
                    if (date2.getTime() == Utils.INSTANCE.getTodayCalendar().getTimeInMillis()) {
                        valueOf = ColorStateList.valueOf(g0.a.b(proGoalsActivity, R.color.grey_3));
                    } else {
                        valueOf = ColorStateList.valueOf(g0.a.b(proGoalsActivity, R.color.campaignLightBlue));
                    }
                    appCompatImageView.setImageTintList(valueOf);
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) proGoalsActivity.u0(R.id.prevDateCta);
                if (appCompatImageView2 != null) {
                    if (date2.getTime() == proGoalsActivity.C) {
                        valueOf2 = ColorStateList.valueOf(g0.a.b(proGoalsActivity, R.color.grey_3));
                    } else {
                        valueOf2 = ColorStateList.valueOf(g0.a.b(proGoalsActivity, R.color.campaignLightBlue));
                    }
                    appCompatImageView2.setImageTintList(valueOf2);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<Integer, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Integer num) {
            int intValue = num.intValue();
            RecyclerView recyclerView = (RecyclerView) ProGoalsActivity.this.u0(R.id.rvGoalsListCalendar);
            if (recyclerView != null) {
                recyclerView.l0(intValue);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements l<ArrayList<hs.f<? extends String, ?>>, hs.k> {
        public d() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(ArrayList<hs.f<? extends String, ?>> arrayList) {
            Locale locale;
            String str;
            RobertoTextView robertoTextView;
            String[] strArr;
            hs.f fVar;
            String str2;
            ArrayList<hs.f<? extends String, ?>> arrayList2 = arrayList;
            boolean isEmpty = arrayList2.isEmpty();
            int i6 = ProGoalsActivity.F;
            ProGoalsActivity proGoalsActivity = ProGoalsActivity.this;
            proGoalsActivity.w0(isEmpty);
            po.a aVar = proGoalsActivity.f11546z;
            if (aVar == null) {
                proGoalsActivity.f11546z = new po.a(arrayList2, proGoalsActivity, proGoalsActivity);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(proGoalsActivity, 1, false);
                RecyclerView recyclerView = (RecyclerView) proGoalsActivity.u0(R.id.goalRecyclerView);
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(linearLayoutManager);
                }
                RecyclerView recyclerView2 = (RecyclerView) proGoalsActivity.u0(R.id.goalRecyclerView);
                if (recyclerView2 != null) {
                    recyclerView2.setHasFixedSize(false);
                }
                RecyclerView recyclerView3 = (RecyclerView) proGoalsActivity.u0(R.id.goalRecyclerView);
                if (recyclerView3 != null) {
                    recyclerView3.setItemAnimator(new androidx.recyclerview.widget.c());
                }
                RecyclerView recyclerView4 = (RecyclerView) proGoalsActivity.u0(R.id.goalRecyclerView);
                if (recyclerView4 != null) {
                    recyclerView4.setAdapter(proGoalsActivity.f11546z);
                }
            } else {
                aVar.f28724x = arrayList2;
                aVar.i();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(proGoalsActivity.f11544x);
            String dateText = new SimpleDateFormat("dd", Locale.ENGLISH).format(Long.valueOf(calendar.getTimeInMillis()));
            i.f(dateText, "dateText");
            if (s.j1(dateText) == '0') {
                dateText = dateText.substring(1);
                i.f(dateText, "this as java.lang.String).substring(startIndex)");
            }
            if (!is.k.Q1(Integer.valueOf(calendar.get(5)), new Integer[]{11, 12, 13})) {
                int i10 = calendar.get(5) % 10;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            str = "rd";
                        }
                    } else {
                        str = "nd";
                    }
                } else {
                    str = "st";
                }
                String str3 = dateText + str + ' ' + new SimpleDateFormat("MMMM", locale).format(Long.valueOf(calendar.getTimeInMillis()));
                robertoTextView = (RobertoTextView) proGoalsActivity.u0(R.id.progressDateText);
                if (robertoTextView != null) {
                    if (i.b(proGoalsActivity.f11544x, Utils.INSTANCE.getTodayCalendar().getTime())) {
                        str3 = proGoalsActivity.getString(R.string.proGoalsTodayDate, str3);
                    }
                    robertoTextView.setText(str3);
                }
                strArr = new String[]{"enabled_divider", "disabled_divider"};
                fVar = (hs.f) u.j2(0, arrayList2);
                String str4 = null;
                if (fVar == null) {
                    str2 = (String) fVar.f19464u;
                } else {
                    str2 = null;
                }
                if (!is.k.Q1(str2, strArr)) {
                    B b10 = arrayList2.get(0).f19465v;
                    i.e(b10, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    A a10 = ((hs.f) b10).f19464u;
                    i.e(a10, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) a10).intValue();
                    B b11 = arrayList2.get(0).f19465v;
                    i.e(b11, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b12 = ((hs.f) b11).f19465v;
                    i.e(b12, "null cannot be cast to non-null type kotlin.Int");
                    int intValue2 = ((Integer) b12).intValue();
                    ArcProgressBar arcProgressBar = (ArcProgressBar) proGoalsActivity.u0(R.id.arcProgressBar);
                    if (arcProgressBar != null) {
                        arcProgressBar.c((intValue * 100) / intValue2, 750);
                    }
                    ProGoalsActivity.v0(proGoalsActivity, false);
                } else {
                    hs.f fVar2 = (hs.f) u.j2(0, arrayList2);
                    if (fVar2 != null) {
                        str4 = (String) fVar2.f19464u;
                    }
                    if (i.b(str4, "gap_day_divider")) {
                        ArcProgressBar arcProgressBar2 = (ArcProgressBar) proGoalsActivity.u0(R.id.arcProgressBar);
                        if (arcProgressBar2 != null) {
                            arcProgressBar2.c(0.0f, 750);
                        }
                        ProGoalsActivity.v0(proGoalsActivity, true);
                    }
                }
                return hs.k.f19476a;
            }
            str = "th";
            String str32 = dateText + str + ' ' + new SimpleDateFormat("MMMM", locale).format(Long.valueOf(calendar.getTimeInMillis()));
            robertoTextView = (RobertoTextView) proGoalsActivity.u0(R.id.progressDateText);
            if (robertoTextView != null) {
            }
            strArr = new String[]{"enabled_divider", "disabled_divider"};
            fVar = (hs.f) u.j2(0, arrayList2);
            String str42 = null;
            if (fVar == null) {
            }
            if (!is.k.Q1(str2, strArr)) {
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements l<Boolean, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            i.f(it, "it");
            if (it.booleanValue() && ApplicationPersistence.getInstance().getBooleanValue("pro_goal_alert_2", true)) {
                com.google.android.material.bottomsheet.e eVar = new com.google.android.material.bottomsheet.e(ProGoalsActivity.this, R.style.TransparentBottomSheetDialog);
                eVar.setContentView(R.layout.goals_pro_alert_bottom_sheet);
                RobertoButton robertoButton = (RobertoButton) eVar.findViewById(R.id.proGoalsBottomSheetCTA);
                if (robertoButton != null) {
                    robertoButton.setOnClickListener(new oo.b(eVar, 0));
                }
                eVar.setCancelable(false);
                eVar.setCanceledOnTouchOutside(false);
                eVar.show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements l<hs.f<? extends Integer, ? extends Integer>, hs.k> {
        public f() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Integer, ? extends Integer> fVar) {
            ProGoalsActivity.this.B = fVar;
            return hs.k.f19476a;
        }
    }

    public static final void v0(ProGoalsActivity proGoalsActivity, boolean z10) {
        int i6;
        proGoalsActivity.getClass();
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) proGoalsActivity.u0(R.id.gapDayNullImage);
            int i10 = 8;
            if (appCompatImageView != null) {
                if (z10) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                appCompatImageView.setVisibility(i6);
            }
            RobertoTextView robertoTextView = (RobertoTextView) proGoalsActivity.u0(R.id.gapDayNullText);
            if (robertoTextView != null) {
                if (z10) {
                    i10 = 0;
                }
                robertoTextView.setVisibility(i10);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
        }
    }

    @Override // po.a.d
    public final void N(Goal goal) {
        int i6;
        GoalDateObj next;
        i.g(goal, "goal");
        try {
            ArrayList<GoalDateObj> trackList = goal.getTrackList();
            Iterator<GoalDateObj> it = trackList.iterator();
            do {
                i6 = 2;
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    Date date = this.f11544x;
                    i.f(date, "this.displayDate");
                    trackList.add(new GoalDateObj(date, 2));
                    FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
                    qo.b bVar = this.f11545y;
                    if (bVar != null) {
                        ArrayList<SimpleGoalModel> arrayList = this.A;
                        Date displayDate = this.f11544x;
                        i.f(displayDate, "displayDate");
                        bVar.f(arrayList, displayDate);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                    bundle.putString(Constants.GOAL_NAME, goal.getGoalName());
                    bundle.putString("type", goal.getType());
                    bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                    gk.a.b(bundle, "pro_goal_track_update");
                    return;
                }
            } while (next.getDate().getTime() * 1000 != this.f11544x.getTime());
            if (next.getVal() != 1) {
                i6 = 1;
            }
            next.setVal(i6);
            FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
            qo.b bVar2 = this.f11545y;
            if (bVar2 != null) {
                ArrayList<SimpleGoalModel> arrayList2 = this.A;
                Date displayDate2 = this.f11544x;
                i.f(displayDate2, "displayDate");
                bVar2.f(arrayList2, displayDate2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
        }
    }

    @Override // po.a.d
    public final void U() {
        try {
            qo.b bVar = this.f11545y;
            if (bVar != null) {
                bVar.e();
            }
            Bundle bundle = new Bundle();
            bundle.putString("location", Constants.SCREEN_GOALS_LIST);
            bundle.putBoolean("goals_present", true);
            gk.a.b(bundle, "pro_goal_alert_click");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
        }
    }

    @Override // rr.a
    public final void n0() {
        try {
            Intent intent = new Intent();
            hs.f<Integer, Integer> fVar = this.B;
            if (fVar != null) {
                intent.putExtra("tracked", fVar.f19464u.intValue());
                intent.putExtra("total", fVar.f19465v.intValue());
                intent.putExtra("values_present", true);
            }
            setResult(-1, intent);
            finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        n0();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setContentView(R.layout.activity_pro_goals);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
            }
            ArrayList arrayList = new ArrayList();
            z0();
            Intent intent = getIntent();
            if (intent != null) {
                serializable = intent.getSerializableExtra("coach_assigned_goals");
            } else {
                serializable = null;
            }
            ArrayList arrayList2 = (ArrayList) serializable;
            if (arrayList2 != null) {
                for (Object obj : arrayList2) {
                    if (obj instanceof SimpleGoalModel) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                w0(true);
                AppCompatImageView appCompatImageView = (AppCompatImageView) u0(R.id.ivCalendar);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
            } else {
                this.A = arrayList;
                qo.b bVar = this.f11545y;
                if (bVar != null) {
                    Date displayDate = this.f11544x;
                    i.f(displayDate, "displayDate");
                    bVar.f(arrayList, displayDate);
                }
                x0();
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) u0(R.id.ivCalendar);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: oo.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ ProGoalsActivity f27692v;

                    {
                        this.f27692v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        po.b bVar2;
                        po.b bVar3;
                        int i6 = r2;
                        int i10 = 8;
                        boolean z10 = true;
                        ProGoalsActivity this$0 = this.f27692v;
                        switch (i6) {
                            case 0:
                                int i11 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                RecyclerView recyclerView = (RecyclerView) this$0.u0(R.id.rvGoalsListCalendar);
                                if (recyclerView != null) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0.u0(R.id.rvGoalsListCalendar);
                                    if ((recyclerView2 == null || recyclerView2.getVisibility() != 8) ? false : false) {
                                        i10 = 0;
                                    }
                                    recyclerView.setVisibility(i10);
                                    return;
                                }
                                return;
                            case 1:
                                int i12 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                if (this$0.f11544x.getTime() != this$0.C && (bVar2 = this$0.f11543w) != null) {
                                    int i13 = bVar2.E;
                                    if (i13 == 0) {
                                        bVar2.E = 6;
                                        bVar2.v(bVar2.G - 1, 0);
                                        bVar2.f28735z.invoke(Integer.valueOf(bVar2.G));
                                    } else {
                                        int i14 = i13 - 1;
                                        bVar2.E = i14;
                                        bVar2.v(bVar2.G, Integer.valueOf(i14 + 1));
                                    }
                                    bVar2.k(0, bVar2.F);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("arrow", "left");
                                    gk.a.b(bundle2, "pro_goal_traverse_arrow");
                                    return;
                                }
                                return;
                            case 2:
                                int i15 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                if (this$0.f11544x.getTime() != Utils.INSTANCE.getTodayCalendar().getTimeInMillis() && (bVar3 = this$0.f11543w) != null) {
                                    int i16 = bVar3.E;
                                    if (i16 == 6) {
                                        bVar3.E = 0;
                                        bVar3.v(bVar3.G + 1, 6);
                                        bVar3.f28735z.invoke(Integer.valueOf(bVar3.G));
                                    } else {
                                        int i17 = i16 + 1;
                                        bVar3.E = i17;
                                        bVar3.v(bVar3.G, Integer.valueOf(i17 - 1));
                                    }
                                    bVar3.k(0, bVar3.F);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("arrow", "right");
                                    gk.a.b(bundle3, "pro_goal_traverse_arrow");
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                ConstraintLayout constraintLayout = (ConstraintLayout) this$0.u0(R.id.alertLayout);
                                if (constraintLayout != null) {
                                    constraintLayout.setVisibility(8);
                                }
                                ApplicationPersistence.getInstance().setBooleanValue("pro_goal_alert_1", false);
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("location", "null_state");
                                bundle4.putBoolean("goals_present", false);
                                gk.a.b(bundle4, "pro_goal_alert_click");
                                return;
                            default:
                                int i19 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                this$0.n0();
                                return;
                        }
                    }
                });
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) u0(R.id.prevDateCta);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: oo.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ ProGoalsActivity f27692v;

                    {
                        this.f27692v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        po.b bVar2;
                        po.b bVar3;
                        int i6 = r2;
                        int i10 = 8;
                        boolean z10 = true;
                        ProGoalsActivity this$0 = this.f27692v;
                        switch (i6) {
                            case 0:
                                int i11 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                RecyclerView recyclerView = (RecyclerView) this$0.u0(R.id.rvGoalsListCalendar);
                                if (recyclerView != null) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0.u0(R.id.rvGoalsListCalendar);
                                    if ((recyclerView2 == null || recyclerView2.getVisibility() != 8) ? false : false) {
                                        i10 = 0;
                                    }
                                    recyclerView.setVisibility(i10);
                                    return;
                                }
                                return;
                            case 1:
                                int i12 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                if (this$0.f11544x.getTime() != this$0.C && (bVar2 = this$0.f11543w) != null) {
                                    int i13 = bVar2.E;
                                    if (i13 == 0) {
                                        bVar2.E = 6;
                                        bVar2.v(bVar2.G - 1, 0);
                                        bVar2.f28735z.invoke(Integer.valueOf(bVar2.G));
                                    } else {
                                        int i14 = i13 - 1;
                                        bVar2.E = i14;
                                        bVar2.v(bVar2.G, Integer.valueOf(i14 + 1));
                                    }
                                    bVar2.k(0, bVar2.F);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("arrow", "left");
                                    gk.a.b(bundle2, "pro_goal_traverse_arrow");
                                    return;
                                }
                                return;
                            case 2:
                                int i15 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                if (this$0.f11544x.getTime() != Utils.INSTANCE.getTodayCalendar().getTimeInMillis() && (bVar3 = this$0.f11543w) != null) {
                                    int i16 = bVar3.E;
                                    if (i16 == 6) {
                                        bVar3.E = 0;
                                        bVar3.v(bVar3.G + 1, 6);
                                        bVar3.f28735z.invoke(Integer.valueOf(bVar3.G));
                                    } else {
                                        int i17 = i16 + 1;
                                        bVar3.E = i17;
                                        bVar3.v(bVar3.G, Integer.valueOf(i17 - 1));
                                    }
                                    bVar3.k(0, bVar3.F);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("arrow", "right");
                                    gk.a.b(bundle3, "pro_goal_traverse_arrow");
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                ConstraintLayout constraintLayout = (ConstraintLayout) this$0.u0(R.id.alertLayout);
                                if (constraintLayout != null) {
                                    constraintLayout.setVisibility(8);
                                }
                                ApplicationPersistence.getInstance().setBooleanValue("pro_goal_alert_1", false);
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("location", "null_state");
                                bundle4.putBoolean("goals_present", false);
                                gk.a.b(bundle4, "pro_goal_alert_click");
                                return;
                            default:
                                int i19 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                this$0.n0();
                                return;
                        }
                    }
                });
            }
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) u0(R.id.nextDateCta);
            if (appCompatImageView4 != null) {
                appCompatImageView4.setOnClickListener(new View.OnClickListener(this) { // from class: oo.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ ProGoalsActivity f27692v;

                    {
                        this.f27692v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        po.b bVar2;
                        po.b bVar3;
                        int i6 = r2;
                        int i10 = 8;
                        boolean z10 = true;
                        ProGoalsActivity this$0 = this.f27692v;
                        switch (i6) {
                            case 0:
                                int i11 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                RecyclerView recyclerView = (RecyclerView) this$0.u0(R.id.rvGoalsListCalendar);
                                if (recyclerView != null) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0.u0(R.id.rvGoalsListCalendar);
                                    if ((recyclerView2 == null || recyclerView2.getVisibility() != 8) ? false : false) {
                                        i10 = 0;
                                    }
                                    recyclerView.setVisibility(i10);
                                    return;
                                }
                                return;
                            case 1:
                                int i12 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                if (this$0.f11544x.getTime() != this$0.C && (bVar2 = this$0.f11543w) != null) {
                                    int i13 = bVar2.E;
                                    if (i13 == 0) {
                                        bVar2.E = 6;
                                        bVar2.v(bVar2.G - 1, 0);
                                        bVar2.f28735z.invoke(Integer.valueOf(bVar2.G));
                                    } else {
                                        int i14 = i13 - 1;
                                        bVar2.E = i14;
                                        bVar2.v(bVar2.G, Integer.valueOf(i14 + 1));
                                    }
                                    bVar2.k(0, bVar2.F);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("arrow", "left");
                                    gk.a.b(bundle2, "pro_goal_traverse_arrow");
                                    return;
                                }
                                return;
                            case 2:
                                int i15 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                if (this$0.f11544x.getTime() != Utils.INSTANCE.getTodayCalendar().getTimeInMillis() && (bVar3 = this$0.f11543w) != null) {
                                    int i16 = bVar3.E;
                                    if (i16 == 6) {
                                        bVar3.E = 0;
                                        bVar3.v(bVar3.G + 1, 6);
                                        bVar3.f28735z.invoke(Integer.valueOf(bVar3.G));
                                    } else {
                                        int i17 = i16 + 1;
                                        bVar3.E = i17;
                                        bVar3.v(bVar3.G, Integer.valueOf(i17 - 1));
                                    }
                                    bVar3.k(0, bVar3.F);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("arrow", "right");
                                    gk.a.b(bundle3, "pro_goal_traverse_arrow");
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                ConstraintLayout constraintLayout = (ConstraintLayout) this$0.u0(R.id.alertLayout);
                                if (constraintLayout != null) {
                                    constraintLayout.setVisibility(8);
                                }
                                ApplicationPersistence.getInstance().setBooleanValue("pro_goal_alert_1", false);
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("location", "null_state");
                                bundle4.putBoolean("goals_present", false);
                                gk.a.b(bundle4, "pro_goal_alert_click");
                                return;
                            default:
                                int i19 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                this$0.n0();
                                return;
                        }
                    }
                });
            }
            RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.rowGoalAlertProCta);
            if (robertoTextView != null) {
                robertoTextView.setOnClickListener(new View.OnClickListener(this) { // from class: oo.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ ProGoalsActivity f27692v;

                    {
                        this.f27692v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        po.b bVar2;
                        po.b bVar3;
                        int i6 = r2;
                        int i10 = 8;
                        boolean z10 = true;
                        ProGoalsActivity this$0 = this.f27692v;
                        switch (i6) {
                            case 0:
                                int i11 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                RecyclerView recyclerView = (RecyclerView) this$0.u0(R.id.rvGoalsListCalendar);
                                if (recyclerView != null) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0.u0(R.id.rvGoalsListCalendar);
                                    if ((recyclerView2 == null || recyclerView2.getVisibility() != 8) ? false : false) {
                                        i10 = 0;
                                    }
                                    recyclerView.setVisibility(i10);
                                    return;
                                }
                                return;
                            case 1:
                                int i12 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                if (this$0.f11544x.getTime() != this$0.C && (bVar2 = this$0.f11543w) != null) {
                                    int i13 = bVar2.E;
                                    if (i13 == 0) {
                                        bVar2.E = 6;
                                        bVar2.v(bVar2.G - 1, 0);
                                        bVar2.f28735z.invoke(Integer.valueOf(bVar2.G));
                                    } else {
                                        int i14 = i13 - 1;
                                        bVar2.E = i14;
                                        bVar2.v(bVar2.G, Integer.valueOf(i14 + 1));
                                    }
                                    bVar2.k(0, bVar2.F);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("arrow", "left");
                                    gk.a.b(bundle2, "pro_goal_traverse_arrow");
                                    return;
                                }
                                return;
                            case 2:
                                int i15 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                if (this$0.f11544x.getTime() != Utils.INSTANCE.getTodayCalendar().getTimeInMillis() && (bVar3 = this$0.f11543w) != null) {
                                    int i16 = bVar3.E;
                                    if (i16 == 6) {
                                        bVar3.E = 0;
                                        bVar3.v(bVar3.G + 1, 6);
                                        bVar3.f28735z.invoke(Integer.valueOf(bVar3.G));
                                    } else {
                                        int i17 = i16 + 1;
                                        bVar3.E = i17;
                                        bVar3.v(bVar3.G, Integer.valueOf(i17 - 1));
                                    }
                                    bVar3.k(0, bVar3.F);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("arrow", "right");
                                    gk.a.b(bundle3, "pro_goal_traverse_arrow");
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                ConstraintLayout constraintLayout = (ConstraintLayout) this$0.u0(R.id.alertLayout);
                                if (constraintLayout != null) {
                                    constraintLayout.setVisibility(8);
                                }
                                ApplicationPersistence.getInstance().setBooleanValue("pro_goal_alert_1", false);
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("location", "null_state");
                                bundle4.putBoolean("goals_present", false);
                                gk.a.b(bundle4, "pro_goal_alert_click");
                                return;
                            default:
                                int i19 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                this$0.n0();
                                return;
                        }
                    }
                });
            }
            AppCompatImageView appCompatImageView5 = (AppCompatImageView) u0(R.id.header_arrow_back);
            if (appCompatImageView5 != null) {
                appCompatImageView5.setOnClickListener(new View.OnClickListener(this) { // from class: oo.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ ProGoalsActivity f27692v;

                    {
                        this.f27692v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        po.b bVar2;
                        po.b bVar3;
                        int i6 = r2;
                        int i10 = 8;
                        boolean z10 = true;
                        ProGoalsActivity this$0 = this.f27692v;
                        switch (i6) {
                            case 0:
                                int i11 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                RecyclerView recyclerView = (RecyclerView) this$0.u0(R.id.rvGoalsListCalendar);
                                if (recyclerView != null) {
                                    RecyclerView recyclerView2 = (RecyclerView) this$0.u0(R.id.rvGoalsListCalendar);
                                    if ((recyclerView2 == null || recyclerView2.getVisibility() != 8) ? false : false) {
                                        i10 = 0;
                                    }
                                    recyclerView.setVisibility(i10);
                                    return;
                                }
                                return;
                            case 1:
                                int i12 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                if (this$0.f11544x.getTime() != this$0.C && (bVar2 = this$0.f11543w) != null) {
                                    int i13 = bVar2.E;
                                    if (i13 == 0) {
                                        bVar2.E = 6;
                                        bVar2.v(bVar2.G - 1, 0);
                                        bVar2.f28735z.invoke(Integer.valueOf(bVar2.G));
                                    } else {
                                        int i14 = i13 - 1;
                                        bVar2.E = i14;
                                        bVar2.v(bVar2.G, Integer.valueOf(i14 + 1));
                                    }
                                    bVar2.k(0, bVar2.F);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("arrow", "left");
                                    gk.a.b(bundle2, "pro_goal_traverse_arrow");
                                    return;
                                }
                                return;
                            case 2:
                                int i15 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                if (this$0.f11544x.getTime() != Utils.INSTANCE.getTodayCalendar().getTimeInMillis() && (bVar3 = this$0.f11543w) != null) {
                                    int i16 = bVar3.E;
                                    if (i16 == 6) {
                                        bVar3.E = 0;
                                        bVar3.v(bVar3.G + 1, 6);
                                        bVar3.f28735z.invoke(Integer.valueOf(bVar3.G));
                                    } else {
                                        int i17 = i16 + 1;
                                        bVar3.E = i17;
                                        bVar3.v(bVar3.G, Integer.valueOf(i17 - 1));
                                    }
                                    bVar3.k(0, bVar3.F);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("arrow", "right");
                                    gk.a.b(bundle3, "pro_goal_traverse_arrow");
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                ConstraintLayout constraintLayout = (ConstraintLayout) this$0.u0(R.id.alertLayout);
                                if (constraintLayout != null) {
                                    constraintLayout.setVisibility(8);
                                }
                                ApplicationPersistence.getInstance().setBooleanValue("pro_goal_alert_1", false);
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("location", "null_state");
                                bundle4.putBoolean("goals_present", false);
                                gk.a.b(bundle4, "pro_goal_alert_click");
                                return;
                            default:
                                int i19 = ProGoalsActivity.F;
                                i.g(this$0, "this$0");
                                this$0.n0();
                                return;
                        }
                    }
                });
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        try {
            RecyclerView recyclerView = (RecyclerView) u0(R.id.rvGoalsListCalendar);
            if (recyclerView != null) {
                recyclerView.c0(this.D);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
        }
        super.onDestroy();
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.E;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void w0(boolean z10) {
        int i6;
        int i10;
        int i11;
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) u0(R.id.ivEmptyState);
            int i12 = 0;
            if (appCompatImageView != null) {
                if (z10) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                appCompatImageView.setVisibility(i6);
            }
            RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.tvEmptyState);
            if (robertoTextView != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                robertoTextView.setVisibility(i10);
            }
            NestedScrollView nestedScrollView = (NestedScrollView) u0(R.id.parentScrollView);
            if (nestedScrollView != null) {
                if (z10) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                nestedScrollView.setVisibility(i11);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) u0(R.id.alertLayout);
            if (constraintLayout != null) {
                if (!z10 || !ApplicationPersistence.getInstance().getBooleanValue("pro_goal_alert_1", true)) {
                    i12 = 8;
                }
                constraintLayout.setVisibility(i12);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
        }
    }

    public final void x0() {
        long timeInMillis;
        try {
            Iterator<SimpleGoalModel> it = this.A.iterator();
            while (it.hasNext()) {
                SimpleGoalModel next = it.next();
                if (next.getStartDate().getTime() != 0) {
                    long time = next.getStartDate().getTime();
                    long j10 = this.C;
                    if (time < j10 || j10 == 0) {
                        this.C = next.getStartDate().getTime();
                    }
                }
            }
            if (this.C == 0) {
                this.C = new GoalHelper().getWeekOf(Calendar.getInstance().getTimeInMillis()).get(0).getTimeInMillis() / 1000;
            }
            RecyclerView recyclerView = (RecyclerView) u0(R.id.rvGoalsListCalendar);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
            }
            RecyclerView recyclerView2 = (RecyclerView) u0(R.id.rvGoalsListCalendar);
            if (recyclerView2 != null) {
                long j11 = this.C;
                if (j11 != 0) {
                    timeInMillis = j11;
                } else {
                    timeInMillis = Calendar.getInstance().getTimeInMillis();
                }
                po.b bVar = new po.b(this, timeInMillis, Integer.valueOf((int) R.color.topicalGoalBlue), new b(), new c());
                this.f11543w = bVar;
                recyclerView2.setAdapter(bVar);
            }
            w wVar = new w();
            RecyclerView recyclerView3 = (RecyclerView) u0(R.id.rvGoalsListCalendar);
            if (recyclerView3 != null) {
                wVar.a(recyclerView3);
                recyclerView3.i(this.D);
            }
            y0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
        }
    }

    public final void y0() {
        try {
            po.b bVar = this.f11543w;
            if (bVar != null && bVar.F > 0) {
                RecyclerView recyclerView = (RecyclerView) u0(R.id.rvGoalsListCalendar);
                if (recyclerView != null) {
                    po.b bVar2 = this.f11543w;
                    if (bVar2 != null) {
                        recyclerView.h0(bVar2.F - 1);
                    } else {
                        i.q("goalsCalendarAdapter");
                        throw null;
                    }
                }
                po.b bVar3 = this.f11543w;
                if (bVar3 != null) {
                    bVar3.v(bVar3.F - 1, null);
                } else {
                    i.q("goalsCalendarAdapter");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
        }
    }

    public final void z0() {
        androidx.lifecycle.w<hs.f<Integer, Integer>> wVar;
        androidx.lifecycle.w<Boolean> wVar2;
        androidx.lifecycle.w<ArrayList<hs.f<String, ?>>> wVar3;
        try {
            qo.b bVar = (qo.b) new o0(this).a(qo.b.class);
            this.f11545y = bVar;
            if (bVar != null && (wVar3 = bVar.f29981x) != null) {
                wVar3.e(this, new ko.b(2, new d()));
            }
            qo.b bVar2 = this.f11545y;
            if (bVar2 != null && (wVar2 = bVar2.f29982y) != null) {
                wVar2.e(this, new ko.b(3, new e()));
            }
            qo.b bVar3 = this.f11545y;
            if (bVar3 != null && (wVar = bVar3.f29983z) != null) {
                wVar.e(this, new ko.b(4, new f()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ProGoalsActivity.kt", e10);
        }
    }
}
