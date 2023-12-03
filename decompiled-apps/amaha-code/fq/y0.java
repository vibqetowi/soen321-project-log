package fq;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T8Activity;
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
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS45AndS37Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/y0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class y0 extends rr.b {
    public static final /* synthetic */ int O = 0;
    public int E;
    public RelativeLayout G;
    public T8Activity J;
    public Course K;
    public String L;
    public final LinkedHashMap N = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15826u = LogHelper.INSTANCE.makeLogTag(y0.class);

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f15827v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f15828w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f15829x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<String> f15830y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f15831z = new ArrayList<>();
    public final ArrayList<String> A = new ArrayList<>();
    public final ArrayList<String> B = new ArrayList<>();
    public ArrayList<String> C = new ArrayList<>();
    public final HashMap<String, Object> D = new HashMap<>();
    public String F = "";
    public final Calendar H = Calendar.getInstance();
    public String I = "";
    public String M = "";

    @Override // rr.b
    public final boolean I() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).hasFocus()) {
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).clearFocus();
            UiUtils.Companion.showSearch(R.layout.fragment_static_s45_and_s37_search_hidden, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
            return false;
        }
        int i6 = this.E;
        if (i6 > 0) {
            int i10 = i6 - 1;
            this.E = i10;
            if (i10 == 0) {
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(0);
            }
            g0();
            return false;
        }
        return true;
    }

    public final void J(String str) {
        try {
            S();
            this.I = str;
            K(str);
            I();
            ((ScrollView) _$_findCachedViewById(R.id.scrollView)).postDelayed(new w0(this, 3), 500L);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15826u, "exception", e10);
        }
    }

    public final void K(String str) {
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_card_text_image, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            ((RobertoTextView) relativeLayout.findViewById(R.id.textView)).setText(str);
            ((ImageView) relativeLayout.findViewById(R.id.imageView)).setImageResource(0);
            ((ImageView) relativeLayout.findViewById(R.id.imageView)).setBackgroundResource(0);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            ((RobertoTextView) relativeLayout.findViewById(R.id.textView)).setTextColor(g0.a.b(activity2, R.color.grey_high_contrast));
            if (kotlin.jvm.internal.i.b(str, this.I)) {
                a0(relativeLayout);
                ((ScrollView) _$_findCachedViewById(R.id.scrollView)).post(new nn.f(this, 5, relativeLayout));
            }
            relativeLayout.setOnClickListener(new nn.g(10, this, relativeLayout, str));
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(relativeLayout);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15826u, "Exception", e10);
        }
    }

    public final boolean M() {
        boolean z10;
        Editable text = ((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText();
        if (text != null && text.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            String string = getString(R.string.enter_text);
            kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
            utils.showCustomToast(activity, string);
            return false;
        }
        if (this.E < this.C.size()) {
            this.C.set(this.E, String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText()));
        } else {
            this.C.add(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText()));
        }
        return true;
    }

    public final boolean O() {
        if (this.G == null) {
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            String string = getString(R.string.select_1_option);
            kotlin.jvm.internal.i.f(string, "getString(R.string.select_1_option)");
            utils.showCustomToast(activity, string);
            return false;
        }
        if (this.E < this.C.size()) {
            ArrayList<String> arrayList = this.C;
            int i6 = this.E;
            RelativeLayout relativeLayout = this.G;
            kotlin.jvm.internal.i.d(relativeLayout);
            arrayList.set(i6, ((RobertoTextView) relativeLayout.findViewById(R.id.textView)).getText().toString());
        } else {
            ArrayList<String> arrayList2 = this.C;
            RelativeLayout relativeLayout2 = this.G;
            kotlin.jvm.internal.i.d(relativeLayout2);
            arrayList2.add(((RobertoTextView) relativeLayout2.findViewById(R.id.textView)).getText().toString());
        }
        return true;
    }

    public final T8Activity P() {
        T8Activity t8Activity = this.J;
        if (t8Activity != null) {
            return t8Activity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final String Q() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.q("currentCourse");
        throw null;
    }

    public final void S() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.editText)).hasFocus()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            RobertoEditText editText = (RobertoEditText) _$_findCachedViewById(R.id.editText);
            kotlin.jvm.internal.i.f(editText, "editText");
            ((T8Activity) activity).w0(context, editText);
            return;
        }
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
        Context context2 = getContext();
        kotlin.jvm.internal.i.d(context2);
        RobertoEditText editTextAdd = (RobertoEditText) _$_findCachedViewById(R.id.editTextAdd);
        kotlin.jvm.internal.i.f(editTextAdd, "editTextAdd");
        ((T8Activity) activity2).w0(context2, editTextAdd);
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        String str = this.f15826u;
        try {
            this.f15827v = arrayList;
            try {
                ((RelativeLayout) _$_findCachedViewById(R.id.linearLayoutAdd)).setVisibility(0);
                ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).setHint("Add your own emotion");
                Y();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, "Exception", e10);
            }
            X(arrayList2);
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, "exception", e11);
        }
    }

    public final void X(ArrayList<String> arrayList) {
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).removeAllViews();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                View inflate = getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)), false);
                ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(next);
                inflate.setOnClickListener(new nn.g(9, this, next, inflate));
                if (!this.f15827v.contains(next)) {
                    ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).addView(inflate);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15826u, "exception", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[Catch: Exception -> 0x0098, TryCatch #0 {Exception -> 0x0098, blocks: (B:3:0x0003, B:5:0x0024, B:7:0x0030, B:13:0x003c, B:14:0x004d, B:16:0x0051, B:20:0x005a, B:22:0x0064, B:23:0x007a, B:24:0x0083, B:26:0x0089), top: B:31:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y() {
        boolean z10;
        try {
            boolean z11 = false;
            ((ScrollView) _$_findCachedViewById(R.id.scrollView)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).removeAllViews();
            if (this.E < this.C.size()) {
                String str = this.C.get(this.E);
                if (str != null && str.length() != 0) {
                    z10 = false;
                    if (!z10) {
                        String str2 = this.C.get(this.E);
                        kotlin.jvm.internal.i.f(str2, "answers[position]");
                        this.I = str2;
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            String str3 = this.I;
            if (!((str3 == null || str3.length() == 0) ? true : true) && !this.f15827v.contains(this.I)) {
                this.f15827v.add(this.I);
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).post(new w0(this, 2));
            }
            this.G = null;
            Iterator<String> it = this.f15827v.iterator();
            while (it.hasNext()) {
                String tt2 = it.next();
                kotlin.jvm.internal.i.f(tt2, "tt");
                K(tt2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15826u, "exception", e10);
        }
    }

    public final void Z() {
        boolean z10;
        Editable text = ((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText();
        if (text != null && text.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !kotlin.jvm.internal.i.b(gv.r.i1(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText())).toString(), "")) {
            if (this.E < this.C.size()) {
                this.C.set(this.E, String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText()));
            } else {
                this.C.add(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText()));
            }
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.N;
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

    public final void a0(RelativeLayout relativeLayout) {
        try {
            RelativeLayout relativeLayout2 = this.G;
            if (relativeLayout2 != null) {
                ((ImageView) relativeLayout2.findViewById(R.id.imageView)).setImageResource(0);
                RelativeLayout relativeLayout3 = this.G;
                kotlin.jvm.internal.i.d(relativeLayout3);
                relativeLayout3.setBackgroundColor(0);
                RelativeLayout relativeLayout4 = this.G;
                kotlin.jvm.internal.i.d(relativeLayout4);
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                ((RobertoTextView) relativeLayout4.findViewById(R.id.textView)).setTextColor(g0.a.b(activity, R.color.grey_high_contrast));
            }
            this.G = relativeLayout;
            ((RobertoTextView) relativeLayout.findViewById(R.id.textView)).setTextColor(-1);
            RelativeLayout relativeLayout5 = this.G;
            kotlin.jvm.internal.i.d(relativeLayout5);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            relativeLayout5.setBackgroundColor(g0.a.b(activity2, R.color.orange));
            RelativeLayout relativeLayout6 = this.G;
            kotlin.jvm.internal.i.d(relativeLayout6);
            ((ImageView) relativeLayout6.findViewById(R.id.imageView)).setImageResource(R.drawable.ic_right);
            RelativeLayout relativeLayout7 = this.G;
            kotlin.jvm.internal.i.d(relativeLayout7);
            ((ImageView) relativeLayout7.findViewById(R.id.imageView)).setColorFilter(P().getResources().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15826u, "Exception", e10);
        }
    }

    public final void b0(String str, String str2) {
        String str3 = this.f15826u;
        try {
            try {
                ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setText(str);
                ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setVisibility(0);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str3, "exception", e10);
            }
            h0(str2);
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str3, "Exception", e11);
        }
    }

    public final void c0(String str, ArrayList arrayList, String str2) {
        try {
            h0(str2);
            ((ScrollView) _$_findCachedViewById(R.id.scrollviewSub)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R.id.llS5List)).removeAllViews();
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS5List)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            View view = (ConstraintLayout) inflate;
            ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).setText(str);
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.card_heading_margin_bottom);
            ViewGroup.LayoutParams layoutParams = ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            aVar.setMargins(0, 0, 0, 0);
            ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
            view.setLayoutParams(layoutParams3);
            ((LinearLayout) _$_findCachedViewById(R.id.llS5List)).addView(view);
            Iterator it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                i6++;
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate2 = activity2.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS5List)), false);
                kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                View view2 = (ConstraintLayout) inflate2;
                ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).setText(i6 + ". " + ((String) it.next()));
                ViewGroup.LayoutParams layoutParams4 = ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams4;
                aVar2.setMargins(0, 0, 0, 0);
                ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar2);
                ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                view2.setLayoutParams(layoutParams6);
                ((LinearLayout) _$_findCachedViewById(R.id.llS5List)).addView(view2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15826u, "exception", e10);
        }
    }

    public final void g0() {
        try {
            int i6 = this.E;
            ArrayList<String> arrayList = this.f15828w;
            if (i6 >= arrayList.size()) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
                HashMap<String, Object> hashMap = ((T8Activity) activity).B;
                hashMap.put("headings", arrayList);
                hashMap.put("list", this.C);
                hashMap.put("s45_37_user_list", this.C);
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
                T8Activity t8Activity = (T8Activity) activity2;
                if (!kotlin.jvm.internal.i.b(t8Activity.C, "s142") || !this.D.containsKey("s143b_heading")) {
                    if (kotlin.jvm.internal.i.b(t8Activity.C, "s45") || kotlin.jvm.internal.i.b(t8Activity.C, "s37") || kotlin.jvm.internal.i.b(t8Activity.C, "s55") || kotlin.jvm.internal.i.b(t8Activity.C, "s138")) {
                        t8Activity.s0(new t());
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.E == 0) {
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(0);
            } else {
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
            }
            ((ScrollView) _$_findCachedViewById(R.id.scrollView)).setVisibility(8);
            ((RelativeLayout) _$_findCachedViewById(R.id.linearLayoutAdd)).setVisibility(8);
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setVisibility(8);
            ((ScrollView) _$_findCachedViewById(R.id.scrollviewSub)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(arrayList.get(this.E));
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setVisibility(0);
            String str = this.F;
            int hashCode = str.hashCode();
            ArrayList<String> arrayList2 = this.B;
            ArrayList<String> arrayList3 = this.A;
            ArrayList<String> arrayList4 = this.f15829x;
            switch (hashCode) {
                case 112151:
                    if (!str.equals("s37")) {
                        break;
                    } else {
                        Course course = this.K;
                        if (course != null) {
                            if (kotlin.jvm.internal.i.b(course.getCourseName(), Constants.COURSE_STRESS)) {
                                int i10 = this.E;
                                if (i10 != 0) {
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            if (i10 == 3) {
                                                c0("What would you tell a close friend?", arrayList4, "Write down these things here");
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            b0("Try and identify what's on your mind", "Note down your thoughts here");
                                            break;
                                        }
                                    } else {
                                        U(arrayList3, arrayList2);
                                        break;
                                    }
                                } else {
                                    b0("Describe the situation", "Note down the details here");
                                    break;
                                }
                            } else {
                                Course course2 = this.K;
                                if (course2 != null) {
                                    if (kotlin.jvm.internal.i.b(course2.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                        int i11 = this.E;
                                        if (i11 != 0) {
                                            if (i11 != 1) {
                                                if (i11 != 2) {
                                                    if (i11 == 3) {
                                                        c0("Think of what you would tell a friend", arrayList4, "Write what you would tell them here");
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                } else {
                                                    b0("Try and identify what's on your mind", "Note down your thoughts here");
                                                    break;
                                                }
                                            } else {
                                                U(arrayList3, arrayList2);
                                                break;
                                            }
                                        } else {
                                            b0("Describe the situation", "Note down the details here");
                                            break;
                                        }
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("course");
                                    throw null;
                                }
                            }
                        } else {
                            kotlin.jvm.internal.i.q("course");
                            throw null;
                        }
                    }
                    break;
                case 112180:
                    if (!str.equals("s45")) {
                        break;
                    } else {
                        int i12 = this.E;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    c0("Think of what can be done differently", arrayList4, "Note your suggestions");
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                b0("Outline the problem in concrete terms", "What is making you feel this way?");
                                break;
                            }
                        } else {
                            b0("Use an \"I\" statement to express yourself", "Start with \"I feel\"");
                            break;
                        }
                    }
                case 112211:
                    if (!str.equals("s55")) {
                        break;
                    } else {
                        int i13 = this.E;
                        if (i13 != 0) {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    if (i13 != 3) {
                                        if (i13 != 4) {
                                            if (i13 == 5) {
                                                c0("Identify one thing that you can do now", this.f15831z, "Write here");
                                                break;
                                            }
                                        } else {
                                            c0("Think of what a neutral person would see", this.f15830y, "Write here");
                                            break;
                                        }
                                    } else {
                                        c0("Reflect on the view of others involved", arrayList4, "Write here");
                                        break;
                                    }
                                } else {
                                    b0("Try and identify what's on your mind", "Note down your thoughts here");
                                    break;
                                }
                            } else {
                                U(arrayList3, arrayList2);
                                break;
                            }
                        } else {
                            b0("Describe the situation", "Jot down the details");
                            break;
                        }
                    }
                    break;
                case 3474691:
                    if (!str.equals("s138")) {
                        break;
                    } else {
                        int i14 = this.E;
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    if (i14 != 3) {
                                        if (i14 == 4) {
                                            b0("What do you have to do now?", "Note down your plan");
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        b0("Which option is most feasible for you?", "Pick one that will work best");
                                        break;
                                    }
                                } else {
                                    b0("Weigh the pros and cons of each option", "Note them down here");
                                    break;
                                }
                            } else {
                                b0("Brainstorm solutions", "Don't hold back!");
                                break;
                            }
                        } else {
                            b0("What is the problem you are facing?", "Note it here");
                            break;
                        }
                    }
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) _$_findCachedViewById(R.id.progressBar), Constants.SCREEN_PROGRESS, ((ProgressBar) _$_findCachedViewById(R.id.progressBar)).getProgress(), ((this.E + 1) * 100) / arrayList.size());
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15826u, "Exception", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:3:0x0003, B:5:0x0021, B:7:0x002d, B:13:0x0039, B:14:0x0048), top: B:17:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(String str) {
        boolean z10;
        try {
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setHint(str);
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setVisibility(0);
            if (this.E < this.C.size()) {
                String str2 = this.C.get(this.E);
                if (str2 != null && str2.length() != 0) {
                    z10 = false;
                    if (!z10) {
                        ((RobertoEditText) _$_findCachedViewById(R.id.editText)).post(new w0(this, 0));
                        return;
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).post(new w0(this, 1));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_static_s45_and_s37, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.N.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> arrayList;
        final y0 y0Var = this;
        kotlin.jvm.internal.i.g(view, "view");
        Utils utils = Utils.INSTANCE;
        if (utils.getClearingFragmentBackStack()) {
            return;
        }
        super.onViewCreated(view, bundle);
        try {
            String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            kotlin.jvm.internal.i.f(currentCourse, "getInstance().user.currentCourse");
            y0Var.L = currentCourse;
            Course courseById = FirebasePersistence.getInstance().getCourseById(Q());
            kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseById(currentCourse)");
            y0Var.K = courseById;
            if (utils.getClearingFragmentBackStack()) {
                return;
            }
            y0Var.E = 0;
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
            y0Var.J = (T8Activity) activity;
            y0Var.F = P().C;
            P();
            String str = y0Var.F;
            int hashCode = str.hashCode();
            ArrayList<String> arrayList2 = y0Var.f15829x;
            ArrayList<String> arrayList3 = y0Var.A;
            ArrayList<String> arrayList4 = y0Var.f15828w;
            ArrayList<String> arrayList5 = y0Var.B;
            switch (hashCode) {
                case 112151:
                    if (!str.equals("s37")) {
                        arrayList = arrayList4;
                        y0Var.D.get("headings");
                        break;
                    } else {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList5.clear();
                        arrayList2.clear();
                        ((RobertoButton) y0Var._$_findCachedViewById(R.id.button1)).setText("SKIP");
                        ((RobertoButton) y0Var._$_findCachedViewById(R.id.button2)).setText("NEXT");
                        arrayList4.add("Think of a situation that is bothering you");
                        arrayList4.add("How is this situation making you feel?");
                        arrayList4.add("What are the thoughts running through your head?");
                        arrayList4.add("Try the double standard dispute");
                        Course course = y0Var.K;
                        if (course != null) {
                            if (kotlin.jvm.internal.i.b(course.getCourseName(), Constants.COURSE_STRESS)) {
                                arrayList3.add("Stressed");
                                arrayList3.add("Frustrated");
                                arrayList3.add("Irritated");
                                arrayList3.add("Agitated");
                                arrayList3.add("Annoyed");
                                arrayList3.add("Angry");
                                arrayList5.add("Sad");
                                arrayList5.add("Upset");
                                arrayList5.add("Low");
                                arrayList5.add("Ashamed");
                                arrayList5.add("Embarrassed");
                                arrayList5.add("Worried");
                                arrayList5.add("Jealous");
                                arrayList5.add("Envious");
                                arrayList5.add("Disappointed");
                                arrayList5.add("Anxious");
                                arrayList5.add("Fearful");
                                arrayList5.add("Humiliated");
                                arrayList5.add("Disgusted");
                                arrayList2.add("Offer a balanced perspective");
                                arrayList2.add("Remind them of their strengths");
                                arrayList2.add("Tell them how to make most of this");
                                y0Var.M = "result_double_standard_dispute_stress";
                                HashMap<String, Object> hashMap = P().B;
                                String string = y0Var.getString(R.string.logTitleDoubleStandardDispute);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.logTitleDoubleStandardDispute)");
                                hashMap.put("logTitle", string);
                                arrayList = arrayList4;
                                break;
                            } else {
                                arrayList = arrayList4;
                                Course course2 = y0Var.K;
                                if (course2 != null) {
                                    try {
                                        if (kotlin.jvm.internal.i.b(course2.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                            arrayList3.add("Sad");
                                            arrayList3.add("Upset");
                                            arrayList3.add("Low");
                                            arrayList3.add("Ashamed");
                                            arrayList3.add("Embarrassed");
                                            arrayList3.add("Worried");
                                            arrayList5.add("Stressed");
                                            arrayList5.add("Frustrated");
                                            arrayList5.add("Angry");
                                            arrayList5.add("Irritated");
                                            arrayList5.add("Jealous");
                                            arrayList5.add("Envious");
                                            arrayList5.add("Disappointed");
                                            arrayList5.add("Anxious");
                                            arrayList5.add("Fearful");
                                            arrayList5.add("Humiliated");
                                            arrayList5.add("Disgusted");
                                            arrayList2.add("Offer a balanced perspective");
                                            arrayList2.add("Remind them of their strengths");
                                            arrayList2.add("Tell them how to make most of this");
                                            y0Var = this;
                                            y0Var.M = "result_double_standard_dispute_depression";
                                            HashMap<String, Object> hashMap2 = P().B;
                                            String string2 = y0Var.getString(R.string.logTitleDoubleStandardDispute);
                                            kotlin.jvm.internal.i.f(string2, "getString(R.string.logTitleDoubleStandardDispute)");
                                            hashMap2.put("logTitle", string2);
                                            break;
                                        } else {
                                            y0Var = this;
                                            break;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        e.printStackTrace();
                                        return;
                                    }
                                } else {
                                    kotlin.jvm.internal.i.q("course");
                                    throw null;
                                }
                            }
                        } else {
                            kotlin.jvm.internal.i.q("course");
                            throw null;
                        }
                    }
                case 112180:
                    if (!str.equals("s45")) {
                        arrayList = arrayList4;
                        y0Var.D.get("headings");
                        break;
                    } else {
                        arrayList4.clear();
                        arrayList2.clear();
                        ((RobertoButton) y0Var._$_findCachedViewById(R.id.button1)).setText("SKIP");
                        ((RobertoButton) y0Var._$_findCachedViewById(R.id.button2)).setText("NEXT");
                        arrayList4.add("Think of a distressing situation where you need to be assertive");
                        arrayList4.add("Now, identify and describe the problematic behaviour");
                        arrayList4.add("Finally, make a request and suggest a change");
                        arrayList2.add("What would you prefer instead?");
                        arrayList2.add("What could help you next time?");
                        arrayList2.add("What are some preventative steps?");
                        y0Var.M = "result_abc_of_assertiveness_stress";
                        HashMap<String, Object> hashMap3 = P().B;
                        String string3 = y0Var.getString(R.string.logTitleAssertivenessFormula);
                        kotlin.jvm.internal.i.f(string3, "getString(R.string.logTitleAssertivenessFormula)");
                        hashMap3.put("logTitle", string3);
                        arrayList = arrayList4;
                        break;
                    }
                case 112211:
                    if (!str.equals("s55")) {
                        arrayList = arrayList4;
                        y0Var.D.get("headings");
                        break;
                    } else {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList5.clear();
                        arrayList2.clear();
                        ArrayList<String> arrayList6 = y0Var.f15830y;
                        arrayList6.clear();
                        ArrayList<String> arrayList7 = y0Var.f15831z;
                        arrayList7.clear();
                        ((RobertoButton) y0Var._$_findCachedViewById(R.id.button1)).setText("SKIP");
                        ((RobertoButton) y0Var._$_findCachedViewById(R.id.button2)).setText("NEXT");
                        arrayList4.add("Think of a situation that is bothering you");
                        arrayList4.add("How is this situation making you feel?");
                        arrayList4.add("What are the thoughts running through your head?");
                        arrayList4.add("Think about the perspective of others involved in this situation");
                        arrayList4.add("Now, take the helicopter perspective");
                        arrayList4.add("Finally, make a plan of action to feel better");
                        arrayList3.add("Angry");
                        arrayList3.add("Irritated");
                        arrayList3.add("Fearful");
                        arrayList3.add("Stressed");
                        arrayList3.add("Frustrated");
                        arrayList3.add("Disgusted");
                        arrayList5.add("Sad");
                        arrayList5.add("Surprised");
                        arrayList5.add("Ashamed");
                        arrayList5.add("Embarassed");
                        arrayList5.add("Worried");
                        arrayList5.add("Jealous");
                        arrayList5.add("Envious");
                        arrayList5.add("Disappointed");
                        arrayList5.add("Anxious");
                        arrayList5.add("Upset");
                        arrayList5.add("Humiliated");
                        arrayList2.add("What might they be thinking?");
                        arrayList2.add("How might they feel?");
                        arrayList2.add("What might they want?");
                        arrayList6.add("How would they think about this?");
                        arrayList6.add("What might they tell you?");
                        arrayList6.add("What would their objective view be?");
                        arrayList7.add("How can you cope with the event?");
                        arrayList7.add("What is the next best step?");
                        arrayList7.add("How can you help yourself?");
                        y0Var.M = "result_helicopter_view_anger";
                        HashMap<String, Object> hashMap4 = P().B;
                        String string4 = y0Var.getString(R.string.logTitleHelicopterPerspective);
                        kotlin.jvm.internal.i.f(string4, "getString(R.string.logTitleHelicopterPerspective)");
                        hashMap4.put("logTitle", string4);
                        arrayList = arrayList4;
                        break;
                    }
                case 3474691:
                    if (!str.equals("s138")) {
                        arrayList = arrayList4;
                        y0Var.D.get("headings");
                        break;
                    } else {
                        arrayList4.clear();
                        ((RobertoButton) y0Var._$_findCachedViewById(R.id.button1)).setText("SKIP");
                        ((RobertoButton) y0Var._$_findCachedViewById(R.id.button2)).setText("NEXT");
                        arrayList4.add("Step 1: State your problem in a simple statement");
                        arrayList4.add("Step 2: List all possible solutions to this problem");
                        arrayList4.add("Step 3: Carefully evaluate each of your options");
                        arrayList4.add("Step 4: Choose the best option");
                        arrayList4.add("Step 5: Create an action plan");
                        y0Var.M = "result_stages_of_problem_solving_stress";
                        HashMap<String, Object> hashMap5 = P().B;
                        String string5 = y0Var.getString(R.string.logTitleProblemSolvingFormula);
                        kotlin.jvm.internal.i.f(string5, "getString(R.string.logTitleProblemSolvingFormula)");
                        hashMap5.put("logTitle", string5);
                        arrayList = arrayList4;
                        break;
                    }
                default:
                    arrayList = arrayList4;
                    y0Var.D.get("headings");
                    break;
            }
            P();
            g0();
            ((RobertoButton) y0Var._$_findCachedViewById(R.id.button2)).setOnClickListener(new View.OnClickListener(y0Var) { // from class: fq.x0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y0 f15824v;

                {
                    this.f15824v = y0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x0150 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0166 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0175 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = true;
                    y0 this$0 = this.f15824v;
                    switch (i6) {
                        case 0:
                            int i10 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                String str2 = this$0.F;
                                switch (str2.hashCode()) {
                                    case 112151:
                                        if (!str2.equals("s37")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                            if (this$0.O()) {
                                                this$0.E++;
                                                this$0.g0();
                                                break;
                                            }
                                        } else if (this$0.M()) {
                                            this$0.E++;
                                            this$0.g0();
                                            break;
                                        }
                                        break;
                                    case 112180:
                                        if (!str2.equals("s45")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                            this$0.E++;
                                            this$0.g0();
                                            break;
                                        }
                                        break;
                                    case 112207:
                                        if (!str2.equals("s51")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 112211:
                                        if (!str2.equals("s55")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 112212:
                                        if (!str2.equals("s56")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 3474691:
                                        if (!str2.equals("s138")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474692:
                                        if (!str2.equals("s139")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474714:
                                        if (!str2.equals("s140")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474715:
                                        if (!str2.equals("s141")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 3474716:
                                        if (!str2.equals("s142")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474745:
                                        if (!str2.equals("s150")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474747:
                                        if (!str2.equals("s152")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474749:
                                        if (!str2.equals("s154")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f15826u, "Exception", e11);
                                return;
                            }
                        case 1:
                            int i11 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P().t0();
                            return;
                        case 2:
                            int i12 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText());
                            if (valueOf.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity2);
                                String string6 = this$0.getString(R.string.enter_text);
                                kotlin.jvm.internal.i.f(string6, "getString(R.string.enter_text)");
                                utils2.showCustomToast(activity2, string6);
                                return;
                            } else if (this$0.f15827v.contains(valueOf)) {
                                Utils.INSTANCE.showCustomToast(this$0.P(), "Item Already Exists");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                                this$0.I();
                                ((ImageButton) this$0._$_findCachedViewById(R.id.textAdd)).setVisibility(8);
                                return;
                            } else {
                                this$0.f15827v.add(valueOf);
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                                this$0.J(valueOf);
                                return;
                            }
                        case 3:
                            int i13 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new s(this$0, 3);
                            a1Var.b();
                            return;
                        default:
                            int i14 = y0.O;
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
            ((RobertoButton) y0Var._$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(y0Var) { // from class: fq.x0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y0 f15824v;

                {
                    this.f15824v = y0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x0150 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0166 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0175 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = true;
                    y0 this$0 = this.f15824v;
                    switch (i6) {
                        case 0:
                            int i10 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                String str2 = this$0.F;
                                switch (str2.hashCode()) {
                                    case 112151:
                                        if (!str2.equals("s37")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                            if (this$0.O()) {
                                                this$0.E++;
                                                this$0.g0();
                                                break;
                                            }
                                        } else if (this$0.M()) {
                                            this$0.E++;
                                            this$0.g0();
                                            break;
                                        }
                                        break;
                                    case 112180:
                                        if (!str2.equals("s45")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                            this$0.E++;
                                            this$0.g0();
                                            break;
                                        }
                                        break;
                                    case 112207:
                                        if (!str2.equals("s51")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 112211:
                                        if (!str2.equals("s55")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 112212:
                                        if (!str2.equals("s56")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 3474691:
                                        if (!str2.equals("s138")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474692:
                                        if (!str2.equals("s139")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474714:
                                        if (!str2.equals("s140")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474715:
                                        if (!str2.equals("s141")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 3474716:
                                        if (!str2.equals("s142")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474745:
                                        if (!str2.equals("s150")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474747:
                                        if (!str2.equals("s152")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474749:
                                        if (!str2.equals("s154")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f15826u, "Exception", e11);
                                return;
                            }
                        case 1:
                            int i11 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P().t0();
                            return;
                        case 2:
                            int i12 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText());
                            if (valueOf.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity2);
                                String string6 = this$0.getString(R.string.enter_text);
                                kotlin.jvm.internal.i.f(string6, "getString(R.string.enter_text)");
                                utils2.showCustomToast(activity2, string6);
                                return;
                            } else if (this$0.f15827v.contains(valueOf)) {
                                Utils.INSTANCE.showCustomToast(this$0.P(), "Item Already Exists");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                                this$0.I();
                                ((ImageButton) this$0._$_findCachedViewById(R.id.textAdd)).setVisibility(8);
                                return;
                            } else {
                                this$0.f15827v.add(valueOf);
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                                this$0.J(valueOf);
                                return;
                            }
                        case 3:
                            int i13 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new s(this$0, 3);
                            a1Var.b();
                            return;
                        default:
                            int i14 = y0.O;
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
            ((RobertoEditText) y0Var._$_findCachedViewById(R.id.editTextAdd)).addTextChangedListener(new a());
            ((RobertoEditText) y0Var._$_findCachedViewById(R.id.editTextAdd)).setOnFocusChangeListener(new dc.b(6, y0Var));
            ((ImageButton) y0Var._$_findCachedViewById(R.id.textAdd)).setOnClickListener(new View.OnClickListener(y0Var) { // from class: fq.x0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y0 f15824v;

                {
                    this.f15824v = y0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x0150 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0166 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0175 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = true;
                    y0 this$0 = this.f15824v;
                    switch (i6) {
                        case 0:
                            int i10 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                String str2 = this$0.F;
                                switch (str2.hashCode()) {
                                    case 112151:
                                        if (!str2.equals("s37")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                            if (this$0.O()) {
                                                this$0.E++;
                                                this$0.g0();
                                                break;
                                            }
                                        } else if (this$0.M()) {
                                            this$0.E++;
                                            this$0.g0();
                                            break;
                                        }
                                        break;
                                    case 112180:
                                        if (!str2.equals("s45")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                            this$0.E++;
                                            this$0.g0();
                                            break;
                                        }
                                        break;
                                    case 112207:
                                        if (!str2.equals("s51")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 112211:
                                        if (!str2.equals("s55")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 112212:
                                        if (!str2.equals("s56")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 3474691:
                                        if (!str2.equals("s138")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474692:
                                        if (!str2.equals("s139")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474714:
                                        if (!str2.equals("s140")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474715:
                                        if (!str2.equals("s141")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 3474716:
                                        if (!str2.equals("s142")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474745:
                                        if (!str2.equals("s150")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474747:
                                        if (!str2.equals("s152")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474749:
                                        if (!str2.equals("s154")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f15826u, "Exception", e11);
                                return;
                            }
                        case 1:
                            int i11 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P().t0();
                            return;
                        case 2:
                            int i12 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText());
                            if (valueOf.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity2);
                                String string6 = this$0.getString(R.string.enter_text);
                                kotlin.jvm.internal.i.f(string6, "getString(R.string.enter_text)");
                                utils2.showCustomToast(activity2, string6);
                                return;
                            } else if (this$0.f15827v.contains(valueOf)) {
                                Utils.INSTANCE.showCustomToast(this$0.P(), "Item Already Exists");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                                this$0.I();
                                ((ImageButton) this$0._$_findCachedViewById(R.id.textAdd)).setVisibility(8);
                                return;
                            } else {
                                this$0.f15827v.add(valueOf);
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                                this$0.J(valueOf);
                                return;
                            }
                        case 3:
                            int i13 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new s(this$0, 3);
                            a1Var.b();
                            return;
                        default:
                            int i14 = y0.O;
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
            ((RobertoEditText) y0Var._$_findCachedViewById(R.id.editTextAdd)).setOnEditorActionListener(new dl.w(7, y0Var));
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
            ((T8Activity) activity2).B.put("questions", arrayList);
            ((ImageView) y0Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) y0Var._$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(y0Var) { // from class: fq.x0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y0 f15824v;

                {
                    this.f15824v = y0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x0150 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0166 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0175 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = true;
                    y0 this$0 = this.f15824v;
                    switch (i6) {
                        case 0:
                            int i10 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                String str2 = this$0.F;
                                switch (str2.hashCode()) {
                                    case 112151:
                                        if (!str2.equals("s37")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                            if (this$0.O()) {
                                                this$0.E++;
                                                this$0.g0();
                                                break;
                                            }
                                        } else if (this$0.M()) {
                                            this$0.E++;
                                            this$0.g0();
                                            break;
                                        }
                                        break;
                                    case 112180:
                                        if (!str2.equals("s45")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                            this$0.E++;
                                            this$0.g0();
                                            break;
                                        }
                                        break;
                                    case 112207:
                                        if (!str2.equals("s51")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 112211:
                                        if (!str2.equals("s55")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 112212:
                                        if (!str2.equals("s56")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 3474691:
                                        if (!str2.equals("s138")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474692:
                                        if (!str2.equals("s139")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474714:
                                        if (!str2.equals("s140")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474715:
                                        if (!str2.equals("s141")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 3474716:
                                        if (!str2.equals("s142")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474745:
                                        if (!str2.equals("s150")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474747:
                                        if (!str2.equals("s152")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474749:
                                        if (!str2.equals("s154")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f15826u, "Exception", e11);
                                return;
                            }
                        case 1:
                            int i11 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P().t0();
                            return;
                        case 2:
                            int i12 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText());
                            if (valueOf.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity22 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity22);
                                String string6 = this$0.getString(R.string.enter_text);
                                kotlin.jvm.internal.i.f(string6, "getString(R.string.enter_text)");
                                utils2.showCustomToast(activity22, string6);
                                return;
                            } else if (this$0.f15827v.contains(valueOf)) {
                                Utils.INSTANCE.showCustomToast(this$0.P(), "Item Already Exists");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                                this$0.I();
                                ((ImageButton) this$0._$_findCachedViewById(R.id.textAdd)).setVisibility(8);
                                return;
                            } else {
                                this$0.f15827v.add(valueOf);
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                                this$0.J(valueOf);
                                return;
                            }
                        case 3:
                            int i13 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new s(this$0, 3);
                            a1Var.b();
                            return;
                        default:
                            int i14 = y0.O;
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
            ((ImageView) y0Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(y0Var) { // from class: fq.x0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ y0 f15824v;

                {
                    this.f15824v = y0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x0150 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0166 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0175 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:21:0x00cb, B:22:0x00d1, B:24:0x00d6, B:60:0x014a, B:62:0x0150, B:27:0x00e0, B:30:0x00ea, B:33:0x00f4, B:36:0x00fe, B:66:0x0162, B:68:0x0166, B:70:0x016c, B:71:0x0175, B:73:0x017b, B:39:0x0108, B:42:0x0112, B:45:0x011c, B:48:0x0126, B:51:0x012f, B:54:0x0138, B:57:0x0141, B:63:0x0159), top: B:83:0x00cb }] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = true;
                    y0 this$0 = this.f15824v;
                    switch (i6) {
                        case 0:
                            int i10 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                String str2 = this$0.F;
                                switch (str2.hashCode()) {
                                    case 112151:
                                        if (!str2.equals("s37")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                            if (this$0.O()) {
                                                this$0.E++;
                                                this$0.g0();
                                                break;
                                            }
                                        } else if (this$0.M()) {
                                            this$0.E++;
                                            this$0.g0();
                                            break;
                                        }
                                        break;
                                    case 112180:
                                        if (!str2.equals("s45")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                            this$0.E++;
                                            this$0.g0();
                                            break;
                                        }
                                        break;
                                    case 112207:
                                        if (!str2.equals("s51")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 112211:
                                        if (!str2.equals("s55")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 112212:
                                        if (!str2.equals("s56")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 3474691:
                                        if (!str2.equals("s138")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474692:
                                        if (!str2.equals("s139")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474714:
                                        if (!str2.equals("s140")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474715:
                                        if (!str2.equals("s141")) {
                                            break;
                                        }
                                        if (this$0.E != 1) {
                                        }
                                        break;
                                    case 3474716:
                                        if (!str2.equals("s142")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474745:
                                        if (!str2.equals("s150")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474747:
                                        if (!str2.equals("s152")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                    case 3474749:
                                        if (!str2.equals("s154")) {
                                            break;
                                        }
                                        if (this$0.M()) {
                                        }
                                        break;
                                }
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f15826u, "Exception", e11);
                                return;
                            }
                        case 1:
                            int i11 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P().t0();
                            return;
                        case 2:
                            int i12 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText());
                            if (valueOf.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity22 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity22);
                                String string6 = this$0.getString(R.string.enter_text);
                                kotlin.jvm.internal.i.f(string6, "getString(R.string.enter_text)");
                                utils2.showCustomToast(activity22, string6);
                                return;
                            } else if (this$0.f15827v.contains(valueOf)) {
                                Utils.INSTANCE.showCustomToast(this$0.P(), "Item Already Exists");
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                                this$0.I();
                                ((ImageButton) this$0._$_findCachedViewById(R.id.textAdd)).setVisibility(8);
                                return;
                            } else {
                                this$0.f15827v.add(valueOf);
                                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                                this$0.J(valueOf);
                                return;
                            }
                        case 3:
                            int i13 = y0.O;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new s(this$0, 3);
                            a1Var.b();
                            return;
                        default:
                            int i14 = y0.O;
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
    }

    /* compiled from: StaticS45AndS37Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            y0 y0Var = y0.this;
            if (String.valueOf(((RobertoEditText) y0Var._$_findCachedViewById(R.id.editTextAdd)).getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) y0Var._$_findCachedViewById(R.id.textAdd)).setVisibility(0);
            } else {
                ((ImageButton) y0Var._$_findCachedViewById(R.id.textAdd)).setVisibility(4);
            }
            String lowerCase = String.valueOf(((RobertoEditText) y0Var._$_findCachedViewById(R.id.editTextAdd)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            try {
                int childCount = ((LinearLayout) y0Var._$_findCachedViewById(R.id.linearLayout2)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = ((LinearLayout) y0Var._$_findCachedViewById(R.id.linearLayout2)).getChildAt(i12);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.tvLabelSearch)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        childAt.setVisibility(0);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(y0Var.f15826u, "exception", e10);
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
