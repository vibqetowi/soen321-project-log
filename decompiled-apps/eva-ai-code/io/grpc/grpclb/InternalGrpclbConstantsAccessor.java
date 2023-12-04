package io.grpc.grpclb;

import io.grpc.Attributes;
import io.grpc.EquivalentAddressGroup;
import java.util.List;
/* loaded from: classes4.dex */
public final class InternalGrpclbConstantsAccessor {
    public static final Attributes.Key<List<EquivalentAddressGroup>> ATTR_LB_ADDRS = GrpclbConstants.ATTR_LB_ADDRS;
    public static final Attributes.Key<String> ATTR_LB_ADDR_AUTHORITY = GrpclbConstants.ATTR_LB_ADDR_AUTHORITY;

    private InternalGrpclbConstantsAccessor() {
    }
}
