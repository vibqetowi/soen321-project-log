package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.ComponentRegistry;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.decode.FileImageSource;
import coil.decode.ImageSource;
import coil.fetch.DrawableResult;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.fetch.SourceResult;
import coil.intercept.Interceptor;
import coil.memory.MemoryCache;
import coil.memory.MemoryCacheService;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.Options;
import coil.request.RequestService;
import coil.size.Scale;
import coil.size.Size;
import coil.transform.Transformation;
import coil.util.Bitmaps;
import coil.util.DrawableUtils;
import coil.util.Logger;
import coil.util.Utils;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: EngineInterceptor.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002JA\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J1\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J9\u0010$\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+J3\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0081@ø\u0001\u0000¢\u0006\u0004\b.\u0010/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcoil/intercept/EngineInterceptor;", "Lcoil/intercept/Interceptor;", "imageLoader", "Lcoil/ImageLoader;", "requestService", "Lcoil/request/RequestService;", "logger", "Lcoil/util/Logger;", "(Lcoil/ImageLoader;Lcoil/request/RequestService;Lcoil/util/Logger;)V", "memoryCacheService", "Lcoil/memory/MemoryCacheService;", "convertDrawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "options", "Lcoil/request/Options;", "transformations", "", "Lcoil/transform/Transformation;", "decode", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "fetchResult", "Lcoil/fetch/SourceResult;", "components", "Lcoil/ComponentRegistry;", "request", "Lcoil/request/ImageRequest;", "mappedData", "", "eventListener", "Lcoil/EventListener;", "(Lcoil/fetch/SourceResult;Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "_options", "(Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RemoteConfigComponent.FETCH_FILE_NAME, "Lcoil/fetch/FetchResult;", "(Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercept", "Lcoil/request/ImageResult;", "chain", "Lcoil/intercept/Interceptor$Chain;", "(Lcoil/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transform", "result", "transform$coil_base_release", "(Lcoil/intercept/EngineInterceptor$ExecuteResult;Lcoil/request/ImageRequest;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ExecuteResult", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EngineInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "EngineInterceptor";
    private final ImageLoader imageLoader;
    private final Logger logger;
    private final MemoryCacheService memoryCacheService;
    private final RequestService requestService;

    public EngineInterceptor(ImageLoader imageLoader, RequestService requestService, Logger logger) {
        this.imageLoader = imageLoader;
        this.requestService = requestService;
        this.logger = logger;
        this.memoryCacheService = new MemoryCacheService(imageLoader, requestService, logger);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    @Override // coil.intercept.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object intercept(Interceptor.Chain chain, Continuation<? super ImageResult> continuation) {
        EngineInterceptor$intercept$1 engineInterceptor$intercept$1;
        int i;
        EngineInterceptor engineInterceptor;
        if (continuation instanceof EngineInterceptor$intercept$1) {
            engineInterceptor$intercept$1 = (EngineInterceptor$intercept$1) continuation;
            if ((engineInterceptor$intercept$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$intercept$1.label -= Integer.MIN_VALUE;
                Object obj = engineInterceptor$intercept$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptor$intercept$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        ImageRequest request = chain.getRequest();
                        Object data = request.getData();
                        Size size = chain.getSize();
                        EventListener eventListener = Utils.getEventListener(chain);
                        Options options = this.requestService.options(request, size);
                        Scale scale = options.getScale();
                        eventListener.mapStart(request, data);
                        Object map = this.imageLoader.getComponents().map(data, options);
                        eventListener.mapEnd(request, map);
                        MemoryCache.Key newCacheKey = this.memoryCacheService.newCacheKey(request, map, options, eventListener);
                        MemoryCache.Value cacheValue = newCacheKey != null ? this.memoryCacheService.getCacheValue(request, newCacheKey, size, scale) : null;
                        if (cacheValue != null) {
                            return this.memoryCacheService.newResult(chain, request, newCacheKey, cacheValue);
                        }
                        engineInterceptor$intercept$1.L$0 = this;
                        engineInterceptor$intercept$1.L$1 = chain;
                        engineInterceptor$intercept$1.label = 1;
                        obj = BuildersKt.withContext(request.getFetcherDispatcher(), new EngineInterceptor$intercept$2(this, request, map, options, eventListener, newCacheKey, chain, null), engineInterceptor$intercept$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        engineInterceptor = this;
                        if (!(th instanceof CancellationException)) {
                            throw th;
                        }
                        return engineInterceptor.requestService.errorResult(chain.getRequest(), th);
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chain = (Interceptor.Chain) engineInterceptor$intercept$1.L$1;
                    engineInterceptor = (EngineInterceptor) engineInterceptor$intercept$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        if (!(th instanceof CancellationException)) {
                        }
                    }
                }
                return obj;
            }
        }
        engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(this, continuation);
        Object obj2 = engineInterceptor$intercept$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$intercept$1.label;
        if (i != 0) {
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[Catch: all -> 0x0219, TRY_LEAVE, TryCatch #2 {all -> 0x0219, blocks: (B:45:0x0152, B:47:0x015c, B:54:0x01a0, B:56:0x01a4, B:77:0x0213, B:78:0x0218, B:27:0x00a6, B:29:0x00b2, B:30:0x00e0, B:32:0x00e6, B:41:0x0115, B:34:0x00ec, B:36:0x00fb, B:37:0x0102, B:39:0x0108, B:40:0x010f), top: B:93:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0 A[Catch: all -> 0x0219, TRY_ENTER, TryCatch #2 {all -> 0x0219, blocks: (B:45:0x0152, B:47:0x015c, B:54:0x01a0, B:56:0x01a4, B:77:0x0213, B:78:0x0218, B:27:0x00a6, B:29:0x00b2, B:30:0x00e0, B:32:0x00e6, B:41:0x0115, B:34:0x00ec, B:36:0x00fb, B:37:0x0102, B:39:0x0108, B:40:0x010f), top: B:93:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0226  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, coil.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, coil.request.Options] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, coil.ComponentRegistry] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) {
        EngineInterceptor$execute$1 engineInterceptor$execute$1;
        int i;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Object obj2;
        EventListener eventListener2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        ImageRequest imageRequest2;
        EngineInterceptor engineInterceptor;
        ?? copy;
        T t;
        FetchResult fetchResult;
        ExecuteResult executeResult;
        ImageRequest imageRequest3;
        EngineInterceptor engineInterceptor2;
        EventListener eventListener3;
        ImageRequest imageRequest4;
        EngineInterceptor engineInterceptor3;
        SourceResult sourceResult;
        ImageSource source;
        SourceResult sourceResult2;
        Object transform$coil_base_release;
        ImageSource source2;
        Object obj3;
        Object obj4;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (continuation instanceof EngineInterceptor$execute$1) {
            engineInterceptor$execute$1 = (EngineInterceptor$execute$1) continuation;
            if ((engineInterceptor$execute$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$execute$1.label -= Integer.MIN_VALUE;
                EngineInterceptor$execute$1 engineInterceptor$execute$12 = engineInterceptor$execute$1;
                Object obj5 = engineInterceptor$execute$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptor$execute$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj5);
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    objectRef6.element = options;
                    Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                    objectRef7.element = this.imageLoader.getComponents();
                    objectRef = new Ref.ObjectRef();
                    try {
                        if (!this.requestService.allowHardwareWorkerThread((Options) objectRef6.element)) {
                            copy = r16.copy((r32 & 1) != 0 ? r16.context : null, (r32 & 2) != 0 ? r16.config : Bitmap.Config.ARGB_8888, (r32 & 4) != 0 ? r16.colorSpace : null, (r32 & 8) != 0 ? r16.size : null, (r32 & 16) != 0 ? r16.scale : null, (r32 & 32) != 0 ? r16.allowInexactSize : false, (r32 & 64) != 0 ? r16.allowRgb565 : false, (r32 & 128) != 0 ? r16.premultipliedAlpha : false, (r32 & 256) != 0 ? r16.diskCacheKey : null, (r32 & 512) != 0 ? r16.headers : null, (r32 & 1024) != 0 ? r16.tags : null, (r32 & 2048) != 0 ? r16.parameters : null, (r32 & 4096) != 0 ? r16.memoryCachePolicy : null, (r32 & 8192) != 0 ? r16.diskCachePolicy : null, (r32 & 16384) != 0 ? ((Options) objectRef6.element).networkCachePolicy : null);
                            objectRef6.element = copy;
                        }
                        if (imageRequest.getFetcherFactory() != null || imageRequest.getDecoderFactory() != null) {
                            ComponentRegistry.Builder newBuilder = ((ComponentRegistry) objectRef7.element).newBuilder();
                            Pair<Fetcher.Factory<?>, Class<?>> fetcherFactory = imageRequest.getFetcherFactory();
                            if (fetcherFactory != null) {
                                newBuilder.getFetcherFactories$coil_base_release().add(0, fetcherFactory);
                            }
                            Decoder.Factory decoderFactory = imageRequest.getDecoderFactory();
                            if (decoderFactory != null) {
                                newBuilder.getDecoderFactories$coil_base_release().add(0, decoderFactory);
                            }
                            objectRef7.element = newBuilder.build();
                        }
                        engineInterceptor$execute$12.L$0 = this;
                        engineInterceptor$execute$12.L$1 = imageRequest;
                        engineInterceptor$execute$12.L$2 = obj;
                        engineInterceptor$execute$12.L$3 = eventListener;
                        engineInterceptor$execute$12.L$4 = objectRef6;
                        engineInterceptor$execute$12.L$5 = objectRef7;
                        engineInterceptor$execute$12.L$6 = objectRef;
                        engineInterceptor$execute$12.L$7 = objectRef;
                        engineInterceptor$execute$12.label = 1;
                        Object fetch = fetch((ComponentRegistry) objectRef7.element, imageRequest, obj, (Options) objectRef6.element, eventListener, engineInterceptor$execute$12);
                        if (fetch == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj;
                        eventListener2 = eventListener;
                        objectRef3 = objectRef6;
                        objectRef4 = objectRef7;
                        objectRef5 = objectRef;
                        imageRequest2 = imageRequest;
                        engineInterceptor = this;
                        t = fetch;
                    } catch (Throwable th) {
                        th = th;
                        objectRef2 = objectRef;
                        T t2 = objectRef2.element;
                        if (t2 instanceof SourceResult) {
                        }
                        if (sourceResult != null) {
                        }
                        throw th;
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj5);
                            obj4 = obj5;
                            ExecuteResult executeResult2 = (ExecuteResult) obj4;
                            Drawable drawable = executeResult2.getDrawable();
                            bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                bitmap.prepareToDraw();
                            }
                            return executeResult2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) engineInterceptor$execute$12.L$4;
                    objectRef3 = (Ref.ObjectRef) engineInterceptor$execute$12.L$3;
                    eventListener3 = (EventListener) engineInterceptor$execute$12.L$2;
                    imageRequest4 = (ImageRequest) engineInterceptor$execute$12.L$1;
                    engineInterceptor3 = (EngineInterceptor) engineInterceptor$execute$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj5);
                        obj3 = obj5;
                        executeResult = (ExecuteResult) obj3;
                        objectRef = objectRef2;
                        engineInterceptor2 = engineInterceptor3;
                        eventListener2 = eventListener3;
                        imageRequest3 = imageRequest4;
                        Ref.ObjectRef objectRef8 = objectRef3;
                        ExecuteResult executeResult3 = executeResult;
                        T t3 = objectRef.element;
                        sourceResult2 = t3 instanceof SourceResult ? (SourceResult) t3 : null;
                        if (sourceResult2 != null && (source2 = sourceResult2.getSource()) != null) {
                            Utils.closeQuietly(source2);
                        }
                        engineInterceptor$execute$12.L$0 = null;
                        engineInterceptor$execute$12.L$1 = null;
                        engineInterceptor$execute$12.L$2 = null;
                        engineInterceptor$execute$12.L$3 = null;
                        engineInterceptor$execute$12.L$4 = null;
                        engineInterceptor$execute$12.L$5 = null;
                        engineInterceptor$execute$12.L$6 = null;
                        engineInterceptor$execute$12.L$7 = null;
                        engineInterceptor$execute$12.label = 3;
                        transform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult3, imageRequest3, (Options) objectRef8.element, eventListener2, engineInterceptor$execute$12);
                        obj4 = transform$coil_base_release;
                        if (transform$coil_base_release == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ExecuteResult executeResult22 = (ExecuteResult) obj4;
                        Drawable drawable2 = executeResult22.getDrawable();
                        if (drawable2 instanceof BitmapDrawable) {
                        }
                        if (bitmapDrawable != null) {
                            bitmap.prepareToDraw();
                        }
                        return executeResult22;
                    } catch (Throwable th2) {
                        th = th2;
                        T t22 = objectRef2.element;
                        if (t22 instanceof SourceResult) {
                        }
                        if (sourceResult != null) {
                            Utils.closeQuietly(source);
                        }
                        throw th;
                    }
                } else {
                    objectRef5 = (Ref.ObjectRef) engineInterceptor$execute$12.L$7;
                    Ref.ObjectRef objectRef9 = (Ref.ObjectRef) engineInterceptor$execute$12.L$6;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) engineInterceptor$execute$12.L$5;
                    Ref.ObjectRef objectRef11 = (Ref.ObjectRef) engineInterceptor$execute$12.L$4;
                    eventListener2 = (EventListener) engineInterceptor$execute$12.L$3;
                    Object obj6 = engineInterceptor$execute$12.L$2;
                    imageRequest2 = (ImageRequest) engineInterceptor$execute$12.L$1;
                    engineInterceptor = (EngineInterceptor) engineInterceptor$execute$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj5);
                        objectRef = objectRef9;
                        objectRef4 = objectRef10;
                        objectRef3 = objectRef11;
                        obj2 = obj6;
                        t = obj5;
                    } catch (Throwable th3) {
                        th = th3;
                        objectRef2 = objectRef9;
                        T t222 = objectRef2.element;
                        sourceResult = t222 instanceof SourceResult ? (SourceResult) t222 : null;
                        if (sourceResult != null && (source = sourceResult.getSource()) != null) {
                            Utils.closeQuietly(source);
                        }
                        throw th;
                    }
                }
                objectRef5.element = t;
                fetchResult = (FetchResult) objectRef.element;
                if (fetchResult instanceof SourceResult) {
                    if (fetchResult instanceof DrawableResult) {
                        executeResult = new ExecuteResult(((DrawableResult) objectRef.element).getDrawable(), ((DrawableResult) objectRef.element).isSampled(), ((DrawableResult) objectRef.element).getDataSource(), null);
                        imageRequest3 = imageRequest2;
                        engineInterceptor2 = engineInterceptor;
                        Ref.ObjectRef objectRef82 = objectRef3;
                        ExecuteResult executeResult32 = executeResult;
                        T t32 = objectRef.element;
                        if (t32 instanceof SourceResult) {
                        }
                        if (sourceResult2 != null) {
                        }
                        engineInterceptor$execute$12.L$0 = null;
                        engineInterceptor$execute$12.L$1 = null;
                        engineInterceptor$execute$12.L$2 = null;
                        engineInterceptor$execute$12.L$3 = null;
                        engineInterceptor$execute$12.L$4 = null;
                        engineInterceptor$execute$12.L$5 = null;
                        engineInterceptor$execute$12.L$6 = null;
                        engineInterceptor$execute$12.L$7 = null;
                        engineInterceptor$execute$12.label = 3;
                        transform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult32, imageRequest3, (Options) objectRef82.element, eventListener2, engineInterceptor$execute$12);
                        obj4 = transform$coil_base_release;
                        if (transform$coil_base_release == coroutine_suspended) {
                        }
                        ExecuteResult executeResult222 = (ExecuteResult) obj4;
                        Drawable drawable22 = executeResult222.getDrawable();
                        if (drawable22 instanceof BitmapDrawable) {
                        }
                        if (bitmapDrawable != null) {
                        }
                        return executeResult222;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                engineInterceptor$execute$12.L$0 = engineInterceptor;
                engineInterceptor$execute$12.L$1 = imageRequest2;
                engineInterceptor$execute$12.L$2 = eventListener2;
                engineInterceptor$execute$12.L$3 = objectRef3;
                engineInterceptor$execute$12.L$4 = objectRef;
                engineInterceptor$execute$12.L$5 = null;
                engineInterceptor$execute$12.L$6 = null;
                engineInterceptor$execute$12.L$7 = null;
                engineInterceptor$execute$12.label = 2;
                Object withContext = BuildersKt.withContext(imageRequest2.getDecoderDispatcher(), new EngineInterceptor$execute$executeResult$1(engineInterceptor, objectRef, objectRef4, imageRequest2, obj2, objectRef3, eventListener2, null), engineInterceptor$execute$12);
                if (withContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eventListener3 = eventListener2;
                imageRequest4 = imageRequest2;
                engineInterceptor3 = engineInterceptor;
                objectRef2 = objectRef;
                obj3 = withContext;
                executeResult = (ExecuteResult) obj3;
                objectRef = objectRef2;
                engineInterceptor2 = engineInterceptor3;
                eventListener2 = eventListener3;
                imageRequest3 = imageRequest4;
                Ref.ObjectRef objectRef822 = objectRef3;
                ExecuteResult executeResult322 = executeResult;
                T t322 = objectRef.element;
                if (t322 instanceof SourceResult) {
                }
                if (sourceResult2 != null) {
                    Utils.closeQuietly(source2);
                }
                engineInterceptor$execute$12.L$0 = null;
                engineInterceptor$execute$12.L$1 = null;
                engineInterceptor$execute$12.L$2 = null;
                engineInterceptor$execute$12.L$3 = null;
                engineInterceptor$execute$12.L$4 = null;
                engineInterceptor$execute$12.L$5 = null;
                engineInterceptor$execute$12.L$6 = null;
                engineInterceptor$execute$12.L$7 = null;
                engineInterceptor$execute$12.label = 3;
                transform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult322, imageRequest3, (Options) objectRef822.element, eventListener2, engineInterceptor$execute$12);
                obj4 = transform$coil_base_release;
                if (transform$coil_base_release == coroutine_suspended) {
                }
                ExecuteResult executeResult2222 = (ExecuteResult) obj4;
                Drawable drawable222 = executeResult2222.getDrawable();
                if (drawable222 instanceof BitmapDrawable) {
                }
                if (bitmapDrawable != null) {
                }
                return executeResult2222;
            }
        }
        engineInterceptor$execute$1 = new EngineInterceptor$execute$1(this, continuation);
        EngineInterceptor$execute$1 engineInterceptor$execute$122 = engineInterceptor$execute$1;
        Object obj52 = engineInterceptor$execute$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$execute$122.label;
        if (i != 0) {
        }
        objectRef5.element = t;
        fetchResult = (FetchResult) objectRef.element;
        if (fetchResult instanceof SourceResult) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0093 -> B:21:0x0098). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super FetchResult> continuation) {
        EngineInterceptor$fetch$1 engineInterceptor$fetch$1;
        int i;
        int i2;
        EngineInterceptor engineInterceptor;
        Pair<Fetcher, Integer> newFetcher;
        ImageSource source;
        if (continuation instanceof EngineInterceptor$fetch$1) {
            engineInterceptor$fetch$1 = (EngineInterceptor$fetch$1) continuation;
            if ((engineInterceptor$fetch$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$fetch$1.label -= Integer.MIN_VALUE;
                Object obj2 = engineInterceptor$fetch$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptor$fetch$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    i2 = 0;
                    engineInterceptor = this;
                    newFetcher = componentRegistry.newFetcher(obj, options, engineInterceptor.imageLoader, i2);
                    if (newFetcher != null) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    int i3 = engineInterceptor$fetch$1.I$0;
                    options = (Options) engineInterceptor$fetch$1.L$4;
                    Object obj3 = engineInterceptor$fetch$1.L$3;
                    ImageRequest imageRequest2 = (ImageRequest) engineInterceptor$fetch$1.L$2;
                    engineInterceptor = (EngineInterceptor) engineInterceptor$fetch$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    EngineInterceptor$fetch$1 engineInterceptor$fetch$12 = engineInterceptor$fetch$1;
                    int i4 = i3;
                    componentRegistry = (ComponentRegistry) engineInterceptor$fetch$1.L$1;
                    Object obj4 = coroutine_suspended;
                    EngineInterceptor$fetch$1 engineInterceptor$fetch$13 = engineInterceptor$fetch$12;
                    Fetcher first = (Fetcher) engineInterceptor$fetch$1.L$6;
                    imageRequest = imageRequest2;
                    eventListener = (EventListener) engineInterceptor$fetch$1.L$5;
                    obj = obj3;
                    FetchResult fetchResult = (FetchResult) obj2;
                    try {
                        eventListener.fetchEnd(imageRequest, first, options, fetchResult);
                        if (fetchResult == null) {
                            return fetchResult;
                        }
                        i2 = i4;
                        engineInterceptor$fetch$1 = engineInterceptor$fetch$13;
                        coroutine_suspended = obj4;
                        newFetcher = componentRegistry.newFetcher(obj, options, engineInterceptor.imageLoader, i2);
                        if (newFetcher != null) {
                            throw new IllegalStateException(("Unable to create a fetcher that supports: " + obj).toString());
                        }
                        first = newFetcher.getFirst();
                        int intValue = newFetcher.getSecond().intValue() + 1;
                        eventListener.fetchStart(imageRequest, first, options);
                        engineInterceptor$fetch$1.L$0 = engineInterceptor;
                        engineInterceptor$fetch$1.L$1 = componentRegistry;
                        engineInterceptor$fetch$1.L$2 = imageRequest;
                        engineInterceptor$fetch$1.L$3 = obj;
                        engineInterceptor$fetch$1.L$4 = options;
                        engineInterceptor$fetch$1.L$5 = eventListener;
                        engineInterceptor$fetch$1.L$6 = first;
                        engineInterceptor$fetch$1.I$0 = intValue;
                        engineInterceptor$fetch$1.label = 1;
                        Object fetch = first.fetch(engineInterceptor$fetch$1);
                        if (fetch == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        EngineInterceptor$fetch$1 engineInterceptor$fetch$14 = engineInterceptor$fetch$1;
                        i4 = intValue;
                        obj2 = fetch;
                        obj4 = coroutine_suspended;
                        engineInterceptor$fetch$13 = engineInterceptor$fetch$14;
                        FetchResult fetchResult2 = (FetchResult) obj2;
                        eventListener.fetchEnd(imageRequest, first, options, fetchResult2);
                        if (fetchResult2 == null) {
                        }
                    } catch (Throwable th) {
                        SourceResult sourceResult = fetchResult2 instanceof SourceResult ? (SourceResult) fetchResult2 : null;
                        if (sourceResult != null && (source = sourceResult.getSource()) != null) {
                            Utils.closeQuietly(source);
                        }
                        throw th;
                    }
                }
            }
        }
        engineInterceptor$fetch$1 = new EngineInterceptor$fetch$1(this, continuation);
        Object obj22 = engineInterceptor$fetch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$fetch$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ac -> B:21:0x00b5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(SourceResult sourceResult, ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) {
        EngineInterceptor$decode$1 engineInterceptor$decode$1;
        EngineInterceptor engineInterceptor;
        int i;
        Object obj2;
        Options options2;
        EventListener eventListener2;
        int i2;
        EngineInterceptor$decode$1 engineInterceptor$decode$12;
        EngineInterceptor engineInterceptor2;
        Object obj3;
        SourceResult sourceResult2;
        ComponentRegistry componentRegistry2;
        ImageRequest imageRequest2;
        Pair<Decoder, Integer> newDecoder;
        if (continuation instanceof EngineInterceptor$decode$1) {
            engineInterceptor$decode$1 = (EngineInterceptor$decode$1) continuation;
            if ((engineInterceptor$decode$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$decode$1.label -= Integer.MIN_VALUE;
                engineInterceptor = this;
                Object obj4 = engineInterceptor$decode$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptor$decode$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj4);
                    obj2 = obj;
                    options2 = options;
                    eventListener2 = eventListener;
                    i2 = 0;
                    engineInterceptor$decode$12 = engineInterceptor$decode$1;
                    engineInterceptor2 = engineInterceptor;
                    obj3 = coroutine_suspended;
                    sourceResult2 = sourceResult;
                    componentRegistry2 = componentRegistry;
                    imageRequest2 = imageRequest;
                    newDecoder = componentRegistry2.newDecoder(sourceResult2, options2, engineInterceptor2.imageLoader, i2);
                    if (newDecoder != null) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    int i3 = engineInterceptor$decode$1.I$0;
                    Decoder decoder = (Decoder) engineInterceptor$decode$1.L$7;
                    eventListener2 = (EventListener) engineInterceptor$decode$1.L$6;
                    Options options3 = (Options) engineInterceptor$decode$1.L$5;
                    Object obj5 = engineInterceptor$decode$1.L$4;
                    ImageRequest imageRequest3 = (ImageRequest) engineInterceptor$decode$1.L$3;
                    SourceResult sourceResult3 = (SourceResult) engineInterceptor$decode$1.L$1;
                    engineInterceptor2 = (EngineInterceptor) engineInterceptor$decode$1.L$0;
                    ResultKt.throwOnFailure(obj4);
                    EngineInterceptor$decode$1 engineInterceptor$decode$13 = engineInterceptor$decode$1;
                    componentRegistry2 = (ComponentRegistry) engineInterceptor$decode$1.L$2;
                    Object obj6 = coroutine_suspended;
                    imageRequest2 = imageRequest3;
                    int i4 = i3;
                    obj2 = obj5;
                    DecodeResult decodeResult = (DecodeResult) obj4;
                    eventListener2.decodeEnd(imageRequest2, decoder, options3, decodeResult);
                    if (decodeResult != null) {
                        options2 = options3;
                        i2 = i4;
                        engineInterceptor$decode$12 = engineInterceptor$decode$13;
                        obj3 = obj6;
                        sourceResult2 = sourceResult3;
                        newDecoder = componentRegistry2.newDecoder(sourceResult2, options2, engineInterceptor2.imageLoader, i2);
                        if (newDecoder != null) {
                            throw new IllegalStateException(("Unable to create a decoder that supports: " + obj2).toString());
                        }
                        Decoder first = newDecoder.getFirst();
                        int intValue = newDecoder.getSecond().intValue() + 1;
                        eventListener2.decodeStart(imageRequest2, first, options2);
                        engineInterceptor$decode$12.L$0 = engineInterceptor2;
                        engineInterceptor$decode$12.L$1 = sourceResult2;
                        engineInterceptor$decode$12.L$2 = componentRegistry2;
                        engineInterceptor$decode$12.L$3 = imageRequest2;
                        engineInterceptor$decode$12.L$4 = obj2;
                        engineInterceptor$decode$12.L$5 = options2;
                        engineInterceptor$decode$12.L$6 = eventListener2;
                        engineInterceptor$decode$12.L$7 = first;
                        engineInterceptor$decode$12.I$0 = intValue;
                        engineInterceptor$decode$12.label = 1;
                        Object decode = first.decode(engineInterceptor$decode$12);
                        if (decode == obj3) {
                            return obj3;
                        }
                        sourceResult3 = sourceResult2;
                        obj4 = decode;
                        options3 = options2;
                        decoder = first;
                        obj6 = obj3;
                        engineInterceptor$decode$13 = engineInterceptor$decode$12;
                        i4 = intValue;
                        DecodeResult decodeResult2 = (DecodeResult) obj4;
                        eventListener2.decodeEnd(imageRequest2, decoder, options3, decodeResult2);
                        if (decodeResult2 != null) {
                        }
                    } else {
                        Drawable drawable = decodeResult2.getDrawable();
                        boolean isSampled = decodeResult2.isSampled();
                        DataSource dataSource = sourceResult3.getDataSource();
                        ImageSource source = sourceResult3.getSource();
                        FileImageSource fileImageSource = source instanceof FileImageSource ? (FileImageSource) source : null;
                        return new ExecuteResult(drawable, isSampled, dataSource, fileImageSource != null ? fileImageSource.getDiskCacheKey$coil_base_release() : null);
                    }
                }
            }
        }
        engineInterceptor = this;
        engineInterceptor$decode$1 = new EngineInterceptor$decode$1(engineInterceptor, continuation);
        Object obj42 = engineInterceptor$decode$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$decode$1.label;
        if (i != 0) {
        }
    }

    public final Object transform$coil_base_release(ExecuteResult executeResult, ImageRequest imageRequest, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) {
        List<Transformation> transformations = imageRequest.getTransformations();
        if (transformations.isEmpty()) {
            return executeResult;
        }
        if (!(executeResult.getDrawable() instanceof BitmapDrawable) && !imageRequest.getAllowConversionToBitmap()) {
            Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 4) {
                String canonicalName = executeResult.getDrawable().getClass().getCanonicalName();
                logger.log(TAG, 4, "allowConversionToBitmap=false, skipping transformations for type " + canonicalName + ClassUtils.PACKAGE_SEPARATOR_CHAR, null);
            }
            return executeResult;
        }
        return BuildersKt.withContext(imageRequest.getTransformationDispatcher(), new EngineInterceptor$transform$3(this, executeResult, options, transformations, eventListener, imageRequest, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap convertDrawableToBitmap(Drawable drawable, Options options, List<? extends Transformation> list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config safeConfig = Bitmaps.getSafeConfig(bitmap);
            if (ArraysKt.contains(Utils.getVALID_TRANSFORMATION_CONFIGS(), safeConfig)) {
                return bitmap;
            }
            Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 4) {
                logger.log(TAG, 4, "Converting bitmap with config " + safeConfig + " to apply transformations: " + list + ClassUtils.PACKAGE_SEPARATOR_CHAR, null);
            }
        } else {
            Logger logger2 = this.logger;
            if (logger2 != null && logger2.getLevel() <= 4) {
                logger2.log(TAG, 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + list + ClassUtils.PACKAGE_SEPARATOR_CHAR, null);
            }
        }
        return DrawableUtils.INSTANCE.convertToBitmap(drawable, options.getConfig(), options.getSize(), options.getScale(), options.getAllowInexactSize());
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcoil/intercept/EngineInterceptor$ExecuteResult;", "", "drawable", "Landroid/graphics/drawable/Drawable;", "isSampled", "", "dataSource", "Lcoil/decode/DataSource;", "diskCacheKey", "", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;Ljava/lang/String;)V", "getDataSource", "()Lcoil/decode/DataSource;", "getDiskCacheKey", "()Ljava/lang/String;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "()Z", "copy", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ExecuteResult {
        private final DataSource dataSource;
        private final String diskCacheKey;
        private final Drawable drawable;
        private final boolean isSampled;

        public ExecuteResult(Drawable drawable, boolean z, DataSource dataSource, String str) {
            this.drawable = drawable;
            this.isSampled = z;
            this.dataSource = dataSource;
            this.diskCacheKey = str;
        }

        public final Drawable getDrawable() {
            return this.drawable;
        }

        public final boolean isSampled() {
            return this.isSampled;
        }

        public final DataSource getDataSource() {
            return this.dataSource;
        }

        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        public static /* synthetic */ ExecuteResult copy$default(ExecuteResult executeResult, Drawable drawable, boolean z, DataSource dataSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = executeResult.drawable;
            }
            if ((i & 2) != 0) {
                z = executeResult.isSampled;
            }
            if ((i & 4) != 0) {
                dataSource = executeResult.dataSource;
            }
            if ((i & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.copy(drawable, z, dataSource, str);
        }

        public final ExecuteResult copy(Drawable drawable, boolean z, DataSource dataSource, String str) {
            return new ExecuteResult(drawable, z, dataSource, str);
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcoil/intercept/EngineInterceptor$Companion;", "", "()V", "TAG", "", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
