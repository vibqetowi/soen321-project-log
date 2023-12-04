package androidx.compose.runtime.saveable;

import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: RememberSaveable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RememberSaveableKt$rememberSaveable$1$valueProvider$1 extends Lambda implements Function0<Object> {
    final /* synthetic */ SaveableStateRegistry $registry;
    final /* synthetic */ State<Saver<T, Object>> $saverState;
    final /* synthetic */ State<T> $valueState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberSaveableKt$rememberSaveable$1$valueProvider$1(State<? extends Saver<T, Object>> state, State<? extends T> state2, SaveableStateRegistry saveableStateRegistry) {
        super(0);
        this.$saverState = state;
        this.$valueState = state2;
        this.$registry = saveableStateRegistry;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value = this.$saverState.getValue();
        State<T> state = this.$valueState;
        final SaveableStateRegistry saveableStateRegistry = this.$registry;
        return ((Saver) value).save(new SaverScope() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1$1$1
            @Override // androidx.compose.runtime.saveable.SaverScope
            public final boolean canBeSaved(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SaveableStateRegistry.this.canBeSaved(it);
            }
        }, state.getValue());
    }
}
