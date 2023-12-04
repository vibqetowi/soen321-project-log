package com.ifriend.domain.data.config;

import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.models.Tag;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AppConfigRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ#\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001f\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ifriend/domain/data/config/AppConfigRepository;", "", "getConfigStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/config/ConfigState;", "getFeatureEndpointValue", "", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeatureLinkValue", "getFeatureLongValue", "", "getFeatureStringValue", "scope", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVersionLongValue", "isFeatureEnabled", "", "loadConfig", "tags", "", "Lcom/ifriend/domain/models/Tag;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppConfigRepository {
    Flow<ConfigState> getConfigStateFlow();

    Object getFeatureEndpointValue(String str, Continuation<? super String> continuation);

    Object getFeatureLinkValue(String str, Continuation<? super String> continuation);

    Object getFeatureLongValue(String str, Continuation<? super Long> continuation);

    Object getFeatureStringValue(String str, String str2, Continuation<? super String> continuation);

    Object getFeatureStringValue(String str, Continuation<? super String> continuation);

    Object getVersionLongValue(String str, Continuation<? super Long> continuation);

    Object isFeatureEnabled(String str, Continuation<? super Boolean> continuation);

    Object loadConfig(List<Tag> list, Continuation<? super ConfigState> continuation);
}
