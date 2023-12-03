package ep;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.z0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.x;
import nn.v0;
import so.b0;
/* compiled from: ResourceFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lep/b;", "Lhl/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends hl.a {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f14447z = 0;

    /* renamed from: w  reason: collision with root package name */
    public hp.a f14449w;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f14451y = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f14448v = LogHelper.INSTANCE.makeLogTag("ResourceFragment");

    /* renamed from: x  reason: collision with root package name */
    public final a f14450x = new a();

    /* compiled from: ResourceFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i6, int i10) {
            LinearLayoutManager linearLayoutManager;
            i.g(recyclerView, "recyclerView");
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            x xVar = null;
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition() + 1;
                hp.a aVar = b.this.f14449w;
                if (aVar != null) {
                    xVar = aVar.f18074z;
                }
                if (xVar != null) {
                    xVar.setValue(Integer.valueOf(findLastVisibleItemPosition));
                }
            }
        }
    }

    @Override // hl.a
    public final void F() {
        hp.a aVar = this.f14449w;
        if (aVar != null) {
            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            i.f(currentCourseName, "getInstance().user.currentCourseName");
            aVar.f(currentCourseName);
        }
    }

    public final void I(boolean z10) {
        a aVar = this.f14450x;
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvCustomDbResources);
            if (recyclerView != null) {
                recyclerView.i(aVar);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvCustomDbResources);
        if (recyclerView2 != null) {
            recyclerView2.c0(aVar);
        }
    }

    @Override // hl.a
    public final void _$_clearFindViewByIdCache() {
        this.f14451y.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f14451y;
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
        return inflater.inflate(R.layout.fragment_custom_dashboard_resource, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        I(false);
        super.onDestroy();
    }

    @Override // hl.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        ((RecyclerView) _$_findCachedViewById(R.id.rvCustomDbResources)).setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
        Application application = requireActivity().getApplication();
        i.f(application, "requireActivity().application");
        hp.a aVar = (hp.a) new o0(this, new z0(application, 2)).a(hp.a.class);
        aVar.D.e(getViewLifecycleOwner(), new b0(17, new ep.a(this)));
        this.f14449w = aVar;
        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
        i.f(currentCourseName, "getInstance().user.currentCourseName");
        aVar.f(currentCourseName);
        ((RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbResourcesViewAllCTA)).setOnClickListener(new v0(22, this));
    }
}
