package io.grpc.grpclb;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import io.grpc.ChannelLogger;
import io.grpc.EquivalentAddressGroup;
import io.grpc.LoadBalancer;
import io.grpc.Status;
import io.grpc.grpclb.GrpclbState;
import io.grpc.internal.BackoffPolicy;
import io.grpc.internal.TimeProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
class GrpclbLoadBalancer extends LoadBalancer {
    private static final GrpclbConfig DEFAULT_CONFIG = GrpclbConfig.create(GrpclbState.Mode.ROUND_ROBIN);
    private final BackoffPolicy.Provider backoffPolicyProvider;
    private GrpclbConfig config = DEFAULT_CONFIG;
    @Nullable
    private GrpclbState grpclbState;
    private final LoadBalancer.Helper helper;
    private final Stopwatch stopwatch;
    private final SubchannelPool subchannelPool;
    private final TimeProvider time;

    @Override // io.grpc.LoadBalancer
    public boolean canHandleEmptyAddressListFromNameResolution() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GrpclbLoadBalancer(LoadBalancer.Helper helper, SubchannelPool subchannelPool, TimeProvider timeProvider, Stopwatch stopwatch, BackoffPolicy.Provider provider) {
        this.helper = (LoadBalancer.Helper) Preconditions.checkNotNull(helper, "helper");
        this.time = (TimeProvider) Preconditions.checkNotNull(timeProvider, "time provider");
        this.stopwatch = (Stopwatch) Preconditions.checkNotNull(stopwatch, NotificationCompat.CATEGORY_STOPWATCH);
        this.backoffPolicyProvider = (BackoffPolicy.Provider) Preconditions.checkNotNull(provider, "backoffPolicyProvider");
        this.subchannelPool = (SubchannelPool) Preconditions.checkNotNull(subchannelPool, "subchannelPool");
        recreateStates();
        Preconditions.checkNotNull(this.grpclbState, "grpclbState");
    }

    @Override // io.grpc.LoadBalancer
    public void handleResolvedAddresses(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        List<EquivalentAddressGroup> list = (List) resolvedAddresses.getAttributes().get(GrpclbConstants.ATTR_LB_ADDRS);
        if ((list == null || list.isEmpty()) && resolvedAddresses.getAddresses().isEmpty()) {
            handleNameResolutionError(Status.UNAVAILABLE.withDescription("No backend or balancer addresses found"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EquivalentAddressGroup equivalentAddressGroup : list) {
                String str = (String) equivalentAddressGroup.getAttributes().get(GrpclbConstants.ATTR_LB_ADDR_AUTHORITY);
                if (str == null) {
                    throw new AssertionError("This is a bug: LB address " + equivalentAddressGroup + " does not have an authority.");
                }
                arrayList.add(new LbAddressGroup(equivalentAddressGroup, str));
            }
        }
        List<LbAddressGroup> unmodifiableList = Collections.unmodifiableList(arrayList);
        List<EquivalentAddressGroup> unmodifiableList2 = Collections.unmodifiableList(resolvedAddresses.getAddresses());
        GrpclbConfig grpclbConfig = (GrpclbConfig) resolvedAddresses.getLoadBalancingPolicyConfig();
        if (grpclbConfig == null) {
            grpclbConfig = DEFAULT_CONFIG;
        }
        if (!this.config.equals(grpclbConfig)) {
            this.config = grpclbConfig;
            ChannelLogger channelLogger = this.helper.getChannelLogger();
            ChannelLogger.ChannelLogLevel channelLogLevel = ChannelLogger.ChannelLogLevel.INFO;
            channelLogger.log(channelLogLevel, "Config: " + grpclbConfig);
            recreateStates();
        }
        this.grpclbState.handleAddresses(unmodifiableList, unmodifiableList2);
    }

    @Override // io.grpc.LoadBalancer
    public void requestConnection() {
        GrpclbState grpclbState = this.grpclbState;
        if (grpclbState != null) {
            grpclbState.requestConnection();
        }
    }

    private void resetStates() {
        GrpclbState grpclbState = this.grpclbState;
        if (grpclbState != null) {
            grpclbState.shutdown();
            this.grpclbState = null;
        }
    }

    private void recreateStates() {
        resetStates();
        Preconditions.checkState(this.grpclbState == null, "Should've been cleared");
        this.grpclbState = new GrpclbState(this.config, this.helper, this.subchannelPool, this.time, this.stopwatch, this.backoffPolicyProvider);
    }

    @Override // io.grpc.LoadBalancer
    public void shutdown() {
        resetStates();
    }

    @Override // io.grpc.LoadBalancer
    public void handleNameResolutionError(Status status) {
        GrpclbState grpclbState = this.grpclbState;
        if (grpclbState != null) {
            grpclbState.propagateError(status);
        }
    }

    @Nullable
    GrpclbState getGrpclbState() {
        return this.grpclbState;
    }
}
