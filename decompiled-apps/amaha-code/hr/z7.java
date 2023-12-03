package hr;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
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
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS45AndS37Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/z7;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z7 extends rr.b {
    public static final /* synthetic */ int K = 0;
    public RelativeLayout B;
    public boolean F;
    public TemplateActivity G;

    /* renamed from: z  reason: collision with root package name */
    public int f19452z;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19447u = LogHelper.INSTANCE.makeLogTag(z7.class);

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f19448v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f19449w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f19450x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public HashMap<String, Object> f19451y = new HashMap<>();
    public String A = "";
    public final Calendar C = Calendar.getInstance();
    public String D = "";
    public String E = "";
    public String H = "";
    public String I = "";

    @Override // rr.b
    public final boolean I() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).hasFocus()) {
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).clearFocus();
            UiUtils.Companion.showSearch(R.layout.fragment_screen_s45_and_s37_search_hidden, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
            return false;
        }
        int i6 = this.f19452z;
        if (i6 > 0) {
            this.f19452z = i6 - 1;
            k0();
            return false;
        }
        return true;
    }

    public final void J(String str) {
        try {
            S();
            this.E = str;
            K(str);
            I();
            ((ScrollView) _$_findCachedViewById(R.id.scrollView)).postDelayed(new y7(this, 3), 500L);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "exception", e10);
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
            ((RobertoTextView) relativeLayout.findViewById(R.id.textView)).setTextColor(g0.a.b(activity2, R.color.unselected_row_text));
            if (kotlin.jvm.internal.i.b(str, this.E)) {
                g0(relativeLayout);
                ((ScrollView) _$_findCachedViewById(R.id.scrollView)).post(new nn.f(this, 8, relativeLayout));
            }
            relativeLayout.setOnClickListener(new o4(10, this, relativeLayout, str));
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(relativeLayout);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "Exception", e10);
        }
    }

    public final void M() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
            int i6 = this.f19452z;
            int size = this.f19450x.size();
            Calendar calendar = this.C;
            if (i6 < size) {
                this.f19450x.set(this.f19452z, simpleDateFormat.format(calendar.getTime()));
            } else {
                this.f19450x.add(simpleDateFormat.format(calendar.getTime()));
            }
            this.F = true;
            ((RobertoTextView) _$_findCachedViewById(R.id.tvTimeInput)).setVisibility(8);
        } catch (Exception e10) {
            this.f19450x.add("");
            LogHelper.INSTANCE.e(this.f19447u, "exception", e10);
        }
    }

    public final boolean O() {
        boolean z10;
        String str;
        Editable text = ((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText();
        if (text != null && text.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !kotlin.jvm.internal.i.b(gv.r.i1(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText())).toString(), "")) {
            if (this.f19452z < this.f19450x.size()) {
                this.f19450x.set(this.f19452z, gv.r.i1(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText())).toString());
            } else {
                this.f19450x.add(gv.r.i1(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText())).toString());
            }
            return true;
        }
        Utils utils = Utils.INSTANCE;
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        if (kotlin.jvm.internal.i.b(this.H, "")) {
            str = getString(R.string.enter_text);
        } else {
            str = this.H;
        }
        kotlin.jvm.internal.i.f(str, "if (errorInput == \"\") ge…ter_text) else errorInput");
        utils.showCustomToast(activity, str);
        return false;
    }

    public final boolean P() {
        if (this.B == null) {
            if (kotlin.jvm.internal.i.b(this.I, "")) {
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                String string = getString(R.string.select_option);
                kotlin.jvm.internal.i.f(string, "getString(R.string.select_option)");
                utils.showCustomToast(activity, string);
            } else {
                Utils utils2 = Utils.INSTANCE;
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                utils2.showCustomToast(activity2, this.I);
            }
            return false;
        }
        if (this.f19452z < this.f19450x.size()) {
            ArrayList<String> arrayList = this.f19450x;
            int i6 = this.f19452z;
            RelativeLayout relativeLayout = this.B;
            kotlin.jvm.internal.i.d(relativeLayout);
            arrayList.set(i6, ((RobertoTextView) relativeLayout.findViewById(R.id.textView)).getText().toString());
        } else {
            ArrayList<String> arrayList2 = this.f19450x;
            RelativeLayout relativeLayout2 = this.B;
            kotlin.jvm.internal.i.d(relativeLayout2);
            arrayList2.add(((RobertoTextView) relativeLayout2.findViewById(R.id.textView)).getText().toString());
        }
        return true;
    }

    public final TemplateActivity Q() {
        TemplateActivity templateActivity = this.G;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void S() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.editText)).hasFocus()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            RobertoEditText editText = (RobertoEditText) _$_findCachedViewById(R.id.editText);
            kotlin.jvm.internal.i.f(editText, "editText");
            ((TemplateActivity) activity).D0(context, editText);
            return;
        }
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        Context context2 = getContext();
        kotlin.jvm.internal.i.d(context2);
        RobertoEditText editTextAdd = (RobertoEditText) _$_findCachedViewById(R.id.editTextAdd);
        kotlin.jvm.internal.i.f(editTextAdd, "editTextAdd");
        ((TemplateActivity) activity2).D0(context2, editTextAdd);
    }

    public final void U(String str, String str2, String str3) {
        String str4 = this.f19447u;
        try {
            this.f19448v.clear();
            this.f19448v = UtilFunKt.paramsMapToList(this.f19451y.get(str));
            try {
                ((RelativeLayout) _$_findCachedViewById(R.id.linearLayoutAdd)).setVisibility(0);
                kotlin.jvm.internal.i.e(str2, "null cannot be cast to non-null type kotlin.String");
                ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).setHint(str2);
                Z();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str4, "Exception", e10);
            }
            Y(UtilFunKt.paramsMapToList(this.f19451y.get(str3)));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str4, "exception", e11);
        }
    }

    public final void X() {
        try {
            this.f19448v.clear();
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Object obj = ((TemplateActivity) activity).F.get("s129_list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            this.f19448v = (ArrayList) obj;
            Z();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "exception", e10);
        }
    }

    public final void Y(ArrayList<String> arrayList) {
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).removeAllViews();
            for (String str : arrayList) {
                View inflate = getLayoutInflater().inflate(R.layout.row_search, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)), false);
                ((RobertoTextView) inflate.findViewById(R.id.tvLabelSearch)).setText(str);
                inflate.setOnClickListener(new o4(9, this, str, inflate));
                if (!this.f19448v.contains(str)) {
                    ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).addView(inflate);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "exception", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[Catch: Exception -> 0x0098, TryCatch #0 {Exception -> 0x0098, blocks: (B:3:0x0003, B:5:0x0024, B:7:0x0030, B:13:0x003c, B:14:0x004d, B:16:0x0051, B:20:0x005a, B:22:0x0064, B:23:0x007a, B:24:0x0083, B:26:0x0089), top: B:31:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        boolean z10;
        try {
            boolean z11 = false;
            ((ScrollView) _$_findCachedViewById(R.id.scrollView)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).removeAllViews();
            if (this.f19452z < this.f19450x.size()) {
                String str = this.f19450x.get(this.f19452z);
                if (str != null && str.length() != 0) {
                    z10 = false;
                    if (!z10) {
                        String str2 = this.f19450x.get(this.f19452z);
                        kotlin.jvm.internal.i.f(str2, "answers[position]");
                        this.E = str2;
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            String str3 = this.E;
            if (!((str3 == null || str3.length() == 0) ? true : true) && !this.f19448v.contains(this.E)) {
                this.f19448v.add(this.E);
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).post(new y7(this, 2));
            }
            this.B = null;
            Iterator<String> it = this.f19448v.iterator();
            while (it.hasNext()) {
                String tt2 = it.next();
                kotlin.jvm.internal.i.f(tt2, "tt");
                K(tt2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.J;
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

    public final void a0() {
        boolean z10;
        Editable text = ((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText();
        if (text != null && text.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !kotlin.jvm.internal.i.b(gv.r.i1(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText())).toString(), "")) {
            if (this.f19452z < this.f19450x.size()) {
                this.f19450x.set(this.f19452z, gv.r.i1(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText())).toString());
            } else {
                this.f19450x.add(gv.r.i1(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText())).toString());
            }
        }
    }

    public final void b0(TemplateActivity templateActivity) {
        this.G = templateActivity;
    }

    public final void c0() {
        Calendar calendar = this.C;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMMM yyyy");
            SpannableString spannableString = new SpannableString(gv.n.F0(gv.n.F0(this.D, "%replace_time%", String.valueOf(simpleDateFormat.format(calendar.getTime()))), "%replace_date%", String.valueOf(simpleDateFormat2.format(calendar.getTime()))));
            String format = simpleDateFormat.format(calendar.getTime());
            kotlin.jvm.internal.i.f(format, "timeFormat.format(calendar.time)");
            int O0 = gv.r.O0(spannableString, format, 0, false, 6);
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            spannableString.setSpan(new ForegroundColorSpan(g0.a.b(context, R.color.sea)), O0, simpleDateFormat.format(calendar.getTime()).length() + O0, 33);
            String format2 = simpleDateFormat2.format(calendar.getTime());
            kotlin.jvm.internal.i.f(format2, "dateFormat.format(calendar.time)");
            int O02 = gv.r.O0(spannableString, format2, 0, false, 6);
            Context context2 = getContext();
            kotlin.jvm.internal.i.d(context2);
            spannableString.setSpan(new ForegroundColorSpan(g0.a.b(context2, R.color.sea)), O02, simpleDateFormat2.format(calendar.getTime()).length() + O02, 33);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvTimeInput)).setText(spannableString);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "exception", e10);
        }
    }

    public final void g0(RelativeLayout relativeLayout) {
        try {
            RelativeLayout relativeLayout2 = this.B;
            if (relativeLayout2 != null) {
                ((ImageView) relativeLayout2.findViewById(R.id.imageView)).setImageResource(0);
                RelativeLayout relativeLayout3 = this.B;
                kotlin.jvm.internal.i.d(relativeLayout3);
                relativeLayout3.setBackgroundColor(0);
                RelativeLayout relativeLayout4 = this.B;
                kotlin.jvm.internal.i.d(relativeLayout4);
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                ((RobertoTextView) relativeLayout4.findViewById(R.id.textView)).setTextColor(g0.a.b(activity, R.color.unselected_row_text));
            }
            this.B = relativeLayout;
            ((RobertoTextView) relativeLayout.findViewById(R.id.textView)).setTextColor(-1);
            RelativeLayout relativeLayout5 = this.B;
            kotlin.jvm.internal.i.d(relativeLayout5);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            relativeLayout5.setBackgroundColor(g0.a.b(activity2, R.color.selected_row));
            RelativeLayout relativeLayout6 = this.B;
            kotlin.jvm.internal.i.d(relativeLayout6);
            ((ImageView) relativeLayout6.findViewById(R.id.imageView)).setImageResource(R.drawable.ic_right);
            RelativeLayout relativeLayout7 = this.B;
            kotlin.jvm.internal.i.d(relativeLayout7);
            ((ImageView) relativeLayout7.findViewById(R.id.imageView)).setColorFilter(Q().getResources().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "Exception", e10);
        }
    }

    public final void h0(String str, String str2) {
        try {
            m0(str);
            n0(str2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "Exception", e10);
        }
    }

    public final void j0(String str, ArrayList arrayList, String str2) {
        try {
            kotlin.jvm.internal.i.e(str2, "null cannot be cast to non-null type kotlin.String");
            n0(str2);
            ((ScrollView) _$_findCachedViewById(R.id.scrollviewSub)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R.id.llS5List)).removeAllViews();
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS5List)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            View view = (ConstraintLayout) inflate;
            kotlin.jvm.internal.i.e(str, "null cannot be cast to non-null type kotlin.String");
            ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).setText(str);
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.margin_32);
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
            LogHelper.INSTANCE.e(this.f19447u, "exception", e10);
        }
    }

    public final void k0() {
        rr.b p3Var;
        String str;
        try {
            if (this.f19452z >= this.f19449w.size()) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                HashMap<String, Object> C0 = ((TemplateActivity) activity).C0();
                C0.put("headings", this.f19449w);
                C0.put("list", this.f19450x);
                C0.put("s45_37_user_list", this.f19450x);
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                TemplateActivity templateActivity = (TemplateActivity) activity2;
                if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s142") && this.f19451y.containsKey("s143b_heading")) {
                    templateActivity.s0(new q5());
                    return;
                } else if (this.f19451y.containsKey("r6_heading")) {
                    if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                        Goal y02 = templateActivity.y0();
                        if (y02 != null) {
                            str = y02.getGoalId();
                        } else {
                            str = null;
                        }
                        if (kotlin.jvm.internal.i.b(str, "GOorgabeKajhZhtBwFqL")) {
                            templateActivity.I0();
                        }
                    }
                    if (templateActivity.F0()) {
                        p3Var = new s3();
                    } else {
                        p3Var = new p3();
                    }
                    templateActivity.s0(p3Var);
                    return;
                } else {
                    return;
                }
            }
            ((ScrollView) _$_findCachedViewById(R.id.scrollView)).setVisibility(8);
            ((RelativeLayout) _$_findCachedViewById(R.id.linearLayoutAdd)).setVisibility(8);
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setVisibility(8);
            ((ScrollView) _$_findCachedViewById(R.id.scrollviewSub)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(this.f19449w.get(this.f19452z));
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setVisibility(0);
            String str2 = this.A;
            switch (str2.hashCode()) {
                case 112151:
                    if (!str2.equals("s37")) {
                        break;
                    } else {
                        int i6 = this.f19452z;
                        if (i6 != 0) {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 == 3) {
                                        j0(UtilFunKt.paramsMapToString(this.f19451y.get("s37_four_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s37_four_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s37_four_placeholder")));
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s37_three_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s37_three_placeholder")));
                                    break;
                                }
                            } else {
                                U("s37_two_list", UtilFunKt.paramsMapToString(this.f19451y.get("s37_two_placeholder")), "s37_two_search_list");
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s37_one_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s37_one_placeholder")));
                            break;
                        }
                    }
                case 112180:
                    if (!str2.equals("s45")) {
                        break;
                    } else {
                        int i10 = this.f19452z;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    j0(UtilFunKt.paramsMapToString(this.f19451y.get("s45_three_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s45_three_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s45_three_placeholder")));
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s45_two_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s45_two_placeholder")));
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s45_one_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s45_one_placeholder")));
                            break;
                        }
                    }
                case 112207:
                    if (!str2.equals("s51")) {
                        break;
                    } else {
                        int i11 = this.f19452z;
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 == 3) {
                                        h0(UtilFunKt.paramsMapToString(this.f19451y.get("s51_four_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s51_four_placeholder")));
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s51_three_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s51_three_placeholder")));
                                    break;
                                }
                            } else {
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s51_two_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s51_two_placeholder")));
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s51_one_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s51_one_placeholder")));
                            break;
                        }
                    }
                case 112211:
                    if (!str2.equals("s55")) {
                        break;
                    } else {
                        int i12 = this.f19452z;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3) {
                                        if (i12 != 4) {
                                            if (i12 == 5) {
                                                j0(UtilFunKt.paramsMapToString(this.f19451y.get("s55_six_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s55_six_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s55_six_placeholder")));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            j0(UtilFunKt.paramsMapToString(this.f19451y.get("s55_five_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s55_five_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s55_five_placeholder")));
                                            break;
                                        }
                                    } else {
                                        j0(UtilFunKt.paramsMapToString(this.f19451y.get("s55_four_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s55_four_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s55_four_placeholder")));
                                        break;
                                    }
                                } else {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s55_three_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s55_three_placeholder")));
                                    break;
                                }
                            } else {
                                U("s55_two_list", UtilFunKt.paramsMapToString(this.f19451y.get("s55_two_placeholder")), "s55_two_search_list");
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s55_one_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s55_one_placeholder")));
                            break;
                        }
                    }
                case 112212:
                    if (!str2.equals("s56")) {
                        break;
                    } else {
                        int i13 = this.f19452z;
                        if (i13 != 0) {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    if (i13 != 3) {
                                        if (i13 == 4) {
                                            j0(UtilFunKt.paramsMapToString(this.f19451y.get("s56_five_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s56_five_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s56_five_placeholder")));
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        j0(UtilFunKt.paramsMapToString(this.f19451y.get("s56_four_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s56_four_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s56_four_placeholder")));
                                        break;
                                    }
                                } else {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s56_three_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s56_three_placeholder")));
                                    break;
                                }
                            } else {
                                U("s56_two_list", UtilFunKt.paramsMapToString(this.f19451y.get("s56_two_placeholder")), "s56_two_search_list");
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s56_one_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s56_one_placeholder")));
                            break;
                        }
                    }
                case 3474660:
                    if (!str2.equals("s128")) {
                        break;
                    } else {
                        int i14 = this.f19452z;
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    if (i14 != 3) {
                                        if (i14 != 4) {
                                            if (i14 == 5) {
                                                j0(UtilFunKt.paramsMapToString(this.f19451y.get("s128_six_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s128_six_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s128_six_placeholder")));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            j0(UtilFunKt.paramsMapToString(this.f19451y.get("s128_five_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s128_five_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s128_five_placeholder")));
                                            break;
                                        }
                                    } else {
                                        j0(UtilFunKt.paramsMapToString(this.f19451y.get("s128_four_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s128_four_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s128_four_placeholder")));
                                        break;
                                    }
                                } else {
                                    j0(UtilFunKt.paramsMapToString(this.f19451y.get("s128_three_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s128_three_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s128_three_placeholder")));
                                    break;
                                }
                            } else {
                                j0(UtilFunKt.paramsMapToString(this.f19451y.get("s128_two_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s128_two_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s128_two_placeholder")));
                                break;
                            }
                        } else {
                            o0(UtilFunKt.paramsMapToString(this.f19451y.get("s128_one_description")), UtilFunKt.paramsMapToString(this.f19451y.get("s128_time_date_label")), UtilFunKt.paramsMapToString(this.f19451y.get("s128_time_default")));
                            break;
                        }
                    }
                case 3474661:
                    if (!str2.equals("s129")) {
                        break;
                    } else {
                        int i15 = this.f19452z;
                        if (i15 != 0) {
                            if (i15 != 1) {
                                if (i15 != 2) {
                                    if (i15 != 3) {
                                        if (i15 == 4) {
                                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s130_five_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s130_five_placeholder")));
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        h0(UtilFunKt.paramsMapToString(this.f19451y.get("s130_four_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s130_four_placeholder")));
                                        break;
                                    }
                                } else {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s130_three_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s130_three_placeholder")));
                                    break;
                                }
                            } else {
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s130_two_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s130_two_placeholder")));
                                break;
                            }
                        } else {
                            X();
                            break;
                        }
                    }
                case 3474691:
                    if (!str2.equals("s138")) {
                        break;
                    } else {
                        int i16 = this.f19452z;
                        if (i16 != 0) {
                            if (i16 != 1) {
                                if (i16 != 2) {
                                    if (i16 != 3) {
                                        if (i16 == 4) {
                                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s138_five_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s138_five_placeholder")));
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        h0(UtilFunKt.paramsMapToString(this.f19451y.get("s138_four_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s138_four_placeholder")));
                                        break;
                                    }
                                } else {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s138_three_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s138_three_placeholder")));
                                    break;
                                }
                            } else {
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s138_two_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s138_two_placeholder")));
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s138_one_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s138_one_placeholder")));
                            break;
                        }
                    }
                case 3474692:
                    if (!str2.equals("s139")) {
                        break;
                    } else {
                        int i17 = this.f19452z;
                        if (i17 != 0) {
                            if (i17 != 1) {
                                if (i17 != 2) {
                                    if (i17 == 3) {
                                        j0(UtilFunKt.paramsMapToString(this.f19451y.get("s139_four_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s139_four_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s139_four_placeholder")));
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    j0(UtilFunKt.paramsMapToString(this.f19451y.get("s139_three_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s139_three_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s139_three_placeholder")));
                                    break;
                                }
                            } else {
                                j0(UtilFunKt.paramsMapToString(this.f19451y.get("s139_two_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s139_two_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s139_two_placeholder")));
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s139_one_input_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s139_one_input_placeholder")));
                            break;
                        }
                    }
                case 3474714:
                    if (!str2.equals("s140")) {
                        break;
                    } else {
                        int i18 = this.f19452z;
                        if (i18 != 0) {
                            if (i18 != 1) {
                                if (i18 != 2) {
                                    if (i18 == 3) {
                                        j0(UtilFunKt.paramsMapToString(this.f19451y.get("s140_four_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s140_four_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s140_four_placeholder")));
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s140_three_input_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s140_three_input_placeholder")));
                                    break;
                                }
                            } else {
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s140_two_input_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s140_two_input_placeholder")));
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s140_one_input_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s140_one_input_placeholder")));
                            break;
                        }
                    }
                case 3474715:
                    if (!str2.equals("s141")) {
                        break;
                    } else {
                        switch (this.f19452z) {
                            case 0:
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s141_one_input_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s141_one_placeholder")));
                                break;
                            case 1:
                                U("s141_two_list", UtilFunKt.paramsMapToString(this.f19451y.get("s141_two_placeholder")), "s141_two_search_list");
                                break;
                            case 2:
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s141_three_input_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s141_three_placeholder")));
                                break;
                            case 3:
                                j0(UtilFunKt.paramsMapToString(this.f19451y.get("s141_four_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s141_four_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s141_four_placeholder")));
                                break;
                            case 4:
                                j0(UtilFunKt.paramsMapToString(this.f19451y.get("s141_five_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s141_five_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s141_five_placeholder")));
                                break;
                            case 5:
                                j0(UtilFunKt.paramsMapToString(this.f19451y.get("s141_six_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s141_six_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s141_six_placeholder")));
                                break;
                            case 6:
                                j0(UtilFunKt.paramsMapToString(this.f19451y.get("s141_seven_list_heading")), UtilFunKt.paramsMapToList(this.f19451y.get("s141_seven_list")), UtilFunKt.paramsMapToString(this.f19451y.get("s141_seven_placeholder")));
                                break;
                        }
                    }
                case 3474716:
                    if (!str2.equals("s142")) {
                        break;
                    } else {
                        int i19 = this.f19452z;
                        if (i19 != 0) {
                            if (i19 != 1) {
                                if (i19 == 2) {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s142_three_question")), UtilFunKt.paramsMapToString(this.f19451y.get("s142_three_placeholder")));
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s142_two_question")), UtilFunKt.paramsMapToString(this.f19451y.get("s142_two_placeholder")));
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s142_one_question")), UtilFunKt.paramsMapToString(this.f19451y.get("s142_one_placeholder")));
                            break;
                        }
                    }
                case 3474745:
                    if (!str2.equals("s150")) {
                        break;
                    } else {
                        int i20 = this.f19452z;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 != 2) {
                                    if (i20 != 3) {
                                        if (i20 != 4) {
                                            if (i20 == 5) {
                                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s150_six_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s150_six_placeholder")));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s150_five_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s150_five_placeholder")));
                                            break;
                                        }
                                    } else {
                                        h0(UtilFunKt.paramsMapToString(this.f19451y.get("s150_four_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s150_four_placeholder")));
                                        break;
                                    }
                                } else {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s150_three_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s150_three_placeholder")));
                                    break;
                                }
                            } else {
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s150_two_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s150_two_placeholder")));
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s150_one_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s150_one_placeholder")));
                            break;
                        }
                    }
                case 3474746:
                    if (!str2.equals("s151")) {
                        break;
                    } else {
                        int i21 = this.f19452z;
                        if (i21 != 0) {
                            if (i21 != 1) {
                                if (i21 == 2) {
                                    U("s151_three_input_list", UtilFunKt.paramsMapToString(this.f19451y.get("s151_three_input_placeholder")), "s151_three_search_list");
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s150_two_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s150_two_placeholder")));
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s150_one_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s150_one_placeholder")));
                            break;
                        }
                    }
                case 3474747:
                    if (!str2.equals("s152")) {
                        break;
                    } else {
                        int i22 = this.f19452z;
                        if (i22 != 0) {
                            if (i22 != 1) {
                                if (i22 != 2) {
                                    if (i22 != 3) {
                                        if (i22 == 4) {
                                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s152_five_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s152_five_placeholder")));
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        h0(UtilFunKt.paramsMapToString(this.f19451y.get("s152_four_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s152_four_placeholder")));
                                        break;
                                    }
                                } else {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s152_three_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s152_three_placeholder")));
                                    break;
                                }
                            } else {
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s152_two_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s152_two_placeholder")));
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s152_one_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s152_one_placeholder")));
                            break;
                        }
                    }
                case 3474749:
                    if (!str2.equals("s154")) {
                        break;
                    } else {
                        int i23 = this.f19452z;
                        if (i23 != 0) {
                            if (i23 != 1) {
                                if (i23 != 2) {
                                    if (i23 == 3) {
                                        h0(UtilFunKt.paramsMapToString(this.f19451y.get("s154_four_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s154_four_placeholder")));
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    h0(UtilFunKt.paramsMapToString(this.f19451y.get("s154_three_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s154_three_placeholder")));
                                    break;
                                }
                            } else {
                                h0(UtilFunKt.paramsMapToString(this.f19451y.get("s154_two_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s154_two_placeholder")));
                                break;
                            }
                        } else {
                            h0(UtilFunKt.paramsMapToString(this.f19451y.get("s154_one_sub_heading")), UtilFunKt.paramsMapToString(this.f19451y.get("s154_one_placeholder")));
                            break;
                        }
                    }
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) _$_findCachedViewById(R.id.progressBar), Constants.SCREEN_PROGRESS, ((ProgressBar) _$_findCachedViewById(R.id.progressBar)).getProgress(), ((this.f19452z + 1) * 100) / this.f19449w.size());
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "Exception", e10);
        }
    }

    public final void m0(String str) {
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setText(str);
            ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setVisibility(0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "exception", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:3:0x0003, B:5:0x0021, B:7:0x002d, B:13:0x0039, B:14:0x0048), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(String str) {
        boolean z10;
        try {
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setHint(str);
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setVisibility(0);
            if (this.f19452z < this.f19450x.size()) {
                String str2 = this.f19450x.get(this.f19452z);
                if (str2 != null && str2.length() != 0) {
                    z10 = false;
                    if (!z10) {
                        ((RobertoEditText) _$_findCachedViewById(R.id.editText)).post(new y7(this, 0));
                        return;
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).post(new y7(this, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "Exception", e10);
        }
    }

    public final void o0(String str, String str2, String str3) {
        Calendar calendar = this.C;
        String str4 = this.f19447u;
        try {
            this.D = str2;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
            try {
                if (!this.F) {
                    calendar.setTime(simpleDateFormat.parse(UtilFunKt.paramsMapToString(str3)));
                    calendar.set(Calendar.getInstance().get(1), Calendar.getInstance().get(2), Calendar.getInstance().get(5));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str4, "exception", e10);
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvTimeInput)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvTimeInput)).setOnClickListener(new x7(this, 0));
            c0();
            m0(str);
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str4, "exception", e11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_s45_and_s37, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.J.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Object obj;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            this.f19452z = 0;
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            b0((TemplateActivity) activity);
            this.f19451y = Q().A0();
            this.A = Q().B0();
            Goal y02 = Q().y0();
            if (y02 != null) {
                str = y02.getGoalId();
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.i.b(str, "GOorgabeKajhZhtBwFqL")) {
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                if (Q().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(Q().getIntent().getStringExtra("source"), "goals")) {
                    ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
                }
            }
            if (Q().E0() && Q().C0().containsKey("s45_37_user_list")) {
                Object obj2 = Q().C0().get("s45_37_user_list");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                this.f19450x = (ArrayList) obj2;
                if (kotlin.jvm.internal.i.b(this.A, "s128")) {
                    this.C.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm a").parse(UtilFunKt.paramsMapToString(this.f19450x.get(0))));
                    this.F = true;
                }
            }
            String str2 = this.A;
            switch (str2.hashCode()) {
                case 112151:
                    if (str2.equals("s37")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s37_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s37_btn_two_text")));
                        this.H = UtilFunKt.paramsMapToString(this.f19451y.get("s37_error_input"));
                        this.I = UtilFunKt.paramsMapToString(this.f19451y.get("s37_error_selection"));
                        obj = this.f19451y.get("s37_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 112180:
                    if (str2.equals("s45")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s45_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s45_btn_two_text")));
                        this.H = UtilFunKt.paramsMapToString(this.f19451y.get("s45_error"));
                        obj = this.f19451y.get("s45_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 112207:
                    if (str2.equals("s51")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s51_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s51_btn_two_text")));
                        obj = this.f19451y.get("s51_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 112211:
                    if (str2.equals("s55")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s55_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s55_btn_two_text")));
                        this.H = UtilFunKt.paramsMapToString(this.f19451y.get("s55_error_input"));
                        this.I = UtilFunKt.paramsMapToString(this.f19451y.get("s55_error_selection"));
                        obj = this.f19451y.get("s55_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 112212:
                    if (str2.equals("s56")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s56_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s56_btn_two_text")));
                        obj = this.f19451y.get("s56_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474660:
                    if (str2.equals("s128")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s128_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s128_btn_two_text")));
                        obj = this.f19451y.get("s128_heading_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474661:
                    if (str2.equals("s129")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s130_btn_text")));
                        obj = this.f19451y.get("s130_one_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474691:
                    if (str2.equals("s138")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s138_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s138_btn_two_text")));
                        this.H = UtilFunKt.paramsMapToString(this.f19451y.get("s138_error_input"));
                        obj = this.f19451y.get("s138_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474692:
                    if (str2.equals("s139")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s139_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s139_btn_two_text")));
                        obj = this.f19451y.get("s139_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474714:
                    if (str2.equals("s140")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s140_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s140_btn_two_text")));
                        this.H = UtilFunKt.paramsMapToString(this.f19451y.get("s140_error_input"));
                        obj = this.f19451y.get("s140_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474715:
                    if (str2.equals("s141")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s141_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s141_btn_two_text")));
                        this.H = UtilFunKt.paramsMapToString(this.f19451y.get("s141_error_input"));
                        this.I = UtilFunKt.paramsMapToString(this.f19451y.get("s141_error_selection"));
                        obj = this.f19451y.get("s141_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474716:
                    if (str2.equals("s142")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s142_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s142_btn_two_text")));
                        obj = this.f19451y.get("s142_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474745:
                    if (str2.equals("s150")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s150_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s150_btn_two_text")));
                        obj = this.f19451y.get("s150_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474746:
                    if (str2.equals("s151")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s151_one_btn_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s151_two_btn_text")));
                        obj = this.f19451y.get("s151_heading_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474747:
                    if (str2.equals("s152")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s152_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s152_btn_two_text")));
                        obj = this.f19451y.get("s152_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                case 3474749:
                    if (str2.equals("s154")) {
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s154_btn_one_text")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19451y.get("s154_btn_two_text")));
                        obj = this.f19451y.get("s154_question_list");
                        break;
                    } else {
                        obj = this.f19451y.get("headings");
                        break;
                    }
                default:
                    obj = this.f19451y.get("headings");
                    break;
            }
            this.f19449w = UtilFunKt.paramsMapToList(obj);
            k0();
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new x7(this, 1));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new x7(this, 2));
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).addTextChangedListener(new a());
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).setOnFocusChangeListener(new dc.b(11, this));
            ((ImageButton) _$_findCachedViewById(R.id.textAdd)).setOnClickListener(new x7(this, 3));
            ((RobertoEditText) _$_findCachedViewById(R.id.editTextAdd)).setOnEditorActionListener(new dl.w(12, this));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new x7(this, 4));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new x7(this, 5));
            if (!kotlin.jvm.internal.i.b(this.A, "s152") && !kotlin.jvm.internal.i.b(this.A, "s150")) {
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                return;
            }
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new x7(this, 6));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19447u, "exception", e10);
        }
    }

    /* compiled from: ScreenS45AndS37Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            z7 z7Var = z7.this;
            if (String.valueOf(((RobertoEditText) z7Var._$_findCachedViewById(R.id.editTextAdd)).getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) z7Var._$_findCachedViewById(R.id.textAdd)).setVisibility(0);
            } else {
                ((ImageButton) z7Var._$_findCachedViewById(R.id.textAdd)).setVisibility(4);
            }
            String lowerCase = String.valueOf(((RobertoEditText) z7Var._$_findCachedViewById(R.id.editTextAdd)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            try {
                int childCount = ((LinearLayout) z7Var._$_findCachedViewById(R.id.linearLayout2)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = ((LinearLayout) z7Var._$_findCachedViewById(R.id.linearLayout2)).getChildAt(i12);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.tvLabelSearch)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        childAt.setVisibility(0);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(z7Var.f19447u, "exception", e10);
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
