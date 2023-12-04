package coil.request;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.ImageLoader;
import coil.request.RequestDelegate;
import coil.target.ViewTarget;
import coil.util.Lifecycles;
import coil.util.Utils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
/* compiled from: RequestDelegate.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0007J\b\u0010\u0014\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcoil/request/ViewTargetRequestDelegate;", "Lcoil/request/RequestDelegate;", "imageLoader", "Lcoil/ImageLoader;", "initialRequest", "Lcoil/request/ImageRequest;", TypedValues.AttributesType.S_TARGET, "Lcoil/target/ViewTarget;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "job", "Lkotlinx/coroutines/Job;", "(Lcoil/ImageLoader;Lcoil/request/ImageRequest;Lcoil/target/ViewTarget;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "assertActive", "", "dispose", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "restart", TtmlNode.START, "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewTargetRequestDelegate implements RequestDelegate {
    private final ImageLoader imageLoader;
    private final ImageRequest initialRequest;
    private final Job job;
    private final Lifecycle lifecycle;
    private final ViewTarget<?> target;

    @Override // coil.request.RequestDelegate
    public /* synthetic */ void complete() {
        RequestDelegate.CC.$default$complete(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    public ViewTargetRequestDelegate(ImageLoader imageLoader, ImageRequest imageRequest, ViewTarget<?> viewTarget, Lifecycle lifecycle, Job job) {
        this.imageLoader = imageLoader;
        this.initialRequest = imageRequest;
        this.target = viewTarget;
        this.lifecycle = lifecycle;
        this.job = job;
    }

    public final void restart() {
        this.imageLoader.enqueue(this.initialRequest);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // coil.request.RequestDelegate
    public void assertActive() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        Utils.getRequestManager(this.target.getView()).setRequest(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    @Override // coil.request.RequestDelegate
    public void start() {
        this.lifecycle.addObserver(this);
        ViewTarget<?> viewTarget = this.target;
        if (viewTarget instanceof LifecycleObserver) {
            Lifecycles.removeAndAddObserver(this.lifecycle, (LifecycleObserver) viewTarget);
        }
        Utils.getRequestManager(this.target.getView()).setRequest(this);
    }

    @Override // coil.request.RequestDelegate
    public void dispose() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
        ViewTarget<?> viewTarget = this.target;
        if (viewTarget instanceof LifecycleObserver) {
            this.lifecycle.removeObserver((LifecycleObserver) viewTarget);
        }
        this.lifecycle.removeObserver(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Utils.getRequestManager(this.target.getView()).dispose();
    }
}
