package rq;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionThoughtsWaitScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/u;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30993w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30995v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30994u = LogHelper.INSTANCE.makeLogTag(u.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30995v;
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
        return inflater.inflate(R.layout.fragment_screen_a2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30995v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView a2header = (RobertoTextView) _$_findCachedViewById(R.id.a2header);
            kotlin.jvm.internal.i.f(a2header, "a2header");
            insetsUtils.addStatusBarHeight(a2header);
            switch (requireArguments().getInt("Wait")) {
                case 1:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionThoughtsWaitHeader1));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionThoughtsWaitTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 2:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionThoughtsWaitHeader2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionThoughtsWaitTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 3:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionThoughtsWaitHeader3));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionThoughtsWaitTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 4:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionThoughtsWaitHeader4));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionThoughtsWaitTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 5:
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.depressionThoughtsWaitSpannable1));
                    Context context = getContext();
                    kotlin.jvm.internal.i.d(context);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(g0.a.b(context, R.color.sea)), 96, com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl, 34);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionThoughtsWaitTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(spannableStringBuilder);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 6:
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getString(R.string.depressionThoughtsWaitSpannable2));
                    Context context2 = getContext();
                    kotlin.jvm.internal.i.d(context2);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(g0.a.b(context2, R.color.sea)), com.appsflyer.R.styleable.AppCompatTheme_viewInflaterClass, 131, 34);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionThoughtsWaitTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(spannableStringBuilder2);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 7:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionThoughtsWaitHeader5));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionThoughtsWaitTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 8:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionThoughtsWaitHeader6));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionThoughtsWaitTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 9:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionThoughtsWaitHeader7));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionThoughtsWaitTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
            }
            ((ConstraintLayout) _$_findCachedViewById(R.id.a2parent)).setOnClickListener(new qq.n(this, 16));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30994u, e10);
        }
    }
}
