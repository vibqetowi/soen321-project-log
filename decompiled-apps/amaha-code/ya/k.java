package ya;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public final class k {
    public static <TResult> TResult a(h<TResult> hVar) {
        v9.o.g("Must not be called on the main application thread");
        if (hVar != null) {
            if (hVar.isComplete()) {
                return (TResult) i(hVar);
            }
            n nVar = new n();
            w2.r rVar = j.f38394b;
            hVar.addOnSuccessListener(rVar, nVar);
            hVar.addOnFailureListener(rVar, nVar);
            hVar.addOnCanceledListener(rVar, nVar);
            nVar.f38397a.await();
            return (TResult) i(hVar);
        }
        throw new NullPointerException("Task must not be null");
    }

    public static <TResult> TResult b(h<TResult> hVar, long j10, TimeUnit timeUnit) {
        v9.o.g("Must not be called on the main application thread");
        if (hVar != null) {
            if (timeUnit != null) {
                if (hVar.isComplete()) {
                    return (TResult) i(hVar);
                }
                n nVar = new n();
                w2.r rVar = j.f38394b;
                hVar.addOnSuccessListener(rVar, nVar);
                hVar.addOnFailureListener(rVar, nVar);
                hVar.addOnCanceledListener(rVar, nVar);
                if (nVar.f38397a.await(j10, timeUnit)) {
                    return (TResult) i(hVar);
                }
                throw new TimeoutException("Timed out waiting for Task");
            }
            throw new NullPointerException("TimeUnit must not be null");
        }
        throw new NullPointerException("Task must not be null");
    }

    @Deprecated
    public static v c(Executor executor, Callable callable) {
        if (executor != null) {
            v vVar = new v();
            executor.execute(new androidx.work.n(vVar, 29, callable));
            return vVar;
        }
        throw new NullPointerException("Executor must not be null");
    }

    public static v d(Exception exc) {
        v vVar = new v();
        vVar.a(exc);
        return vVar;
    }

    public static v e(Object obj) {
        v vVar = new v();
        vVar.b(obj);
        return vVar;
    }

    public static v f(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((h) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            v vVar = new v();
            o oVar = new o(list.size(), vVar);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                w2.r rVar = j.f38394b;
                hVar.addOnSuccessListener(rVar, oVar);
                hVar.addOnFailureListener(rVar, oVar);
                hVar.addOnCanceledListener(rVar, oVar);
            }
            return vVar;
        }
        return e(null);
    }

    public static v g(h... hVarArr) {
        if (hVarArr.length == 0) {
            return e(null);
        }
        return f(Arrays.asList(hVarArr));
    }

    public static h<List<h<?>>> h(h<?>... hVarArr) {
        if (hVarArr.length == 0) {
            return e(Collections.emptyList());
        }
        List asList = Arrays.asList(hVarArr);
        if (asList != null && !asList.isEmpty()) {
            return f(asList).continueWithTask(j.f38393a, new m(asList));
        }
        return e(Collections.emptyList());
    }

    public static Object i(h hVar) {
        if (hVar.isSuccessful()) {
            return hVar.getResult();
        }
        if (hVar.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.getException());
    }
}
