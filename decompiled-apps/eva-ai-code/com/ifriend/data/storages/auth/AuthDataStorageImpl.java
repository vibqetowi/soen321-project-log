package com.ifriend.data.storages.auth;

import com.ifriend.common_utils.Constants;
import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.ClientId;
import com.ifriend.domain.models.profile.user.DbId;
import com.ifriend.domain.models.profile.user.UserId;
import com.ifriend.domain.models.profile.user.UserToken;
import com.ifriend.domain.storage.token.UserTokenStorage;
import com.ifriend.domain.storage.token.UserTokenStorageKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: AuthDataStorageImpl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0012H\u0016J\u0019\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/data/storages/auth/AuthDataStorageImpl;", "Lcom/ifriend/domain/data/AuthDataStorage;", "tokenStorage", "Lcom/ifriend/domain/storage/token/UserTokenStorage;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/storage/token/UserTokenStorage;Lcom/ifriend/domain/data/Preferences;)V", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/models/profile/user/AuthData;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastAuthData", "save", "authData", "(Lcom/ifriend/domain/models/profile/user/AuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionAuthData", "Lkotlinx/coroutines/flow/StateFlow;", "set", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthDataStorageImpl implements AuthDataStorage {
    private final Preferences preferences;
    private final MutableStateFlow<AuthData> stateFlow;
    private final UserTokenStorage tokenStorage;

    public AuthDataStorageImpl(UserTokenStorage tokenStorage, Preferences preferences) {
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.tokenStorage = tokenStorage;
        this.preferences = preferences;
        this.stateFlow = StateFlowKt.MutableStateFlow(null);
    }

    @Override // com.ifriend.domain.data.AuthDataProvider
    public StateFlow<AuthData> sessionAuthData() {
        return this.stateFlow;
    }

    @Override // com.ifriend.domain.data.AuthDataStorage
    public Object set(AuthData authData, Continuation<? super Unit> continuation) {
        this.stateFlow.tryEmit(authData);
        Object save = save(authData, continuation);
        return save == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? save : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    @Override // com.ifriend.domain.data.AuthDataProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object lastAuthData(Continuation<? super AuthData> continuation) {
        AuthDataStorageImpl$lastAuthData$1 authDataStorageImpl$lastAuthData$1;
        int i;
        String stringWithKey;
        String stringWithKey2;
        String stringWithKey3;
        String str;
        String str2;
        String str3;
        String str4;
        UserToken userToken;
        if (continuation instanceof AuthDataStorageImpl$lastAuthData$1) {
            authDataStorageImpl$lastAuthData$1 = (AuthDataStorageImpl$lastAuthData$1) continuation;
            if ((authDataStorageImpl$lastAuthData$1.label & Integer.MIN_VALUE) != 0) {
                authDataStorageImpl$lastAuthData$1.label -= Integer.MIN_VALUE;
                Object obj = authDataStorageImpl$lastAuthData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authDataStorageImpl$lastAuthData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String stringWithKey4 = this.preferences.getStringWithKey("user_id");
                    if (stringWithKey4 == null || (stringWithKey = this.preferences.getStringWithKey("client_id")) == null || (stringWithKey2 = this.preferences.getStringWithKey(Constants.DB_ID)) == null || (stringWithKey3 = this.preferences.getStringWithKey("email")) == null) {
                        return null;
                    }
                    authDataStorageImpl$lastAuthData$1.L$0 = stringWithKey4;
                    authDataStorageImpl$lastAuthData$1.L$1 = stringWithKey;
                    authDataStorageImpl$lastAuthData$1.L$2 = stringWithKey2;
                    authDataStorageImpl$lastAuthData$1.L$3 = stringWithKey3;
                    authDataStorageImpl$lastAuthData$1.label = 1;
                    Object current = UserTokenStorageKt.current(this.tokenStorage, authDataStorageImpl$lastAuthData$1);
                    if (current == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = stringWithKey;
                    str2 = stringWithKey2;
                    str3 = stringWithKey3;
                    str4 = stringWithKey4;
                    obj = current;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str2 = (String) authDataStorageImpl$lastAuthData$1.L$2;
                    str = (String) authDataStorageImpl$lastAuthData$1.L$1;
                    str4 = (String) authDataStorageImpl$lastAuthData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    str3 = (String) authDataStorageImpl$lastAuthData$1.L$3;
                }
                userToken = (UserToken) obj;
                if (Intrinsics.areEqual(userToken, UserToken.Companion.getEMPTY())) {
                    return new AuthData(new UserId(str4), new ClientId(str), userToken, new DbId(str2), str3);
                }
                return null;
            }
        }
        authDataStorageImpl$lastAuthData$1 = new AuthDataStorageImpl$lastAuthData$1(this, continuation);
        Object obj2 = authDataStorageImpl$lastAuthData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authDataStorageImpl$lastAuthData$1.label;
        if (i != 0) {
        }
        userToken = (UserToken) obj2;
        if (Intrinsics.areEqual(userToken, UserToken.Companion.getEMPTY())) {
        }
    }

    @Override // com.ifriend.domain.data.AuthDataStorage
    public Object clear(Continuation<? super Unit> continuation) {
        this.stateFlow.tryEmit(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object save(AuthData authData, Continuation<? super Unit> continuation) {
        AuthDataStorageImpl$save$1 authDataStorageImpl$save$1;
        int i;
        AuthDataStorageImpl authDataStorageImpl;
        if (continuation instanceof AuthDataStorageImpl$save$1) {
            authDataStorageImpl$save$1 = (AuthDataStorageImpl$save$1) continuation;
            if ((authDataStorageImpl$save$1.label & Integer.MIN_VALUE) != 0) {
                authDataStorageImpl$save$1.label -= Integer.MIN_VALUE;
                Object obj = authDataStorageImpl$save$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authDataStorageImpl$save$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UserTokenStorage userTokenStorage = this.tokenStorage;
                    UserToken token = authData.getToken();
                    authDataStorageImpl$save$1.L$0 = this;
                    authDataStorageImpl$save$1.L$1 = authData;
                    authDataStorageImpl$save$1.label = 1;
                    if (userTokenStorage.set(token, authDataStorageImpl$save$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authDataStorageImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    authData = (AuthData) authDataStorageImpl$save$1.L$1;
                    authDataStorageImpl = (AuthDataStorageImpl) authDataStorageImpl$save$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                authDataStorageImpl.preferences.saveStringWithKey("user_id", authData.getUserId().getValue());
                authDataStorageImpl.preferences.saveStringWithKey("client_id", authData.getClientId().getValue());
                authDataStorageImpl.preferences.saveStringWithKey(Constants.DB_ID, authData.getDbId().getValue());
                authDataStorageImpl.preferences.saveStringWithKey("email", authData.getEmail());
                return Unit.INSTANCE;
            }
        }
        authDataStorageImpl$save$1 = new AuthDataStorageImpl$save$1(this, continuation);
        Object obj2 = authDataStorageImpl$save$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authDataStorageImpl$save$1.label;
        if (i != 0) {
        }
        authDataStorageImpl.preferences.saveStringWithKey("user_id", authData.getUserId().getValue());
        authDataStorageImpl.preferences.saveStringWithKey("client_id", authData.getClientId().getValue());
        authDataStorageImpl.preferences.saveStringWithKey(Constants.DB_ID, authData.getDbId().getValue());
        authDataStorageImpl.preferences.saveStringWithKey("email", authData.getEmail());
        return Unit.INSTANCE;
    }
}
