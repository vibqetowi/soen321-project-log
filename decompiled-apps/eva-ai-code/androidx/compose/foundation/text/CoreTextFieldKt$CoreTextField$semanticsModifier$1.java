package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$semanticsModifier$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ boolean $isPassword;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TransformedText $transformedText;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$semanticsModifier$1(ImeOptions imeOptions, TransformedText transformedText, TextFieldValue textFieldValue, boolean z, boolean z2, boolean z3, TextFieldState textFieldState, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, FocusRequester focusRequester) {
        super(1);
        this.$imeOptions = imeOptions;
        this.$transformedText = transformedText;
        this.$value = textFieldValue;
        this.$enabled = z;
        this.$isPassword = z2;
        this.$readOnly = z3;
        this.$state = textFieldState;
        this.$offsetMapping = offsetMapping;
        this.$manager = textFieldSelectionManager;
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
        SemanticsPropertiesKt.m4936setImeAction4L7nppU(semantics, this.$imeOptions.m5276getImeActioneUduSuo());
        SemanticsPropertiesKt.setEditableText(semantics, this.$transformedText.getText());
        SemanticsPropertiesKt.m4939setTextSelectionRangeFDrldGo(semantics, this.$value.m5325getSelectiond9O1mEE());
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        if (this.$isPassword) {
            SemanticsPropertiesKt.password(semantics);
        }
        SemanticsPropertiesKt.getTextLayoutResult$default(semantics, null, new AnonymousClass1(this.$state), 1, null);
        SemanticsPropertiesKt.setText$default(semantics, null, new AnonymousClass2(this.$state, semantics), 1, null);
        SemanticsPropertiesKt.insertTextAtCursor$default(semantics, null, new AnonymousClass3(this.$state, semantics, this.$value), 1, null);
        SemanticsPropertiesKt.setSelection$default(semantics, null, new AnonymousClass4(this.$offsetMapping, this.$enabled, this.$value, this.$manager, this.$state), 1, null);
        SemanticsPropertiesKt.performImeAction$default(semantics, null, new AnonymousClass5(this.$state, this.$imeOptions), 1, null);
        SemanticsPropertiesKt.onClick$default(semantics, null, new AnonymousClass6(this.$state, this.$focusRequester, this.$readOnly), 1, null);
        SemanticsPropertiesKt.onLongClick$default(semantics, null, new AnonymousClass7(this.$manager), 1, null);
        if (!TextRange.m5076getCollapsedimpl(this.$value.m5325getSelectiond9O1mEE()) && !this.$isPassword) {
            SemanticsPropertiesKt.copyText$default(semantics, null, new AnonymousClass8(this.$manager), 1, null);
            if (this.$enabled && !this.$readOnly) {
                SemanticsPropertiesKt.cutText$default(semantics, null, new AnonymousClass9(this.$manager), 1, null);
            }
        }
        if (!this.$enabled || this.$readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semantics, null, new AnonymousClass10(this.$manager), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "Landroidx/compose/ui/text/TextLayoutResult;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {
        final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldState textFieldState) {
            super(1);
            this.$state = textFieldState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<TextLayoutResult> it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.$state.getLayoutResult() != null) {
                TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
                Intrinsics.checkNotNull(layoutResult);
                it.add(layoutResult.getValue());
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "invoke", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<AnnotatedString, Boolean> {
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ SemanticsPropertyReceiver $this_semantics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TextFieldState textFieldState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
            super(1);
            this.$state = textFieldState;
            this.$this_semantics = semanticsPropertyReceiver;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AnnotatedString text) {
            Unit unit;
            Intrinsics.checkNotNullParameter(text, "text");
            TextInputSession inputSession = this.$state.getInputSession();
            if (inputSession != null) {
                TextFieldState textFieldState = this.$state;
                TextFieldDelegate.Companion.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(text, 1)}), textFieldState.getProcessor(), textFieldState.getOnValueChange(), inputSession);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.$state.getOnValueChange().invoke(new TextFieldValue(text.getText(), TextRangeKt.TextRange(text.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "invoke", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<AnnotatedString, Boolean> {
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ SemanticsPropertyReceiver $this_semantics;
        final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(TextFieldState textFieldState, SemanticsPropertyReceiver semanticsPropertyReceiver, TextFieldValue textFieldValue) {
            super(1);
            this.$state = textFieldState;
            this.$this_semantics = semanticsPropertyReceiver;
            this.$value = textFieldValue;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AnnotatedString text) {
            Unit unit;
            Intrinsics.checkNotNullParameter(text, "text");
            TextInputSession inputSession = this.$state.getInputSession();
            if (inputSession != null) {
                TextFieldState textFieldState = this.$state;
                TextFieldDelegate.Companion.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(text, 1)}), textFieldState.getProcessor(), textFieldState.getOnValueChange(), inputSession);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                TextFieldValue textFieldValue = this.$value;
                this.$state.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue.getText(), TextRange.m5082getStartimpl(textFieldValue.m5325getSelectiond9O1mEE()), TextRange.m5077getEndimpl(textFieldValue.m5325getSelectiond9O1mEE()), (CharSequence) text).toString(), TextRangeKt.TextRange(TextRange.m5082getStartimpl(textFieldValue.m5325getSelectiond9O1mEE()) + text.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "selectionStart", "", "selectionEnd", "relativeToOriginalText", "invoke", "(IIZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function3<Integer, Integer, Boolean, Boolean> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ TextFieldSelectionManager $manager;
        final /* synthetic */ OffsetMapping $offsetMapping;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(OffsetMapping offsetMapping, boolean z, TextFieldValue textFieldValue, TextFieldSelectionManager textFieldSelectionManager, TextFieldState textFieldState) {
            super(3);
            this.$offsetMapping = offsetMapping;
            this.$enabled = z;
            this.$value = textFieldValue;
            this.$manager = textFieldSelectionManager;
            this.$state = textFieldState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
        }

        public final Boolean invoke(int i, int i2, boolean z) {
            if (!z) {
                i = this.$offsetMapping.transformedToOriginal(i);
            }
            if (!z) {
                i2 = this.$offsetMapping.transformedToOriginal(i2);
            }
            boolean z2 = false;
            if (this.$enabled && (i != TextRange.m5082getStartimpl(this.$value.m5325getSelectiond9O1mEE()) || i2 != TextRange.m5077getEndimpl(this.$value.m5325getSelectiond9O1mEE()))) {
                if (RangesKt.coerceAtMost(i, i2) >= 0 && RangesKt.coerceAtLeast(i, i2) <= this.$value.getAnnotatedString().length()) {
                    if (z || i == i2) {
                        this.$manager.exitSelectionMode$foundation_release();
                    } else {
                        this.$manager.enterSelectionMode$foundation_release();
                    }
                    this.$state.getOnValueChange().invoke(new TextFieldValue(this.$value.getAnnotatedString(), TextRangeKt.TextRange(i, i2), (TextRange) null, 4, (DefaultConstructorMarker) null));
                    z2 = true;
                } else {
                    this.$manager.exitSelectionMode$foundation_release();
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ImeOptions $imeOptions;
        final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(TextFieldState textFieldState, ImeOptions imeOptions) {
            super(0);
            this.$state = textFieldState;
            this.$imeOptions = imeOptions;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$state.getOnImeActionPerformed().invoke(ImeAction.m5250boximpl(this.$imeOptions.m5276getImeActioneUduSuo()));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
            super(0);
            this.$state = textFieldState;
            this.$focusRequester = focusRequester;
            this.$readOnly = z;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            CoreTextFieldKt.tapToFocus(this.$state, this.$focusRequester, !this.$readOnly);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$manager.enterSelectionMode$foundation_release();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$8  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            TextFieldSelectionManager.copy$foundation_release$default(this.$manager, false, 1, null);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$9  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$manager.cut$foundation_release();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$10  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$manager.paste$foundation_release();
            return true;
        }
    }
}
