package hl;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CustomDashboardChildFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class a extends Fragment {

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f17655u = new LinkedHashMap();

    public abstract void F();

    public void _$_clearFindViewByIdCache() {
        this.f17655u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
