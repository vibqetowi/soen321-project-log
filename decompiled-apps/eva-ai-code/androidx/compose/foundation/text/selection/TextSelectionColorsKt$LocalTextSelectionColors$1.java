package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextSelectionColors.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextSelectionColorsKt$LocalTextSelectionColors$1 extends Lambda implements Function0<TextSelectionColors> {
    public static final TextSelectionColorsKt$LocalTextSelectionColors$1 INSTANCE = new TextSelectionColorsKt$LocalTextSelectionColors$1();

    TextSelectionColorsKt$LocalTextSelectionColors$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TextSelectionColors invoke() {
        TextSelectionColors textSelectionColors;
        textSelectionColors = TextSelectionColorsKt.DefaultTextSelectionColors;
        return textSelectionColors;
    }
}
