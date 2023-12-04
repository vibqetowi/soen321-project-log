package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldScroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldScrollKt$textFieldScrollable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2(TextFieldScrollerPosition textFieldScrollerPosition, boolean z, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(805428266);
        ComposerKt.sourceInformation(composer, "C68@2901L7,70@3070L388,70@3046L412,83@3610L352:TextFieldScroll.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(805428266, i, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:66)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean z2 = this.$scrollerPosition.getOrientation() == Orientation.Vertical || !(consume == LayoutDirection.Rtl);
        TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(textFieldScrollerPosition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (Function1) new TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1(textFieldScrollerPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final ScrollableState rememberScrollableState = ScrollableStateKt.rememberScrollableState((Function1) rememberedValue, composer, 0);
        final TextFieldScrollerPosition textFieldScrollerPosition2 = this.$scrollerPosition;
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(rememberScrollableState) | composer.changed(textFieldScrollerPosition2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ScrollableState(textFieldScrollerPosition2) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                private final State canScrollBackward$delegate;
                private final State canScrollForward$delegate;

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public float dispatchRawDelta(float f) {
                    return ScrollableState.this.dispatchRawDelta(f);
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public boolean isScrollInProgress() {
                    return ScrollableState.this.isScrollInProgress();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
                    return ScrollableState.this.scroll(mutatePriority, function2, continuation);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2(textFieldScrollerPosition2));
                    this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2(textFieldScrollerPosition2));
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public boolean getCanScrollForward() {
                    return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public boolean getCanScrollBackward() {
                    return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 = (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) rememberedValue2;
        Modifier.Companion companion = Modifier.Companion;
        Orientation orientation = this.$scrollerPosition.getOrientation();
        if (this.$enabled) {
            if (!(this.$scrollerPosition.getMaximum() == 0.0f)) {
                z = true;
                Modifier scrollable$default = ScrollableKt.scrollable$default(companion, textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1, orientation, z, z2, null, this.$interactionSource, 16, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return scrollable$default;
            }
        }
        z = false;
        Modifier scrollable$default2 = ScrollableKt.scrollable$default(companion, textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1, orientation, z, z2, null, this.$interactionSource, 16, null);
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceableGroup();
        return scrollable$default2;
    }
}
