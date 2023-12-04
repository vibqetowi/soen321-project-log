package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.events.Subscriber;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes7.dex */
public final /* synthetic */ class zzb implements ComponentFactory {
    public static final /* synthetic */ zzb zza = new zzb();

    private /* synthetic */ zzb() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        AnalyticsConnector analyticsConnectorImpl;
        analyticsConnectorImpl = AnalyticsConnectorImpl.getInstance((FirebaseApp) componentContainer.get(FirebaseApp.class), (Context) componentContainer.get(Context.class), (Subscriber) componentContainer.get(Subscriber.class));
        return analyticsConnectorImpl;
    }
}
