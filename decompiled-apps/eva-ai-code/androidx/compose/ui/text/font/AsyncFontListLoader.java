package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.TypefaceResult;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.YieldKt;
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0011\u0010 \u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "fontList", "", "Landroidx/compose/ui/text/font/Font;", "initialType", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "onCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "cacheable", "", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "<set-?>", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsyncFontListLoader implements State<Object> {
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable;
    private final List<Font> fontList;
    private final Function1<TypefaceResult.Immutable, Unit> onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;
    private final MutableState value$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends Font> fontList, Object initialType, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, Function1<? super TypefaceResult.Immutable, Unit> onCompletion, PlatformFontLoader platformFontLoader) {
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(initialType, "initialType");
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(onCompletion, "onCompletion");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        this.fontList = fontList;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = onCompletion;
        this.platformFontLoader = platformFontLoader;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialType, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.cacheable = true;
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    public final boolean getCacheable$ui_text_release() {
        return this.cacheable;
    }

    public final void setCacheable$ui_text_release(boolean z) {
        this.cacheable = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #2 {all -> 0x010a, blocks: (B:28:0x0076, B:30:0x008d, B:35:0x00be, B:38:0x00f2), top: B:57:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2 A[Catch: all -> 0x010a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x010a, blocks: (B:28:0x0076, B:30:0x008d, B:35:0x00be, B:38:0x00f2), top: B:57:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0105 -> B:42:0x0106). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010d -> B:46:0x010f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(Continuation<? super Unit> continuation) {
        AsyncFontListLoader$load$1 asyncFontListLoader$load$1;
        int i;
        AsyncFontListLoader asyncFontListLoader;
        List<Font> list;
        int size;
        AsyncFontListLoader asyncFontListLoader2;
        int i2;
        Font font;
        List<Font> list2;
        int i3;
        if (continuation instanceof AsyncFontListLoader$load$1) {
            asyncFontListLoader$load$1 = (AsyncFontListLoader$load$1) continuation;
            if ((asyncFontListLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$load$1.label -= Integer.MIN_VALUE;
                Object obj = asyncFontListLoader$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = asyncFontListLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        list = this.fontList;
                        size = list.size();
                        asyncFontListLoader2 = this;
                        i2 = 0;
                        if (i2 >= size) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        asyncFontListLoader = this;
                    }
                } else if (i == 1) {
                    size = asyncFontListLoader$load$1.I$1;
                    i3 = asyncFontListLoader$load$1.I$0;
                    Font font2 = (Font) asyncFontListLoader$load$1.L$2;
                    List<Font> list3 = (List) asyncFontListLoader$load$1.L$1;
                    AsyncFontListLoader asyncFontListLoader3 = (AsyncFontListLoader) asyncFontListLoader$load$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        asyncFontListLoader2 = asyncFontListLoader3;
                        font = font2;
                        list2 = list3;
                        if (obj == null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        asyncFontListLoader = asyncFontListLoader3;
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    size = asyncFontListLoader$load$1.I$1;
                    i3 = asyncFontListLoader$load$1.I$0;
                    list2 = (List) asyncFontListLoader$load$1.L$1;
                    asyncFontListLoader = (AsyncFontListLoader) asyncFontListLoader$load$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        i2 = i3;
                        list = list2;
                        asyncFontListLoader2 = asyncFontListLoader;
                        i2++;
                        if (i2 >= size) {
                            try {
                                Font font3 = list.get(i2);
                                if (FontLoadingStrategy.m5189equalsimpl0(font3.mo5146getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m5193getAsyncPKNRLFQ())) {
                                    asyncFontListLoader$load$1.L$0 = asyncFontListLoader2;
                                    asyncFontListLoader$load$1.L$1 = list;
                                    asyncFontListLoader$load$1.L$2 = font3;
                                    asyncFontListLoader$load$1.I$0 = i2;
                                    asyncFontListLoader$load$1.I$1 = size;
                                    asyncFontListLoader$load$1.label = 1;
                                    int i4 = i2;
                                    Object runCached = asyncFontListLoader2.asyncTypefaceCache.runCached(font3, asyncFontListLoader2.platformFontLoader, false, new AsyncFontListLoader$load$2$typeface$1(asyncFontListLoader2, font3, null), asyncFontListLoader$load$1);
                                    if (runCached == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    list2 = list;
                                    obj = runCached;
                                    i3 = i4;
                                    font = font3;
                                    if (obj == null) {
                                        asyncFontListLoader2.setValue(FontSynthesis_androidKt.m5221synthesizeTypefaceFxwP2eA(asyncFontListLoader2.typefaceRequest.m5246getFontSynthesisGVVA2EU(), obj, font, asyncFontListLoader2.typefaceRequest.getFontWeight(), asyncFontListLoader2.typefaceRequest.m5245getFontStyle_LCdwA()));
                                        Unit unit = Unit.INSTANCE;
                                        boolean isActive = JobKt.isActive(asyncFontListLoader$load$1.getContext());
                                        asyncFontListLoader2.cacheable = false;
                                        asyncFontListLoader2.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader2.getValue(), isActive));
                                        return unit;
                                    }
                                    asyncFontListLoader$load$1.L$0 = asyncFontListLoader2;
                                    asyncFontListLoader$load$1.L$1 = list2;
                                    asyncFontListLoader$load$1.L$2 = null;
                                    asyncFontListLoader$load$1.I$0 = i3;
                                    asyncFontListLoader$load$1.I$1 = size;
                                    asyncFontListLoader$load$1.label = 2;
                                    if (YieldKt.yield(asyncFontListLoader$load$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    asyncFontListLoader = asyncFontListLoader2;
                                    i2 = i3;
                                    list = list2;
                                    asyncFontListLoader2 = asyncFontListLoader;
                                    i2++;
                                    if (i2 >= size) {
                                        boolean isActive2 = JobKt.isActive(asyncFontListLoader$load$1.getContext());
                                        asyncFontListLoader2.cacheable = false;
                                        asyncFontListLoader2.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader2.getValue(), isActive2));
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    i2++;
                                    if (i2 >= size) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                asyncFontListLoader = asyncFontListLoader2;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                boolean isActive3 = JobKt.isActive(asyncFontListLoader$load$1.getContext());
                asyncFontListLoader.cacheable = false;
                asyncFontListLoader.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader.getValue(), isActive3));
                throw th;
            }
        }
        asyncFontListLoader$load$1 = new AsyncFontListLoader$load$1(this, continuation);
        Object obj2 = asyncFontListLoader$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncFontListLoader$load$1.label;
        if (i != 0) {
        }
        boolean isActive32 = JobKt.isActive(asyncFontListLoader$load$1.getContext());
        asyncFontListLoader.cacheable = false;
        asyncFontListLoader.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader.getValue(), isActive32));
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadWithTimeoutOrNull$ui_text_release(Font font, Continuation<Object> continuation) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        int i;
        Object obj;
        try {
            if (continuation instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) continuation;
                if ((asyncFontListLoader$loadWithTimeoutOrNull$1.label & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label -= Integer.MIN_VALUE;
                    Object obj2 = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
                    obj = null;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = font;
                        asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
                        obj2 = TimeoutKt.withTimeoutOrNull(15000L, new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, font, null), asyncFontListLoader$loadWithTimeoutOrNull$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        font = (Font) asyncFontListLoader$loadWithTimeoutOrNull$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                    }
                    obj = obj2;
                    return obj;
                }
            }
            if (i != 0) {
            }
            obj = obj2;
            return obj;
        } catch (CancellationException e) {
            if (JobKt.isActive(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                return obj;
            }
            throw e;
        } catch (Exception e2) {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + font, e2));
                return obj;
            }
            return obj;
        }
        asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, continuation);
        Object obj22 = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
        obj = null;
    }
}
