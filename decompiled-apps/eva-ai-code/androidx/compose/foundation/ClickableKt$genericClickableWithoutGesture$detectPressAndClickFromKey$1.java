package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ Map<Key, PressInteraction.Press> $currentKeyPressInteractions;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ CoroutineScope $indicationScope;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ State<Offset> $keyClickOffset;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1(boolean z, Map<Key, PressInteraction.Press> map, State<Offset> state, CoroutineScope coroutineScope, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.$enabled = z;
        this.$currentKeyPressInteractions = map;
        this.$keyClickOffset = state;
        this.$indicationScope = coroutineScope;
        this.$onClick = function0;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m462invokeZmokQxo(keyEvent.m4277unboximpl());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m462invokeZmokQxo(android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        boolean z = true;
        if (this.$enabled && Clickable_androidKt.m469isPressZmokQxo(keyEvent)) {
            if (!this.$currentKeyPressInteractions.containsKey(Key.m3977boximpl(KeyEvent_androidKt.m4288getKeyZmokQxo(keyEvent)))) {
                PressInteraction.Press press = new PressInteraction.Press(this.$keyClickOffset.getValue().m3028unboximpl(), null);
                this.$currentKeyPressInteractions.put(Key.m3977boximpl(KeyEvent_androidKt.m4288getKeyZmokQxo(keyEvent)), press);
                BuildersKt__Builders_commonKt.launch$default(this.$indicationScope, null, null, new AnonymousClass1(this.$interactionSource, press, null), 3, null);
            }
            z = false;
        } else {
            if (this.$enabled && Clickable_androidKt.m467isClickZmokQxo(keyEvent)) {
                PressInteraction.Press remove = this.$currentKeyPressInteractions.remove(Key.m3977boximpl(KeyEvent_androidKt.m4288getKeyZmokQxo(keyEvent)));
                if (remove != null) {
                    BuildersKt__Builders_commonKt.launch$default(this.$indicationScope, null, null, new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(this.$interactionSource, remove, null), 3, null);
                }
                this.$onClick.invoke();
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", f = "Clickable.kt", i = {}, l = {376}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ PressInteraction.Press $press;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$interactionSource = mutableInteractionSource;
            this.$press = press;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$interactionSource, this.$press, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$interactionSource.emit(this.$press, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
