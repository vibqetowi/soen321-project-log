package com.ifriend.domain.useCases;

import com.ifriend.domain.data.config.AppConfigRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AppConfigUseCase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\bJ#\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/useCases/AppConfigUseCase;", "", "appConfigRepository", "Lcom/ifriend/domain/data/config/AppConfigRepository;", "(Lcom/ifriend/domain/data/config/AppConfigRepository;)V", "getEndpointValue", "", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLinkValue", "getLongValue", "", "getStringValue", "scope", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFeatureEnabled", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppConfigUseCase {
    private final AppConfigRepository appConfigRepository;

    @Inject
    public AppConfigUseCase(AppConfigRepository appConfigRepository) {
        Intrinsics.checkNotNullParameter(appConfigRepository, "appConfigRepository");
        this.appConfigRepository = appConfigRepository;
    }

    public final Object isFeatureEnabled(String str, Continuation<? super Boolean> continuation) {
        return this.appConfigRepository.isFeatureEnabled(str, continuation);
    }

    public final Object getLongValue(String str, Continuation<? super Long> continuation) {
        return this.appConfigRepository.getFeatureLongValue(str, continuation);
    }

    public final Object getStringValue(String str, String str2, Continuation<? super String> continuation) {
        return this.appConfigRepository.getFeatureStringValue(str, str2, continuation);
    }

    public final Object getStringValue(String str, Continuation<? super String> continuation) {
        return this.appConfigRepository.getFeatureStringValue(str, continuation);
    }

    public final Object getLinkValue(String str, Continuation<? super String> continuation) {
        return this.appConfigRepository.getFeatureLinkValue(str, continuation);
    }

    public final Object getEndpointValue(String str, Continuation<? super String> continuation) {
        return this.appConfigRepository.getFeatureEndpointValue(str, continuation);
    }
}
