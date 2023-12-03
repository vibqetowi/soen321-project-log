package gt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import zu.i;
/* compiled from: MultiFieldValueClassRepresentation.kt */
/* loaded from: classes2.dex */
public final class b0<Type extends zu.i> extends x0<Type> {

    /* renamed from: a  reason: collision with root package name */
    public final List<hs.f<fu.e, Type>> f16765a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<fu.e, Type> f16766b;

    public b0(ArrayList arrayList) {
        boolean z10;
        this.f16765a = arrayList;
        Map<fu.e, Type> w02 = is.e0.w0(arrayList);
        if (w02.size() == arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f16766b = w02;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    @Override // gt.x0
    public final List<hs.f<fu.e, Type>> a() {
        return this.f16765a;
    }
}
