package androidx.compose.material;

import androidx.compose.runtime.RecomposeScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SnackbarData $key;
    final /* synthetic */ FadeInFadeOutState<SnackbarData> $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(SnackbarData snackbarData, FadeInFadeOutState<SnackbarData> fadeInFadeOutState) {
        super(0);
        this.$key = snackbarData;
        this.$state = fadeInFadeOutState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (Intrinsics.areEqual(this.$key, this.$state.getCurrent())) {
            return;
        }
        CollectionsKt.removeAll((List) this.$state.getItems(), (Function1) new AnonymousClass1(this.$key));
        RecomposeScope scope = this.$state.getScope();
        if (scope != null) {
            scope.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/FadeInFadeOutAnimationItem;", "Landroidx/compose/material/SnackbarData;", "invoke", "(Landroidx/compose/material/FadeInFadeOutAnimationItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean> {
        final /* synthetic */ SnackbarData $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SnackbarData snackbarData) {
            super(1);
            this.$key = snackbarData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FadeInFadeOutAnimationItem<SnackbarData> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.getKey(), this.$key));
        }
    }
}
