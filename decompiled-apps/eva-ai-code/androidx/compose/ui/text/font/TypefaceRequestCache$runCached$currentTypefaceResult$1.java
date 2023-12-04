package androidx.compose.ui.text.font;

import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "finalResult", "Landroidx/compose/ui/text/font/TypefaceResult;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends Lambda implements Function1<TypefaceResult, Unit> {
    final /* synthetic */ TypefaceRequest $typefaceRequest;
    final /* synthetic */ TypefaceRequestCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, TypefaceRequest typefaceRequest) {
        super(1);
        this.this$0 = typefaceRequestCache;
        this.$typefaceRequest = typefaceRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TypefaceResult typefaceResult) {
        invoke2(typefaceResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TypefaceResult finalResult) {
        LruCache lruCache;
        LruCache lruCache2;
        Intrinsics.checkNotNullParameter(finalResult, "finalResult");
        SynchronizedObject lock$ui_text_release = this.this$0.getLock$ui_text_release();
        TypefaceRequestCache typefaceRequestCache = this.this$0;
        TypefaceRequest typefaceRequest = this.$typefaceRequest;
        synchronized (lock$ui_text_release) {
            if (finalResult.getCacheable()) {
                lruCache2 = typefaceRequestCache.resultCache;
                lruCache2.put(typefaceRequest, finalResult);
            } else {
                lruCache = typefaceRequestCache.resultCache;
                lruCache.remove(typefaceRequest);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
