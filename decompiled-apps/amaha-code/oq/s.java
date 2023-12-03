package oq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.x;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionHopeWaitScreen2Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq/s;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f27768x = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f27769u;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f27771w = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f27770v = LogHelper.INSTANCE.makeLogTag(s.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f27771w;
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
        return inflater.inflate(R.layout.fragment_screen_a14, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f27771w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            this.f27769u = requireArguments().getInt("Wait2");
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            AppCompatImageView a14Image = (AppCompatImageView) _$_findCachedViewById(R.id.a14Image);
            kotlin.jvm.internal.i.f(a14Image, "a14Image");
            insetsUtils.addStatusBarHeight(a14Image);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a14parent)).setOnClickListener(new x(19, this));
            int i6 = this.f27769u;
            if (i6 != 1) {
                if (i6 == 2) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.depressionHopeWaitScreen2Head2, FirebasePersistence.getInstance().getUser().getFirstName()));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a14Subtitle)).setText(getString(R.string.depressionHopeWaitScreen2SubHead2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a14CTA)).setText(getString(R.string.depressionHopeTap));
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.depressionHopeWaitScreen2Head1));
                ((RobertoTextView) _$_findCachedViewById(R.id.a14Subtitle)).setText(getString(R.string.depressionHopeWaitScreen2SubHead1));
                ((RobertoTextView) _$_findCachedViewById(R.id.a14CTA)).setText(getString(R.string.depressionHopeTapDone));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f27770v, e10);
        }
    }
}
