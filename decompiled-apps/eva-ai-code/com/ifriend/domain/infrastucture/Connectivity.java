package com.ifriend.domain.infrastucture;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Connectivity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/infrastucture/Connectivity;", "", "isConnectivityAvailable", "", "isInternetAvailable", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "isFullyConnected", "toString", "", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Connectivity {
    public static final Companion Companion = new Companion(null);
    private static final Connectivity FULL = new Connectivity(true, true);
    private static final Connectivity NONE = new Connectivity(false, false);
    private final boolean isConnectivityAvailable;
    private final boolean isInternetAvailable;

    public static /* synthetic */ Connectivity copy$default(Connectivity connectivity, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = connectivity.isConnectivityAvailable;
        }
        if ((i & 2) != 0) {
            z2 = connectivity.isInternetAvailable;
        }
        return connectivity.copy(z, z2);
    }

    public final boolean component1() {
        return this.isConnectivityAvailable;
    }

    public final boolean component2() {
        return this.isInternetAvailable;
    }

    public final Connectivity copy(boolean z, boolean z2) {
        return new Connectivity(z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Connectivity) {
            Connectivity connectivity = (Connectivity) obj;
            return this.isConnectivityAvailable == connectivity.isConnectivityAvailable && this.isInternetAvailable == connectivity.isInternetAvailable;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isConnectivityAvailable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isInternetAvailable;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.isConnectivityAvailable;
        boolean z2 = this.isInternetAvailable;
        return "Connectivity(isConnectivityAvailable=" + z + ", isInternetAvailable=" + z2 + ")";
    }

    public Connectivity(boolean z, boolean z2) {
        this.isConnectivityAvailable = z;
        this.isInternetAvailable = z2;
    }

    public final boolean isConnectivityAvailable() {
        return this.isConnectivityAvailable;
    }

    public final boolean isInternetAvailable() {
        return this.isInternetAvailable;
    }

    public final boolean isFullyConnected() {
        return this.isConnectivityAvailable && this.isInternetAvailable;
    }

    /* compiled from: Connectivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/infrastucture/Connectivity$Companion;", "", "()V", "FULL", "Lcom/ifriend/domain/infrastucture/Connectivity;", "getFULL", "()Lcom/ifriend/domain/infrastucture/Connectivity;", "NONE", "getNONE", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Connectivity getFULL() {
            return Connectivity.FULL;
        }

        public final Connectivity getNONE() {
            return Connectivity.NONE;
        }
    }
}
