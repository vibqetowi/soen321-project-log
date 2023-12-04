package com.ifriend.ui.components.text;

import androidx.compose.runtime.MutableState;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypewriterText.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.components.text.TypewriterTextKt$TypewriterText$1$1", f = "TypewriterText.kt", i = {0, 0, 1, 1}, l = {87, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", n = {"builder", "textIndex", "builder", "textIndex"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes4.dex */
public final class TypewriterTextKt$TypewriterText$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $displayText$delegate;
    final /* synthetic */ long $durationMillis;
    final /* synthetic */ boolean $isRepeat;
    final /* synthetic */ long $repeatDurationMillis;
    final /* synthetic */ String $text;
    int I$0;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypewriterTextKt$TypewriterText$1$1(String str, long j, boolean z, long j2, MutableState<String> mutableState, Continuation<? super TypewriterTextKt$TypewriterText$1$1> continuation) {
        super(2, continuation);
        this.$text = str;
        this.$durationMillis = j;
        this.$isRepeat = z;
        this.$repeatDurationMillis = j2;
        this.$displayText$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TypewriterTextKt$TypewriterText$1$1(this.$text, this.$durationMillis, this.$isRepeat, this.$repeatDurationMillis, this.$displayText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TypewriterTextKt$TypewriterText$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:23:0x0094). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0091 -> B:23:0x0094). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009d -> B:11:0x0040). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        StringBuilder sb;
        int i;
        TypewriterTextKt$TypewriterText$1$1 typewriterTextKt$TypewriterText$1$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.$displayText$delegate.setValue("");
            sb = new StringBuilder();
            i = 0;
            typewriterTextKt$TypewriterText$1$1 = this;
            if (i >= typewriterTextKt$TypewriterText$1$1.$text.length()) {
            }
        } else if (i2 == 1) {
            i = this.I$0;
            ResultKt.throwOnFailure(obj);
            sb = (StringBuilder) this.L$0;
            typewriterTextKt$TypewriterText$1$1 = this;
            if (!typewriterTextKt$TypewriterText$1$1.$isRepeat) {
            }
        } else if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i = this.I$0;
            ResultKt.throwOnFailure(obj);
            sb = (StringBuilder) this.L$0;
            typewriterTextKt$TypewriterText$1$1 = this;
            i = (i + 1) % typewriterTextKt$TypewriterText$1$1.$text.length();
            if (i >= typewriterTextKt$TypewriterText$1$1.$text.length()) {
                sb.append(typewriterTextKt$TypewriterText$1$1.$text.charAt(i));
                MutableState<String> mutableState = typewriterTextKt$TypewriterText$1$1.$displayText$delegate;
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                mutableState.setValue(sb2);
                typewriterTextKt$TypewriterText$1$1.L$0 = sb;
                typewriterTextKt$TypewriterText$1$1.I$0 = i;
                typewriterTextKt$TypewriterText$1$1.label = 1;
                if (DelayKt.delay(typewriterTextKt$TypewriterText$1$1.$durationMillis, typewriterTextKt$TypewriterText$1$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!typewriterTextKt$TypewriterText$1$1.$isRepeat) {
                    i++;
                    if (i >= typewriterTextKt$TypewriterText$1$1.$text.length()) {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i == typewriterTextKt$TypewriterText$1$1.$text.length() - 1) {
                        StringsKt.clear(sb);
                        typewriterTextKt$TypewriterText$1$1.L$0 = sb;
                        typewriterTextKt$TypewriterText$1$1.I$0 = i;
                        typewriterTextKt$TypewriterText$1$1.label = 2;
                        if (DelayKt.delay(typewriterTextKt$TypewriterText$1$1.$repeatDurationMillis, typewriterTextKt$TypewriterText$1$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    i = (i + 1) % typewriterTextKt$TypewriterText$1$1.$text.length();
                    if (i >= typewriterTextKt$TypewriterText$1$1.$text.length()) {
                    }
                }
            }
        }
    }
}
