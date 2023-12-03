package y7;

import android.util.Log;
import b8.g;
import c9.q;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import com.theinnerhour.b2b.utils.Constants;
import g8.a;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import u7.h;
import u7.i;
import u7.j;
import u7.s;
import u7.t;
import u7.v;
import y7.b;
/* compiled from: JpegExtractor.java */
/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: b  reason: collision with root package name */
    public j f38314b;

    /* renamed from: c  reason: collision with root package name */
    public int f38315c;

    /* renamed from: d  reason: collision with root package name */
    public int f38316d;

    /* renamed from: e  reason: collision with root package name */
    public int f38317e;

    /* renamed from: g  reason: collision with root package name */
    public m8.b f38318g;

    /* renamed from: h  reason: collision with root package name */
    public i f38319h;

    /* renamed from: i  reason: collision with root package name */
    public c f38320i;

    /* renamed from: j  reason: collision with root package name */
    public g f38321j;

    /* renamed from: a  reason: collision with root package name */
    public final q f38313a = new q(6);
    public long f = -1;

    @Override // u7.h
    public final void a() {
        g gVar = this.f38321j;
        if (gVar != null) {
            gVar.getClass();
        }
    }

    @Override // u7.h
    public final boolean b(i iVar) {
        u7.e eVar = (u7.e) iVar;
        if (e(eVar) != 65496) {
            return false;
        }
        int e10 = e(eVar);
        this.f38316d = e10;
        q qVar = this.f38313a;
        if (e10 == 65504) {
            qVar.x(2);
            eVar.d(qVar.f5186a, 0, 2, false);
            eVar.m(qVar.v() - 2, false);
            this.f38316d = e(eVar);
        }
        if (this.f38316d != 65505) {
            return false;
        }
        eVar.m(2, false);
        qVar.x(6);
        eVar.d(qVar.f5186a, 0, 6, false);
        if (qVar.r() != 1165519206 || qVar.v() != 0) {
            return false;
        }
        return true;
    }

    public final void c() {
        d(new a.b[0]);
        j jVar = this.f38314b;
        jVar.getClass();
        jVar.e();
        this.f38314b.i(new t.b(-9223372036854775807L));
        this.f38315c = 6;
    }

    public final void d(a.b... bVarArr) {
        j jVar = this.f38314b;
        jVar.getClass();
        v n10 = jVar.n(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, 4);
        n.a aVar = new n.a();
        aVar.f6664j = "image/jpeg";
        aVar.f6663i = new g8.a(bVarArr);
        n10.e(new n(aVar));
    }

    public final int e(u7.e eVar) {
        q qVar = this.f38313a;
        qVar.x(2);
        eVar.d(qVar.f5186a, 0, 2, false);
        return qVar.v();
    }

    @Override // u7.h
    public final void f(j jVar) {
        this.f38314b = jVar;
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f38315c = 0;
            this.f38321j = null;
        } else if (this.f38315c == 5) {
            g gVar = this.f38321j;
            gVar.getClass();
            gVar.g(j10, j11);
        }
    }

    @Override // u7.h
    public final int h(i iVar, s sVar) {
        int i6;
        String l2;
        String l10;
        b bVar;
        long j10;
        int i10 = this.f38315c;
        q qVar = this.f38313a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.f38320i == null || iVar != this.f38319h) {
                            this.f38319h = iVar;
                            this.f38320i = new c(iVar, this.f);
                        }
                        g gVar = this.f38321j;
                        gVar.getClass();
                        int h10 = gVar.h(this.f38320i, sVar);
                        if (h10 == 1) {
                            sVar.f33905a += this.f;
                        }
                        return h10;
                    }
                    long position = iVar.getPosition();
                    long j11 = this.f;
                    if (position != j11) {
                        sVar.f33905a = j11;
                        return 1;
                    }
                    if (!iVar.d(qVar.f5186a, 0, 1, true)) {
                        c();
                    } else {
                        iVar.k();
                        if (this.f38321j == null) {
                            this.f38321j = new g();
                        }
                        c cVar = new c(iVar, this.f);
                        this.f38320i = cVar;
                        if (this.f38321j.b(cVar)) {
                            g gVar2 = this.f38321j;
                            long j12 = this.f;
                            j jVar = this.f38314b;
                            jVar.getClass();
                            gVar2.r = new d(j12, jVar);
                            m8.b bVar2 = this.f38318g;
                            bVar2.getClass();
                            d(bVar2);
                            this.f38315c = 5;
                        } else {
                            c();
                        }
                    }
                    return 0;
                }
                if (this.f38316d == 65505) {
                    int i11 = this.f38317e;
                    byte[] bArr = new byte[i11];
                    iVar.readFully(bArr, 0, i11);
                    if (this.f38318g == null) {
                        m8.b bVar3 = null;
                        if (i11 + 0 == 0) {
                            l2 = null;
                            i6 = 0;
                        } else {
                            i6 = 0;
                            while (i6 < i11 && bArr[i6] != 0) {
                                i6++;
                            }
                            l2 = w.l(0, bArr, i6 + 0);
                            if (i6 < i11) {
                                i6++;
                            }
                        }
                        if ("http://ns.adobe.com/xap/1.0/".equals(l2)) {
                            if (i11 - i6 == 0) {
                                l10 = null;
                            } else {
                                int i12 = i6;
                                while (i12 < i11 && bArr[i12] != 0) {
                                    i12++;
                                }
                                l10 = w.l(i6, bArr, i12 - i6);
                            }
                            if (l10 != null) {
                                long length = iVar.getLength();
                                if (length != -1) {
                                    try {
                                        bVar = e.a(l10);
                                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                                        Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                        bVar = null;
                                    }
                                    if (bVar != null) {
                                        List<b.a> list = bVar.f38323b;
                                        if (list.size() >= 2) {
                                            long j13 = -1;
                                            long j14 = -1;
                                            long j15 = -1;
                                            long j16 = -1;
                                            boolean z10 = false;
                                            for (int size = list.size() - 1; size >= 0; size--) {
                                                b.a aVar = list.get(size);
                                                z10 |= "video/mp4".equals(aVar.f38324a);
                                                if (size == 0) {
                                                    length -= aVar.f38326c;
                                                    j10 = 0;
                                                } else {
                                                    j10 = length - aVar.f38325b;
                                                }
                                                long j17 = j10;
                                                long j18 = length;
                                                length = j17;
                                                if (z10 && length != j18) {
                                                    j16 = j18 - length;
                                                    j15 = length;
                                                    z10 = false;
                                                }
                                                if (size == 0) {
                                                    j14 = j18;
                                                    j13 = length;
                                                }
                                            }
                                            if (j15 != -1 && j16 != -1 && j13 != -1 && j14 != -1) {
                                                bVar3 = new m8.b(j13, j14, bVar.f38322a, j15, j16);
                                            }
                                        }
                                    }
                                }
                                this.f38318g = bVar3;
                                if (bVar3 != null) {
                                    this.f = bVar3.f24931x;
                                }
                            }
                        }
                    }
                } else {
                    iVar.l(this.f38317e);
                }
                this.f38315c = 0;
                return 0;
            }
            qVar.x(2);
            iVar.readFully(qVar.f5186a, 0, 2);
            this.f38317e = qVar.v() - 2;
            this.f38315c = 2;
            return 0;
        }
        qVar.x(2);
        iVar.readFully(qVar.f5186a, 0, 2);
        int v10 = qVar.v();
        this.f38316d = v10;
        if (v10 == 65498) {
            if (this.f != -1) {
                this.f38315c = 4;
            } else {
                c();
            }
        } else if ((v10 < 65488 || v10 > 65497) && v10 != 65281) {
            this.f38315c = 1;
        }
        return 0;
    }
}
