package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.Spanned;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f2033i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile f f2034j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f2035a;

    /* renamed from: b  reason: collision with root package name */
    public final t.d f2036b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f2037c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f2038d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2039e;
    public final g f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2040g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.emoji2.text.d f2041h;

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile j f2042b;

        /* renamed from: c  reason: collision with root package name */
        public volatile o f2043c;

        public a(f fVar) {
            super(fVar);
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f2044a;

        public b(f fVar) {
            this.f2044a = fVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f2045a;

        /* renamed from: b  reason: collision with root package name */
        public int f2046b = 0;

        /* renamed from: c  reason: collision with root package name */
        public final androidx.emoji2.text.d f2047c = new androidx.emoji2.text.d();

        public c(g gVar) {
            this.f2045a = gVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0031f implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final ArrayList f2048u;

        /* renamed from: v  reason: collision with root package name */
        public final int f2049v;

        public RunnableC0031f(List list, int i6, Throwable th2) {
            if (list != null) {
                this.f2048u = new ArrayList(list);
                this.f2049v = i6;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f2048u;
            int size = arrayList.size();
            int i6 = 0;
            if (this.f2049v != 1) {
                while (i6 < size) {
                    ((e) arrayList.get(i6)).a();
                    i6++;
                }
                return;
            }
            while (i6 < size) {
                ((e) arrayList.get(i6)).b();
                i6++;
            }
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th2);

        public abstract void b(o oVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class i {
    }

    public f(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2035a = reentrantReadWriteLock;
        this.f2037c = 3;
        g gVar = aVar.f2045a;
        this.f = gVar;
        int i6 = aVar.f2046b;
        this.f2040g = i6;
        this.f2041h = aVar.f2047c;
        this.f2038d = new Handler(Looper.getMainLooper());
        this.f2036b = new t.d();
        a aVar2 = new a(this);
        this.f2039e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i6 == 0) {
            try {
                this.f2037c = 0;
            } catch (Throwable th2) {
                this.f2035a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new androidx.emoji2.text.e(aVar2));
            } catch (Throwable th3) {
                d(th3);
            }
        }
    }

    public static f a() {
        f fVar;
        boolean z10;
        synchronized (f2033i) {
            fVar = f2034j;
            if (fVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return fVar;
    }

    public final int b() {
        this.f2035a.readLock().lock();
        try {
            return this.f2037c;
        } finally {
            this.f2035a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11 = true;
        if (this.f2040g == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (b() != 1) {
                z11 = false;
            }
            if (z11) {
                return;
            }
            this.f2035a.writeLock().lock();
            try {
                if (this.f2037c == 0) {
                    return;
                }
                this.f2037c = 0;
                this.f2035a.writeLock().unlock();
                a aVar = this.f2039e;
                f fVar = aVar.f2044a;
                try {
                    fVar.f.a(new androidx.emoji2.text.e(aVar));
                    return;
                } catch (Throwable th2) {
                    fVar.d(th2);
                    return;
                }
            } finally {
                this.f2035a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f2035a.writeLock().lock();
        try {
            this.f2037c = 2;
            arrayList.addAll(this.f2036b);
            this.f2036b.clear();
            this.f2035a.writeLock().unlock();
            this.f2038d.post(new RunnableC0031f(arrayList, this.f2037c, th2));
        } catch (Throwable th3) {
            this.f2035a.writeLock().unlock();
            throw th3;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f2035a.writeLock().lock();
        try {
            this.f2037c = 1;
            arrayList.addAll(this.f2036b);
            this.f2036b.clear();
            this.f2035a.writeLock().unlock();
            this.f2038d.post(new RunnableC0031f(arrayList, this.f2037c, null));
        } catch (Throwable th2) {
            this.f2035a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e1, code lost:
        if (r3.b(r15, r6, r13, r5.f2066d.f2087b) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e3, code lost:
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e5, code lost:
        r0 = new androidx.emoji2.text.t((android.text.Spannable) new android.text.SpannableString(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
        r10 = r5.f2066d.f2087b;
        r3.f2060a.getClass();
        r0.setSpan(new androidx.emoji2.text.q(r10), r6, r13, 33);
        r7 = r7 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015e A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence f(int i6, int i10, CharSequence charSequence) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        j.a aVar;
        int codePointAt;
        int i11;
        int i12;
        int a10;
        k[] kVarArr;
        boolean z14 = false;
        if (b() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i6 >= 0) {
                if (i10 >= 0) {
                    if (i6 <= i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    kc.f.m("start should be <= than end", z11);
                    t tVar = null;
                    if (charSequence == null) {
                        return null;
                    }
                    if (i6 <= charSequence.length()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    kc.f.m("start should be < than charSequence length", z12);
                    if (i10 <= charSequence.length()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    kc.f.m("end should be < than charSequence length", z13);
                    if (charSequence.length() != 0 && i6 != i10) {
                        j jVar = this.f2039e.f2042b;
                        jVar.getClass();
                        boolean z15 = charSequence instanceof p;
                        if (z15) {
                            ((p) charSequence).a();
                        }
                        if (!z15) {
                            try {
                                if (!(charSequence instanceof Spannable)) {
                                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i6 - 1, i10 + 1, k.class) <= i10) {
                                        tVar = new t(charSequence);
                                    }
                                    if (tVar != null && (kVarArr = (k[]) tVar.getSpans(i6, i10, k.class)) != null && kVarArr.length > 0) {
                                        for (k kVar : kVarArr) {
                                            int spanStart = tVar.getSpanStart(kVar);
                                            int spanEnd = tVar.getSpanEnd(kVar);
                                            if (spanStart != i10) {
                                                tVar.removeSpan(kVar);
                                            }
                                            i6 = Math.min(spanStart, i6);
                                            i10 = Math.max(spanEnd, i10);
                                        }
                                    }
                                    if (i6 != i10 && i6 < charSequence.length()) {
                                        aVar = new j.a(jVar.f2061b.f2084c);
                                        codePointAt = Character.codePointAt(charSequence, i6);
                                        int i13 = 0;
                                        loop1: while (true) {
                                            i11 = codePointAt;
                                            while (true) {
                                                i12 = i6;
                                                while (i6 < i10 && i13 < Integer.MAX_VALUE) {
                                                    a10 = aVar.a(i11);
                                                    if (a10 == 1) {
                                                        if (a10 != 2) {
                                                            if (a10 == 3) {
                                                                break;
                                                            }
                                                        } else {
                                                            i6 += Character.charCount(i11);
                                                            if (i6 < i10) {
                                                                i11 = Character.codePointAt(charSequence, i6);
                                                            }
                                                        }
                                                    } else {
                                                        i6 = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                                                        if (i6 < i10) {
                                                            i11 = Character.codePointAt(charSequence, i6);
                                                        }
                                                    }
                                                }
                                            }
                                            codePointAt = i11;
                                        }
                                        if (aVar.f2063a == 2 && aVar.f2065c.f2087b != null && (aVar.f > 1 || aVar.c())) {
                                            z14 = true;
                                        }
                                        if (z14 && i13 < Integer.MAX_VALUE && !jVar.b(charSequence, i12, i6, aVar.f2065c.f2087b)) {
                                            if (tVar == null) {
                                                tVar = new t(charSequence);
                                            }
                                            androidx.emoji2.text.i iVar = aVar.f2065c.f2087b;
                                            jVar.f2060a.getClass();
                                            tVar.setSpan(new q(iVar), i12, i6, 33);
                                        }
                                        if (tVar == null) {
                                            Spannable spannable = tVar.f2093v;
                                            if (z15) {
                                                ((p) charSequence).b();
                                            }
                                            return spannable;
                                        }
                                        if (!z15) {
                                            return charSequence;
                                        }
                                        return charSequence;
                                    }
                                    return charSequence;
                                }
                            } finally {
                                if (z15) {
                                    ((p) charSequence).b();
                                }
                            }
                        }
                        tVar = new t((Spannable) charSequence);
                        if (tVar != null) {
                            while (r7 < r6) {
                            }
                        }
                        if (i6 != i10) {
                            aVar = new j.a(jVar.f2061b.f2084c);
                            codePointAt = Character.codePointAt(charSequence, i6);
                            int i132 = 0;
                            loop1: while (true) {
                                i11 = codePointAt;
                                while (true) {
                                    i12 = i6;
                                    while (i6 < i10) {
                                        a10 = aVar.a(i11);
                                        if (a10 == 1) {
                                        }
                                    }
                                }
                                codePointAt = i11;
                            }
                            if (aVar.f2063a == 2) {
                                z14 = true;
                            }
                            if (z14) {
                                if (tVar == null) {
                                }
                                androidx.emoji2.text.i iVar2 = aVar.f2065c.f2087b;
                                jVar.f2060a.getClass();
                                tVar.setSpan(new q(iVar2), i12, i6, 33);
                            }
                            if (tVar == null) {
                            }
                        }
                        return charSequence;
                    }
                    return charSequence;
                }
                throw new IllegalArgumentException("end cannot be negative");
            }
            throw new IllegalArgumentException("start cannot be negative");
        }
        throw new IllegalStateException("Not initialized yet");
    }

    public final void g(e eVar) {
        if (eVar != null) {
            this.f2035a.writeLock().lock();
            try {
                if (this.f2037c != 1 && this.f2037c != 2) {
                    this.f2036b.add(eVar);
                    return;
                }
                this.f2038d.post(new RunnableC0031f(Arrays.asList(eVar), this.f2037c, null));
                return;
            } finally {
                this.f2035a.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public void a() {
        }

        public void b() {
        }
    }
}
