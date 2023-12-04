package com.ifriend.domain.logic.updates;

import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.domain.data.update.InAppUpdateRepository;
import com.ifriend.domain.models.update.UpdatePromptType;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UpdatePromptInteractor.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\u000b\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\u0015\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ifriend/domain/logic/updates/UpdatePromptInteractor;", "", "repo", "Lcom/ifriend/domain/data/update/InAppUpdateRepository;", "appConfigRepository", "Lcom/ifriend/domain/data/config/AppConfigRepository;", "(Lcom/ifriend/domain/data/update/InAppUpdateRepository;Lcom/ifriend/domain/data/config/AppConfigRepository;)V", "getActualVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCriticalVersion", "getCurrentVersion", "getDismissCount", "", "getPromptType", "Lcom/ifriend/domain/models/update/UpdatePromptType;", "availableVersionCode", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getThresholds", "", "Lkotlin/time/Duration;", "onPromptDismissed", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdatePromptInteractor {
    private final AppConfigRepository appConfigRepository;
    private final InAppUpdateRepository repo;

    @Inject
    public UpdatePromptInteractor(InAppUpdateRepository repo, AppConfigRepository appConfigRepository) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(appConfigRepository, "appConfigRepository");
        this.repo = repo;
        this.appConfigRepository = appConfigRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPromptType(int i, Continuation<? super UpdatePromptType> continuation) {
        UpdatePromptInteractor$getPromptType$1 updatePromptInteractor$getPromptType$1;
        int i2;
        UpdatePromptInteractor updatePromptInteractor;
        long longValue;
        long j;
        long longValue2;
        long j2;
        UpdatePromptInteractor updatePromptInteractor2;
        Object dismissCount;
        List list;
        int intValue;
        int i3;
        List list2;
        if (continuation instanceof UpdatePromptInteractor$getPromptType$1) {
            updatePromptInteractor$getPromptType$1 = (UpdatePromptInteractor$getPromptType$1) continuation;
            if ((updatePromptInteractor$getPromptType$1.label & Integer.MIN_VALUE) != 0) {
                updatePromptInteractor$getPromptType$1.label -= Integer.MIN_VALUE;
                Object obj = updatePromptInteractor$getPromptType$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                boolean z = true;
                switch (updatePromptInteractor$getPromptType$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        InAppUpdateRepository inAppUpdateRepository = this.repo;
                        updatePromptInteractor$getPromptType$1.L$0 = this;
                        i2 = i;
                        updatePromptInteractor$getPromptType$1.I$0 = i2;
                        updatePromptInteractor$getPromptType$1.label = 1;
                        if (inAppUpdateRepository.refresh(updatePromptInteractor$getPromptType$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        updatePromptInteractor = this;
                        updatePromptInteractor$getPromptType$1.L$0 = updatePromptInteractor;
                        updatePromptInteractor$getPromptType$1.I$0 = i2;
                        updatePromptInteractor$getPromptType$1.label = 2;
                        obj = updatePromptInteractor.getCurrentVersion(updatePromptInteractor$getPromptType$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        longValue = ((Number) obj).longValue();
                        j = 1 + longValue;
                        updatePromptInteractor$getPromptType$1.L$0 = updatePromptInteractor;
                        updatePromptInteractor$getPromptType$1.I$0 = i2;
                        updatePromptInteractor$getPromptType$1.J$0 = longValue;
                        updatePromptInteractor$getPromptType$1.J$1 = j;
                        updatePromptInteractor$getPromptType$1.label = 3;
                        obj = updatePromptInteractor.getCriticalVersion(updatePromptInteractor$getPromptType$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        longValue2 = ((Number) obj).longValue();
                        if (j <= longValue2 || longValue2 > i2) {
                            z = false;
                        }
                        if (!z) {
                            return UpdatePromptType.Immediate;
                        }
                        updatePromptInteractor$getPromptType$1.L$0 = updatePromptInteractor;
                        updatePromptInteractor$getPromptType$1.J$0 = longValue;
                        updatePromptInteractor$getPromptType$1.label = 4;
                        obj = updatePromptInteractor.getActualVersion(updatePromptInteractor$getPromptType$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j2 = longValue;
                        if (((Number) obj).longValue() > j2) {
                            return null;
                        }
                        updatePromptInteractor$getPromptType$1.L$0 = updatePromptInteractor;
                        updatePromptInteractor$getPromptType$1.label = 5;
                        obj = updatePromptInteractor.getThresholds(updatePromptInteractor$getPromptType$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        updatePromptInteractor2 = updatePromptInteractor;
                        List list3 = (List) obj;
                        InAppUpdateRepository inAppUpdateRepository2 = updatePromptInteractor2.repo;
                        updatePromptInteractor$getPromptType$1.L$0 = updatePromptInteractor2;
                        updatePromptInteractor$getPromptType$1.L$1 = list3;
                        updatePromptInteractor$getPromptType$1.label = 6;
                        dismissCount = inAppUpdateRepository2.getDismissCount(updatePromptInteractor$getPromptType$1);
                        if (dismissCount != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list = list3;
                        obj = dismissCount;
                        intValue = ((Number) obj).intValue();
                        if (intValue <= RangesKt.coerceAtLeast(CollectionsKt.getLastIndex(list), 0)) {
                            return UpdatePromptType.Immediate;
                        }
                        InAppUpdateRepository inAppUpdateRepository3 = updatePromptInteractor2.repo;
                        updatePromptInteractor$getPromptType$1.L$0 = list;
                        updatePromptInteractor$getPromptType$1.L$1 = null;
                        updatePromptInteractor$getPromptType$1.I$0 = intValue;
                        updatePromptInteractor$getPromptType$1.label = 7;
                        Object lastDismissTimestamp = inAppUpdateRepository3.getLastDismissTimestamp(updatePromptInteractor$getPromptType$1);
                        if (lastDismissTimestamp == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i3 = intValue;
                        obj = lastDismissTimestamp;
                        list2 = list;
                        Duration.Companion companion = Duration.Companion;
                        if (Duration.m8639compareToLRDsOJo(DurationKt.toDuration(System.currentTimeMillis() - ommonKt.orZero((Long) obj), DurationUnit.MILLISECONDS), ((Duration) list2.get(i3)).m8695unboximpl()) <= 0) {
                            return UpdatePromptType.Flexible;
                        }
                        return null;
                    case 1:
                        i2 = updatePromptInteractor$getPromptType$1.I$0;
                        updatePromptInteractor = (UpdatePromptInteractor) updatePromptInteractor$getPromptType$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        updatePromptInteractor$getPromptType$1.L$0 = updatePromptInteractor;
                        updatePromptInteractor$getPromptType$1.I$0 = i2;
                        updatePromptInteractor$getPromptType$1.label = 2;
                        obj = updatePromptInteractor.getCurrentVersion(updatePromptInteractor$getPromptType$1);
                        if (obj == coroutine_suspended) {
                        }
                        longValue = ((Number) obj).longValue();
                        j = 1 + longValue;
                        updatePromptInteractor$getPromptType$1.L$0 = updatePromptInteractor;
                        updatePromptInteractor$getPromptType$1.I$0 = i2;
                        updatePromptInteractor$getPromptType$1.J$0 = longValue;
                        updatePromptInteractor$getPromptType$1.J$1 = j;
                        updatePromptInteractor$getPromptType$1.label = 3;
                        obj = updatePromptInteractor.getCriticalVersion(updatePromptInteractor$getPromptType$1);
                        if (obj == coroutine_suspended) {
                        }
                        longValue2 = ((Number) obj).longValue();
                        if (j <= longValue2) {
                            break;
                        }
                        z = false;
                        if (!z) {
                        }
                        break;
                    case 2:
                        i2 = updatePromptInteractor$getPromptType$1.I$0;
                        updatePromptInteractor = (UpdatePromptInteractor) updatePromptInteractor$getPromptType$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        longValue = ((Number) obj).longValue();
                        j = 1 + longValue;
                        updatePromptInteractor$getPromptType$1.L$0 = updatePromptInteractor;
                        updatePromptInteractor$getPromptType$1.I$0 = i2;
                        updatePromptInteractor$getPromptType$1.J$0 = longValue;
                        updatePromptInteractor$getPromptType$1.J$1 = j;
                        updatePromptInteractor$getPromptType$1.label = 3;
                        obj = updatePromptInteractor.getCriticalVersion(updatePromptInteractor$getPromptType$1);
                        if (obj == coroutine_suspended) {
                        }
                        longValue2 = ((Number) obj).longValue();
                        if (j <= longValue2) {
                        }
                        z = false;
                        if (!z) {
                        }
                        break;
                    case 3:
                        long j3 = updatePromptInteractor$getPromptType$1.J$1;
                        long j4 = updatePromptInteractor$getPromptType$1.J$0;
                        i2 = updatePromptInteractor$getPromptType$1.I$0;
                        ResultKt.throwOnFailure(obj);
                        updatePromptInteractor = (UpdatePromptInteractor) updatePromptInteractor$getPromptType$1.L$0;
                        longValue = j4;
                        j = j3;
                        longValue2 = ((Number) obj).longValue();
                        if (j <= longValue2) {
                        }
                        z = false;
                        if (!z) {
                        }
                        break;
                    case 4:
                        j2 = updatePromptInteractor$getPromptType$1.J$0;
                        updatePromptInteractor = (UpdatePromptInteractor) updatePromptInteractor$getPromptType$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((Number) obj).longValue() > j2) {
                        }
                        break;
                    case 5:
                        ResultKt.throwOnFailure(obj);
                        updatePromptInteractor2 = (UpdatePromptInteractor) updatePromptInteractor$getPromptType$1.L$0;
                        List list32 = (List) obj;
                        InAppUpdateRepository inAppUpdateRepository22 = updatePromptInteractor2.repo;
                        updatePromptInteractor$getPromptType$1.L$0 = updatePromptInteractor2;
                        updatePromptInteractor$getPromptType$1.L$1 = list32;
                        updatePromptInteractor$getPromptType$1.label = 6;
                        dismissCount = inAppUpdateRepository22.getDismissCount(updatePromptInteractor$getPromptType$1);
                        if (dismissCount != coroutine_suspended) {
                        }
                        break;
                    case 6:
                        list = (List) updatePromptInteractor$getPromptType$1.L$1;
                        updatePromptInteractor2 = (UpdatePromptInteractor) updatePromptInteractor$getPromptType$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        intValue = ((Number) obj).intValue();
                        if (intValue <= RangesKt.coerceAtLeast(CollectionsKt.getLastIndex(list), 0)) {
                        }
                        break;
                    case 7:
                        i3 = updatePromptInteractor$getPromptType$1.I$0;
                        list2 = (List) updatePromptInteractor$getPromptType$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Duration.Companion companion2 = Duration.Companion;
                        if (Duration.m8639compareToLRDsOJo(DurationKt.toDuration(System.currentTimeMillis() - ommonKt.orZero((Long) obj), DurationUnit.MILLISECONDS), ((Duration) list2.get(i3)).m8695unboximpl()) <= 0) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        updatePromptInteractor$getPromptType$1 = new UpdatePromptInteractor$getPromptType$1(this, continuation);
        Object obj2 = updatePromptInteractor$getPromptType$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z2 = true;
        switch (updatePromptInteractor$getPromptType$1.label) {
        }
    }

    public final Object getDismissCount(Continuation<? super Integer> continuation) {
        return this.repo.getDismissCount(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onPromptDismissed(Continuation<? super Unit> continuation) {
        UpdatePromptInteractor$onPromptDismissed$1 updatePromptInteractor$onPromptDismissed$1;
        Object coroutine_suspended;
        int i;
        InAppUpdateRepository inAppUpdateRepository;
        long currentTimeMillis;
        if (continuation instanceof UpdatePromptInteractor$onPromptDismissed$1) {
            updatePromptInteractor$onPromptDismissed$1 = (UpdatePromptInteractor$onPromptDismissed$1) continuation;
            if ((updatePromptInteractor$onPromptDismissed$1.label & Integer.MIN_VALUE) != 0) {
                updatePromptInteractor$onPromptDismissed$1.label -= Integer.MIN_VALUE;
                Object obj = updatePromptInteractor$onPromptDismissed$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updatePromptInteractor$onPromptDismissed$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    inAppUpdateRepository = this.repo;
                    updatePromptInteractor$onPromptDismissed$1.L$0 = inAppUpdateRepository;
                    updatePromptInteractor$onPromptDismissed$1.label = 1;
                    if (inAppUpdateRepository.incDismissCount(updatePromptInteractor$onPromptDismissed$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    inAppUpdateRepository = (InAppUpdateRepository) updatePromptInteractor$onPromptDismissed$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                currentTimeMillis = System.currentTimeMillis();
                updatePromptInteractor$onPromptDismissed$1.L$0 = null;
                updatePromptInteractor$onPromptDismissed$1.label = 2;
                if (inAppUpdateRepository.setLastDismissTimestamp(currentTimeMillis, updatePromptInteractor$onPromptDismissed$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        updatePromptInteractor$onPromptDismissed$1 = new UpdatePromptInteractor$onPromptDismissed$1(this, continuation);
        Object obj2 = updatePromptInteractor$onPromptDismissed$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatePromptInteractor$onPromptDismissed$1.label;
        if (i != 0) {
        }
        currentTimeMillis = System.currentTimeMillis();
        updatePromptInteractor$onPromptDismissed$1.L$0 = null;
        updatePromptInteractor$onPromptDismissed$1.label = 2;
        if (inAppUpdateRepository.setLastDismissTimestamp(currentTimeMillis, updatePromptInteractor$onPromptDismissed$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCurrentVersion(Continuation<? super Long> continuation) {
        UpdatePromptInteractor$getCurrentVersion$1 updatePromptInteractor$getCurrentVersion$1;
        int i;
        if (continuation instanceof UpdatePromptInteractor$getCurrentVersion$1) {
            updatePromptInteractor$getCurrentVersion$1 = (UpdatePromptInteractor$getCurrentVersion$1) continuation;
            if ((updatePromptInteractor$getCurrentVersion$1.label & Integer.MIN_VALUE) != 0) {
                updatePromptInteractor$getCurrentVersion$1.label -= Integer.MIN_VALUE;
                Object obj = updatePromptInteractor$getCurrentVersion$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updatePromptInteractor$getCurrentVersion$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppConfigRepository appConfigRepository = this.appConfigRepository;
                    updatePromptInteractor$getCurrentVersion$1.label = 1;
                    obj = appConfigRepository.getVersionLongValue(ConfigKeys.APP_VERSION_CODE, updatePromptInteractor$getCurrentVersion$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxLong(ommonKt.orZero((Long) obj));
            }
        }
        updatePromptInteractor$getCurrentVersion$1 = new UpdatePromptInteractor$getCurrentVersion$1(this, continuation);
        Object obj2 = updatePromptInteractor$getCurrentVersion$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatePromptInteractor$getCurrentVersion$1.label;
        if (i != 0) {
        }
        return Boxing.boxLong(ommonKt.orZero((Long) obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCriticalVersion(Continuation<? super Long> continuation) {
        UpdatePromptInteractor$getCriticalVersion$1 updatePromptInteractor$getCriticalVersion$1;
        int i;
        if (continuation instanceof UpdatePromptInteractor$getCriticalVersion$1) {
            updatePromptInteractor$getCriticalVersion$1 = (UpdatePromptInteractor$getCriticalVersion$1) continuation;
            if ((updatePromptInteractor$getCriticalVersion$1.label & Integer.MIN_VALUE) != 0) {
                updatePromptInteractor$getCriticalVersion$1.label -= Integer.MIN_VALUE;
                Object obj = updatePromptInteractor$getCriticalVersion$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updatePromptInteractor$getCriticalVersion$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppConfigRepository appConfigRepository = this.appConfigRepository;
                    updatePromptInteractor$getCriticalVersion$1.label = 1;
                    obj = appConfigRepository.getVersionLongValue(ConfigKeys.CRITICAL, updatePromptInteractor$getCriticalVersion$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxLong(ommonKt.orZero((Long) obj));
            }
        }
        updatePromptInteractor$getCriticalVersion$1 = new UpdatePromptInteractor$getCriticalVersion$1(this, continuation);
        Object obj2 = updatePromptInteractor$getCriticalVersion$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatePromptInteractor$getCriticalVersion$1.label;
        if (i != 0) {
        }
        return Boxing.boxLong(ommonKt.orZero((Long) obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getActualVersion(Continuation<? super Long> continuation) {
        UpdatePromptInteractor$getActualVersion$1 updatePromptInteractor$getActualVersion$1;
        int i;
        if (continuation instanceof UpdatePromptInteractor$getActualVersion$1) {
            updatePromptInteractor$getActualVersion$1 = (UpdatePromptInteractor$getActualVersion$1) continuation;
            if ((updatePromptInteractor$getActualVersion$1.label & Integer.MIN_VALUE) != 0) {
                updatePromptInteractor$getActualVersion$1.label -= Integer.MIN_VALUE;
                Object obj = updatePromptInteractor$getActualVersion$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updatePromptInteractor$getActualVersion$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppConfigRepository appConfigRepository = this.appConfigRepository;
                    updatePromptInteractor$getActualVersion$1.label = 1;
                    obj = appConfigRepository.getVersionLongValue(ConfigKeys.ACTUAL, updatePromptInteractor$getActualVersion$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxLong(ommonKt.orZero((Long) obj));
            }
        }
        updatePromptInteractor$getActualVersion$1 = new UpdatePromptInteractor$getActualVersion$1(this, continuation);
        Object obj2 = updatePromptInteractor$getActualVersion$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatePromptInteractor$getActualVersion$1.label;
        if (i != 0) {
        }
        return Boxing.boxLong(ommonKt.orZero((Long) obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getThresholds(Continuation<? super List<Duration>> continuation) {
        UpdatePromptInteractor$getThresholds$1 updatePromptInteractor$getThresholds$1;
        int i;
        String str;
        ArrayList arrayList;
        List<String> split$default;
        if (continuation instanceof UpdatePromptInteractor$getThresholds$1) {
            updatePromptInteractor$getThresholds$1 = (UpdatePromptInteractor$getThresholds$1) continuation;
            if ((updatePromptInteractor$getThresholds$1.label & Integer.MIN_VALUE) != 0) {
                updatePromptInteractor$getThresholds$1.label -= Integer.MIN_VALUE;
                Object obj = updatePromptInteractor$getThresholds$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updatePromptInteractor$getThresholds$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AppConfigRepository appConfigRepository = this.appConfigRepository;
                    updatePromptInteractor$getThresholds$1.label = 1;
                    obj = appConfigRepository.getFeatureStringValue(ConfigKeys.FEATURE, ConfigKeys.IN_APP_UPDATES_THRESHOLDS, updatePromptInteractor$getThresholds$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null || (split$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : split$default) {
                        Long longOrNull = StringsKt.toLongOrNull(str2);
                        if (longOrNull != null) {
                            arrayList2.add(longOrNull);
                        }
                    }
                    ArrayList<Number> arrayList3 = arrayList2;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                    for (Number number : arrayList3) {
                        long longValue = number.longValue();
                        Duration.Companion companion = Duration.Companion;
                        arrayList4.add(Duration.m8638boximpl(DurationKt.toDuration(longValue, DurationUnit.SECONDS)));
                    }
                    arrayList = arrayList4;
                }
                return arrayList != null ? CollectionsKt.emptyList() : arrayList;
            }
        }
        updatePromptInteractor$getThresholds$1 = new UpdatePromptInteractor$getThresholds$1(this, continuation);
        Object obj2 = updatePromptInteractor$getThresholds$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatePromptInteractor$getThresholds$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        arrayList = null;
        if (arrayList != null) {
        }
    }
}
