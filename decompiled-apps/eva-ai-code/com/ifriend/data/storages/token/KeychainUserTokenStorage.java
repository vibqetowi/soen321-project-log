package com.ifriend.data.storages.token;

import android.content.Context;
import com.ifriend.domain.models.profile.user.UserToken;
import com.ifriend.domain.storage.token.UserTokenStorage;
import com.ifriend.keychain.KeychainAdapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: KeychainUserTokenStorage.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/data/storages/token/KeychainUserTokenStorage;", "Lcom/ifriend/domain/storage/token/UserTokenStorage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adapter", "Lcom/ifriend/keychain/KeychainAdapter;", "isInitValueFetched", "", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/domain/models/profile/user/UserToken;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchToken", "set", "token", "(Lcom/ifriend/domain/models/profile/user/UserToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeychainUserTokenStorage implements UserTokenStorage {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "KeychainUserToken";
    private final KeychainAdapter adapter;
    private boolean isInitValueFetched;
    private final MutableStateFlow<UserToken> stateFlow;

    public KeychainUserTokenStorage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.stateFlow = StateFlowKt.MutableStateFlow(UserToken.Companion.getEMPTY());
        this.adapter = new KeychainAdapter(context);
    }

    /* compiled from: KeychainUserTokenStorage.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/data/storages/token/KeychainUserTokenStorage$Companion;", "", "()V", "TAG", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.ifriend.domain.storage.token.UserTokenProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tokenStateFlow(Continuation<? super StateFlow<UserToken>> continuation) {
        KeychainUserTokenStorage$tokenStateFlow$1 keychainUserTokenStorage$tokenStateFlow$1;
        int i;
        KeychainUserTokenStorage keychainUserTokenStorage;
        if (continuation instanceof KeychainUserTokenStorage$tokenStateFlow$1) {
            keychainUserTokenStorage$tokenStateFlow$1 = (KeychainUserTokenStorage$tokenStateFlow$1) continuation;
            if ((keychainUserTokenStorage$tokenStateFlow$1.label & Integer.MIN_VALUE) != 0) {
                keychainUserTokenStorage$tokenStateFlow$1.label -= Integer.MIN_VALUE;
                Object obj = keychainUserTokenStorage$tokenStateFlow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = keychainUserTokenStorage$tokenStateFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.isInitValueFetched) {
                        keychainUserTokenStorage$tokenStateFlow$1.L$0 = this;
                        keychainUserTokenStorage$tokenStateFlow$1.label = 1;
                        if (fetchToken(keychainUserTokenStorage$tokenStateFlow$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    keychainUserTokenStorage = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    keychainUserTokenStorage = (KeychainUserTokenStorage) keychainUserTokenStorage$tokenStateFlow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return keychainUserTokenStorage.stateFlow;
            }
        }
        keychainUserTokenStorage$tokenStateFlow$1 = new KeychainUserTokenStorage$tokenStateFlow$1(this, continuation);
        Object obj2 = keychainUserTokenStorage$tokenStateFlow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = keychainUserTokenStorage$tokenStateFlow$1.label;
        if (i != 0) {
        }
        return keychainUserTokenStorage.stateFlow;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(1:25)(1:26))|19|(1:21)|12|13))|28|6|7|(0)(0)|19|(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
        android.util.Log.e(com.ifriend.data.storages.token.KeychainUserTokenStorage.TAG, "Error while trying to change token value");
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[RETURN] */
    @Override // com.ifriend.domain.storage.token.UserTokenStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object set(UserToken userToken, Continuation<? super Unit> continuation) {
        KeychainUserTokenStorage$set$1 keychainUserTokenStorage$set$1;
        Object coroutine_suspended;
        int i;
        KeychainUserTokenStorage keychainUserTokenStorage;
        MutableStateFlow<UserToken> mutableStateFlow;
        if (continuation instanceof KeychainUserTokenStorage$set$1) {
            keychainUserTokenStorage$set$1 = (KeychainUserTokenStorage$set$1) continuation;
            if ((keychainUserTokenStorage$set$1.label & Integer.MIN_VALUE) != 0) {
                keychainUserTokenStorage$set$1.label -= Integer.MIN_VALUE;
                Object obj = keychainUserTokenStorage$set$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = keychainUserTokenStorage$set$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    KeychainAdapter keychainAdapter = this.adapter;
                    String value = userToken.getValue();
                    keychainUserTokenStorage$set$1.L$0 = this;
                    keychainUserTokenStorage$set$1.L$1 = userToken;
                    keychainUserTokenStorage$set$1.label = 1;
                    if (keychainAdapter.setPassword(value, keychainUserTokenStorage$set$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    keychainUserTokenStorage = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    userToken = (UserToken) keychainUserTokenStorage$set$1.L$1;
                    keychainUserTokenStorage = (KeychainUserTokenStorage) keychainUserTokenStorage$set$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableStateFlow = keychainUserTokenStorage.stateFlow;
                keychainUserTokenStorage$set$1.L$0 = null;
                keychainUserTokenStorage$set$1.L$1 = null;
                keychainUserTokenStorage$set$1.label = 2;
                if (mutableStateFlow.emit(userToken, keychainUserTokenStorage$set$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        keychainUserTokenStorage$set$1 = new KeychainUserTokenStorage$set$1(this, continuation);
        Object obj2 = keychainUserTokenStorage$set$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = keychainUserTokenStorage$set$1.label;
        if (i != 0) {
        }
        mutableStateFlow = keychainUserTokenStorage.stateFlow;
        keychainUserTokenStorage$set$1.L$0 = null;
        keychainUserTokenStorage$set$1.L$1 = null;
        keychainUserTokenStorage$set$1.label = 2;
        if (mutableStateFlow.emit(userToken, keychainUserTokenStorage$set$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    @Override // com.ifriend.domain.storage.token.UserTokenStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clear(Continuation<? super Unit> continuation) {
        KeychainUserTokenStorage$clear$1 keychainUserTokenStorage$clear$1;
        Object coroutine_suspended;
        int i;
        KeychainUserTokenStorage keychainUserTokenStorage;
        MutableStateFlow<UserToken> mutableStateFlow;
        UserToken empty;
        if (continuation instanceof KeychainUserTokenStorage$clear$1) {
            keychainUserTokenStorage$clear$1 = (KeychainUserTokenStorage$clear$1) continuation;
            if ((keychainUserTokenStorage$clear$1.label & Integer.MIN_VALUE) != 0) {
                keychainUserTokenStorage$clear$1.label -= Integer.MIN_VALUE;
                Object obj = keychainUserTokenStorage$clear$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = keychainUserTokenStorage$clear$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.isInitValueFetched = false;
                    KeychainAdapter keychainAdapter = this.adapter;
                    keychainUserTokenStorage$clear$1.L$0 = this;
                    keychainUserTokenStorage$clear$1.label = 1;
                    if (keychainAdapter.resetPassword(keychainUserTokenStorage$clear$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    keychainUserTokenStorage = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    keychainUserTokenStorage = (KeychainUserTokenStorage) keychainUserTokenStorage$clear$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableStateFlow = keychainUserTokenStorage.stateFlow;
                empty = UserToken.Companion.getEMPTY();
                keychainUserTokenStorage$clear$1.L$0 = null;
                keychainUserTokenStorage$clear$1.label = 2;
                if (mutableStateFlow.emit(empty, keychainUserTokenStorage$clear$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        keychainUserTokenStorage$clear$1 = new KeychainUserTokenStorage$clear$1(this, continuation);
        Object obj2 = keychainUserTokenStorage$clear$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = keychainUserTokenStorage$clear$1.label;
        if (i != 0) {
        }
        mutableStateFlow = keychainUserTokenStorage.stateFlow;
        empty = UserToken.Companion.getEMPTY();
        keychainUserTokenStorage$clear$1.L$0 = null;
        keychainUserTokenStorage$clear$1.label = 2;
        if (mutableStateFlow.emit(empty, keychainUserTokenStorage$clear$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchToken(Continuation<? super Unit> continuation) {
        KeychainUserTokenStorage$fetchToken$1 keychainUserTokenStorage$fetchToken$1;
        Object coroutine_suspended;
        int i;
        KeychainUserTokenStorage keychainUserTokenStorage;
        String str;
        UserToken userToken;
        MutableStateFlow<UserToken> mutableStateFlow;
        KeychainUserTokenStorage keychainUserTokenStorage2;
        if (continuation instanceof KeychainUserTokenStorage$fetchToken$1) {
            keychainUserTokenStorage$fetchToken$1 = (KeychainUserTokenStorage$fetchToken$1) continuation;
            if ((keychainUserTokenStorage$fetchToken$1.label & Integer.MIN_VALUE) != 0) {
                keychainUserTokenStorage$fetchToken$1.label -= Integer.MIN_VALUE;
                Object obj = keychainUserTokenStorage$fetchToken$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = keychainUserTokenStorage$fetchToken$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    KeychainAdapter keychainAdapter = this.adapter;
                    keychainUserTokenStorage$fetchToken$1.L$0 = this;
                    keychainUserTokenStorage$fetchToken$1.label = 1;
                    obj = keychainAdapter.getPassword(keychainUserTokenStorage$fetchToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    keychainUserTokenStorage = this;
                } else if (i != 1) {
                    if (i == 2) {
                        keychainUserTokenStorage2 = (KeychainUserTokenStorage) keychainUserTokenStorage$fetchToken$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        keychainUserTokenStorage2.isInitValueFetched = true;
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    keychainUserTokenStorage = (KeychainUserTokenStorage) keychainUserTokenStorage$fetchToken$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    str = "";
                }
                userToken = new UserToken(str);
                mutableStateFlow = keychainUserTokenStorage.stateFlow;
                keychainUserTokenStorage$fetchToken$1.L$0 = keychainUserTokenStorage;
                keychainUserTokenStorage$fetchToken$1.label = 2;
                if (mutableStateFlow.emit(userToken, keychainUserTokenStorage$fetchToken$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                keychainUserTokenStorage2 = keychainUserTokenStorage;
                keychainUserTokenStorage2.isInitValueFetched = true;
                return Unit.INSTANCE;
            }
        }
        keychainUserTokenStorage$fetchToken$1 = new KeychainUserTokenStorage$fetchToken$1(this, continuation);
        Object obj2 = keychainUserTokenStorage$fetchToken$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = keychainUserTokenStorage$fetchToken$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        userToken = new UserToken(str);
        mutableStateFlow = keychainUserTokenStorage.stateFlow;
        keychainUserTokenStorage$fetchToken$1.L$0 = keychainUserTokenStorage;
        keychainUserTokenStorage$fetchToken$1.label = 2;
        if (mutableStateFlow.emit(userToken, keychainUserTokenStorage$fetchToken$1) != coroutine_suspended) {
        }
    }
}
