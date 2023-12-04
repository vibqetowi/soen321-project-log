package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: SelectionContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionContainerKt$SelectionContainer$3$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $children;
    final /* synthetic */ SelectionManager $manager;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionContainerKt$SelectionContainer$3$1(Modifier modifier, SelectionManager selectionManager, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$modifier = modifier;
        this.$manager = selectionManager;
        this.$children = function2;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<Composer, Integer, Unit> $children;
        final /* synthetic */ SelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2, int i, SelectionManager selectionManager) {
            super(2);
            this.$children = function2;
            this.$$dirty = i;
            this.$manager = selectionManager;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Selection selection;
            Offset m1194getEndHandlePosition_m7T9E;
            ResolvedTextDirection direction;
            ComposerKt.sourceInformation(composer, "C99@3695L10,*103@3926L129,119@4623L564:SelectionContainer.kt#eksfi3");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1375295262, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:98)");
                }
                this.$children.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
                if (TouchMode_androidKt.isInTouchMode() && this.$manager.getHasFocus() && (selection = this.$manager.getSelection()) != null) {
                    SelectionManager selectionManager = this.$manager;
                    List listOf = CollectionsKt.listOf((Object[]) new Boolean[]{true, false});
                    int size = listOf.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        boolean booleanValue = ((Boolean) listOf.get(i2)).booleanValue();
                        Boolean valueOf = Boolean.valueOf(booleanValue);
                        composer.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean changed = composer.changed(valueOf);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = selectionManager.handleDragObserver(booleanValue);
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceableGroup();
                        TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                        if (booleanValue) {
                            m1194getEndHandlePosition_m7T9E = selectionManager.m1195getStartHandlePosition_m7T9E();
                        } else {
                            m1194getEndHandlePosition_m7T9E = selectionManager.m1194getEndHandlePosition_m7T9E();
                        }
                        if (booleanValue) {
                            direction = selection.getStart().getDirection();
                        } else {
                            direction = selection.getEnd().getDirection();
                        }
                        if (m1194getEndHandlePosition_m7T9E != null) {
                            AndroidSelectionHandles_androidKt.m1146SelectionHandle8fL75g(m1194getEndHandlePosition_m7T9E.m3028unboximpl(), booleanValue, direction, selection.getHandlesCrossed(), SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(textDragObserver, null)), null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        }
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C98@3620L1677:SelectionContainer.kt#eksfi3");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(935424596, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:95)");
            }
            SimpleLayoutKt.SimpleLayout(this.$modifier.then(this.$manager.getModifier()), ComposableLambdaKt.composableLambda(composer, 1375295262, true, new AnonymousClass1(this.$children, this.$$dirty, this.$manager)), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
