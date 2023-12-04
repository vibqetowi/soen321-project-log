package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldKeyInput.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKeyInputKt$textFieldKeyInput$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $editable;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ UndoManager $undoManager;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKeyInputKt$textFieldKeyInput$2(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, OffsetMapping offsetMapping, UndoManager undoManager, Function1<? super TextFieldValue, Unit> function1, int i) {
        super(3);
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
        this.$value = textFieldValue;
        this.$editable = z;
        this.$singleLine = z2;
        this.$offsetMapping = offsetMapping;
        this.$undoManager = undoManager;
        this.$onValueChange = function1;
        this.$imeAction = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(2057323757);
        ComposerKt.sourceInformation(composer, "C245@11258L41,246@11322L30:TextFieldKeyInput.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2057323757, i, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:244)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextPreparedSelectionState();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new DeadKeyCombiner();
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.Companion, new AnonymousClass1(new TextFieldKeyInput(this.$state, this.$manager, this.$value, this.$editable, this.$singleLine, textPreparedSelectionState, this.$offsetMapping, this.$undoManager, (DeadKeyCombiner) rememberedValue2, null, this.$onValueChange, this.$imeAction, 512, null)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return onKeyEvent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldKeyInput.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<KeyEvent, Boolean> {
        AnonymousClass1(Object obj) {
            super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
            return m1093invokeZmokQxo(keyEvent.m4277unboximpl());
        }

        /* renamed from: invoke-ZmokQxo  reason: not valid java name */
        public final Boolean m1093invokeZmokQxo(android.view.KeyEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m1090processZmokQxo(p0));
        }
    }
}
