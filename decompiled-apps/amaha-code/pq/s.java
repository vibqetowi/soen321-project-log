package pq;

import android.content.Context;
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
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionMasterySeparatorFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpq/s;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f28819w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f28821v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28820u = LogHelper.INSTANCE.makeLogTag(s.class);

    public final void J() {
        ((RobertoTextView) _$_findCachedViewById(R.id.a14CTA)).setVisibility(8);
        ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setVisibility(0);
        ((ConstraintLayout) _$_findCachedViewById(R.id.a14parent)).setOnClickListener(null);
        ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setOnClickListener(new fq.x(24, this));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f28821v;
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
        this.f28821v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        String str = this.f28820u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView a14Title = (RobertoTextView) _$_findCachedViewById(R.id.a14Title);
            kotlin.jvm.internal.i.f(a14Title, "a14Title");
            insetsUtils.addStatusBarHeight(a14Title);
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA)).setOnClickListener(null);
            i6 = requireArguments().getInt("separator");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, e10);
            return;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        ((AppCompatImageView) _$_findCachedViewById(R.id.a14Image)).setVisibility(0);
                        ((AppCompatImageView) _$_findCachedViewById(R.id.a14Image)).setImageResource(R.drawable.ic_mastery_thumbs_up);
                        ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.depressionMasterySelectedHeader));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a14Subtitle)).setText(getString(R.string.depressionMasterySelectedText));
                        ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setText(getString(R.string.depressionMasterySelectedCTA));
                        J();
                        return;
                    }
                    return;
                }
                ((AppCompatImageView) _$_findCachedViewById(R.id.a14Image)).setVisibility(0);
                ((AppCompatImageView) _$_findCachedViewById(R.id.a14Image)).setImageResource(R.drawable.ic_a14_mastery_star);
                try {
                    ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.depressionPleasurableGreatName, FirebasePersistence.getInstance().getUser().getFirstName()));
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str, e11);
                    ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.conditionSelectionUserChoiceStressHeader));
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.a14Subtitle)).setText(getString(R.string.depressionMasteryPebbleDoneText));
                ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setText(getString(R.string.depressionMasteryPebbleDoneCTA));
                J();
                return;
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.a14Image)).setVisibility(0);
            ((AppCompatImageView) _$_findCachedViewById(R.id.a14Image)).setImageResource(R.drawable.ic_a14_mastery_star);
            try {
                ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.depressionMasteryWellDoneName, FirebasePersistence.getInstance().getUser().getFirstName()));
            } catch (Exception e12) {
                LogHelper.INSTANCE.e(str, e12);
                ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.depressionMasteryWellDone));
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.a14Subtitle)).setText(getString(R.string.depressionMasteryRockDoneText));
            ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setText(getString(R.string.depressionMasteryRockDoneCTA));
            J();
            return;
            LogHelper.INSTANCE.e(str, e10);
            return;
        }
        ((RobertoTextView) _$_findCachedViewById(R.id.a14Title)).setText(getString(R.string.depressionMasteryDaydoneHeader1));
        ((RobertoTextView) _$_findCachedViewById(R.id.a14Subtitle)).setText(getString(R.string.depressionMasteryDaydoneSubheader));
        ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setText(getString(R.string.depressionMasteryDaydoneCTA1));
        Context context = getContext();
        kotlin.jvm.internal.i.d(context);
        Object obj = g0.a.f16164a;
        ((RobertoButton) _$_findCachedViewById(R.id.a14ButtonCTA2)).setBackground(a.c.b(context, R.drawable.button_dark_grey_fill));
        J();
    }
}
