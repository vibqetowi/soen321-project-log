package hr;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Screen136Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS136Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/k5;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k5 extends rr.b {
    public static final /* synthetic */ int B = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f18682v;

    /* renamed from: z  reason: collision with root package name */
    public View f18686z;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18681u = LogHelper.INSTANCE.makeLogTag(k5.class);

    /* renamed from: w  reason: collision with root package name */
    public HashMap<String, Object> f18683w = new HashMap<>();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<Screen136Model> f18684x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<Integer> f18685y = new ArrayList<>();

    @Override // rr.b
    public final boolean I() {
        int i6 = this.f18682v;
        if (i6 > 0) {
            this.f18682v = i6 - 1;
            O();
            return false;
        }
        return true;
    }

    public final BitmapDrawable J(int i6) {
        View findViewById = K().findViewById(R.id.tvProgress);
        kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(String.valueOf(i6));
        K().measure(0, 0);
        Bitmap createBitmap = Bitmap.createBitmap(K().getMeasuredWidth(), K().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        K().layout(0, 0, K().getMeasuredWidth(), K().getMeasuredHeight());
        K().draw(canvas);
        return new BitmapDrawable(getResources(), createBitmap);
    }

    public final View K() {
        View view = this.f18686z;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.i.q("thumbView");
        throw null;
    }

    public final void M() {
        try {
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.S136Seekbar)).setMax(10);
            ArrayList<Integer> arrayList = this.f18685y;
            if (arrayList.size() > this.f18682v) {
                Integer num = arrayList.get(this.f18682v);
                kotlin.jvm.internal.i.f(num, "ratingList[position]");
                ((AppCompatSeekBar) _$_findCachedViewById(R.id.S136Seekbar)).setProgress(num.intValue());
            } else {
                ((AppCompatSeekBar) _$_findCachedViewById(R.id.S136Seekbar)).setProgress(0);
            }
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.S136Seekbar)).setThumb(J(((AppCompatSeekBar) _$_findCachedViewById(R.id.S136Seekbar)).getProgress()));
            ((AppCompatSeekBar) _$_findCachedViewById(R.id.S136Seekbar)).setOnSeekBarChangeListener(new a());
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18681u, "exception", e10);
        }
    }

    public final void O() {
        String str;
        try {
            int i6 = this.f18682v;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            str = "";
                        } else {
                            str = "s136_heading_4";
                        }
                    } else {
                        str = "s136_heading_3";
                    }
                } else {
                    str = "s136_heading_2";
                }
            } else {
                str = "s136_heading_1";
            }
            M();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS136Heading)).setText(UtilFunKt.paramsMapToString(this.f18683w.get(str)));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18681u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.A;
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
        return inflater.inflate(R.layout.fragment_screen_s136, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            if (Utils.INSTANCE.getClearingFragmentBackStack()) {
                return;
            }
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.seekbar_thumb, (ViewGroup) null, false);
            kotlin.jvm.internal.i.f(inflate, "from(activity).inflate(R…ekbar_thumb, null, false)");
            this.f18686z = inflate;
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            this.f18683w = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS136Heading)).setText(UtilFunKt.paramsMapToString(this.f18683w.get("s136_heading_1")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS136Button)).setText(UtilFunKt.paramsMapToString(this.f18683w.get("s136_btn_one_text")));
            if (templateActivity.J) {
                templateActivity.F.containsKey("s136_user_data");
            }
            O();
            ((RobertoButton) _$_findCachedViewById(R.id.btnS136Button)).setOnClickListener(new z0(this, 20));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 11));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18681u, "exception", e10);
        }
    }

    /* compiled from: ScreenS136Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
            k5 k5Var = k5.this;
            ((AppCompatSeekBar) k5Var._$_findCachedViewById(R.id.S136Seekbar)).setThumb(k5Var.J(i6));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
