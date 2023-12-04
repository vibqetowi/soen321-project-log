package com.ifriend.domain.data.deeplinks;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: DeepLinksRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;", "", "clear", "", "getDeepLink", "Lcom/ifriend/domain/data/deeplinks/DeepLink;", "parseByUri", "uri", "", "updateDeepLink", "deepLink", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DeepLinksRepository {
    void clear();

    DeepLink getDeepLink();

    DeepLink parseByUri(String str);

    void updateDeepLink(DeepLink deepLink);
}
