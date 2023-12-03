package ya;

import android.app.Activity;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public final class v<TResult> extends h<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f38416a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final w4.l f38417b = new w4.l(1);

    /* renamed from: c  reason: collision with root package name */
    public boolean f38418c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f38419d;

    /* renamed from: e  reason: collision with root package name */
    public Object f38420e;
    public Exception f;

    public final void a(Exception exc) {
        if (exc != null) {
            synchronized (this.f38416a) {
                d();
                this.f38418c = true;
                this.f = exc;
            }
            this.f38417b.h(this);
            return;
        }
        throw new NullPointerException("Exception must not be null");
    }

    @Override // ya.h
    public final h<TResult> addOnCanceledListener(Activity activity, c cVar) {
        p pVar = new p(j.f38393a, cVar);
        this.f38417b.g(pVar);
        u.a(activity).b(pVar);
        e();
        return this;
    }

    @Override // ya.h
    public final h<TResult> addOnCompleteListener(Activity activity, d<TResult> dVar) {
        p pVar = new p(j.f38393a, dVar);
        this.f38417b.g(pVar);
        u.a(activity).b(pVar);
        e();
        return this;
    }

    @Override // ya.h
    public final h<TResult> addOnFailureListener(Activity activity, e eVar) {
        p pVar = new p(j.f38393a, eVar);
        this.f38417b.g(pVar);
        u.a(activity).b(pVar);
        e();
        return this;
    }

    @Override // ya.h
    public final h<TResult> addOnSuccessListener(Activity activity, f<? super TResult> fVar) {
        p pVar = new p(j.f38393a, fVar);
        this.f38417b.g(pVar);
        u.a(activity).b(pVar);
        e();
        return this;
    }

    public final void b(Object obj) {
        synchronized (this.f38416a) {
            d();
            this.f38418c = true;
            this.f38420e = obj;
        }
        this.f38417b.h(this);
    }

    public final void c() {
        synchronized (this.f38416a) {
            if (this.f38418c) {
                return;
            }
            this.f38418c = true;
            this.f38419d = true;
            this.f38417b.h(this);
        }
    }

    @Override // ya.h
    public final <TContinuationResult> h<TContinuationResult> continueWith(b<TResult, TContinuationResult> bVar) {
        return continueWith(j.f38393a, bVar);
    }

    @Override // ya.h
    public final <TContinuationResult> h<TContinuationResult> continueWithTask(b<TResult, h<TContinuationResult>> bVar) {
        return continueWithTask(j.f38393a, bVar);
    }

    public final void d() {
        String str;
        if (this.f38418c) {
            int i6 = DuplicateTaskCompletionException.f8744u;
            if (isComplete()) {
                Exception exception = getException();
                if (exception == null) {
                    if (!isSuccessful()) {
                        if (this.f38419d) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(getResult()));
                    }
                } else {
                    str = "failure";
                }
                throw new DuplicateTaskCompletionException("Complete with: ".concat(str), exception);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void e() {
        synchronized (this.f38416a) {
            if (!this.f38418c) {
                return;
            }
            this.f38417b.h(this);
        }
    }

    @Override // ya.h
    public final Exception getException() {
        Exception exc;
        synchronized (this.f38416a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // ya.h
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.f38416a) {
            v9.o.j("Task is not yet complete", this.f38418c);
            if (!this.f38419d) {
                Exception exc = this.f;
                if (exc == null) {
                    tresult = (TResult) this.f38420e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    @Override // ya.h
    public final boolean isCanceled() {
        return this.f38419d;
    }

    @Override // ya.h
    public final boolean isComplete() {
        boolean z10;
        synchronized (this.f38416a) {
            z10 = this.f38418c;
        }
        return z10;
    }

    @Override // ya.h
    public final boolean isSuccessful() {
        boolean z10;
        synchronized (this.f38416a) {
            z10 = false;
            if (this.f38418c && !this.f38419d && this.f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // ya.h
    public final <TContinuationResult> h<TContinuationResult> onSuccessTask(g<TResult, TContinuationResult> gVar) {
        t tVar = j.f38393a;
        v vVar = new v();
        this.f38417b.g(new q(tVar, gVar, vVar, 1));
        e();
        return vVar;
    }

    @Override // ya.h
    public final <TContinuationResult> h<TContinuationResult> continueWith(Executor executor, b<TResult, TContinuationResult> bVar) {
        v vVar = new v();
        this.f38417b.g(new p(executor, bVar, vVar));
        e();
        return vVar;
    }

    @Override // ya.h
    public final <TContinuationResult> h<TContinuationResult> continueWithTask(Executor executor, b<TResult, h<TContinuationResult>> bVar) {
        v vVar = new v();
        this.f38417b.g(new q(executor, bVar, vVar, 0));
        e();
        return vVar;
    }

    @Override // ya.h
    public final h<TResult> addOnCanceledListener(c cVar) {
        addOnCanceledListener(j.f38393a, cVar);
        return this;
    }

    @Override // ya.h
    public final h<TResult> addOnCompleteListener(d<TResult> dVar) {
        this.f38417b.g(new p(j.f38393a, dVar));
        e();
        return this;
    }

    @Override // ya.h
    public final h<TResult> addOnFailureListener(e eVar) {
        addOnFailureListener(j.f38393a, eVar);
        return this;
    }

    @Override // ya.h
    public final h<TResult> addOnSuccessListener(f<? super TResult> fVar) {
        addOnSuccessListener(j.f38393a, fVar);
        return this;
    }

    @Override // ya.h
    public final <TContinuationResult> h<TContinuationResult> onSuccessTask(Executor executor, g<TResult, TContinuationResult> gVar) {
        v vVar = new v();
        this.f38417b.g(new q(executor, gVar, vVar, 1));
        e();
        return vVar;
    }

    @Override // ya.h
    public final h<TResult> addOnCanceledListener(Executor executor, c cVar) {
        this.f38417b.g(new p(executor, cVar));
        e();
        return this;
    }

    @Override // ya.h
    public final h<TResult> addOnFailureListener(Executor executor, e eVar) {
        this.f38417b.g(new p(executor, eVar));
        e();
        return this;
    }

    @Override // ya.h
    public final h<TResult> addOnSuccessListener(Executor executor, f<? super TResult> fVar) {
        this.f38417b.g(new p(executor, fVar));
        e();
        return this;
    }

    @Override // ya.h
    public final h<TResult> addOnCompleteListener(Executor executor, d<TResult> dVar) {
        this.f38417b.g(new p(executor, dVar));
        e();
        return this;
    }

    @Override // ya.h
    public final <X extends Throwable> TResult getResult(Class<X> cls) {
        TResult tresult;
        synchronized (this.f38416a) {
            v9.o.j("Task is not yet complete", this.f38418c);
            if (!this.f38419d) {
                if (!cls.isInstance(this.f)) {
                    Exception exc = this.f;
                    if (exc == null) {
                        tresult = (TResult) this.f38420e;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw cls.cast(this.f);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }
}
