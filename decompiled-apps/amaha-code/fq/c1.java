package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS88Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/c1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c1 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15676w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15678v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15677u = LogHelper.INSTANCE.makeLogTag(c1.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15678v;
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_static_s88, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15678v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
            rr.a aVar = (rr.a) activity;
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            String stringExtra = activity2.getIntent().getStringExtra(Constants.API_COURSE_LINK);
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new m0(aVar, 4));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1J)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("The 3 steps of Self-Compassion Pause");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Once you understand how this activity works, you can choose your own self-compassion statements.");
                arrayList.add("Acknowledging that you are in pain");
                arrayList.add("Recognising that pain is universal");
                arrayList.add("Expressing kindness to yourself");
                arrayList2.add("The first step involves accepting your experience for what it is. While pain cannot be avoided, it can be recognised. Being mindful of your pain can help you feel validated in difficult situations.");
                arrayList2.add("The second step involves accepting the idea that pain, hurt and disappointment are part of the human experience. This also means that you are not alone - recognising that there are others who also struggle can comfort you.");
                arrayList2.add("The last step involves expressing compassion to yourself. You can do this by saying positive things to yourself, reminding yourself of your qualities, and telling yourself that you are a worthy individual who deserves kindness.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1J)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("The 3 steps of Self-Compassion Pause");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Once you understand how this activity works, you can choose your own self-compassion statements.");
                arrayList.add("Acknowledging that you are in pain");
                arrayList.add("Recognising that pain is universal");
                arrayList.add("Expressing kindness to yourself");
                arrayList2.add("The first step involves accepting an experience for what it is. While pain cannot be avoided, it can be recognised. Being mindful of your pain can help you feel validated in difficult situations.");
                arrayList2.add("The second step involves accepting the idea that pain, hurt and disappointment are part of the human experience. This also means that you are not alone - recognising that there are others who also struggle can comfort you.");
                arrayList2.add("The last step involves expressing compassion to yourself. You can do this by saying positive things to yourself, reminding yourself of your qualities, and telling yourself that you are a worthy individual who deserves kindness.");
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setText("TRY IT");
            Iterator it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.d(activity3);
                View inflate = activity3.getLayoutInflater().inflate(R.layout.row_screen_s88, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText((String) it.next());
                ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText((CharSequence) arrayList2.get(i6));
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
                i6++;
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new m0(aVar, 5));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15677u, "exception", e10);
        }
    }
}
