package qq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableSelectionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/z;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f30091y = 0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f30092u;

    /* renamed from: v  reason: collision with root package name */
    public View f30093v;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f30095x = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f30094w = LogHelper.INSTANCE.makeLogTag(z.class);

    public final void J(boolean z10) {
        if (z10) {
            View view = this.f30093v;
            if (view != null) {
                ((AppCompatImageView) view.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.circle_blue);
                View view2 = this.f30093v;
                if (view2 != null) {
                    ((AppCompatImageView) view2.findViewById(R.id.rowCheck)).setImageResource(R.drawable.ic_round_check);
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    ((DepressionPleasurableActivity) activity).B.clear();
                    int childCount = ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).getChildCount() - 1;
                    for (int i6 = 0; i6 < childCount; i6++) {
                        ((AppCompatImageView) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).getChildAt(i6).findViewById(R.id.rowCheck)).setBackgroundResource(R.color.transparent);
                        ((AppCompatImageView) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).getChildAt(i6).findViewById(R.id.rowCheck)).setImageResource(R.drawable.circle_hollow_grey_high_contrast);
                    }
                    this.f30092u = true;
                    return;
                }
                kotlin.jvm.internal.i.q("noneRow");
                throw null;
            }
            kotlin.jvm.internal.i.q("noneRow");
            throw null;
        }
        View view3 = this.f30093v;
        if (view3 != null) {
            ((AppCompatImageView) view3.findViewById(R.id.rowCheck)).setBackgroundResource(R.color.transparent);
            View view4 = this.f30093v;
            if (view4 != null) {
                ((AppCompatImageView) view4.findViewById(R.id.rowCheck)).setImageResource(R.drawable.circle_hollow_grey_high_contrast);
                this.f30092u = false;
                return;
            }
            kotlin.jvm.internal.i.q("noneRow");
            throw null;
        }
        kotlin.jvm.internal.i.q("noneRow");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30095x;
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
        return inflater.inflate(R.layout.fragment_screen_a8, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30095x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a8ScrollView = (ScrollView) _$_findCachedViewById(R.id.a8ScrollView);
            kotlin.jvm.internal.i.f(a8ScrollView, "a8ScrollView");
            insetsUtils.addStatusBarHeight(a8ScrollView);
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionPleasurableSelectionHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionPleasurableSelectionSubheader));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionPleasurableSelectionCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            Iterator<String> it = ((DepressionPleasurableActivity) activity).B.iterator();
            while (it.hasNext()) {
                String next = it.next();
                View inflate = getLayoutInflater().inflate(R.layout.row_screen_a8, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
                ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(next);
                inflate.findViewById(R.id.divider).setVisibility(8);
                inflate.setOnClickListener(new nn.g(19, this, next, inflate));
                ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
            }
            View inflate2 = getLayoutInflater().inflate(R.layout.row_screen_a8, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
            ((RobertoTextView) inflate2.findViewById(R.id.rowTitle)).setText(getString(R.string.depressionPleasurableSelectionNOTA));
            inflate2.findViewById(R.id.divider).setVisibility(8);
            inflate2.setOnClickListener(new View.OnClickListener(this) { // from class: qq.y

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ z f30090v;

                {
                    this.f30090v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = true;
                    z this$0 = this.f30090v;
                    switch (i6) {
                        case 0:
                            int i10 = z.f30091y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J(!this$0.f30092u);
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            if (((DepressionPleasurableActivity) activity2).B.isEmpty() && !this$0.f30092u) {
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
                                return;
                            } else {
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                                return;
                            }
                        default:
                            int i11 = z.f30091y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            if (((DepressionPleasurableActivity) activity3).B.isEmpty() && !this$0.f30092u) {
                                Toast.makeText(this$0.getActivity(), this$0.getString(R.string.depressionPleasurableScheduleError), 0).show();
                                return;
                            }
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            DepressionPleasurableActivity depressionPleasurableActivity = (DepressionPleasurableActivity) activity4;
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            if (((DepressionPleasurableActivity) activity5).B.size() == 0) {
                                z10 = false;
                            }
                            depressionPleasurableActivity.E = z10;
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity6).t0();
                            return;
                    }
                }
            });
            ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate2);
            this.f30093v = inflate2;
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.y

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ z f30090v;

                {
                    this.f30090v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    boolean z10 = true;
                    z this$0 = this.f30090v;
                    switch (i6) {
                        case 0:
                            int i10 = z.f30091y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J(!this$0.f30092u);
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            if (((DepressionPleasurableActivity) activity2).B.isEmpty() && !this$0.f30092u) {
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
                                return;
                            } else {
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                                return;
                            }
                        default:
                            int i11 = z.f30091y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            if (((DepressionPleasurableActivity) activity3).B.isEmpty() && !this$0.f30092u) {
                                Toast.makeText(this$0.getActivity(), this$0.getString(R.string.depressionPleasurableScheduleError), 0).show();
                                return;
                            }
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            DepressionPleasurableActivity depressionPleasurableActivity = (DepressionPleasurableActivity) activity4;
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            if (((DepressionPleasurableActivity) activity5).B.size() == 0) {
                                z10 = false;
                            }
                            depressionPleasurableActivity.E = z10;
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity6).t0();
                            return;
                    }
                }
            });
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            ArrayList<String> arrayList = ((DepressionPleasurableActivity) activity2).A;
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            arrayList.addAll(((DepressionPleasurableActivity) activity3).B);
            androidx.fragment.app.p activity4 = getActivity();
            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            ((DepressionPleasurableActivity) activity4).B.clear();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30094w, e10);
        }
    }
}
