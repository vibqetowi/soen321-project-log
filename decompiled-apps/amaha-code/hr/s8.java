package hr;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS68Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/s8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s8 extends rr.b {
    public static final /* synthetic */ int C = 0;
    public View A;

    /* renamed from: y  reason: collision with root package name */
    public int f19173y;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19169u = LogHelper.INSTANCE.makeLogTag(s8.class);

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f19170v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f19171w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, Object> f19172x = new HashMap<>();

    /* renamed from: z  reason: collision with root package name */
    public String f19174z = "";

    /* compiled from: ScreenS68Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f19177u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ s8 f19178v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList<String> arrayList, s8 s8Var) {
            super(1);
            this.f19177u = arrayList;
            this.f19178v = s8Var;
        }

        @Override // ss.l
        public final hs.k invoke(Integer num) {
            int intValue = num.intValue();
            ArrayList<String> arrayList = this.f19177u;
            if (intValue < arrayList.size()) {
                ((RobertoTextView) this.f19178v._$_findCachedViewById(R.id.seekbarText)).setText(arrayList.get(intValue));
            }
            return hs.k.f19476a;
        }
    }

    @Override // rr.b
    public final boolean I() {
        int i6 = this.f19173y;
        if (i6 > 0) {
            this.f19173y = i6 - 1;
            Q();
            return false;
        }
        return true;
    }

    public final boolean J() {
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
        if (this.f19173y < this.f19171w.size()) {
            this.f19171w.set(this.f19173y, String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText()));
        } else {
            this.f19171w.add(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.editText)).getText()));
        }
        return true;
    }

    public final BitmapDrawable K(int i6) {
        View findViewById = M().findViewById(R.id.tvProgress);
        kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(i6 + "");
        M().measure(0, 0);
        Bitmap createBitmap = Bitmap.createBitmap(M().getMeasuredWidth(), M().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        M().layout(0, 0, M().getMeasuredWidth(), M().getMeasuredHeight());
        M().draw(canvas);
        return new BitmapDrawable(getResources(), createBitmap);
    }

    public final View M() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.i.q("thumbView");
        throw null;
    }

    public final void O(ArrayList<String> arrayList) {
        try {
            b bVar = new b(arrayList, this);
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.seekBar1)).setMax(arrayList.size() - 1);
            if (this.f19171w.size() > 1) {
                String str = this.f19171w.get(1);
                kotlin.jvm.internal.i.f(str, "answers[1]");
                ((AppCompatSeekBar) _$_findCachedViewById(R.id.seekBar1)).setProgress(Integer.parseInt(str));
            }
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.seekBar1)).setThumb(K(((AppCompatSeekBar) _$_findCachedViewById(R.id.seekBar1)).getProgress()));
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.seekBar1)).setOnSeekBarChangeListener(new a(bVar));
            bVar.invoke(Integer.valueOf(((AppCompatSeekBar) _$_findCachedViewById(R.id.seekBar1)).getProgress()));
            ((RobertoTextView) _$_findCachedViewById(R.id.seekbarText)).setVisibility(0);
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.seekBar1)).setVisibility(0);
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.seekBar1)).setProgress(0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19169u, "exception", e10);
        }
    }

    public final void P(String str, ArrayList<String> arrayList, String str2) {
        try {
            S(str2);
            ((ScrollView) _$_findCachedViewById(R.id.scrollView2)).setVisibility(0);
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).removeAllViews();
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            ((RobertoTextView) constraintLayout.findViewById(R.id.tvSingleLine)).setText(str);
            ViewGroup.LayoutParams layoutParams = ((RobertoTextView) constraintLayout.findViewById(R.id.tvSingleLine)).getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            aVar.setMargins(0, 0, 0, 0);
            ((RobertoTextView) constraintLayout.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar);
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).addView(constraintLayout);
            Iterator<String> it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                i6++;
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate2 = activity2.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)), false);
                kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate2;
                ((RobertoTextView) constraintLayout2.findViewById(R.id.tvSingleLine)).setText(i6 + ". " + it.next());
                ViewGroup.LayoutParams layoutParams2 = ((RobertoTextView) constraintLayout2.findViewById(R.id.tvSingleLine)).getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ConstraintLayout.a) layoutParams2).setMargins(0, 0, 0, 0);
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout2)).addView(constraintLayout2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19169u, "exception", e10);
        }
    }

    public final void Q() {
        rr.b e4Var;
        rr.b p3Var;
        String str = this.f19169u;
        try {
            if (this.f19173y >= this.f19170v.size()) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                HashMap<String, Object> hashMap = ((TemplateActivity) activity).F;
                hashMap.put("headings", this.f19170v);
                hashMap.put("list", this.f19171w);
                if (kotlin.jvm.internal.i.b(this.f19174z, "s68")) {
                    if (this.f19172x.containsKey("r6_heading")) {
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        TemplateActivity templateActivity = (TemplateActivity) activity2;
                        androidx.fragment.app.p activity3 = getActivity();
                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        if (((TemplateActivity) activity3).W) {
                            p3Var = new s3();
                        } else {
                            p3Var = new p3();
                        }
                        templateActivity.s0(p3Var);
                        return;
                    }
                    return;
                } else if (kotlin.jvm.internal.i.b(this.f19174z, "s144") && this.f19172x.containsKey("r9_heading")) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateActivity templateActivity2 = (TemplateActivity) activity4;
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (((TemplateActivity) activity5).W) {
                        e4Var = new g4();
                    } else {
                        e4Var = new e4();
                    }
                    templateActivity2.s0(e4Var);
                    return;
                } else {
                    return;
                }
            }
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.seekBar1)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.seekbarText)).setVisibility(8);
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setVisibility(8);
            ((ScrollView) _$_findCachedViewById(R.id.scrollView2)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setText(this.f19170v.get(this.f19173y));
            ((RobertoTextView) _$_findCachedViewById(R.id.question)).setVisibility(0);
            String str2 = this.f19174z;
            if (kotlin.jvm.internal.i.b(str2, "s68")) {
                int i6 = this.f19173y;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                P(UtilFunKt.paramsMapToString(this.f19172x.get("s68_four_list_heading")), UtilFunKt.paramsMapToList(this.f19172x.get("s68_four_list")), UtilFunKt.paramsMapToString(this.f19172x.get("s68_four_placeholder")));
                            }
                        } else {
                            P(UtilFunKt.paramsMapToString(this.f19172x.get("s68_three_list_heading")), UtilFunKt.paramsMapToList(this.f19172x.get("s68_three_list")), UtilFunKt.paramsMapToString(this.f19172x.get("s68_three_placeholder")));
                        }
                    } else {
                        O(UtilFunKt.paramsMapToList(this.f19172x.get("s68_two_slider_scale_list")));
                    }
                } else {
                    P(UtilFunKt.paramsMapToString(this.f19172x.get("s68_one_list_heading")), UtilFunKt.paramsMapToList(this.f19172x.get("s68_one_list")), UtilFunKt.paramsMapToString(this.f19172x.get("s68_one_placeholder")));
                }
            } else if (kotlin.jvm.internal.i.b(str2, "s144")) {
                int i10 = this.f19173y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        O(UtilFunKt.paramsMapToList(this.f19172x.get("s144_two_slider_scale_list")));
                    }
                } else {
                    String paramsMapToString = UtilFunKt.paramsMapToString(this.f19172x.get("s144_one_input_heading"));
                    String paramsMapToString2 = UtilFunKt.paramsMapToString(this.f19172x.get("s144_one_input_placeholder"));
                    try {
                        try {
                            ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setText(paramsMapToString);
                            ((RobertoTextView) _$_findCachedViewById(R.id.subHeading)).setVisibility(0);
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(str, "exception", e10);
                        }
                        S(paramsMapToString2);
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(str, "Exception", e11);
                    }
                }
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt((ProgressBar) _$_findCachedViewById(R.id.progressBar), Constants.SCREEN_PROGRESS, ((ProgressBar) _$_findCachedViewById(R.id.progressBar)).getProgress(), ((this.f19173y + 1) * 100) / this.f19170v.size());
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.start();
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str, "Exception", e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:3:0x0003, B:5:0x0021, B:7:0x002d, B:13:0x0039, B:14:0x0048), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(String str) {
        boolean z10;
        try {
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setHint(str);
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).setVisibility(0);
            if (this.f19173y < this.f19171w.size()) {
                String str2 = this.f19171w.get(this.f19173y);
                if (str2 != null && str2.length() != 0) {
                    z10 = false;
                    if (!z10) {
                        ((RobertoEditText) _$_findCachedViewById(R.id.editText)).post(new Runnable(this) { // from class: hr.p8

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ s8 f18978v;

                            {
                                this.f18978v = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i6 = r2;
                                s8 this$0 = this.f18978v;
                                switch (i6) {
                                    case 0:
                                        int i10 = s8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).setText(this$0.f19171w.get(this$0.f19173y));
                                        return;
                                    default:
                                        int i11 = s8.C;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).setText("");
                                        return;
                                }
                            }
                        });
                        return;
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            ((RobertoEditText) _$_findCachedViewById(R.id.editText)).post(new Runnable(this) { // from class: hr.p8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ s8 f18978v;

                {
                    this.f18978v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = r2;
                    s8 this$0 = this.f18978v;
                    switch (i6) {
                        case 0:
                            int i10 = s8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).setText(this$0.f19171w.get(this$0.f19173y));
                            return;
                        default:
                            int i11 = s8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).setText("");
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19169u, "Exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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
        return inflater.inflate(R.layout.fragment_screen_s68, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [T, com.theinnerhour.b2b.activity.TemplateActivity] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> arrayList;
        rr.b p3Var;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            String str = null;
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.seekbar_thumb, (ViewGroup) null, false);
            kotlin.jvm.internal.i.f(inflate, "from(activity).inflate(R…ekbar_thumb, null, false)");
            this.A = inflate;
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ?? r72 = (TemplateActivity) activity;
            xVar.f23469u = r72;
            this.f19172x = r72.A0();
            this.f19174z = ((TemplateActivity) xVar.f23469u).B0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity2).Q && kotlin.jvm.internal.i.b(this.f19174z, "s68")) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                TemplateModel templateModel = ((TemplateActivity) activity3).f10547y;
                if (templateModel != null) {
                    str = templateModel.getLabel();
                }
                if (kotlin.jvm.internal.i.b(str, "yS4DnoGWa2k9hfWdM7bI")) {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity4).Q = false;
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity5).I = false;
                } else {
                    androidx.fragment.app.p activity6 = getActivity();
                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateActivity templateActivity = (TemplateActivity) activity6;
                    if (((TemplateActivity) xVar.f23469u).W) {
                        p3Var = new s3();
                    } else {
                        p3Var = new p3();
                    }
                    templateActivity.s0(p3Var);
                }
            }
            this.f19173y = 0;
            String str2 = this.f19174z;
            if (kotlin.jvm.internal.i.b(str2, "s68")) {
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19172x.get("s68_btn_two_text")));
                UtilFunKt.paramsMapToString(this.f19172x.get("s68_error_input"));
                arrayList = UtilFunKt.paramsMapToList(this.f19172x.get("s68_question_list"));
            } else if (kotlin.jvm.internal.i.b(str2, "s144")) {
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText(UtilFunKt.paramsMapToString(this.f19172x.get("s144_one_btn_two_text")));
                UtilFunKt.paramsMapToString(this.f19172x.get("s144_error"));
                arrayList = UtilFunKt.paramsMapToList(this.f19172x.get("s144_heading_list"));
            } else {
                arrayList = new ArrayList<>();
            }
            this.f19170v = arrayList;
            T t3 = xVar.f23469u;
            if (((TemplateActivity) t3).J && ((TemplateActivity) t3).F.containsKey("list")) {
                Object obj = ((TemplateActivity) xVar.f23469u).F.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                this.f19171w = (ArrayList) obj;
            }
            Q();
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.q8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ s8 f19039v;

                {
                    this.f19039v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean b10;
                    int i6 = r2;
                    s8 this$0 = this.f19039v;
                    switch (i6) {
                        case 0:
                            int i10 = s8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                String str3 = this$0.f19174z;
                                if (kotlin.jvm.internal.i.b(str3, "s68")) {
                                    b10 = true;
                                } else {
                                    b10 = kotlin.jvm.internal.i.b(str3, "s144");
                                }
                                if (b10) {
                                    if (this$0.f19173y == 1) {
                                        if (this$0.f19171w.size() > 1) {
                                            this$0.f19171w.set(1, String.valueOf(((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.seekBar1)).getProgress()));
                                        } else {
                                            this$0.f19171w.add(String.valueOf(((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.seekBar1)).getProgress()));
                                        }
                                        this$0.f19173y++;
                                        this$0.Q();
                                        return;
                                    } else if (this$0.J()) {
                                        this$0.f19173y++;
                                        this$0.Q();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f19169u, "Exception", e10);
                                return;
                            }
                        default:
                            int i11 = s8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(10, this$0);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new r8(0, xVar));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.q8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ s8 f19039v;

                {
                    this.f19039v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean b10;
                    int i6 = r2;
                    s8 this$0 = this.f19039v;
                    switch (i6) {
                        case 0:
                            int i10 = s8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                String str3 = this$0.f19174z;
                                if (kotlin.jvm.internal.i.b(str3, "s68")) {
                                    b10 = true;
                                } else {
                                    b10 = kotlin.jvm.internal.i.b(str3, "s144");
                                }
                                if (b10) {
                                    if (this$0.f19173y == 1) {
                                        if (this$0.f19171w.size() > 1) {
                                            this$0.f19171w.set(1, String.valueOf(((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.seekBar1)).getProgress()));
                                        } else {
                                            this$0.f19171w.add(String.valueOf(((AppCompatSeekBar) this$0._$_findCachedViewById(R.id.seekBar1)).getProgress()));
                                        }
                                        this$0.f19173y++;
                                        this$0.Q();
                                        return;
                                    } else if (this$0.J()) {
                                        this$0.f19173y++;
                                        this$0.Q();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f19169u, "Exception", e10);
                                return;
                            }
                        default:
                            int i11 = s8.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(10, this$0);
                            a1Var.b();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19169u, "exception", e10);
        }
    }

    /* compiled from: ScreenS68Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ss.l<Integer, hs.k> f19176b;

        public a(b bVar) {
            this.f19176b = bVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
            s8 s8Var = s8.this;
            ((AppCompatSeekBar) s8Var._$_findCachedViewById(R.id.seekBar1)).setThumb(s8Var.K(i6));
            this.f19176b.invoke(Integer.valueOf(i6));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
