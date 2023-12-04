package io.grpc.grpclb;

import androidx.core.app.NotificationCompat;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.protobuf.util.Durations;
import io.grpc.Attributes;
import io.grpc.ChannelLogger;
import io.grpc.ClientStreamTracer;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.EquivalentAddressGroup;
import io.grpc.LoadBalancer;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.grpclb.SubchannelPool;
import io.grpc.internal.BackoffPolicy;
import io.grpc.internal.TimeProvider;
import io.grpc.lb.v1.InitialLoadBalanceRequest;
import io.grpc.lb.v1.LoadBalanceRequest;
import io.grpc.lb.v1.LoadBalanceResponse;
import io.grpc.lb.v1.LoadBalancerGrpc;
import io.grpc.lb.v1.Server;
import io.grpc.lb.v1.ServerList;
import io.grpc.stub.StreamObserver;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GrpclbState {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final BackoffPolicy.Provider backoffPolicyProvider;
    private boolean balancerWorking;
    private final GrpclbConfig config;
    @Nullable
    private SynchronizationContext.ScheduledHandle fallbackTimer;
    private final LoadBalancer.Helper helper;
    @Nullable
    private ManagedChannel lbCommChannel;
    @Nullable
    private BackoffPolicy lbRpcRetryPolicy;
    @Nullable
    private SynchronizationContext.ScheduledHandle lbRpcRetryTimer;
    @Nullable
    private LbStream lbStream;
    private final ChannelLogger logger;
    private boolean requestConnectionPending;
    private final String serviceName;
    private final Stopwatch stopwatch;
    @Nullable
    private final SubchannelPool subchannelPool;
    private final SynchronizationContext syncContext;
    private final TimeProvider time;
    private final ScheduledExecutorService timerService;
    private boolean usingFallbackBackends;
    static final long FALLBACK_TIMEOUT_MS = TimeUnit.SECONDS.toMillis(10);
    private static final Attributes LB_PROVIDED_BACKEND_ATTRS = Attributes.newBuilder().set(GrpclbConstants.ATTR_LB_PROVIDED_BACKEND, true).build();
    static final LoadBalancer.PickResult DROP_PICK_RESULT = LoadBalancer.PickResult.withDrop(Status.UNAVAILABLE.withDescription("Dropped as requested by balancer"));
    static final Status NO_AVAILABLE_BACKENDS_STATUS = Status.UNAVAILABLE.withDescription("LoadBalancer responded without any backends");
    static final RoundRobinEntry BUFFER_ENTRY = new RoundRobinEntry() { // from class: io.grpc.grpclb.GrpclbState.1
        public String toString() {
            return "BUFFER_ENTRY";
        }

        @Override // io.grpc.grpclb.GrpclbState.RoundRobinEntry
        public LoadBalancer.PickResult picked(Metadata metadata) {
            return LoadBalancer.PickResult.withNoResult();
        }
    };
    private static final Attributes.Key<AtomicReference<ConnectivityStateInfo>> STATE_INFO = Attributes.Key.create("io.grpc.grpclb.GrpclbLoadBalancer.stateInfo");
    private List<EquivalentAddressGroup> fallbackBackendList = Collections.emptyList();
    private boolean lbSentEmptyBackends = false;
    private Map<List<EquivalentAddressGroup>, LoadBalancer.Subchannel> subchannels = Collections.emptyMap();
    private List<DropEntry> dropList = Collections.emptyList();
    private List<BackendEntry> backendList = Collections.emptyList();
    private RoundRobinPicker currentPicker = new RoundRobinPicker(Collections.emptyList(), Arrays.asList(BUFFER_ENTRY));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum Mode {
        ROUND_ROBIN,
        PICK_FIRST
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface RoundRobinEntry {
        LoadBalancer.PickResult picked(Metadata metadata);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GrpclbState(GrpclbConfig grpclbConfig, LoadBalancer.Helper helper, SubchannelPool subchannelPool, TimeProvider timeProvider, Stopwatch stopwatch, BackoffPolicy.Provider provider) {
        this.config = (GrpclbConfig) Preconditions.checkNotNull(grpclbConfig, "config");
        this.helper = (LoadBalancer.Helper) Preconditions.checkNotNull(helper, "helper");
        this.syncContext = (SynchronizationContext) Preconditions.checkNotNull(helper.getSynchronizationContext(), "syncContext");
        if (grpclbConfig.getMode() == Mode.ROUND_ROBIN) {
            this.subchannelPool = (SubchannelPool) Preconditions.checkNotNull(subchannelPool, "subchannelPool");
            subchannelPool.registerListener(new SubchannelPool.PooledSubchannelStateListener() { // from class: io.grpc.grpclb.GrpclbState.2
                @Override // io.grpc.grpclb.SubchannelPool.PooledSubchannelStateListener
                public void onSubchannelState(LoadBalancer.Subchannel subchannel, ConnectivityStateInfo connectivityStateInfo) {
                    GrpclbState.this.handleSubchannelState(subchannel, connectivityStateInfo);
                }
            });
        } else {
            this.subchannelPool = null;
        }
        this.time = (TimeProvider) Preconditions.checkNotNull(timeProvider, "time provider");
        this.stopwatch = (Stopwatch) Preconditions.checkNotNull(stopwatch, NotificationCompat.CATEGORY_STOPWATCH);
        this.timerService = (ScheduledExecutorService) Preconditions.checkNotNull(helper.getScheduledExecutorService(), "timerService");
        this.backoffPolicyProvider = (BackoffPolicy.Provider) Preconditions.checkNotNull(provider, "backoffPolicyProvider");
        if (grpclbConfig.getServiceName() != null) {
            this.serviceName = grpclbConfig.getServiceName();
        } else {
            this.serviceName = (String) Preconditions.checkNotNull(helper.getAuthority(), "helper returns null authority");
        }
        ChannelLogger channelLogger = (ChannelLogger) Preconditions.checkNotNull(helper.getChannelLogger(), "logger");
        this.logger = channelLogger;
        channelLogger.log(ChannelLogger.ChannelLogLevel.INFO, "[grpclb-<{0}>] Created", this.serviceName);
    }

    void handleSubchannelState(LoadBalancer.Subchannel subchannel, ConnectivityStateInfo connectivityStateInfo) {
        if (connectivityStateInfo.getState() == ConnectivityState.SHUTDOWN || !this.subchannels.containsValue(subchannel)) {
            return;
        }
        if (this.config.getMode() == Mode.ROUND_ROBIN && connectivityStateInfo.getState() == ConnectivityState.IDLE) {
            subchannel.requestConnection();
        }
        ((AtomicReference) subchannel.getAttributes().get(STATE_INFO)).set(connectivityStateInfo);
        maybeUseFallbackBackends();
        maybeUpdatePicker();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void handleAddresses(List<LbAddressGroup> list, List<EquivalentAddressGroup> list2) {
        this.logger.log(ChannelLogger.ChannelLogLevel.DEBUG, "[grpclb-<{0}>] Resolved addresses: lb addresses {0}, backends: {1}", this.serviceName, list, list2);
        if (list.isEmpty()) {
            shutdownLbComm();
            this.syncContext.execute(new FallbackModeTask());
        } else {
            startLbComm(flattenLbAddressGroups(list));
            if (this.lbStream == null) {
                startLbRpc();
            }
            if (this.fallbackTimer == null) {
                this.fallbackTimer = this.syncContext.schedule(new FallbackModeTask(), FALLBACK_TIMEOUT_MS, TimeUnit.MILLISECONDS, this.timerService);
            }
        }
        this.fallbackBackendList = list2;
        if (this.usingFallbackBackends) {
            useFallbackBackends();
        }
        maybeUpdatePicker();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void requestConnection() {
        this.requestConnectionPending = true;
        for (RoundRobinEntry roundRobinEntry : this.currentPicker.pickList) {
            if (roundRobinEntry instanceof IdleSubchannelEntry) {
                ((IdleSubchannelEntry) roundRobinEntry).subchannel.requestConnection();
                this.requestConnectionPending = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeUseFallbackBackends() {
        if (this.balancerWorking || this.usingFallbackBackends) {
            return;
        }
        for (LoadBalancer.Subchannel subchannel : this.subchannels.values()) {
            if (((ConnectivityStateInfo) ((AtomicReference) subchannel.getAttributes().get(STATE_INFO)).get()).getState() == ConnectivityState.READY) {
                return;
            }
        }
        useFallbackBackends();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void useFallbackBackends() {
        this.usingFallbackBackends = true;
        this.logger.log(ChannelLogger.ChannelLogLevel.INFO, "[grpclb-<{0}>] Using fallback backends", this.serviceName);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (EquivalentAddressGroup equivalentAddressGroup : this.fallbackBackendList) {
            arrayList.add(null);
            arrayList2.add(new BackendAddressGroup(equivalentAddressGroup, null));
        }
        useRoundRobinLists(arrayList, arrayList2, null);
    }

    private void shutdownLbComm() {
        ManagedChannel managedChannel = this.lbCommChannel;
        if (managedChannel != null) {
            managedChannel.shutdown();
            this.lbCommChannel = null;
        }
        shutdownLbRpc();
    }

    private void shutdownLbRpc() {
        LbStream lbStream = this.lbStream;
        if (lbStream != null) {
            lbStream.close(Status.CANCELLED.withDescription("balancer shutdown").asException());
        }
    }

    private void startLbComm(LbAddressGroup lbAddressGroup) {
        Preconditions.checkNotNull(lbAddressGroup, "lbAddressGroup");
        if (this.lbCommChannel == null) {
            this.lbCommChannel = this.helper.createOobChannel(lbAddressGroup.getAddresses(), lbAddressGroup.getAuthority());
            this.logger.log(ChannelLogger.ChannelLogLevel.DEBUG, "[grpclb-<{0}>] Created grpclb channel: address={1}, authority={2}", this.serviceName, lbAddressGroup.getAddresses(), lbAddressGroup.getAuthority());
        } else if (lbAddressGroup.getAuthority().equals(this.lbCommChannel.authority())) {
            this.helper.updateOobChannelAddresses(this.lbCommChannel, lbAddressGroup.getAddresses());
        } else {
            shutdownLbComm();
            this.lbCommChannel = this.helper.createOobChannel(lbAddressGroup.getAddresses(), lbAddressGroup.getAuthority());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLbRpc() {
        Preconditions.checkState(this.lbStream == null, "previous lbStream has not been cleared yet");
        LbStream lbStream = new LbStream(LoadBalancerGrpc.newStub(this.lbCommChannel));
        this.lbStream = lbStream;
        lbStream.start();
        this.stopwatch.reset().start();
        LoadBalanceRequest build = LoadBalanceRequest.newBuilder().setInitialRequest(InitialLoadBalanceRequest.newBuilder().setName(this.serviceName).build()).build();
        this.logger.log(ChannelLogger.ChannelLogLevel.DEBUG, "[grpclb-<{0}>] Sent initial grpclb request {1}", this.serviceName, build);
        try {
            this.lbStream.lbRequestWriter.onNext(build);
        } catch (Exception e) {
            this.lbStream.close(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelFallbackTimer() {
        SynchronizationContext.ScheduledHandle scheduledHandle = this.fallbackTimer;
        if (scheduledHandle != null) {
            scheduledHandle.cancel();
        }
    }

    private void cancelLbRpcRetryTimer() {
        SynchronizationContext.ScheduledHandle scheduledHandle = this.lbRpcRetryTimer;
        if (scheduledHandle != null) {
            scheduledHandle.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void shutdown() {
        this.logger.log(ChannelLogger.ChannelLogLevel.INFO, "[grpclb-<{0}>] Shutdown", this.serviceName);
        shutdownLbComm();
        int i = AnonymousClass4.$SwitchMap$io$grpc$grpclb$GrpclbState$Mode[this.config.getMode().ordinal()];
        if (i == 1) {
            for (LoadBalancer.Subchannel subchannel : this.subchannels.values()) {
                returnSubchannelToPool(subchannel);
            }
            this.subchannelPool.clear();
        } else if (i == 2) {
            if (!this.subchannels.isEmpty()) {
                Preconditions.checkState(this.subchannels.size() == 1, "Excessive Subchannels: %s", this.subchannels);
                this.subchannels.values().iterator().next().shutdown();
            }
        } else {
            throw new AssertionError("Missing case for " + this.config.getMode());
        }
        this.subchannels = Collections.emptyMap();
        cancelFallbackTimer();
        cancelLbRpcRetryTimer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void propagateError(Status status) {
        this.logger.log(ChannelLogger.ChannelLogLevel.DEBUG, "[grpclb-<{0}>] Error: {1}", this.serviceName, status);
        if (this.backendList.isEmpty()) {
            maybeUpdatePicker(ConnectivityState.TRANSIENT_FAILURE, new RoundRobinPicker(this.dropList, Arrays.asList(new ErrorEntry(status))));
        }
    }

    private void returnSubchannelToPool(LoadBalancer.Subchannel subchannel) {
        this.subchannelPool.returnSubchannel(subchannel, (ConnectivityStateInfo) ((AtomicReference) subchannel.getAttributes().get(STATE_INFO)).get());
    }

    @Nullable
    GrpclbClientLoadRecorder getLoadRecorder() {
        LbStream lbStream = this.lbStream;
        if (lbStream == null) {
            return null;
        }
        return lbStream.loadRecorder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void useRoundRobinLists(List<DropEntry> list, List<BackendAddressGroup> list2, @Nullable GrpclbClientLoadRecorder grpclbClientLoadRecorder) {
        BackendEntry backendEntry;
        final LoadBalancer.Subchannel next;
        this.logger.log(ChannelLogger.ChannelLogLevel.INFO, "[grpclb-<{0}>] Using RR list={1}, drop={2}", this.serviceName, list2, list);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i = AnonymousClass4.$SwitchMap$io$grpc$grpclb$GrpclbState$Mode[this.config.getMode().ordinal()];
        if (i == 1) {
            for (BackendAddressGroup backendAddressGroup : list2) {
                EquivalentAddressGroup addresses = backendAddressGroup.getAddresses();
                List singletonList = Collections.singletonList(addresses);
                LoadBalancer.Subchannel subchannel = (LoadBalancer.Subchannel) hashMap.get(singletonList);
                if (subchannel == null) {
                    subchannel = this.subchannels.get(singletonList);
                    if (subchannel == null) {
                        LoadBalancer.Subchannel takeOrCreateSubchannel = this.subchannelPool.takeOrCreateSubchannel(addresses, createSubchannelAttrs());
                        takeOrCreateSubchannel.requestConnection();
                        subchannel = takeOrCreateSubchannel;
                    }
                    hashMap.put(singletonList, subchannel);
                }
                if (backendAddressGroup.getToken() == null) {
                    backendEntry = new BackendEntry(subchannel);
                } else {
                    backendEntry = new BackendEntry(subchannel, grpclbClientLoadRecorder, backendAddressGroup.getToken());
                }
                arrayList.add(backendEntry);
            }
            for (Map.Entry<List<EquivalentAddressGroup>, LoadBalancer.Subchannel> entry : this.subchannels.entrySet()) {
                if (!hashMap.containsKey(entry.getKey())) {
                    returnSubchannelToPool(entry.getValue());
                }
            }
            this.subchannels = Collections.unmodifiableMap(hashMap);
        } else if (i == 2) {
            Preconditions.checkState(this.subchannels.size() <= 1, "Unexpected Subchannel count: %s", this.subchannels);
            if (list2.isEmpty()) {
                if (this.subchannels.size() == 1) {
                    cancelFallbackTimer();
                    this.subchannels.values().iterator().next().shutdown();
                    this.subchannels = Collections.emptyMap();
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (BackendAddressGroup backendAddressGroup2 : list2) {
                    EquivalentAddressGroup addresses2 = backendAddressGroup2.getAddresses();
                    Attributes attributes = addresses2.getAttributes();
                    if (backendAddressGroup2.getToken() != null) {
                        attributes = attributes.toBuilder().set(GrpclbConstants.TOKEN_ATTRIBUTE_KEY, backendAddressGroup2.getToken()).build();
                    }
                    arrayList2.add(new EquivalentAddressGroup(addresses2.getAddresses(), attributes));
                }
                if (this.subchannels.isEmpty()) {
                    next = this.helper.createSubchannel(LoadBalancer.CreateSubchannelArgs.newBuilder().setAddresses(arrayList2).setAttributes(createSubchannelAttrs()).build());
                    next.start(new LoadBalancer.SubchannelStateListener() { // from class: io.grpc.grpclb.GrpclbState.3
                        @Override // io.grpc.LoadBalancer.SubchannelStateListener
                        public void onSubchannelState(ConnectivityStateInfo connectivityStateInfo) {
                            GrpclbState.this.handleSubchannelState(next, connectivityStateInfo);
                        }
                    });
                    if (this.requestConnectionPending) {
                        next.requestConnection();
                        this.requestConnectionPending = false;
                    }
                } else {
                    next = this.subchannels.values().iterator().next();
                    next.updateAddresses(arrayList2);
                }
                this.subchannels = Collections.singletonMap(arrayList2, next);
                arrayList.add(new BackendEntry(next, new TokenAttachingTracerFactory(grpclbClientLoadRecorder)));
            }
        } else {
            throw new AssertionError("Missing case for " + this.config.getMode());
        }
        this.dropList = Collections.unmodifiableList(list);
        this.backendList = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes4.dex */
    class FallbackModeTask implements Runnable {
        FallbackModeTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GrpclbState.this.maybeUseFallbackBackends();
            GrpclbState.this.maybeUpdatePicker();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class LbRpcRetryTask implements Runnable {
        LbRpcRetryTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GrpclbState.this.startLbRpc();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class LoadReportingTask implements Runnable {
        private final LbStream stream;

        LoadReportingTask(LbStream lbStream) {
            this.stream = lbStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.stream.loadReportTimer = null;
            this.stream.sendLoadReport();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class LbStream implements StreamObserver<LoadBalanceResponse> {
        boolean closed;
        boolean initialResponseReceived;
        StreamObserver<LoadBalanceRequest> lbRequestWriter;
        final GrpclbClientLoadRecorder loadRecorder;
        long loadReportIntervalMillis = -1;
        SynchronizationContext.ScheduledHandle loadReportTimer;
        final LoadBalancerGrpc.LoadBalancerStub stub;

        LbStream(LoadBalancerGrpc.LoadBalancerStub loadBalancerStub) {
            this.stub = (LoadBalancerGrpc.LoadBalancerStub) Preconditions.checkNotNull(loadBalancerStub, "stub");
            this.loadRecorder = new GrpclbClientLoadRecorder(GrpclbState.this.time);
        }

        void start() {
            this.lbRequestWriter = ((LoadBalancerGrpc.LoadBalancerStub) this.stub.withWaitForReady()).balanceLoad(this);
        }

        @Override // io.grpc.stub.StreamObserver
        public void onNext(final LoadBalanceResponse loadBalanceResponse) {
            GrpclbState.this.syncContext.execute(new Runnable() { // from class: io.grpc.grpclb.GrpclbState.LbStream.1
                @Override // java.lang.Runnable
                public void run() {
                    LbStream.this.handleResponse(loadBalanceResponse);
                }
            });
        }

        @Override // io.grpc.stub.StreamObserver
        public void onError(final Throwable th) {
            GrpclbState.this.syncContext.execute(new Runnable() { // from class: io.grpc.grpclb.GrpclbState.LbStream.2
                @Override // java.lang.Runnable
                public void run() {
                    LbStream.this.handleStreamClosed(Status.fromThrowable(th).augmentDescription("Stream to GRPCLB LoadBalancer had an error"));
                }
            });
        }

        @Override // io.grpc.stub.StreamObserver
        public void onCompleted() {
            GrpclbState.this.syncContext.execute(new Runnable() { // from class: io.grpc.grpclb.GrpclbState.LbStream.3
                @Override // java.lang.Runnable
                public void run() {
                    LbStream.this.handleStreamClosed(Status.UNAVAILABLE.withDescription("Stream to GRPCLB LoadBalancer was closed"));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendLoadReport() {
            if (this.closed) {
                return;
            }
            try {
                this.lbRequestWriter.onNext(LoadBalanceRequest.newBuilder().setClientStats(this.loadRecorder.generateLoadReport()).build());
                scheduleNextLoadReport();
            } catch (Exception e) {
                close(e);
            }
        }

        private void scheduleNextLoadReport() {
            if (this.loadReportIntervalMillis > 0) {
                this.loadReportTimer = GrpclbState.this.syncContext.schedule(new LoadReportingTask(this), this.loadReportIntervalMillis, TimeUnit.MILLISECONDS, GrpclbState.this.timerService);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleResponse(LoadBalanceResponse loadBalanceResponse) {
            if (this.closed) {
                return;
            }
            GrpclbState.this.logger.log(ChannelLogger.ChannelLogLevel.DEBUG, "[grpclb-<{0}>] Got an LB response: {1}", GrpclbState.this.serviceName, loadBalanceResponse);
            LoadBalanceResponse.LoadBalanceResponseTypeCase loadBalanceResponseTypeCase = loadBalanceResponse.getLoadBalanceResponseTypeCase();
            if (!this.initialResponseReceived) {
                if (loadBalanceResponseTypeCase != LoadBalanceResponse.LoadBalanceResponseTypeCase.INITIAL_RESPONSE) {
                    GrpclbState.this.logger.log(ChannelLogger.ChannelLogLevel.WARNING, "[grpclb-<{0}>] Received a response without initial response", GrpclbState.this.serviceName);
                    return;
                }
                this.initialResponseReceived = true;
                this.loadReportIntervalMillis = Durations.toMillis(loadBalanceResponse.getInitialResponse().getClientStatsReportInterval());
                scheduleNextLoadReport();
            } else if (loadBalanceResponseTypeCase == LoadBalanceResponse.LoadBalanceResponseTypeCase.FALLBACK_RESPONSE) {
                GrpclbState.this.cancelFallbackTimer();
                GrpclbState.this.useFallbackBackends();
                GrpclbState.this.maybeUpdatePicker();
            } else if (loadBalanceResponseTypeCase == LoadBalanceResponse.LoadBalanceResponseTypeCase.SERVER_LIST) {
                GrpclbState.this.balancerWorking = true;
                ServerList serverList = loadBalanceResponse.getServerList();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Server server : serverList.getServersList()) {
                    String loadBalanceToken = server.getLoadBalanceToken();
                    if (server.getDrop()) {
                        arrayList.add(new DropEntry(this.loadRecorder, loadBalanceToken));
                    } else {
                        arrayList.add(null);
                        try {
                            arrayList2.add(new BackendAddressGroup(new EquivalentAddressGroup(new InetSocketAddress(InetAddress.getByAddress(server.getIpAddress().toByteArray()), server.getPort()), GrpclbState.LB_PROVIDED_BACKEND_ATTRS), loadBalanceToken));
                        } catch (UnknownHostException e) {
                            GrpclbState grpclbState = GrpclbState.this;
                            Status status = Status.UNAVAILABLE;
                            grpclbState.propagateError(status.withDescription("Host for server not found: " + server).withCause(e));
                        }
                    }
                }
                GrpclbState.this.usingFallbackBackends = false;
                GrpclbState.this.lbSentEmptyBackends = serverList.getServersList().isEmpty();
                GrpclbState.this.cancelFallbackTimer();
                GrpclbState.this.useRoundRobinLists(arrayList, arrayList2, this.loadRecorder);
                GrpclbState.this.maybeUpdatePicker();
            } else {
                GrpclbState.this.logger.log(ChannelLogger.ChannelLogLevel.WARNING, "[grpclb-<{0}>] Ignoring unexpected response type: {1}", GrpclbState.this.serviceName, loadBalanceResponseTypeCase);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleStreamClosed(Status status) {
            Preconditions.checkArgument(!status.isOk(), "unexpected OK status");
            if (this.closed) {
                return;
            }
            this.closed = true;
            cleanUp();
            GrpclbState.this.propagateError(status);
            GrpclbState.this.balancerWorking = false;
            GrpclbState.this.maybeUseFallbackBackends();
            GrpclbState.this.maybeUpdatePicker();
            if (this.initialResponseReceived || GrpclbState.this.lbRpcRetryPolicy == null) {
                GrpclbState grpclbState = GrpclbState.this;
                grpclbState.lbRpcRetryPolicy = grpclbState.backoffPolicyProvider.get();
            }
            long nextBackoffNanos = !this.initialResponseReceived ? GrpclbState.this.lbRpcRetryPolicy.nextBackoffNanos() - GrpclbState.this.stopwatch.elapsed(TimeUnit.NANOSECONDS) : 0L;
            if (nextBackoffNanos <= 0) {
                GrpclbState.this.startLbRpc();
            } else {
                GrpclbState grpclbState2 = GrpclbState.this;
                grpclbState2.lbRpcRetryTimer = grpclbState2.syncContext.schedule(new LbRpcRetryTask(), nextBackoffNanos, TimeUnit.NANOSECONDS, GrpclbState.this.timerService);
            }
            GrpclbState.this.helper.refreshNameResolution();
        }

        void close(Exception exc) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            cleanUp();
            this.lbRequestWriter.onError(exc);
        }

        private void cleanUp() {
            SynchronizationContext.ScheduledHandle scheduledHandle = this.loadReportTimer;
            if (scheduledHandle != null) {
                scheduledHandle.cancel();
                this.loadReportTimer = null;
            }
            if (GrpclbState.this.lbStream == this) {
                GrpclbState.this.lbStream = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeUpdatePicker() {
        List arrayList;
        ConnectivityState connectivityState;
        int i = AnonymousClass4.$SwitchMap$io$grpc$grpclb$GrpclbState$Mode[this.config.getMode().ordinal()];
        boolean z = false;
        if (i == 1) {
            arrayList = new ArrayList(this.backendList.size());
            Status status = null;
            for (BackendEntry backendEntry : this.backendList) {
                ConnectivityStateInfo connectivityStateInfo = (ConnectivityStateInfo) ((AtomicReference) backendEntry.subchannel.getAttributes().get(STATE_INFO)).get();
                if (connectivityStateInfo.getState() == ConnectivityState.READY) {
                    arrayList.add(backendEntry);
                } else if (connectivityStateInfo.getState() == ConnectivityState.TRANSIENT_FAILURE) {
                    status = connectivityStateInfo.getStatus();
                } else if (connectivityStateInfo.getState() == ConnectivityState.IDLE) {
                    z = true;
                }
            }
            if (!arrayList.isEmpty()) {
                connectivityState = ConnectivityState.READY;
            } else if (status != null && !z) {
                arrayList.add(new ErrorEntry(status));
                connectivityState = ConnectivityState.TRANSIENT_FAILURE;
            } else {
                arrayList.add(BUFFER_ENTRY);
                connectivityState = ConnectivityState.CONNECTING;
            }
        } else if (i == 2) {
            if (this.backendList.isEmpty()) {
                if (this.lbSentEmptyBackends) {
                    arrayList = Collections.singletonList(new ErrorEntry(NO_AVAILABLE_BACKENDS_STATUS));
                    connectivityState = ConnectivityState.TRANSIENT_FAILURE;
                } else {
                    arrayList = Collections.singletonList(BUFFER_ENTRY);
                    connectivityState = ConnectivityState.CONNECTING;
                }
            } else {
                Preconditions.checkState(this.backendList.size() == 1, "Excessive backend entries: %s", this.backendList);
                BackendEntry backendEntry2 = this.backendList.get(0);
                ConnectivityStateInfo connectivityStateInfo2 = (ConnectivityStateInfo) ((AtomicReference) backendEntry2.subchannel.getAttributes().get(STATE_INFO)).get();
                ConnectivityState state = connectivityStateInfo2.getState();
                int i2 = AnonymousClass4.$SwitchMap$io$grpc$ConnectivityState[state.ordinal()];
                if (i2 == 1) {
                    arrayList = Collections.singletonList(backendEntry2);
                } else if (i2 == 2) {
                    arrayList = Collections.singletonList(new ErrorEntry(connectivityStateInfo2.getStatus()));
                } else if (i2 == 3) {
                    arrayList = Collections.singletonList(BUFFER_ENTRY);
                } else {
                    arrayList = Collections.singletonList(new IdleSubchannelEntry(backendEntry2.subchannel, this.syncContext));
                }
                connectivityState = state;
            }
        } else {
            throw new AssertionError("Missing case for " + this.config.getMode());
        }
        maybeUpdatePicker(connectivityState, new RoundRobinPicker(this.dropList, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.grpclb.GrpclbState$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$grpc$ConnectivityState;
        static final /* synthetic */ int[] $SwitchMap$io$grpc$grpclb$GrpclbState$Mode;

        static {
            int[] iArr = new int[ConnectivityState.values().length];
            $SwitchMap$io$grpc$ConnectivityState = iArr;
            try {
                iArr[ConnectivityState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$grpc$ConnectivityState[ConnectivityState.TRANSIENT_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$grpc$ConnectivityState[ConnectivityState.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Mode.values().length];
            $SwitchMap$io$grpc$grpclb$GrpclbState$Mode = iArr2;
            try {
                iArr2[Mode.ROUND_ROBIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$grpc$grpclb$GrpclbState$Mode[Mode.PICK_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void maybeUpdatePicker(ConnectivityState connectivityState, RoundRobinPicker roundRobinPicker) {
        if (roundRobinPicker.dropList.equals(this.currentPicker.dropList) && roundRobinPicker.pickList.equals(this.currentPicker.pickList)) {
            return;
        }
        this.currentPicker = roundRobinPicker;
        this.logger.log(ChannelLogger.ChannelLogLevel.INFO, "[grpclb-<{0}>] Update balancing state to {1}: picks={2}, drops={3}", this.serviceName, connectivityState, roundRobinPicker.pickList, roundRobinPicker.dropList);
        this.helper.updateBalancingState(connectivityState, roundRobinPicker);
    }

    private LbAddressGroup flattenLbAddressGroups(List<LbAddressGroup> list) {
        ArrayList arrayList = new ArrayList(list.size());
        String authority = list.get(0).getAuthority();
        for (LbAddressGroup lbAddressGroup : list) {
            if (!authority.equals(lbAddressGroup.getAuthority())) {
                this.logger.log(ChannelLogger.ChannelLogLevel.WARNING, "[grpclb-<{0}>] Multiple authorities found for LB. Skipping addresses for {1} in preference to {2}", this.serviceName, lbAddressGroup.getAuthority(), authority);
            } else {
                arrayList.add(lbAddressGroup.getAddresses());
            }
        }
        return new LbAddressGroup(flattenEquivalentAddressGroup(arrayList, Attributes.newBuilder().set(GrpclbConstants.ATTR_LB_ADDR_AUTHORITY, authority).build()), authority);
    }

    private static EquivalentAddressGroup flattenEquivalentAddressGroup(List<EquivalentAddressGroup> list, Attributes attributes) {
        ArrayList arrayList = new ArrayList();
        for (EquivalentAddressGroup equivalentAddressGroup : list) {
            arrayList.addAll(equivalentAddressGroup.getAddresses());
        }
        return new EquivalentAddressGroup(arrayList, attributes);
    }

    private static Attributes createSubchannelAttrs() {
        return Attributes.newBuilder().set(STATE_INFO, new AtomicReference(ConnectivityStateInfo.forNonError(ConnectivityState.IDLE))).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class DropEntry {
        private final GrpclbClientLoadRecorder loadRecorder;
        private final String token;

        DropEntry(GrpclbClientLoadRecorder grpclbClientLoadRecorder, String str) {
            this.loadRecorder = (GrpclbClientLoadRecorder) Preconditions.checkNotNull(grpclbClientLoadRecorder, "loadRecorder");
            this.token = (String) Preconditions.checkNotNull(str, "token");
        }

        LoadBalancer.PickResult picked() {
            this.loadRecorder.recordDroppedRequest(this.token);
            return GrpclbState.DROP_PICK_RESULT;
        }

        public String toString() {
            return "drop(" + this.token + ")";
        }

        public int hashCode() {
            return Objects.hashCode(this.loadRecorder, this.token);
        }

        public boolean equals(Object obj) {
            if (obj instanceof DropEntry) {
                DropEntry dropEntry = (DropEntry) obj;
                return Objects.equal(this.loadRecorder, dropEntry.loadRecorder) && Objects.equal(this.token, dropEntry.token);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class BackendEntry implements RoundRobinEntry {
        final LoadBalancer.PickResult result;
        final LoadBalancer.Subchannel subchannel;
        @Nullable
        private final String token;

        BackendEntry(LoadBalancer.Subchannel subchannel, GrpclbClientLoadRecorder grpclbClientLoadRecorder, String str) {
            this.subchannel = (LoadBalancer.Subchannel) Preconditions.checkNotNull(subchannel, "subchannel");
            this.result = LoadBalancer.PickResult.withSubchannel(subchannel, (ClientStreamTracer.Factory) Preconditions.checkNotNull(grpclbClientLoadRecorder, "loadRecorder"));
            this.token = (String) Preconditions.checkNotNull(str, "token");
        }

        BackendEntry(LoadBalancer.Subchannel subchannel) {
            this.subchannel = (LoadBalancer.Subchannel) Preconditions.checkNotNull(subchannel, "subchannel");
            this.result = LoadBalancer.PickResult.withSubchannel(subchannel);
            this.token = null;
        }

        BackendEntry(LoadBalancer.Subchannel subchannel, TokenAttachingTracerFactory tokenAttachingTracerFactory) {
            this.subchannel = (LoadBalancer.Subchannel) Preconditions.checkNotNull(subchannel, "subchannel");
            this.result = LoadBalancer.PickResult.withSubchannel(subchannel, (ClientStreamTracer.Factory) Preconditions.checkNotNull(tokenAttachingTracerFactory, "tracerFactory"));
            this.token = null;
        }

        @Override // io.grpc.grpclb.GrpclbState.RoundRobinEntry
        public LoadBalancer.PickResult picked(Metadata metadata) {
            metadata.discardAll(GrpclbConstants.TOKEN_METADATA_KEY);
            if (this.token != null) {
                metadata.put(GrpclbConstants.TOKEN_METADATA_KEY, this.token);
            }
            return this.result;
        }

        public String toString() {
            return "[" + this.subchannel.getAllAddresses().toString() + "(" + this.token + ")]";
        }

        public int hashCode() {
            return Objects.hashCode(this.result, this.token);
        }

        public boolean equals(Object obj) {
            if (obj instanceof BackendEntry) {
                BackendEntry backendEntry = (BackendEntry) obj;
                return Objects.equal(this.result, backendEntry.result) && Objects.equal(this.token, backendEntry.token);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class IdleSubchannelEntry implements RoundRobinEntry {
        private final AtomicBoolean connectionRequested = new AtomicBoolean(false);
        private final LoadBalancer.Subchannel subchannel;
        private final SynchronizationContext syncContext;

        IdleSubchannelEntry(LoadBalancer.Subchannel subchannel, SynchronizationContext synchronizationContext) {
            this.subchannel = (LoadBalancer.Subchannel) Preconditions.checkNotNull(subchannel, "subchannel");
            this.syncContext = (SynchronizationContext) Preconditions.checkNotNull(synchronizationContext, "syncContext");
        }

        @Override // io.grpc.grpclb.GrpclbState.RoundRobinEntry
        public LoadBalancer.PickResult picked(Metadata metadata) {
            if (this.connectionRequested.compareAndSet(false, true)) {
                this.syncContext.execute(new Runnable() { // from class: io.grpc.grpclb.GrpclbState.IdleSubchannelEntry.1
                    @Override // java.lang.Runnable
                    public void run() {
                        IdleSubchannelEntry.this.subchannel.requestConnection();
                    }
                });
            }
            return LoadBalancer.PickResult.withNoResult();
        }

        public String toString() {
            return "(idle)[" + this.subchannel.getAllAddresses().toString() + "]";
        }

        public int hashCode() {
            return Objects.hashCode(this.subchannel, this.syncContext);
        }

        public boolean equals(Object obj) {
            if (obj instanceof IdleSubchannelEntry) {
                IdleSubchannelEntry idleSubchannelEntry = (IdleSubchannelEntry) obj;
                return Objects.equal(this.subchannel, idleSubchannelEntry.subchannel) && Objects.equal(this.syncContext, idleSubchannelEntry.syncContext);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class ErrorEntry implements RoundRobinEntry {
        final LoadBalancer.PickResult result;

        ErrorEntry(Status status) {
            this.result = LoadBalancer.PickResult.withError(status);
        }

        @Override // io.grpc.grpclb.GrpclbState.RoundRobinEntry
        public LoadBalancer.PickResult picked(Metadata metadata) {
            return this.result;
        }

        public int hashCode() {
            return Objects.hashCode(this.result);
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorEntry) {
                return Objects.equal(this.result, ((ErrorEntry) obj).result);
            }
            return false;
        }

        public String toString() {
            return this.result.getStatus().toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class RoundRobinPicker extends LoadBalancer.SubchannelPicker {
        private int dropIndex;
        final List<DropEntry> dropList;
        private int pickIndex;
        final List<? extends RoundRobinEntry> pickList;

        RoundRobinPicker(List<DropEntry> list, List<? extends RoundRobinEntry> list2) {
            this.dropList = (List) Preconditions.checkNotNull(list, "dropList");
            this.pickList = (List) Preconditions.checkNotNull(list2, "pickList");
            Preconditions.checkArgument(!list2.isEmpty(), "pickList is empty");
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public LoadBalancer.PickResult pickSubchannel(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            synchronized (this.pickList) {
                if (!this.dropList.isEmpty()) {
                    DropEntry dropEntry = this.dropList.get(this.dropIndex);
                    int i = this.dropIndex + 1;
                    this.dropIndex = i;
                    if (i == this.dropList.size()) {
                        this.dropIndex = 0;
                    }
                    if (dropEntry != null) {
                        return dropEntry.picked();
                    }
                }
                RoundRobinEntry roundRobinEntry = this.pickList.get(this.pickIndex);
                int i2 = this.pickIndex + 1;
                this.pickIndex = i2;
                if (i2 == this.pickList.size()) {
                    this.pickIndex = 0;
                }
                return roundRobinEntry.picked(pickSubchannelArgs.getHeaders());
            }
        }

        public String toString() {
            return MoreObjects.toStringHelper((Class<?>) RoundRobinPicker.class).add("dropList", this.dropList).add("pickList", this.pickList).toString();
        }
    }
}
