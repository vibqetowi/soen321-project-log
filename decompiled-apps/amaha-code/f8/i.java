package f8;

import android.net.Uri;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.source.d;
import java.util.Map;
import p8.h;
import u7.k;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements MediaCodecUtil.e, k {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f14915u;

    public /* synthetic */ i(n nVar) {
        this.f14915u = nVar;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.e
    public final int a(Object obj) {
        try {
            return ((com.google.android.exoplayer2.mediacodec.d) obj).c(this.f14915u) ? 1 : 0;
        } catch (MediaCodecUtil.DecoderQueryException unused) {
            return -1;
        }
    }

    public final u7.h[] b() {
        u7.h bVar;
        u7.h[] hVarArr = new u7.h[1];
        h.a aVar = p8.h.f28014a;
        n nVar = this.f14915u;
        if (aVar.b(nVar)) {
            bVar = new p8.i(aVar.a(nVar), nVar);
        } else {
            bVar = new d.b(nVar);
        }
        hVarArr[0] = bVar;
        return hVarArr;
    }

    @Override // u7.k
    public final u7.h[] d(Uri uri, Map map) {
        return b();
    }
}
