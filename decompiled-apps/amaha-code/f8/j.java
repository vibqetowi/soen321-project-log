package f8;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import he.g0;
import java.util.Comparator;
import oe.n;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Comparator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f14916u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f14917v;

    public /* synthetic */ j(int i6, Object obj) {
        this.f14916u = i6;
        this.f14917v = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i6 = this.f14916u;
        Object obj3 = this.f14917v;
        switch (i6) {
            case 0:
                MediaCodecUtil.e eVar = (MediaCodecUtil.e) obj3;
                return eVar.a(obj2) - eVar.a(obj);
            default:
                g0 g0Var = (g0) obj3;
                he.h hVar = (he.h) obj;
                he.h hVar2 = (he.h) obj2;
                g0Var.getClass();
                int d10 = n.d(g0.b(hVar), g0.b(hVar2));
                hVar.f17512a.compareTo(hVar2.f17512a);
                if (d10 == 0) {
                    return g0Var.f17502a.b().compare(hVar.f17513b, hVar2.f17513b);
                }
                return d10;
        }
    }
}
