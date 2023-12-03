package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.f;
import androidx.emoji2.text.l;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0.k;
/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public final class l extends f.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2071d = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class b implements f.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f2072a;

        /* renamed from: b  reason: collision with root package name */
        public final p0.f f2073b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2074c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f2075d;

        /* renamed from: e  reason: collision with root package name */
        public Handler f2076e;
        public Executor f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f2077g;

        /* renamed from: h  reason: collision with root package name */
        public f.h f2078h;

        public b(Context context, p0.f fVar) {
            a aVar = l.f2071d;
            this.f2075d = new Object();
            if (context != null) {
                this.f2072a = context.getApplicationContext();
                this.f2073b = fVar;
                this.f2074c = aVar;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        @Override // androidx.emoji2.text.f.g
        public final void a(f.h hVar) {
            synchronized (this.f2075d) {
                this.f2078h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f2075d) {
                this.f2078h = null;
                Handler handler = this.f2076e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f2076e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2077g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.f2077g = null;
            }
        }

        public final void c() {
            synchronized (this.f2075d) {
                if (this.f2078h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f2077g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new Runnable(this) { // from class: androidx.emoji2.text.m

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ l.b f2080v;

                    {
                        this.f2080v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                l.b bVar = this.f2080v;
                                synchronized (bVar.f2075d) {
                                    if (bVar.f2078h != null) {
                                        try {
                                            p0.m d10 = bVar.d();
                                            int i6 = d10.f27858e;
                                            if (i6 == 2) {
                                                synchronized (bVar.f2075d) {
                                                }
                                            }
                                            if (i6 == 0) {
                                                int i10 = o0.k.f26897a;
                                                k.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                l.a aVar = bVar.f2074c;
                                                Context context = bVar.f2072a;
                                                aVar.getClass();
                                                Typeface b10 = j0.h.f21630a.b(context, new p0.m[]{d10}, 0);
                                                MappedByteBuffer e10 = j0.p.e(bVar.f2072a, d10.f27854a);
                                                if (e10 != null && b10 != null) {
                                                    try {
                                                        k.a.a("EmojiCompat.MetadataRepo.create");
                                                        o oVar = new o(b10, n.a(e10));
                                                        k.a.b();
                                                        k.a.b();
                                                        synchronized (bVar.f2075d) {
                                                            f.h hVar = bVar.f2078h;
                                                            if (hVar != null) {
                                                                hVar.b(oVar);
                                                            }
                                                        }
                                                        bVar.b();
                                                        return;
                                                    } catch (Throwable th2) {
                                                        int i11 = o0.k.f26897a;
                                                        k.a.b();
                                                        throw th2;
                                                    }
                                                }
                                                throw new RuntimeException("Unable to open file.");
                                            }
                                            throw new RuntimeException("fetchFonts result is not OK. (" + i6 + ")");
                                        } catch (Throwable th3) {
                                            synchronized (bVar.f2075d) {
                                                f.h hVar2 = bVar.f2078h;
                                                if (hVar2 != null) {
                                                    hVar2.a(th3);
                                                }
                                                bVar.b();
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                }
                            default:
                                this.f2080v.c();
                                return;
                        }
                    }
                });
            }
        }

        public final p0.m d() {
            try {
                a aVar = this.f2074c;
                Context context = this.f2072a;
                p0.f fVar = this.f2073b;
                aVar.getClass();
                p0.l a10 = p0.e.a(context, fVar);
                int i6 = a10.f27852a;
                if (i6 == 0) {
                    p0.m[] mVarArr = a10.f27853b;
                    if (mVarArr != null && mVarArr.length != 0) {
                        return mVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(defpackage.c.q("fetchFonts failed (", i6, ")"));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public l(Context context, p0.f fVar) {
        super(new b(context, fVar));
    }
}
