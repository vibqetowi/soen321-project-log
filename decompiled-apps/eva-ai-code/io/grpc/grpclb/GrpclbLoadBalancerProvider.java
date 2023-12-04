package io.grpc.grpclb;

import com.google.common.base.Stopwatch;
import io.grpc.LoadBalancer;
import io.grpc.LoadBalancerProvider;
import io.grpc.NameResolver;
import io.grpc.Status;
import io.grpc.grpclb.GrpclbState;
import io.grpc.internal.ExponentialBackoffPolicy;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.JsonUtil;
import io.grpc.internal.ServiceConfigUtil;
import io.grpc.internal.TimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class GrpclbLoadBalancerProvider extends LoadBalancerProvider {
    private static final GrpclbState.Mode DEFAULT_MODE = GrpclbState.Mode.ROUND_ROBIN;

    @Override // io.grpc.LoadBalancerProvider
    public String getPolicyName() {
        return "grpclb";
    }

    @Override // io.grpc.LoadBalancerProvider
    public int getPriority() {
        return 5;
    }

    @Override // io.grpc.LoadBalancerProvider
    public boolean isAvailable() {
        return true;
    }

    @Override // io.grpc.LoadBalancer.Factory
    public LoadBalancer newLoadBalancer(LoadBalancer.Helper helper) {
        return new GrpclbLoadBalancer(helper, new CachedSubchannelPool(helper), TimeProvider.SYSTEM_TIME_PROVIDER, Stopwatch.createUnstarted(), new ExponentialBackoffPolicy.Provider());
    }

    @Override // io.grpc.LoadBalancerProvider
    public NameResolver.ConfigOrError parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        try {
            return parseLoadBalancingConfigPolicyInternal(map);
        } catch (RuntimeException e) {
            Status fromThrowable = Status.fromThrowable(e);
            return NameResolver.ConfigOrError.fromError(fromThrowable.withDescription("Failed to parse GRPCLB config: " + map));
        }
    }

    NameResolver.ConfigOrError parseLoadBalancingConfigPolicyInternal(Map<String, ?> map) {
        if (map == null) {
            return NameResolver.ConfigOrError.fromConfig(GrpclbConfig.create(DEFAULT_MODE));
        }
        String string = JsonUtil.getString(map, "serviceName");
        List<?> list = JsonUtil.getList(map, "childPolicy");
        List<ServiceConfigUtil.LbConfig> unwrapLoadBalancingConfigList = list != null ? ServiceConfigUtil.unwrapLoadBalancingConfigList(JsonUtil.checkObjectList(list)) : null;
        if (unwrapLoadBalancingConfigList == null || unwrapLoadBalancingConfigList.isEmpty()) {
            return NameResolver.ConfigOrError.fromConfig(GrpclbConfig.create(DEFAULT_MODE, string));
        }
        ArrayList arrayList = new ArrayList();
        for (ServiceConfigUtil.LbConfig lbConfig : unwrapLoadBalancingConfigList) {
            String policyName = lbConfig.getPolicyName();
            policyName.hashCode();
            if (policyName.equals(GrpcUtil.DEFAULT_LB_POLICY)) {
                return NameResolver.ConfigOrError.fromConfig(GrpclbConfig.create(GrpclbState.Mode.PICK_FIRST, string));
            }
            if (policyName.equals("round_robin")) {
                return NameResolver.ConfigOrError.fromConfig(GrpclbConfig.create(GrpclbState.Mode.ROUND_ROBIN, string));
            }
            arrayList.add(policyName);
        }
        Status status = Status.INVALID_ARGUMENT;
        return NameResolver.ConfigOrError.fromError(status.withDescription("None of " + arrayList + " specified child policies are available."));
    }
}
