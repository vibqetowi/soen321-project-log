package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExposedDropdownMenu.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt$expandable$2$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ String $collapsedDescription;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ String $expandedDescription;
    final /* synthetic */ String $menuDescription;
    final /* synthetic */ Function0<Unit> $onExpandedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$expandable$2$1(boolean z, String str, String str2, String str3, Function0<Unit> function0) {
        super(1);
        this.$expanded = z;
        this.$expandedDescription = str;
        this.$collapsedDescription = str2;
        this.$menuDescription = str3;
        this.$onExpandedChange = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setStateDescription(semantics, this.$expanded ? this.$expandedDescription : this.$collapsedDescription);
        SemanticsPropertiesKt.setContentDescription(semantics, this.$menuDescription);
        SemanticsPropertiesKt.onClick$default(semantics, null, new AnonymousClass1(this.$onExpandedChange), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExposedDropdownMenu.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$2$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ Function0<Unit> $onExpandedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$onExpandedChange = function0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$onExpandedChange.invoke();
            return true;
        }
    }
}
