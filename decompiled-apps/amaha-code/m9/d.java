package m9;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public long f24953b;

    /* renamed from: c  reason: collision with root package name */
    public final g f24954c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f24955d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseIntArray f24956e;
    public h0 f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f24957g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayDeque f24958h;

    /* renamed from: i  reason: collision with root package name */
    public final com.google.android.gms.internal.cast.f f24959i;

    /* renamed from: j  reason: collision with root package name */
    public final g0 f24960j;

    /* renamed from: k  reason: collision with root package name */
    public BasePendingResult f24961k;

    /* renamed from: l  reason: collision with root package name */
    public BasePendingResult f24962l;

    /* renamed from: m  reason: collision with root package name */
    public final HashSet f24963m = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final p9.b f24952a = new p9.b("MediaQueue");

    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    /* loaded from: classes.dex */
    public static abstract class a {
    }

    public d(g gVar) {
        this.f24954c = gVar;
        Math.max(20, 1);
        this.f24955d = new ArrayList();
        this.f24956e = new SparseIntArray();
        this.f24957g = new ArrayList();
        this.f24958h = new ArrayDeque(20);
        this.f24959i = new com.google.android.gms.internal.cast.f(Looper.getMainLooper());
        this.f24960j = new g0(this);
        i0 i0Var = new i0(this);
        gVar.getClass();
        v9.o.d("Must be called from the main thread.");
        gVar.f24990h.add(i0Var);
        this.f = new h0(this);
        this.f24953b = d();
        b();
    }

    public static /* synthetic */ void c(d dVar) {
        dVar.f24956e.clear();
        for (int i6 = 0; i6 < dVar.f24955d.size(); i6++) {
            dVar.f24956e.put(((Integer) dVar.f24955d.get(i6)).intValue(), i6);
        }
    }

    public final void a() {
        e();
        this.f24955d.clear();
        this.f24956e.clear();
        this.f.evictAll();
        this.f24957g.clear();
        this.f24959i.removeCallbacks(this.f24960j);
        this.f24958h.clear();
        BasePendingResult basePendingResult = this.f24962l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f24962l = null;
        }
        BasePendingResult basePendingResult2 = this.f24961k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f24961k = null;
        }
        Iterator it = this.f24963m.iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
        f();
    }

    public final void b() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        v9.o.d("Must be called from the main thread.");
        if (this.f24953b == 0 || (basePendingResult = this.f24962l) != null) {
            return;
        }
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f24962l = null;
        }
        BasePendingResult basePendingResult3 = this.f24961k;
        if (basePendingResult3 != null) {
            basePendingResult3.c();
            this.f24961k = null;
        }
        g gVar = this.f24954c;
        gVar.getClass();
        v9.o.d("Must be called from the main thread.");
        if (!gVar.n()) {
            basePendingResult2 = g.m();
        } else {
            j jVar = new j(gVar, 0);
            g.o(jVar);
            basePendingResult2 = jVar;
        }
        this.f24962l = basePendingResult2;
        basePendingResult2.i(new f0(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
        if (r3 != 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
        if (r1 != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
        if (r4 == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d() {
        int i6;
        k9.n d10 = this.f24954c.d();
        if (d10 != null) {
            MediaInfo mediaInfo = d10.f23170u;
            if (mediaInfo == null) {
                i6 = -1;
            } else {
                i6 = mediaInfo.f7260v;
            }
            int i10 = d10.f23174y;
            int i11 = d10.f23175z;
            int i12 = d10.F;
            boolean z10 = false;
            if (i10 == 1) {
                if (i11 != 1) {
                    if (i11 != 2) {
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                return d10.f23171v;
            }
            return 0L;
        }
        return 0L;
    }

    public final void e() {
        Iterator it = this.f24963m.iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
    }

    public final void f() {
        Iterator it = this.f24963m.iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
    }
}
