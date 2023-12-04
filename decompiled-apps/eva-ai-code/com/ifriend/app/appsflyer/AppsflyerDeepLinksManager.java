package com.ifriend.app.appsflyer;

import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.ifriend.domain.data.deeplinks.DeepLink;
import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppsflyerDeepLinksManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/app/appsflyer/AppsflyerDeepLinksManager;", "", "deepLinksRepository", "Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;", "(Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;)V", "handleDeepLink", "", "deepLink", "Lcom/appsflyer/deeplink/DeepLink;", "result", "Lcom/appsflyer/deeplink/DeepLinkResult;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppsflyerDeepLinksManager {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_CHAT = "chat_dialog";
    private static final String KEY_NEURONS = "neurons";
    private static final String KEY_SUBSCRIPTION = "subscription";
    private final DeepLinksRepository deepLinksRepository;

    @Inject
    public AppsflyerDeepLinksManager(DeepLinksRepository deepLinksRepository) {
        Intrinsics.checkNotNullParameter(deepLinksRepository, "deepLinksRepository");
        this.deepLinksRepository = deepLinksRepository;
    }

    /* compiled from: AppsflyerDeepLinksManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/app/appsflyer/AppsflyerDeepLinksManager$Companion;", "", "()V", "KEY_CHAT", "", "KEY_NEURONS", "KEY_SUBSCRIPTION", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void handleDeepLink(DeepLinkResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getStatus() == DeepLinkResult.Status.FOUND) {
            DeepLink deepLink = result.getDeepLink();
            Intrinsics.checkNotNullExpressionValue(deepLink, "getDeepLink(...)");
            handleDeepLink(deepLink);
        }
    }

    private final void handleDeepLink(DeepLink deepLink) {
        DeepLink.OpenSubscription openSubscription;
        DeepLinksRepository deepLinksRepository = this.deepLinksRepository;
        String deepLinkValue = deepLink.getDeepLinkValue();
        if (deepLinkValue != null) {
            int hashCode = deepLinkValue.hashCode();
            if (hashCode != 341203229) {
                if (hashCode != 1682404367) {
                    if (hashCode != 1844259680 || !deepLinkValue.equals(KEY_NEURONS)) {
                        return;
                    }
                    openSubscription = DeepLink.OpenNeurons.INSTANCE;
                } else if (!deepLinkValue.equals(KEY_CHAT)) {
                    return;
                } else {
                    openSubscription = DeepLink.OpenChat.INSTANCE;
                }
            } else if (!deepLinkValue.equals("subscription")) {
                return;
            } else {
                openSubscription = DeepLink.OpenSubscription.INSTANCE;
            }
            deepLinksRepository.updateDeepLink(openSubscription);
        }
    }
}
