package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.TypefaceResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/TypefaceResult;", "typeRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FontFamilyResolverImpl$preload$2 extends Lambda implements Function1<TypefaceRequest, TypefaceResult> {
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$2(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<TypefaceResult.Immutable, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(TypefaceResult.Immutable it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TypefaceResult.Immutable immutable) {
            invoke2(immutable);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final TypefaceResult invoke(TypefaceRequest typeRequest) {
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
        Function1<? super TypefaceRequest, ? extends Object> function1;
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
        Function1<? super TypefaceRequest, ? extends Object> function12;
        Intrinsics.checkNotNullParameter(typeRequest, "typeRequest");
        fontListFontFamilyTypefaceAdapter = this.this$0.fontListFontFamilyTypefaceAdapter;
        function1 = this.this$0.createDefaultTypeface;
        TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typeRequest, this.this$0.getPlatformFontLoader$ui_text_release(), AnonymousClass1.INSTANCE, function1);
        if (resolve == null) {
            platformFontFamilyTypefaceAdapter = this.this$0.platformFamilyTypefaceAdapter;
            function12 = this.this$0.createDefaultTypeface;
            resolve = platformFontFamilyTypefaceAdapter.resolve(typeRequest, this.this$0.getPlatformFontLoader$ui_text_release(), AnonymousClass2.INSTANCE, function12);
            if (resolve == null) {
                throw new IllegalStateException("Could not load font");
            }
        }
        return resolve;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<TypefaceResult.Immutable, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(TypefaceResult.Immutable it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TypefaceResult.Immutable immutable) {
            invoke2(immutable);
            return Unit.INSTANCE;
        }
    }
}
