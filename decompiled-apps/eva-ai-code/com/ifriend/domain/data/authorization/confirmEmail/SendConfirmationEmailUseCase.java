package com.ifriend.domain.data.authorization.confirmEmail;

import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.models.profile.user.User;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: SendConfirmationEmailUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/data/authorization/confirmEmail/SendConfirmationEmailUseCase;", "", "confirmEmailRepository", "Lcom/ifriend/domain/data/authorization/confirmEmail/ConfirmEmailRepository;", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "appConfigRepository", "Lcom/ifriend/domain/data/config/AppConfigRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/domain/data/authorization/confirmEmail/ConfirmEmailRepository;Lcom/ifriend/domain/data/TagsProvider;Lcom/ifriend/domain/data/config/AppConfigRepository;Lcom/ifriend/domain/data/UserRepository;)V", "invoke", "", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendIfRequired", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SendConfirmationEmailUseCase {
    private final AppConfigRepository appConfigRepository;
    private final ConfirmEmailRepository confirmEmailRepository;
    private final TagsProvider tagsProvider;
    private final UserRepository userRepository;

    @Inject
    public SendConfirmationEmailUseCase(ConfirmEmailRepository confirmEmailRepository, TagsProvider tagsProvider, AppConfigRepository appConfigRepository, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(confirmEmailRepository, "confirmEmailRepository");
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        Intrinsics.checkNotNullParameter(appConfigRepository, "appConfigRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.confirmEmailRepository = confirmEmailRepository;
        this.tagsProvider = tagsProvider;
        this.appConfigRepository = appConfigRepository;
        this.userRepository = userRepository;
    }

    public static /* synthetic */ Object invoke$default(SendConfirmationEmailUseCase sendConfirmationEmailUseCase, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return sendConfirmationEmailUseCase.invoke(str, continuation);
    }

    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        ConfirmEmailRepository confirmEmailRepository = this.confirmEmailRepository;
        if (str == null) {
            str = "";
        }
        Object sendEmail = confirmEmailRepository.sendEmail(str, continuation);
        return sendEmail == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEmail : Unit.INSTANCE;
    }

    public static /* synthetic */ Object sendIfRequired$default(SendConfirmationEmailUseCase sendConfirmationEmailUseCase, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return sendConfirmationEmailUseCase.sendIfRequired(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendIfRequired(String str, Continuation<? super Unit> continuation) {
        SendConfirmationEmailUseCase$sendIfRequired$1 sendConfirmationEmailUseCase$sendIfRequired$1;
        Object obj;
        int i;
        SendConfirmationEmailUseCase sendConfirmationEmailUseCase;
        Long l;
        long j;
        Long l2;
        Long registrationDate;
        if (continuation instanceof SendConfirmationEmailUseCase$sendIfRequired$1) {
            sendConfirmationEmailUseCase$sendIfRequired$1 = (SendConfirmationEmailUseCase$sendIfRequired$1) continuation;
            if ((sendConfirmationEmailUseCase$sendIfRequired$1.label & Integer.MIN_VALUE) != 0) {
                sendConfirmationEmailUseCase$sendIfRequired$1.label -= Integer.MIN_VALUE;
                obj = sendConfirmationEmailUseCase$sendIfRequired$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sendConfirmationEmailUseCase$sendIfRequired$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<Tag> current = this.tagsProvider.current();
                    if (current != null && !current.contains(new Tag("email.confirmation.once.sent"))) {
                        AppConfigRepository appConfigRepository = this.appConfigRepository;
                        sendConfirmationEmailUseCase$sendIfRequired$1.L$0 = this;
                        sendConfirmationEmailUseCase$sendIfRequired$1.L$1 = str;
                        sendConfirmationEmailUseCase$sendIfRequired$1.label = 1;
                        obj = appConfigRepository.isFeatureEnabled("confirm_email", sendConfirmationEmailUseCase$sendIfRequired$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sendConfirmationEmailUseCase = this;
                    }
                    return Unit.INSTANCE;
                } else if (i == 1) {
                    str = (String) sendConfirmationEmailUseCase$sendIfRequired$1.L$1;
                    sendConfirmationEmailUseCase = (SendConfirmationEmailUseCase) sendConfirmationEmailUseCase$sendIfRequired$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = sendConfirmationEmailUseCase$sendIfRequired$1.J$0;
                    str = (String) sendConfirmationEmailUseCase$sendIfRequired$1.L$1;
                    sendConfirmationEmailUseCase = (SendConfirmationEmailUseCase) sendConfirmationEmailUseCase$sendIfRequired$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    l2 = (Long) obj;
                    if (l2 != null) {
                        return Unit.INSTANCE;
                    }
                    long longValue = l2.longValue();
                    User currentUser = sendConfirmationEmailUseCase.userRepository.getCurrentUser();
                    if (currentUser == null || (registrationDate = currentUser.getRegistrationDate()) == null) {
                        return Unit.INSTANCE;
                    }
                    if (registrationDate.longValue() >= j) {
                        return Unit.INSTANCE;
                    }
                    if (System.currentTimeMillis() > j + longValue) {
                        sendConfirmationEmailUseCase$sendIfRequired$1.L$0 = null;
                        sendConfirmationEmailUseCase$sendIfRequired$1.L$1 = null;
                        sendConfirmationEmailUseCase$sendIfRequired$1.label = 4;
                        if (sendConfirmationEmailUseCase.invoke(str, sendConfirmationEmailUseCase$sendIfRequired$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                } else {
                    str = (String) sendConfirmationEmailUseCase$sendIfRequired$1.L$1;
                    sendConfirmationEmailUseCase = (SendConfirmationEmailUseCase) sendConfirmationEmailUseCase$sendIfRequired$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    l = (Long) obj;
                    if (l != null) {
                        return Unit.INSTANCE;
                    }
                    long longValue2 = l.longValue();
                    AppConfigRepository appConfigRepository2 = sendConfirmationEmailUseCase.appConfigRepository;
                    sendConfirmationEmailUseCase$sendIfRequired$1.L$0 = sendConfirmationEmailUseCase;
                    sendConfirmationEmailUseCase$sendIfRequired$1.L$1 = str;
                    sendConfirmationEmailUseCase$sendIfRequired$1.J$0 = longValue2;
                    sendConfirmationEmailUseCase$sendIfRequired$1.label = 3;
                    obj = appConfigRepository2.getFeatureLongValue("delay_email_confirmation_for_old_user", sendConfirmationEmailUseCase$sendIfRequired$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = longValue2;
                    l2 = (Long) obj;
                    if (l2 != null) {
                    }
                }
                if (!Intrinsics.areEqual(obj, Boxing.boxBoolean(false))) {
                    return Unit.INSTANCE;
                }
                AppConfigRepository appConfigRepository3 = sendConfirmationEmailUseCase.appConfigRepository;
                sendConfirmationEmailUseCase$sendIfRequired$1.L$0 = sendConfirmationEmailUseCase;
                sendConfirmationEmailUseCase$sendIfRequired$1.L$1 = str;
                sendConfirmationEmailUseCase$sendIfRequired$1.label = 2;
                obj = appConfigRepository3.getFeatureLongValue("new_user_for_email_confirmation_date", sendConfirmationEmailUseCase$sendIfRequired$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                l = (Long) obj;
                if (l != null) {
                }
            }
        }
        sendConfirmationEmailUseCase$sendIfRequired$1 = new SendConfirmationEmailUseCase$sendIfRequired$1(this, continuation);
        obj = sendConfirmationEmailUseCase$sendIfRequired$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sendConfirmationEmailUseCase$sendIfRequired$1.label;
        if (i != 0) {
        }
        if (!Intrinsics.areEqual(obj, Boxing.boxBoolean(false))) {
        }
    }
}
