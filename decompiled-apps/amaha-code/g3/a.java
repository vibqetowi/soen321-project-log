package g3;

import d3.i;
import d3.k;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AnimatableColorValue.java */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f16169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i6, ArrayList arrayList) {
        super(0, arrayList);
        this.f16169c = i6;
    }

    @Override // g3.e
    public final d3.a k() {
        int i6 = this.f16169c;
        Object obj = this.f16181b;
        switch (i6) {
            case 0:
                return new d3.b((List) obj);
            case 1:
                return new d3.d(0, (List) obj);
            case 2:
                return new d3.e((List) obj);
            case 3:
                return new d3.d(1, (List) obj);
            case 4:
                return new d3.d(2, (List) obj);
            case 5:
                return new i((List) obj);
            default:
                return new k((List) obj);
        }
    }
}
