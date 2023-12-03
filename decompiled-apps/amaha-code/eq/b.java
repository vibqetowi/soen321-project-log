package eq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: StaticS14Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leq/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f14466w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f14468v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<String> f14467u = new ArrayList<>();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f14468v;
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
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_static_s14, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f14468v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            Bundle arguments = getArguments();
            i.d(arguments);
            String string = arguments.getString(Constants.API_COURSE_LINK);
            Bundle arguments2 = getArguments();
            i.d(arguments2);
            int i6 = arguments2.getInt(Constants.DAYMODEL_POSITION, 0);
            ArrayList<String> arrayList = this.f14467u;
            if (i6 != 2) {
                if (i6 == 3 && i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && i.b(string, Constants.SCREEN_T11A)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("And then use your gratitude object!");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Keep your object near you, and each time you see it during the day, take a break to be grateful.");
                    arrayList.add("Spend a moment to think about something that makes you feel happy or thankful.");
                    arrayList.add("It could be something as simple as a meal you ate in the day.");
                    arrayList.add("You could be thankful for a friend or colleague who makes your day easier.");
                    arrayList.add("You could even thank yourself for taking care of your needs and trying to be happy.");
                    arrayList.add("Once you decide what you are grateful for, reflect on your experience for a while.");
                    arrayList.add("Doing this regularly will help you build gratitude even for neutral experiences!");
                }
            } else if (i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && i.b(string, Constants.SCREEN_T11A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("Choose your gratitude object...");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your gratitude reminder can be any object that you tend to carry with yourself each day.");
                arrayList.add("Pick an unusual object that would clearly stand out and serve to remind you.");
                arrayList.add("Ideally, select an object that is small enough for you to carry wherever you go.");
                arrayList.add("For example, your object could be a pen, a watch, or a water bottle.");
                arrayList.add("It could even be a small rock or pebble, if that's what you prefer.");
                arrayList.add("There is no \"wrong\" object. Pick whatever you feel comfortable with!");
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("NEXT");
            Iterator<String> it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10++;
                p activity = getActivity();
                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                View inflate = ((rr.a) activity).getLayoutInflater().inflate(R.layout.row_screen_s3, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText(String.valueOf(i10));
                ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText(it.next());
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: eq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f14465v;

                {
                    this.f14465v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i11 = r2;
                    b this$0 = this.f14465v;
                    switch (i11) {
                        case 0:
                            int i12 = b.f14466w;
                            i.g(this$0, "this$0");
                            p activity2 = this$0.getActivity();
                            i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        default:
                            int i13 = b.f14466w;
                            i.g(this$0, "this$0");
                            p activity3 = this$0.getActivity();
                            i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).onBackPressed();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: eq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f14465v;

                {
                    this.f14465v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i11 = r2;
                    b this$0 = this.f14465v;
                    switch (i11) {
                        case 0:
                            int i12 = b.f14466w;
                            i.g(this$0, "this$0");
                            p activity2 = this$0.getActivity();
                            i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        default:
                            int i13 = b.f14466w;
                            i.g(this$0, "this$0");
                            p activity3 = this$0.getActivity();
                            i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).onBackPressed();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
