package com.theinnerhour.b2b.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import cm.b;
import cm.g;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import fm.j0;
import is.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: AddCustomGoalsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/theinnerhour/b2b/activity/AddCustomGoalsActivity;", "Lrr/a;", "Landroid/view/View;", "sharedResponse", "Landroid/view/View;", "getSharedResponse", "()Landroid/view/View;", "setSharedResponse", "(Landroid/view/View;)V", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AddCustomGoalsActivity extends rr.a {
    public static final /* synthetic */ int H = 0;
    public g A;
    public final String B;
    public Integer C;
    public boolean D;
    public ArrayList<FirestoreGoal> E;
    public String F;
    public Integer G;

    /* renamed from: w  reason: collision with root package name */
    public y f10296w;

    /* renamed from: x  reason: collision with root package name */
    public int f10297x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<String> f10298y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<Goal> f10299z;

    /* compiled from: AddCustomGoalsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<String, Boolean> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final Boolean invoke(String str) {
            String str2;
            boolean z10;
            String goalName = str;
            i.g(goalName, "goalName");
            ArrayList<Goal> arrayList = AddCustomGoalsActivity.this.f10299z;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                for (Goal goal : arrayList) {
                    String goalName2 = goal.getGoalName();
                    if (goalName2 != null) {
                        str2 = goalName2.toLowerCase();
                        i.f(str2, "this as java.lang.String).toLowerCase()");
                    } else {
                        str2 = null;
                    }
                    String lowerCase = goalName.toLowerCase();
                    i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (i.b(str2, lowerCase)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            return Boolean.valueOf(z10);
        }
    }

    public AddCustomGoalsActivity() {
        new LinkedHashMap();
        this.f10298y = new ArrayList<>();
        this.f10299z = new ArrayList<>();
        this.B = LogHelper.INSTANCE.makeLogTag(AddCustomGoalsActivity.class);
        this.E = new ArrayList<>();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i6 = this.f10297x;
        if (i6 == 0) {
            g gVar = this.A;
            if (gVar != null) {
                if (gVar.f5338w) {
                    gVar.Y(false);
                    return;
                }
            } else {
                i.q("customFragment");
                throw null;
            }
        }
        int i10 = i6 - 1;
        this.f10297x = i10;
        if (i10 < 0) {
            super.onBackPressed();
        } else {
            w0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067 A[SYNTHETIC] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_custom_goals);
        getWindow().setStatusBarColor(g0.a.b(this, R.color.v1_status_bar_dark));
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        this.f10296w = supportFragmentManager;
        this.D = getIntent().getBooleanExtra("isFirestoreGoalsExperiment", false);
        ArrayList<String> arrayList = this.f10298y;
        String[] stringArray = getResources().getStringArray(R.array.customGoalOptionsArray);
        i.f(stringArray, "resources.getStringArray…y.customGoalOptionsArray)");
        arrayList.addAll(ca.a.k(Arrays.copyOf(stringArray, stringArray.length)));
        if (!this.D) {
            List<Goal> userGoals = FirebasePersistence.getInstance().getUserGoals();
            i.f(userGoals, "getInstance().userGoals");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : userGoals) {
                Goal goal = (Goal) obj;
                if (i.b(goal.getCourseId(), "independent") && goal.isVisible()) {
                    String goalId = goal.getGoalId();
                    if (goalId != null) {
                        str = goalId.substring(0, 7);
                        i.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        str = null;
                    }
                    if (i.b(str, "custom_")) {
                        z10 = true;
                        if (!z10) {
                            arrayList2.add(obj);
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                }
            }
            this.f10299z = new ArrayList<>(arrayList2);
            q.U1(arrayList, new a());
            User user = FirebasePersistence.getInstance().getUser();
            if (user.getAppConfig().containsKey("custom_goal_disclaimer")) {
                if (user.getAppConfig().containsKey("custom_goal_disclaimer")) {
                    Object obj2 = user.getAppConfig().get("custom_goal_disclaimer");
                    i.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                }
                w0();
                return;
            }
            v0();
            return;
        }
        fm.a aVar = (fm.a) new o0(this, new c(MyApplication.V.a(), new j0())).a(fm.a.class);
        aVar.p();
        aVar.G.e(this, new dk.a(0, new dk.c(this)));
    }

    @Override // rr.a
    public final void t0() {
        this.f10297x++;
        w0();
    }

    public final void u0(boolean z10) {
        int i6;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (z10) {
                    this.C = Integer.valueOf(getWindow().getDecorView().getSystemUiVisibility());
                    getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
                } else if (this.C != null) {
                    View decorView = getWindow().getDecorView();
                    Integer num = this.C;
                    i.d(num);
                    decorView.setSystemUiVisibility(num.intValue());
                }
                Window window = getWindow();
                if (z10) {
                    i6 = R.color.sea;
                } else {
                    i6 = R.color.title_high_contrast;
                }
                window.setStatusBarColor(g0.a.b(this, i6));
                return;
            }
            getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, "Error in setting custom status bar", e10);
        }
    }

    public final void v0() {
        u0(true);
        this.f10297x = -1;
        y yVar = this.f10296w;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fade_in, R.anim.fade_out, 0, 0);
            k10.f(R.id.root_frame_layout, new b(), null);
            k10.j();
            return;
        }
        i.q("fragmentManager");
        throw null;
    }

    public final void w0() {
        y yVar = this.f10296w;
        if (yVar != null) {
            androidx.fragment.app.a k10 = e.k(yVar, R.anim.fade_in, R.anim.fade_out, 0, 0);
            g gVar = new g();
            this.A = gVar;
            k10.f(R.id.root_frame_layout, gVar, null);
            k10.j();
            u0(false);
            return;
        }
        i.q("fragmentManager");
        throw null;
    }

    public final void setSharedResponse(View view) {
    }
}
