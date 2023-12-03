package nq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.x;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionGoodthingsWriteFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnq/q;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f26753w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f26755v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f26754u = LogHelper.INSTANCE.makeLogTag(q.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26755v;
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
        return inflater.inflate(R.layout.fragment_screen_a3, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f26755v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView a3title = (RobertoTextView) _$_findCachedViewById(R.id.a3title);
            kotlin.jvm.internal.i.f(a3title, "a3title");
            insetsUtils.addStatusBarHeight(a3title);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
            int i6 = ((DepressionGoodthingsActivity) activity).f10364w;
            if (i6 != 4) {
                if (i6 != 6) {
                    if (i6 == 7) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.a3title)).setText(getString(R.string.goodthingsWrite3Header));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a3Subtitle)).setText(getString(R.string.goodthingsWrite3Subheader));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a3description)).setText(getString(R.string.goodthingsWrite3Subtext));
                    }
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.a3title)).setText(getString(R.string.goodthingsWrite2Header));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a3Subtitle)).setText(getString(R.string.goodthingsWrite2Subheader));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a3description)).setText(getString(R.string.goodthingsWrite2Subtext));
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.a3title)).setText(getString(R.string.goodthingsWrite1Header));
                ((RobertoTextView) _$_findCachedViewById(R.id.a3Subtitle)).setText(getString(R.string.goodthingsWrite1Subheader));
                ((RobertoTextView) _$_findCachedViewById(R.id.a3description)).setText(getString(R.string.goodthingsWrite1Subtext));
            }
            ((RobertoEditText) _$_findCachedViewById(R.id.a3EditText)).setHint(getString(R.string.goodthingsWritePrompt));
            ((RobertoEditText) _$_findCachedViewById(R.id.a3EditText)).requestFocus();
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            Object systemService = context.getSystemService("input_method");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput((RobertoEditText) _$_findCachedViewById(R.id.a3EditText), 1);
            ((AppCompatImageView) _$_findCachedViewById(R.id.a3FloatingButton)).setOnClickListener(new x(13, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26754u, e10);
        }
    }
}
