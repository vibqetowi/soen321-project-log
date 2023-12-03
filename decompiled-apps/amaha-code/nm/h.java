package nm;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: JournalParentFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnm/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class h extends Fragment {

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f26414u = new LinkedHashMap();

    public abstract void F(Integer num);

    public abstract void I();

    public void _$_clearFindViewByIdCache() {
        this.f26414u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
