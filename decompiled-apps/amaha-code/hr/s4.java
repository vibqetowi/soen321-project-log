package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewpager.widget.ViewPager;
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
/* compiled from: ScreenS114Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/s4;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s4 extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f19143z = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f19145v;

    /* renamed from: x  reason: collision with root package name */
    public ek.i f19147x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f19148y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19144u = LogHelper.INSTANCE.makeLogTag(s4.class);

    /* renamed from: w  reason: collision with root package name */
    public HashMap<String, Object> f19146w = new HashMap<>();

    @Override // rr.b
    public final boolean I() {
        int i6 = this.f19145v;
        if (i6 > 0) {
            this.f19145v = i6 - 1;
            K();
            return false;
        }
        return true;
    }

    public final void J(ArrayList<String> arrayList) {
        ((LinearLayout) _$_findCachedViewById(R.id.llS114List)).removeAllViews();
        try {
            Iterator<String> it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                i6++;
                View inflate = getLayoutInflater().inflate(R.layout.row_screen_s3, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llS114List)), false);
                ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText(String.valueOf(i6));
                ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText(it.next());
                ((LinearLayout) _$_findCachedViewById(R.id.llS114List)).addView(inflate);
            }
            ((ScrollView) _$_findCachedViewById(R.id.s114ScrollView)).scrollTo(0, 0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19144u, "exception", e10);
        }
    }

    public final void K() {
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            int i6 = this.f19145v;
            if (i6 >= 5) {
                templateActivity.t0();
                return;
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.tvS114Header)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_five_heading")));
                                ((RobertoTextView) _$_findCachedViewById(R.id.tvS114Description)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_five_description")));
                                J(UtilFunKt.paramsMapToList(this.f19146w.get("s114_five_list")));
                            }
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvS114Header)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_four_heading")));
                            ((RobertoTextView) _$_findCachedViewById(R.id.tvS114Description)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_four_description")));
                            J(UtilFunKt.paramsMapToList(this.f19146w.get("s114_four_list")));
                        }
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS114Header)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_three_heading")));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tvS114Description)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_three_description")));
                        J(UtilFunKt.paramsMapToList(this.f19146w.get("s114_three_list")));
                    }
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS114Header)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_two_heading")));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS114Description)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_two_description")));
                    J(UtilFunKt.paramsMapToList(this.f19146w.get("s114_two_list")));
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS114Header)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_one_heading")));
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS114Description)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_one_description")));
                J(UtilFunKt.paramsMapToList(this.f19146w.get("s114_one_list")));
            }
            if (this.f19145v < 5) {
                ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).v(this.f19145v);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19144u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f19148y;
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
        return inflater.inflate(R.layout.fragment_screen_s114, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19148y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(4);
        this.f19146w = ((TemplateActivity) activity).A0();
        ((RobertoButton) _$_findCachedViewById(R.id.btnS114Button)).setText(UtilFunKt.paramsMapToString(this.f19146w.get("s114_btn_text")));
        K();
        ((RobertoButton) _$_findCachedViewById(R.id.btnS114Button)).setOnClickListener(new z0(this, 15));
        this.f19147x = new ek.i(this, 5);
        ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).setOffscreenPageLimit(5);
        ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).setAdapter(this.f19147x);
        ek.i iVar = this.f19147x;
        if (iVar != null) {
            iVar.k();
        }
        ek.i iVar2 = this.f19147x;
        kotlin.jvm.internal.i.d(iVar2);
        ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).b(iVar2);
        ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).setOnTouchListener(new w5.h0(14));
    }
}
