package fq;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticNotify1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15659w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15661v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15660u = LogHelper.INSTANCE.makeLogTag(b.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15661v;
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
        return inflater.inflate(R.layout.fragment_static_notify1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15661v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        Intent intent;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            if (activity != null && (intent = activity.getIntent()) != null && intent.hasExtra("source")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
                ((T5Activity) activity2).s0(new d());
                return;
            }
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            String string = arguments.getString(Constants.API_COURSE_LINK);
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.d(arguments2);
            arguments2.getInt(Constants.DAYMODEL_POSITION, 0);
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.NOTIFICATION_WORRY)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Still worried about what you wrote down?");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.NOTIFICATION_WORRY)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Still worried about what you wrote down?");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(string, Constants.NOTIFICATION_WORRY)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Still worried about what you wrote down?");
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("YES");
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("NO");
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f15649v;

                {
                    this.f15649v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f15649v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f15659w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
                            ((T5Activity) activity3).s0(new d());
                            return;
                        case 1:
                            int i11 = b.f15659w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
                            ((T5Activity) activity4).s0(new g());
                            return;
                        default:
                            int i12 = b.f15659w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            if (activity5 != null) {
                                activity5.finish();
                                return;
                            }
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f15649v;

                {
                    this.f15649v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f15649v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f15659w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
                            ((T5Activity) activity3).s0(new d());
                            return;
                        case 1:
                            int i11 = b.f15659w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
                            ((T5Activity) activity4).s0(new g());
                            return;
                        default:
                            int i12 = b.f15659w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            if (activity5 != null) {
                                activity5.finish();
                                return;
                            }
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f15649v;

                {
                    this.f15649v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f15649v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f15659w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
                            ((T5Activity) activity3).s0(new d());
                            return;
                        case 1:
                            int i11 = b.f15659w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
                            ((T5Activity) activity4).s0(new g());
                            return;
                        default:
                            int i12 = b.f15659w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            if (activity5 != null) {
                                activity5.finish();
                                return;
                            }
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15660u, "Exception in on view created", e10);
        }
    }
}
