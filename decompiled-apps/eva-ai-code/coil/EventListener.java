package coil;

import android.graphics.Bitmap;
import coil.EventListener;
import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.transition.Transition;
import kotlin.Metadata;
/* compiled from: EventListener.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 +2\u00020\u0001:\u0002+,J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J*\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0010H\u0017J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0017J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0017H\u0017J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001cH\u0017J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001fH\u0017J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H\u0017J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020%H\u0017J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020%H\u0017J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)H\u0017J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0003"}, d2 = {"Lcoil/EventListener;", "Lcoil/request/ImageRequest$Listener;", "decodeEnd", "", "request", "Lcoil/request/ImageRequest;", "decoder", "Lcoil/decode/Decoder;", "options", "Lcoil/request/Options;", "result", "Lcoil/decode/DecodeResult;", "decodeStart", "fetchEnd", "fetcher", "Lcoil/fetch/Fetcher;", "Lcoil/fetch/FetchResult;", "fetchStart", "keyEnd", "output", "", "keyStart", "input", "", "mapEnd", "mapStart", "onCancel", "onError", "Lcoil/request/ErrorResult;", "onStart", "onSuccess", "Lcoil/request/SuccessResult;", "resolveSizeEnd", "size", "Lcoil/size/Size;", "resolveSizeStart", "transformEnd", "Landroid/graphics/Bitmap;", "transformStart", "transitionEnd", "transition", "Lcoil/transition/Transition;", "transitionStart", "Companion", "Factory", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EventListener extends ImageRequest.Listener {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final EventListener NONE = new EventListener() { // from class: coil.EventListener$Companion$NONE$1
        @Override // coil.EventListener
        public /* synthetic */ void decodeEnd(ImageRequest imageRequest, Decoder decoder, Options options, DecodeResult decodeResult) {
            EventListener.CC.$default$decodeEnd(this, imageRequest, decoder, options, decodeResult);
        }

        @Override // coil.EventListener
        public /* synthetic */ void decodeStart(ImageRequest imageRequest, Decoder decoder, Options options) {
            EventListener.CC.$default$decodeStart(this, imageRequest, decoder, options);
        }

        @Override // coil.EventListener
        public /* synthetic */ void fetchEnd(ImageRequest imageRequest, Fetcher fetcher, Options options, FetchResult fetchResult) {
            EventListener.CC.$default$fetchEnd(this, imageRequest, fetcher, options, fetchResult);
        }

        @Override // coil.EventListener
        public /* synthetic */ void fetchStart(ImageRequest imageRequest, Fetcher fetcher, Options options) {
            EventListener.CC.$default$fetchStart(this, imageRequest, fetcher, options);
        }

        @Override // coil.EventListener
        public /* synthetic */ void keyEnd(ImageRequest imageRequest, String str) {
            EventListener.CC.$default$keyEnd(this, imageRequest, str);
        }

        @Override // coil.EventListener
        public /* synthetic */ void keyStart(ImageRequest imageRequest, Object obj) {
            EventListener.CC.$default$keyStart(this, imageRequest, obj);
        }

        @Override // coil.EventListener
        public /* synthetic */ void mapEnd(ImageRequest imageRequest, Object obj) {
            EventListener.CC.$default$mapEnd(this, imageRequest, obj);
        }

        @Override // coil.EventListener
        public /* synthetic */ void mapStart(ImageRequest imageRequest, Object obj) {
            EventListener.CC.$default$mapStart(this, imageRequest, obj);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onCancel(ImageRequest imageRequest) {
            EventListener.CC.$default$onCancel(this, imageRequest);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onError(ImageRequest imageRequest, ErrorResult errorResult) {
            EventListener.CC.$default$onError(this, imageRequest, errorResult);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onStart(ImageRequest imageRequest) {
            EventListener.CC.$default$onStart(this, imageRequest);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public /* synthetic */ void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
            EventListener.CC.$default$onSuccess(this, imageRequest, successResult);
        }

        @Override // coil.EventListener
        public /* synthetic */ void resolveSizeEnd(ImageRequest imageRequest, Size size) {
            EventListener.CC.$default$resolveSizeEnd(this, imageRequest, size);
        }

        @Override // coil.EventListener
        public /* synthetic */ void resolveSizeStart(ImageRequest imageRequest) {
            EventListener.CC.$default$resolveSizeStart(this, imageRequest);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transformEnd(ImageRequest imageRequest, Bitmap bitmap) {
            EventListener.CC.$default$transformEnd(this, imageRequest, bitmap);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transformStart(ImageRequest imageRequest, Bitmap bitmap) {
            EventListener.CC.$default$transformStart(this, imageRequest, bitmap);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transitionEnd(ImageRequest imageRequest, Transition transition) {
            EventListener.CC.$default$transitionEnd(this, imageRequest, transition);
        }

        @Override // coil.EventListener
        public /* synthetic */ void transitionStart(ImageRequest imageRequest, Transition transition) {
            EventListener.CC.$default$transitionStart(this, imageRequest, transition);
        }
    };

    void decodeEnd(ImageRequest imageRequest, Decoder decoder, Options options, DecodeResult decodeResult);

    void decodeStart(ImageRequest imageRequest, Decoder decoder, Options options);

    void fetchEnd(ImageRequest imageRequest, Fetcher fetcher, Options options, FetchResult fetchResult);

    void fetchStart(ImageRequest imageRequest, Fetcher fetcher, Options options);

    void keyEnd(ImageRequest imageRequest, String str);

    void keyStart(ImageRequest imageRequest, Object obj);

    void mapEnd(ImageRequest imageRequest, Object obj);

    void mapStart(ImageRequest imageRequest, Object obj);

    @Override // coil.request.ImageRequest.Listener
    void onCancel(ImageRequest imageRequest);

    @Override // coil.request.ImageRequest.Listener
    void onError(ImageRequest imageRequest, ErrorResult errorResult);

    @Override // coil.request.ImageRequest.Listener
    void onStart(ImageRequest imageRequest);

    @Override // coil.request.ImageRequest.Listener
    void onSuccess(ImageRequest imageRequest, SuccessResult successResult);

    void resolveSizeEnd(ImageRequest imageRequest, Size size);

    void resolveSizeStart(ImageRequest imageRequest);

    void transformEnd(ImageRequest imageRequest, Bitmap bitmap);

    void transformStart(ImageRequest imageRequest, Bitmap bitmap);

    void transitionEnd(ImageRequest imageRequest, Transition transition);

    void transitionStart(ImageRequest imageRequest, Transition transition);

    /* compiled from: EventListener.kt */
    /* renamed from: coil.EventListener$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static void $default$decodeEnd(EventListener _this, ImageRequest imageRequest, Decoder decoder, Options options, DecodeResult decodeResult) {
        }

        public static void $default$decodeStart(EventListener _this, ImageRequest imageRequest, Decoder decoder, Options options) {
        }

        public static void $default$fetchEnd(EventListener _this, ImageRequest imageRequest, Fetcher fetcher, Options options, FetchResult fetchResult) {
        }

        public static void $default$fetchStart(EventListener _this, ImageRequest imageRequest, Fetcher fetcher, Options options) {
        }

        public static void $default$keyEnd(EventListener _this, ImageRequest imageRequest, String str) {
        }

        public static void $default$keyStart(EventListener _this, ImageRequest imageRequest, Object obj) {
        }

        public static void $default$mapEnd(EventListener _this, ImageRequest imageRequest, Object obj) {
        }

        public static void $default$mapStart(EventListener _this, ImageRequest imageRequest, Object obj) {
        }

        public static void $default$onCancel(EventListener _this, ImageRequest imageRequest) {
        }

        public static void $default$onError(EventListener _this, ImageRequest imageRequest, ErrorResult errorResult) {
        }

        public static void $default$onStart(EventListener _this, ImageRequest imageRequest) {
        }

        public static void $default$onSuccess(EventListener _this, ImageRequest imageRequest, SuccessResult successResult) {
        }

        public static void $default$resolveSizeEnd(EventListener _this, ImageRequest imageRequest, Size size) {
        }

        public static void $default$resolveSizeStart(EventListener _this, ImageRequest imageRequest) {
        }

        public static void $default$transformEnd(EventListener _this, ImageRequest imageRequest, Bitmap bitmap) {
        }

        public static void $default$transformStart(EventListener _this, ImageRequest imageRequest, Bitmap bitmap) {
        }

        public static void $default$transitionEnd(EventListener _this, ImageRequest imageRequest, Transition transition) {
        }

        public static void $default$transitionStart(EventListener _this, ImageRequest imageRequest, Transition transition) {
        }

        static {
            Companion companion = EventListener.Companion;
        }
    }

    /* compiled from: EventListener.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void onStart(EventListener eventListener, ImageRequest imageRequest) {
            CC.$default$onStart(eventListener, imageRequest);
        }

        @Deprecated
        public static void resolveSizeStart(EventListener eventListener, ImageRequest imageRequest) {
            CC.$default$resolveSizeStart(eventListener, imageRequest);
        }

        @Deprecated
        public static void resolveSizeEnd(EventListener eventListener, ImageRequest imageRequest, Size size) {
            CC.$default$resolveSizeEnd(eventListener, imageRequest, size);
        }

        @Deprecated
        public static void mapStart(EventListener eventListener, ImageRequest imageRequest, Object obj) {
            CC.$default$mapStart(eventListener, imageRequest, obj);
        }

        @Deprecated
        public static void mapEnd(EventListener eventListener, ImageRequest imageRequest, Object obj) {
            CC.$default$mapEnd(eventListener, imageRequest, obj);
        }

        @Deprecated
        public static void keyStart(EventListener eventListener, ImageRequest imageRequest, Object obj) {
            CC.$default$keyStart(eventListener, imageRequest, obj);
        }

        @Deprecated
        public static void keyEnd(EventListener eventListener, ImageRequest imageRequest, String str) {
            CC.$default$keyEnd(eventListener, imageRequest, str);
        }

        @Deprecated
        public static void fetchStart(EventListener eventListener, ImageRequest imageRequest, Fetcher fetcher, Options options) {
            CC.$default$fetchStart(eventListener, imageRequest, fetcher, options);
        }

        @Deprecated
        public static void fetchEnd(EventListener eventListener, ImageRequest imageRequest, Fetcher fetcher, Options options, FetchResult fetchResult) {
            CC.$default$fetchEnd(eventListener, imageRequest, fetcher, options, fetchResult);
        }

        @Deprecated
        public static void decodeStart(EventListener eventListener, ImageRequest imageRequest, Decoder decoder, Options options) {
            CC.$default$decodeStart(eventListener, imageRequest, decoder, options);
        }

        @Deprecated
        public static void decodeEnd(EventListener eventListener, ImageRequest imageRequest, Decoder decoder, Options options, DecodeResult decodeResult) {
            CC.$default$decodeEnd(eventListener, imageRequest, decoder, options, decodeResult);
        }

        @Deprecated
        public static void transformStart(EventListener eventListener, ImageRequest imageRequest, Bitmap bitmap) {
            CC.$default$transformStart(eventListener, imageRequest, bitmap);
        }

        @Deprecated
        public static void transformEnd(EventListener eventListener, ImageRequest imageRequest, Bitmap bitmap) {
            CC.$default$transformEnd(eventListener, imageRequest, bitmap);
        }

        @Deprecated
        public static void transitionStart(EventListener eventListener, ImageRequest imageRequest, Transition transition) {
            CC.$default$transitionStart(eventListener, imageRequest, transition);
        }

        @Deprecated
        public static void transitionEnd(EventListener eventListener, ImageRequest imageRequest, Transition transition) {
            CC.$default$transitionEnd(eventListener, imageRequest, transition);
        }

        @Deprecated
        public static void onCancel(EventListener eventListener, ImageRequest imageRequest) {
            CC.$default$onCancel(eventListener, imageRequest);
        }

        @Deprecated
        public static void onError(EventListener eventListener, ImageRequest imageRequest, ErrorResult errorResult) {
            CC.$default$onError(eventListener, imageRequest, errorResult);
        }

        @Deprecated
        public static void onSuccess(EventListener eventListener, ImageRequest imageRequest, SuccessResult successResult) {
            CC.$default$onSuccess(eventListener, imageRequest, successResult);
        }
    }

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcoil/EventListener$Factory;", "", "create", "Lcoil/EventListener;", "request", "Lcoil/request/ImageRequest;", "Companion", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Factory NONE = new Factory() { // from class: coil.EventListener$Factory$$ExternalSyntheticLambda0
            @Override // coil.EventListener.Factory
            public final EventListener create(ImageRequest imageRequest) {
                EventListener eventListener;
                eventListener = EventListener.NONE;
                return eventListener;
            }
        };

        EventListener create(ImageRequest imageRequest);

        /* compiled from: EventListener.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcoil/EventListener$Factory$Companion;", "", "()V", "NONE", "Lcoil/EventListener$Factory;", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        /* compiled from: EventListener.kt */
        /* renamed from: coil.EventListener$Factory$-CC  reason: invalid class name */
        /* loaded from: classes3.dex */
        public final /* synthetic */ class CC {
            static {
                Companion companion = Factory.Companion;
            }
        }
    }

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcoil/EventListener$Companion;", "", "()V", "NONE", "Lcoil/EventListener;", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
