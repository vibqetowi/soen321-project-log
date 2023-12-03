package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoCheckBox;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS89Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/k9;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k9 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18694x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18697w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18695u = LogHelper.INSTANCE.makeLogTag(k9.class);

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<String> f18696v = new ArrayList<>();

    public final void J(String str) {
        LayoutInflater layoutInflater;
        try {
            androidx.fragment.app.p activity = getActivity();
            View view = null;
            if (activity != null && (layoutInflater = activity.getLayoutInflater()) != null) {
                view = layoutInflater.inflate(R.layout.row_checkbox, (ViewGroup) null);
            }
            kotlin.jvm.internal.i.e(view, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoCheckBox");
            RobertoCheckBox robertoCheckBox = (RobertoCheckBox) view;
            robertoCheckBox.setText(str);
            robertoCheckBox.setOnCheckedChangeListener(new fl.m(this, 8, str));
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayoutScroll)).addView(robertoCheckBox);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18695u, "exception in add RadioButton", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18697w;
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
        return inflater.inflate(R.layout.fragment_screen_s89, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18697w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            HashMap<String, Object> A0 = ((TemplateActivity) activity).A0();
            if (A0.containsKey("list")) {
                Object obj = A0.get("list");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<java.util.HashMap<kotlin.String, kotlin.String>>{ kotlin.collections.TypeAliasesKt.ArrayList<java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }> }");
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    Object obj2 = ((HashMap) it.next()).get("list_key");
                    kotlin.jvm.internal.i.d(obj2);
                    J((String) obj2);
                }
            }
            ((TextView) _$_findCachedViewById(R.id.textAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.j9

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ k9 f18640v;

                {
                    this.f18640v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z10;
                    int i6 = r2;
                    k9 this$0 = this.f18640v;
                    switch (i6) {
                        case 0:
                            int i10 = k9.f18694x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String obj3 = ((EditText) this$0._$_findCachedViewById(R.id.editText)).getText().toString();
                            if (obj3 != null && obj3.length() != 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                return;
                            }
                            ((EditText) this$0._$_findCachedViewById(R.id.editText)).setText("");
                            this$0.J(obj3);
                            return;
                        default:
                            int i11 = k9.f18694x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity2).F.put("list", this$0.f18696v);
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).t0();
                            return;
                    }
                }
            });
            ((Button) _$_findCachedViewById(R.id.button6)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.j9

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ k9 f18640v;

                {
                    this.f18640v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z10;
                    int i6 = r2;
                    k9 this$0 = this.f18640v;
                    switch (i6) {
                        case 0:
                            int i10 = k9.f18694x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String obj3 = ((EditText) this$0._$_findCachedViewById(R.id.editText)).getText().toString();
                            if (obj3 != null && obj3.length() != 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Enter Text");
                                return;
                            }
                            ((EditText) this$0._$_findCachedViewById(R.id.editText)).setText("");
                            this$0.J(obj3);
                            return;
                        default:
                            int i11 = k9.f18694x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity2).F.put("list", this$0.f18696v);
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18695u, "exception in on view created", e10);
        }
    }
}
