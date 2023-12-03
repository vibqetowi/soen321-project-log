package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS59Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/c8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c8 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18261w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18263v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18262u = LogHelper.INSTANCE.makeLogTag(c8.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18263v;
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
        return inflater.inflate(R.layout.fragment_screen_s59, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18263v.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r9.equals("s59") == false) goto L51;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str = "s59";
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            String B0 = templateActivity.B0();
            switch (B0.hashCode()) {
                case 112215:
                    break;
                case 3478763:
                    if (!B0.equals("s59b")) {
                        str = "";
                        break;
                    }
                    str = "s59b";
                    break;
                case 107840108:
                    if (!B0.equals("s59-b")) {
                        str = "";
                        break;
                    }
                    str = "s59b";
                    break;
                case 107840109:
                    if (B0.equals("s59-c")) {
                        str = "s59c";
                        break;
                    } else {
                        str = "";
                        break;
                    }
                default:
                    str = "";
                    break;
            }
            if (templateActivity.J) {
                HashMap<String, Object> hashMap = templateActivity.F;
                if (hashMap.containsKey("s59_user_data")) {
                    Object obj = hashMap.get("s59_user_data");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoEditText) _$_findCachedViewById(R.id.editText1)).setText((String) obj);
                }
            }
            if (A0.containsKey(str.concat("_heading"))) {
                Object obj2 = A0.get(str.concat("_heading"));
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText((String) obj2);
            }
            if (A0.containsKey(str.concat("_question"))) {
                Object obj3 = A0.get(str.concat("_question"));
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText((String) obj3);
            }
            if (A0.containsKey(str.concat("_input_heading"))) {
                Object obj4 = A0.get(str.concat("_input_heading"));
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText((String) obj4);
            }
            if (A0.containsKey(str.concat("_placeholder"))) {
                Object obj5 = A0.get(str.concat("_placeholder"));
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                ((RobertoEditText) _$_findCachedViewById(R.id.editText1)).setHint((String) obj5);
            }
            if (A0.containsKey(str.concat("_input_placeholder"))) {
                Object obj6 = A0.get(str.concat("_input_placeholder"));
                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                ((RobertoEditText) _$_findCachedViewById(R.id.editText1)).setHint((String) obj6);
            }
            if (A0.containsKey(str.concat("_btn_one_text"))) {
                Object obj7 = A0.get(str.concat("_btn_one_text"));
                kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText((String) obj7);
            }
            if (A0.containsKey(str.concat("_btn_two_text"))) {
                Object obj8 = A0.get(str.concat("_btn_two_text"));
                kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.String");
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText((String) obj8);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new i4(templateActivity, 29));
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new o4(11, this, A0, templateActivity));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new z0(this, 29));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 0));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18262u, "Exception in on view created ", e10);
        }
    }
}
