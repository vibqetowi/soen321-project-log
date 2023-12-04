package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecomposeScopeImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "composition", "Landroidx/compose/runtime/Composition;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecomposeScopeImpl$end$1$2 extends Lambda implements Function1<Composition, Unit> {
    final /* synthetic */ IdentityArrayIntMap $instances;
    final /* synthetic */ int $token;
    final /* synthetic */ RecomposeScopeImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposeScopeImpl$end$1$2(RecomposeScopeImpl recomposeScopeImpl, int i, IdentityArrayIntMap identityArrayIntMap) {
        super(1);
        this.this$0 = recomposeScopeImpl;
        this.$token = i;
        this.$instances = identityArrayIntMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Composition composition) {
        invoke2(composition);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Composition composition) {
        int i;
        IdentityArrayIntMap identityArrayIntMap;
        IdentityArrayMap identityArrayMap;
        Intrinsics.checkNotNullParameter(composition, "composition");
        i = this.this$0.currentToken;
        if (i == this.$token) {
            IdentityArrayIntMap identityArrayIntMap2 = this.$instances;
            identityArrayIntMap = this.this$0.trackedInstances;
            if (Intrinsics.areEqual(identityArrayIntMap2, identityArrayIntMap) && (composition instanceof CompositionImpl)) {
                IdentityArrayIntMap identityArrayIntMap3 = this.$instances;
                int i2 = this.$token;
                RecomposeScopeImpl recomposeScopeImpl = this.this$0;
                Object[] keys = identityArrayIntMap3.getKeys();
                int[] values = identityArrayIntMap3.getValues();
                int size = identityArrayIntMap3.getSize();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj = keys[i4];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i5 = values[i4];
                    boolean z = i5 != i2;
                    if (z) {
                        CompositionImpl compositionImpl = (CompositionImpl) composition;
                        compositionImpl.removeObservation$runtime_release(obj, recomposeScopeImpl);
                        DerivedState<?> derivedState = obj instanceof DerivedState ? (DerivedState) obj : null;
                        if (derivedState != null) {
                            compositionImpl.removeDerivedStateObservation$runtime_release(derivedState);
                            identityArrayMap = recomposeScopeImpl.trackedDependencies;
                            if (identityArrayMap != null) {
                                identityArrayMap.remove(derivedState);
                                if (identityArrayMap.getSize() == 0) {
                                    recomposeScopeImpl.trackedDependencies = null;
                                }
                            }
                        }
                    }
                    if (!z) {
                        if (i3 != i4) {
                            keys[i3] = obj;
                            values[i3] = i5;
                        }
                        i3++;
                    }
                }
                for (int i6 = i3; i6 < size; i6++) {
                    keys[i6] = null;
                }
                identityArrayIntMap3.size = i3;
                if (this.$instances.getSize() == 0) {
                    this.this$0.trackedInstances = null;
                }
            }
        }
    }
}
