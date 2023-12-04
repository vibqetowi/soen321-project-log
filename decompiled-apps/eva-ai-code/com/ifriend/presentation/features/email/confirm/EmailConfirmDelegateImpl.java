package com.ifriend.presentation.features.email.confirm;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.data.toggle.ConfirmEmailFeatureToggle;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.useCases.AppConfigUseCase;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: EmailConfirmDelegate.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u00020\u000e¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ifriend/presentation/features/email/confirm/EmailConfirmDelegateImpl;", "Lcom/ifriend/presentation/features/email/confirm/EmailConfirmDelegate;", "confirmEmailFeatureToggle", "Lcom/ifriend/data/toggle/ConfirmEmailFeatureToggle;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "(Lcom/ifriend/data/toggle/ConfirmEmailFeatureToggle;Lcom/ifriend/domain/useCases/AppConfigUseCase;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/TagsProvider;)V", "getEmailConfirmNeededFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/flow/StateFlow;", "handleTags", "tags", "", "Lcom/ifriend/domain/models/Tag;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEmailConfirmationAllowed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmailConfirmDelegateImpl implements EmailConfirmDelegate {
    public static final int $stable = 8;
    private final AppConfigUseCase appConfigUseCase;
    private final ConfirmEmailFeatureToggle confirmEmailFeatureToggle;
    private final TagsProvider tagsProvider;
    private final UserRepository userRepository;

    @Inject
    public EmailConfirmDelegateImpl(ConfirmEmailFeatureToggle confirmEmailFeatureToggle, AppConfigUseCase appConfigUseCase, UserRepository userRepository, TagsProvider tagsProvider) {
        Intrinsics.checkNotNullParameter(confirmEmailFeatureToggle, "confirmEmailFeatureToggle");
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        this.confirmEmailFeatureToggle = confirmEmailFeatureToggle;
        this.appConfigUseCase = appConfigUseCase;
        this.userRepository = userRepository;
        this.tagsProvider = tagsProvider;
    }

    @Override // com.ifriend.presentation.features.email.confirm.EmailConfirmDelegate
    public StateFlow<Boolean> getEmailConfirmNeededFlow(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        final Flow<List<Tag>> tagsFlow = this.tagsProvider.tagsFlow();
        return FlowKt.stateIn(new Flow<Boolean>() { // from class: com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl$getEmailConfirmNeededFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl$getEmailConfirmNeededFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ EmailConfirmDelegateImpl $receiver$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl$getEmailConfirmNeededFlow$$inlined$map$1$2", f = "EmailConfirmDelegate.kt", i = {}, l = {224, 223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl$getEmailConfirmNeededFlow$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, EmailConfirmDelegateImpl emailConfirmDelegateImpl) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$receiver$inlined = emailConfirmDelegateImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
                    Object coroutine_suspended;
                    int i;
                    Object handleTags;
                    FlowCollector flowCollector;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            obj2 = anonymousClass1.result;
                            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                EmailConfirmDelegateImpl emailConfirmDelegateImpl = this.$receiver$inlined;
                                anonymousClass1.L$0 = flowCollector2;
                                anonymousClass1.label = 1;
                                handleTags = emailConfirmDelegateImpl.handleTags((List) obj, anonymousClass1);
                                if (handleTags == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = handleTags;
                                flowCollector = flowCollector2;
                            } else if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            } else {
                                flowCollector = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    obj2 = anonymousClass1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, ViewModelKt.getViewModelScope(context_receiver_0), SharingStarted.Companion.getLazily(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleTags(List<Tag> list, Continuation<? super Boolean> continuation) {
        EmailConfirmDelegateImpl$handleTags$1 emailConfirmDelegateImpl$handleTags$1;
        Object obj;
        int i;
        EmailConfirmDelegateImpl emailConfirmDelegateImpl;
        boolean contains;
        if (continuation instanceof EmailConfirmDelegateImpl$handleTags$1) {
            emailConfirmDelegateImpl$handleTags$1 = (EmailConfirmDelegateImpl$handleTags$1) continuation;
            if ((emailConfirmDelegateImpl$handleTags$1.label & Integer.MIN_VALUE) != 0) {
                emailConfirmDelegateImpl$handleTags$1.label -= Integer.MIN_VALUE;
                obj = emailConfirmDelegateImpl$handleTags$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailConfirmDelegateImpl$handleTags$1.label;
                boolean z = false;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ConfirmEmailFeatureToggle confirmEmailFeatureToggle = this.confirmEmailFeatureToggle;
                    emailConfirmDelegateImpl$handleTags$1.L$0 = this;
                    emailConfirmDelegateImpl$handleTags$1.L$1 = list;
                    emailConfirmDelegateImpl$handleTags$1.label = 1;
                    obj = confirmEmailFeatureToggle.isEnabled(emailConfirmDelegateImpl$handleTags$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    emailConfirmDelegateImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        contains = emailConfirmDelegateImpl$handleTags$1.Z$0;
                        ResultKt.throwOnFailure(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (!contains && booleanValue) {
                            z = true;
                        }
                        return Boxing.boxBoolean(z);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    list = (List) emailConfirmDelegateImpl$handleTags$1.L$1;
                    emailConfirmDelegateImpl = (EmailConfirmDelegateImpl) emailConfirmDelegateImpl$handleTags$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) ((StateFlow) obj).getValue()).booleanValue() || list == null) {
                    return Boxing.boxBoolean(false);
                }
                contains = list.contains(new Tag("email.confirmed"));
                emailConfirmDelegateImpl$handleTags$1.L$0 = null;
                emailConfirmDelegateImpl$handleTags$1.L$1 = null;
                emailConfirmDelegateImpl$handleTags$1.Z$0 = contains;
                emailConfirmDelegateImpl$handleTags$1.label = 2;
                obj = emailConfirmDelegateImpl.isEmailConfirmationAllowed(emailConfirmDelegateImpl$handleTags$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                if (!contains) {
                    z = true;
                }
                return Boxing.boxBoolean(z);
            }
        }
        emailConfirmDelegateImpl$handleTags$1 = new EmailConfirmDelegateImpl$handleTags$1(this, continuation);
        obj = emailConfirmDelegateImpl$handleTags$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailConfirmDelegateImpl$handleTags$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        if (((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isEmailConfirmationAllowed(Continuation<? super Boolean> continuation) {
        EmailConfirmDelegateImpl$isEmailConfirmationAllowed$1 emailConfirmDelegateImpl$isEmailConfirmationAllowed$1;
        int i;
        EmailConfirmDelegateImpl emailConfirmDelegateImpl;
        Long l;
        EmailConfirmDelegateImpl emailConfirmDelegateImpl2;
        long j;
        Long l2;
        Long registrationDate;
        if (continuation instanceof EmailConfirmDelegateImpl$isEmailConfirmationAllowed$1) {
            emailConfirmDelegateImpl$isEmailConfirmationAllowed$1 = (EmailConfirmDelegateImpl$isEmailConfirmationAllowed$1) continuation;
            if ((emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.label & Integer.MIN_VALUE) != 0) {
                emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.label -= Integer.MIN_VALUE;
                Object obj = emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppConfigUseCase appConfigUseCase = this.appConfigUseCase;
                    emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.L$0 = this;
                    emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.label = 1;
                    obj = appConfigUseCase.getLongValue("new_user_for_email_confirmation_date", emailConfirmDelegateImpl$isEmailConfirmationAllowed$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    emailConfirmDelegateImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        j = emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.J$0;
                        emailConfirmDelegateImpl2 = (EmailConfirmDelegateImpl) emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        l2 = (Long) obj;
                        if (l2 == null) {
                            long longValue = l2.longValue();
                            User currentUser = emailConfirmDelegateImpl2.userRepository.getCurrentUser();
                            if (currentUser != null && (registrationDate = currentUser.getRegistrationDate()) != null) {
                                if (registrationDate.longValue() <= j && System.currentTimeMillis() <= j + longValue) {
                                    z = false;
                                }
                                return Boxing.boxBoolean(z);
                            }
                            return Boxing.boxBoolean(false);
                        }
                        return Boxing.boxBoolean(false);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    emailConfirmDelegateImpl = (EmailConfirmDelegateImpl) emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                l = (Long) obj;
                if (l == null) {
                    long longValue2 = l.longValue();
                    AppConfigUseCase appConfigUseCase2 = emailConfirmDelegateImpl.appConfigUseCase;
                    emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.L$0 = emailConfirmDelegateImpl;
                    emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.J$0 = longValue2;
                    emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.label = 2;
                    obj = appConfigUseCase2.getLongValue("delay_email_confirmation_for_old_user", emailConfirmDelegateImpl$isEmailConfirmationAllowed$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    emailConfirmDelegateImpl2 = emailConfirmDelegateImpl;
                    j = longValue2;
                    l2 = (Long) obj;
                    if (l2 == null) {
                    }
                } else {
                    return Boxing.boxBoolean(false);
                }
            }
        }
        emailConfirmDelegateImpl$isEmailConfirmationAllowed$1 = new EmailConfirmDelegateImpl$isEmailConfirmationAllowed$1(this, continuation);
        Object obj2 = emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailConfirmDelegateImpl$isEmailConfirmationAllowed$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l == null) {
        }
    }
}
