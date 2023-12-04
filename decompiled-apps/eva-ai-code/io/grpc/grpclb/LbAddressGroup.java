package io.grpc.grpclb;

import com.google.common.base.Preconditions;
import io.grpc.EquivalentAddressGroup;
/* loaded from: classes4.dex */
final class LbAddressGroup {
    private final EquivalentAddressGroup addresses;
    private final String authority;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LbAddressGroup(EquivalentAddressGroup equivalentAddressGroup, String str) {
        this.addresses = (EquivalentAddressGroup) Preconditions.checkNotNull(equivalentAddressGroup, "addresses");
        this.authority = (String) Preconditions.checkNotNull(str, "authority");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EquivalentAddressGroup getAddresses() {
        return this.addresses;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getAuthority() {
        return this.authority;
    }
}
