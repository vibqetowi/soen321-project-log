package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ComposerImpl$insertMovableContentGuarded$1$1$2$2 extends Lambda implements Function3<Applier<?>, SlotWriter, RememberManager, Unit> {
    final /* synthetic */ Ref.IntRef $effectiveNodeIndex;
    final /* synthetic */ List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> $offsetChanges;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$2$2(Ref.IntRef intRef, List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list) {
        super(3);
        this.$effectiveNodeIndex = intRef;
        this.$offsetChanges = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        invoke2(applier, slotWriter, rememberManager);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
        if (this.$effectiveNodeIndex.element > 0) {
            applier = new OffsetApplier(applier, this.$effectiveNodeIndex.element);
        }
        List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list = this.$offsetChanges;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).invoke(applier, slots, rememberManager);
        }
    }
}
