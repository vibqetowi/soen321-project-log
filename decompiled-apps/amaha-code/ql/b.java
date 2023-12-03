package ql;

import android.support.v4.media.MediaMetadataCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.o0;
/* compiled from: AudioMediaSource.kt */
/* loaded from: classes2.dex */
public final class b extends ql.a {

    /* renamed from: w  reason: collision with root package name */
    public final o f29676w;

    /* renamed from: x  reason: collision with root package name */
    public List<MediaMetadataCompat> f29677x = is.w.f20676u;

    /* compiled from: AudioMediaSource.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.AudioMediaSource", f = "AudioMediaSource.kt", l = {29}, m = "load")
    /* loaded from: classes2.dex */
    public static final class a extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public b f29678u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f29679v;

        /* renamed from: x  reason: collision with root package name */
        public int f29681x;

        public a(ls.d<? super a> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f29679v = obj;
            this.f29681x |= LinearLayoutManager.INVALID_OFFSET;
            return b.this.F(this);
        }
    }

    public b(o oVar) {
        this.f29676w = oVar;
        g(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    @Override // ql.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(ls.d<? super hs.k> dVar) {
        a aVar;
        int i6;
        hs.k kVar;
        b bVar;
        List<MediaMetadataCompat> list;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f29681x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f29681x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f29679v;
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                i6 = aVar.f29681x;
                kVar = null;
                if (i6 == 0) {
                    if (i6 == 1) {
                        bVar = aVar.f29678u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    aVar.f29678u = this;
                    aVar.f29681x = 1;
                    obj = ta.v.S(o0.f23642c, new c(this.f29676w, null), aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    bVar = this;
                }
                list = (List) obj;
                if (list != null) {
                    bVar.f29677x = list;
                    bVar.g(3);
                    kVar = hs.k.f19476a;
                }
                if (kVar == null) {
                    bVar.f29677x = is.w.f20676u;
                    bVar.g(4);
                }
                return hs.k.f19476a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f29679v;
        ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
        i6 = aVar.f29681x;
        kVar = null;
        if (i6 == 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        if (kVar == null) {
        }
        return hs.k.f19476a;
    }

    @Override // java.lang.Iterable
    public final Iterator<MediaMetadataCompat> iterator() {
        return this.f29677x.iterator();
    }
}
