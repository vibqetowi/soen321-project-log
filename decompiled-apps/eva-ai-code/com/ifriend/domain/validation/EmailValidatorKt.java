package com.ifriend.domain.validation;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import org.apache.http.cookie.ClientCookie;
/* compiled from: EmailValidator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"isNotValid", "", "Lcom/ifriend/domain/validation/EmailValidator;", "email", "", "(Lcom/ifriend/domain/validation/EmailValidator;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmailValidatorKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object isNotValid(EmailValidator emailValidator, String str, Continuation<? super Boolean> continuation) {
        EmailValidatorKt$isNotValid$1 emailValidatorKt$isNotValid$1;
        int i;
        if (continuation instanceof EmailValidatorKt$isNotValid$1) {
            emailValidatorKt$isNotValid$1 = (EmailValidatorKt$isNotValid$1) continuation;
            if ((emailValidatorKt$isNotValid$1.label & Integer.MIN_VALUE) != 0) {
                emailValidatorKt$isNotValid$1.label -= Integer.MIN_VALUE;
                Object obj = emailValidatorKt$isNotValid$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailValidatorKt$isNotValid$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    emailValidatorKt$isNotValid$1.label = 1;
                    obj = emailValidator.isValid(str, emailValidatorKt$isNotValid$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(!((Boolean) obj).booleanValue());
            }
        }
        emailValidatorKt$isNotValid$1 = new EmailValidatorKt$isNotValid$1(continuation);
        Object obj2 = emailValidatorKt$isNotValid$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailValidatorKt$isNotValid$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(!((Boolean) obj2).booleanValue());
    }
}
