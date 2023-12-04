package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RememberSaveable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberSaveableKt$rememberSaveable$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ String $finalKey;
    final /* synthetic */ SaveableStateRegistry $registry;
    final /* synthetic */ State<Saver<T, Object>> $saverState;
    final /* synthetic */ State<T> $valueState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberSaveableKt$rememberSaveable$1(SaveableStateRegistry saveableStateRegistry, String str, State<? extends Saver<T, Object>> state, State<? extends T> state2) {
        super(1);
        this.$registry = saveableStateRegistry;
        this.$finalKey = str;
        this.$saverState = state;
        this.$valueState = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        RememberSaveableKt$rememberSaveable$1$valueProvider$1 rememberSaveableKt$rememberSaveable$1$valueProvider$1 = new RememberSaveableKt$rememberSaveable$1$valueProvider$1(this.$saverState, this.$valueState, this.$registry);
        RememberSaveableKt.requireCanBeSaved(this.$registry, rememberSaveableKt$rememberSaveable$1$valueProvider$1.invoke());
        final SaveableStateRegistry.Entry registerProvider = this.$registry.registerProvider(this.$finalKey, rememberSaveableKt$rememberSaveable$1$valueProvider$1);
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SaveableStateRegistry.Entry.this.unregister();
            }
        };
    }
}
