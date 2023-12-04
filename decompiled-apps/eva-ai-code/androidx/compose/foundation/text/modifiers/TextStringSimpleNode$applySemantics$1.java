package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextStringSimpleNode.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "textLayoutResult", "", "Landroidx/compose/ui/text/TextLayoutResult;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextStringSimpleNode$applySemantics$1 extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {
    final /* synthetic */ TextStringSimpleNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$applySemantics$1(TextStringSimpleNode textStringSimpleNode) {
        super(1);
        this.this$0 = textStringSimpleNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<TextLayoutResult> textLayoutResult) {
        ParagraphLayoutCache layoutCache;
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        layoutCache = this.this$0.getLayoutCache();
        TextLayoutResult slowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull();
        if (slowCreateTextLayoutResultOrNull != null) {
            textLayoutResult.add(slowCreateTextLayoutResultOrNull);
        }
        return false;
    }
}
