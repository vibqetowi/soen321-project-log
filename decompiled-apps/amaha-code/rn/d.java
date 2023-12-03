package rn;

import androidx.fragment.app.Fragment;
import c4.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: BaseSellingScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrn/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class d extends Fragment {

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f30835u = new LinkedHashMap();

    public List<h> I() {
        return null;
    }

    public ArrayList<String> J() {
        return new ArrayList<>();
    }

    public void M(String str, String str2, String price, String str3) {
        i.g(price, "price");
    }

    public void _$_clearFindViewByIdCache() {
        this.f30835u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void F() {
    }

    public void O() {
    }

    public void P() {
    }

    public void S() {
    }

    public void U() {
    }

    public void Q(boolean z10) {
    }

    public void K(String str, String str2, boolean z10) {
    }
}
