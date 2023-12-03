package fq;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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
/* compiled from: StaticS12Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/b0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b0 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f15662z = 0;

    /* renamed from: v  reason: collision with root package name */
    public final HashSet<String> f15664v;

    /* renamed from: w  reason: collision with root package name */
    public HashSet<String> f15665w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f15666x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f15667y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15663u = LogHelper.INSTANCE.makeLogTag(b0.class);

    public b0() {
        new ArrayList();
        this.f15664v = new HashSet<>();
        this.f15665w = new HashSet<>();
        this.f15666x = new ArrayList<>();
    }

    @Override // rr.b
    public final boolean I() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).hasFocus()) {
            ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).clearFocus();
            UiUtils.Companion.showSearch(R.layout.fragment_static_s12, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
            return false;
        }
        return true;
    }

    public final void J(String str) {
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_checkbox, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS12List)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) inflate;
            ((RobertoTextView) frameLayout.findViewById(R.id.tvLabel)).setText(str);
            if (this.f15665w.contains(str)) {
                M(frameLayout);
            } else {
                Q(frameLayout);
            }
            frameLayout.setOnClickListener(new ho.o(this, 14, str));
            ((LinearLayout) _$_findCachedViewById(R.id.llS12List)).addView(frameLayout);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15663u, "exception in add RadioButton", e10);
        }
    }

    public final void K(String str) {
        try {
            if (((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).hasFocus()) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
                Context context = getContext();
                kotlin.jvm.internal.i.d(context);
                RobertoEditText etS12Edit = (RobertoEditText) _$_findCachedViewById(R.id.etS12Edit);
                kotlin.jvm.internal.i.f(etS12Edit, "etS12Edit");
                ((T1Activity) activity).w0(context, etS12Edit);
            }
            if (!this.f15666x.contains(str)) {
                this.f15664v.add(str);
                this.f15666x.add(str);
                if (!O(false)) {
                    this.f15665w.add(str);
                }
                J(str);
                I();
                ((ScrollView) _$_findCachedViewById(R.id.scrollview)).postDelayed(new tl.o(17, this), 500L);
                return;
            }
            I();
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            utils.showCustomToast(activity2, "Item Already Exists");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15663u, "exception", e10);
        }
    }

    public final void M(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_orange_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Bold.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.page_title));
    }

    public final boolean O(boolean z10) {
        if (this.f15665w.size() == 3) {
            if (z10) {
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                utils.showCustomToast(activity, "You can't select more items!");
                return true;
            }
            return true;
        }
        return false;
    }

    public final void P(ArrayList<String> arrayList) {
        try {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                View inflate = getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llSearch)), false);
                ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(next);
                inflate.setOnClickListener(new nn.g(7, this, next, inflate));
                if (!this.f15664v.contains(next)) {
                    ((LinearLayout) _$_findCachedViewById(R.id.llSearch)).addView(inflate);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15663u, "exception", e10);
        }
    }

    public final void Q(View view) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Object obj = g0.a.f16164a;
        ((RobertoTextView) defpackage.e.g(activity, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) view.findViewById(R.id.chkBxSelected), view, R.id.tvLabel)).setFont("Lato-Medium.ttf");
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        ((RobertoTextView) view.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity2, R.color.colorTextGrey));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15667y;
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
        return inflater.inflate(R.layout.fragment_static_s12, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15667y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            String stringExtra = activity.getIntent().getStringExtra(Constants.API_COURSE_LINK);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
            T1Activity t1Activity = (T1Activity) activity2;
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText("Pick up to 3 affirmations to say to yourself");
                ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText("Next");
                ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint("Add your own");
                arrayList.add("I am doing my best");
                arrayList.add("I will think positively");
                arrayList.add("I am in control of my choices");
                arrayList.add("I can stand up for myself");
                arrayList.add("I am calm and confident");
                arrayList.add("I can overcome this problem");
                arrayList.add("I am strong and capable");
                arrayList2.add("I am in charge of my decisions");
                arrayList2.add("I believe in myself");
                arrayList2.add("I can set firm boundaries");
                arrayList2.add("I can express myself honestly");
                arrayList2.add("I am worthy");
                arrayList2.add("I can let go of stress");
                arrayList2.add("I will be happy and stress-free");
                arrayList2.add("I can stand for what I believe in");
                arrayList2.add("People understand my point of view");
                arrayList2.add("Others deserve to know how I feel");
                arrayList2.add("I accept who I am");
                arrayList2.add("I am not perfect and that's okay");
                arrayList2.add("I have inner strength");
                arrayList2.add("I can stand up for myself");
                arrayList2.add("I will say what I feel");
                arrayList2.add("My opinions are important");
                arrayList2.add("I am firm when I speak my mind");
                arrayList2.add("I can make good decisions");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText("Pick up to 3 affirmations to say to yourself");
                ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText("Next");
                ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint("Add your own");
                arrayList.add("Today was a good day");
                arrayList.add("I am calm and relaxed");
                arrayList.add("Life is good");
                arrayList.add("I will sleep well tonight");
                arrayList.add("I will be rested and fresh tomorrow");
                arrayList.add("I forgive everyone who has hurt me");
                arrayList.add("I can let go of my thoughts");
                arrayList2.add("I can manage my struggles");
                arrayList2.add("I will make good decisions");
                arrayList2.add("I have inner strength");
                arrayList2.add("I am alive and worthy");
                arrayList2.add("I will have a better day tomorrow");
                arrayList2.add("I accept myself for who I am");
                arrayList2.add("I will be calm and happy");
                arrayList2.add("I look forward to tomorrow");
                arrayList2.add("I will be patient with myself");
                arrayList2.add("I am strong and capable");
                arrayList2.add("I will take care of my needs");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1H)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText("Choose up to 3 affirmations to build acceptance");
                ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText("Next");
                ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint("Add your own");
                arrayList.add("I can let go of worry");
                arrayList.add("I accept things the way they are");
                arrayList.add("I will be patient and accepting");
                arrayList.add("I can only control how I respond");
                arrayList.add("I can learn to accept uncertainty");
                arrayList.add("It's better to focus on the present");
                arrayList.add("I don't need control over this");
                arrayList2.add("I can't be 100% certain of anything");
                arrayList2.add("I can tolerate uncertainty");
                arrayList2.add("It's no use fighting uncertainty");
                arrayList2.add("I will deal with what comes next");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText("Pick up to 3 affirmations that will help you with your anger");
                ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText("Next");
                ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint("Add your own");
                arrayList.add("I am in control of my feelings");
                arrayList.add("This too shall pass");
                arrayList.add("I will overcome my anger");
                arrayList.add("I can handle this");
                arrayList.add("I will keep my cool");
                arrayList.add("I am calm and at peace");
                arrayList.add("This is not worth it");
                arrayList2.add("I will tame my anger");
                arrayList2.add("I will not let anger overpower me");
                arrayList2.add("I can make rational, calm decisions");
                arrayList2.add("I don't have to control everything");
                arrayList2.add("I can let others be");
                arrayList2.add("I am in charge");
                arrayList2.add("I want and appreciate peace");
                arrayList2.add("I accept my anger");
                arrayList2.add("I let go of my anger");
                arrayList2.add("I forgive myself for my anger");
                arrayList2.add("I am confident and happy");
                arrayList2.add("I will take care of my needs");
                arrayList2.add("I will not make a rash decision");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS12Header)).setText("Pick up to 3 affirmations to cultivate happiness");
                ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setText("Next");
                ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setHint("Add your own");
                arrayList.add("I am happy and healthy");
                arrayList.add("I look forward to life");
                arrayList.add("My life is fun and rewarding");
                arrayList.add("I can achieve my goals");
                arrayList.add("I am grateful for everything I have");
                arrayList.add("I am calm and confident");
                arrayList.add("I am loved by people in my life");
                arrayList2.add("I can overcome challenges");
                arrayList2.add("I attract positive and kind people");
                arrayList2.add("I am at peace");
                arrayList2.add("I am full of energy and enthusiasm");
                arrayList2.add("I am diligent and hardworking");
                arrayList2.add("I have integrity");
                arrayList2.add("I am confident and capable");
                arrayList2.add("I am alive and well");
                arrayList2.add("I can create a better life");
                arrayList2.add("I will build positive relationships");
                arrayList2.add("I will get to where I want to be");
            }
            this.f15666x = arrayList;
            boolean containsKey = t1Activity.B.containsKey("s12_user_list");
            HashMap<String, Object> hashMap = t1Activity.B;
            if (containsKey) {
                Object obj = hashMap.get("s12_user_list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>");
                this.f15665w = (HashSet) obj;
            }
            if (hashMap.containsKey("userAdded")) {
                HashSet<String> hashSet = this.f15664v;
                hashSet.clear();
                ((LinearLayout) _$_findCachedViewById(R.id.llS12List)).removeAllViews();
                Object obj2 = hashMap.get("userAdded");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                hashSet.addAll((ArrayList) obj2);
                this.f15666x.addAll(is.u.I2(hashSet));
            }
            P(arrayList2);
            for (String str : this.f15666x) {
                J(str);
            }
            ((ImageButton) _$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.a0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b0 f15651v;

                {
                    this.f15651v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z10;
                    int i6 = r2;
                    b0 this$0 = this.f15651v;
                    switch (i6) {
                        case 0:
                            int i10 = b0.f15662z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etS12Edit)).getText());
                            if (valueOf.length() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Please enter text to proceed");
                                return;
                            }
                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.etS12Edit)).setText("");
                            this$0.K(valueOf);
                            return;
                        default:
                            int i11 = b0.f15662z;
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
            ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setOnEditorActionListener(new dl.w(6, this));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).addTextChangedListener(new a());
            ((RobertoButton) _$_findCachedViewById(R.id.btnS12Button)).setOnClickListener(new ho.o(this, 13, t1Activity));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS12Edit)).setOnFocusChangeListener(new dc.b(5, this));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.a0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b0 f15651v;

                {
                    this.f15651v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z10;
                    int i6 = r2;
                    b0 this$0 = this.f15651v;
                    switch (i6) {
                        case 0:
                            int i10 = b0.f15662z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.etS12Edit)).getText());
                            if (valueOf.length() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Please enter text to proceed");
                                return;
                            }
                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.etS12Edit)).setText("");
                            this$0.K(valueOf);
                            return;
                        default:
                            int i11 = b0.f15662z;
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
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15663u, "exception in on view created", e10);
        }
    }

    /* compiled from: StaticS12Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            b0 b0Var = b0.this;
            if (String.valueOf(((RobertoEditText) b0Var._$_findCachedViewById(R.id.etS12Edit)).getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) b0Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(0);
            } else {
                ((ImageButton) b0Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(8);
            }
            String lowerCase = String.valueOf(((RobertoEditText) b0Var._$_findCachedViewById(R.id.etS12Edit)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            try {
                int childCount = ((LinearLayout) b0Var._$_findCachedViewById(R.id.llSearch)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = ((LinearLayout) b0Var._$_findCachedViewById(R.id.llSearch)).getChildAt(i12);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.tvLabelSearch)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        childAt.setVisibility(0);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(b0Var.f15663u, "exception", e10);
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
