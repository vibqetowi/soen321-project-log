package com.ifriend.data.networking.api;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.models.profile.user.UserToken;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.storage.token.UserTokenStorageKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: FirebaseApiRepositoryImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/data/networking/api/FirebaseApiRepositoryImpl;", "Lcom/ifriend/domain/data/networking/FirebaseApiRepository;", "firebaseApi", "Lcom/ifriend/data/networking/api/FirebaseApi;", "userTokenProvider", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/data/networking/api/FirebaseApi;Lcom/ifriend/domain/storage/token/UserTokenProvider;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/common_utils/Logger;)V", "CLOUD_MESSAGES", "", "clearBadges", "", "userId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribe", "onSuccess", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribe", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseApiRepositoryImpl implements FirebaseApiRepository {
    private final String CLOUD_MESSAGES;
    private final CoroutineScope coroutineScope;
    private final FirebaseApi firebaseApi;
    private final Logger logger;
    private final UserTokenProvider userTokenProvider;

    public FirebaseApiRepositoryImpl(FirebaseApi firebaseApi, UserTokenProvider userTokenProvider, CoroutineScope coroutineScope, Logger logger) {
        Intrinsics.checkNotNullParameter(firebaseApi, "firebaseApi");
        Intrinsics.checkNotNullParameter(userTokenProvider, "userTokenProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.firebaseApi = firebaseApi;
        this.userTokenProvider = userTokenProvider;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.CLOUD_MESSAGES = "cloudmessages";
    }

    @Override // com.ifriend.domain.data.networking.FirebaseApiRepository
    public Object subscribe(final String str, final Function0<Unit> function0, Continuation<? super Unit> continuation) {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: com.ifriend.data.networking.api.FirebaseApiRepositoryImpl$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FirebaseApiRepositoryImpl.subscribe$lambda$0(FirebaseApiRepositoryImpl.this, str, function0, task);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribe$lambda$0(FirebaseApiRepositoryImpl this$0, String userId, Function0 onSuccess, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userId, "$userId");
        Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
        Intrinsics.checkNotNullParameter(task, "task");
        BuildersKt__Builders_commonKt.launch$default(this$0.coroutineScope, null, null, new FirebaseApiRepositoryImpl$subscribe$2$1(task, this$0, userId, onSuccess, null), 3, null);
    }

    @Override // com.ifriend.domain.data.networking.FirebaseApiRepository
    public Object unsubscribe(final String str, Continuation<? super Unit> continuation) {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: com.ifriend.data.networking.api.FirebaseApiRepositoryImpl$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FirebaseApiRepositoryImpl.unsubscribe$lambda$1(FirebaseApiRepositoryImpl.this, str, task);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unsubscribe$lambda$1(FirebaseApiRepositoryImpl this$0, String userId, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userId, "$userId");
        Intrinsics.checkNotNullParameter(task, "task");
        BuildersKt__Builders_commonKt.launch$default(this$0.coroutineScope, null, null, new FirebaseApiRepositoryImpl$unsubscribe$2$1(task, this$0, userId, null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(1:19))(2:24|(1:26)(1:27))|20|21|(1:23)|12|13|14))|30|6|7|(0)(0)|20|21|(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        android.util.Log.e("Clear badges", "Exception");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
        android.util.Log.e("Clear badges", "Timeout Exception");
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[RETURN] */
    @Override // com.ifriend.domain.data.networking.FirebaseApiRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearBadges(String str, Continuation<? super Unit> continuation) {
        FirebaseApiRepositoryImpl$clearBadges$1 firebaseApiRepositoryImpl$clearBadges$1;
        Object coroutine_suspended;
        int i;
        FirebaseApiRepositoryImpl firebaseApiRepositoryImpl;
        String formatted;
        FirebaseApi firebaseApi;
        if (continuation instanceof FirebaseApiRepositoryImpl$clearBadges$1) {
            firebaseApiRepositoryImpl$clearBadges$1 = (FirebaseApiRepositoryImpl$clearBadges$1) continuation;
            if ((firebaseApiRepositoryImpl$clearBadges$1.label & Integer.MIN_VALUE) != 0) {
                firebaseApiRepositoryImpl$clearBadges$1.label -= Integer.MIN_VALUE;
                Object obj = firebaseApiRepositoryImpl$clearBadges$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = firebaseApiRepositoryImpl$clearBadges$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UserTokenProvider userTokenProvider = this.userTokenProvider;
                    firebaseApiRepositoryImpl$clearBadges$1.L$0 = this;
                    firebaseApiRepositoryImpl$clearBadges$1.L$1 = str;
                    firebaseApiRepositoryImpl$clearBadges$1.label = 1;
                    obj = UserTokenStorageKt.current(userTokenProvider, firebaseApiRepositoryImpl$clearBadges$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    firebaseApiRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) firebaseApiRepositoryImpl$clearBadges$1.L$1;
                    firebaseApiRepositoryImpl = (FirebaseApiRepositoryImpl) firebaseApiRepositoryImpl$clearBadges$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                formatted = ((UserToken) obj).formatted();
                firebaseApi = firebaseApiRepositoryImpl.firebaseApi;
                firebaseApiRepositoryImpl$clearBadges$1.L$0 = null;
                firebaseApiRepositoryImpl$clearBadges$1.L$1 = null;
                firebaseApiRepositoryImpl$clearBadges$1.label = 2;
                if (firebaseApi.clearBadges(formatted, str, "0", firebaseApiRepositoryImpl$clearBadges$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        firebaseApiRepositoryImpl$clearBadges$1 = new FirebaseApiRepositoryImpl$clearBadges$1(this, continuation);
        Object obj2 = firebaseApiRepositoryImpl$clearBadges$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = firebaseApiRepositoryImpl$clearBadges$1.label;
        if (i != 0) {
        }
        formatted = ((UserToken) obj2).formatted();
        firebaseApi = firebaseApiRepositoryImpl.firebaseApi;
        firebaseApiRepositoryImpl$clearBadges$1.L$0 = null;
        firebaseApiRepositoryImpl$clearBadges$1.L$1 = null;
        firebaseApiRepositoryImpl$clearBadges$1.label = 2;
        if (firebaseApi.clearBadges(formatted, str, "0", firebaseApiRepositoryImpl$clearBadges$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
