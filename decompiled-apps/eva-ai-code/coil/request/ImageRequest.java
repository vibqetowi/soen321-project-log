package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil.decode.Decoder;
import coil.fetch.Fetcher;
import coil.memory.MemoryCache;
import coil.request.Parameters;
import coil.size.Dimension;
import coil.size.DisplaySizeResolver;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.SizeResolvers;
import coil.size.Sizes;
import coil.size.ViewSizeResolver;
import coil.size.ViewSizeResolvers;
import coil.target.ImageViewTarget;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transform.Transformation;
import coil.transition.CrossfadeTransition;
import coil.transition.Transition;
import coil.util.Collections;
import coil.util.Contexts;
import coil.util.Requests;
import coil.util.Utils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Headers;
/* compiled from: ImageRequest.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0004\u008c\u0001\u008d\u0001Bõ\u0002\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u001c\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\b\u00108\u001a\u0004\u0018\u00010\n\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\u0010;\u001a\u0004\u0018\u00010<\u0012\b\u0010=\u001a\u0004\u0018\u00010:\u0012\b\u0010>\u001a\u0004\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010:\u0012\b\u0010@\u001a\u0004\u0018\u00010<\u0012\u0006\u0010A\u001a\u00020B\u0012\u0006\u0010C\u001a\u00020D¢\u0006\u0002\u0010EJ\u0015\u0010\u0087\u0001\u001a\u00020#2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u0089\u0001\u001a\u00020:H\u0016J\u0014\u0010\u008a\u0001\u001a\u00030\u008b\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010$\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\u0011\u0010%\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bI\u0010GR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010.\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010C\u001a\u00020D¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010A\u001a\u00020B¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010)\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0013\u0010^\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0010\u0010>\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010=\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010aR\u0013\u0010b\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\bc\u0010`R\u0010\u0010@\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010?\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010aR\u0011\u0010-\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bd\u0010SR'\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bi\u0010SR\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bp\u0010]R\u0011\u0010*\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bq\u0010]R\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0013\u0010t\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\bu\u0010`R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u00108\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bv\u0010oR\u0012\u00109\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010aR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0011\u0010&\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\by\u0010GR\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0012\u0010/\u001a\u00020,¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010SR\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0013\u0010\u001c\u001a\u00020\u001d¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008e\u0001"}, d2 = {"Lcoil/request/ImageRequest;", "", "context", "Landroid/content/Context;", "data", TypedValues.AttributesType.S_TARGET, "Lcoil/target/Target;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/request/ImageRequest$Listener;", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "diskCacheKey", "", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "colorSpace", "Landroid/graphics/ColorSpace;", "precision", "Lcoil/size/Precision;", "fetcherFactory", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "decoderFactory", "Lcoil/decode/Decoder$Factory;", "transformations", "", "Lcoil/transform/Transformation;", "transitionFactory", "Lcoil/transition/Transition$Factory;", "headers", "Lokhttp3/Headers;", "tags", "Lcoil/request/Tags;", "allowConversionToBitmap", "", "allowHardware", "allowRgb565", "premultipliedAlpha", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "interceptorDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "sizeResolver", "Lcoil/size/SizeResolver;", "scale", "Lcoil/size/Scale;", "parameters", "Lcoil/request/Parameters;", "placeholderMemoryCacheKey", "placeholderResId", "", "placeholderDrawable", "Landroid/graphics/drawable/Drawable;", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "defined", "Lcoil/request/DefinedRequestOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "(Landroid/content/Context;Ljava/lang/Object;Lcoil/target/Target;Lcoil/request/ImageRequest$Listener;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Precision;Lkotlin/Pair;Lcoil/decode/Decoder$Factory;Ljava/util/List;Lcoil/transition/Transition$Factory;Lokhttp3/Headers;Lcoil/request/Tags;ZZZZLcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lcoil/request/Parameters;Lcoil/memory/MemoryCache$Key;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Lcoil/request/DefinedRequestOptions;Lcoil/request/DefaultRequestOptions;)V", "getAllowConversionToBitmap", "()Z", "getAllowHardware", "getAllowRgb565", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "getContext", "()Landroid/content/Context;", "getData", "()Ljava/lang/Object;", "getDecoderDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getDecoderFactory", "()Lcoil/decode/Decoder$Factory;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "getDefined", "()Lcoil/request/DefinedRequestOptions;", "getDiskCacheKey", "()Ljava/lang/String;", "getDiskCachePolicy", "()Lcoil/request/CachePolicy;", "error", "getError", "()Landroid/graphics/drawable/Drawable;", "Ljava/lang/Integer;", "fallback", "getFallback", "getFetcherDispatcher", "getFetcherFactory", "()Lkotlin/Pair;", "getHeaders", "()Lokhttp3/Headers;", "getInterceptorDispatcher", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "getListener", "()Lcoil/request/ImageRequest$Listener;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "getMemoryCachePolicy", "getNetworkCachePolicy", "getParameters", "()Lcoil/request/Parameters;", "placeholder", "getPlaceholder", "getPlaceholderMemoryCacheKey", "getPrecision", "()Lcoil/size/Precision;", "getPremultipliedAlpha", "getScale", "()Lcoil/size/Scale;", "getSizeResolver", "()Lcoil/size/SizeResolver;", "getTags", "()Lcoil/request/Tags;", "getTarget", "()Lcoil/target/Target;", "getTransformationDispatcher", "getTransformations", "()Ljava/util/List;", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", "equals", "other", "hashCode", "newBuilder", "Lcoil/request/ImageRequest$Builder;", "Builder", "Listener", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageRequest {
    private final boolean allowConversionToBitmap;
    private final boolean allowHardware;
    private final boolean allowRgb565;
    private final Bitmap.Config bitmapConfig;
    private final ColorSpace colorSpace;
    private final Context context;
    private final Object data;
    private final CoroutineDispatcher decoderDispatcher;
    private final Decoder.Factory decoderFactory;
    private final DefaultRequestOptions defaults;
    private final DefinedRequestOptions defined;
    private final String diskCacheKey;
    private final CachePolicy diskCachePolicy;
    private final Drawable errorDrawable;
    private final Integer errorResId;
    private final Drawable fallbackDrawable;
    private final Integer fallbackResId;
    private final CoroutineDispatcher fetcherDispatcher;
    private final Pair<Fetcher.Factory<?>, Class<?>> fetcherFactory;
    private final Headers headers;
    private final CoroutineDispatcher interceptorDispatcher;
    private final Lifecycle lifecycle;
    private final Listener listener;
    private final MemoryCache.Key memoryCacheKey;
    private final CachePolicy memoryCachePolicy;
    private final CachePolicy networkCachePolicy;
    private final Parameters parameters;
    private final Drawable placeholderDrawable;
    private final MemoryCache.Key placeholderMemoryCacheKey;
    private final Integer placeholderResId;
    private final Precision precision;
    private final boolean premultipliedAlpha;
    private final Scale scale;
    private final SizeResolver sizeResolver;
    private final Tags tags;
    private final Target target;
    private final CoroutineDispatcher transformationDispatcher;
    private final List<Transformation> transformations;
    private final Transition.Factory transitionFactory;

    public /* synthetic */ ImageRequest(Context context, Object obj, Target target, Listener listener, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, Decoder.Factory factory, List list, Transition.Factory factory2, Headers headers, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, target, listener, key, str, config, colorSpace, precision, pair, factory, list, factory2, headers, tags, z, z2, z3, z4, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, sizeResolver, scale, parameters, key2, num, drawable, num2, drawable2, num3, drawable3, definedRequestOptions, defaultRequestOptions);
    }

    public final Builder newBuilder() {
        return newBuilder$default(this, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImageRequest(Context context, Object obj, Target target, Listener listener, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair<? extends Fetcher.Factory<?>, ? extends Class<?>> pair, Decoder.Factory factory, List<? extends Transformation> list, Transition.Factory factory2, Headers headers, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions) {
        this.context = context;
        this.data = obj;
        this.target = target;
        this.listener = listener;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.bitmapConfig = config;
        this.colorSpace = colorSpace;
        this.precision = precision;
        this.fetcherFactory = pair;
        this.decoderFactory = factory;
        this.transformations = list;
        this.transitionFactory = factory2;
        this.headers = headers;
        this.tags = tags;
        this.allowConversionToBitmap = z;
        this.allowHardware = z2;
        this.allowRgb565 = z3;
        this.premultipliedAlpha = z4;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
        this.interceptorDispatcher = coroutineDispatcher;
        this.fetcherDispatcher = coroutineDispatcher2;
        this.decoderDispatcher = coroutineDispatcher3;
        this.transformationDispatcher = coroutineDispatcher4;
        this.lifecycle = lifecycle;
        this.sizeResolver = sizeResolver;
        this.scale = scale;
        this.parameters = parameters;
        this.placeholderMemoryCacheKey = key2;
        this.placeholderResId = num;
        this.placeholderDrawable = drawable;
        this.errorResId = num2;
        this.errorDrawable = drawable2;
        this.fallbackResId = num3;
        this.fallbackDrawable = drawable3;
        this.defined = definedRequestOptions;
        this.defaults = defaultRequestOptions;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Object getData() {
        return this.data;
    }

    public final Target getTarget() {
        return this.target;
    }

    public final Listener getListener() {
        return this.listener;
    }

    public final MemoryCache.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    public final Precision getPrecision() {
        return this.precision;
    }

    public final Pair<Fetcher.Factory<?>, Class<?>> getFetcherFactory() {
        return this.fetcherFactory;
    }

    public final Decoder.Factory getDecoderFactory() {
        return this.decoderFactory;
    }

    public final List<Transformation> getTransformations() {
        return this.transformations;
    }

    public final Transition.Factory getTransitionFactory() {
        return this.transitionFactory;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final Tags getTags() {
        return this.tags;
    }

    public final boolean getAllowConversionToBitmap() {
        return this.allowConversionToBitmap;
    }

    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final SizeResolver getSizeResolver() {
        return this.sizeResolver;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final Parameters getParameters() {
        return this.parameters;
    }

    public final MemoryCache.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    public final DefinedRequestOptions getDefined() {
        return this.defined;
    }

    public final DefaultRequestOptions getDefaults() {
        return this.defaults;
    }

    public final Drawable getPlaceholder() {
        return Requests.getDrawableCompat(this, this.placeholderDrawable, this.placeholderResId, this.defaults.getPlaceholder());
    }

    public final Drawable getError() {
        return Requests.getDrawableCompat(this, this.errorDrawable, this.errorResId, this.defaults.getError());
    }

    public final Drawable getFallback() {
        return Requests.getDrawableCompat(this, this.fallbackDrawable, this.fallbackResId, this.defaults.getFallback());
    }

    public static /* synthetic */ Builder newBuilder$default(ImageRequest imageRequest, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = imageRequest.context;
        }
        return imageRequest.newBuilder(context);
    }

    public final Builder newBuilder(Context context) {
        return new Builder(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (Intrinsics.areEqual(this.context, imageRequest.context) && Intrinsics.areEqual(this.data, imageRequest.data) && Intrinsics.areEqual(this.target, imageRequest.target) && Intrinsics.areEqual(this.listener, imageRequest.listener) && Intrinsics.areEqual(this.memoryCacheKey, imageRequest.memoryCacheKey) && Intrinsics.areEqual(this.diskCacheKey, imageRequest.diskCacheKey) && this.bitmapConfig == imageRequest.bitmapConfig && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.colorSpace, imageRequest.colorSpace)) && this.precision == imageRequest.precision && Intrinsics.areEqual(this.fetcherFactory, imageRequest.fetcherFactory) && Intrinsics.areEqual(this.decoderFactory, imageRequest.decoderFactory) && Intrinsics.areEqual(this.transformations, imageRequest.transformations) && Intrinsics.areEqual(this.transitionFactory, imageRequest.transitionFactory) && Intrinsics.areEqual(this.headers, imageRequest.headers) && Intrinsics.areEqual(this.tags, imageRequest.tags) && this.allowConversionToBitmap == imageRequest.allowConversionToBitmap && this.allowHardware == imageRequest.allowHardware && this.allowRgb565 == imageRequest.allowRgb565 && this.premultipliedAlpha == imageRequest.premultipliedAlpha && this.memoryCachePolicy == imageRequest.memoryCachePolicy && this.diskCachePolicy == imageRequest.diskCachePolicy && this.networkCachePolicy == imageRequest.networkCachePolicy && Intrinsics.areEqual(this.interceptorDispatcher, imageRequest.interceptorDispatcher) && Intrinsics.areEqual(this.fetcherDispatcher, imageRequest.fetcherDispatcher) && Intrinsics.areEqual(this.decoderDispatcher, imageRequest.decoderDispatcher) && Intrinsics.areEqual(this.transformationDispatcher, imageRequest.transformationDispatcher) && Intrinsics.areEqual(this.placeholderMemoryCacheKey, imageRequest.placeholderMemoryCacheKey) && Intrinsics.areEqual(this.placeholderResId, imageRequest.placeholderResId) && Intrinsics.areEqual(this.placeholderDrawable, imageRequest.placeholderDrawable) && Intrinsics.areEqual(this.errorResId, imageRequest.errorResId) && Intrinsics.areEqual(this.errorDrawable, imageRequest.errorDrawable) && Intrinsics.areEqual(this.fallbackResId, imageRequest.fallbackResId) && Intrinsics.areEqual(this.fallbackDrawable, imageRequest.fallbackDrawable) && Intrinsics.areEqual(this.lifecycle, imageRequest.lifecycle) && Intrinsics.areEqual(this.sizeResolver, imageRequest.sizeResolver) && this.scale == imageRequest.scale && Intrinsics.areEqual(this.parameters, imageRequest.parameters) && Intrinsics.areEqual(this.defined, imageRequest.defined) && Intrinsics.areEqual(this.defaults, imageRequest.defaults))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.context.hashCode() * 31) + this.data.hashCode()) * 31;
        Target target = this.target;
        int hashCode2 = (hashCode + (target != null ? target.hashCode() : 0)) * 31;
        Listener listener = this.listener;
        int hashCode3 = (hashCode2 + (listener != null ? listener.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.memoryCacheKey;
        int hashCode4 = (hashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.diskCacheKey;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.bitmapConfig.hashCode()) * 31;
        ColorSpace colorSpace = this.colorSpace;
        int hashCode6 = (((hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.precision.hashCode()) * 31;
        Pair<Fetcher.Factory<?>, Class<?>> pair = this.fetcherFactory;
        int hashCode7 = (hashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        Decoder.Factory factory = this.decoderFactory;
        int hashCode8 = (((((((((((((((((((((((((((((((((((((((hashCode7 + (factory != null ? factory.hashCode() : 0)) * 31) + this.transformations.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m(this.allowConversionToBitmap)) * 31) + UByte$$ExternalSyntheticBackport0.m(this.allowHardware)) * 31) + UByte$$ExternalSyntheticBackport0.m(this.allowRgb565)) * 31) + UByte$$ExternalSyntheticBackport0.m(this.premultipliedAlpha)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.interceptorDispatcher.hashCode()) * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.lifecycle.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.parameters.hashCode()) * 31;
        MemoryCache.Key key2 = this.placeholderMemoryCacheKey;
        int hashCode9 = (hashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.placeholderResId;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.placeholderDrawable;
        int hashCode11 = (hashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.errorResId;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.errorDrawable;
        int hashCode13 = (hashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.fallbackResId;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.fallbackDrawable;
        return ((((hashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    /* compiled from: ImageRequest.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcoil/request/ImageRequest$Listener;", "", "onCancel", "", "request", "Lcoil/request/ImageRequest;", "onError", "result", "Lcoil/request/ErrorResult;", "onStart", "onSuccess", "Lcoil/request/SuccessResult;", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Listener {
        void onCancel(ImageRequest imageRequest);

        void onError(ImageRequest imageRequest, ErrorResult errorResult);

        void onStart(ImageRequest imageRequest);

        void onSuccess(ImageRequest imageRequest, SuccessResult successResult);

        /* compiled from: ImageRequest.kt */
        /* renamed from: coil.request.ImageRequest$Listener$-CC  reason: invalid class name */
        /* loaded from: classes2.dex */
        public final /* synthetic */ class CC {
            public static void $default$onCancel(Listener _this, ImageRequest imageRequest) {
            }

            public static void $default$onError(Listener _this, ImageRequest imageRequest, ErrorResult errorResult) {
            }

            public static void $default$onStart(Listener _this, ImageRequest imageRequest) {
            }

            public static void $default$onSuccess(Listener _this, ImageRequest imageRequest, SuccessResult successResult) {
            }
        }

        /* compiled from: ImageRequest.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static void onStart(Listener listener, ImageRequest imageRequest) {
                CC.$default$onStart(listener, imageRequest);
            }

            @Deprecated
            public static void onCancel(Listener listener, ImageRequest imageRequest) {
                CC.$default$onCancel(listener, imageRequest);
            }

            @Deprecated
            public static void onError(Listener listener, ImageRequest imageRequest, ErrorResult errorResult) {
                CC.$default$onError(listener, imageRequest, errorResult);
            }

            @Deprecated
            public static void onSuccess(Listener listener, ImageRequest imageRequest, SuccessResult successResult) {
                CC.$default$onSuccess(listener, imageRequest, successResult);
            }
        }
    }

    /* compiled from: ImageRequest.kt */
    @Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0016\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u0019J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010P\u001a\u00020\u000eJ\u0006\u0010Q\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u000e\u0010R\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tJ\u000e\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u001fJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020UH\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u001bJ\u000e\u0010V\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0013J\u0010\u0010Z\u001a\u00020\u00002\b\u0010[\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010Z\u001a\u00020\u00002\b\b\u0001\u0010\\\u001a\u00020\u001fJ\u0010\u0010]\u001a\u00020\u00002\b\u0010[\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010]\u001a\u00020\u00002\b\b\u0001\u0010\\\u001a\u00020\u001fJ\u0010\u0010^\u001a\u00020\u00002\u0006\u0010^\u001a\u00020_H\u0007J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0013J#\u0010$\u001a\u00020\u0000\"\n\b\u0000\u0010`\u0018\u0001*\u00020\u00012\f\u0010W\u001a\b\u0012\u0004\u0012\u0002H`0&H\u0086\bJ,\u0010$\u001a\u00020\u0000\"\b\b\u0000\u0010`*\u00020\u00012\f\u0010W\u001a\b\u0012\u0004\u0012\u0002H`0&2\f\u0010a\u001a\b\u0012\u0004\u0012\u0002H`0'J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020bJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0013J\u0010\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u0010+\u001a\u00020\u00002\b\u0010c\u001a\u0004\u0018\u00010dJÇ\u0001\u0010-\u001a\u00020\u00002#\b\u0006\u0010e\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020h0f2#\b\u0006\u0010i\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020h0f28\b\u0006\u0010j\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110l¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(m\u0012\u0004\u0012\u00020h0k28\b\u0006\u0010n\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110o¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(m\u0012\u0004\u0012\u00020h0kH\u0086\bJ\u0010\u0010-\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010.J\u0010\u0010/\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u000100J\u0010\u0010/\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010\u0019J\u000e\u00101\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u001bJ\u000e\u00102\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u001bJ\u000e\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020pJ\u0010\u0010q\u001a\u00020\u00002\b\u0010[\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010q\u001a\u00020\u00002\b\b\u0001\u0010\\\u001a\u00020\u001fJ\u0010\u00106\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u000100J\u0010\u00106\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010\u0019J\u000e\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tJ\u000e\u0010r\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0019J\u000e\u0010s\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u0019J\b\u0010t\u001a\u00020hH\u0002J\b\u0010u\u001a\u00020hH\u0002J\b\u0010v\u001a\u00020,H\u0002J\b\u0010w\u001a\u00020=H\u0002J\b\u0010x\u001a\u00020?H\u0002J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020=J\u0016\u0010y\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u0019J&\u0010z\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u00192\b\u0010N\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0019H\u0007J\u0016\u0010{\u001a\u00020\u00002\u0006\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020}J\u000e\u0010{\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u007fJ\u000f\u0010{\u001a\u00020\u00002\u0007\u0010\u0080\u0001\u001a\u00020?J\u0010\u0010{\u001a\u00020\u00002\b\b\u0001\u0010{\u001a\u00020\u001fJ\u001a\u0010{\u001a\u00020\u00002\b\b\u0001\u0010|\u001a\u00020\u001f2\b\b\u0001\u0010~\u001a\u00020\u001fJ'\u0010\u0081\u0001\u001a\u00020\u0000\"\n\b\u0000\u0010`\u0018\u0001*\u00020\u00012\t\u0010\u0081\u0001\u001a\u0004\u0018\u0001H`H\u0086\b¢\u0006\u0003\u0010\u0082\u0001J2\u0010\u0081\u0001\u001a\u00020\u0000\"\b\b\u0000\u0010`*\u00020\u00012\u000e\u0010a\u001a\n\u0012\u0006\b\u0000\u0012\u0002H`0'2\t\u0010\u0081\u0001\u001a\u0004\u0018\u0001H`¢\u0006\u0003\u0010\u0083\u0001J\u000f\u0010B\u001a\u00020\u00002\u0007\u0010B\u001a\u00030\u0084\u0001J|\u0010D\u001a\u00020\u00002%\b\u0006\u0010e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(q\u0012\u0004\u0012\u00020h0f2%\b\u0006\u0010j\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020h0f2#\b\u0006\u0010n\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(m\u0012\u0004\u0012\u00020h0fH\u0086\bJ\u0010\u0010D\u001a\u00020\u00002\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001J\u0010\u0010D\u001a\u00020\u00002\b\u0010D\u001a\u0004\u0018\u00010EJ\u000e\u0010F\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0013J!\u0010G\u001a\u00020\u00002\u0013\u0010G\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020I0\u0087\u0001\"\u00020I¢\u0006\u0003\u0010\u0088\u0001J\u0014\u0010G\u001a\u00020\u00002\f\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HJ\u0013\u0010\u0089\u0001\u001a\u00020\u00002\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0007J\u000f\u0010J\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020KR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010 R\u0010\u0010#\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010$\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00107\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010 R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010B\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0004\u0012\u00020\u0001\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u008b\u0001"}, d2 = {"Lcoil/request/ImageRequest$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "request", "Lcoil/request/ImageRequest;", "(Lcoil/request/ImageRequest;Landroid/content/Context;)V", "allowConversionToBitmap", "", "allowHardware", "Ljava/lang/Boolean;", "allowRgb565", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "colorSpace", "Landroid/graphics/ColorSpace;", "data", "decoderDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "decoderFactory", "Lcoil/decode/Decoder$Factory;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "diskCacheKey", "", "diskCachePolicy", "Lcoil/request/CachePolicy;", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "errorResId", "", "Ljava/lang/Integer;", "fallbackDrawable", "fallbackResId", "fetcherDispatcher", "fetcherFactory", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "headers", "Lokhttp3/Headers$Builder;", "interceptorDispatcher", "lifecycle", "Landroidx/lifecycle/Lifecycle;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/request/ImageRequest$Listener;", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "memoryCachePolicy", "networkCachePolicy", "parameters", "Lcoil/request/Parameters$Builder;", "placeholderDrawable", "placeholderMemoryCacheKey", "placeholderResId", "precision", "Lcoil/size/Precision;", "premultipliedAlpha", "resolvedLifecycle", "resolvedScale", "Lcoil/size/Scale;", "resolvedSizeResolver", "Lcoil/size/SizeResolver;", "scale", "sizeResolver", "tags", "", TypedValues.AttributesType.S_TARGET, "Lcoil/target/Target;", "transformationDispatcher", "transformations", "", "Lcoil/transform/Transformation;", "transitionFactory", "Lcoil/transition/Transition$Factory;", "addHeader", "name", "value", "enable", "config", "build", "crossfade", "durationMillis", "decoder", "Lcoil/decode/Decoder;", "dispatcher", "factory", "key", "policy", "error", "drawable", "drawableResId", "fallback", "fetcher", "Lcoil/fetch/Fetcher;", ExifInterface.GPS_DIRECTION_TRUE, "type", "Lokhttp3/Headers;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "onCancel", "onError", "Lkotlin/Function2;", "Lcoil/request/ErrorResult;", "result", "onSuccess", "Lcoil/request/SuccessResult;", "Lcoil/request/Parameters;", "placeholder", "removeHeader", "removeParameter", "resetResolvedScale", "resetResolvedValues", "resolveLifecycle", "resolveScale", "resolveSizeResolver", "setHeader", "setParameter", "size", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "Lcoil/size/Dimension;", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "Lcoil/size/Size;", "resolver", ViewHierarchyConstants.TAG_KEY, "(Ljava/lang/Object;)Lcoil/request/ImageRequest$Builder;", "(Ljava/lang/Class;Ljava/lang/Object;)Lcoil/request/ImageRequest$Builder;", "Lcoil/request/Tags;", "imageView", "Landroid/widget/ImageView;", "", "([Lcoil/transform/Transformation;)Lcoil/request/ImageRequest$Builder;", "transition", "Lcoil/transition/Transition;", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean allowConversionToBitmap;
        private Boolean allowHardware;
        private Boolean allowRgb565;
        private Bitmap.Config bitmapConfig;
        private ColorSpace colorSpace;
        private final Context context;
        private Object data;
        private CoroutineDispatcher decoderDispatcher;
        private Decoder.Factory decoderFactory;
        private DefaultRequestOptions defaults;
        private String diskCacheKey;
        private CachePolicy diskCachePolicy;
        private Drawable errorDrawable;
        private Integer errorResId;
        private Drawable fallbackDrawable;
        private Integer fallbackResId;
        private CoroutineDispatcher fetcherDispatcher;
        private Pair<? extends Fetcher.Factory<?>, ? extends Class<?>> fetcherFactory;
        private Headers.Builder headers;
        private CoroutineDispatcher interceptorDispatcher;
        private Lifecycle lifecycle;
        private Listener listener;
        private MemoryCache.Key memoryCacheKey;
        private CachePolicy memoryCachePolicy;
        private CachePolicy networkCachePolicy;
        private Parameters.Builder parameters;
        private Drawable placeholderDrawable;
        private MemoryCache.Key placeholderMemoryCacheKey;
        private Integer placeholderResId;
        private Precision precision;
        private boolean premultipliedAlpha;
        private Lifecycle resolvedLifecycle;
        private Scale resolvedScale;
        private SizeResolver resolvedSizeResolver;
        private Scale scale;
        private SizeResolver sizeResolver;
        private Map<Class<?>, Object> tags;
        private Target target;
        private CoroutineDispatcher transformationDispatcher;
        private List<? extends Transformation> transformations;
        private Transition.Factory transitionFactory;

        public Builder(ImageRequest imageRequest) {
            this(imageRequest, null, 2, null);
        }

        public final Builder setParameter(String str, Object obj) {
            return setParameter$default(this, str, obj, null, 4, null);
        }

        public Builder(Context context) {
            this.context = context;
            this.defaults = Requests.getDEFAULT_REQUEST_OPTIONS();
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.diskCacheKey = null;
            this.bitmapConfig = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = null;
            }
            this.precision = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.transformations = CollectionsKt.emptyList();
            this.transitionFactory = null;
            this.headers = null;
            this.tags = null;
            this.allowConversionToBitmap = true;
            this.allowHardware = null;
            this.allowRgb565 = null;
            this.premultipliedAlpha = true;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.interceptorDispatcher = null;
            this.fetcherDispatcher = null;
            this.decoderDispatcher = null;
            this.transformationDispatcher = null;
            this.parameters = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderResId = null;
            this.placeholderDrawable = null;
            this.errorResId = null;
            this.errorDrawable = null;
            this.fallbackResId = null;
            this.fallbackDrawable = null;
            this.lifecycle = null;
            this.sizeResolver = null;
            this.scale = null;
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        public Builder(ImageRequest imageRequest, Context context) {
            this.context = context;
            this.defaults = imageRequest.getDefaults();
            this.data = imageRequest.getData();
            this.target = imageRequest.getTarget();
            this.listener = imageRequest.getListener();
            this.memoryCacheKey = imageRequest.getMemoryCacheKey();
            this.diskCacheKey = imageRequest.getDiskCacheKey();
            this.bitmapConfig = imageRequest.getDefined().getBitmapConfig();
            if (Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = imageRequest.getColorSpace();
            }
            this.precision = imageRequest.getDefined().getPrecision();
            this.fetcherFactory = imageRequest.getFetcherFactory();
            this.decoderFactory = imageRequest.getDecoderFactory();
            this.transformations = imageRequest.getTransformations();
            this.transitionFactory = imageRequest.getDefined().getTransitionFactory();
            this.headers = imageRequest.getHeaders().newBuilder();
            this.tags = MapsKt.toMutableMap(imageRequest.getTags().asMap());
            this.allowConversionToBitmap = imageRequest.getAllowConversionToBitmap();
            this.allowHardware = imageRequest.getDefined().getAllowHardware();
            this.allowRgb565 = imageRequest.getDefined().getAllowRgb565();
            this.premultipliedAlpha = imageRequest.getPremultipliedAlpha();
            this.memoryCachePolicy = imageRequest.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = imageRequest.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = imageRequest.getDefined().getNetworkCachePolicy();
            this.interceptorDispatcher = imageRequest.getDefined().getInterceptorDispatcher();
            this.fetcherDispatcher = imageRequest.getDefined().getFetcherDispatcher();
            this.decoderDispatcher = imageRequest.getDefined().getDecoderDispatcher();
            this.transformationDispatcher = imageRequest.getDefined().getTransformationDispatcher();
            this.parameters = imageRequest.getParameters().newBuilder();
            this.placeholderMemoryCacheKey = imageRequest.getPlaceholderMemoryCacheKey();
            this.placeholderResId = imageRequest.placeholderResId;
            this.placeholderDrawable = imageRequest.placeholderDrawable;
            this.errorResId = imageRequest.errorResId;
            this.errorDrawable = imageRequest.errorDrawable;
            this.fallbackResId = imageRequest.fallbackResId;
            this.fallbackDrawable = imageRequest.fallbackDrawable;
            this.lifecycle = imageRequest.getDefined().getLifecycle();
            this.sizeResolver = imageRequest.getDefined().getSizeResolver();
            this.scale = imageRequest.getDefined().getScale();
            if (imageRequest.getContext() == context) {
                this.resolvedLifecycle = imageRequest.getLifecycle();
                this.resolvedSizeResolver = imageRequest.getSizeResolver();
                this.resolvedScale = imageRequest.getScale();
                return;
            }
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        public /* synthetic */ Builder(ImageRequest imageRequest, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageRequest, (i & 2) != 0 ? imageRequest.getContext() : context);
        }

        public final Builder data(Object obj) {
            this.data = obj;
            return this;
        }

        public final Builder memoryCacheKey(String str) {
            return memoryCacheKey(str != null ? new MemoryCache.Key(str, null, 2, null) : null);
        }

        public final Builder memoryCacheKey(MemoryCache.Key key) {
            this.memoryCacheKey = key;
            return this;
        }

        public final Builder diskCacheKey(String str) {
            this.diskCacheKey = str;
            return this;
        }

        public static /* synthetic */ Builder listener$default(Builder builder, Function1 function1, Function1 function12, Function2 function2, Function2 function22, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = ImageRequest$Builder$listener$1.INSTANCE;
            }
            if ((i & 2) != 0) {
                function12 = ImageRequest$Builder$listener$2.INSTANCE;
            }
            if ((i & 4) != 0) {
                function2 = ImageRequest$Builder$listener$3.INSTANCE;
            }
            if ((i & 8) != 0) {
                function22 = ImageRequest$Builder$listener$4.INSTANCE;
            }
            return builder.listener(new ImageRequest$Builder$listener$5(function1, function12, function2, function22));
        }

        public final Builder listener(Function1<? super ImageRequest, Unit> function1, Function1<? super ImageRequest, Unit> function12, Function2<? super ImageRequest, ? super ErrorResult, Unit> function2, Function2<? super ImageRequest, ? super SuccessResult, Unit> function22) {
            return listener(new ImageRequest$Builder$listener$5(function1, function12, function2, function22));
        }

        public final Builder listener(Listener listener) {
            this.listener = listener;
            return this;
        }

        public final Builder dispatcher(CoroutineDispatcher coroutineDispatcher) {
            this.fetcherDispatcher = coroutineDispatcher;
            this.decoderDispatcher = coroutineDispatcher;
            this.transformationDispatcher = coroutineDispatcher;
            return this;
        }

        public final Builder interceptorDispatcher(CoroutineDispatcher coroutineDispatcher) {
            this.interceptorDispatcher = coroutineDispatcher;
            return this;
        }

        public final Builder fetcherDispatcher(CoroutineDispatcher coroutineDispatcher) {
            this.fetcherDispatcher = coroutineDispatcher;
            return this;
        }

        public final Builder decoderDispatcher(CoroutineDispatcher coroutineDispatcher) {
            this.decoderDispatcher = coroutineDispatcher;
            return this;
        }

        public final Builder transformationDispatcher(CoroutineDispatcher coroutineDispatcher) {
            this.transformationDispatcher = coroutineDispatcher;
            return this;
        }

        public final Builder transformations(Transformation... transformationArr) {
            return transformations(ArraysKt.toList(transformationArr));
        }

        public final Builder transformations(List<? extends Transformation> list) {
            this.transformations = Collections.toImmutableList(list);
            return this;
        }

        public final Builder bitmapConfig(Bitmap.Config config) {
            this.bitmapConfig = config;
            return this;
        }

        public final Builder colorSpace(ColorSpace colorSpace) {
            this.colorSpace = colorSpace;
            return this;
        }

        public final Builder size(int i) {
            return size(i, i);
        }

        public final Builder size(int i, int i2) {
            return size(Sizes.Size(i, i2));
        }

        public final Builder size(Dimension dimension, Dimension dimension2) {
            return size(new Size(dimension, dimension2));
        }

        public final Builder size(Size size) {
            return size(SizeResolvers.create(size));
        }

        public final Builder size(SizeResolver sizeResolver) {
            this.sizeResolver = sizeResolver;
            resetResolvedValues();
            return this;
        }

        public final Builder scale(Scale scale) {
            this.scale = scale;
            return this;
        }

        public final Builder precision(Precision precision) {
            this.precision = precision;
            return this;
        }

        public final /* synthetic */ <T> Builder fetcherFactory(Fetcher.Factory<T> factory) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return fetcherFactory(factory, Object.class);
        }

        public final <T> Builder fetcherFactory(Fetcher.Factory<T> factory, Class<T> cls) {
            this.fetcherFactory = TuplesKt.to(factory, cls);
            return this;
        }

        public final Builder decoderFactory(Decoder.Factory factory) {
            this.decoderFactory = factory;
            return this;
        }

        public final Builder allowConversionToBitmap(boolean z) {
            this.allowConversionToBitmap = z;
            return this;
        }

        public final Builder allowHardware(boolean z) {
            this.allowHardware = Boolean.valueOf(z);
            return this;
        }

        public final Builder allowRgb565(boolean z) {
            this.allowRgb565 = Boolean.valueOf(z);
            return this;
        }

        public final Builder premultipliedAlpha(boolean z) {
            this.premultipliedAlpha = z;
            return this;
        }

        public final Builder memoryCachePolicy(CachePolicy cachePolicy) {
            this.memoryCachePolicy = cachePolicy;
            return this;
        }

        public final Builder diskCachePolicy(CachePolicy cachePolicy) {
            this.diskCachePolicy = cachePolicy;
            return this;
        }

        public final Builder networkCachePolicy(CachePolicy cachePolicy) {
            this.networkCachePolicy = cachePolicy;
            return this;
        }

        public final Builder headers(Headers headers) {
            this.headers = headers.newBuilder();
            return this;
        }

        public final Builder addHeader(String str, String str2) {
            Headers.Builder builder = this.headers;
            if (builder == null) {
                builder = new Headers.Builder();
                this.headers = builder;
            }
            builder.add(str, str2);
            return this;
        }

        public final Builder setHeader(String str, String str2) {
            Headers.Builder builder = this.headers;
            if (builder == null) {
                builder = new Headers.Builder();
                this.headers = builder;
            }
            builder.set(str, str2);
            return this;
        }

        public final Builder removeHeader(String str) {
            Headers.Builder builder = this.headers;
            if (builder != null) {
                builder.removeAll(str);
            }
            return this;
        }

        public final /* synthetic */ <T> Builder tag(T t) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return tag(Object.class, t);
        }

        public final <T> Builder tag(Class<? super T> cls, T t) {
            if (t == null) {
                Map<Class<?>, Object> map = this.tags;
                if (map != null) {
                    map.remove(cls);
                }
            } else {
                LinkedHashMap linkedHashMap = this.tags;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.tags = linkedHashMap;
                }
                T cast = cls.cast(t);
                Intrinsics.checkNotNull(cast);
                linkedHashMap.put(cls, cast);
            }
            return this;
        }

        public final Builder tags(Tags tags) {
            this.tags = MapsKt.toMutableMap(tags.asMap());
            return this;
        }

        public final Builder placeholderMemoryCacheKey(String str) {
            return placeholderMemoryCacheKey(str != null ? new MemoryCache.Key(str, null, 2, null) : null);
        }

        public final Builder placeholderMemoryCacheKey(MemoryCache.Key key) {
            this.placeholderMemoryCacheKey = key;
            return this;
        }

        public final Builder placeholder(int i) {
            this.placeholderResId = Integer.valueOf(i);
            this.placeholderDrawable = null;
            return this;
        }

        public final Builder placeholder(Drawable drawable) {
            this.placeholderDrawable = drawable;
            this.placeholderResId = 0;
            return this;
        }

        public final Builder error(int i) {
            this.errorResId = Integer.valueOf(i);
            this.errorDrawable = null;
            return this;
        }

        public final Builder error(Drawable drawable) {
            this.errorDrawable = drawable;
            this.errorResId = 0;
            return this;
        }

        public final Builder fallback(int i) {
            this.fallbackResId = Integer.valueOf(i);
            this.fallbackDrawable = null;
            return this;
        }

        public final Builder fallback(Drawable drawable) {
            this.fallbackDrawable = drawable;
            this.fallbackResId = 0;
            return this;
        }

        public final Builder target(ImageView imageView) {
            return target(new ImageViewTarget(imageView));
        }

        public static /* synthetic */ Builder target$default(Builder builder, Function1 function1, Function1 function12, Function1 function13, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = ImageRequest$Builder$target$1.INSTANCE;
            }
            if ((i & 2) != 0) {
                function12 = ImageRequest$Builder$target$2.INSTANCE;
            }
            if ((i & 4) != 0) {
                function13 = ImageRequest$Builder$target$3.INSTANCE;
            }
            return builder.target(new ImageRequest$Builder$target$4(function1, function12, function13));
        }

        public final Builder target(Function1<? super Drawable, Unit> function1, Function1<? super Drawable, Unit> function12, Function1<? super Drawable, Unit> function13) {
            return target(new ImageRequest$Builder$target$4(function1, function12, function13));
        }

        public final Builder target(Target target) {
            this.target = target;
            resetResolvedValues();
            return this;
        }

        public final Builder crossfade(boolean z) {
            return crossfade(z ? 100 : 0);
        }

        public final Builder crossfade(int i) {
            CrossfadeTransition.Factory factory;
            if (i > 0) {
                factory = new CrossfadeTransition.Factory(i, false, 2, null);
            } else {
                factory = Transition.Factory.NONE;
            }
            transitionFactory(factory);
            return this;
        }

        public final Builder transitionFactory(Transition.Factory factory) {
            this.transitionFactory = factory;
            return this;
        }

        public final Builder lifecycle(LifecycleOwner lifecycleOwner) {
            return lifecycle(lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null);
        }

        public final Builder lifecycle(Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        public static /* synthetic */ Builder setParameter$default(Builder builder, String str, Object obj, String str2, int i, Object obj2) {
            if ((i & 4) != 0) {
                str2 = obj != null ? obj.toString() : null;
            }
            return builder.setParameter(str, obj, str2);
        }

        public final Builder setParameter(String str, Object obj, String str2) {
            Parameters.Builder builder = this.parameters;
            if (builder == null) {
                builder = new Parameters.Builder();
                this.parameters = builder;
            }
            builder.set(str, obj, str2);
            return this;
        }

        public final Builder removeParameter(String str) {
            Parameters.Builder builder = this.parameters;
            if (builder != null) {
                builder.remove(str);
            }
            return this;
        }

        public final Builder parameters(Parameters parameters) {
            this.parameters = parameters.newBuilder();
            return this;
        }

        public final Builder defaults(DefaultRequestOptions defaultRequestOptions) {
            this.defaults = defaultRequestOptions;
            resetResolvedScale();
            return this;
        }

        public final ImageRequest build() {
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = NullRequestData.INSTANCE;
            }
            Object obj2 = obj;
            Target target = this.target;
            Listener listener = this.listener;
            MemoryCache.Key key = this.memoryCacheKey;
            String str = this.diskCacheKey;
            Bitmap.Config config = this.bitmapConfig;
            if (config == null) {
                config = this.defaults.getBitmapConfig();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.colorSpace;
            Precision precision = this.precision;
            if (precision == null) {
                precision = this.defaults.getPrecision();
            }
            Precision precision2 = precision;
            Pair<? extends Fetcher.Factory<?>, ? extends Class<?>> pair = this.fetcherFactory;
            Decoder.Factory factory = this.decoderFactory;
            List<? extends Transformation> list = this.transformations;
            Transition.Factory factory2 = this.transitionFactory;
            if (factory2 == null) {
                factory2 = this.defaults.getTransitionFactory();
            }
            Transition.Factory factory3 = factory2;
            Headers.Builder builder = this.headers;
            Headers orEmpty = Utils.orEmpty(builder != null ? builder.build() : null);
            Map<Class<?>, ? extends Object> map = this.tags;
            Tags orEmpty2 = Utils.orEmpty(map != null ? Tags.Companion.from(map) : null);
            boolean z = this.allowConversionToBitmap;
            Boolean bool = this.allowHardware;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.defaults.getAllowHardware();
            Boolean bool2 = this.allowRgb565;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.defaults.getAllowRgb565();
            boolean z2 = this.premultipliedAlpha;
            CachePolicy cachePolicy = this.memoryCachePolicy;
            if (cachePolicy == null) {
                cachePolicy = this.defaults.getMemoryCachePolicy();
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.diskCachePolicy;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.defaults.getDiskCachePolicy();
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.networkCachePolicy;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.defaults.getNetworkCachePolicy();
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            CoroutineDispatcher coroutineDispatcher = this.interceptorDispatcher;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.defaults.getInterceptorDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            CoroutineDispatcher coroutineDispatcher3 = this.fetcherDispatcher;
            if (coroutineDispatcher3 == null) {
                coroutineDispatcher3 = this.defaults.getFetcherDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
            CoroutineDispatcher coroutineDispatcher5 = this.decoderDispatcher;
            if (coroutineDispatcher5 == null) {
                coroutineDispatcher5 = this.defaults.getDecoderDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher6 = coroutineDispatcher5;
            CoroutineDispatcher coroutineDispatcher7 = this.transformationDispatcher;
            if (coroutineDispatcher7 == null) {
                coroutineDispatcher7 = this.defaults.getTransformationDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher8 = coroutineDispatcher7;
            Lifecycle lifecycle = this.lifecycle;
            if (lifecycle == null && (lifecycle = this.resolvedLifecycle) == null) {
                lifecycle = resolveLifecycle();
            }
            Lifecycle lifecycle2 = lifecycle;
            SizeResolver sizeResolver = this.sizeResolver;
            if (sizeResolver == null && (sizeResolver = this.resolvedSizeResolver) == null) {
                sizeResolver = resolveSizeResolver();
            }
            SizeResolver sizeResolver2 = sizeResolver;
            Scale scale = this.scale;
            if (scale == null && (scale = this.resolvedScale) == null) {
                scale = resolveScale();
            }
            Scale scale2 = scale;
            Parameters.Builder builder2 = this.parameters;
            return new ImageRequest(context, obj2, target, listener, key, str, config2, colorSpace, precision2, pair, factory, list, factory3, orEmpty, orEmpty2, z, booleanValue, booleanValue2, z2, cachePolicy2, cachePolicy4, cachePolicy6, coroutineDispatcher2, coroutineDispatcher4, coroutineDispatcher6, coroutineDispatcher8, lifecycle2, sizeResolver2, scale2, Utils.orEmpty(builder2 != null ? builder2.build() : null), this.placeholderMemoryCacheKey, this.placeholderResId, this.placeholderDrawable, this.errorResId, this.errorDrawable, this.fallbackResId, this.fallbackDrawable, new DefinedRequestOptions(this.lifecycle, this.sizeResolver, this.scale, this.interceptorDispatcher, this.fetcherDispatcher, this.decoderDispatcher, this.transformationDispatcher, this.transitionFactory, this.precision, this.bitmapConfig, this.allowHardware, this.allowRgb565, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy), this.defaults, null);
        }

        private final void resetResolvedValues() {
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        private final void resetResolvedScale() {
            this.resolvedScale = null;
        }

        private final Lifecycle resolveLifecycle() {
            Target target = this.target;
            Lifecycle lifecycle = Contexts.getLifecycle(target instanceof ViewTarget ? ((ViewTarget) target).getView().getContext() : this.context);
            return lifecycle == null ? GlobalLifecycle.INSTANCE : lifecycle;
        }

        private final SizeResolver resolveSizeResolver() {
            Target target = this.target;
            if (target instanceof ViewTarget) {
                View view = ((ViewTarget) target).getView();
                if (view instanceof ImageView) {
                    ImageView.ScaleType scaleType = ((ImageView) view).getScaleType();
                    if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                        return SizeResolvers.create(Size.ORIGINAL);
                    }
                }
                return ViewSizeResolvers.create$default(view, false, 2, null);
            }
            return new DisplaySizeResolver(this.context);
        }

        private final Scale resolveScale() {
            View view;
            SizeResolver sizeResolver = this.sizeResolver;
            View view2 = null;
            ViewSizeResolver viewSizeResolver = sizeResolver instanceof ViewSizeResolver ? (ViewSizeResolver) sizeResolver : null;
            if (viewSizeResolver == null || (view = viewSizeResolver.getView()) == null) {
                Target target = this.target;
                ViewTarget viewTarget = target instanceof ViewTarget ? (ViewTarget) target : null;
                if (viewTarget != null) {
                    view2 = viewTarget.getView();
                }
            } else {
                view2 = view;
            }
            if (view2 instanceof ImageView) {
                return Utils.getScale((ImageView) view2);
            }
            return Scale.FIT;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'fetcherFactory'.", replaceWith = @ReplaceWith(expression = "fetcherFactory<Any> { _, _, _ -> fetcher }", imports = {}))
        public final Builder fetcher(Fetcher fetcher) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'decoderFactory'.", replaceWith = @ReplaceWith(expression = "decoderFactory { _, _, _ -> decoder }", imports = {}))
        public final Builder decoder(Decoder decoder) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'transitionFactory'.", replaceWith = @ReplaceWith(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        public final Builder transition(Transition transition) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }
    }
}
