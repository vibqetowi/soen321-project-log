package com.ifriend.chat.presentation.ui.menu.userProfile;

import androidx.lifecycle.MutableLiveData;
import com.ifriend.chat.presentation.R;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.user.Subscription;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel$init$1", f = "UserProfileViewModel.kt", i = {}, l = {LockFreeTaskQueueCore.FROZEN_SHIFT, LockFreeTaskQueueCore.FROZEN_SHIFT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class UserProfileViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UserProfileViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileViewModel$init$1(UserProfileViewModel userProfileViewModel, Continuation<? super UserProfileViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = userProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileViewModel$init$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserProfileViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/user/User;", "user", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel$init$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 implements FlowCollector<User> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* compiled from: UserProfileViewModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.menu.userProfile.UserProfileViewModel$init$1$1$WhenMappings */
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
                $EnumSwitchMapping$0 = iArr;
            }
        }

        AnonymousClass1(UserProfileViewModel userProfileViewModel) {
            this.this$0 = userProfileViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
        /* renamed from: emit  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit2(User user, Continuation<? super Unit> continuation) {
            UserProfileViewModel$init$1$1$emit$1 userProfileViewModel$init$1$1$emit$1;
            int i;
            AppConfigUseCase appConfigUseCase;
            AnonymousClass1 anonymousClass1;
            int i2;
            String string;
            if (continuation instanceof UserProfileViewModel$init$1$1$emit$1) {
                userProfileViewModel$init$1$1$emit$1 = (UserProfileViewModel$init$1$1$emit$1) continuation;
                if ((userProfileViewModel$init$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    userProfileViewModel$init$1$1$emit$1.label -= Integer.MIN_VALUE;
                    Object obj = userProfileViewModel$init$1$1$emit$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = userProfileViewModel$init$1$1$emit$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        appConfigUseCase = this.this$0.appConfigUseCase;
                        userProfileViewModel$init$1$1$emit$1.L$0 = this;
                        userProfileViewModel$init$1$1$emit$1.L$1 = user;
                        userProfileViewModel$init$1$1$emit$1.label = 1;
                        obj = appConfigUseCase.isFeatureEnabled("change_icon_enabled", userProfileViewModel$init$1$1$emit$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        anonymousClass1 = this;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        user = (User) userProfileViewModel$init$1$1$emit$1.L$1;
                        anonymousClass1 = (AnonymousClass1) userProfileViewModel$init$1$1$emit$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Boolean bool = (Boolean) obj;
                    boolean booleanValue = bool == null ? bool.booleanValue() : false;
                    if (user.getSubscription() != Subscription.PREMIUM) {
                        MutableLiveData<String> premium = anonymousClass1.this$0.getPremium();
                        UserProfileFragment fragment = anonymousClass1.this$0.getFragment();
                        premium.setValue(fragment != null ? fragment.getString(R.string.premium) : null);
                        MutableLiveData<String> premiumActive = anonymousClass1.this$0.getPremiumActive();
                        UserProfileFragment fragment2 = anonymousClass1.this$0.getFragment();
                        premiumActive.setValue(fragment2 != null ? fragment2.getString(R.string.active) : null);
                        anonymousClass1.this$0.isPremium().setValue(Boxing.boxBoolean(true));
                        anonymousClass1.this$0.getChangeIconEnabled().setValue(Boxing.boxBoolean(booleanValue));
                    } else {
                        MutableLiveData<String> premium2 = anonymousClass1.this$0.getPremium();
                        UserProfileFragment fragment3 = anonymousClass1.this$0.getFragment();
                        premium2.setValue(fragment3 != null ? fragment3.getString(R.string.upgrade) : null);
                        anonymousClass1.this$0.getPremiumActive().setValue("");
                        anonymousClass1.this$0.isPremium().setValue(Boxing.boxBoolean(false));
                        anonymousClass1.this$0.getChangeIconEnabled().setValue(Boxing.boxBoolean(false));
                    }
                    MutableLiveData<String> name = anonymousClass1.this$0.getName();
                    String name2 = user.getName();
                    name.setValue(name2 != null ? name2 : "");
                    MutableLiveData<String> gender = anonymousClass1.this$0.getGender();
                    Gender gender2 = user.getGender();
                    i2 = gender2 != null ? -1 : WhenMappings.$EnumSwitchMapping$0[gender2.ordinal()];
                    if (i2 != 1) {
                        UserProfileFragment fragment4 = anonymousClass1.this$0.getFragment();
                        if (fragment4 != null) {
                            string = fragment4.getString(R.string.user_male);
                        }
                        string = null;
                    } else if (i2 == 2) {
                        UserProfileFragment fragment5 = anonymousClass1.this$0.getFragment();
                        if (fragment5 != null) {
                            string = fragment5.getString(R.string.user_female);
                        }
                        string = null;
                    } else {
                        UserProfileFragment fragment6 = anonymousClass1.this$0.getFragment();
                        if (fragment6 != null) {
                            string = fragment6.getString(R.string.user_non_binary);
                        }
                        string = null;
                    }
                    gender.setValue(string);
                    Birthday birthday = user.getBirthday();
                    Date date = birthday == null ? birthday.getDate() : null;
                    anonymousClass1.this$0.getAge().setValue(date != null ? new SimpleDateFormat("yyyy", Locale.US).format(date) : null);
                    return Unit.INSTANCE;
                }
            }
            userProfileViewModel$init$1$1$emit$1 = new UserProfileViewModel$init$1$1$emit$1(this, continuation);
            Object obj2 = userProfileViewModel$init$1$1$emit$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = userProfileViewModel$init$1$1$emit$1.label;
            if (i != 0) {
            }
            Boolean bool2 = (Boolean) obj2;
            if (bool2 == null) {
            }
            if (user.getSubscription() != Subscription.PREMIUM) {
            }
            MutableLiveData<String> name3 = anonymousClass1.this$0.getName();
            String name22 = user.getName();
            name3.setValue(name22 != null ? name22 : "");
            MutableLiveData<String> gender3 = anonymousClass1.this$0.getGender();
            Gender gender22 = user.getGender();
            if (gender22 != null) {
            }
            if (i2 != 1) {
            }
            gender3.setValue(string);
            Birthday birthday2 = user.getBirthday();
            if (birthday2 == null) {
            }
            anonymousClass1.this$0.getAge().setValue(date != null ? new SimpleDateFormat("yyyy", Locale.US).format(date) : null);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(User user, Continuation continuation) {
            return emit2(user, (Continuation<? super Unit>) continuation);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetUserUseCase getUserUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getUserUseCase = this.this$0.getUserUseCase;
            this.label = 1;
            obj = getUserUseCase.flow(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        if (FlowKt.filterNotNull((Flow) obj).collect(new AnonymousClass1(this.this$0), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
