package ke;

import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Map;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Comparator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23276u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Comparator f23277v;

    public /* synthetic */ j(Comparator comparator, int i6) {
        this.f23276u = i6;
        this.f23277v = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i6 = this.f23276u;
        Comparator comparator = this.f23277v;
        switch (i6) {
            case 0:
                g gVar = (g) obj;
                g gVar2 = (g) obj2;
                int compare = comparator.compare(gVar, gVar2);
                if (compare == 0) {
                    return g.f23271a.compare(gVar, gVar2);
                }
                return compare;
            default:
                SecureRandom secureRandom = oe.n.f27432a;
                return comparator.compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
        }
    }
}
