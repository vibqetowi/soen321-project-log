package r7;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import p8.j;
import r7.e;
/* compiled from: SimpleDecoder.java */
/* loaded from: classes.dex */
public abstract class g<I extends DecoderInputBuffer, O extends e, E extends DecoderException> implements d<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    public final a f30546a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f30547b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<I> f30548c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<O> f30549d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final I[] f30550e;
    public final O[] f;

    /* renamed from: g  reason: collision with root package name */
    public int f30551g;

    /* renamed from: h  reason: collision with root package name */
    public int f30552h;

    /* renamed from: i  reason: collision with root package name */
    public I f30553i;

    /* renamed from: j  reason: collision with root package name */
    public SubtitleDecoderException f30554j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f30555k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f30556l;

    /* compiled from: SimpleDecoder.java */
    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ g f30557u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p8.e eVar) {
            super("ExoPlayer:SimpleDecoder");
            this.f30557u = eVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            g gVar = this.f30557u;
            gVar.getClass();
            do {
                try {
                } catch (InterruptedException e10) {
                    throw new IllegalStateException(e10);
                }
            } while (gVar.g());
        }
    }

    public g(I[] iArr, O[] oArr) {
        this.f30550e = iArr;
        this.f30551g = iArr.length;
        for (int i6 = 0; i6 < this.f30551g; i6++) {
            this.f30550e[i6] = new j();
        }
        this.f = oArr;
        this.f30552h = oArr.length;
        for (int i10 = 0; i10 < this.f30552h; i10++) {
            this.f[i10] = new p8.d((p8.e) this);
        }
        a aVar = new a((p8.e) this);
        this.f30546a = aVar;
        aVar.start();
    }

    @Override // r7.d
    public final void a() {
        synchronized (this.f30547b) {
            this.f30556l = true;
            this.f30547b.notify();
        }
        try {
            this.f30546a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // r7.d
    public final Object c() {
        synchronized (this.f30547b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f30554j;
                if (subtitleDecoderException == null) {
                    if (this.f30549d.isEmpty()) {
                        return null;
                    }
                    return this.f30549d.removeFirst();
                }
                throw subtitleDecoderException;
            } finally {
            }
        }
    }

    @Override // r7.d
    public final Object d() {
        boolean z10;
        I i6;
        synchronized (this.f30547b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f30554j;
                if (subtitleDecoderException == null) {
                    if (this.f30553i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sc.b.C(z10);
                    int i10 = this.f30551g;
                    if (i10 == 0) {
                        i6 = null;
                    } else {
                        I[] iArr = this.f30550e;
                        int i11 = i10 - 1;
                        this.f30551g = i11;
                        i6 = iArr[i11];
                    }
                    this.f30553i = i6;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i6;
    }

    @Override // r7.d
    public final void e(j jVar) {
        boolean z10;
        synchronized (this.f30547b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.f30554j;
                if (subtitleDecoderException == null) {
                    boolean z11 = true;
                    if (jVar == this.f30553i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sc.b.q(z10);
                    this.f30548c.addLast(jVar);
                    if (this.f30548c.isEmpty() || this.f30552h <= 0) {
                        z11 = false;
                    }
                    if (z11) {
                        this.f30547b.notify();
                    }
                    this.f30553i = null;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract SubtitleDecoderException f(DecoderInputBuffer decoderInputBuffer, e eVar, boolean z10);

    @Override // r7.d
    public final void flush() {
        synchronized (this.f30547b) {
            this.f30555k = true;
            I i6 = this.f30553i;
            if (i6 != null) {
                i6.n();
                int i10 = this.f30551g;
                this.f30551g = i10 + 1;
                this.f30550e[i10] = i6;
                this.f30553i = null;
            }
            while (!this.f30548c.isEmpty()) {
                I removeFirst = this.f30548c.removeFirst();
                removeFirst.n();
                int i11 = this.f30551g;
                this.f30551g = i11 + 1;
                this.f30550e[i11] = removeFirst;
            }
            while (!this.f30549d.isEmpty()) {
                this.f30549d.removeFirst().n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        SubtitleDecoderException subtitleDecoderException;
        SubtitleDecoderException subtitleDecoderException2;
        boolean z10;
        synchronized (this.f30547b) {
            while (!this.f30556l) {
                try {
                    if (!this.f30548c.isEmpty() && this.f30552h > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.f30547b.wait();
                } finally {
                }
            }
            if (this.f30556l) {
                return false;
            }
            I removeFirst = this.f30548c.removeFirst();
            O[] oArr = this.f;
            int i6 = this.f30552h - 1;
            this.f30552h = i6;
            O o10 = oArr[i6];
            boolean z11 = this.f30555k;
            this.f30555k = false;
            if (removeFirst.k(4)) {
                o10.j(4);
            } else {
                if (removeFirst.l()) {
                    o10.j(LinearLayoutManager.INVALID_OFFSET);
                }
                try {
                    subtitleDecoderException2 = f(removeFirst, o10, z11);
                } catch (OutOfMemoryError e10) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e10);
                    subtitleDecoderException2 = subtitleDecoderException;
                    if (subtitleDecoderException2 != null) {
                    }
                    synchronized (this.f30547b) {
                    }
                } catch (RuntimeException e11) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e11);
                    subtitleDecoderException2 = subtitleDecoderException;
                    if (subtitleDecoderException2 != null) {
                    }
                    synchronized (this.f30547b) {
                    }
                }
                if (subtitleDecoderException2 != null) {
                    synchronized (this.f30547b) {
                        this.f30554j = subtitleDecoderException2;
                    }
                    return false;
                }
            }
            synchronized (this.f30547b) {
                if (this.f30555k) {
                    o10.n();
                } else if (o10.l()) {
                    o10.n();
                } else {
                    this.f30549d.addLast(o10);
                }
                removeFirst.n();
                int i10 = this.f30551g;
                this.f30551g = i10 + 1;
                this.f30550e[i10] = removeFirst;
            }
            return true;
        }
    }
}
