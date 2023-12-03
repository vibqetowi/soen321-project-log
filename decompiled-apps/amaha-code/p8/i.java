package p8;

import c9.q;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.theinnerhour.b2b.utils.Constants;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import u7.r;
import u7.s;
import u7.v;
/* compiled from: SubtitleExtractor.java */
/* loaded from: classes.dex */
public final class i implements u7.h {

    /* renamed from: a  reason: collision with root package name */
    public final g f28015a;

    /* renamed from: b  reason: collision with root package name */
    public final df.b f28016b = new df.b(7);

    /* renamed from: c  reason: collision with root package name */
    public final q f28017c = new q();

    /* renamed from: d  reason: collision with root package name */
    public final n f28018d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f28019e;
    public final ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public u7.j f28020g;

    /* renamed from: h  reason: collision with root package name */
    public v f28021h;

    /* renamed from: i  reason: collision with root package name */
    public int f28022i;

    /* renamed from: j  reason: collision with root package name */
    public int f28023j;

    /* renamed from: k  reason: collision with root package name */
    public long f28024k;

    public i(g gVar, n nVar) {
        this.f28015a = gVar;
        n.a aVar = new n.a(nVar);
        aVar.f6665k = "text/x-exoplayer-cues";
        aVar.f6662h = nVar.F;
        this.f28018d = new n(aVar);
        this.f28019e = new ArrayList();
        this.f = new ArrayList();
        this.f28023j = 0;
        this.f28024k = -9223372036854775807L;
    }

    @Override // u7.h
    public final void a() {
        if (this.f28023j == 5) {
            return;
        }
        this.f28015a.a();
        this.f28023j = 5;
    }

    @Override // u7.h
    public final boolean b(u7.i iVar) {
        return true;
    }

    public final void c() {
        boolean z10;
        int d10;
        sc.b.E(this.f28021h);
        ArrayList arrayList = this.f28019e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size == arrayList2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        long j10 = this.f28024k;
        if (j10 == -9223372036854775807L) {
            d10 = 0;
        } else {
            d10 = w.d(arrayList, Long.valueOf(j10), true);
        }
        while (d10 < arrayList2.size()) {
            q qVar = (q) arrayList2.get(d10);
            qVar.A(0);
            int length = qVar.f5186a.length;
            this.f28021h.a(length, qVar);
            this.f28021h.d(((Long) arrayList.get(d10)).longValue(), 1, length, 0, null);
            d10++;
        }
    }

    @Override // u7.h
    public final void f(u7.j jVar) {
        boolean z10;
        if (this.f28023j == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        this.f28020g = jVar;
        this.f28021h = jVar.n(0, 3);
        this.f28020g.e();
        this.f28020g.i(new r(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f28021h.e(this.f28018d);
        this.f28023j = 1;
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        boolean z10;
        int i6 = this.f28023j;
        if (i6 != 0 && i6 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        this.f28024k = j11;
        if (this.f28023j == 2) {
            this.f28023j = 1;
        }
        if (this.f28023j == 4) {
            this.f28023j = 3;
        }
    }

    @Override // u7.h
    public final int h(u7.i iVar, s sVar) {
        boolean z10;
        boolean z11;
        int i6;
        int i10 = this.f28023j;
        boolean z12 = true;
        if (i10 != 0 && i10 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        int i11 = this.f28023j;
        int i12 = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
        q qVar = this.f28017c;
        if (i11 == 1) {
            if (iVar.getLength() != -1) {
                i6 = qc.a.D(iVar.getLength());
            } else {
                i6 = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
            }
            qVar.x(i6);
            this.f28022i = 0;
            this.f28023j = 2;
        }
        if (this.f28023j == 2) {
            int length = qVar.f5186a.length;
            int i13 = this.f28022i;
            if (length == i13) {
                qVar.a(i13 + Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
            }
            byte[] bArr = qVar.f5186a;
            int i14 = this.f28022i;
            int read = iVar.read(bArr, i14, bArr.length - i14);
            if (read != -1) {
                this.f28022i += read;
            }
            long length2 = iVar.getLength();
            if ((length2 != -1 && this.f28022i == length2) || read == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                g gVar = this.f28015a;
                try {
                    j d10 = gVar.d();
                    while (d10 == null) {
                        Thread.sleep(5L);
                        d10 = gVar.d();
                    }
                    d10.r(this.f28022i);
                    d10.f6360w.put(qVar.f5186a, 0, this.f28022i);
                    d10.f6360w.limit(this.f28022i);
                    gVar.e(d10);
                    k c10 = gVar.c();
                    while (c10 == null) {
                        Thread.sleep(5L);
                        c10 = gVar.c();
                    }
                    for (int i15 = 0; i15 < c10.i(); i15++) {
                        List<a> h10 = c10.h(c10.f(i15));
                        this.f28016b.getClass();
                        byte[] i16 = df.b.i(h10);
                        this.f28019e.add(Long.valueOf(c10.f(i15)));
                        this.f.add(new q(i16));
                    }
                    c10.n();
                    c();
                    this.f28023j = 4;
                } catch (SubtitleDecoderException e10) {
                    throw ParserException.a("SubtitleDecoder failed.", e10);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        if (this.f28023j == 3) {
            if (iVar.getLength() != -1) {
                i12 = qc.a.D(iVar.getLength());
            }
            if (iVar.i(i12) != -1) {
                z12 = false;
            }
            if (z12) {
                c();
                this.f28023j = 4;
            }
        }
        if (this.f28023j != 4) {
            return 0;
        }
        return -1;
    }
}
