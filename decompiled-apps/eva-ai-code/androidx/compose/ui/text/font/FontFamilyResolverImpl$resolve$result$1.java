package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/TypefaceResult;", "onAsyncCompletion", "Lkotlin/Function1;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontFamilyResolverImpl$resolve$result$1 extends Lambda implements Function1<Function1<? super TypefaceResult, ? extends Unit>, TypefaceResult> {
    final /* synthetic */ TypefaceRequest $typefaceRequest;
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$resolve$result$1(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
        this.$typefaceRequest = typefaceRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TypefaceResult invoke(Function1<? super TypefaceResult, ? extends Unit> function1) {
        return invoke2((Function1<? super TypefaceResult, Unit>) function1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final TypefaceResult invoke2(Function1<? super TypefaceResult, Unit> onAsyncCompletion) {
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
        Function1<? super TypefaceRequest, ? extends Object> function1;
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
        Function1<? super TypefaceRequest, ? extends Object> function12;
        Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
        fontListFontFamilyTypefaceAdapter = this.this$0.fontListFontFamilyTypefaceAdapter;
        TypefaceRequest typefaceRequest = this.$typefaceRequest;
        PlatformFontLoader platformFontLoader$ui_text_release = this.this$0.getPlatformFontLoader$ui_text_release();
        function1 = this.this$0.createDefaultTypeface;
        TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, platformFontLoader$ui_text_release, onAsyncCompletion, function1);
        if (resolve == null) {
            platformFontFamilyTypefaceAdapter = this.this$0.platformFamilyTypefaceAdapter;
            TypefaceRequest typefaceRequest2 = this.$typefaceRequest;
            PlatformFontLoader platformFontLoader$ui_text_release2 = this.this$0.getPlatformFontLoader$ui_text_release();
            function12 = this.this$0.createDefaultTypeface;
            resolve = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest2, platformFontLoader$ui_text_release2, onAsyncCompletion, function12);
            if (resolve == null) {
                throw new IllegalStateException("Could not load font");
            }
        }
        return resolve;
    }
}
