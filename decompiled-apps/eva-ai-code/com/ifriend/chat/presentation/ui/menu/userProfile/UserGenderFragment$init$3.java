package com.ifriend.chat.presentation.ui.menu.userProfile;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.domain.models.profile.Gender;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: UserGenderFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderFragment$init$3", f = "UserGenderFragment.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UserGenderFragment$init$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UserGenderFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGenderFragment$init$3(UserGenderFragment userGenderFragment, Continuation<? super UserGenderFragment$init$3> continuation) {
        super(2, continuation);
        this.this$0 = userGenderFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserGenderFragment$init$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserGenderFragment$init$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserGenderViewModel viewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            viewModel = this.this$0.getViewModel();
            MutableStateFlow<Gender> currentGender = viewModel.getCurrentGender();
            final UserGenderFragment userGenderFragment = this.this$0;
            this.label = 1;
            if (currentGender.collect(new FlowCollector<Gender>() { // from class: com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderFragment$init$3.1

                /* compiled from: UserGenderFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.chat.presentation.ui.menu.userProfile.UserGenderFragment$init$3$1$WhenMappings */
                /* loaded from: classes6.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Gender.values().length];
                        try {
                            iArr[Gender.MALE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Gender.FEMALE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Gender.NON_BINARY.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Gender gender, Continuation continuation) {
                    return emit2(gender, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(Gender gender, Continuation<? super Unit> continuation) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[gender.ordinal()];
                    if (i2 == 1) {
                        UserGenderFragment.this.showMaleCheck();
                    } else if (i2 == 2) {
                        UserGenderFragment.this.showFemaleCheck();
                    } else if (i2 == 3) {
                        UserGenderFragment.this.showNonBinaryCheck();
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
