package androidx.compose.ui.text.input;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;
/* compiled from: PlatformTextInputAdapter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PlatformTextInputPluginRegistryImpl$rememberAdapter$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ PlatformTextInputPluginRegistryImpl.AdapterHandle<T> $adapterHandle;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformTextInputPluginRegistryImpl$rememberAdapter$1(PlatformTextInputPluginRegistryImpl.AdapterHandle<T> adapterHandle, CoroutineScope coroutineScope, PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl) {
        super(1);
        this.$adapterHandle = adapterHandle;
        this.$scope = coroutineScope;
        this.this$0 = platformTextInputPluginRegistryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final PlatformTextInputPluginRegistryImpl.AdapterHandle<T> adapterHandle = this.$adapterHandle;
        final CoroutineScope coroutineScope = this.$scope;
        final PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl = this.this$0;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                if (PlatformTextInputPluginRegistryImpl.AdapterHandle.this.dispose()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, NonCancellable.INSTANCE, null, new PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1(platformTextInputPluginRegistryImpl, null), 2, null);
                }
            }
        };
    }
}
