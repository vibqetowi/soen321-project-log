package com.ifriend.chat.data;

import com.ifriend.chat.domain.data.ResetAiApiDelegate;
import com.ifriend.domain.models.profile.user.AuthData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
/* compiled from: ResetAiApiDelegateImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ifriend/chat/data/ResetAiApiDelegateImpl;", "Lcom/ifriend/chat/domain/data/ResetAiApiDelegate;", "api", "Lcom/ifriend/chat/data/UserApi;", "(Lcom/ifriend/chat/data/UserApi;)V", "nowMinus", "", "millis", "", "resetAll", "", "auth", "Lcom/ifriend/domain/models/profile/user/AuthData;", "(Lcom/ifriend/domain/models/profile/user/AuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetLastDay", "resetLastHour", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetAiApiDelegateImpl implements ResetAiApiDelegate {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final long DAY_IN_MILLIS = 86400000;
    @Deprecated
    public static final long HOUR_IN_MILLIS = 3600000;
    private static final SimpleDateFormat format;
    private final UserApi api;

    public ResetAiApiDelegateImpl(UserApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* compiled from: ResetAiApiDelegateImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/data/ResetAiApiDelegateImpl$Companion;", "", "()V", "DAY_IN_MILLIS", "", "HOUR_IN_MILLIS", "format", "Ljava/text/SimpleDateFormat;", "getFormat", "()Ljava/text/SimpleDateFormat;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SimpleDateFormat getFormat() {
            return ResetAiApiDelegateImpl.format;
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        format = simpleDateFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // com.ifriend.chat.domain.data.ResetAiApiDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resetAll(AuthData authData, Continuation<? super Boolean> continuation) {
        ResetAiApiDelegateImpl$resetAll$1 resetAiApiDelegateImpl$resetAll$1;
        int i;
        if (continuation instanceof ResetAiApiDelegateImpl$resetAll$1) {
            resetAiApiDelegateImpl$resetAll$1 = (ResetAiApiDelegateImpl$resetAll$1) continuation;
            if ((resetAiApiDelegateImpl$resetAll$1.label & Integer.MIN_VALUE) != 0) {
                resetAiApiDelegateImpl$resetAll$1.label -= Integer.MIN_VALUE;
                Object obj = resetAiApiDelegateImpl$resetAll$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = resetAiApiDelegateImpl$resetAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UserApi userApi = this.api;
                    String formatted = authData.getToken().formatted();
                    String value = authData.getUserId().getValue();
                    String value2 = authData.getClientId().getValue();
                    resetAiApiDelegateImpl$resetAll$1.label = 1;
                    obj = userApi.resetAllAi(formatted, value, value2, resetAiApiDelegateImpl$resetAll$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Response) obj).isSuccessful());
            }
        }
        resetAiApiDelegateImpl$resetAll$1 = new ResetAiApiDelegateImpl$resetAll$1(this, continuation);
        Object obj2 = resetAiApiDelegateImpl$resetAll$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = resetAiApiDelegateImpl$resetAll$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Response) obj2).isSuccessful());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.ifriend.chat.domain.data.ResetAiApiDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resetLastDay(AuthData authData, Continuation<? super Boolean> continuation) {
        ResetAiApiDelegateImpl$resetLastDay$1 resetAiApiDelegateImpl$resetLastDay$1;
        int i;
        if (continuation instanceof ResetAiApiDelegateImpl$resetLastDay$1) {
            resetAiApiDelegateImpl$resetLastDay$1 = (ResetAiApiDelegateImpl$resetLastDay$1) continuation;
            if ((resetAiApiDelegateImpl$resetLastDay$1.label & Integer.MIN_VALUE) != 0) {
                resetAiApiDelegateImpl$resetLastDay$1.label -= Integer.MIN_VALUE;
                ResetAiApiDelegateImpl$resetLastDay$1 resetAiApiDelegateImpl$resetLastDay$12 = resetAiApiDelegateImpl$resetLastDay$1;
                Object obj = resetAiApiDelegateImpl$resetLastDay$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = resetAiApiDelegateImpl$resetLastDay$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UserApi userApi = this.api;
                    String formatted = authData.getToken().formatted();
                    String value = authData.getUserId().getValue();
                    String value2 = authData.getClientId().getValue();
                    String nowMinus = nowMinus(86400000L);
                    resetAiApiDelegateImpl$resetLastDay$12.label = 1;
                    obj = userApi.resetAi(formatted, value, value2, nowMinus, resetAiApiDelegateImpl$resetLastDay$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Response) obj).isSuccessful());
            }
        }
        resetAiApiDelegateImpl$resetLastDay$1 = new ResetAiApiDelegateImpl$resetLastDay$1(this, continuation);
        ResetAiApiDelegateImpl$resetLastDay$1 resetAiApiDelegateImpl$resetLastDay$122 = resetAiApiDelegateImpl$resetLastDay$1;
        Object obj2 = resetAiApiDelegateImpl$resetLastDay$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = resetAiApiDelegateImpl$resetLastDay$122.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Response) obj2).isSuccessful());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.ifriend.chat.domain.data.ResetAiApiDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resetLastHour(AuthData authData, Continuation<? super Boolean> continuation) {
        ResetAiApiDelegateImpl$resetLastHour$1 resetAiApiDelegateImpl$resetLastHour$1;
        int i;
        if (continuation instanceof ResetAiApiDelegateImpl$resetLastHour$1) {
            resetAiApiDelegateImpl$resetLastHour$1 = (ResetAiApiDelegateImpl$resetLastHour$1) continuation;
            if ((resetAiApiDelegateImpl$resetLastHour$1.label & Integer.MIN_VALUE) != 0) {
                resetAiApiDelegateImpl$resetLastHour$1.label -= Integer.MIN_VALUE;
                ResetAiApiDelegateImpl$resetLastHour$1 resetAiApiDelegateImpl$resetLastHour$12 = resetAiApiDelegateImpl$resetLastHour$1;
                Object obj = resetAiApiDelegateImpl$resetLastHour$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = resetAiApiDelegateImpl$resetLastHour$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UserApi userApi = this.api;
                    String formatted = authData.getToken().formatted();
                    String value = authData.getUserId().getValue();
                    String value2 = authData.getClientId().getValue();
                    String nowMinus = nowMinus(3600000L);
                    resetAiApiDelegateImpl$resetLastHour$12.label = 1;
                    obj = userApi.resetAi(formatted, value, value2, nowMinus, resetAiApiDelegateImpl$resetLastHour$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Response) obj).isSuccessful());
            }
        }
        resetAiApiDelegateImpl$resetLastHour$1 = new ResetAiApiDelegateImpl$resetLastHour$1(this, continuation);
        ResetAiApiDelegateImpl$resetLastHour$1 resetAiApiDelegateImpl$resetLastHour$122 = resetAiApiDelegateImpl$resetLastHour$1;
        Object obj2 = resetAiApiDelegateImpl$resetLastHour$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = resetAiApiDelegateImpl$resetLastHour$122.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Response) obj2).isSuccessful());
    }

    private final String nowMinus(long j) {
        String format2 = format.format(new Date(System.currentTimeMillis() - j));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }
}
