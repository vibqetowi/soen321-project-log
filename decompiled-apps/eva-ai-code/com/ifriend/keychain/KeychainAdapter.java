package com.ifriend.keychain;

import android.content.Context;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: KeychainAdapter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u001e\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ifriend/keychain/KeychainAdapter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "booleanTransform", "Lkotlin/Function1;", "", "keychainModule", "Lcom/ifriend/keychain/KeychainModule;", "kotlin.jvm.PlatformType", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "passwordTransform", "", "getGenericPassword", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "alias", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPassword", "resetPassword", "setPassword", "password", "Companion", "ContinuationPromise", "KeychainException", "keychain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeychainAdapter {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "KeychainAdapter";
    private final Function1<Object, Boolean> booleanTransform;
    private final KeychainModule keychainModule;
    private final Mutex mutex;
    private final Function1<Object, String> passwordTransform;

    public KeychainAdapter(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.keychainModule = KeychainModule.withWarming(context);
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.booleanTransform = KeychainAdapter$booleanTransform$1.INSTANCE;
        this.passwordTransform = KeychainAdapter$passwordTransform$1.INSTANCE;
    }

    /* compiled from: KeychainAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/keychain/KeychainAdapter$Companion;", "", "()V", "TAG", "", "keychain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #0 {all -> 0x003f, blocks: (B:13:0x003a, B:24:0x0072, B:26:0x00ac), top: B:33:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setPassword(String str, Continuation<? super Boolean> continuation) {
        KeychainAdapter$setPassword$1 keychainAdapter$setPassword$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        KeychainAdapter keychainAdapter;
        String str2;
        Mutex mutex;
        try {
            if (continuation instanceof KeychainAdapter$setPassword$1) {
                keychainAdapter$setPassword$1 = (KeychainAdapter$setPassword$1) continuation;
                if ((keychainAdapter$setPassword$1.label & Integer.MIN_VALUE) != 0) {
                    keychainAdapter$setPassword$1.label -= Integer.MIN_VALUE;
                    obj = keychainAdapter$setPassword$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = keychainAdapter$setPassword$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.mutex;
                        keychainAdapter$setPassword$1.L$0 = this;
                        keychainAdapter$setPassword$1.L$1 = str;
                        keychainAdapter$setPassword$1.L$2 = mutex2;
                        keychainAdapter$setPassword$1.label = 1;
                        if (mutex2.lock(null, keychainAdapter$setPassword$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        keychainAdapter = this;
                        str2 = str;
                        mutex = mutex2;
                    } else if (i != 1) {
                        if (i == 2) {
                            KeychainAdapter$setPassword$1 keychainAdapter$setPassword$12 = (KeychainAdapter$setPassword$1) keychainAdapter$setPassword$1.L$3;
                            mutex = (Mutex) keychainAdapter$setPassword$1.L$2;
                            String str3 = (String) keychainAdapter$setPassword$1.L$1;
                            KeychainAdapter keychainAdapter2 = (KeychainAdapter) keychainAdapter$setPassword$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            mutex.unlock(null);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        mutex = (Mutex) keychainAdapter$setPassword$1.L$2;
                        keychainAdapter = (KeychainAdapter) keychainAdapter$setPassword$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str2 = (String) keychainAdapter$setPassword$1.L$1;
                    }
                    keychainAdapter$setPassword$1.L$0 = keychainAdapter;
                    keychainAdapter$setPassword$1.L$1 = str2;
                    keychainAdapter$setPassword$1.L$2 = mutex;
                    keychainAdapter$setPassword$1.L$3 = keychainAdapter$setPassword$1;
                    keychainAdapter$setPassword$1.label = 2;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(keychainAdapter$setPassword$1));
                    keychainAdapter.keychainModule.setGenericPassword("com.ifriend.credentials", "user-token", str2, MapsKt.emptyMap(), new ContinuationPromise(safeContinuation, keychainAdapter.booleanTransform));
                    obj = safeContinuation.getOrThrow();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(keychainAdapter$setPassword$1);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex.unlock(null);
                    return obj;
                }
            }
            if (i != 0) {
            }
            keychainAdapter$setPassword$1.L$0 = keychainAdapter;
            keychainAdapter$setPassword$1.L$1 = str2;
            keychainAdapter$setPassword$1.L$2 = mutex;
            keychainAdapter$setPassword$1.L$3 = keychainAdapter$setPassword$1;
            keychainAdapter$setPassword$1.label = 2;
            SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(keychainAdapter$setPassword$1));
            keychainAdapter.keychainModule.setGenericPassword("com.ifriend.credentials", "user-token", str2, MapsKt.emptyMap(), new ContinuationPromise(safeContinuation2, keychainAdapter.booleanTransform));
            obj = safeContinuation2.getOrThrow();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (obj == coroutine_suspended) {
            }
            mutex.unlock(null);
            return obj;
        } catch (Throwable th) {
            str.unlock(null);
            throw th;
        }
        keychainAdapter$setPassword$1 = new KeychainAdapter$setPassword$1(this, continuation);
        obj = keychainAdapter$setPassword$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = keychainAdapter$setPassword$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getGenericPassword(String str, Continuation<? super String> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        this.keychainModule.getGenericPassword(str, MapsKt.emptyMap(), new ContinuationPromise(safeContinuation, this.passwordTransform));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getGenericPassword(Continuation<? super String> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        this.keychainModule.getGenericPasswordForOptions(MapsKt.emptyMap(), new ContinuationPromise(safeContinuation, this.passwordTransform));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:24:0x0064, B:26:0x0095), top: B:36:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resetPassword(Continuation<? super Boolean> continuation) {
        KeychainAdapter$resetPassword$1 keychainAdapter$resetPassword$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        KeychainAdapter keychainAdapter;
        Mutex mutex2;
        Throwable th;
        Object orThrow;
        try {
            if (continuation instanceof KeychainAdapter$resetPassword$1) {
                keychainAdapter$resetPassword$1 = (KeychainAdapter$resetPassword$1) continuation;
                if ((keychainAdapter$resetPassword$1.label & Integer.MIN_VALUE) != 0) {
                    keychainAdapter$resetPassword$1.label -= Integer.MIN_VALUE;
                    Object obj = keychainAdapter$resetPassword$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = keychainAdapter$resetPassword$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.mutex;
                        keychainAdapter$resetPassword$1.L$0 = this;
                        keychainAdapter$resetPassword$1.L$1 = mutex;
                        keychainAdapter$resetPassword$1.label = 1;
                        if (mutex.lock(null, keychainAdapter$resetPassword$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        keychainAdapter = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            KeychainAdapter$resetPassword$1 keychainAdapter$resetPassword$12 = (KeychainAdapter$resetPassword$1) keychainAdapter$resetPassword$1.L$2;
                            mutex2 = (Mutex) keychainAdapter$resetPassword$1.L$1;
                            KeychainAdapter keychainAdapter2 = (KeychainAdapter) keychainAdapter$resetPassword$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        keychainAdapter = (KeychainAdapter) keychainAdapter$resetPassword$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = (Mutex) keychainAdapter$resetPassword$1.L$1;
                    }
                    keychainAdapter$resetPassword$1.L$0 = keychainAdapter;
                    keychainAdapter$resetPassword$1.L$1 = mutex;
                    keychainAdapter$resetPassword$1.L$2 = keychainAdapter$resetPassword$1;
                    keychainAdapter$resetPassword$1.label = 2;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(keychainAdapter$resetPassword$1));
                    keychainAdapter.keychainModule.resetGenericPassword("com.ifriend.credentials", new ContinuationPromise(safeContinuation, keychainAdapter.booleanTransform));
                    orThrow = safeContinuation.getOrThrow();
                    if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(keychainAdapter$resetPassword$1);
                    }
                    if (orThrow != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    obj = orThrow;
                    mutex2.unlock(null);
                    return obj;
                }
            }
            keychainAdapter$resetPassword$1.L$0 = keychainAdapter;
            keychainAdapter$resetPassword$1.L$1 = mutex;
            keychainAdapter$resetPassword$1.L$2 = keychainAdapter$resetPassword$1;
            keychainAdapter$resetPassword$1.label = 2;
            SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(keychainAdapter$resetPassword$1));
            keychainAdapter.keychainModule.resetGenericPassword("com.ifriend.credentials", new ContinuationPromise(safeContinuation2, keychainAdapter.booleanTransform));
            orThrow = safeContinuation2.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (orThrow != coroutine_suspended) {
            }
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        keychainAdapter$resetPassword$1 = new KeychainAdapter$resetPassword$1(this, continuation);
        Object obj2 = keychainAdapter$resetPassword$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = keychainAdapter$resetPassword$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|(1:(1:(3:(1:(6:12|13|14|15|16|17)(2:23|24))(8:25|26|27|28|29|(2:32|(1:34)(2:35|15))|16|17)|21|22)(5:42|43|44|45|(1:47)(5:48|29|(2:32|(0)(0))|16|17)))(1:49))(2:58|(1:60)(1:61))|50|51|(1:53)(3:54|45|(0)(0))))|62|6|(0)(0)|50|51|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d4, code lost:
        r0 = r10;
        r10 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPassword(Continuation<? super String> continuation) {
        KeychainAdapter$getPassword$1 keychainAdapter$getPassword$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        KeychainAdapter keychainAdapter;
        Mutex mutex2;
        Throwable th;
        Object genericPassword;
        KeychainAdapter keychainAdapter2;
        Mutex mutex3;
        Object genericPassword2;
        String str;
        String str2;
        String str3;
        if (continuation instanceof KeychainAdapter$getPassword$1) {
            keychainAdapter$getPassword$1 = (KeychainAdapter$getPassword$1) continuation;
            if ((keychainAdapter$getPassword$1.label & Integer.MIN_VALUE) != 0) {
                keychainAdapter$getPassword$1.label -= Integer.MIN_VALUE;
                Object obj = keychainAdapter$getPassword$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = keychainAdapter$getPassword$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = this.mutex;
                    keychainAdapter$getPassword$1.L$0 = this;
                    keychainAdapter$getPassword$1.L$1 = mutex;
                    keychainAdapter$getPassword$1.label = 1;
                    if (mutex.lock(null, keychainAdapter$getPassword$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    keychainAdapter = this;
                } else if (i == 1) {
                    keychainAdapter = (KeychainAdapter) keychainAdapter$getPassword$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = (Mutex) keychainAdapter$getPassword$1.L$1;
                } else if (i != 2) {
                    if (i == 3) {
                        String str4 = (String) keychainAdapter$getPassword$1.L$2;
                        Mutex mutex4 = (Mutex) keychainAdapter$getPassword$1.L$1;
                        keychainAdapter2 = (KeychainAdapter) keychainAdapter$getPassword$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str = str4;
                            mutex3 = mutex4;
                            str2 = (String) obj;
                            if (str2 != null && str == null) {
                                keychainAdapter$getPassword$1.L$0 = mutex3;
                                keychainAdapter$getPassword$1.L$1 = str2;
                                keychainAdapter$getPassword$1.L$2 = null;
                                keychainAdapter$getPassword$1.label = 4;
                                if (keychainAdapter2.setPassword(str2, keychainAdapter$getPassword$1) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str3 = str2;
                                mutex2 = mutex3;
                                mutex3 = mutex2;
                                str = str3;
                            }
                            mutex3.unlock(null);
                            return str;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2 = mutex4;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        str3 = (String) keychainAdapter$getPassword$1.L$1;
                        mutex2 = (Mutex) keychainAdapter$getPassword$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            mutex3 = mutex2;
                            str = str3;
                            mutex3.unlock(null);
                            return str;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    mutex2.unlock(null);
                    throw th;
                } else {
                    mutex3 = (Mutex) keychainAdapter$getPassword$1.L$1;
                    keychainAdapter2 = (KeychainAdapter) keychainAdapter$getPassword$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        String str5 = (String) obj;
                        keychainAdapter$getPassword$1.L$0 = keychainAdapter2;
                        keychainAdapter$getPassword$1.L$1 = mutex3;
                        keychainAdapter$getPassword$1.L$2 = str5;
                        keychainAdapter$getPassword$1.label = 3;
                        genericPassword2 = keychainAdapter2.getGenericPassword(keychainAdapter$getPassword$1);
                        if (genericPassword2 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = str5;
                        obj = genericPassword2;
                        str2 = (String) obj;
                        if (str2 != null) {
                            keychainAdapter$getPassword$1.L$0 = mutex3;
                            keychainAdapter$getPassword$1.L$1 = str2;
                            keychainAdapter$getPassword$1.L$2 = null;
                            keychainAdapter$getPassword$1.label = 4;
                            if (keychainAdapter2.setPassword(str2, keychainAdapter$getPassword$1) != coroutine_suspended) {
                            }
                        }
                        mutex3.unlock(null);
                        return str;
                    } catch (Throwable th4) {
                        th = th4;
                        mutex2 = mutex3;
                    }
                }
                keychainAdapter$getPassword$1.L$0 = keychainAdapter;
                keychainAdapter$getPassword$1.L$1 = mutex;
                keychainAdapter$getPassword$1.label = 2;
                genericPassword = keychainAdapter.getGenericPassword("com.ifriend.credentials", keychainAdapter$getPassword$1);
                if (genericPassword != coroutine_suspended) {
                    return coroutine_suspended;
                }
                keychainAdapter2 = keychainAdapter;
                mutex3 = mutex;
                obj = genericPassword;
                String str52 = (String) obj;
                keychainAdapter$getPassword$1.L$0 = keychainAdapter2;
                keychainAdapter$getPassword$1.L$1 = mutex3;
                keychainAdapter$getPassword$1.L$2 = str52;
                keychainAdapter$getPassword$1.label = 3;
                genericPassword2 = keychainAdapter2.getGenericPassword(keychainAdapter$getPassword$1);
                if (genericPassword2 != coroutine_suspended) {
                }
            }
        }
        keychainAdapter$getPassword$1 = new KeychainAdapter$getPassword$1(this, continuation);
        Object obj2 = keychainAdapter$getPassword$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = keychainAdapter$getPassword$1.label;
        if (i != 0) {
        }
        keychainAdapter$getPassword$1.L$0 = keychainAdapter;
        keychainAdapter$getPassword$1.L$1 = mutex;
        keychainAdapter$getPassword$1.label = 2;
        genericPassword = keychainAdapter.getGenericPassword("com.ifriend.credentials", keychainAdapter$getPassword$1);
        if (genericPassword != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KeychainAdapter.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B-\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ,\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ifriend/keychain/KeychainAdapter$ContinuationPromise;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/keychain/Promise;", "", "continuation", "Lkotlin/coroutines/Continuation;", "transformer", "Lkotlin/Function1;", "(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)V", "getContinuation", "()Lkotlin/coroutines/Continuation;", "getTransformer", "()Lkotlin/jvm/functions/Function1;", "fail", "", "code", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "reason", "", "reject", "e", "resolve", "value", "keychain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ContinuationPromise<T> implements Promise<Object> {
        private final Continuation<T> continuation;
        private final Function1<Object, T> transformer;

        /* JADX WARN: Multi-variable type inference failed */
        public ContinuationPromise(Continuation<? super T> continuation, Function1<Object, ? extends T> transformer) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            Intrinsics.checkNotNullParameter(transformer, "transformer");
            this.continuation = continuation;
            this.transformer = transformer;
        }

        public final Continuation<T> getContinuation() {
            return this.continuation;
        }

        public final Function1<Object, T> getTransformer() {
            return this.transformer;
        }

        @Override // com.ifriend.keychain.Promise
        public void resolve(Object obj) {
            Continuation<T> continuation = this.continuation;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m7271constructorimpl(this.transformer.invoke(obj)));
        }

        @Override // com.ifriend.keychain.Promise
        public void reject(String str, String str2) {
            fail$default(this, str, str2, null, 4, null);
        }

        @Override // com.ifriend.keychain.Promise
        public void reject(String str, Throwable th) {
            fail$default(this, str, null, th, 2, null);
        }

        @Override // com.ifriend.keychain.Promise
        public void reject(String str, String str2, Throwable th) {
            fail(str, str2, th);
        }

        @Override // com.ifriend.keychain.Promise
        public void reject(String str) {
            fail$default(this, null, str, null, 5, null);
        }

        @Override // com.ifriend.keychain.Promise
        public void reject(Throwable th) {
            fail$default(this, null, null, th, 3, null);
        }

        static /* synthetic */ void fail$default(ContinuationPromise continuationPromise, String str, String str2, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                th = null;
            }
            continuationPromise.fail(str, str2, th);
        }

        private final void fail(String str, String str2, Throwable th) {
            Continuation<T> continuation = this.continuation;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m7271constructorimpl(null));
            String message = new KeychainException(str, str2, th).getMessage();
            if (message == null) {
                message = "Exception in Keychain";
            }
            Log.e(KeychainAdapter.TAG, message);
        }
    }

    /* compiled from: KeychainAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ifriend/keychain/KeychainAdapter$KeychainException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "keychainMessage", "reason", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "keychain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class KeychainException extends Exception {
        public KeychainException() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ KeychainException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th);
        }

        public KeychainException(String str, String str2, Throwable th) {
            super("Error while interacting with keychain:\ncode=" + str + "\nmessage=" + str2, th);
        }
    }
}
