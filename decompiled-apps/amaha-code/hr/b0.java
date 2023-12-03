package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenPopupFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/b0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18180w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18182v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18181u = LogHelper.INSTANCE.makeLogTag(b0.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18182v;
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
        return inflater.inflate(R.layout.fragment_screen_popup, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18182v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> paramsMapToList;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            String B0 = templateActivity.B0();
            switch (B0.hashCode()) {
                case 3615:
                    if (B0.equals("s2")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s2_popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s2_popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s2_popup_btn_text")));
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                    paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                    break;
                case 112088:
                    if (B0.equals("s16")) {
                        Object obj = templateActivity.F.get("prefix");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj;
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get(str.concat("help_heading"))));
                        ArrayList<String> paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get(str.concat("help_list")));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get(str.concat("help_btn_text"))));
                        paramsMapToList = paramsMapToList2;
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                case 112118:
                    if (B0.equals("s25")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s25_help_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s25_help_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s25_help_btn_text")));
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                case 112122:
                    if (B0.equals("s29")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s29_help_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s29_help_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s29_help_btn_text")));
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                case 112176:
                    if (B0.equals("s41")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s41_help_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s41_help_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s41_help_btn_text")));
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                case 3474626:
                    if (B0.equals("s115")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s115_popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s115_popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s115_help_btn_text")));
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                case 3474719:
                    if (B0.equals("s145")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s145_popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s145_popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s145_popup_btn_text")));
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                case 3474722:
                    if (B0.equals("s148")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s148_help_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s148_help_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s148_help_btn_text")));
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                case 3474745:
                    if (B0.equals("s150")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s150_popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s150_popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s150_popup_btn_text")));
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                case 3474747:
                    if (B0.equals("s152")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s152_popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s152_popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s152_popup_btn_text")));
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                case 3478763:
                    if (!B0.equals("s59b")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s60_popup_heading")));
                    paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s60_popup_list"));
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s60_popup_btn_text")));
                    break;
                case 107840108:
                    if (!B0.equals("s59-b")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                        paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                        break;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s60_popup_heading")));
                    paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s60_popup_list"));
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("s60_popup_btn_text")));
                    break;
                default:
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_heading")));
                    paramsMapToList = UtilFunKt.paramsMapToList(A0.get("popup_list"));
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText(UtilFunKt.paramsMapToString(A0.get("popup_btn_text")));
                    break;
            }
            Iterator<String> it = paramsMapToList.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate = activity2.getLayoutInflater().inflate(R.layout.row_screen_s3, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText(it.next());
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.a0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b0 f18120v;

                {
                    this.f18120v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b0 this$0 = this.f18120v;
                    switch (i6) {
                        case 0:
                            int i10 = b0.f18180w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            if (activity3 != null) {
                                activity3.onBackPressed();
                                return;
                            }
                            return;
                        default:
                            int i11 = b0.f18180w;
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
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_wrong);
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.a0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b0 f18120v;

                {
                    this.f18120v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b0 this$0 = this.f18120v;
                    switch (i6) {
                        case 0:
                            int i10 = b0.f18180w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            if (activity3 != null) {
                                activity3.onBackPressed();
                                return;
                            }
                            return;
                        default:
                            int i11 = b0.f18180w;
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
            LogHelper.INSTANCE.e(this.f18181u, "Exception", e10);
        }
    }
}
