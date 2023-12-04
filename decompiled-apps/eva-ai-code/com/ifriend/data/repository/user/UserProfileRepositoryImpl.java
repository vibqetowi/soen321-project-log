package com.ifriend.data.repository.user;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.common_utils.Constants;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.domain.data.user.UserProfileRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: UserProfileRepositoryImpl.kt */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\r\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0015H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u0016J@\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017¢\u0006\u0002\b\u001bH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001f\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0019\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0011\u0010$\u001a\u00020%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0011\u0010&\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0019\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020%H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)R\u000e\u0010\n\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/ifriend/data/repository/user/UserProfileRepositoryImpl;", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "coreExecuteCatching", "(Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/data/Preferences;Landroidx/datastore/core/DataStore;Lcom/ifriend/data/common/CoreExecuteCatching;)V", "onboardingDataSubmitted", "com/ifriend/data/repository/user/UserProfileRepositoryImpl$onboardingDataSubmitted$1", "Lcom/ifriend/data/repository/user/UserProfileRepositoryImpl$onboardingDataSubmitted$1;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchaseCount", "", "getPurchaseTotal", "", "incPurchaseTotal", "amount", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isOnboardingDataSubmitted", "", "purchaseCountInc", "setOnboardingDataSubmitted", "isSubmitted", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserProfileRepositoryImpl implements UserProfileRepository, CoreExecuteCatching {
    private final CoreExecuteCatching coreExecuteCatching;
    private final DataStore<Preferences> dataStore;
    private final DispatcherProvider dispatcherProvider;
    private final UserProfileRepositoryImpl$onboardingDataSubmitted$1 onboardingDataSubmitted;
    private final com.ifriend.domain.data.Preferences preferences;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public UserProfileRepositoryImpl(DispatcherProvider dispatcherProvider, com.ifriend.domain.data.Preferences preferences, DataStore<Preferences> dataStore, CoreExecuteCatching coreExecuteCatching) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        this.dispatcherProvider = dispatcherProvider;
        this.preferences = preferences;
        this.dataStore = dataStore;
        this.coreExecuteCatching = coreExecuteCatching;
        this.onboardingDataSubmitted = new UserProfileRepositoryImpl$onboardingDataSubmitted$1(this);
    }

    @Override // com.ifriend.domain.data.user.UserProfileRepository
    public Object clear(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatcherProvider.background().plus(this.dispatcherProvider.nonCancellable()), new UserProfileRepositoryImpl$clear$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.user.UserProfileRepository
    public Object setOnboardingDataSubmitted(boolean z, Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new UserProfileRepositoryImpl$setOnboardingDataSubmitted$2(this, z, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.user.UserProfileRepository
    public Object getPurchaseCount(Continuation<? super Integer> continuation) {
        return executeInBackground(new UserProfileRepositoryImpl$getPurchaseCount$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.user.UserProfileRepository
    public Object purchaseCountInc(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new UserProfileRepositoryImpl$purchaseCountInc$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.user.UserProfileRepository
    public Object getPurchaseTotal(Continuation<? super Float> continuation) {
        return Boxing.boxFloat(this.preferences.getFloatWithKey(Constants.PURCHASE_TOTAL));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // com.ifriend.domain.data.user.UserProfileRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object incPurchaseTotal(float f, Continuation<? super Unit> continuation) {
        UserProfileRepositoryImpl$incPurchaseTotal$1 userProfileRepositoryImpl$incPurchaseTotal$1;
        int i;
        String str;
        com.ifriend.domain.data.Preferences preferences;
        if (continuation instanceof UserProfileRepositoryImpl$incPurchaseTotal$1) {
            userProfileRepositoryImpl$incPurchaseTotal$1 = (UserProfileRepositoryImpl$incPurchaseTotal$1) continuation;
            if ((userProfileRepositoryImpl$incPurchaseTotal$1.label & Integer.MIN_VALUE) != 0) {
                userProfileRepositoryImpl$incPurchaseTotal$1.label -= Integer.MIN_VALUE;
                Object obj = userProfileRepositoryImpl$incPurchaseTotal$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userProfileRepositoryImpl$incPurchaseTotal$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    com.ifriend.domain.data.Preferences preferences2 = this.preferences;
                    userProfileRepositoryImpl$incPurchaseTotal$1.L$0 = preferences2;
                    userProfileRepositoryImpl$incPurchaseTotal$1.L$1 = Constants.PURCHASE_TOTAL;
                    userProfileRepositoryImpl$incPurchaseTotal$1.F$0 = f;
                    userProfileRepositoryImpl$incPurchaseTotal$1.label = 1;
                    Object purchaseTotal = getPurchaseTotal(userProfileRepositoryImpl$incPurchaseTotal$1);
                    if (purchaseTotal == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = Constants.PURCHASE_TOTAL;
                    preferences = preferences2;
                    obj = purchaseTotal;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    f = userProfileRepositoryImpl$incPurchaseTotal$1.F$0;
                    str = (String) userProfileRepositoryImpl$incPurchaseTotal$1.L$1;
                    preferences = (com.ifriend.domain.data.Preferences) userProfileRepositoryImpl$incPurchaseTotal$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                preferences.saveFloatWithKey(str, Boxing.boxFloat(((Number) obj).floatValue() + f));
                return Unit.INSTANCE;
            }
        }
        userProfileRepositoryImpl$incPurchaseTotal$1 = new UserProfileRepositoryImpl$incPurchaseTotal$1(this, continuation);
        Object obj2 = userProfileRepositoryImpl$incPurchaseTotal$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userProfileRepositoryImpl$incPurchaseTotal$1.label;
        if (i != 0) {
        }
        preferences.saveFloatWithKey(str, Boxing.boxFloat(((Number) obj2).floatValue() + f));
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.user.UserProfileRepository
    public Object isOnboardingDataSubmitted(Continuation<? super Boolean> continuation) {
        return executeInBackground(new UserProfileRepositoryImpl$isOnboardingDataSubmitted$2(this, null), continuation);
    }
}
