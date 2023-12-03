package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticNotify22Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/g;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15709w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15711v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15710u = LogHelper.INSTANCE.makeLogTag(g.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15711v;
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
        return inflater.inflate(R.layout.fragment_static_notify22, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15711v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            String string = arguments.getString(Constants.API_COURSE_LINK);
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.d(arguments2);
            arguments2.getInt(Constants.DAYMODEL_POSITION, 0);
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.NOTIFICATION_WORRY)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("What's next?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Sit back and relax. Take a minute to acknowledge that you have let go of your worry successfully! You can resume whatever you were doing before. Remember to use this technique in times of worry.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.NOTIFICATION_WORRY)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("That's great!");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Sit back and relax. Take a minute to acknowledge that you have let go of your worry successfully! You can resume whatever you were doing before. Remember to use this technique in times of worry.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(string, Constants.NOTIFICATION_WORRY)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("That's great!");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Sit back and relax. Take a minute to acknowledge that you have let go of your worry successfully! You can resume whatever you were doing before. Remember to use this technique in times of worry.");
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setText("DONE");
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f15703v;

                {
                    this.f15703v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    g this$0 = this.f15703v;
                    switch (i6) {
                        case 0:
                            int i10 = g.f15709w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.d(activity);
                            activity.finish();
                            return;
                        default:
                            int i11 = g.f15709w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                                return;
                            }
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f15703v;

                {
                    this.f15703v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    g this$0 = this.f15703v;
                    switch (i6) {
                        case 0:
                            int i10 = g.f15709w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.d(activity);
                            activity.finish();
                            return;
                        default:
                            int i11 = g.f15709w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                                return;
                            }
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15710u, "exception", e10);
        }
    }
}
