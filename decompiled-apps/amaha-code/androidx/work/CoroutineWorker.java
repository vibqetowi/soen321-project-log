package androidx.work;

import android.content.Context;
import androidx.work.p;
import com.appsflyer.R;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.o0;
import ls.f;
import x2.a;
/* compiled from: CoroutineWorker.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0006\u0010\u0012\u001a\u00020\u000bR\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u00020\u001d8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/p;", "Lrc/b;", "Landroidx/work/p$a;", "startWork", "doWork", "(Lls/d;)Ljava/lang/Object;", "Landroidx/work/g;", "getForegroundInfo", "Landroidx/work/d;", "data", "Lhs/k;", "setProgress", "(Landroidx/work/d;Lls/d;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/g;Lls/d;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "Lkotlinx/coroutines/s;", "job", "Lkotlinx/coroutines/s;", "getJob$work_runtime_ktx_release", "()Lkotlinx/coroutines/s;", "Lx2/c;", "future", "Lx2/c;", "getFuture$work_runtime_ktx_release", "()Lx2/c;", "Lkotlinx/coroutines/a0;", "coroutineContext", "Lkotlinx/coroutines/a0;", "getCoroutineContext", "()Lkotlinx/coroutines/a0;", "getCoroutineContext$annotations", "()V", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends p {
    private final a0 coroutineContext;
    private final x2.c<p.a> future;
    private final kotlinx.coroutines.s job;

    /* compiled from: CoroutineWorker.kt */
    @ns.e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u */
        public m f3190u;

        /* renamed from: v */
        public int f3191v;

        /* renamed from: w */
        public final /* synthetic */ m<g> f3192w;

        /* renamed from: x */
        public final /* synthetic */ CoroutineWorker f3193x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m<g> mVar, CoroutineWorker coroutineWorker, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f3192w = mVar;
            this.f3193x = coroutineWorker;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f3192w, this.f3193x, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            m<g> mVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f3191v;
            if (i6 != 0) {
                if (i6 == 1) {
                    mVar = this.f3190u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                m<g> mVar2 = this.f3192w;
                this.f3190u = mVar2;
                this.f3191v = 1;
                Object foregroundInfo = this.f3193x.getForegroundInfo(this);
                if (foregroundInfo == aVar) {
                    return aVar;
                }
                mVar = mVar2;
                obj = foregroundInfo;
            }
            mVar.f3326v.i(obj);
            return hs.k.f19476a;
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @ns.e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u */
        public int f3194u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ls.d<? super b> dVar) {
            super(2, dVar);
            CoroutineWorker.this = r1;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f3194u;
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f3194u = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                coroutineWorker.getFuture$work_runtime_ktx_release().i((p.a) obj);
            } catch (Throwable th2) {
                coroutineWorker.getFuture$work_runtime_ktx_release().j(th2);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        kotlin.jvm.internal.i.g(appContext, "appContext");
        kotlin.jvm.internal.i.g(params, "params");
        this.job = new e1(null);
        x2.c<p.a> cVar = new x2.c<>();
        this.future = cVar;
        cVar.d(new androidx.activity.b(6, this), ((y2.b) getTaskExecutor()).f38188a);
        this.coroutineContext = o0.f23640a;
    }

    public static final void _init_$lambda$0(CoroutineWorker this$0) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        if (this$0.future.f37581u instanceof a.b) {
            this$0.job.g(null);
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, ls.d<? super g> dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(ls.d<? super p.a> dVar);

    public a0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(ls.d<? super g> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // androidx.work.p
    public final rc.b<g> getForegroundInfoAsync() {
        e1 e1Var = new e1(null);
        a0 coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        kotlinx.coroutines.internal.c c10 = kotlin.jvm.internal.h.c(f.a.a(coroutineContext, e1Var));
        m mVar = new m(e1Var);
        ta.v.H(c10, null, 0, new a(mVar, this, null), 3);
        return mVar;
    }

    public final x2.c<p.a> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final kotlinx.coroutines.s getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.p
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(g gVar, ls.d<? super hs.k> dVar) {
        rc.b<Void> foregroundAsync = setForegroundAsync(gVar);
        kotlin.jvm.internal.i.f(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
            kVar.u();
            foregroundAsync.d(new n(kVar, 0, foregroundAsync), e.f3238u);
            kVar.p(new o(foregroundAsync));
            Object s10 = kVar.s();
            if (s10 == ms.a.COROUTINE_SUSPENDED) {
                return s10;
            }
        }
        return hs.k.f19476a;
    }

    public final Object setProgress(d dVar, ls.d<? super hs.k> dVar2) {
        rc.b<Void> progressAsync = setProgressAsync(dVar);
        kotlin.jvm.internal.i.f(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar2));
            kVar.u();
            progressAsync.d(new n(kVar, 0, progressAsync), e.f3238u);
            kVar.p(new o(progressAsync));
            Object s10 = kVar.s();
            if (s10 == ms.a.COROUTINE_SUSPENDED) {
                return s10;
            }
        }
        return hs.k.f19476a;
    }

    @Override // androidx.work.p
    public final rc.b<p.a> startWork() {
        ta.v.H(kotlin.jvm.internal.h.c(getCoroutineContext().h(this.job)), null, 0, new b(null), 3);
        return this.future;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
