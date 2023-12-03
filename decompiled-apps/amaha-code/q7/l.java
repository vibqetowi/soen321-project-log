package q7;

import b9.b;
import c9.w;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.s;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p7.n;
import p7.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29273u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f29274v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f29275w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f29276x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f29277y;

    public /* synthetic */ l(Object obj, int i6, long j10, long j11, int i10) {
        this.f29273u = i10;
        this.f29277y = obj;
        this.f29274v = i6;
        this.f29275w = j10;
        this.f29276x = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a next;
        i.a aVar;
        i.a aVar2;
        int i6 = this.f29273u;
        Object obj = this.f29277y;
        switch (i6) {
            case 0:
                int i10 = this.f29274v;
                long j10 = this.f29275w;
                long j11 = this.f29276x;
                com.google.android.exoplayer2.audio.a aVar3 = ((a.C0132a) obj).f6254b;
                int i11 = w.f5205a;
                aVar3.j0(i10, j10, j11);
                return;
            default:
                int i12 = this.f29274v;
                long j12 = this.f29275w;
                long j13 = this.f29276x;
                p7.n nVar = (p7.n) ((b.a.C0079a.C0080a) obj).f4113b;
                n.a aVar4 = nVar.f27966x;
                if (aVar4.f27970b.isEmpty()) {
                    aVar2 = null;
                } else {
                    s<i.a> sVar = aVar4.f27970b;
                    if (sVar instanceof List) {
                        if (!sVar.isEmpty()) {
                            aVar = sVar.get(sVar.size() - 1);
                        } else {
                            throw new NoSuchElementException();
                        }
                    } else {
                        Iterator<i.a> it = sVar.iterator();
                        do {
                            next = it.next();
                        } while (it.hasNext());
                        aVar = next;
                    }
                    aVar2 = aVar;
                }
                o.a o02 = nVar.o0(aVar2);
                nVar.r0(o02, 1006, new p7.d(o02, i12, j12, j13, 1));
                return;
        }
    }
}
