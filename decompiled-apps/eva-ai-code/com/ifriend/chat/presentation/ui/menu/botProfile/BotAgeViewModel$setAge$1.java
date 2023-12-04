package com.ifriend.chat.presentation.ui.menu.botProfile;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.ifriend.domain.validation.ValidateAgeUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotAgeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeViewModel$setAge$1", f = "BotAgeViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BotAgeViewModel$setAge$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CharSequence $s;
    Object L$0;
    int label;
    final /* synthetic */ BotAgeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotAgeViewModel$setAge$1(BotAgeViewModel botAgeViewModel, CharSequence charSequence, Continuation<? super BotAgeViewModel$setAge$1> continuation) {
        super(2, continuation);
        this.this$0 = botAgeViewModel;
        this.$s = charSequence;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotAgeViewModel$setAge$1(this.this$0, this.$s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotAgeViewModel$setAge$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableLiveData<Boolean> isValid;
        ValidateAgeUseCase validateAgeUseCase;
        MutableLiveData<Boolean> mutableLiveData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getAge().setValue(this.$s.toString());
            isValid = this.this$0.isValid();
            if (!Intrinsics.areEqual(this.this$0.getAge().getValue(), this.this$0.getSavedAge())) {
                validateAgeUseCase = this.this$0.validateAgeUseCase;
                this.L$0 = isValid;
                this.label = 1;
                Object invoke = validateAgeUseCase.invoke(String.valueOf(this.this$0.getAge().getValue()), true, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = isValid;
                obj = invoke;
            }
            z = false;
            mutableLiveData = isValid;
            mutableLiveData.setValue(Boxing.boxBoolean(z));
            return Unit.INSTANCE;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mutableLiveData = (MutableLiveData) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            isValid = mutableLiveData;
            z = false;
            mutableLiveData = isValid;
        }
        mutableLiveData.setValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }
}
