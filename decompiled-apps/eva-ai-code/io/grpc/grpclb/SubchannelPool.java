package io.grpc.grpclb;

import io.grpc.Attributes;
import io.grpc.ConnectivityStateInfo;
import io.grpc.EquivalentAddressGroup;
import io.grpc.LoadBalancer;
/* loaded from: classes4.dex */
interface SubchannelPool {

    /* loaded from: classes4.dex */
    public interface PooledSubchannelStateListener {
        void onSubchannelState(LoadBalancer.Subchannel subchannel, ConnectivityStateInfo connectivityStateInfo);
    }

    void clear();

    void registerListener(PooledSubchannelStateListener pooledSubchannelStateListener);

    void returnSubchannel(LoadBalancer.Subchannel subchannel, ConnectivityStateInfo connectivityStateInfo);

    LoadBalancer.Subchannel takeOrCreateSubchannel(EquivalentAddressGroup equivalentAddressGroup, Attributes attributes);
}
