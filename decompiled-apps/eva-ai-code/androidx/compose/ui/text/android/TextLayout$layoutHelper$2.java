package androidx.compose.ui.text.android;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextLayout.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/android/LayoutHelper;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TextLayout$layoutHelper$2 extends Lambda implements Function0<LayoutHelper> {
    final /* synthetic */ TextLayout this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLayout$layoutHelper$2(TextLayout textLayout) {
        super(0);
        this.this$0 = textLayout;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LayoutHelper invoke() {
        return new LayoutHelper(this.this$0.getLayout());
    }
}
