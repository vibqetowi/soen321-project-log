package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.ui.calendar.CalendarPicker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: UserAgeFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeFragment$init$1", f = "UserAgeFragment.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UserAgeFragment$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UserAgeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgeFragment$init$1(UserAgeFragment userAgeFragment, Continuation<? super UserAgeFragment$init$1> continuation) {
        super(2, continuation);
        this.this$0 = userAgeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserAgeFragment$init$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserAgeFragment$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserAgeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, d2 = {"", "min", "max", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeFragment$init$1$1", f = "UserAgeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.chat.presentation.ui.menu.userProfile.UserAgeFragment$init$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        /* synthetic */ int I$1;
        int label;
        final /* synthetic */ UserAgeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UserAgeFragment userAgeFragment, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = userAgeFragment;
        }

        public final Object invoke(int i, int i2, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.I$0 = i;
            anonymousClass1.I$1 = i2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Integer num2, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), num2.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UserAgeViewModel viewModel;
            UserAgeViewModel viewModel2;
            UserAgeViewModel viewModel3;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CalendarPicker.setLimits$default(this.this$0.getDatePicker(), this.I$0, this.I$1, false, 4, null);
            CalendarPicker datePicker = this.this$0.getDatePicker();
            viewModel = this.this$0.getViewModel();
            int i = viewModel.getCalendar().get(1);
            viewModel2 = this.this$0.getViewModel();
            viewModel3 = this.this$0.getViewModel();
            datePicker.setSelectedDate(i, viewModel2.getCalendar().get(2) + 1, viewModel3.getCalendar().get(5));
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserAgeViewModel viewModel;
        UserAgeViewModel viewModel2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            viewModel = this.this$0.getViewModel();
            viewModel2 = this.this$0.getViewModel();
            this.label = 1;
            if (FlowKt.collect(FlowKt.flowCombine(viewModel.getMinAge(), viewModel2.getMaxAge(), new AnonymousClass1(this.this$0, null)), this) == coroutine_suspended) {
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
