package com.ifriend.data.networking.api;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.Task;
import com.ifriend.data.networking.requests.SubscribeRequest;
import com.ifriend.domain.models.profile.user.UserToken;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.storage.token.UserTokenStorageKt;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebaseApiRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.networking.api.FirebaseApiRepositoryImpl$unsubscribe$2$1", f = "FirebaseApiRepositoryImpl.kt", i = {0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "invokeSuspend", n = {"token"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class FirebaseApiRepositoryImpl$unsubscribe$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Task<String> $task;
    final /* synthetic */ String $userId;
    Object L$0;
    int label;
    final /* synthetic */ FirebaseApiRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseApiRepositoryImpl$unsubscribe$2$1(Task<String> task, FirebaseApiRepositoryImpl firebaseApiRepositoryImpl, String str, Continuation<? super FirebaseApiRepositoryImpl$unsubscribe$2$1> continuation) {
        super(2, continuation);
        this.$task = task;
        this.this$0 = firebaseApiRepositoryImpl;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FirebaseApiRepositoryImpl$unsubscribe$2$1(this.$task, this.this$0, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FirebaseApiRepositoryImpl$unsubscribe$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String result;
        UserTokenProvider userTokenProvider;
        FirebaseApi firebaseApi;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (SocketTimeoutException unused) {
            Log.e("Unsubscribe", "Timeout Exception");
        } catch (Exception unused2) {
            Log.e("Unsubscribe", "Exception");
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            result = this.$task.getResult();
            userTokenProvider = this.this$0.userTokenProvider;
            this.L$0 = result;
            this.label = 1;
            obj = UserTokenStorageKt.current(userTokenProvider, this);
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
            result = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String formatted = ((UserToken) obj).formatted();
        firebaseApi = this.this$0.firebaseApi;
        String str2 = this.$userId;
        String str3 = result + "@android";
        str = this.this$0.CLOUD_MESSAGES;
        this.L$0 = null;
        this.label = 2;
        if (firebaseApi.unsubscribe(formatted, str2, new SubscribeRequest(str3, str), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
