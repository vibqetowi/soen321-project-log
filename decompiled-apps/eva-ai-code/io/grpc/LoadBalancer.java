package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import io.grpc.ClientStreamTracer;
import io.grpc.NameResolver;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public abstract class LoadBalancer {
    public static final Attributes.Key<Map<String, ?>> ATTR_HEALTH_CHECKING_CONFIG = Attributes.Key.create("health-checking-config");
    private int recursionCount;

    /* loaded from: classes4.dex */
    public static abstract class Factory {
        public abstract LoadBalancer newLoadBalancer(Helper helper);
    }

    /* loaded from: classes4.dex */
    public static abstract class PickSubchannelArgs {
        public abstract CallOptions getCallOptions();

        public abstract Metadata getHeaders();

        public abstract MethodDescriptor<?, ?> getMethodDescriptor();
    }

    /* loaded from: classes4.dex */
    public static abstract class SubchannelPicker {
        public abstract PickResult pickSubchannel(PickSubchannelArgs pickSubchannelArgs);

        @Deprecated
        public void requestConnection() {
        }
    }

    /* loaded from: classes4.dex */
    public interface SubchannelStateListener {
        void onSubchannelState(ConnectivityStateInfo connectivityStateInfo);
    }

    public boolean canHandleEmptyAddressListFromNameResolution() {
        return false;
    }

    public abstract void handleNameResolutionError(Status status);

    @Deprecated
    public void handleSubchannelState(Subchannel subchannel, ConnectivityStateInfo connectivityStateInfo) {
    }

    public void requestConnection() {
    }

    public abstract void shutdown();

    @Deprecated
    public void handleResolvedAddressGroups(List<EquivalentAddressGroup> list, Attributes attributes) {
        int i = this.recursionCount;
        this.recursionCount = i + 1;
        if (i == 0) {
            handleResolvedAddresses(ResolvedAddresses.newBuilder().setAddresses(list).setAttributes(attributes).build());
        }
        this.recursionCount = 0;
    }

    public void handleResolvedAddresses(ResolvedAddresses resolvedAddresses) {
        int i = this.recursionCount;
        this.recursionCount = i + 1;
        if (i == 0) {
            handleResolvedAddressGroups(resolvedAddresses.getAddresses(), resolvedAddresses.getAttributes());
        }
        this.recursionCount = 0;
    }

    /* loaded from: classes4.dex */
    public static final class ResolvedAddresses {
        private final List<EquivalentAddressGroup> addresses;
        private final Attributes attributes;
        @Nullable
        private final Object loadBalancingPolicyConfig;

        private ResolvedAddresses(List<EquivalentAddressGroup> list, Attributes attributes, Object obj) {
            this.addresses = Collections.unmodifiableList(new ArrayList((Collection) Preconditions.checkNotNull(list, "addresses")));
            this.attributes = (Attributes) Preconditions.checkNotNull(attributes, "attributes");
            this.loadBalancingPolicyConfig = obj;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder toBuilder() {
            return newBuilder().setAddresses(this.addresses).setAttributes(this.attributes).setLoadBalancingPolicyConfig(this.loadBalancingPolicyConfig);
        }

        public List<EquivalentAddressGroup> getAddresses() {
            return this.addresses;
        }

        public Attributes getAttributes() {
            return this.attributes;
        }

        @Nullable
        public Object getLoadBalancingPolicyConfig() {
            return this.loadBalancingPolicyConfig;
        }

        /* loaded from: classes4.dex */
        public static final class Builder {
            private List<EquivalentAddressGroup> addresses;
            private Attributes attributes = Attributes.EMPTY;
            @Nullable
            private Object loadBalancingPolicyConfig;

            Builder() {
            }

            public Builder setAddresses(List<EquivalentAddressGroup> list) {
                this.addresses = list;
                return this;
            }

            public Builder setAttributes(Attributes attributes) {
                this.attributes = attributes;
                return this;
            }

            public Builder setLoadBalancingPolicyConfig(@Nullable Object obj) {
                this.loadBalancingPolicyConfig = obj;
                return this;
            }

            public ResolvedAddresses build() {
                return new ResolvedAddresses(this.addresses, this.attributes, this.loadBalancingPolicyConfig);
            }
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("addresses", this.addresses).add("attributes", this.attributes).add("loadBalancingPolicyConfig", this.loadBalancingPolicyConfig).toString();
        }

        public int hashCode() {
            return Objects.hashCode(this.addresses, this.attributes, this.loadBalancingPolicyConfig);
        }

        public boolean equals(Object obj) {
            if (obj instanceof ResolvedAddresses) {
                ResolvedAddresses resolvedAddresses = (ResolvedAddresses) obj;
                return Objects.equal(this.addresses, resolvedAddresses.addresses) && Objects.equal(this.attributes, resolvedAddresses.attributes) && Objects.equal(this.loadBalancingPolicyConfig, resolvedAddresses.loadBalancingPolicyConfig);
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class PickResult {
        private static final PickResult NO_RESULT = new PickResult(null, null, Status.OK, false);
        private final boolean drop;
        private final Status status;
        @Nullable
        private final ClientStreamTracer.Factory streamTracerFactory;
        @Nullable
        private final Subchannel subchannel;

        private PickResult(@Nullable Subchannel subchannel, @Nullable ClientStreamTracer.Factory factory, Status status, boolean z) {
            this.subchannel = subchannel;
            this.streamTracerFactory = factory;
            this.status = (Status) Preconditions.checkNotNull(status, "status");
            this.drop = z;
        }

        public static PickResult withSubchannel(Subchannel subchannel, @Nullable ClientStreamTracer.Factory factory) {
            return new PickResult((Subchannel) Preconditions.checkNotNull(subchannel, "subchannel"), factory, Status.OK, false);
        }

        public static PickResult withSubchannel(Subchannel subchannel) {
            return withSubchannel(subchannel, null);
        }

        public static PickResult withError(Status status) {
            Preconditions.checkArgument(!status.isOk(), "error status shouldn't be OK");
            return new PickResult(null, null, status, false);
        }

        public static PickResult withDrop(Status status) {
            Preconditions.checkArgument(!status.isOk(), "drop status shouldn't be OK");
            return new PickResult(null, null, status, true);
        }

        public static PickResult withNoResult() {
            return NO_RESULT;
        }

        @Nullable
        public Subchannel getSubchannel() {
            return this.subchannel;
        }

        @Nullable
        public ClientStreamTracer.Factory getStreamTracerFactory() {
            return this.streamTracerFactory;
        }

        public Status getStatus() {
            return this.status;
        }

        public boolean isDrop() {
            return this.drop;
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("subchannel", this.subchannel).add("streamTracerFactory", this.streamTracerFactory).add("status", this.status).add("drop", this.drop).toString();
        }

        public int hashCode() {
            return Objects.hashCode(this.subchannel, this.status, this.streamTracerFactory, Boolean.valueOf(this.drop));
        }

        public boolean equals(Object obj) {
            if (obj instanceof PickResult) {
                PickResult pickResult = (PickResult) obj;
                return Objects.equal(this.subchannel, pickResult.subchannel) && Objects.equal(this.status, pickResult.status) && Objects.equal(this.streamTracerFactory, pickResult.streamTracerFactory) && this.drop == pickResult.drop;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class CreateSubchannelArgs {
        private final List<EquivalentAddressGroup> addrs;
        private final Attributes attrs;
        private final Object[][] customOptions;

        private CreateSubchannelArgs(List<EquivalentAddressGroup> list, Attributes attributes, Object[][] objArr) {
            this.addrs = (List) Preconditions.checkNotNull(list, "addresses are not set");
            this.attrs = (Attributes) Preconditions.checkNotNull(attributes, "attrs");
            this.customOptions = (Object[][]) Preconditions.checkNotNull(objArr, "customOptions");
        }

        public List<EquivalentAddressGroup> getAddresses() {
            return this.addrs;
        }

        public Attributes getAttributes() {
            return this.attrs;
        }

        public <T> T getOption(Key<T> key) {
            Preconditions.checkNotNull(key, "key");
            int i = 0;
            while (true) {
                Object[][] objArr = this.customOptions;
                if (i < objArr.length) {
                    if (key.equals(objArr[i][0])) {
                        return (T) this.customOptions[i][1];
                    }
                    i++;
                } else {
                    return (T) ((Key) key).defaultValue;
                }
            }
        }

        public Builder toBuilder() {
            return newBuilder().setAddresses(this.addrs).setAttributes(this.attrs).copyCustomOptions(this.customOptions);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("addrs", this.addrs).add("attrs", this.attrs).add("customOptions", Arrays.deepToString(this.customOptions)).toString();
        }

        /* loaded from: classes4.dex */
        public static final class Builder {
            private List<EquivalentAddressGroup> addrs;
            private Attributes attrs = Attributes.EMPTY;
            private Object[][] customOptions = (Object[][]) Array.newInstance(Object.class, 0, 2);

            Builder() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public <T> Builder copyCustomOptions(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, objArr.length, 2);
                this.customOptions = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public <T> Builder addOption(Key<T> key, T t) {
                Preconditions.checkNotNull(key, "key");
                Preconditions.checkNotNull(t, "value");
                int i = 0;
                while (true) {
                    Object[][] objArr = this.customOptions;
                    if (i >= objArr.length) {
                        i = -1;
                        break;
                    } else if (key.equals(objArr[i][0])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, this.customOptions.length + 1, 2);
                    Object[][] objArr3 = this.customOptions;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.customOptions = objArr2;
                    i = objArr2.length - 1;
                }
                Object[][] objArr4 = this.customOptions;
                Object[] objArr5 = new Object[2];
                objArr5[0] = key;
                objArr5[1] = t;
                objArr4[i] = objArr5;
                return this;
            }

            public Builder setAddresses(EquivalentAddressGroup equivalentAddressGroup) {
                this.addrs = Collections.singletonList(equivalentAddressGroup);
                return this;
            }

            public Builder setAddresses(List<EquivalentAddressGroup> list) {
                Preconditions.checkArgument(!list.isEmpty(), "addrs is empty");
                this.addrs = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public Builder setAttributes(Attributes attributes) {
                this.attrs = (Attributes) Preconditions.checkNotNull(attributes, "attrs");
                return this;
            }

            public CreateSubchannelArgs build() {
                return new CreateSubchannelArgs(this.addrs, this.attrs, this.customOptions);
            }
        }

        /* loaded from: classes4.dex */
        public static final class Key<T> {
            private final String debugString;
            private final T defaultValue;

            private Key(String str, T t) {
                this.debugString = str;
                this.defaultValue = t;
            }

            public static <T> Key<T> create(String str) {
                Preconditions.checkNotNull(str, "debugString");
                return new Key<>(str, null);
            }

            public static <T> Key<T> createWithDefault(String str, T t) {
                Preconditions.checkNotNull(str, "debugString");
                return new Key<>(str, t);
            }

            public T getDefault() {
                return this.defaultValue;
            }

            public String toString() {
                return this.debugString;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Helper {
        public abstract ManagedChannel createOobChannel(EquivalentAddressGroup equivalentAddressGroup, String str);

        public abstract String getAuthority();

        public void ignoreRefreshNameResolutionCheck() {
        }

        public abstract void updateBalancingState(@Nonnull ConnectivityState connectivityState, @Nonnull SubchannelPicker subchannelPicker);

        public Subchannel createSubchannel(CreateSubchannelArgs createSubchannelArgs) {
            throw new UnsupportedOperationException();
        }

        public ManagedChannel createOobChannel(List<EquivalentAddressGroup> list, String str) {
            throw new UnsupportedOperationException();
        }

        public void updateOobChannelAddresses(ManagedChannel managedChannel, EquivalentAddressGroup equivalentAddressGroup) {
            throw new UnsupportedOperationException();
        }

        public void updateOobChannelAddresses(ManagedChannel managedChannel, List<EquivalentAddressGroup> list) {
            throw new UnsupportedOperationException();
        }

        public ManagedChannel createResolvingOobChannel(String str) {
            return createResolvingOobChannelBuilder(str).build();
        }

        @Deprecated
        public ManagedChannelBuilder<?> createResolvingOobChannelBuilder(String str) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public ManagedChannelBuilder<?> createResolvingOobChannelBuilder(String str, ChannelCredentials channelCredentials) {
            throw new UnsupportedOperationException();
        }

        public void refreshNameResolution() {
            throw new UnsupportedOperationException();
        }

        public SynchronizationContext getSynchronizationContext() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService getScheduledExecutorService() {
            throw new UnsupportedOperationException();
        }

        public ChannelCredentials getChannelCredentials() {
            return getUnsafeChannelCredentials().withoutBearerTokens();
        }

        public ChannelCredentials getUnsafeChannelCredentials() {
            throw new UnsupportedOperationException();
        }

        public ChannelLogger getChannelLogger() {
            throw new UnsupportedOperationException();
        }

        public NameResolver.Args getNameResolverArgs() {
            throw new UnsupportedOperationException();
        }

        public NameResolverRegistry getNameResolverRegistry() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class Subchannel {
        public abstract Attributes getAttributes();

        public abstract void requestConnection();

        public abstract void shutdown();

        public void start(SubchannelStateListener subchannelStateListener) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public final EquivalentAddressGroup getAddresses() {
            List<EquivalentAddressGroup> allAddresses = getAllAddresses();
            Preconditions.checkState(allAddresses.size() == 1, "%s does not have exactly one group", allAddresses);
            return allAddresses.get(0);
        }

        public List<EquivalentAddressGroup> getAllAddresses() {
            throw new UnsupportedOperationException();
        }

        public Channel asChannel() {
            throw new UnsupportedOperationException();
        }

        public ChannelLogger getChannelLogger() {
            throw new UnsupportedOperationException();
        }

        public void updateAddresses(List<EquivalentAddressGroup> list) {
            throw new UnsupportedOperationException();
        }

        public Object getInternalSubchannel() {
            throw new UnsupportedOperationException();
        }
    }
}
