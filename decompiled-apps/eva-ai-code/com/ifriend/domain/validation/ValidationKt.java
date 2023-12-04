package com.ifriend.domain.validation;

import com.ifriend.domain.useCases.AppConfigUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Validation.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"isValidAge", "", "", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "isBot", "(Ljava/lang/String;Lcom/ifriend/domain/useCases/AppConfigUseCase;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isValidEmail", "isValidName", "isValidPassword", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValidationKt {
    public static final boolean isValidPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() >= 4;
    }

    public static final boolean isValidEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$").matches(str);
    }

    public static final boolean isValidName(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return !StringsKt.isBlank(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object isValidAge(String str, AppConfigUseCase appConfigUseCase, boolean z, Continuation<? super Boolean> continuation) {
        ValidationKt$isValidAge$1 validationKt$isValidAge$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Integer num;
        String str2;
        long j;
        if (continuation instanceof ValidationKt$isValidAge$1) {
            validationKt$isValidAge$1 = (ValidationKt$isValidAge$1) continuation;
            if ((validationKt$isValidAge$1.label & Integer.MIN_VALUE) != 0) {
                validationKt$isValidAge$1.label -= Integer.MIN_VALUE;
                obj = validationKt$isValidAge$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = validationKt$isValidAge$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Integer intOrNull = StringsKt.toIntOrNull(str);
                    String str3 = z ? "bot_" : "user_";
                    String concat = str3.concat("min_age");
                    validationKt$isValidAge$1.L$0 = appConfigUseCase;
                    validationKt$isValidAge$1.L$1 = intOrNull;
                    validationKt$isValidAge$1.L$2 = str3;
                    validationKt$isValidAge$1.label = 1;
                    obj = appConfigUseCase.getLongValue(concat, validationKt$isValidAge$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String str4 = str3;
                    num = intOrNull;
                    str2 = str4;
                } else if (i != 1) {
                    if (i == 2) {
                        j = validationKt$isValidAge$1.J$0;
                        num = (Integer) validationKt$isValidAge$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Long l = (Long) obj;
                        return Boxing.boxBoolean(num != null ? false : RangesKt.longRangeContains((ClosedRange<Long>) new LongRange(j, l == null ? l.longValue() : 99L), num.intValue()));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str2 = (String) validationKt$isValidAge$1.L$2;
                    AppConfigUseCase appConfigUseCase2 = (AppConfigUseCase) validationKt$isValidAge$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    num = (Integer) validationKt$isValidAge$1.L$1;
                    appConfigUseCase = appConfigUseCase2;
                }
                Long l2 = (Long) obj;
                long longValue = l2 == null ? l2.longValue() : 0L;
                validationKt$isValidAge$1.L$0 = num;
                validationKt$isValidAge$1.L$1 = null;
                validationKt$isValidAge$1.L$2 = null;
                validationKt$isValidAge$1.J$0 = longValue;
                validationKt$isValidAge$1.label = 2;
                obj = appConfigUseCase.getLongValue(str2 + "max_age", validationKt$isValidAge$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = longValue;
                Long l3 = (Long) obj;
                return Boxing.boxBoolean(num != null ? false : RangesKt.longRangeContains((ClosedRange<Long>) new LongRange(j, l3 == null ? l3.longValue() : 99L), num.intValue()));
            }
        }
        validationKt$isValidAge$1 = new ValidationKt$isValidAge$1(continuation);
        obj = validationKt$isValidAge$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = validationKt$isValidAge$1.label;
        if (i != 0) {
        }
        Long l22 = (Long) obj;
        if (l22 == null) {
        }
        validationKt$isValidAge$1.L$0 = num;
        validationKt$isValidAge$1.L$1 = null;
        validationKt$isValidAge$1.L$2 = null;
        validationKt$isValidAge$1.J$0 = longValue;
        validationKt$isValidAge$1.label = 2;
        obj = appConfigUseCase.getLongValue(str2 + "max_age", validationKt$isValidAge$1);
        if (obj != coroutine_suspended) {
        }
    }
}
