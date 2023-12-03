package ek;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.LearningHubActivity;
import com.theinnerhour.b2b.activity.LearningHubArticleActivity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.ScreenResult22Model;
import com.theinnerhour.b2b.model.ScreenResult23Model;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.model.ScreenResult4Model;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import hr.e4;
import hr.f3;
import hr.f9;
import hr.j2;
import hr.k4;
import hr.m4;
import hr.o2;
import hr.p3;
import hr.p6;
import hr.u1;
import hr.y2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f14250u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f14251v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f14252w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f14253x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f14254y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f14255z;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i6) {
        this.f14250u = i6;
        this.f14251v = obj;
        this.f14252w = obj2;
        this.f14253x = obj3;
        this.f14254y = obj4;
        this.f14255z = obj5;
    }

    private final void a() {
        boolean z10;
        Goal goal = (Goal) this.f14252w;
        kotlin.jvm.internal.u setGoal = (kotlin.jvm.internal.u) this.f14251v;
        f3 this$0 = (f3) this.f14253x;
        String resultKey = (String) this.f14254y;
        kotlin.jvm.internal.x model = (kotlin.jvm.internal.x) this.f14255z;
        int i6 = f3.f18365x;
        kotlin.jvm.internal.i.g(setGoal, "$setGoal");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(resultKey, "$resultKey");
        kotlin.jvm.internal.i.g(model, "$model");
        if (goal != null) {
            try {
                if (setGoal.f23466u) {
                    TemplateActivity templateActivity = this$0.f18367v;
                    if (templateActivity != null) {
                        Intent intent = templateActivity.getIntent();
                        if (intent != null && intent.hasExtra("source")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TemplateActivity templateActivity2 = this$0.f18367v;
                            if (templateActivity2 != null) {
                                if (kotlin.jvm.internal.i.b(templateActivity2.getIntent().getStringExtra("source"), "goals")) {
                                    if (goal.getData().containsKey(resultKey)) {
                                        Object obj = goal.getData().get(resultKey);
                                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model> }");
                                        if (!kotlin.jvm.internal.i.b(UtilFunKt.result4MapToObject(is.u.o2((ArrayList) obj)).getText(), ((ScreenResult4Model) model.f23469u).getText())) {
                                            Object obj2 = goal.getData().get(resultKey);
                                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model> }");
                                            ((ArrayList) obj2).add(model.f23469u);
                                        }
                                    } else {
                                        goal.getData().put(resultKey, new ArrayList());
                                        Object obj3 = goal.getData().get(resultKey);
                                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model> }");
                                        ((ArrayList) obj3).add(model.f23469u);
                                    }
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                        TemplateActivity templateActivity3 = this$0.f18367v;
                        if (templateActivity3 != null) {
                            if (templateActivity3.K) {
                                if (goal.getData().containsKey(resultKey)) {
                                    Object obj4 = goal.getData().get(resultKey);
                                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model> }");
                                    ArrayList arrayList = (ArrayList) obj4;
                                    arrayList.remove(arrayList.size() - 1);
                                    arrayList.add(model.f23469u);
                                    goal.getData().put(resultKey, arrayList);
                                } else {
                                    goal.getData().put(resultKey, new ArrayList());
                                    Object obj5 = goal.getData().get(resultKey);
                                    kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model> }");
                                    ((ArrayList) obj5).add(model.f23469u);
                                }
                            } else {
                                templateActivity3.K = true;
                                if (!goal.getData().containsKey(resultKey)) {
                                    goal.getData().put(resultKey, new ArrayList());
                                }
                                Object obj6 = goal.getData().get(resultKey);
                                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult4Model> }");
                                ((ArrayList) obj6).add(model.f23469u);
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this$0.f18366u, "exception in on click listener", e10);
                return;
            }
        }
        FirebasePersistence.getInstance().updateUserOnFirebase();
        TemplateActivity templateActivity4 = this$0.f18367v;
        if (templateActivity4 != null) {
            if (templateActivity4.getIntent().hasExtra("source")) {
                TemplateActivity templateActivity5 = this$0.f18367v;
                if (templateActivity5 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity5.getIntent().getStringExtra("source"), "goals")) {
                        TemplateActivity templateActivity6 = this$0.f18367v;
                        if (templateActivity6 != null) {
                            templateActivity6.n0();
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            TemplateActivity templateActivity7 = this$0.f18367v;
            if (templateActivity7 != null) {
                templateActivity7.t0();
                return;
            } else {
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0142 A[Catch: Exception -> 0x0153, TryCatch #0 {Exception -> 0x0153, blocks: (B:3:0x0031, B:5:0x0040, B:7:0x0044, B:10:0x004b, B:12:0x0055, B:18:0x00c0, B:13:0x0077, B:14:0x0096, B:16:0x00a2, B:17:0x00ae, B:19:0x00c7, B:20:0x00cf, B:50:0x012d, B:52:0x0142, B:53:0x014f, B:22:0x00d3, B:49:0x0124, B:25:0x00dc, B:28:0x00e5, B:31:0x00ee, B:34:0x00f7, B:37:0x0100, B:40:0x0109, B:43:0x0112, B:46:0x011b), top: B:58:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f A[Catch: Exception -> 0x0153, TRY_LEAVE, TryCatch #0 {Exception -> 0x0153, blocks: (B:3:0x0031, B:5:0x0040, B:7:0x0044, B:10:0x004b, B:12:0x0055, B:18:0x00c0, B:13:0x0077, B:14:0x0096, B:16:0x00a2, B:17:0x00ae, B:19:0x00c7, B:20:0x00cf, B:50:0x012d, B:52:0x0142, B:53:0x014f, B:22:0x00d3, B:49:0x0124, B:25:0x00dc, B:28:0x00e5, B:31:0x00ee, B:34:0x00f7, B:37:0x0100, B:40:0x0109, B:43:0x0112, B:46:0x011b), top: B:58:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        androidx.fragment.app.p activity;
        p3 this$0 = (p3) this.f14252w;
        kotlin.jvm.internal.u setGoal = (kotlin.jvm.internal.u) this.f14251v;
        TemplateActivity act = (TemplateActivity) this.f14253x;
        String resultKey = (String) this.f14254y;
        kotlin.jvm.internal.x model = (kotlin.jvm.internal.x) this.f14255z;
        int i6 = p3.f18950w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(setGoal, "$setGoal");
        kotlin.jvm.internal.i.g(act, "$act");
        kotlin.jvm.internal.i.g(resultKey, "$resultKey");
        kotlin.jvm.internal.i.g(model, "$model");
        try {
            androidx.fragment.app.p activity2 = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Goal y02 = ((TemplateActivity) activity2).y0();
            if (y02 != null && setGoal.f23466u) {
                if (act.K) {
                    if (y02.getData().containsKey(resultKey)) {
                        Object obj = y02.getData().get(resultKey);
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model> }");
                        ArrayList arrayList = (ArrayList) obj;
                        arrayList.remove(arrayList.size() - 1);
                        arrayList.add(model.f23469u);
                        y02.getData().put(resultKey, arrayList);
                    } else {
                        y02.getData().put(resultKey, new ArrayList());
                        Object obj2 = y02.getData().get(resultKey);
                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model> }");
                        ((ArrayList) obj2).add(model.f23469u);
                    }
                } else {
                    act.K = true;
                    if (!y02.getData().containsKey(resultKey)) {
                        y02.getData().put(resultKey, new ArrayList());
                    }
                    Object obj3 = y02.getData().get(resultKey);
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model> }");
                    ((ArrayList) obj3).add(model.f23469u);
                }
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
            String B0 = act.B0();
            switch (B0.hashCode()) {
                case 112151:
                    if (!B0.equals("s37")) {
                        activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity3).n0();
                            return;
                        }
                        act.t0();
                        return;
                    }
                    act.s0(new p6());
                    return;
                case 112180:
                    if (!B0.equals("s45")) {
                        activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
                        }
                    }
                    act.s0(new p6());
                    return;
                case 112211:
                    if (!B0.equals("s55")) {
                        activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
                        }
                    }
                    act.s0(new p6());
                    return;
                case 112212:
                    if (!B0.equals("s56")) {
                        activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
                        }
                    }
                    act.s0(new p6());
                    return;
                case 3474691:
                    if (!B0.equals("s138")) {
                        activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
                        }
                    }
                    act.s0(new p6());
                    return;
                case 3474692:
                    if (!B0.equals("s139")) {
                        activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
                        }
                    }
                    act.s0(new p6());
                    return;
                case 3474714:
                    if (!B0.equals("s140")) {
                        activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
                        }
                    }
                    act.s0(new p6());
                    return;
                case 3474746:
                    if (B0.equals("s151")) {
                        act.s0(new p6());
                        return;
                    }
                    activity = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
                    }
                    break;
                case 3474749:
                    if (!B0.equals("s154")) {
                        activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
                        }
                    }
                    act.s0(new p6());
                    return;
                default:
                    activity = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (!((TemplateActivity) activity).getIntent().hasExtra("source")) {
                    }
                    break;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18951u, "exception", e10);
        }
    }

    private final void c() {
        TemplateActivity act = (TemplateActivity) this.f14252w;
        kotlin.jvm.internal.u setGoal = (kotlin.jvm.internal.u) this.f14251v;
        String resultKey = (String) this.f14253x;
        kotlin.jvm.internal.x model = (kotlin.jvm.internal.x) this.f14254y;
        e4 this$0 = (e4) this.f14255z;
        int i6 = e4.f18334w;
        kotlin.jvm.internal.i.g(act, "$act");
        kotlin.jvm.internal.i.g(setGoal, "$setGoal");
        kotlin.jvm.internal.i.g(resultKey, "$resultKey");
        kotlin.jvm.internal.i.g(model, "$model");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        try {
            Goal y02 = act.y0();
            if (y02 != null && setGoal.f23466u) {
                if (!y02.getData().containsKey(resultKey)) {
                    y02.getData().put(resultKey, new ArrayList());
                }
                Object obj = y02.getData().get(resultKey);
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult9Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult9Model> }");
                ((ArrayList) obj).add(model.f23469u);
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
            act.t0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18335u, "exception", e10);
        }
    }

    private final void d() {
        kotlin.jvm.internal.x selectedOptions = (kotlin.jvm.internal.x) this.f14251v;
        FrameLayout noneOfThese = (FrameLayout) this.f14252w;
        k4 this$0 = (k4) this.f14254y;
        HashMap params = (HashMap) this.f14255z;
        ArrayList list = (ArrayList) this.f14253x;
        int i6 = k4.f18677x;
        kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
        kotlin.jvm.internal.i.g(noneOfThese, "$noneOfThese");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(params, "$params");
        kotlin.jvm.internal.i.g(list, "$list");
        try {
            if (new ArrayList((Collection) selectedOptions.f23469u).isEmpty()) {
                Object tag = noneOfThese.getTag();
                kotlin.jvm.internal.i.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
                if (!((Boolean) tag).booleanValue()) {
                    Utils.INSTANCE.showCustomToast(this$0.getActivity(), UtilFunKt.paramsMapToString(params.get("s108_error")));
                    return;
                }
            }
            TemplateActivity templateActivity = this$0.f18679v;
            if (templateActivity != null) {
                HashMap<String, Object> hashMap = templateActivity.F;
                Object tag2 = noneOfThese.getTag();
                kotlin.jvm.internal.i.e(tag2, "null cannot be cast to non-null type kotlin.Boolean");
                hashMap.put("none_of_those", (Boolean) tag2);
                TemplateActivity templateActivity2 = this$0.f18679v;
                if (templateActivity2 != null) {
                    HashMap<String, Object> hashMap2 = templateActivity2.F;
                    Object tag3 = noneOfThese.getTag();
                    kotlin.jvm.internal.i.e(tag3, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) tag3).booleanValue()) {
                        list = new ArrayList((Collection) selectedOptions.f23469u);
                    }
                    hashMap2.put("selected_list", list);
                    TemplateActivity templateActivity3 = this$0.f18679v;
                    if (templateActivity3 != null) {
                        templateActivity3.F.put("s108_user_list", selectedOptions.f23469u);
                        TemplateActivity templateActivity4 = this$0.f18679v;
                        if (templateActivity4 != null) {
                            templateActivity4.s0(new m4());
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18678u, "Exception", e10);
        }
    }

    private final void e() {
        boolean z10;
        f9 this$0 = (f9) this.f14251v;
        RobertoEditText robertoEditText = (RobertoEditText) this.f14252w;
        String prevText = (String) this.f14253x;
        View row = (View) this.f14254y;
        Dialog dialog = (Dialog) this.f14255z;
        int i6 = f9.C;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(prevText, "$prevText");
        kotlin.jvm.internal.i.g(row, "$row");
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        if (this$0.isAdded()) {
            String valueOf = String.valueOf(robertoEditText.getText());
            String obj = gv.r.i1(valueOf).toString();
            if (obj != null && obj.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && !kotlin.jvm.internal.i.b(valueOf, prevText)) {
                HashSet<String> hashSet = this$0.f18398v;
                hashSet.remove(prevText);
                if (this$0.P().Q) {
                    ScreenResult23Model screenResult23Model = null;
                    for (ScreenResult23Model screenResult23Model2 : this$0.f18401y) {
                        if (kotlin.jvm.internal.i.b(screenResult23Model2.getTask(), prevText)) {
                            screenResult23Model = screenResult23Model2;
                        }
                    }
                    if (screenResult23Model != null) {
                        this$0.f18401y.remove(screenResult23Model);
                    }
                }
                hashSet.add(valueOf);
                ((RobertoTextView) row.findViewById(R.id.tvLabel)).setText(valueOf);
            }
            dialog.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r7v9, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FirestoreGoal firestoreGoal;
        boolean z10;
        int i6 = this.f14250u;
        Object obj = this.f14255z;
        Object obj2 = this.f14254y;
        Object obj3 = this.f14253x;
        Object obj4 = this.f14252w;
        Object obj5 = this.f14251v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.u added = (kotlin.jvm.internal.u) obj5;
                LearningHubModel model = (LearningHubModel) obj4;
                ArrayList<PostsRead> arrayList = (ArrayList) obj3;
                View row = (View) obj2;
                q this$0 = (q) obj;
                kotlin.jvm.internal.i.g(added, "$added");
                kotlin.jvm.internal.i.g(model, "$model");
                kotlin.jvm.internal.i.g(row, "$row");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!added.f23466u) {
                    PostsRead postsRead = new PostsRead();
                    postsRead.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    postsRead.setPostId(model.getId());
                    arrayList.add(postsRead);
                    FirebasePersistence.getInstance().getUser().setPostsRead(arrayList);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    ((RobertoTextView) row.findViewById(R.id.tvNew)).setVisibility(8);
                }
                Context context = this$0.f14263y;
                if ((context instanceof LearningHubActivity) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_LEARNING_HUB, false) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    kotlin.jvm.internal.i.e(context, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.LearningHubActivity");
                    ((LearningHubActivity) context).f10432v = true;
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_LEARNING_HUB, true);
                }
                context.startActivity(new Intent(context, LearningHubArticleActivity.class).putExtra("model", model));
                return;
            case 1:
                kotlin.jvm.internal.u added2 = (kotlin.jvm.internal.u) obj5;
                LearningHubModel model2 = (LearningHubModel) obj4;
                ArrayList<PostsRead> arrayList2 = (ArrayList) obj3;
                View row2 = (View) obj2;
                nd.z this$02 = (nd.z) obj;
                kotlin.jvm.internal.i.g(added2, "$added");
                kotlin.jvm.internal.i.g(model2, "$model");
                kotlin.jvm.internal.i.g(row2, "$row");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (!added2.f23466u) {
                    PostsRead postsRead2 = new PostsRead();
                    postsRead2.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    postsRead2.setPostId(model2.getId());
                    arrayList2.add(postsRead2);
                    FirebasePersistence.getInstance().getUser().setPostsRead(arrayList2);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    ((RobertoTextView) row2.findViewById(R.id.tvNew)).setVisibility(8);
                }
                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_LEARNING_HUB, false) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_LEARNING_HUB, true);
                    this$02.g().f10658g0 = true;
                }
                this$02.g().startActivityForResult(new Intent(this$02.g(), LearningHubActivity.class).putExtra("learningHubList", this$02.g().O).putExtra("model", model2).putExtra("showPage", false).putExtra("source", Constants.SCREEN_DASHBOARD), this$02.g().H);
                return;
            case 2:
                cq.g this$03 = (cq.g) obj5;
                ConstraintLayout linearLayout = (ConstraintLayout) obj4;
                GoalType goal = (GoalType) obj3;
                String courseId = (String) obj2;
                String courseName = (String) obj;
                int i10 = cq.g.E;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(linearLayout, "$linearLayout");
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(courseId, "$courseId");
                kotlin.jvm.internal.i.g(courseName, "$courseName");
                Iterator<FirestoreGoal> it = this$03.C.iterator();
                while (true) {
                    if (it.hasNext()) {
                        FirestoreGoal next = it.next();
                        FirestoreGoal firestoreGoal2 = next;
                        Iterator<FirestoreGoal> it2 = it;
                        if (kotlin.jvm.internal.i.b(firestoreGoal2.getGoalId(), goal.getGoalId()) && firestoreGoal2.isVisible()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            firestoreGoal = next;
                        } else {
                            it = it2;
                        }
                    } else {
                        firestoreGoal = null;
                    }
                }
                FirestoreGoal firestoreGoal3 = firestoreGoal;
                if (firestoreGoal3 != null) {
                    Snackbar.h((CoordinatorLayout) this$03._$_findCachedViewById(R.id.mainContainer), "We have removed this goal.", 0).i();
                    ((RobertoButton) linearLayout.findViewById(R.id.robertoButton)).setText("ADD GOAL");
                    ((RobertoButton) linearLayout.findViewById(R.id.robertoButton)).setTextColor(g0.a.b(this$03.requireContext(), R.color.white));
                    ((RobertoButton) linearLayout.findViewById(R.id.robertoButton)).setBackground(a.c.b(this$03.requireContext(), R.drawable.button_border_white));
                    firestoreGoal3.setVisible(false);
                    firestoreGoal3.setNotificationScheduled(false);
                    fm.a aVar = this$03.A;
                    if (aVar != null) {
                        aVar.g(firestoreGoal3, false);
                        Utils utils = Utils.INSTANCE;
                        Context applicationContext = this$03.requireContext().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext, "requireContext().applicationContext");
                        long time = firestoreGoal3.getStartDate().getTime();
                        long time2 = firestoreGoal3.getScheduledDate().getTime();
                        String type = firestoreGoal3.getType();
                        kotlin.jvm.internal.i.d(type);
                        String goalId = firestoreGoal3.getGoalId();
                        kotlin.jvm.internal.i.d(goalId);
                        String courseName2 = firestoreGoal3.getCourseName();
                        kotlin.jvm.internal.i.d(courseName2);
                        String goalName = firestoreGoal3.getGoalName();
                        kotlin.jvm.internal.i.d(goalName);
                        Utils.updateActivityNotification$default(utils, applicationContext, false, time, time2, type, goalId, courseName2, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                        Bundle bundle = new Bundle();
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                        bundle.putString(Constants.GOAL_NAME, goal.getGoalName());
                        bundle.putString(Constants.GOAL_TYPE, goal.getType());
                        bundle.putString("screen", Constants.SCREEN_GOALS_LIST);
                        bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                        gk.a.b(bundle, "activity_remove_click");
                        return;
                    }
                    kotlin.jvm.internal.i.q("firestoreGoalsViewModel");
                    throw null;
                }
                String goalId2 = goal.getGoalId();
                String goalName2 = goal.getGoalName();
                CustomDate customDate = new CustomDate();
                Utils utils2 = Utils.INSTANCE;
                utils2.getTodayTimeInSeconds();
                hs.k kVar = hs.k.f19476a;
                CustomDate customDate2 = new CustomDate();
                utils2.getTodayTimeInSeconds();
                FirestoreGoal firestoreGoal4 = new FirestoreGoal(courseId, goalId2, courseName, goalName2, null, customDate, null, customDate2, null, false, null, goal.getType(), true, null, 1344, null);
                yn.a aVar2 = this$03.f11914z;
                aVar2.getClass();
                if (yn.a.b()) {
                    this$03.K(null, firestoreGoal4, linearLayout);
                } else {
                    kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                    ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("ra_list", aVar2.a(true), "goals", this$03.f11914z, new cq.f(this$03, firestoreGoal4, linearLayout, xVar));
                    xVar.f23469u = notificationPermissionBottomSheet;
                    notificationPermissionBottomSheet.show(this$03.requireActivity().getSupportFragmentManager(), "permission");
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle2.putString(Constants.GOAL_ID, goal.getGoalId());
                bundle2.putString(Constants.GOAL_NAME, goal.getGoalName());
                bundle2.putString(Constants.GOAL_TYPE, goal.getType());
                bundle2.putString("screen", Constants.SCREEN_GOALS_LIST);
                bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                gk.a.b(bundle2, "activity_remind_click");
                return;
            case 3:
                kotlin.jvm.internal.x goal2 = (kotlin.jvm.internal.x) obj5;
                String id2 = (String) obj4;
                String str = (String) obj3;
                cq.g this$04 = (cq.g) obj;
                View v10 = (View) obj2;
                int i11 = cq.g.E;
                kotlin.jvm.internal.i.g(goal2, "$goal");
                kotlin.jvm.internal.i.g(id2, "$id");
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(v10, "$v");
                T t3 = goal2.f23469u;
                if (t3 != 0 && ((Goal) t3).isVisible()) {
                    Snackbar.h((CoordinatorLayout) this$04._$_findCachedViewById(R.id.mainContainer), "We have removed this goal.", 0).i();
                    ((Goal) goal2.f23469u).setVisible(false);
                    ((Goal) goal2.f23469u).setNotificationScheduled(false);
                    ((RobertoButton) v10.findViewById(R.id.robertoButton)).setText("ADD GOAL");
                    ((RobertoButton) v10.findViewById(R.id.robertoButton)).setTextColor(g0.a.b(this$04.requireContext(), R.color.white));
                    ((RobertoButton) v10.findViewById(R.id.robertoButton)).setBackground(a.c.b(this$04.requireContext(), R.drawable.button_border_white));
                    FirebasePersistence.getInstance().removeGoalById(id2, str);
                    Utils utils3 = Utils.INSTANCE;
                    Context applicationContext2 = this$04.requireContext().getApplicationContext();
                    kotlin.jvm.internal.i.f(applicationContext2, "requireContext().applicationContext");
                    long time3 = ((Goal) goal2.f23469u).getmStartDate().getTime();
                    long time4 = ((Goal) goal2.f23469u).getmScheduleDate().getTime();
                    String type2 = ((Goal) goal2.f23469u).getType();
                    kotlin.jvm.internal.i.d(type2);
                    String goalId3 = ((Goal) goal2.f23469u).getGoalId();
                    kotlin.jvm.internal.i.d(goalId3);
                    String courseName3 = ((Goal) goal2.f23469u).getCourseName();
                    kotlin.jvm.internal.i.d(courseName3);
                    String goalName3 = ((Goal) goal2.f23469u).getGoalName();
                    kotlin.jvm.internal.i.d(goalName3);
                    Utils.updateActivityNotification$default(utils3, applicationContext2, false, time3, time4, type2, goalId3, courseName3, goalName3, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                    Bundle bundle3 = new Bundle();
                    defpackage.e.s(bundle3, "course", Constants.GOAL_ID, id2);
                    Goal goal3 = (Goal) goal2.f23469u;
                    if (goal3 != null) {
                        bundle3.putString(Constants.GOAL_NAME, goal3.getGoalName());
                        bundle3.putString(Constants.GOAL_TYPE, goal3.getType());
                    }
                    bundle3.putString("screen", Constants.SCREEN_GOALS_LIST);
                    bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                    gk.a.b(bundle3, "activity_remove_click");
                    return;
                }
                if (goal2.f23469u == 0) {
                    FirebasePersistence.getInstance().addNewGoal(id2, str, false, false);
                    goal2.f23469u = FirebasePersistence.getInstance().getGoalById(id2, str);
                }
                yn.a aVar3 = this$04.f11914z;
                aVar3.getClass();
                if (yn.a.b()) {
                    this$04.K((Goal) goal2.f23469u, null, v10);
                } else {
                    kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                    ?? notificationPermissionBottomSheet2 = new NotificationPermissionBottomSheet("ra_list", aVar3.a(true), "goals", this$04.f11914z, new cq.h(this$04, goal2, v10, xVar2));
                    xVar2.f23469u = notificationPermissionBottomSheet2;
                    notificationPermissionBottomSheet2.show(this$04.requireActivity().getSupportFragmentManager(), "permission");
                }
                Bundle bundle4 = new Bundle();
                defpackage.e.s(bundle4, "course", Constants.GOAL_ID, id2);
                Goal goal4 = (Goal) goal2.f23469u;
                bundle4.putString(Constants.GOAL_NAME, goal4.getGoalName());
                bundle4.putString(Constants.GOAL_TYPE, goal4.getType());
                bundle4.putString("screen", Constants.SCREEN_GOALS_LIST);
                bundle4.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                gk.a.b(bundle4, "activity_remind_click");
                return;
            case 4:
                kotlin.jvm.internal.x selectedOptions = (kotlin.jvm.internal.x) obj5;
                String tt2 = (String) obj4;
                fq.d1 this$05 = (fq.d1) obj3;
                kotlin.jvm.internal.x checkList = (kotlin.jvm.internal.x) obj2;
                String slug = (String) obj;
                int i12 = fq.d1.f15692w;
                kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(checkList, "$checkList");
                kotlin.jvm.internal.i.g(slug, "$slug");
                if (((HashSet) selectedOptions.f23469u).contains(tt2)) {
                    View childAt = ((LinearLayout) this$05._$_findCachedViewById(R.id.llS8List)).getChildAt(((ArrayList) checkList.f23469u).indexOf(tt2));
                    androidx.fragment.app.p activity = this$05.getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    Object obj6 = g0.a.f16164a;
                    ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) childAt.findViewById(R.id.chkBxSelected), childAt, R.id.tvLabel)).setFont("Lato-Medium.ttf");
                    androidx.fragment.app.p activity2 = this$05.getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    ((RobertoTextView) childAt.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
                    ((HashSet) selectedOptions.f23469u).remove(tt2);
                    return;
                } else if (kotlin.jvm.internal.i.b(slug, "s8-b") && ((HashSet) selectedOptions.f23469u).size() == 2) {
                    Utils utils4 = Utils.INSTANCE;
                    androidx.fragment.app.p activity3 = this$05.getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    String string = this$05.getString(R.string.no_more_selections);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.no_more_selections)");
                    utils4.showCustomToast(activity3, string);
                    return;
                } else {
                    ((HashSet) selectedOptions.f23469u).add(tt2);
                    View childAt2 = ((LinearLayout) this$05._$_findCachedViewById(R.id.llS8List)).getChildAt(((ArrayList) checkList.f23469u).indexOf(tt2));
                    androidx.fragment.app.p activity4 = this$05.getActivity();
                    kotlin.jvm.internal.i.d(activity4);
                    Object obj7 = g0.a.f16164a;
                    ((RobertoTextView) defpackage.e.g(activity4, R.drawable.ic_check_box_orange_24dp, (ImageView) childAt2.findViewById(R.id.chkBxSelected), childAt2, R.id.tvLabel)).setFont("Lato-Bold.ttf");
                    androidx.fragment.app.p activity5 = this$05.getActivity();
                    kotlin.jvm.internal.i.d(activity5);
                    ((RobertoTextView) childAt2.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity5, R.color.title_high_contrast));
                    return;
                }
            case 5:
                Goal goal5 = (Goal) obj5;
                TemplateActivity act = (TemplateActivity) obj4;
                String resultKey = (String) obj3;
                kotlin.jvm.internal.x model3 = (kotlin.jvm.internal.x) obj2;
                hr.q0 this$06 = (hr.q0) obj;
                int i13 = hr.q0.f18990w;
                kotlin.jvm.internal.i.g(act, "$act");
                kotlin.jvm.internal.i.g(resultKey, "$resultKey");
                kotlin.jvm.internal.i.g(model3, "$model");
                kotlin.jvm.internal.i.g(this$06, "this$0");
                if (goal5 != null) {
                    try {
                        if (act.K) {
                            if (goal5.getData().containsKey(resultKey)) {
                                Object obj8 = goal5.getData().get(resultKey);
                                kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult16Model>");
                                ArrayList arrayList3 = (ArrayList) obj8;
                                arrayList3.remove(arrayList3.size() - 1);
                                arrayList3.add(model3.f23469u);
                                goal5.getData().put(resultKey, arrayList3);
                            } else {
                                goal5.getData().put(resultKey, new ArrayList());
                                Object obj9 = goal5.getData().get(resultKey);
                                kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult16Model>");
                                ((ArrayList) obj9).add(model3.f23469u);
                            }
                        } else {
                            act.K = true;
                            if (!goal5.getData().containsKey(resultKey)) {
                                goal5.getData().put(resultKey, new ArrayList());
                            }
                            Object obj10 = goal5.getData().get(resultKey);
                            kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult16Model>");
                            ((ArrayList) obj10).add(model3.f23469u);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this$06.f18991u, "exception", e10);
                        return;
                    }
                }
                if (act.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(act.getIntent().getStringExtra("source"), "goals")) {
                    act.n0();
                    return;
                } else {
                    act.t0();
                    return;
                }
            case 6:
                String slug2 = (String) obj5;
                u1 this$07 = (u1) obj4;
                TemplateActivity act2 = (TemplateActivity) obj3;
                String resultKey2 = (String) obj2;
                ScreenResult22Model model4 = (ScreenResult22Model) obj;
                int i14 = u1.f19230x;
                kotlin.jvm.internal.i.g(slug2, "$slug");
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(act2, "$act");
                kotlin.jvm.internal.i.g(resultKey2, "$resultKey");
                kotlin.jvm.internal.i.g(model4, "$model");
                if (kotlin.jvm.internal.i.b(slug2, "r22-b")) {
                    androidx.fragment.app.p activity6 = this$07.getActivity();
                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y02 = ((TemplateActivity) activity6).y0();
                    if (y02 != null) {
                        if (act2.K) {
                            if (y02.getData().containsKey(resultKey2)) {
                                Object obj11 = y02.getData().get(resultKey2);
                                kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult22Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult22Model> }");
                                ArrayList arrayList4 = (ArrayList) obj11;
                                arrayList4.remove(arrayList4.size() - 1);
                                arrayList4.add(model4);
                                y02.getData().put(resultKey2, arrayList4);
                            } else {
                                y02.getData().put(resultKey2, new ArrayList());
                                Object obj12 = y02.getData().get(resultKey2);
                                kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult22Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult22Model> }");
                                ((ArrayList) obj12).add(model4);
                            }
                        } else {
                            act2.K = true;
                            if (!y02.getData().containsKey(resultKey2)) {
                                y02.getData().put(resultKey2, new ArrayList());
                            }
                            Object obj13 = y02.getData().get(resultKey2);
                            kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult22Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult22Model> }");
                            ((ArrayList) obj13).add(model4);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    androidx.fragment.app.p activity7 = this$07.getActivity();
                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ((rr.a) activity7).t0();
                    return;
                }
                act2.t0();
                return;
            case 7:
                Goal goal6 = (Goal) obj5;
                TemplateActivity act3 = (TemplateActivity) obj4;
                String resultKey3 = (String) obj3;
                ScreenResult28Model model5 = (ScreenResult28Model) obj2;
                j2 this$08 = (j2) obj;
                int i15 = j2.f18612w;
                kotlin.jvm.internal.i.g(act3, "$act");
                kotlin.jvm.internal.i.g(resultKey3, "$resultKey");
                kotlin.jvm.internal.i.g(model5, "$model");
                kotlin.jvm.internal.i.g(this$08, "this$0");
                if (goal6 != null) {
                    try {
                        if (act3.K) {
                            if (goal6.getData().containsKey(resultKey3)) {
                                Object obj14 = goal6.getData().get(resultKey3);
                                kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult28Model>");
                                ArrayList arrayList5 = (ArrayList) obj14;
                                arrayList5.remove(arrayList5.size() - 1);
                                arrayList5.add(model5);
                                goal6.getData().put(resultKey3, arrayList5);
                            } else {
                                goal6.getData().put(resultKey3, new ArrayList());
                                Object obj15 = goal6.getData().get(resultKey3);
                                kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult28Model>");
                                ((ArrayList) obj15).add(model5);
                            }
                        } else {
                            act3.K = true;
                            if (!goal6.getData().containsKey(resultKey3)) {
                                goal6.getData().put(resultKey3, new ArrayList());
                            }
                            Object obj16 = goal6.getData().get(resultKey3);
                            kotlin.jvm.internal.i.e(obj16, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult28Model>");
                            ((ArrayList) obj16).add(model5);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(this$08.f18613u, "exception on click listener", e11);
                        return;
                    }
                }
                androidx.fragment.app.p activity8 = this$08.getActivity();
                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity8).t0();
                return;
            case 8:
                o2 this$09 = (o2) obj4;
                kotlin.jvm.internal.u setGoal = (kotlin.jvm.internal.u) obj5;
                String resultKey4 = (String) obj3;
                kotlin.jvm.internal.x model6 = (kotlin.jvm.internal.x) obj2;
                TemplateActivity act4 = (TemplateActivity) obj;
                int i16 = o2.f18909w;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(setGoal, "$setGoal");
                kotlin.jvm.internal.i.g(resultKey4, "$resultKey");
                kotlin.jvm.internal.i.g(model6, "$model");
                kotlin.jvm.internal.i.g(act4, "$act");
                try {
                    androidx.fragment.app.p activity9 = this$09.getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y03 = ((TemplateActivity) activity9).y0();
                    if (y03 != null && setGoal.f23466u) {
                        y03.getData().put(resultKey4, model6.f23469u);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    if (act4.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(act4.getIntent().getStringExtra("source"), "goals")) {
                        act4.n0();
                        return;
                    } else {
                        act4.t0();
                        return;
                    }
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$09.f18910u, "exception on click listener", e12);
                    return;
                }
            case 9:
                y2 this$010 = (y2) obj4;
                kotlin.jvm.internal.u setGoal2 = (kotlin.jvm.internal.u) obj5;
                TemplateActivity act5 = (TemplateActivity) obj3;
                String resultKey5 = (String) obj2;
                kotlin.jvm.internal.x model7 = (kotlin.jvm.internal.x) obj;
                int i17 = y2.f19408w;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(setGoal2, "$setGoal");
                kotlin.jvm.internal.i.g(act5, "$act");
                kotlin.jvm.internal.i.g(resultKey5, "$resultKey");
                kotlin.jvm.internal.i.g(model7, "$model");
                try {
                    androidx.fragment.app.p activity10 = this$010.getActivity();
                    kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y04 = ((TemplateActivity) activity10).y0();
                    if (y04 != null && setGoal2.f23466u) {
                        if (kotlin.jvm.internal.i.b(act5.B0(), "r3")) {
                            act5.K = true;
                            if (!y04.getData().containsKey(resultKey5)) {
                                y04.getData().put(resultKey5, new ArrayList());
                            }
                            Object obj17 = y04.getData().get(resultKey5);
                            kotlin.jvm.internal.i.e(obj17, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult3Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult3Model> }");
                            ((ArrayList) obj17).add(model7.f23469u);
                        } else if (act5.K) {
                            if (y04.getData().containsKey(resultKey5)) {
                                Object obj18 = y04.getData().get(resultKey5);
                                kotlin.jvm.internal.i.e(obj18, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult3Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult3Model> }");
                                ArrayList arrayList6 = (ArrayList) obj18;
                                arrayList6.remove(arrayList6.size() - 1);
                                arrayList6.add(model7.f23469u);
                                y04.getData().put(resultKey5, arrayList6);
                            } else {
                                y04.getData().put(resultKey5, new ArrayList());
                                Object obj19 = y04.getData().get(resultKey5);
                                kotlin.jvm.internal.i.e(obj19, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult3Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult3Model> }");
                                ((ArrayList) obj19).add(model7.f23469u);
                            }
                        } else {
                            act5.K = true;
                            if (!y04.getData().containsKey(resultKey5)) {
                                y04.getData().put(resultKey5, new ArrayList());
                            }
                            Object obj20 = y04.getData().get(resultKey5);
                            kotlin.jvm.internal.i.e(obj20, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult3Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult3Model> }");
                            ((ArrayList) obj20).add(model7.f23469u);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    androidx.fragment.app.p activity11 = this$010.getActivity();
                    kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (((TemplateActivity) activity11).getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(act5.getIntent().getStringExtra("source"), "goals")) {
                        androidx.fragment.app.p activity12 = this$010.getActivity();
                        kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity12).n0();
                        return;
                    }
                    act5.t0();
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$010.f19409u, e13);
                    return;
                }
            case 10:
                a();
                return;
            case 11:
                b();
                return;
            case 12:
                c();
                return;
            case 13:
                d();
                return;
            case 14:
                kotlin.jvm.internal.x finalOptions = (kotlin.jvm.internal.x) obj5;
                String desc = (String) obj4;
                View view2 = (View) obj2;
                m4 this$011 = (m4) obj3;
                HashMap params = (HashMap) obj;
                int i18 = m4.f18820z;
                kotlin.jvm.internal.i.g(finalOptions, "$finalOptions");
                kotlin.jvm.internal.i.g(desc, "$desc");
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(params, "$params");
                if (((HashSet) finalOptions.f23469u).contains(desc)) {
                    ((HashSet) finalOptions.f23469u).remove(desc);
                    ((AppCompatImageView) view2.findViewById(R.id.imageView_left)).setImageResource(R.drawable.ic_check_box_outline_blank_gray_24dp);
                    return;
                } else if (((HashSet) finalOptions.f23469u).size() >= 2) {
                    Utils.INSTANCE.showCustomToast(this$011.requireActivity(), UtilFunKt.paramsMapToString(params.get("s109_error_2")));
                    return;
                } else {
                    ((HashSet) finalOptions.f23469u).add(desc);
                    ((AppCompatImageView) view2.findViewById(R.id.imageView_left)).setImageResource(R.drawable.ic_check_box_orange_24dp);
                    return;
                }
            default:
                e();
                return;
        }
    }

    public /* synthetic */ p(Object obj, kotlin.jvm.internal.u uVar, Object obj2, Serializable serializable, Object obj3, int i6) {
        this.f14250u = i6;
        this.f14252w = obj;
        this.f14251v = uVar;
        this.f14253x = obj2;
        this.f14254y = serializable;
        this.f14255z = obj3;
    }

    public /* synthetic */ p(kotlin.jvm.internal.x xVar, FrameLayout frameLayout, k4 k4Var, HashMap hashMap, ArrayList arrayList) {
        this.f14250u = 13;
        this.f14251v = xVar;
        this.f14252w = frameLayout;
        this.f14254y = k4Var;
        this.f14255z = hashMap;
        this.f14253x = arrayList;
    }

    public /* synthetic */ p(kotlin.jvm.internal.x xVar, String str, View view, m4 m4Var, HashMap hashMap) {
        this.f14250u = 14;
        this.f14251v = xVar;
        this.f14252w = str;
        this.f14254y = view;
        this.f14253x = m4Var;
        this.f14255z = hashMap;
    }

    public /* synthetic */ p(kotlin.jvm.internal.x xVar, String str, String str2, cq.g gVar, ConstraintLayout constraintLayout) {
        this.f14250u = 3;
        this.f14251v = xVar;
        this.f14252w = str;
        this.f14253x = str2;
        this.f14255z = gVar;
        this.f14254y = constraintLayout;
    }
}
