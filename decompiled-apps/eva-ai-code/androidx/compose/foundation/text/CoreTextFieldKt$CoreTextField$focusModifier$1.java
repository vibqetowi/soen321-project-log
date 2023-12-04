package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$focusModifier$1 extends Lambda implements Function1<FocusState, Unit> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1(TextFieldState textFieldState, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester) {
        super(1);
        this.$state = textFieldState;
        this.$textInputService = textInputService;
        this.$value = textFieldValue;
        this.$imeOptions = imeOptions;
        this.$offsetMapping = offsetMapping;
        this.$manager = textFieldSelectionManager;
        this.$coroutineScope = coroutineScope;
        this.$bringIntoViewRequester = bringIntoViewRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
        invoke2(focusState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FocusState it) {
        TextLayoutResultProxy layoutResult;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.$state.getHasFocus() == it.isFocused()) {
            return;
        }
        this.$state.setHasFocus(it.isFocused());
        TextInputService textInputService = this.$textInputService;
        if (textInputService != null) {
            CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService, this.$state, this.$value, this.$imeOptions, this.$offsetMapping);
            if (it.isFocused() && (layoutResult = this.$state.getLayoutResult()) != null) {
                BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, layoutResult, this.$offsetMapping, null), 3, null);
            }
        }
        if (it.isFocused()) {
            return;
        }
        TextFieldSelectionManager.m1217deselect_kEHs6E$foundation_release$default(this.$manager, null, 1, null);
    }
}
