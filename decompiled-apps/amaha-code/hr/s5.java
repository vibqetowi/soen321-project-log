package hr;

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
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
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
/* compiled from: ScreenS145Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/s5;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s5 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f19149x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f19152w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19150u = LogHelper.INSTANCE.makeLogTag(s5.class);

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f19151v = new ArrayList<>();

    @Override // rr.b
    public final boolean I() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.etS145Edit)).hasFocus()) {
            ((RobertoEditText) _$_findCachedViewById(R.id.etS145Edit)).clearFocus();
            UiUtils.Companion.showSearch(R.layout.fragment_screen_s145, (ConstraintLayout) _$_findCachedViewById(R.id.constraintRoot), getActivity());
            return false;
        }
        return true;
    }

    public final void J(String str) {
        try {
            if (!this.f19151v.contains(str)) {
                K(str);
                this.f19151v.add(str);
                ((ScrollView) _$_findCachedViewById(R.id.scrollview)).postDelayed(new tl.o(27, this), 500L);
            } else {
                I();
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                utils.showCustomToast(activity, "Item Already Exists");
            }
            M();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19150u, "exception", e10);
        }
    }

    public final void K(String str) {
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_textview_divider, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS145List)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) inflate;
            ((RobertoTextView) linearLayout.findViewById(R.id.tvLabelText)).setText(str);
            ((LinearLayout) _$_findCachedViewById(R.id.llS145List)).addView(linearLayout);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19150u, "exception in add RadioButton", e10);
        }
    }

    public final void M() {
        if (((RobertoEditText) _$_findCachedViewById(R.id.etS145Edit)).hasFocus()) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            RobertoEditText etS145Edit = (RobertoEditText) _$_findCachedViewById(R.id.etS145Edit);
            kotlin.jvm.internal.i.f(etS145Edit, "etS145Edit");
            ((TemplateActivity) activity).D0(context, etS145Edit);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19152w;
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
        return inflater.inflate(R.layout.fragment_screen_s145, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19152w.clear();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.theinnerhour.b2b.model.ScreenResult30Model, T] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new ScreenResult30Model(Utils.INSTANCE.getTimeInSeconds());
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS145Header)).setText(UtilFunKt.paramsMapToString(A0.get("s145_heading")));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS145Edit)).setHint(UtilFunKt.paramsMapToString(A0.get("s145_input_placeholder")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS145Button)).setText(UtilFunKt.paramsMapToString(A0.get("s145_btn_two_text")));
            if (templateActivity.J) {
                HashMap<String, Object> hashMap = templateActivity.F;
                if (hashMap.containsKey("s145_user_list")) {
                    Object obj = hashMap.get("s145_user_list");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ArrayList<String> arrayList = (ArrayList) obj;
                    this.f19151v = arrayList;
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        String tt2 = it.next();
                        kotlin.jvm.internal.i.f(tt2, "tt");
                        K(tt2);
                    }
                }
            }
            ((ImageButton) _$_findCachedViewById(R.id.imgTextAdd)).setOnClickListener(new z0(this, 22));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS145Edit)).setOnEditorActionListener(new dl.w(10, this));
            ((RobertoEditText) _$_findCachedViewById(R.id.etS145Edit)).addTextChangedListener(new a());
            ((RobertoEditText) _$_findCachedViewById(R.id.etS145Edit)).setOnFocusChangeListener(new dc.b(9, this));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS145Button)).setOnClickListener(new r5(this, xVar, templateActivity, 0));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new r5(this, xVar, templateActivity, 1));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new r5(xVar, this, templateActivity));
            if (templateActivity.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra("source"), "goals")) {
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 15));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19150u, "Exception in on view created", e10);
        }
    }

    /* compiled from: ScreenS145Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            s5 s5Var = s5.this;
            if (String.valueOf(((RobertoEditText) s5Var._$_findCachedViewById(R.id.etS145Edit)).getText()).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((ImageButton) s5Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(0);
            } else {
                ((ImageButton) s5Var._$_findCachedViewById(R.id.imgTextAdd)).setVisibility(8);
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
