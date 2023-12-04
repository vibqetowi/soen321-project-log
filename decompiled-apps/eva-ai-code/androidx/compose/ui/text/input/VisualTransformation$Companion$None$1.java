package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: VisualTransformation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
final class VisualTransformation$Companion$None$1 implements VisualTransformation {
    public static final VisualTransformation$Companion$None$1 INSTANCE = new VisualTransformation$Companion$None$1();

    VisualTransformation$Companion$None$1() {
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TransformedText(text, OffsetMapping.Companion.getIdentity());
    }
}
