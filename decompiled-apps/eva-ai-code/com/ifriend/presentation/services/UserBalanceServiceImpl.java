package com.ifriend.presentation.services;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.socket.MessagesSource;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
/* compiled from: UserBalanceService.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ifriend/presentation/services/UserBalanceServiceImpl;", "Lcom/ifriend/presentation/services/UserBalanceService;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "userBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/socket/MessagesSource;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/user/UserBalanceRepository;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "messagesSourceJob", "Lkotlinx/coroutines/Job;", "updateBalanceJob", "cancelJobs", "", TtmlNode.START, "stop", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserBalanceServiceImpl implements UserBalanceService, CoroutineScope {
    public static final int $stable = 8;
    private final AnalyticsInteractor analyticsInteractor;
    private final CoroutineScope coroutineScope;
    private final DispatcherProvider dispatcherProvider;
    private final MessagesSource messagesSource;
    private Job messagesSourceJob;
    private Job updateBalanceJob;
    private final UserBalanceRepository userBalanceRepository;
    private final UserRepository userRepository;

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Inject
    public UserBalanceServiceImpl(CoroutineScope coroutineScope, MessagesSource messagesSource, DispatcherProvider dispatcherProvider, AnalyticsInteractor analyticsInteractor, UserRepository userRepository, UserBalanceRepository userBalanceRepository) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userBalanceRepository, "userBalanceRepository");
        this.coroutineScope = coroutineScope;
        this.messagesSource = messagesSource;
        this.dispatcherProvider = dispatcherProvider;
        this.analyticsInteractor = analyticsInteractor;
        this.userRepository = userRepository;
        this.userBalanceRepository = userBalanceRepository;
    }

    @Override // com.ifriend.presentation.services.UserBalanceService
    public void start() {
        cancelJobs();
        UserBalanceServiceImpl userBalanceServiceImpl = this;
        this.messagesSourceJob = CoroutinesKt.safeLaunch$default(userBalanceServiceImpl, new UserBalanceServiceImpl$start$1(this, null), null, new UserBalanceServiceImpl$start$2(this, null), 2, null);
        this.updateBalanceJob = CoroutinesKt.safeLaunch$default(userBalanceServiceImpl, new UserBalanceServiceImpl$start$3(this, null), null, new UserBalanceServiceImpl$start$4(this, null), 2, null);
    }

    @Override // com.ifriend.presentation.services.UserBalanceService
    public void stop() {
        cancelJobs();
    }

    private final void cancelJobs() {
        Job job = this.messagesSourceJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.updateBalanceJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }
}
