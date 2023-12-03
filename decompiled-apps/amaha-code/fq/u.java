package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T1Activity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.ScreenResult7Model;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticResult7Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/u;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f15804v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15805u = new LinkedHashMap();

    public u() {
        LogHelper.INSTANCE.makeLogTag(u.class);
    }

    @Override // rr.b
    public final boolean I() {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
        T1Activity t1Activity = (T1Activity) activity;
        if (t1Activity.B.containsKey(Constants.DAYMODEL_POSITION)) {
            HashMap<String, Object> hashMap = t1Activity.B;
            Object obj = hashMap.get(Constants.DAYMODEL_POSITION);
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            if (intValue > 0) {
                hashMap.put(Constants.DAYMODEL_POSITION, Integer.valueOf(intValue - 1));
            }
        }
        return true;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15805u;
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
        return inflater.inflate(R.layout.fragment_static_result7, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15805u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ScreenResult7Model screenResult7Model = new ScreenResult7Model(Utils.INSTANCE.getTodayTimeInSeconds());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
            T1Activity t1Activity = (T1Activity) activity;
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7Heading)).setText("Take a look at the statements you have selected");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtOne)).setText("To acknowledge your pain...");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtTwo)).setText("To recognise universality...");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtThree)).setText("To express self-kindness...");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7Rem)).setText("It's time for self-compassion");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7RemDesc)).setText("Take each statement and say it to yourself - out loud or in your mind. Repeat each statement a few times. You can close your eyes, keep your hand over your heart, and breathe deeply to feel calmer.");
                ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonOne)).setText("EDIT");
                ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonTwo)).setText("NEXT");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7Heading)).setText("Take a look at the statements you have selected");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtOne)).setText("To acknowledge your pain...");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtTwo)).setText("To recognise universality...");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtThree)).setText("To express self-kindness...");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7Rem)).setText("It's time for self-compassion");
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR7RemDesc)).setText("One by one, repeat each statement to yourself - either out loud or in your mind. You can keep your hand over your heart and close your eyes. Slowly breathe in and out. Do this for a few minutes.");
                ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonOne)).setText("EDIT");
                ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonTwo)).setText("NEXT");
            }
            HashMap<String, Object> hashMap = t1Activity.B;
            Object obj = hashMap.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            screenResult7Model.setList((ArrayList) obj);
            if (hashMap.containsKey("userAdded")) {
                Object obj2 = hashMap.get("userAdded");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                screenResult7Model.setUserAdded((ArrayList) obj2);
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtOneDesc)).setText(screenResult7Model.getList().get(0));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtTwoDesc)).setText(screenResult7Model.getList().get(1));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR7StmtThreeDesc)).setText(screenResult7Model.getList().get(2));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonOne)).setOnClickListener(new j(t1Activity, 4));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR7ButtonTwo)).setOnClickListener(new nn.v0(28, this));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new j(t1Activity, 5));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
