package m9;

import android.util.LruCache;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class h0 extends LruCache<Integer, k9.l> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f24993a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(d dVar) {
        super(20);
        this.f24993a = dVar;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z10, Integer num, k9.l lVar, k9.l lVar2) {
        Integer num2 = num;
        if (!z10) {
            return;
        }
        d dVar = this.f24993a;
        v9.o.h(dVar.f24957g);
        dVar.f24957g.add(num2);
    }
}
