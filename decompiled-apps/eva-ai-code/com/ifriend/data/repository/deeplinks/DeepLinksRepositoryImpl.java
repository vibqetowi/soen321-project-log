package com.ifriend.data.repository.deeplinks;

import com.ifriend.domain.data.deeplinks.DeepLink;
import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DeepLinksRepositoryImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/data/repository/deeplinks/DeepLinksRepositoryImpl;", "Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;", "parser", "Lcom/ifriend/data/repository/deeplinks/DeepLinksParser;", "(Lcom/ifriend/data/repository/deeplinks/DeepLinksParser;)V", "deepLink", "Lcom/ifriend/domain/data/deeplinks/DeepLink;", "clear", "", "getDeepLink", "parseByUri", "uri", "", "updateDeepLink", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeepLinksRepositoryImpl implements DeepLinksRepository {
    private DeepLink deepLink;
    private final DeepLinksParser parser;

    @Inject
    public DeepLinksRepositoryImpl(DeepLinksParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
    }

    @Override // com.ifriend.domain.data.deeplinks.DeepLinksRepository
    public void updateDeepLink(DeepLink deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.deepLink = deepLink;
    }

    @Override // com.ifriend.domain.data.deeplinks.DeepLinksRepository
    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    @Override // com.ifriend.domain.data.deeplinks.DeepLinksRepository
    public void clear() {
        this.deepLink = null;
    }

    @Override // com.ifriend.domain.data.deeplinks.DeepLinksRepository
    public DeepLink parseByUri(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return this.parser.parse(uri);
    }
}
