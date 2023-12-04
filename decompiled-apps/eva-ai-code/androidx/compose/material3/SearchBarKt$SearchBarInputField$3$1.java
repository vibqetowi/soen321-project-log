package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SearchBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SearchBarKt$SearchBarInputField$3$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ String $searchSemantics;
    final /* synthetic */ String $suggestionsAvailableSemantics;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBarInputField$3$1(String str, boolean z, String str2, FocusRequester focusRequester) {
        super(1);
        this.$searchSemantics = str;
        this.$active = z;
        this.$suggestionsAvailableSemantics = str2;
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, this.$searchSemantics);
        if (this.$active) {
            SemanticsPropertiesKt.setStateDescription(semantics, this.$suggestionsAvailableSemantics);
        }
        SemanticsPropertiesKt.onClick$default(semantics, null, new AnonymousClass1(this.$focusRequester), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchBar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SearchBarKt$SearchBarInputField$3$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ FocusRequester $focusRequester;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FocusRequester focusRequester) {
            super(0);
            this.$focusRequester = focusRequester;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$focusRequester.requestFocus();
            return true;
        }
    }
}
