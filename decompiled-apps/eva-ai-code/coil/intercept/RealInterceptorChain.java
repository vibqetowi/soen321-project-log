package coil.intercept;

import coil.EventListener;
import coil.intercept.Interceptor;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.NullRequestData;
import coil.size.Size;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
/* compiled from: RealInterceptorChain.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J&\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002J\u0019\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcoil/intercept/RealInterceptorChain;", "Lcoil/intercept/Interceptor$Chain;", "initialRequest", "Lcoil/request/ImageRequest;", "interceptors", "", "Lcoil/intercept/Interceptor;", FirebaseAnalytics.Param.INDEX, "", "request", "size", "Lcoil/size/Size;", "eventListener", "Lcoil/EventListener;", "isPlaceholderCached", "", "(Lcoil/request/ImageRequest;Ljava/util/List;ILcoil/request/ImageRequest;Lcoil/size/Size;Lcoil/EventListener;Z)V", "getEventListener", "()Lcoil/EventListener;", "getIndex", "()I", "getInitialRequest", "()Lcoil/request/ImageRequest;", "getInterceptors", "()Ljava/util/List;", "()Z", "getRequest", "getSize", "()Lcoil/size/Size;", "checkRequest", "", "interceptor", "copy", "proceed", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withSize", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    private final EventListener eventListener;
    private final int index;
    private final ImageRequest initialRequest;
    private final List<Interceptor> interceptors;
    private final boolean isPlaceholderCached;
    private final ImageRequest request;
    private final Size size;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(ImageRequest imageRequest, List<? extends Interceptor> list, int i, ImageRequest imageRequest2, Size size, EventListener eventListener, boolean z) {
        this.initialRequest = imageRequest;
        this.interceptors = list;
        this.index = i;
        this.request = imageRequest2;
        this.size = size;
        this.eventListener = eventListener;
        this.isPlaceholderCached = z;
    }

    public final ImageRequest getInitialRequest() {
        return this.initialRequest;
    }

    public final List<Interceptor> getInterceptors() {
        return this.interceptors;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // coil.intercept.Interceptor.Chain
    public ImageRequest getRequest() {
        return this.request;
    }

    @Override // coil.intercept.Interceptor.Chain
    public Size getSize() {
        return this.size;
    }

    public final EventListener getEventListener() {
        return this.eventListener;
    }

    public final boolean isPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    @Override // coil.intercept.Interceptor.Chain
    public RealInterceptorChain withSize(Size size) {
        return copy$default(this, 0, null, size, 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // coil.intercept.Interceptor.Chain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object proceed(ImageRequest imageRequest, Continuation<? super ImageResult> continuation) {
        RealInterceptorChain$proceed$1 realInterceptorChain$proceed$1;
        int i;
        RealInterceptorChain realInterceptorChain;
        Interceptor interceptor;
        if (continuation instanceof RealInterceptorChain$proceed$1) {
            realInterceptorChain$proceed$1 = (RealInterceptorChain$proceed$1) continuation;
            if ((realInterceptorChain$proceed$1.label & Integer.MIN_VALUE) != 0) {
                realInterceptorChain$proceed$1.label -= Integer.MIN_VALUE;
                Object obj = realInterceptorChain$proceed$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = realInterceptorChain$proceed$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i2 = this.index;
                    if (i2 > 0) {
                        checkRequest(imageRequest, this.interceptors.get(i2 - 1));
                    }
                    Interceptor interceptor2 = this.interceptors.get(this.index);
                    realInterceptorChain$proceed$1.L$0 = this;
                    realInterceptorChain$proceed$1.L$1 = interceptor2;
                    realInterceptorChain$proceed$1.label = 1;
                    Object intercept = interceptor2.intercept(copy$default(this, this.index + 1, imageRequest, null, 4, null), realInterceptorChain$proceed$1);
                    if (intercept == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    realInterceptorChain = this;
                    obj = intercept;
                    interceptor = interceptor2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    interceptor = (Interceptor) realInterceptorChain$proceed$1.L$1;
                    realInterceptorChain = (RealInterceptorChain) realInterceptorChain$proceed$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ImageResult imageResult = (ImageResult) obj;
                realInterceptorChain.checkRequest(imageResult.getRequest(), interceptor);
                return imageResult;
            }
        }
        realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuation);
        Object obj2 = realInterceptorChain$proceed$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = realInterceptorChain$proceed$1.label;
        if (i != 0) {
        }
        ImageResult imageResult2 = (ImageResult) obj2;
        realInterceptorChain.checkRequest(imageResult2.getRequest(), interceptor);
        return imageResult2;
    }

    private final void checkRequest(ImageRequest imageRequest, Interceptor interceptor) {
        if (!(imageRequest.getContext() == this.initialRequest.getContext())) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        }
        if (!(imageRequest.getData() != NullRequestData.INSTANCE)) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        }
        if (!(imageRequest.getTarget() == this.initialRequest.getTarget())) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
        }
        if (!(imageRequest.getLifecycle() == this.initialRequest.getLifecycle())) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's lifecycle.").toString());
        }
        if (imageRequest.getSizeResolver() == this.initialRequest.getSizeResolver()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    static /* synthetic */ RealInterceptorChain copy$default(RealInterceptorChain realInterceptorChain, int i, ImageRequest imageRequest, Size size, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.index;
        }
        if ((i2 & 2) != 0) {
            imageRequest = realInterceptorChain.getRequest();
        }
        if ((i2 & 4) != 0) {
            size = realInterceptorChain.getSize();
        }
        return realInterceptorChain.copy(i, imageRequest, size);
    }

    private final RealInterceptorChain copy(int i, ImageRequest imageRequest, Size size) {
        return new RealInterceptorChain(this.initialRequest, this.interceptors, i, imageRequest, size, this.eventListener, this.isPlaceholderCached);
    }
}
