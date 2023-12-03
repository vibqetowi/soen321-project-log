package fq;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS31Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/k0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k0 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f15744x = 0;

    /* renamed from: v  reason: collision with root package name */
    public String f15746v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f15747w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15745u = LogHelper.INSTANCE.makeLogTag(k0.class);

    /* compiled from: StaticS31Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends a5.f<Drawable> {
        public a() {
        }

        @Override // a5.h
        public final void f(Object obj) {
            ((ConstraintLayout) k0.this._$_findCachedViewById(R.id.constraintLayout)).setBackground((Drawable) obj);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15747w;
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
        return inflater.inflate(R.layout.fragment_static_s31, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15747w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new a());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
            T5Activity t5Activity = (T5Activity) activity;
            String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            Course courseById = FirebasePersistence.getInstance().getCourseById(currentCourse);
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            String string = arguments.getString(Constants.API_COURSE_LINK);
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.d(arguments2);
            arguments2.getInt(Constants.DAYMODEL_POSITION);
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T5B)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Note down your worries throughout each day and think about them only at your scheduled worry time.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15746v = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_WORRY_TIME;
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setText("NEXT");
            Goal goalById = FirebasePersistence.getInstance().getGoalById(this.f15746v, currentCourse);
            SwitchCompat switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal);
            if (goalById != null && goalById.isVisible()) {
                z10 = true;
            } else {
                z10 = false;
            }
            switchCompat.setChecked(z10);
            ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setOnCheckedChangeListener(new fl.m(this, 2, currentCourse));
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.j0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ k0 f15735v;

                {
                    this.f15735v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    k0 this$0 = this.f15735v;
                    switch (i6) {
                        case 0:
                            int i10 = k0.f15744x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        default:
                            int i11 = k0.f15744x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                                return;
                            }
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.j0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ k0 f15735v;

                {
                    this.f15735v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    k0 this$0 = this.f15735v;
                    switch (i6) {
                        case 0:
                            int i10 = k0.f15744x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        default:
                            int i11 = k0.f15744x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                                return;
                            }
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15745u, "exception in on view created", e10);
        }
    }
}
