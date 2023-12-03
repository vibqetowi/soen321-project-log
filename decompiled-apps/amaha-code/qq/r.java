package qq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableRecommendFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/r;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class r extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f30064x = 0;

    /* renamed from: u  reason: collision with root package name */
    public Boolean f30065u;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f30067w = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f30066v = LogHelper.INSTANCE.makeLogTag(r.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30067w;
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
        return inflater.inflate(R.layout.fragment_screen_a15, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30067w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionPleasurableOptionHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionPleasurableOptionSubheader));
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a15ScrollView = (ScrollView) _$_findCachedViewById(R.id.a15ScrollView);
            kotlin.jvm.internal.i.f(a15ScrollView, "a15ScrollView");
            insetsUtils.addStatusBarHeight(a15ScrollView);
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
            final View inflate = getLayoutInflater().inflate(R.layout.row_screen_a15, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
            ((RobertoTextView) inflate.findViewById(R.id.rowText)).setText(getString(R.string.depressionPleasurableOptionAudio));
            ((AppCompatImageView) inflate.findViewById(R.id.rowImage)).setImageResource(R.drawable.ic_headphone_tip);
            ((RadioButton) inflate.findViewById(R.id.radioToggle)).setVisibility(8);
            ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
            final View inflate2 = getLayoutInflater().inflate(R.layout.row_screen_a15, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
            ((RobertoTextView) inflate2.findViewById(R.id.rowText)).setText(getString(R.string.depressionPleasurableOptionLetter));
            ((AppCompatImageView) inflate2.findViewById(R.id.rowImage)).setImageResource(R.drawable.ic_a18_pleasurable_message);
            ((RadioButton) inflate2.findViewById(R.id.radioToggle)).setVisibility(8);
            ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate2);
            inflate.setOnClickListener(new View.OnClickListener(this) { // from class: qq.q

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ r f30061v;

                {
                    this.f30061v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r4;
                    View view3 = inflate2;
                    View view4 = inflate;
                    r this$0 = this.f30061v;
                    switch (i6) {
                        case 0:
                            int i10 = r.f30064x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f30065u = Boolean.TRUE;
                            view4.setEnabled(false);
                            view3.setEnabled(true);
                            view4.setBackgroundResource(R.drawable.grey_rounded_corners_blue_stroke);
                            view3.setBackgroundResource(R.drawable.background_curved_grey_corner_5dp);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                            return;
                        default:
                            int i11 = r.f30064x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f30065u = Boolean.FALSE;
                            view4.setEnabled(false);
                            view3.setEnabled(true);
                            view4.setBackgroundResource(R.drawable.grey_rounded_corners_blue_stroke);
                            view3.setBackgroundResource(R.drawable.background_curved_grey_corner_5dp);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                            return;
                    }
                }
            });
            inflate2.setOnClickListener(new View.OnClickListener(this) { // from class: qq.q

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ r f30061v;

                {
                    this.f30061v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r4;
                    View view3 = inflate;
                    View view4 = inflate2;
                    r this$0 = this.f30061v;
                    switch (i6) {
                        case 0:
                            int i10 = r.f30064x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f30065u = Boolean.TRUE;
                            view4.setEnabled(false);
                            view3.setEnabled(true);
                            view4.setBackgroundResource(R.drawable.grey_rounded_corners_blue_stroke);
                            view3.setBackgroundResource(R.drawable.background_curved_grey_corner_5dp);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                            return;
                        default:
                            int i11 = r.f30064x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f30065u = Boolean.FALSE;
                            view4.setEnabled(false);
                            view3.setEnabled(true);
                            view4.setBackgroundResource(R.drawable.grey_rounded_corners_blue_stroke);
                            view3.setBackgroundResource(R.drawable.background_curved_grey_corner_5dp);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionPleasurableOptionCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new n(this, 2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30066v, e10);
        }
    }
}
