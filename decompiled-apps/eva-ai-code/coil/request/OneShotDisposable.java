package coil.request;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
/* compiled from: Disposable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcoil/request/OneShotDisposable;", "Lcoil/request/Disposable;", "job", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "(Lkotlinx/coroutines/Deferred;)V", "isDisposed", "", "()Z", "getJob", "()Lkotlinx/coroutines/Deferred;", "dispose", "", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneShotDisposable implements Disposable {
    private final Deferred<ImageResult> job;

    /* JADX WARN: Multi-variable type inference failed */
    public OneShotDisposable(Deferred<? extends ImageResult> deferred) {
        this.job = deferred;
    }

    @Override // coil.request.Disposable
    public Deferred<ImageResult> getJob() {
        return this.job;
    }

    @Override // coil.request.Disposable
    public boolean isDisposed() {
        return !getJob().isActive();
    }

    @Override // coil.request.Disposable
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        Job.DefaultImpls.cancel$default((Job) getJob(), (CancellationException) null, 1, (Object) null);
    }
}
