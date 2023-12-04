package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.PlatformTextInput;
import androidx.compose.ui.text.input.PlatformTextInputAdapter;
import androidx.compose.ui.text.input.PlatformTextInputPlugin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "factory", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "platformTextInput", "Landroidx/compose/ui/text/input/PlatformTextInput;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidComposeView$platformTextInputPluginRegistry$1 extends Lambda implements Function2<PlatformTextInputPlugin<?>, PlatformTextInput, PlatformTextInputAdapter> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$platformTextInputPluginRegistry$1(AndroidComposeView androidComposeView) {
        super(2);
        this.this$0 = androidComposeView;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.text.input.PlatformTextInputAdapter] */
    @Override // kotlin.jvm.functions.Function2
    public final PlatformTextInputAdapter invoke(PlatformTextInputPlugin<?> factory, PlatformTextInput platformTextInput) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(platformTextInput, "platformTextInput");
        return factory.createAdapter(platformTextInput, this.this$0);
    }
}
