package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class JobCancellationException extends CancellationException {

    /* renamed from: u  reason: collision with root package name */
    public final transient c1 f23479u;

    public JobCancellationException(String str, Throwable th2, c1 c1Var) {
        super(str);
        this.f23479u = c1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!kotlin.jvm.internal.i.b(jobCancellationException.getMessage(), getMessage()) || !kotlin.jvm.internal.i.b(jobCancellationException.f23479u, this.f23479u) || !kotlin.jvm.internal.i.b(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i6;
        String message = getMessage();
        kotlin.jvm.internal.i.d(message);
        int hashCode = (this.f23479u.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i6 = cause.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f23479u;
    }
}
