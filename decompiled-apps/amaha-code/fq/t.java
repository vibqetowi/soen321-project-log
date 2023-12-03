package fq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticResult6Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/t;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class t extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f15798x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f15801w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15799u = LogHelper.INSTANCE.makeLogTag(t.class);

    /* renamed from: v  reason: collision with root package name */
    public String f15800v = "";

    public final Goal J(String str) {
        for (Goal goal : FirebasePersistence.getInstance().getUserGoals()) {
            if (kotlin.jvm.internal.i.b(goal.getGoalId(), str)) {
                return goal;
            }
        }
        return null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15801w;
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
        return inflater.inflate(R.layout.fragment_screen_result_6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15801w.clear();
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v71, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, com.theinnerhour.b2b.model.ScreenResult6Model] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u uVar;
        kotlin.jvm.internal.x xVar;
        T8Activity t8Activity;
        String str;
        String str2;
        Course course;
        CharSequence charSequence;
        CharSequence charSequence2;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            String string = arguments.getString(Constants.API_COURSE_LINK);
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.d(arguments2);
            arguments2.getInt(Constants.DAYMODEL_POSITION);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
            T8Activity t8Activity2 = (T8Activity) activity;
            kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
            kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
            xVar2.f23469u = new ScreenResult6Model(Utils.INSTANCE.getTimeInSeconds());
            kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
            xVar3.f23469u = new ArrayList();
            ArrayList arrayList = new ArrayList();
            uVar2.f23466u = true;
            boolean b10 = kotlin.jvm.internal.i.b(t8Activity2.B.get("log"), Boolean.TRUE);
            HashMap<String, Object> hashMap = t8Activity2.B;
            if (b10) {
                Object obj = hashMap.get("ans");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                xVar3.f23469u = (ArrayList) obj;
                Object obj2 = hashMap.get("heading");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText((String) obj2);
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setVisibility(8);
                hashMap.put("log", Boolean.FALSE);
                str = "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity";
                xVar = xVar2;
                str2 = string;
                uVar = uVar2;
                t8Activity = t8Activity2;
            } else {
                uVar = uVar2;
                xVar = xVar2;
                t8Activity = t8Activity2;
                str = "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity";
                if (kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8A) && kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS)) {
                    arrayList.clear();
                    Object obj3 = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    xVar3.f23469u = (ArrayList) obj3;
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("Take a look at what you have noted");
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("EDIT");
                    ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("NEXT");
                    arrayList.add("Your feelings");
                    arrayList.add("The problem");
                    arrayList.add("Your request");
                    this.f15800v = "result_abc_of_assertiveness_stress";
                    String string2 = getString(R.string.logTitleAssertivenessFormula);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.logTitleAssertivenessFormula)");
                    hashMap.put("logTitle", string2);
                    str2 = string;
                } else if (kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8B) && kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS)) {
                    arrayList.clear();
                    Object obj4 = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    xVar3.f23469u = (ArrayList) obj4;
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("Take a look at what you have written");
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("EDIT");
                    ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("NEXT");
                    arrayList.add("The situation");
                    arrayList.add("Your feelings");
                    arrayList.add("Your thoughts");
                    arrayList.add("What you would say to a friend");
                    this.f15800v = "result_double_standard_dispute_stress";
                    String string3 = getString(R.string.logTitleDoubleStandardDispute);
                    kotlin.jvm.internal.i.f(string3, "getString(R.string.logTitleDoubleStandardDispute)");
                    hashMap.put("logTitle", string3);
                    str2 = string;
                } else {
                    str2 = string;
                    if (kotlin.jvm.internal.i.b(str2, Constants.SCREEN_T8B)) {
                        course = courseById;
                        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION)) {
                            arrayList.clear();
                            Object obj5 = hashMap.get("list");
                            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                            xVar3.f23469u = (ArrayList) obj5;
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("Take a look at what you have written");
                            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("EDIT");
                            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("NEXT");
                            arrayList.add("The situation");
                            arrayList.add("Your feelings");
                            arrayList.add("Your thoughts");
                            arrayList.add("What you would say to a friend");
                            this.f15800v = "result_double_standard_dispute_depression";
                            String string4 = getString(R.string.logTitleDoubleStandardDispute);
                            kotlin.jvm.internal.i.f(string4, "getString(R.string.logTitleDoubleStandardDispute)");
                            hashMap.put("logTitle", string4);
                        }
                    } else {
                        course = courseById;
                    }
                    if (kotlin.jvm.internal.i.b(str2, Constants.SCREEN_T8C) && kotlin.jvm.internal.i.b(course.getCourseName(), Constants.COURSE_ANGER)) {
                        arrayList.clear();
                        Object obj6 = hashMap.get("list");
                        kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        xVar3.f23469u = (ArrayList) obj6;
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("Take a look at what you have noted");
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("EDIT");
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("NEXT");
                        arrayList.add("The situation");
                        arrayList.add("Your feelings");
                        arrayList.add("Your thoughts");
                        arrayList.add("The involved person's perspective");
                        arrayList.add("A neutral observer's perspective");
                        arrayList.add("The most helpful step right now");
                        this.f15800v = "result_helicopter_view_anger";
                        String string5 = getString(R.string.logTitleHelicopterPerspective);
                        kotlin.jvm.internal.i.f(string5, "getString(R.string.logTitleHelicopterPerspective)");
                        hashMap.put("logTitle", string5);
                    } else if (kotlin.jvm.internal.i.b(str2, Constants.SCREEN_T8I) && kotlin.jvm.internal.i.b(course.getCourseName(), Constants.COURSE_STRESS)) {
                        arrayList.clear();
                        Object obj7 = hashMap.get("list");
                        kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        xVar3.f23469u = (ArrayList) obj7;
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("Take a look at what you have written");
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("EDIT");
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("NEXT");
                        arrayList.add("The problem");
                        arrayList.add("Possible solutions");
                        arrayList.add("The pros and cons");
                        arrayList.add("Your final option");
                        arrayList.add("The action plan");
                        this.f15800v = "result_stages_of_problem_solving_stress";
                        String string6 = getString(R.string.logTitleProblemSolvingFormula);
                        kotlin.jvm.internal.i.f(string6, "getString(R.string.logTitleProblemSolvingFormula)");
                        hashMap.put("logTitle", string6);
                    }
                }
            }
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, str);
            ((T8Activity) activity2).B.put("questions", arrayList);
            int size = ((ArrayList) xVar3.f23469u).size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.d(activity3);
                View inflate = activity3.getLayoutInflater().inflate(R.layout.row_result_6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.rowQuestion);
                if (i6 < arrayList.size()) {
                    charSequence = (CharSequence) arrayList.get(i6);
                } else {
                    charSequence = "";
                }
                robertoTextView.setText(charSequence);
                RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.rowAnswer);
                if (i6 < ((ArrayList) xVar3.f23469u).size()) {
                    charSequence2 = (CharSequence) ((ArrayList) xVar3.f23469u).get(i6);
                } else {
                    charSequence2 = "";
                }
                robertoTextView2.setText(charSequence2);
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.q

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ t f15782v;

                {
                    this.f15782v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    t this$0 = this.f15782v;
                    switch (i10) {
                        case 0:
                            int i11 = t.f15798x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new s(this$0, 0);
                            a1Var.b();
                            return;
                        default:
                            int i12 = t.f15798x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            if (activity4 != null) {
                                activity4.onBackPressed();
                                return;
                            }
                            return;
                    }
                }
            });
            T8Activity t8Activity3 = t8Activity;
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new r(t8Activity3, 0));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new wm.a(this, xVar, xVar3, str2, uVar, t8Activity3));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.q

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ t f15782v;

                {
                    this.f15782v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    t this$0 = this.f15782v;
                    switch (i10) {
                        case 0:
                            int i11 = t.f15798x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new s(this$0, 0);
                            a1Var.b();
                            return;
                        default:
                            int i12 = t.f15798x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            if (activity4 != null) {
                                activity4.onBackPressed();
                                return;
                            }
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15799u, "Exception", e10);
        }
    }
}
