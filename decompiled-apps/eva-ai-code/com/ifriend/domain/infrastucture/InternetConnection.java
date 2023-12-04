package com.ifriend.domain.infrastucture;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: InternetConnection.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/infrastucture/InternetConnection;", "", "getConnectivity", "Lcom/ifriend/domain/infrastucture/Connectivity;", "getConnectivityFlow", "Lkotlinx/coroutines/flow/Flow;", "startMonitorConnectivity", "", "stopMonitorConnectivity", "updateConnectivityState", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InternetConnection {
    Connectivity getConnectivity();

    Flow<Connectivity> getConnectivityFlow();

    void startMonitorConnectivity();

    void stopMonitorConnectivity();

    void updateConnectivityState();
}
