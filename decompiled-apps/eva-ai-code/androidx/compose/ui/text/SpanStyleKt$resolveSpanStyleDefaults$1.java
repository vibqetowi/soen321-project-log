package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextForegroundStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpanStyle.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpanStyleKt$resolveSpanStyleDefaults$1 extends Lambda implements Function0<TextForegroundStyle> {
    public static final SpanStyleKt$resolveSpanStyleDefaults$1 INSTANCE = new SpanStyleKt$resolveSpanStyleDefaults$1();

    SpanStyleKt$resolveSpanStyleDefaults$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TextForegroundStyle invoke() {
        long j;
        TextForegroundStyle.Companion companion = TextForegroundStyle.Companion;
        j = SpanStyleKt.DefaultColor;
        return companion.m5488from8_81llA(j);
    }
}
