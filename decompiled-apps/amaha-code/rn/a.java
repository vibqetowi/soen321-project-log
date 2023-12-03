package rn;

import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: BaseCTABlockFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrn/a;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class a extends b {

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f30831w = new LinkedHashMap();

    @Override // rn.b
    public void _$_clearFindViewByIdCache() {
        this.f30831w.clear();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void I(String str) {
    }
}
