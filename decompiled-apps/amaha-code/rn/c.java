package rn;

import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: BaseSKUBlockFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrn/c;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class c extends b {

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f30834w = new LinkedHashMap();

    @Override // rn.b
    public void _$_clearFindViewByIdCache() {
        this.f30834w.clear();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void J() {
    }

    public void I(String str) {
    }
}
