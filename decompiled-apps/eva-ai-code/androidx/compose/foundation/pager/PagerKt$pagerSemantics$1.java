package androidx.compose.foundation.pager;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Pager.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerKt$pagerSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ PagerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$pagerSemantics$1(boolean z, PagerState pagerState, CoroutineScope coroutineScope) {
        super(1);
        this.$isVertical = z;
        this.$state = pagerState;
        this.$scope = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Pager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ PagerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PagerState pagerState, CoroutineScope coroutineScope) {
            super(0);
            this.$state = pagerState;
            this.$scope = coroutineScope;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean pagerSemantics$performBackwardPaging;
            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(this.$state, this.$scope);
            return Boolean.valueOf(pagerSemantics$performBackwardPaging);
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (this.$isVertical) {
            SemanticsPropertiesKt.pageUp$default(semantics, null, new AnonymousClass1(this.$state, this.$scope), 1, null);
            SemanticsPropertiesKt.pageDown$default(semantics, null, new AnonymousClass2(this.$state, this.$scope), 1, null);
            return;
        }
        SemanticsPropertiesKt.pageLeft$default(semantics, null, new AnonymousClass3(this.$state, this.$scope), 1, null);
        SemanticsPropertiesKt.pageRight$default(semantics, null, new AnonymousClass4(this.$state, this.$scope), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Pager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ PagerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PagerState pagerState, CoroutineScope coroutineScope) {
            super(0);
            this.$state = pagerState;
            this.$scope = coroutineScope;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean pagerSemantics$performForwardPaging;
            pagerSemantics$performForwardPaging = PagerKt.pagerSemantics$performForwardPaging(this.$state, this.$scope);
            return Boolean.valueOf(pagerSemantics$performForwardPaging);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Pager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ PagerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PagerState pagerState, CoroutineScope coroutineScope) {
            super(0);
            this.$state = pagerState;
            this.$scope = coroutineScope;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean pagerSemantics$performBackwardPaging;
            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(this.$state, this.$scope);
            return Boolean.valueOf(pagerSemantics$performBackwardPaging);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Pager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ PagerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PagerState pagerState, CoroutineScope coroutineScope) {
            super(0);
            this.$state = pagerState;
            this.$scope = coroutineScope;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean pagerSemantics$performForwardPaging;
            pagerSemantics$performForwardPaging = PagerKt.pagerSemantics$performForwardPaging(this.$state, this.$scope);
            return Boolean.valueOf(pagerSemantics$performForwardPaging);
        }
    }
}
