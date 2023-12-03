package ya;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public abstract class h<TResult> {
    public h<TResult> addOnCanceledListener(Activity activity, c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public h<TResult> addOnCompleteListener(Activity activity, d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract h<TResult> addOnFailureListener(Activity activity, e eVar);

    public abstract h<TResult> addOnFailureListener(Executor executor, e eVar);

    public abstract h<TResult> addOnFailureListener(e eVar);

    public abstract h<TResult> addOnSuccessListener(Activity activity, f<? super TResult> fVar);

    public abstract h<TResult> addOnSuccessListener(Executor executor, f<? super TResult> fVar);

    public abstract h<TResult> addOnSuccessListener(f<? super TResult> fVar);

    public <TContinuationResult> h<TContinuationResult> continueWith(b<TResult, TContinuationResult> bVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> continueWithTask(b<TResult, h<TContinuationResult>> bVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract <X extends Throwable> TResult getResult(Class<X> cls);

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public <TContinuationResult> h<TContinuationResult> onSuccessTask(g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public h<TResult> addOnCanceledListener(c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public h<TResult> addOnCompleteListener(d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> continueWith(Executor executor, b<TResult, TContinuationResult> bVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> continueWithTask(Executor executor, b<TResult, h<TContinuationResult>> bVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> onSuccessTask(Executor executor, g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public h<TResult> addOnCanceledListener(Executor executor, c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public h<TResult> addOnCompleteListener(Executor executor, d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
