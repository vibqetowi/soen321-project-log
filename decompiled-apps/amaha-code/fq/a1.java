package fq;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T1Activity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS5Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/a1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a1 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f15652z = 0;

    /* renamed from: v  reason: collision with root package name */
    public String f15654v;

    /* renamed from: x  reason: collision with root package name */
    public RelativeLayout f15656x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f15657y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15653u = LogHelper.INSTANCE.makeLogTag(a1.class);

    /* renamed from: w  reason: collision with root package name */
    public final HashSet<String> f15655w = new HashSet<>();

    @Override // rr.b
    public final boolean I() {
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15653u, "exception", e10);
        }
        if (isAdded() && ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).hasFocus()) {
            ((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).clearFocus();
            UiUtils.Companion.showSearch(R.layout.fragment_static_s5, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
            return false;
        }
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
        T1Activity t1Activity = (T1Activity) activity;
        if (t1Activity.B.containsKey(Constants.DAYMODEL_POSITION)) {
            HashMap<String, Object> hashMap = t1Activity.B;
            Object obj = hashMap.get(Constants.DAYMODEL_POSITION);
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue > 0) {
                hashMap.put(Constants.DAYMODEL_POSITION, Integer.valueOf(intValue - 1));
            }
        }
        return true;
    }

    public final void J(String str) {
        try {
            if (((RobertoEditText) _$_findCachedViewById(R.id.etAddNew)).hasFocus()) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
                Context context = getContext();
                kotlin.jvm.internal.i.d(context);
                RobertoEditText etAddNew = (RobertoEditText) _$_findCachedViewById(R.id.etAddNew);
                kotlin.jvm.internal.i.f(etAddNew, "etAddNew");
                ((T1Activity) activity).w0(context, etAddNew);
            }
            HashSet<String> hashSet = this.f15655w;
            if (!hashSet.contains(str)) {
                this.f15654v = str;
                hashSet.add(str);
                K(str);
                I();
                ((ScrollView) _$_findCachedViewById(R.id.scrollview)).postDelayed(new tl.o(19, this), 500L);
                return;
            }
            I();
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            utils.showCustomToast(activity2, "Item Already Exists");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15653u, "exception", e10);
        }
    }

    public final void K(String str) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        View inflate = activity.getLayoutInflater().inflate(R.layout.row_s5, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS5List)), false);
        kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        ((RobertoTextView) relativeLayout.findViewById(R.id.label)).setText(str);
        String str2 = this.f15654v;
        if (str2 != null && kotlin.jvm.internal.i.b(str2, str)) {
            M(relativeLayout);
            ((ScrollView) _$_findCachedViewById(R.id.scrollview)).post(new nn.f(this, 6, relativeLayout));
        }
        relativeLayout.setOnClickListener(new nn.g(11, this, relativeLayout, str));
        ((LinearLayout) _$_findCachedViewById(R.id.llS5List)).addView(relativeLayout);
    }

    public final void M(RelativeLayout relativeLayout) {
        try {
            RelativeLayout relativeLayout2 = this.f15656x;
            if (relativeLayout2 != null) {
                relativeLayout2.setBackgroundColor(0);
                RelativeLayout relativeLayout3 = this.f15656x;
                kotlin.jvm.internal.i.d(relativeLayout3);
                ((TextView) relativeLayout3.findViewById(R.id.tvUnderline)).setVisibility(0);
                RelativeLayout relativeLayout4 = this.f15656x;
                kotlin.jvm.internal.i.d(relativeLayout4);
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                ((RobertoTextView) relativeLayout4.findViewById(R.id.label)).setTextColor(g0.a.b(activity, R.color.colorTextGrey));
            }
            this.f15656x = relativeLayout;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            relativeLayout.setBackgroundColor(g0.a.b(activity2, R.color.orange));
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.d(activity3);
            ((RobertoTextView) relativeLayout.findViewById(R.id.label)).setTextColor(g0.a.b(activity3, R.color.white));
            ((TextView) relativeLayout.findViewById(R.id.tvUnderline)).setVisibility(4);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15653u, "Exception", e10);
        }
    }

    public final void O(ArrayList<String> arrayList) {
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.llS5List)).removeAllViews();
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                String str = arrayList.get(i6);
                kotlin.jvm.internal.i.f(str, "list1[i]");
                K(str);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15653u, "Exception", e10);
        }
    }

    public final void P(ArrayList<String> arrayList) {
        try {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!this.f15655w.contains(next)) {
                    View inflate = getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llSearch)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(next);
                    inflate.setOnClickListener(new nn.g(12, this, next, inflate));
                    ((LinearLayout) _$_findCachedViewById(R.id.llSearch)).addView(inflate);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15653u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15657y;
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
        return inflater.inflate(R.layout.fragment_static_s5, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15657y.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [fq.a1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final a1 a1Var;
        a1 a1Var2 = this;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            int i6 = arguments.getInt(Constants.DAYMODEL_POSITION, 0);
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            String stringExtra = activity.getIntent().getStringExtra(Constants.API_COURSE_LINK);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
            T1Activity t1Activity = (T1Activity) activity2;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a1Var = "Read a book";
            try {
                if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION)) {
                    try {
                        if (kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
                            arrayList.add("Practise deep breathing");
                            arrayList.add("Go for a walk");
                            arrayList.add("Talk to a friend");
                            arrayList.add("Listen to music");
                            arrayList.add("Eat a snack");
                            arrayList.add("Stretch your limbs");
                            arrayList.add("Read a book");
                            arrayList2.add("Spend time with colleagues");
                            arrayList2.add("Take a shower");
                            arrayList2.add("Write in your journal");
                            arrayList2.add("Write a story");
                            arrayList2.add("Read the newspaper");
                            arrayList2.add("Get a massage");
                            arrayList2.add("Observe your surroundings");
                            arrayList2.add("Drink water");
                            arrayList2.add("Read a comic");
                            arrayList2.add("Plan for the weekend");
                            arrayList2.add("Have ice cream");
                            arrayList2.add("Compliment someone");
                            arrayList2.add("Doodle");
                            arrayList2.add("Watch a show");
                            arrayList2.add("Play cards");
                            arrayList2.add("Read up on something new");
                            arrayList2.add("Go for a drive");
                            arrayList2.add("Say thank you to someone");
                            a1Var2 = this;
                            ((RobertoTextView) a1Var2._$_findCachedViewById(R.id.tvS5Header)).setText("Pick 1 activity that you will do when you take a time out");
                            ((RobertoEditText) a1Var2._$_findCachedViewById(R.id.etAddNew)).setHint("Add your own");
                            ((RobertoButton) a1Var2._$_findCachedViewById(R.id.btnS5Button)).setText("Next");
                            a1Var = a1Var2;
                            kotlin.jvm.internal.i.b(t1Activity.C, "s5-b");
                            a1Var.P(arrayList2);
                            a1Var.O(arrayList);
                            ((ImageButton) a1Var._$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new View.OnClickListener(a1Var) { // from class: fq.z0

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ a1 f15840v;

                                {
                                    this.f15840v = a1Var;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    boolean z10;
                                    int i10 = r2;
                                    a1 this$0 = this.f15840v;
                                    switch (i10) {
                                        case 0:
                                            int i11 = a1.f15652z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                                            if (valueOf.length() == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                                return;
                                            }
                                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                                            this$0.J(valueOf);
                                            return;
                                        default:
                                            int i12 = a1.f15652z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity3 = this$0.getActivity();
                                            if (activity3 != null) {
                                                activity3.onBackPressed();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            ((RobertoEditText) a1Var._$_findCachedViewById(R.id.etAddNew)).addTextChangedListener(new a());
                            ((RobertoEditText) a1Var._$_findCachedViewById(R.id.etAddNew)).setOnEditorActionListener(new dl.w(8, a1Var));
                            ((RobertoButton) a1Var._$_findCachedViewById(R.id.btnS5Button)).setOnClickListener(new ho.o(a1Var, 17, t1Activity));
                            ((RobertoEditText) a1Var._$_findCachedViewById(R.id.etAddNew)).setOnFocusChangeListener(new dc.b(7, a1Var));
                            ((ImageView) a1Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(a1Var) { // from class: fq.z0

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ a1 f15840v;

                                {
                                    this.f15840v = a1Var;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    boolean z10;
                                    int i10 = r2;
                                    a1 this$0 = this.f15840v;
                                    switch (i10) {
                                        case 0:
                                            int i11 = a1.f15652z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                                            if (valueOf.length() == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                                return;
                                            }
                                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                                            this$0.J(valueOf);
                                            return;
                                        default:
                                            int i12 = a1.f15652z;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity3 = this$0.getActivity();
                                            if (activity3 != null) {
                                                activity3.onBackPressed();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                    } catch (Exception e10) {
                        e = e10;
                        a1Var = this;
                        LogHelper.INSTANCE.e(a1Var.f15653u, "exception in on view created", e);
                        return;
                    }
                }
                if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
                    arrayList.add("Go for a walk");
                    arrayList.add("Practise deep breathing");
                    arrayList.add("Talk to a friend");
                    arrayList.add("Work out");
                    arrayList.add("Read a book");
                    arrayList.add("Listen to music");
                    arrayList.add("Solve a puzzle");
                    arrayList2.add("Cook a meal");
                    arrayList2.add("Clean the house");
                    arrayList2.add("Shop for groceries");
                    arrayList2.add("Finish bank work");
                    arrayList2.add("Bake a cake");
                    arrayList2.add("Spend time with colleagues");
                    arrayList2.add("Write in your journal");
                    arrayList2.add("Read the newspaper");
                    arrayList2.add("Get a massage");
                    arrayList2.add("Observe your surroundings");
                    arrayList2.add("Drink water");
                    arrayList2.add("Read a comic");
                    arrayList2.add("Plan for the weekend");
                    arrayList2.add("Doodle");
                    arrayList2.add("Watch a show");
                    arrayList2.add("Play cards");
                    arrayList2.add("Read up on something new");
                    arrayList2.add("Go for a drive");
                    arrayList2.add("Say thank you to someone");
                    a1 a1Var3 = this;
                    ((RobertoTextView) a1Var3._$_findCachedViewById(R.id.tvS5Header)).setText("Pick 1 activity that you will do when you take a time out");
                    ((RobertoEditText) a1Var3._$_findCachedViewById(R.id.etAddNew)).setHint("Add your own");
                    ((RobertoButton) a1Var3._$_findCachedViewById(R.id.btnS5Button)).setText("Next");
                    a1Var = a1Var3;
                } else {
                    a1 a1Var4 = this;
                    if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1J)) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 != 5) {
                                    a1Var = a1Var4;
                                } else {
                                    ((RobertoTextView) a1Var4._$_findCachedViewById(R.id.tvS5Header)).setText("Finally, choose a statement to express kindness to yourself");
                                    ((RobertoEditText) a1Var4._$_findCachedViewById(R.id.etAddNew)).setHint("Add your own");
                                    ((RobertoButton) a1Var4._$_findCachedViewById(R.id.btnS5Button)).setText("Next");
                                    arrayList.add("I am strong");
                                    arrayList.add("I accept myself for who I am");
                                    arrayList.add("I am calm");
                                    arrayList.add("I am at peace");
                                    arrayList.add("I am patient");
                                    arrayList.add("I will be kind to myself");
                                    arrayList2.add("I forgive myself for being angry");
                                    arrayList2.add("I am going to be okay");
                                    arrayList2.add("I will get through this");
                                    arrayList2.add("This will pass");
                                    arrayList2.add("I am in control");
                                    arrayList2.add("I am doing my best");
                                    a1Var = a1Var4;
                                }
                            } else {
                                ((RobertoTextView) a1Var4._$_findCachedViewById(R.id.tvS5Header)).setText("Now, pick a comforting phrase to recognise that pain is universal");
                                ((RobertoEditText) a1Var4._$_findCachedViewById(R.id.etAddNew)).setHint("Add your own");
                                ((RobertoButton) a1Var4._$_findCachedViewById(R.id.btnS5Button)).setText("Next");
                                arrayList.add("I am not alone in this");
                                arrayList.add("Everyone struggles with something");
                                arrayList.add("Nobody is immune to anger");
                                arrayList.add("Others might also feel this way");
                                arrayList.add("This is part of being human");
                                arrayList2.add("Anger is a common emotion");
                                arrayList2.add("Suffering is a part of life");
                                arrayList2.add("We all experience frustration");
                                a1Var = a1Var4;
                            }
                        } else {
                            ((RobertoTextView) a1Var4._$_findCachedViewById(R.id.tvS5Header)).setText("First, pick a statement that acknowledges your pain");
                            ((RobertoEditText) a1Var4._$_findCachedViewById(R.id.etAddNew)).setHint("Add your own");
                            ((RobertoButton) a1Var4._$_findCachedViewById(R.id.btnS5Button)).setText("Next");
                            arrayList.add("I am angry");
                            arrayList.add("I am in pain");
                            arrayList.add("This is stressful");
                            arrayList.add("I feel frustrated");
                            arrayList.add("This is a difficult experience");
                            arrayList2.add("This is making me uncomfortable");
                            arrayList2.add("This hurts");
                            arrayList2.add("This is causing me pain");
                            arrayList2.add("I feel disappointed");
                            arrayList2.add("I am suffering");
                            arrayList2.add("This is bothering me");
                            a1Var = a1Var4;
                        }
                    } else {
                        a1Var = a1Var4;
                        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS)) {
                            a1Var = a1Var4;
                            if (kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1J)) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        if (i6 != 5) {
                                            a1Var = a1Var4;
                                        } else {
                                            ((RobertoTextView) a1Var4._$_findCachedViewById(R.id.tvS5Header)).setText("Finally, choose a statement to express kindness to yourself");
                                            ((RobertoEditText) a1Var4._$_findCachedViewById(R.id.etAddNew)).setHint("Add your own");
                                            ((RobertoButton) a1Var4._$_findCachedViewById(R.id.btnS5Button)).setText("Next");
                                            arrayList.add("I am strong");
                                            arrayList.add("I accept myself for who I am");
                                            arrayList.add("I will be kind to myself");
                                            arrayList.add("I am a good person");
                                            arrayList.add("I am patient and calm");
                                            arrayList.add("I am worthy of kindness");
                                            arrayList2.add("I forgive myself ");
                                            arrayList2.add("I will be okay");
                                            arrayList2.add("I will get through this");
                                            arrayList2.add("I am in control");
                                            arrayList2.add("I am doing my best");
                                            a1Var = a1Var4;
                                        }
                                    } else {
                                        ((RobertoTextView) a1Var4._$_findCachedViewById(R.id.tvS5Header)).setText("Now, pick a comforting phrase to recognise that pain is universal");
                                        ((RobertoEditText) a1Var4._$_findCachedViewById(R.id.etAddNew)).setHint("Add your own");
                                        ((RobertoButton) a1Var4._$_findCachedViewById(R.id.btnS5Button)).setText("Next");
                                        arrayList.add("I am not alone in this");
                                        arrayList.add("Everyone struggles with something");
                                        arrayList.add("We all have some pain in life");
                                        arrayList.add("This is part of being human");
                                        arrayList2.add("Suffering is a part of life");
                                        arrayList2.add("Nobody is immune to sadness");
                                        arrayList2.add("Others might also feel this way");
                                        a1Var = a1Var4;
                                    }
                                } else {
                                    ((RobertoTextView) a1Var4._$_findCachedViewById(R.id.tvS5Header)).setText("First, pick a statement that acknowledges your pain");
                                    ((RobertoEditText) a1Var4._$_findCachedViewById(R.id.etAddNew)).setHint("Add your own");
                                    ((RobertoButton) a1Var4._$_findCachedViewById(R.id.btnS5Button)).setText("Next");
                                    arrayList.add("This is causing me pain");
                                    arrayList.add("This is stressful");
                                    arrayList.add("I am hurting");
                                    arrayList.add("This is a moment of suffering");
                                    arrayList.add("I am unhappy");
                                    arrayList2.add("This hurts");
                                    arrayList2.add("This is a difficult experience");
                                    arrayList2.add("This is making me uncomfortable");
                                    arrayList2.add("I am not feeling good");
                                    a1Var = a1Var4;
                                }
                            }
                        }
                    }
                }
                kotlin.jvm.internal.i.b(t1Activity.C, "s5-b");
                a1Var.P(arrayList2);
                a1Var.O(arrayList);
                ((ImageButton) a1Var._$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new View.OnClickListener(a1Var) { // from class: fq.z0

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ a1 f15840v;

                    {
                        this.f15840v = a1Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        boolean z10;
                        int i10 = r2;
                        a1 this$0 = this.f15840v;
                        switch (i10) {
                            case 0:
                                int i11 = a1.f15652z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                                if (valueOf.length() == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                    return;
                                }
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                                this$0.J(valueOf);
                                return;
                            default:
                                int i12 = a1.f15652z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                if (activity3 != null) {
                                    activity3.onBackPressed();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ((RobertoEditText) a1Var._$_findCachedViewById(R.id.etAddNew)).addTextChangedListener(new a());
                ((RobertoEditText) a1Var._$_findCachedViewById(R.id.etAddNew)).setOnEditorActionListener(new dl.w(8, a1Var));
                ((RobertoButton) a1Var._$_findCachedViewById(R.id.btnS5Button)).setOnClickListener(new ho.o(a1Var, 17, t1Activity));
                ((RobertoEditText) a1Var._$_findCachedViewById(R.id.etAddNew)).setOnFocusChangeListener(new dc.b(7, a1Var));
                ((ImageView) a1Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(a1Var) { // from class: fq.z0

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ a1 f15840v;

                    {
                        this.f15840v = a1Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        boolean z10;
                        int i10 = r2;
                        a1 this$0 = this.f15840v;
                        switch (i10) {
                            case 0:
                                int i11 = a1.f15652z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).getText());
                                if (valueOf.length() == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                    return;
                                }
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.etAddNew)).setText("");
                                this$0.J(valueOf);
                                return;
                            default:
                                int i12 = a1.f15652z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                if (activity3 != null) {
                                    activity3.onBackPressed();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            a1Var = a1Var2;
        }
    }

    /* compiled from: StaticS5Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            a1 a1Var = a1.this;
            if (String.valueOf(((RobertoEditText) a1Var._$_findCachedViewById(R.id.etAddNew)).getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) a1Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(0);
            } else {
                ((ImageButton) a1Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(8);
            }
            String lowerCase = String.valueOf(((RobertoEditText) a1Var._$_findCachedViewById(R.id.etAddNew)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            try {
                int childCount = ((LinearLayout) a1Var._$_findCachedViewById(R.id.llSearch)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = ((LinearLayout) a1Var._$_findCachedViewById(R.id.llSearch)).getChildAt(i12);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.tvLabelSearch)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        childAt.setVisibility(0);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(a1Var.f15653u, "exception", e10);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
