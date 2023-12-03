package rn;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: BaseElementFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrn/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class b extends Fragment {

    /* renamed from: u  reason: collision with root package name */
    public d f30832u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30833v = new LinkedHashMap();

    public final d F() {
        d dVar = this.f30832u;
        if (dVar != null) {
            return dVar;
        }
        i.q("parentFragment");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        this.f30833v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        Fragment parentFragment = getParentFragment();
        i.e(parentFragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.monetization.views.BaseSellingScreenFragment");
        this.f30832u = (d) parentFragment;
        super.onViewCreated(view, bundle);
    }
}
