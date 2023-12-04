package androidx.compose.material;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Text.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt$Text$8 extends Lambda implements Function1<TextLayoutResult, Unit> {
    public static final TextKt$Text$8 INSTANCE = new TextKt$Text$8();

    TextKt$Text$8() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
        invoke2(textLayoutResult);
        return Unit.INSTANCE;
    }
}
