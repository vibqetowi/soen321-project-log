package tn;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFragmentListener;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.x;
import nn.v0;
/* compiled from: TrackerActivitiesFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltn/e;", "Lrr/b;", "Lcom/theinnerhour/b2b/components/multiTracker/model/MultiTrackerFragmentListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends rr.b implements MultiTrackerFragmentListener {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f33338z = 0;

    /* renamed from: w  reason: collision with root package name */
    public MultiTrackerListener f33341w;

    /* renamed from: x  reason: collision with root package name */
    public v.c f33342x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f33343y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f33339u = LogHelper.INSTANCE.makeLogTag("TrackerActivitiesFragment");

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<String> f33340v = new ArrayList<>();

    /* compiled from: TrackerActivitiesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ x<sn.a> f33345v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x<sn.a> xVar) {
            super(1);
            this.f33345v = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            String activity = str;
            kotlin.jvm.internal.i.g(activity, "activity");
            e eVar = e.this;
            boolean contains = eVar.f33340v.contains(activity);
            ArrayList<String> arrayList = eVar.f33340v;
            x<sn.a> xVar = this.f33345v;
            if (contains) {
                arrayList.remove(activity);
                sn.a aVar = xVar.f23469u;
                if (aVar != null) {
                    aVar.B.remove(activity);
                    aVar.j(aVar.f31770x.indexOf(activity));
                }
            } else {
                arrayList.add(activity);
                sn.a aVar2 = xVar.f23469u;
                if (aVar2 != null) {
                    aVar2.B.add(activity);
                    aVar2.j(aVar2.f31770x.indexOf(activity));
                }
            }
            return hs.k.f19476a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof MultiTrackerListener) {
            this.f33341w = (MultiTrackerListener) context;
        }
    }

    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFragmentListener
    public final void onButtonClick() {
        MultiTrackerActivity multiTrackerActivity;
        ArrayList<String> arrayList;
        MultiTrackerActivity multiTrackerActivity2;
        try {
            MultiTrackerListener multiTrackerListener = this.f33341w;
            if (multiTrackerListener != null) {
                multiTrackerListener.setActivities(this.f33340v);
            }
            p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
            ((rr.a) activity).n0();
            Bundle bundle = new Bundle();
            bundle.putInt("mood", requireActivity().getIntent().getIntExtra("mood", 0));
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            MultiTrackerListener multiTrackerListener2 = this.f33341w;
            kotlin.jvm.internal.i.d(multiTrackerListener2);
            bundle.putBoolean("isOnboarding", multiTrackerListener2.getTutorialFlag());
            p activity2 = getActivity();
            String str = null;
            if (activity2 instanceof MultiTrackerActivity) {
                multiTrackerActivity = (MultiTrackerActivity) activity2;
            } else {
                multiTrackerActivity = null;
            }
            if (multiTrackerActivity != null) {
                arrayList = multiTrackerActivity.E;
            } else {
                arrayList = null;
            }
            bundle.putStringArrayList(Constants.SCREEN_ACTIVITIES, arrayList);
            p activity3 = getActivity();
            if (activity3 instanceof MultiTrackerActivity) {
                multiTrackerActivity2 = (MultiTrackerActivity) activity3;
            } else {
                multiTrackerActivity2 = null;
            }
            if (multiTrackerActivity2 != null) {
                str = multiTrackerActivity2.H;
            }
            bundle.putString("source", str);
            gk.a.b(bundle, "new_tracker_activity_selection_main_cta");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33339u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.fragment_tracker_activities, (ViewGroup) null, false);
        int i6 = R.id.btnAddLog;
        RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.btnAddLog, inflate);
        if (robertoButton != null) {
            i6 = R.id.trackerActivitiesRv;
            RecyclerView recyclerView = (RecyclerView) hc.d.w(R.id.trackerActivitiesRv, inflate);
            if (recyclerView != null) {
                i6 = R.id.trackerEmotionCloudTitle;
                RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.trackerEmotionCloudTitle, inflate);
                if (robertoTextView != null) {
                    v.c cVar = new v.c((ScrollView) inflate, robertoButton, recyclerView, robertoTextView, 17);
                    this.f33342x = cVar;
                    return (ScrollView) cVar.f34631v;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f33342x = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f33343y.clear();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, androidx.recyclerview.widget.RecyclerView$e, sn.a] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        int i10;
        RecyclerView recyclerView;
        RobertoButton robertoButton;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i6 = arguments.getInt("mood");
            } else {
                i6 = -1;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                i10 = R.drawable.ic_tracker_circle_empty;
                            } else {
                                i10 = R.drawable.ic_tracker_circle_yellow;
                            }
                        } else {
                            i10 = R.drawable.ic_tracker_circle_blue;
                        }
                    } else {
                        i10 = R.drawable.ic_tracker_circle_pink;
                    }
                } else {
                    i10 = R.drawable.ic_tracker_circle_purple;
                }
            } else {
                i10 = R.drawable.ic_tracker_circle_grey;
            }
            String[] stringArray = getResources().getStringArray(R.array.TrackerActivities);
            kotlin.jvm.internal.i.f(stringArray, "resources.getStringArray….array.TrackerActivities)");
            ArrayList k10 = ca.a.k(Arrays.copyOf(stringArray, stringArray.length));
            x xVar = new x();
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            ?? aVar = new sn.a(k10, requireContext, i10, new a(xVar));
            xVar.f23469u = aVar;
            v.c cVar = this.f33342x;
            RecyclerView recyclerView2 = null;
            if (cVar != null) {
                recyclerView = (RecyclerView) cVar.f34633x;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                recyclerView.setAdapter(aVar);
            }
            v.c cVar2 = this.f33342x;
            if (cVar2 != null) {
                recyclerView2 = (RecyclerView) cVar2.f34633x;
            }
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new GridLayoutManager(getContext(), 5));
            }
            v.c cVar3 = this.f33342x;
            if (cVar3 != null && (robertoButton = (RobertoButton) cVar3.f34632w) != null) {
                robertoButton.setOnClickListener(new v0(4, this));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33339u, e10);
        }
    }
}
