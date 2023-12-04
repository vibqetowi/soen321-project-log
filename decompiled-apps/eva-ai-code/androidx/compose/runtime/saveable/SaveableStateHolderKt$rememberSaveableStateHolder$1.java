package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: SaveableStateHolder.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaveableStateHolderKt$rememberSaveableStateHolder$1 extends Lambda implements Function0<SaveableStateHolderImpl> {
    public static final SaveableStateHolderKt$rememberSaveableStateHolder$1 INSTANCE = new SaveableStateHolderKt$rememberSaveableStateHolder$1();

    SaveableStateHolderKt$rememberSaveableStateHolder$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SaveableStateHolderImpl invoke() {
        return new SaveableStateHolderImpl(null, 1, null);
    }
}
