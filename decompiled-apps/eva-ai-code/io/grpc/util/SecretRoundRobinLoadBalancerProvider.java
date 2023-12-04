package io.grpc.util;

import io.grpc.LoadBalancer;
import io.grpc.LoadBalancerProvider;
import io.grpc.NameResolver;
import java.util.Map;
/* loaded from: classes4.dex */
final class SecretRoundRobinLoadBalancerProvider {
    private SecretRoundRobinLoadBalancerProvider() {
    }

    /* loaded from: classes4.dex */
    public static final class Provider extends LoadBalancerProvider {
        private static final String NO_CONFIG = "no service config";

        @Override // io.grpc.LoadBalancerProvider
        public String getPolicyName() {
            return "round_robin";
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
            return new RoundRobinLoadBalancer(helper);
        }

        @Override // io.grpc.LoadBalancerProvider
        public NameResolver.ConfigOrError parseLoadBalancingPolicyConfig(Map<String, ?> map) {
            return NameResolver.ConfigOrError.fromConfig(NO_CONFIG);
        }
    }
}
