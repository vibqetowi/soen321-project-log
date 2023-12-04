package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposerImpl$insertMovableContentGuarded$1$1$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> $offsetChanges;
    final /* synthetic */ SlotReader $reader;
    final /* synthetic */ MovableContentStateReference $to;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$2$1(ComposerImpl composerImpl, List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        super(0);
        this.this$0 = composerImpl;
        this.$offsetChanges = list;
        this.$reader = slotReader;
        this.$to = movableContentStateReference;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposerImpl composerImpl = this.this$0;
        List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list = this.$offsetChanges;
        SlotReader slotReader = this.$reader;
        MovableContentStateReference movableContentStateReference = this.$to;
        List list2 = composerImpl.changes;
        try {
            composerImpl.changes = list;
            SlotReader slotReader2 = composerImpl.reader;
            int[] iArr = composerImpl.nodeCountOverrides;
            composerImpl.nodeCountOverrides = null;
            composerImpl.reader = slotReader;
            composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter$runtime_release(), true);
            Unit unit = Unit.INSTANCE;
            composerImpl.reader = slotReader2;
            composerImpl.nodeCountOverrides = iArr;
            Unit unit2 = Unit.INSTANCE;
        } finally {
            composerImpl.changes = list2;
        }
    }
}
